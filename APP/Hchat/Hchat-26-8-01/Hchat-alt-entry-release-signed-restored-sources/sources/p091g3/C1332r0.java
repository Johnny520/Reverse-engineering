package p091g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1332r0 {

    /* JADX INFO: renamed from: b */
    public static final C1332r0 f4397b;

    /* JADX INFO: renamed from: a */
    public final C1324n0 f4398a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            f4397b = C1322m0.f4392s;
        } else if (i9 >= 30) {
            f4397b = C1320l0.f4391r;
        } else {
            f4397b = C1324n0.f4393b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1332r0(C1332r0 c1332r0) {
        if (c1332r0 == null) {
            this.f4398a = new C1324n0(this);
            return;
        }
        C1324n0 c1324n0 = c1332r0.f4398a;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34 && (c1324n0 instanceof C1322m0)) {
            this.f4398a = new C1322m0(this, (C1322m0) c1324n0);
        } else if (i9 >= 30 && (c1324n0 instanceof C1320l0)) {
            this.f4398a = new C1320l0(this, (C1320l0) c1324n0);
        } else if (i9 >= 29 && (c1324n0 instanceof C1318k0)) {
            this.f4398a = new C1318k0(this, (C1318k0) c1324n0);
        } else if (i9 >= 28 && (c1324n0 instanceof C1316j0)) {
            this.f4398a = new C1316j0(this, (C1316j0) c1324n0);
        } else if (c1324n0 instanceof C1314i0) {
            this.f4398a = new C1314i0(this, (C1314i0) c1324n0);
        } else if (c1324n0 instanceof C1312h0) {
            this.f4398a = new C1312h0(this, (C1312h0) c1324n0);
        } else {
            this.f4398a = new C1324n0(this);
        }
        c1324n0.mo3500e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0171a m3557a(C0171a c0171a, int i9, int i10, int i11, int i12) {
        int iMax = Math.max(0, c0171a.f445a - i9);
        int iMax2 = Math.max(0, c0171a.f446b - i10);
        int iMax3 = Math.max(0, c0171a.f447c - i11);
        int iMax4 = Math.max(0, c0171a.f448d - i12);
        return (iMax == i9 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? c0171a : C0171a.m766b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1332r0 m3558c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C1332r0 c1332r0 = new C1332r0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i9 = AbstractC1329q.f4395a;
            C1332r0 c1332r0M3525a = AbstractC1323n.m3525a(view);
            C1324n0 c1324n0 = c1332r0.f4398a;
            c1324n0.mo3509t(c1332r0M3525a);
            c1324n0.mo3499d(view.getRootView());
            c1324n0.mo3510v(view.getWindowSystemUiVisibility());
        }
        return c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final WindowInsets m3559b() {
        C1324n0 c1324n0 = this.f4398a;
        if (c1324n0 instanceof C1312h0) {
            return ((C1312h0) c1324n0).f4376c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1332r0) {
            return Objects.equals(this.f4398a, ((C1332r0) obj).f4398a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1324n0 c1324n0 = this.f4398a;
        if (c1324n0 == null) {
            return 0;
        }
        return c1324n0.hashCode();
    }

    public C1332r0(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            this.f4398a = new C1322m0(this, windowInsets);
            return;
        }
        if (i9 >= 30) {
            this.f4398a = new C1320l0(this, windowInsets);
            return;
        }
        if (i9 >= 29) {
            this.f4398a = new C1318k0(this, windowInsets);
        } else if (i9 >= 28) {
            this.f4398a = new C1316j0(this, windowInsets);
        } else {
            this.f4398a = new C1314i0(this, windowInsets);
        }
    }
}
