package com.p001mr.elaris;

import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsDialogWidgets {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsDialogWidgets() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView button(InAppSettings inAppSettings, String str, boolean z) {
        TextView textViewText = inAppSettings.text(str, 15, z ? -1 : InAppSettings.TEXT, 1);
        textViewText.setGravity(17);
        textViewText.setBackground(inAppSettings.roundWithStroke(z ? InAppSettings.BLUE : InAppSettings.CARD_SOFT, inAppSettings.m139dp(22.0f), z ? InAppSettings.BLUE : InAppSettings.STROKE, 1));
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable panel(InAppSettings inAppSettings) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(InAppSettings.CARD);
        gradientDrawable.setCornerRadius(inAppSettings.m139dp(30.0f));
        gradientDrawable.setStroke(inAppSettings.m139dp(1.0f), InAppSettings.STROKE);
        return gradientDrawable;
    }
}
