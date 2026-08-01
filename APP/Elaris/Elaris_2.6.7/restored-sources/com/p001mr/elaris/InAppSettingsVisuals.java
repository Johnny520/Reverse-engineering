package com.p001mr.elaris;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsVisuals {
    static final float COMMON_CARD_CORNER_RADIUS_DP = 16.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsVisuals() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int accentOf(String str) {
        return "groupfile".equals(str) ? Color.rgb(36, 112, 238) : "chat_message".equals(str) ? Color.rgb(20, 166, 104) : "repeater".equals(str) ? Color.rgb(245, 158, 11) : "picture".equals(str) ? Color.rgb(0, 150, 174) : "cleanse".equals(str) ? Color.rgb(126, 92, 224) : Color.rgb(100, 116, 139);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View accentStrip(InAppSettings inAppSettings, int i) {
        View view = new View(inAppSettings.activity);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(inAppSettings.m139dp(4.0f));
        view.setBackground(gradientDrawable);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void applyMainCardOutlineStroke(InAppSettings inAppSettings, GradientDrawable gradientDrawable) {
        gradientDrawable.setStroke(inAppSettings.m139dp(1.0f), InAppSettings.STROKE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void applyThemePalette(InAppSettings inAppSettings) {
        inAppSettings.setDarkUi(shouldUseDarkTheme(inAppSettings));
        if (inAppSettings.isDarkUi()) {
            InAppSettings.setThemePalette(Color.rgb(16, 17, 21), Color.rgb(29, 31, 37), Color.rgb(36, 39, 47), Color.rgb(239, 242, 247), Color.rgb(165, 171, 183), Color.rgb(54, 58, 68), Color.rgb(92, 164, 255), Color.rgb(48, 205, 163), Color.rgb(148, 157, 174), Color.rgb(72, 76, 88), Color.rgb(76, 81, 94), Color.rgb(24, 26, 31), Color.rgb(20, 22, 27), Color.rgb(15, 16, 20));
        } else {
            InAppSettings.setThemePalette(Color.rgb(250, 251, 253), Color.rgb(255, 255, 255), Color.rgb(250, 251, 253), Color.rgb(24, 25, 29), Color.rgb(105, 108, 116), Color.rgb(235, 237, 241), Color.rgb(52, 132, 255), Color.rgb(34, 190, 143), Color.rgb(118, 126, 140), Color.rgb(232, 234, 238), Color.rgb(228, 232, 238), Color.rgb(255, 255, 255), Color.rgb(252, 253, 255), Color.rgb(247, 249, 252));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable menuSoftPanel(InAppSettings inAppSettings) {
        GradientDrawable gradientDrawableRound = round(InAppSettings.CARD, inAppSettings.m139dp(COMMON_CARD_CORNER_RADIUS_DP));
        applyMainCardOutlineStroke(inAppSettings, gradientDrawableRound);
        return gradientDrawableRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mixForSurface(InAppSettings inAppSettings, int i, float f) {
        return inAppSettings.isDarkUi() ? mixWithSurface(i, f) : mixWithWhite(i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mixWithSurface(int i, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(InAppSettings.CARD) * f) + (Color.red(i) * f2)), (int) ((Color.green(InAppSettings.CARD) * f) + (Color.green(i) * f2)), (int) ((Color.blue(InAppSettings.CARD) * f) + (Color.blue(i) * f2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mixWithWhite(int i, float f) {
        float f2 = 1.0f - f;
        float f3 = f * 255.0f;
        return Color.rgb((int) ((Color.red(i) * f2) + f3), (int) ((Color.green(i) * f2) + f3), (int) ((Color.blue(i) * f2) + f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static StateListDrawable moduleListRowBackground(InAppSettings inAppSettings, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        StateListDrawable stateListDrawable = new StateListDrawable();
        float[] fArrRowCornerRadii = rowCornerRadii(inAppSettings, i, i2);
        int[] iArr = {R.attr.state_pressed};
        if (inAppSettings.isDarkUi()) {
            i3 = 47;
            i4 = 56;
            i5 = 43;
        } else {
            i3 = 241;
            i4 = 245;
            i5 = 239;
        }
        stateListDrawable.addState(iArr, roundCorners(Color.rgb(i5, i3, i4), fArrRowCornerRadii));
        int[] iArr2 = {R.attr.state_selected};
        if (inAppSettings.isDarkUi()) {
            i6 = 52;
            i7 = 62;
            i8 = 48;
        } else {
            i6 = 244;
            i7 = 247;
            i8 = 242;
        }
        stateListDrawable.addState(iArr2, roundCorners(Color.rgb(i8, i6, i7), fArrRowCornerRadii));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable round(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable roundCorners(int i, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable roundWithStroke(InAppSettings inAppSettings, int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawableRound = round(i, i2);
        gradientDrawableRound.setStroke(inAppSettings.m139dp(i4), i3);
        return gradientDrawableRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static StateListDrawable rowBackground(InAppSettings inAppSettings) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int iM139dp = inAppSettings.m139dp(17.0f);
        int[] iArr = {R.attr.state_pressed};
        if (inAppSettings.isDarkUi()) {
            i = 47;
            i2 = 56;
            i3 = 43;
        } else {
            i = 241;
            i2 = 245;
            i3 = 239;
        }
        stateListDrawable.addState(iArr, round(Color.rgb(i3, i, i2), iM139dp));
        int[] iArr2 = {R.attr.state_selected};
        if (inAppSettings.isDarkUi()) {
            i4 = 52;
            i5 = 62;
            i6 = 48;
        } else {
            i4 = 244;
            i5 = 247;
            i6 = 242;
        }
        stateListDrawable.addState(iArr2, round(Color.rgb(i6, i4, i5), iM139dp));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static float[] rowCornerRadii(InAppSettings inAppSettings, int i, int i2) {
        float fM139dp = inAppSettings.m139dp(COMMON_CARD_CORNER_RADIUS_DP);
        boolean z = i <= 0;
        boolean z2 = i >= i2 - 1;
        float f = z ? fM139dp : 0.0f;
        float f2 = z ? fM139dp : 0.0f;
        float f3 = z ? fM139dp : 0.0f;
        float f4 = z ? fM139dp : 0.0f;
        float f5 = z2 ? fM139dp : 0.0f;
        float f6 = z2 ? fM139dp : 0.0f;
        float f7 = z2 ? fM139dp : 0.0f;
        if (!z2) {
            fM139dp = 0.0f;
        }
        return new float[]{f, f2, f3, f4, f5, f6, f7, fM139dp};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean shouldUseDarkTheme(InAppSettings inAppSettings) {
        String strThemeMode = inAppSettings.themeMode();
        if ("dark".equals(strThemeMode)) {
            return true;
        }
        if ("light".equals(strThemeMode)) {
            return false;
        }
        return (inAppSettings.activity.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
