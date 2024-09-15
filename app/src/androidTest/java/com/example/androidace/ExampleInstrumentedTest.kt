package com.example.androidace

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()
    
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.androidace", appContext.packageName)
    }
    
    @Test
    fun demoTest() {
        composeRule.setContent { 
            AndroidAce(name = "selva")
        }
    }

    @Test
    fun demo1Test() {
        composeRule.setContent {
            androidx.compose.material3.Text(text = "Hello World")
        }

        // Check if the text "Hello World" is displayed
        composeRule.onNodeWithText("Hello World").assertExists()
    }
}