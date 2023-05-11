package com

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kg.testCalc.MainActivity
import com.kg.testCalc.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.et_first_num)).perform(ViewActions.typeText("21"))
            Espresso.onView(withId(R.id.et_first_num)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.et_second_num)).perform(ViewActions.typeText(""))
            Espresso.onView(withId(R.id.et_second_num)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.btn_divide)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.tv_result))
                .check((ViewAssertions.matches(ViewMatchers.withText("Нельзя выполнить операцию с пустотой"))))
            delay(20000)
        }
    }

// проверка активити с add()
//   @Test
//    fun simpleAdd() {
//        runBlocking {
//            Espresso.onView(withId(R.id.et_first_num)).perform(ViewActions.typeText("24"))
//            Espresso.onView(withId(R.id.et_first_num)).perform(ViewActions.closeSoftKeyboard())
//            delay(1000)
//            Espresso.onView(withId(R.id.et_second_num)).perform(ViewActions.typeText("7"))
//            Espresso.onView(withId(R.id.et_second_num)).perform(ViewActions.closeSoftKeyboard())
//            delay(1000)
//            Espresso.onView(withId(R.id.btn_add)).perform(ViewActions.click())
//            delay(1000)
//            Espresso.onView(withId(R.id.tv_result))
//                .check((ViewAssertions.matches(ViewMatchers.withText("31"))))
//            delay(20000)
//        }
//    }

}