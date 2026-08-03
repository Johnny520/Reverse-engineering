package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: cb */
/* JADX INFO: loaded from: classes.dex */
public final class C1259cb {

    /* JADX INFO: renamed from: a */
    public HashSet f4265a;

    /* JADX INFO: renamed from: b */
    public int f4266b;

    /* JADX INFO: renamed from: c */
    public boolean f4267c;

    /* JADX INFO: renamed from: d */
    public final C2454rb f4268d;

    /* JADX INFO: renamed from: e */
    public final int f4269e;

    /* JADX INFO: renamed from: f */
    public C1259cb f4270f;

    /* JADX INFO: renamed from: g */
    public int f4271g;

    /* JADX INFO: renamed from: h */
    public int f4272h;

    /* JADX INFO: renamed from: i */
    public C0256Fy f4273i;

    public C1259cb(C2454rb r2, int r3) {
        this.f4265a = null;
        this.f4271g = 0;
        this.f4272h = Integer.MIN_VALUE;
        this.f4268d = r2;
        this.f4269e = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2380a(C1259cb r3, int r4) {
        m2381b(r3, r4, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2381b(C1259cb r2, int r3, int r4, boolean r5) {
        if (r2 != null) goto L6;
        m2389j();
        return true;
    L6:
        if (r5 == false) goto L8;
    L11:
        this.f4270f = r2;
        if (r2.f4265a != null) goto L14;
        r2.f4265a = new HashSet();
    L14:
        HashSet r22 = this.f4270f.f4265a;
        if (r22 == null) goto L17;
        r22.add(this);
    L17:
        this.f4271g = r3;
        this.f4272h = r4;
        return true;
    L8:
        if (m2388i(r2) == true) goto L11;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m2382c(int r3, C1405fF r4, ArrayList r5) {
        HashSet r0 = this.f4265a;
        if (r0 == null) goto L8;
        Iterator r02 = r0.iterator();
    L6:
        if (r02.hasNext() == false) goto L10;
        AbstractC0148Dc.m275i(((C1259cb) r02.next()).f4268d, r3, r5, r4);
        goto L6
    L10:
        return;
    }

    /* JADX INFO: renamed from: d */
    public final int m2383d() {
        if (this.f4267c == true) goto L7;
        return 0;
    L7:
        return this.f4266b;
    }

    /* JADX INFO: renamed from: e */
    public final int m2384e() {
        if (this.f4268d.f8619g0 != 8) goto L6;
        return 0;
    L6:
        int r0 = this.f4272h;
        if (r0 == Integer.MIN_VALUE) goto L14;
        C1259cb r2 = this.f4270f;
        if (r2 == null) goto L14;
        if (r2.f4268d.f8619g0 != 8) goto L14;
        return r0;
    L14:
        return this.f4271g;
    }

    /* JADX INFO: renamed from: f */
    public final C1259cb m2385f() {
        int r0 = this.f4269e;
        int r1 = AbstractC0213Ey.m424v(r0);
        C2454rb r2 = this.f4268d;
        switch(r1) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L14;
            case 6: goto L14;
            case 7: goto L14;
            case 8: goto L14;
            default: goto L5;
        };
    L14:
        return null;
    L5:
        throw new AssertionError(AbstractC0213Ey.m423u(r0));
    L7:
        return r2.f8589J;
    L9:
        return r2.f8588I;
    L11:
        return r2.f8591L;
    L13:
        return r2.f8590K;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2386g() {
        HashSet r0 = this.f4265a;
        if (r0 != null) goto L5;
        return false;
    L5:
        Iterator r02 = r0.iterator();
    L7:
        if (r02.hasNext() == false) goto L12;
        if (((C1259cb) r02.next()).m2385f().m2387h() == false) goto L7;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2387h() {
        if (this.f4270f == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2388i(C1259cb r11) {
        if (r11 == null) goto L48;
        C2454rb r1 = r11.f4268d;
        int r112 = r11.f4269e;
        int r3 = this.f4269e;
        if (r112 != r3) goto L14;
        if (r3 == 6) goto L9;
    L46:
        return true;
    L9:
        if (r1.f8584E == false) goto L48;
        if (this.f4268d.f8584E == true) goto L46;
    L14:
        switch(AbstractC0213Ey.m424v(r3)) {
            case 0: goto L48;
            case 1: goto L37;
            case 2: goto L25;
            case 3: goto L37;
            case 4: goto L25;
            case 5: goto L21;
            case 6: goto L17;
            case 7: goto L48;
            case 8: goto L48;
            default: goto L16;
        };
    L17:
        if (r112 == 6) goto L48;
        if (r112 == 8) goto L48;
        if (r112 == 9) goto L48;
    L21:
        if (r112 == 2) goto L48;
        if (r112 != 4) goto L46;
    L37:
        if (r112 == 2) goto L41;
        if (r112 == 4) goto L41;
        boolean r2 = false;
    L43:
        if ((r1 instanceof C2150kk) == false) goto L47;
        if (r2 == true) goto L46;
        if (r112 != 8) goto L48;
    L47:
        return r2;
    L41:
        r2 = true;
        goto L43
    L16:
        throw new AssertionError(AbstractC0213Ey.m423u(r3));
    L25:
        if (r112 != 3) goto L27;
    L30:
        boolean r22 = true;
    L32:
        if ((r1 instanceof C2150kk) == false) goto L36;
        if (r22 == true) goto L46;
        if (r112 != 9) goto L48;
    L36:
        return r22;
    L27:
        if (r112 == 5) goto L30;
        r22 = false;
    L48:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2389j() {
        C1259cb r0 = this.f4270f;
        if (r0 == null) goto L9;
        HashSet r02 = r0.f4265a;
        if (r02 == null) goto L9;
        r02.remove(this);
        if (this.f4270f.f4265a.size() != 0) goto L9;
        this.f4270f.f4265a = null;
    L9:
        this.f4265a = null;
        this.f4270f = null;
        this.f4271g = 0;
        this.f4272h = Integer.MIN_VALUE;
        this.f4267c = false;
        this.f4266b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2390k() {
        C0256Fy r0 = this.f4273i;
        if (r0 != null) goto L6;
        this.f4273i = new C0256Fy(1);
        return;
    L6:
        r0.m535c();
    }

    /* JADX INFO: renamed from: l */
    public final void m2391l(int r1) {
        this.f4266b = r1;
        this.f4267c = true;
    }

    public final String toString() {
        return this.f4268d.f8621h0 + ":" + AbstractC0213Ey.m423u(this.f4269e);
    }
}
