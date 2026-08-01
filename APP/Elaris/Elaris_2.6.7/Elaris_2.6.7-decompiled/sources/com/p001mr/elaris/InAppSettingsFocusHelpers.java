package com.p001mr.elaris;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsFocusHelpers {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsFocusHelpers() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View findTaggedPage(View view) {
        if (view == null) {
            return null;
        }
        if ("ELARIS_FULL_PAGE".equals(view.getTag())) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewFindTaggedPage = findTaggedPage(viewGroup.getChildAt(i));
                if (viewFindTaggedPage != null) {
                    return viewFindTaggedPage;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void refocusElarisPage(final InAppSettings inAppSettings, final View view) {
        inAppSettings.refocusElarisPageNow(view);
        if (view != null) {
            try {
                view.post(new Runnable() { // from class: com.mr.elaris.InAppSettingsFocusHelpers.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public void run() {
                        inAppSettings.refocusElarisPageNow(view);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0014 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static void refocusElarisPageNow(InAppSettings inAppSettings, View view, ViewGroup viewGroup) {
        View rootView;
        if (view == null) {
            rootView = null;
        } else {
            try {
                rootView = view.getRootView();
            } catch (Throwable unused) {
                return;
            }
        }
        View viewFindTaggedPage = findTaggedPage(rootView);
        if (viewFindTaggedPage == null && viewGroup != 0) {
            viewFindTaggedPage = findTaggedPage(viewGroup);
        }
        if (viewFindTaggedPage != null) {
            viewGroup = viewFindTaggedPage;
        }
        if (viewGroup != 0) {
            requestSelfFocus(viewGroup);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void requestSelfFocus(View view) {
        if (view == null) {
            return;
        }
        try {
            View rootView = view.getRootView();
            if ((rootView == null ? null : rootView.findFocus()) instanceof EditText) {
                return;
            }
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setDescendantFocusability(MethodData.ACC_DECLARED_SYNCHRONIZED);
            }
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Throwable unused) {
        }
    }
}
