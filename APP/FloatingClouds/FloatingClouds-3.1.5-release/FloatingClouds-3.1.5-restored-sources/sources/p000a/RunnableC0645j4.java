package p000a;

import android.view.View;
import java.util.Arrays;
import p000a.C0816s4;

/* JADX INFO: renamed from: a.j4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0645j4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0816s4 f2366b;

    public /* synthetic */ RunnableC0645j4(C0816s4 c0816s4, int i) {
        this.f2365a = i;
        this.f2366b = c0816s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM2206a;
        switch (this.f2365a) {
            case 0:
                C0816s4 c0816s4 = this.f2366b;
                if (c0816s4.f3238e.get()) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] isInBackAnimation fallback reset after 500ms"}, 1));
                    c0816s4.f3238e.set(false);
                    C0816s4.f3217F = false;
                }
                break;
            case 1:
                C0816s4 c0816s42 = this.f2366b;
                c0816s42.f3240g = null;
                if (C0816s4.f3218G || C0816s4.f3219H) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] onPause delayed rehide SKIPPED (whitelisted page open, profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                    c0816s42.f3238e.set(false);
                } else {
                    C0816s4.a.m1917b(c0816s42);
                    c0816s42.f3238e.set(false);
                    c0816s42.m1903k();
                    View view = c0816s42.f3242i;
                    if (view != null) {
                        try {
                            c0816s42.m1897c(view);
                            objM2206a = C0413Wf.f1577a;
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        Throwable thM2189a = C0901wd.m2189a(objM2206a);
                        if (thM2189a != null) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"onPause delayed refresh failed", thM2189a}, 2));
                        }
                    }
                }
                break;
            default:
                C0816s4 c0816s43 = this.f2366b;
                View view2 = c0816s43.f3242i;
                if (view2 != null) {
                    try {
                        c0816s43.m1898d(view2);
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th2) {
                        C0920xd.m2206a(th2);
                    }
                }
                break;
        }
    }
}
