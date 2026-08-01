package com.p001mr.elaris;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.mr.elaris.InAppSettings.BackAwareEditText;
import com.p001mr.elaris.InAppSettings;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsInputHelpers {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsInputHelpers() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearFocusedInputForPageTransition(InAppSettings inAppSettings) {
        if (inAppSettings != null) {
            try {
                Activity activity = inAppSettings.activity;
                if (activity == null) {
                    return;
                }
                Window window = activity.getWindow();
                View viewFindFocus = null;
                View decorView = window == null ? null : window.getDecorView();
                if (decorView != null) {
                    viewFindFocus = decorView.findFocus();
                }
                if (viewFindFocus instanceof EditText) {
                    Object systemService = inAppSettings.activity.getSystemService("input_method");
                    if ((systemService instanceof InputMethodManager) && viewFindFocus.getWindowToken() != null) {
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 0);
                    }
                    viewFindFocus.clearFocus();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean consumeFocusedInputBack(InAppSettings inAppSettings, ViewGroup viewGroup) {
        try {
            Activity activity = inAppSettings.activity;
            View viewFindFocus = null;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            if (decorView != null) {
                viewFindFocus = decorView.findFocus();
            }
            if ((viewFindFocus instanceof EditText) && viewFindFocus.isShown() && viewFindFocus.isAttachedToWindow()) {
                WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                if (rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsets.Type.ime())) {
                    Object systemService = inAppSettings.activity.getSystemService("input_method");
                    if (!(systemService instanceof InputMethodManager)) {
                        return false;
                    }
                    if (viewFindFocus.getWindowToken() != null) {
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 0);
                    }
                    viewFindFocus.clearFocus();
                    return true;
                }
                viewFindFocus.clearFocus();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void hideKeyboard(InAppSettings inAppSettings, View view) {
        if (inAppSettings != null) {
            try {
                Activity activity = inAppSettings.activity;
                if (activity != null && view != null) {
                    Object systemService = activity.getSystemService("input_method");
                    if (!(systemService instanceof InputMethodManager) || view.getWindowToken() == null) {
                        return;
                    }
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EditText input(final InAppSettings inAppSettings, String str, String str2) {
        Objects.requireNonNull(inAppSettings);
        InAppSettings.BackAwareEditText backAwareEditText = inAppSettings.new BackAwareEditText(inAppSettings.activity);
        backAwareEditText.setSingleLine(true);
        backAwareEditText.setFocusable(true);
        backAwareEditText.setFocusableInTouchMode(true);
        backAwareEditText.setClickable(true);
        if (str2 == null) {
            str2 = "";
        }
        backAwareEditText.setText(str2);
        backAwareEditText.setHint(str);
        backAwareEditText.setInputType(524289);
        backAwareEditText.setTextColor(InAppSettingsSecondaryStyle.titleColor(inAppSettings));
        backAwareEditText.setHintTextColor(InAppSettingsSecondaryStyle.subtitleColor(inAppSettings));
        backAwareEditText.setTextSize(2, 15.0f);
        backAwareEditText.setPadding(inAppSettings.m139dp(14.0f), 0, inAppSettings.m139dp(14.0f), 0);
        backAwareEditText.setBackground(InAppSettingsSecondaryStyle.inputBackground(inAppSettings));
        backAwareEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.mr.elaris.InAppSettingsInputHelpers.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                InAppSettingsInputHelpers.hideKeyboard(inAppSettings, view);
            }
        });
        backAwareEditText.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsInputHelpers.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsInputHelpers.showKeyboard(inAppSettings, view);
            }
        });
        return backAwareEditText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void releaseFocusedInputForSystemKey(InAppSettings inAppSettings, View view) {
        if (inAppSettings != null) {
            try {
                Activity activity = inAppSettings.activity;
                if (activity == null) {
                    return;
                }
                Window window = activity.getWindow();
                View decorView = window == null ? null : window.getDecorView();
                View viewFindFocus = decorView == null ? null : decorView.findFocus();
                if (!(viewFindFocus instanceof EditText)) {
                    if (!(view instanceof EditText)) {
                        view = null;
                    }
                    viewFindFocus = view;
                }
                if (viewFindFocus instanceof EditText) {
                    Object systemService = inAppSettings.activity.getSystemService("input_method");
                    if ((systemService instanceof InputMethodManager) && viewFindFocus.getWindowToken() != null) {
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 0);
                    }
                    viewFindFocus.clearFocus();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void settleTextInput(InAppSettings inAppSettings, EditText editText, View view) {
        if (editText != null) {
            view = editText;
        }
        try {
            Object systemService = inAppSettings.activity.getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && view != null && view.getWindowToken() != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Throwable unused) {
        }
        if (editText != null) {
            try {
                editText.clearFocus();
            } catch (Throwable unused2) {
            }
        }
        try {
            Window window = inAppSettings.activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            View viewFindFocus = decorView != null ? decorView.findFocus() : null;
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showKeyboard(InAppSettings inAppSettings, View view) {
        if (view == null) {
            return;
        }
        try {
            view.requestFocus();
            Object systemService = inAppSettings.activity.getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                ((InputMethodManager) systemService).showSoftInput(view, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String textOf(EditText editText) {
        return editText.getText() == null ? "" : editText.getText().toString().trim();
    }
}
