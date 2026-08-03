package p090g2;

import p069f.C0965w;
import p129ig.AbstractC2043a;
import p174m.C2576b;
import p265s.C3821d;
import p339x1.AbstractC5613i0;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: g2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1295d {

    /* JADX INFO: renamed from: a */
    public final int f4332a;

    /* JADX INFO: renamed from: b */
    public final C3821d f4333b;

    /* JADX INFO: renamed from: c */
    public final C2576b f4334c;

    /* JADX INFO: renamed from: d */
    public C1295d f4335d;

    /* JADX INFO: renamed from: e */
    public long f4336e;

    /* JADX INFO: renamed from: f */
    public long f4337f;

    /* JADX INFO: renamed from: g */
    public long f4338g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1296e f4339h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1295d(C1296e c1296e, int i9, C3821d c3821d, C2576b c2576b) {
        this.f4339h = c1296e;
        this.f4332a = i9;
        this.f4333b = c3821d;
        this.f4334c = c2576b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3440a(long j3, long j4, long j5, long j10, float[] fArr) {
        C1294c c1294c;
        C1294c c1294c2;
        long j11 = this.f4339h.f4345f;
        C3821d c3821d = this.f4333b;
        AbstractC5614i1 abstractC5614i1M10164t = AbstractC5618k.m10164t(c3821d, 2);
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c3821d);
        boolean zM10011H = c5602f0M10167w.m10011H();
        C5587b1 c5587b1 = c5602f0M10167w.f22778L;
        if (zM10011H) {
            if (c5587b1.f22717d != abstractC5614i1M10164t) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
                long j12 = abstractC5614i1M10164t.f14595i;
                AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
                abstractC5614i1.getClass();
                long jM5017W = AbstractC2043a.m5017W(abstractC5614i1.mo8861W(abstractC5614i1M10164t, jFloatToRawIntBits));
                c1294c = new C1294c(jM5017W, (4294967295L & ((long) (((int) (jM5017W & 4294967295L)) + ((int) (j12 & 4294967295L))))) | (((long) (((int) (jM5017W >> 32)) + ((int) (j12 >> 32)))) << 32), j5, j10, j11, fArr, c3821d);
            } else {
                c1294c = new C1294c(j3, j4, j5, j10, j11, fArr, c3821d);
            }
            c1294c2 = c1294c;
        } else {
            c1294c2 = null;
        }
        if (c1294c2 == null) {
            return;
        }
        this.f4334c.invoke(c1294c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3441b() {
        C1296e c1296e = this.f4339h;
        C0965w c0965w = c1296e.f4340a;
        int i9 = this.f4332a;
        C1295d c1295d = (C1295d) c0965w.m2378g(i9);
        if (c1295d != null) {
            if (c1295d.equals(this)) {
                C1295d c1295d2 = this.f4335d;
                this.f4335d = null;
                if (c1295d2 == null) {
                    C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this.f4333b.f23788g);
                    if (c5602f0M10167w.f22796m) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0M10167w)).getRectManager().f4315b.m348N(c5602f0M10167w.f22791h, false);
                        return;
                    }
                    return;
                }
                int iM2375d = c0965w.m2375d(i9);
                Object[] objArr = c0965w.f2965c;
                Object obj = objArr[iM2375d];
                c0965w.f2964b[iM2375d] = i9;
                objArr[iM2375d] = c1295d2;
                return;
            }
            int iM2375d2 = c0965w.m2375d(i9);
            Object[] objArr2 = c0965w.f2965c;
            Object obj2 = objArr2[iM2375d2];
            c0965w.f2964b[iM2375d2] = i9;
            objArr2[iM2375d2] = c1295d;
            while (true) {
                C1295d c1295d3 = c1295d.f4335d;
                if (c1295d3 == null) {
                    break;
                }
                if (c1295d3 == this) {
                    c1295d.f4335d = this.f4335d;
                    this.f4335d = null;
                    return;
                }
                c1295d = c1295d3;
            }
        }
        C1295d c1295d4 = c1296e.f4341b;
        if (c1295d4 == this) {
            c1296e.f4341b = c1295d4.f4335d;
            this.f4335d = null;
            return;
        }
        C1295d c1295d5 = c1295d4 != null ? c1295d4.f4335d : null;
        while (true) {
            C1295d c1295d6 = c1295d4;
            c1295d4 = c1295d5;
            if (c1295d4 == null) {
                return;
            }
            if (c1295d4 == this) {
                if (c1295d6 != null) {
                    c1295d6.f4335d = c1295d4.f4335d;
                }
                this.f4335d = null;
                return;
            }
            c1295d5 = c1295d4.f4335d;
        }
    }
}
