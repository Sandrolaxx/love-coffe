package com.aktie.lovecoffe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.aktie.lovecoffe.R

val rubikFontFamily = FontFamily(
        Font(R.font.rubik, FontWeight.Normal),
        Font(R.font.rubik_medium, FontWeight.Medium),
        Font(R.font.rubik_bold, FontWeight.Bold),
        Font(R.font.rubik_semibold, FontWeight.SemiBold)
)

private const val activatePreview = true

val Typography = Typography(
        // "Title XI" - headlineLarge
        h1 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
        ),
        // "Title Lg" - headlineMedium
        h2 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
        ),
        // "Title Md" - headlineSmall
        h3 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
        ),
        // "Text Sm" - titleLarge
        caption = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
        ),
        // "Text Md" - bodyLarge
        body1 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
        // "Text Sm" - bodyMedium
        body2 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
        ),
        // "Text Xs" - bodySmall
        overline = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        ),
        // "Action" - labelLarge
        subtitle1 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
        ),
        // "Subtitle" - labelMedium
        subtitle2 = TextStyle(
                fontFamily = if (activatePreview) FontFamily.Default else rubikFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
        )
)
