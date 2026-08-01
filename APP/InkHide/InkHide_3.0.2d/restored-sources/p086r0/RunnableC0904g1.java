package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Set;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.C0297g;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0904g1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0919l1 f3194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f3195c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0904g1(Activity activity, C0919l1 c0919l1, int i2) {
        this.f3193a = i2;
        this.f3195c = activity;
        this.f3194b = c0919l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        Window window;
        View decorView2;
        View decorView3;
        View decorView4;
        C0919l1 c0919l1 = this.f3194b;
        Activity activity = this.f3195c;
        switch (this.f3193a) {
            case 0:
                Window window2 = activity.getWindow();
                decorView = window2 != null ? window2.getDecorView() : null;
                c0919l1.getClass();
                if ((decorView == null || !C0919l1.m1999A(activity) || activity.isFinishing()) ? false : c0919l1.m2036x(activity, decorView)) {
                    c0919l1.m2026h(activity);
                    c0919l1.m2023I(activity);
                }
                break;
            case 1:
                Window window3 = activity.getWindow();
                decorView = window3 != null ? window3.getDecorView() : null;
                c0919l1.getClass();
                if (C0919l1.m2005M(activity, decorView) && (window = activity.getWindow()) != null && (decorView2 = window.getDecorView()) != null) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2413D()) {
                        c0919l1.m2021F(activity, decorView2);
                        c0919l1.m2033u(decorView2);
                    }
                    if (c0919l1.m2036x(activity, decorView2)) {
                        if (C1124g.m2413D()) {
                            c0919l1.m2035w(decorView2);
                            if (AbstractC0299i.m511i0(activity.getClass().getName(), "CleanChatting", true)) {
                                c0919l1.m2026h(activity);
                                c0919l1.m2023I(activity);
                            }
                        } else {
                            Set set = c0919l1.f3271b;
                            AbstractC0223g.m417d(set, "hiddenStorageRows");
                            for (View view : AbstractC0123k.m281w0(set)) {
                                AbstractC0223g.m415b(view);
                                c0919l1.m2024K(view);
                            }
                            set.clear();
                        }
                        break;
                    }
                }
                break;
            case 2:
                Window window4 = activity.getWindow();
                if (window4 != null && (decorView3 = window4.getDecorView()) != null) {
                    c0919l1.getClass();
                    if (C0919l1.m2005M(activity, decorView3)) {
                        c0919l1.m2021F(activity, decorView3);
                        boolean z3 = AbstractC1126i.f3786a;
                        if (C1124g.m2413D()) {
                            c0919l1.m2033u(decorView3);
                        }
                    }
                    break;
                }
                break;
            default:
                Window window5 = activity.getWindow();
                if (window5 != null && (decorView4 = window5.getDecorView()) != null) {
                    C0297g c0297g = C0919l1.f3262l;
                    if (c0919l1.m2036x(activity, decorView4)) {
                        c0919l1.m2033u(decorView4);
                        c0919l1.m2035w(decorView4);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0904g1(C0919l1 c0919l1, Activity activity, int i2) {
        this.f3193a = i2;
        this.f3194b = c0919l1;
        this.f3195c = activity;
    }
}
