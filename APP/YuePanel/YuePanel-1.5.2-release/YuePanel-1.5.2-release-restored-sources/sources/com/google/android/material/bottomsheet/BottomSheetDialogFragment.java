package com.google.android.material.bottomsheet;

import Yue.C3303;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialogFragment extends C3303 {
    private boolean waitingForDismissAllowingStateLoss;

    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private BottomSheetDismissCallback() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@InterfaceC6391 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@InterfaceC6391 View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.dismissAfterAnimation();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetDialogFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(@InterfaceC6391 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetDismissCallback());
        bottomSheetBehavior.setState(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        dismissWithAnimation(behavior, z);
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // Yue.C3303, androidx.fragment.app.DialogInterfaceOnCancelListenerC8871
    @InterfaceC6391
    public Dialog onCreateDialog(@InterfaceC6490 Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@InterfaceC5683 int i) {
        super(i);
    }
}
