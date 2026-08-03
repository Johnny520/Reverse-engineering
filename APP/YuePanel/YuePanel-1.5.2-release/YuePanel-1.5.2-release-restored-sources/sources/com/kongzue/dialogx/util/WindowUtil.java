package com.kongzue.dialogx.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.NoTouchInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WindowUtil {
    public static WindowSettings windowSettings;

    public static abstract class WindowSettings {
        public ViewGroup overrideRootView(Context context) {
            return null;
        }

        public abstract WindowManager.LayoutParams overrideWindowLayoutParamsInterface(Context context, View view, WindowManager.LayoutParams layoutParams);
    }

    public static void dismiss(View view) {
        BaseDialog baseDialog = (BaseDialog) view.getTag();
        if (baseDialog == null || baseDialog.getOwnActivity() == null) {
            return;
        }
        ((WindowManager) baseDialog.getOwnActivity().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    public static void show(final Activity activity, final View view, final boolean z) {
        try {
            if (activity.getWindow().getDecorView().isAttachedToWindow()) {
                showNow(activity, view, z);
            } else {
                activity.getWindow().getDecorView().post(new Runnable() { // from class: com.kongzue.dialogx.util.WindowUtil.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WindowUtil.showNow(activity, view, z);
                    }
                });
            }
        } catch (Exception unused) {
            if (activity == null || activity.isDestroyed()) {
                return;
            }
            showNow(activity, view, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showNow(final Activity activity, View view, boolean z) {
        WindowManager.LayoutParams layoutParamsOverrideWindowLayoutParamsInterface;
        if (DialogX.globalHoverWindow && !Settings.canDrawOverlays(activity)) {
            Toast.makeText(activity, "使用 DialogX.globalHoverWindow 必须开启悬浮窗权限", 1).show();
            Intent intent = new Intent();
            intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            activity.startActivity(intent);
            return;
        }
        WindowSettings windowSettings2 = windowSettings;
        ViewGroup viewGroupOverrideRootView = windowSettings2 != null ? windowSettings2.overrideRootView(activity) : null;
        if (viewGroupOverrideRootView == null) {
            viewGroupOverrideRootView = new FrameLayout(activity);
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroupOverrideRootView.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        if (DialogX.globalHoverWindow) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 1003;
        }
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (!z) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.util.WindowUtil.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    for (int size = BaseDialog.getRunningDialogList().size() - 1; size >= 0; size--) {
                        BaseDialog baseDialog = BaseDialog.getRunningDialogList().get(size);
                        if (!(baseDialog instanceof NoTouchInterface) && baseDialog.getOwnActivity() == activity) {
                            if (baseDialog.getDialogView() == null) {
                                return false;
                            }
                            return baseDialog.dispatchTouchEvent(motionEvent);
                        }
                    }
                    return activity.dispatchTouchEvent(motionEvent);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        WindowSettings windowSettings3 = windowSettings;
        if (windowSettings3 != null && (layoutParamsOverrideWindowLayoutParamsInterface = windowSettings3.overrideWindowLayoutParamsInterface(activity, view, layoutParams)) != null) {
            layoutParams = layoutParamsOverrideWindowLayoutParamsInterface;
        }
        windowManager.addView(viewGroupOverrideRootView, layoutParams);
    }
}
