package p082Q0;

import com.bumptech.glide.AbstractC1923e;
import p000A.C0010F;
import p041H0.AbstractC0567L;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p186k.C2439u;
import p260x.C3421d;

/* JADX INFO: renamed from: Q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1170d {

    /* JADX INFO: renamed from: a */
    public final int f3837a;

    /* JADX INFO: renamed from: b */
    public final C3421d f3838b;

    /* JADX INFO: renamed from: c */
    public final C0010F f3839c;

    /* JADX INFO: renamed from: d */
    public C1170d f3840d;

    /* JADX INFO: renamed from: e */
    public long f3841e;

    /* JADX INFO: renamed from: f */
    public long f3842f;

    /* JADX INFO: renamed from: g */
    public long f3843g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1171e f3844h;

    public C1170d(C1171e c1171e, int i5, C3421d c3421d, C0010F c0010f) {
        this.f3844h = c1171e;
        this.f3837a = i5;
        this.f3838b = c3421d;
        this.f3839c = c0010f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2214a(long j5, long j6, long j7, long j8, float[] fArr) {
        C1169c c1169c;
        C1169c c1169c2;
        long j9 = this.f3844h.f3850f;
        C3421d c3421d = this.f3838b;
        AbstractC0596h0 abstractC0596h0M1042r = AbstractC0601k.m1042r(c3421d, 2);
        C0564I c0564iM1044t = AbstractC0601k.m1044t(c3421d);
        boolean zM801I = c0564iM1044t.m801I();
        C0590e0 c0590e0 = c0564iM1044t.f1699J;
        if (zM801I) {
            if (c0590e0.f1894d != abstractC0596h0M1042r) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32);
                long j10 = abstractC0596h0M1042r.f1208f;
                AbstractC0596h0 abstractC0596h0 = c0590e0.f1894d;
                abstractC0596h0.getClass();
                long jM3457Q = AbstractC1923e.m3457Q(abstractC0596h0.mo635O(abstractC0596h0M1042r, jFloatToRawIntBits));
                c1169c = new C1169c(jM3457Q, (4294967295L & ((long) (((int) (jM3457Q & 4294967295L)) + ((int) (j10 & 4294967295L))))) | (((long) (((int) (jM3457Q >> 32)) + ((int) (j10 >> 32)))) << 32), j7, j8, j9, fArr, c3421d);
            } else {
                c1169c = new C1169c(j5, j6, j7, j8, j9, fArr, c3421d);
            }
            c1169c2 = c1169c;
        } else {
            c1169c2 = null;
        }
        if (c1169c2 == null) {
            return;
        }
        this.f3839c.mo1h(c1169c2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2215b() {
        C1171e c1171e = this.f3844h;
        C2439u c2439u = c1171e.f3845a;
        int i5 = this.f3837a;
        C1170d c1170d = (C1170d) c2439u.m4343g(i5);
        if (c1170d != null) {
            if (c1170d.equals(this)) {
                C1170d c1170d2 = this.f3840d;
                this.f3840d = null;
                if (c1170d2 == null) {
                    C0564I c0564iM1044t = AbstractC0601k.m1044t(this.f3838b.f7186d);
                    if (c0564iM1044t.f1718k) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564iM1044t)).getRectManager().f3820a.m1354t(c0564iM1044t.f1712e, false);
                        return;
                    }
                    return;
                }
                int iM4340d = c2439u.m4340d(i5);
                Object[] objArr = c2439u.f7847c;
                Object obj = objArr[iM4340d];
                c2439u.f7846b[iM4340d] = i5;
                objArr[iM4340d] = c1170d2;
                return;
            }
            int iM4340d2 = c2439u.m4340d(i5);
            Object[] objArr2 = c2439u.f7847c;
            Object obj2 = objArr2[iM4340d2];
            c2439u.f7846b[iM4340d2] = i5;
            objArr2[iM4340d2] = c1170d;
            while (true) {
                C1170d c1170d3 = c1170d.f3840d;
                if (c1170d3 == null) {
                    break;
                }
                if (c1170d3 == this) {
                    c1170d.f3840d = this.f3840d;
                    this.f3840d = null;
                    return;
                }
                c1170d = c1170d3;
            }
        }
        C1170d c1170d4 = c1171e.f3846b;
        if (c1170d4 == this) {
            c1171e.f3846b = c1170d4.f3840d;
            this.f3840d = null;
            return;
        }
        C1170d c1170d5 = c1170d4 != null ? c1170d4.f3840d : null;
        while (true) {
            C1170d c1170d6 = c1170d4;
            c1170d4 = c1170d5;
            if (c1170d4 == null) {
                return;
            }
            if (c1170d4 == this) {
                if (c1170d6 != null) {
                    c1170d6.f3840d = c1170d4.f3840d;
                }
                this.f3840d = null;
                return;
            }
            c1170d5 = c1170d4.f3840d;
        }
    }
}
