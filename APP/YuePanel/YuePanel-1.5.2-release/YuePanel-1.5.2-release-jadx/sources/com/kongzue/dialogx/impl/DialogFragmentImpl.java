package com.kongzue.dialogx.impl;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC8871;
import androidx.fragment.app.FragmentManager;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.NoTouchInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DialogFragmentImpl extends DialogInterfaceOnCancelListenerC8871 {
    WeakReference<Activity> activityWeakReference;
    private BaseDialog baseDialog;
    private View dialogView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogFragmentImpl() {
        this.activityWeakReference = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    public void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        return this.dialogView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        WeakReference<Activity> weakReference = this.activityWeakReference;
        final Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        window.clearFlags(8);
        window.setSoftInputMode(16);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        attributes.format = -2;
        this.dialogView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.impl.DialogFragmentImpl.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                for (BaseDialog baseDialog : BaseDialog.getRunningDialogList()) {
                    if (baseDialog.getOwnActivity() == activity && baseDialog != DialogFragmentImpl.this.baseDialog && baseDialog.getDialogImplMode() == DialogFragmentImpl.this.baseDialog.getDialogImplMode() && !(baseDialog instanceof NoTouchInterface) && baseDialog.getDialogView() != null) {
                        Log.e(">>>", "onTouch: dialog=" + baseDialog + "  baseDialog=" + DialogFragmentImpl.this.baseDialog);
                        baseDialog.getDialogView().dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
                if (DialogFragmentImpl.this.baseDialog instanceof NoTouchInterface) {
                    return activity.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        });
        window.setAttributes(attributes);
        window.addFlags(67108864);
        window.getDecorView().setPadding(0, 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setSystemUiVisibility((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) == 8192 ? 9472 : 1280);
        window.addFlags(-2013265920);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    public void show(FragmentManager fragmentManager, @InterfaceC6490 String str) {
        if (fragmentManager == null) {
            DialogX.error("DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            return;
        }
        AbstractC8885 abstractC8885M29749 = fragmentManager.m29749();
        abstractC8885M29749.m30045(this, str);
        abstractC8885M29749.mo29905();
    }

    public DialogFragmentImpl(BaseDialog baseDialog, View view) {
        this.activityWeakReference = null;
        this.dialogView = view;
        this.baseDialog = baseDialog;
        this.activityWeakReference = new WeakReference<>(baseDialog.getOwnActivity());
    }
}
