package p227r;

import java.util.ArrayList;
import p000A.C0066i0;
import p041H0.AbstractC0601k;
import p049I2.AbstractC0797o;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p138b4.C1876u;
import p150d4.C1984a;
import p204n0.C2683b;
import p267y0.C3479a;
import p267y0.C3480b;

/* JADX INFO: renamed from: r.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2967Q {

    /* JADX INFO: renamed from: a */
    public final C3015t0 f9388a;

    /* JADX INFO: renamed from: b */
    public C2961L f9389b;

    /* JADX INFO: renamed from: c */
    public C2965O f9390c;

    /* JADX INFO: renamed from: d */
    public C2964N f9391d;

    /* JADX INFO: renamed from: e */
    public C2963M f9392e;

    /* JADX INFO: renamed from: f */
    public AbstractC0797o f9393f;

    /* JADX INFO: renamed from: g */
    public C0066i0 f9394g;

    /* JADX INFO: renamed from: h */
    public long f9395h = 9205357640488583168L;

    /* JADX INFO: renamed from: i */
    public C1984a f9396i;

    /* JADX INFO: renamed from: j */
    public final C1876u f9397j;

    /* JADX INFO: renamed from: k */
    public final C1876u f9398k;

    /* JADX INFO: renamed from: l */
    public long f9399l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2967Q(C3015t0 c3015t0) {
        this.f9388a = c3015t0;
        C1876u c1876u = new C1876u();
        c1876u.f6386b = new ArrayList();
        this.f9397j = c1876u;
        C1876u c1876u2 = new C1876u();
        c1876u2.f6386b = new ArrayList();
        this.f9398k = c1876u2;
        this.f9399l = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m5164c(C2967Q c2967q, C3480b c3480b, long j5, long j6, int i5) {
        if ((i5 & 4) != 0) {
            j6 = 0;
        }
        C3015t0 c3015t0 = c2967q.f9388a;
        C2964N c2964n = c2967q.f9391d;
        if (c2964n == null) {
            c2964n = new C2964N();
            c2964n.f9383c = null;
            c2964n.f9384d = Long.MAX_VALUE;
            c2964n.f9385e = false;
            c2967q.f9391d = c2964n;
        }
        c2964n.f9383c = c3480b;
        c2964n.f9384d = j5;
        C1984a c1984a = c2967q.f9396i;
        if (c1984a == null) {
            c2967q.f9396i = new C1984a(c3015t0.f9559t);
        } else {
            c1984a.f6675b = c3015t0.f9559t;
            c1984a.f6674a = j6;
        }
        c2964n.f9385e = false;
        c2967q.f9393f = c2964n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5165a() {
        C2961L c2961l = this.f9389b;
        EnumC2959K enumC2959K = EnumC2959K.f9365f;
        if (c2961l == null) {
            c2961l = new C2961L();
            c2961l.f9373c = enumC2959K;
            c2961l.f9374d = false;
            this.f9389b = c2961l;
        }
        c2961l.f9373c = enumC2959K;
        c2961l.f9374d = false;
        this.f9393f = c2961l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5166b(C3480b c3480b, long j5, C1984a c1984a) {
        C2963M c2963m = this.f9392e;
        if (c2963m == null) {
            c2963m = new C2963M();
            c2963m.f9381c = null;
            c2963m.f9382d = Long.MAX_VALUE;
            this.f9392e = c2963m;
        }
        c2963m.f9381c = c3480b;
        c2963m.f9382d = j5;
        c1984a.f6674a = 0L;
        this.f9393f = c2963m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0066i0 m5167d() {
        C0066i0 c0066i0 = this.f9394g;
        if (c0066i0 != null) {
            return c0066i0;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5168e(C3480b c3480b, C3479a c3479a, long j5) {
        C3015t0 c3015t0 = this.f9388a;
        long jMo640d = AbstractC0601k.m1043s(c3015t0).mo640d(0L);
        if (!C2683b.m4644b(this.f9395h, 9205357640488583168L) && !C2683b.m4644b(jMo640d, this.f9395h)) {
            this.f9399l = C2683b.m4647e(this.f9399l, C2683b.m4646d(jMo640d, this.f9395h));
        }
        this.f9395h = jMo640d;
        EnumC2983d0 enumC2983d0 = c3015t0.f9559t;
        AbstractC1665j.m2982b(enumC2983d0);
        if (Math.abs(Float.intBitsToFloat((int) (enumC2983d0 == EnumC2983d0.f9447d ? j5 & 4294967295L : j5 >> 32))) > 2.0f) {
            AbstractC1784a.m3219e(m5167d(), c3480b, c3015t0.f9559t, c3479a, this.f9397j, this.f9399l);
            C1876u c1876u = this.f9398k;
            ArrayList arrayList = c1876u.f6386b;
            if (arrayList.size() == 3) {
                int i5 = c1876u.f6385a;
                c1876u.f6385a = i5 + 1;
                arrayList.set(i5, new C2683b(j5));
            } else {
                arrayList.add(new C2683b(j5));
            }
            if (c1876u.f6385a == 3) {
                c1876u.f6385a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((C2683b) arrayList.get(i6)).f8556a >> 32))));
            }
            float fM2008O = (float) AbstractC0973m.m2008O(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((C2683b) arrayList.get(i7)).f8556a & 4294967295L))));
            }
            c3015t0.m5216T0(new C3014t((((long) Float.floatToRawIntBits((float) AbstractC0973m.m2008O(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM2008O)) << 32), true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5169f(C3480b c3480b, C3480b c3480b2, C3479a c3479a, long j5) {
        if (this.f9394g == null) {
            this.f9394g = new C0066i0(2);
        }
        this.f9399l = 0L;
        C0066i0 c0066i0M5167d = m5167d();
        C3015t0 c3015t0 = this.f9388a;
        AbstractC1784a.m3219e(c0066i0M5167d, c3480b, c3015t0.f9559t, c3479a, this.f9397j, this.f9399l);
        long jM4646d = C2683b.m4646d(AbstractC1784a.m3194H(c3480b2, c3015t0.f9559t, c3479a), j5);
        c3015t0.f9560u.getClass();
        this.f9395h = AbstractC0601k.m1043s(c3015t0).mo640d(0L);
        c3015t0.m5216T0(new C3016u(jM4646d));
        C1876u c1876u = this.f9398k;
        c1876u.f6385a = 0;
        c1876u.f6386b.clear();
    }
}
