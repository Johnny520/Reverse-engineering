package com.p001mr.elaris;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsSecondaryStyle {
    static final float ACCENT_STRIP_HEIGHT_DP = 36.0f;
    static final int BUTTON_BACKGROUND;
    static final int BUTTON_TEXT_COLOR;
    static final int CARD_AMBIENT_SHADOW_COLOR;
    static final int CARD_BACKGROUND = -1;
    static final float CARD_CORNER_RADIUS_DP = 16.0f;
    static final float CARD_ELEVATION_DP = 1.0f;
    static final float CARD_GAP_DP = 10.0f;
    static final float CARD_HORIZONTAL_PADDING_DP = 18.0f;
    static final int CARD_SPOT_SHADOW_COLOR;
    static final float CARD_VERTICAL_PADDING_DP = 6.0f;
    static final float COMPACT_DESC_SIZE_SP = 12.0f;
    static final float CONTROL_CORNER_RADIUS_DP = 12.0f;
    static final float CONTROL_GAP_DP = 6.0f;
    static final float CONTROL_HEIGHT_DP = 36.0f;
    static final int CONTROL_STROKE_COLOR;
    static final int DIVIDER_COLOR;
    static final int INPUT_STROKE_COLOR;
    static final int ITEM_DESC_COLOR;
    static final float ITEM_DESC_SIZE_SP = 12.0f;
    static final float ITEM_HEIGHT_NORMAL_DP = 61.0f;
    static final float ITEM_HEIGHT_TWO_LINE_DP = 72.0f;
    static final int ITEM_TITLE_COLOR;
    static final float ITEM_TITLE_DESC_GAP_DP = 4.0f;
    static final float ITEM_TITLE_SIZE_SP = 15.0f;
    static final int PAGE_BACKGROUND = Color.rgb(248, 250, 252);
    static final float PAGE_HORIZONTAL_PADDING_DP = 18.0f;
    static final int STATUS_BLUE_BACKGROUND;
    static final int STATUS_GREEN_BACKGROUND;
    static final int STATUS_GREEN_STROKE;
    static final int STATUS_GREEN_TEXT_COLOR;
    static final float SUBTITLE_CARD_GAP_DP = 15.0f;
    static final int SUBTITLE_COLOR;
    static final float SUBTITLE_SIZE_SP = 13.0f;
    static final float SWITCH_HEIGHT_DP = 22.0f;
    static final int SWITCH_OFF_COLOR;
    static final int SWITCH_THUMB_COLOR = -1;
    static final float SWITCH_THUMB_SIZE_DP = 17.0f;
    static final float SWITCH_WIDTH_DP = 40.0f;
    static final int TITLE_COLOR;
    static final float TITLE_SIZE_SP = 24.0f;
    static final float TITLE_SUBTITLE_GAP_DP = 4.0f;
    static final float TITLE_TOP_OFFSET_DP = 18.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iRgb = Color.rgb(17, 24, 39);
        TITLE_COLOR = iRgb;
        int iRgb2 = Color.rgb(107, 114, 128);
        SUBTITLE_COLOR = iRgb2;
        CARD_AMBIENT_SHADOW_COLOR = Color.argb(8, 148, 163, 184);
        CARD_SPOT_SHADOW_COLOR = Color.argb(6, 148, 163, 184);
        ITEM_TITLE_COLOR = iRgb;
        ITEM_DESC_COLOR = iRgb2;
        DIVIDER_COLOR = Color.rgb(232, 236, 242);
        SWITCH_OFF_COLOR = Color.rgb(229, 231, 235);
        CONTROL_STROKE_COLOR = Color.rgb(196, 216, 247);
        INPUT_STROKE_COLOR = Color.rgb(227, 231, 237);
        BUTTON_BACKGROUND = Color.rgb(246, 250, 255);
        BUTTON_TEXT_COLOR = Color.rgb(47, 125, 255);
        STATUS_BLUE_BACKGROUND = Color.rgb(246, 250, 255);
        STATUS_GREEN_BACKGROUND = Color.rgb(238, 249, 245);
        STATUS_GREEN_STROKE = Color.rgb(210, 239, 229);
        STATUS_GREEN_TEXT_COLOR = Color.rgb(46, 173, 123);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsSecondaryStyle() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable buttonBackground(InAppSettings inAppSettings) {
        return thinStrokeRound(inAppSettings, inAppSettings.isDarkUi() ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.9f) : BUTTON_BACKGROUND, inAppSettings.isDarkUi() ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.62f) : CONTROL_STROKE_COLOR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable cardBackground(InAppSettings inAppSettings) {
        GradientDrawable gradientDrawableRound = InAppSettingsVisuals.round(cardColor(inAppSettings), inAppSettings.m139dp(CARD_CORNER_RADIUS_DP));
        InAppSettingsVisuals.applyMainCardOutlineStroke(inAppSettings, gradientDrawableRound);
        return gradientDrawableRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int cardColor(InAppSettings inAppSettings) {
        if (inAppSettings.isDarkUi()) {
            return InAppSettings.CARD;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int dividerColor(InAppSettings inAppSettings) {
        return inAppSettings.isDarkUi() ? InAppSettings.lineColor() : DIVIDER_COLOR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable inputBackground(InAppSettings inAppSettings) {
        return thinStrokeRound(inAppSettings, cardColor(inAppSettings), inAppSettings.isDarkUi() ? InAppSettings.STROKE : INPUT_STROKE_COLOR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable pageBackground(InAppSettings inAppSettings) {
        return InAppSettingsVisuals.round(pageColor(inAppSettings), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int pageColor(InAppSettings inAppSettings) {
        return inAppSettings.isDarkUi() ? InAppSettings.f115BG : PAGE_BACKGROUND;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable statusBackground(InAppSettings inAppSettings, boolean z) {
        int iMixForSurface;
        int iMixForSurface2;
        if (inAppSettings.isDarkUi()) {
            int i = z ? InAppSettings.GREEN : InAppSettings.BLUE;
            iMixForSurface = inAppSettings.mixForSurface(i, 0.88f);
            iMixForSurface2 = inAppSettings.mixForSurface(i, 0.64f);
        } else if (z) {
            iMixForSurface = STATUS_GREEN_BACKGROUND;
            iMixForSurface2 = STATUS_GREEN_STROKE;
        } else {
            iMixForSurface = STATUS_BLUE_BACKGROUND;
            iMixForSurface2 = CONTROL_STROKE_COLOR;
        }
        return thinStrokeRound(inAppSettings, iMixForSurface, iMixForSurface2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int subtitleColor(InAppSettings inAppSettings) {
        return inAppSettings.isDarkUi() ? InAppSettings.SUB : SUBTITLE_COLOR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static GradientDrawable thinStrokeRound(InAppSettings inAppSettings, int i, int i2) {
        GradientDrawable gradientDrawableRound = InAppSettingsVisuals.round(i, inAppSettings.m139dp(12.0f));
        gradientDrawableRound.setStroke(1, i2);
        return gradientDrawableRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int titleColor(InAppSettings inAppSettings) {
        return inAppSettings.isDarkUi() ? InAppSettings.TEXT : TITLE_COLOR;
    }
}
