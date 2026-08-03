package Yue;

import Yue.C7494;
import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7494 {

    /* JADX INFO: renamed from: ۥ */
    public final C7495 f2912;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ */
    @InterfaceC7113(20)
    public static class C1278 extends C7495 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public final View f2913;

        public C1278(@InterfaceC6490 View view) {
            this.f2913 = view;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m23446(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // Yue.C7494.C7495
        /* JADX INFO: renamed from: ۥ */
        public void mo3689() {
            View view = this.f2913;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2913.getWindowToken(), 0);
            }
        }

        @Override // Yue.C7494.C7495
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo3690() {
            final View viewFindViewById = this.f2913;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f2913.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: Yue.ۥۢ۟ۢۥ
                @Override // java.lang.Runnable
                public final void run() {
                    C7494.C1278.m23446(viewFindViewById);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C7495 {
        /* JADX INFO: renamed from: ۥ */
        public void mo3689() {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo3690() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7494(@InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2912 = new C1279(view);
        } else {
            this.f2912 = new C1278(view);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3687() {
        this.f2912.mo3689();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3688() {
        this.f2912.mo3690();
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۦ$ۥ۟ */
    @InterfaceC7113(30)
    public static class C1279 extends C1278 {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public View f2914;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public WindowInsetsController f22672;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1279(@InterfaceC6391 View view) {
            super(view);
            this.f2914 = view;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m23448(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            atomicBoolean.set((i & 8) != 0);
        }

        @Override // Yue.C7494.C1278, Yue.C7494.C7495
        /* JADX INFO: renamed from: ۥ */
        public void mo3689() {
            View view;
            WindowInsetsController windowInsetsController = this.f22672;
            if (windowInsetsController == null) {
                View view2 = this.f2914;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo3689();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: Yue.ۥۣۢ۟ۢ
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    C7494.C1279.m23448(atomicBoolean, windowInsetsController2, i);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f2914) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2914.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // Yue.C7494.C1278, Yue.C7494.C7495
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo3690() {
            View view = this.f2914;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f22672;
            if (windowInsetsController == null) {
                View view2 = this.f2914;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.mo3690();
            }
        }

        public C1279(@InterfaceC6490 WindowInsetsController windowInsetsController) {
            super(null);
            this.f22672 = windowInsetsController;
        }
    }

    @InterfaceC7113(30)
    @Deprecated
    public C7494(@InterfaceC6391 WindowInsetsController windowInsetsController) {
        this.f2912 = new C1279(windowInsetsController);
    }
}
