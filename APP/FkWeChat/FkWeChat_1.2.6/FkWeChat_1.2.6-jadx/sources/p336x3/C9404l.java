package p336x3;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: x3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9404l {

    /* JADX INFO: renamed from: a */
    public final c f31974a;

    /* JADX INFO: renamed from: x3.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends c {

        /* JADX INFO: renamed from: a */
        public final View f31975a;

        public a(View view) {
            this.f31975a = view;
        }

        @Override // p336x3.C9404l.c
        /* JADX INFO: renamed from: a */
        public void mo36544a() {
            View view = this.f31975a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f31975a.getWindowToken(), 0);
            }
        }

        @Override // p336x3.C9404l.c
        /* JADX INFO: renamed from: b */
        public void mo36545b() {
            final View viewFindViewById = this.f31975a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f31975a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: x3.k
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x3.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends a {

        /* JADX INFO: renamed from: b */
        public View f31976b;

        /* JADX INFO: renamed from: c */
        public WindowInsetsController f31977c;

        public b(View view) {
            super(view);
            this.f31976b = view;
        }

        @Override // p336x3.C9404l.a, p336x3.C9404l.c
        /* JADX INFO: renamed from: a */
        public void mo36544a() {
            View view;
            WindowInsetsController windowInsetsController = this.f31977c;
            if (windowInsetsController == null) {
                View view2 = this.f31976b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo36544a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: x3.s
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f31976b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f31976b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // p336x3.C9404l.a, p336x3.C9404l.c
        /* JADX INFO: renamed from: b */
        public void mo36545b() {
            View view = this.f31976b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f31977c;
            if (windowInsetsController == null) {
                View view2 = this.f31976b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo36545b();
        }
    }

    /* JADX INFO: renamed from: x3.l$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {
        /* JADX INFO: renamed from: a */
        public abstract void mo36544a();

        /* JADX INFO: renamed from: b */
        public abstract void mo36545b();
    }

    public C9404l(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f31974a = new b(view);
        } else {
            this.f31974a = new a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36541a() {
        this.f31974a.mo36544a();
    }

    /* JADX INFO: renamed from: b */
    public void m36542b() {
        this.f31974a.mo36545b();
    }
}
