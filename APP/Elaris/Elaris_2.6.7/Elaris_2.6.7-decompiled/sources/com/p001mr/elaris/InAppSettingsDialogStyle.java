package com.p001mr.elaris;

import android.R;
import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsDialogStyle {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsDialogStyle() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void apply(InAppSettings inAppSettings, AlertDialog alertDialog) {
        if (alertDialog == null) {
            return;
        }
        try {
            Window window = alertDialog.getWindow();
            if (window == null) {
                return;
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setPadding(0, 0, 0, 0);
                decorView.setBackgroundColor(0);
                decorView.setElevation(0.0f);
                decorView.setTranslationZ(0.0f);
                clearContainerBackground(decorView, 0);
            }
            clearContainerBackground(window.findViewById(R.id.content), 0);
            window.setLayout(inAppSettings.dialogWidth(), -2);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void clearContainerBackground(View view, int i) {
        if (view == null || i > 8) {
            return;
        }
        try {
            if (!"elaris_dialog_surface".equals(view.getTag()) && (view instanceof ViewGroup)) {
                view.setBackgroundColor(0);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    clearContainerBackground(viewGroup.getChildAt(i2), i + 1);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
