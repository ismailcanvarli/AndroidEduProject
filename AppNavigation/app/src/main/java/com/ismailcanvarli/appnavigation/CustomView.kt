//Created by canVarli on 12/27/2024

package com.ismailcanvarli.appnavigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var textViewTitle: TextView
    private var textViewDescription: TextView

    init {
        orientation = VERTICAL
        LayoutInflater.from(context).inflate(R.layout.view_custom, this, true)

        textViewTitle = findViewById(R.id.textViewTitle)
        textViewDescription = findViewById(R.id.textViewDescription)

        // Default değerleri atayalım
        textViewTitle.text = "Custom view Title"
        textViewDescription.text = "Custom view Description"

        // attrs ile özelleştirme yapmak istersek
//        attrs?.let {
//            val typedArray = context.obtainStyledAttributes(it, R.styleable.CustomView, 0, 0)
//            val title = typedArray.getString(R.styleable.CustomView_title)
//            val description = typedArray.getString(R.styleable.CustomView_description)
//
//            title?.let { textViewTitle.text = it }
//            description?.let { textViewDescription.text = it }
//
//            typedArray.recycle()
//        }

        val navController = findNavController()
    }
}