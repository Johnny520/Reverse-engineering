package p000;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: rb */
/* JADX INFO: loaded from: classes.dex */
public class C2454rb {

    /* JADX INFO: renamed from: A */
    public int f8580A;

    /* JADX INFO: renamed from: B */
    public float f8581B;

    /* JADX INFO: renamed from: C */
    public final int[] f8582C;

    /* JADX INFO: renamed from: D */
    public float f8583D;

    /* JADX INFO: renamed from: E */
    public boolean f8584E;

    /* JADX INFO: renamed from: F */
    public boolean f8585F;

    /* JADX INFO: renamed from: G */
    public int f8586G;

    /* JADX INFO: renamed from: H */
    public int f8587H;

    /* JADX INFO: renamed from: I */
    public final C1259cb f8588I;

    /* JADX INFO: renamed from: J */
    public final C1259cb f8589J;

    /* JADX INFO: renamed from: K */
    public final C1259cb f8590K;

    /* JADX INFO: renamed from: L */
    public final C1259cb f8591L;

    /* JADX INFO: renamed from: M */
    public final C1259cb f8592M;

    /* JADX INFO: renamed from: N */
    public final C1259cb f8593N;

    /* JADX INFO: renamed from: O */
    public final C1259cb f8594O;

    /* JADX INFO: renamed from: P */
    public final C1259cb f8595P;

    /* JADX INFO: renamed from: Q */
    public final C1259cb[] f8596Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f8597R;

    /* JADX INFO: renamed from: S */
    public final boolean[] f8598S;

    /* JADX INFO: renamed from: T */
    public C2454rb f8599T;

    /* JADX INFO: renamed from: U */
    public int f8600U;

    /* JADX INFO: renamed from: V */
    public int f8601V;

    /* JADX INFO: renamed from: W */
    public float f8602W;

    /* JADX INFO: renamed from: X */
    public int f8603X;

    /* JADX INFO: renamed from: Y */
    public int f8604Y;

    /* JADX INFO: renamed from: Z */
    public int f8605Z;

    /* JADX INFO: renamed from: a0 */
    public int f8607a0;

    /* JADX INFO: renamed from: b */
    public C2221m7 f8608b;

    /* JADX INFO: renamed from: b0 */
    public int f8609b0;

    /* JADX INFO: renamed from: c */
    public C2221m7 f8610c;

    /* JADX INFO: renamed from: c0 */
    public int f8611c0;

    /* JADX INFO: renamed from: d0 */
    public float f8613d0;

    /* JADX INFO: renamed from: e0 */
    public float f8615e0;

    /* JADX INFO: renamed from: f0 */
    public View f8617f0;

    /* JADX INFO: renamed from: g0 */
    public int f8619g0;

    /* JADX INFO: renamed from: h0 */
    public String f8621h0;

    /* JADX INFO: renamed from: i0 */
    public int f8623i0;

    /* JADX INFO: renamed from: j */
    public String f8624j;

    /* JADX INFO: renamed from: j0 */
    public int f8625j0;

    /* JADX INFO: renamed from: k */
    public boolean f8626k;

    /* JADX INFO: renamed from: k0 */
    public final float[] f8627k0;

    /* JADX INFO: renamed from: l */
    public boolean f8628l;

    /* JADX INFO: renamed from: l0 */
    public final C2454rb[] f8629l0;

    /* JADX INFO: renamed from: m */
    public boolean f8630m;

    /* JADX INFO: renamed from: m0 */
    public final C2454rb[] f8631m0;

    /* JADX INFO: renamed from: n */
    public boolean f8632n;

    /* JADX INFO: renamed from: n0 */
    public int f8633n0;

    /* JADX INFO: renamed from: o */
    public int f8634o;

    /* JADX INFO: renamed from: o0 */
    public int f8635o0;

    /* JADX INFO: renamed from: p */
    public int f8636p;

    /* JADX INFO: renamed from: p0 */
    public final int[] f8637p0;

    /* JADX INFO: renamed from: q */
    public int f8638q;

    /* JADX INFO: renamed from: r */
    public int f8639r;

    /* JADX INFO: renamed from: s */
    public int f8640s;

    /* JADX INFO: renamed from: t */
    public final int[] f8641t;

    /* JADX INFO: renamed from: u */
    public int f8642u;

    /* JADX INFO: renamed from: v */
    public int f8643v;

    /* JADX INFO: renamed from: w */
    public float f8644w;

    /* JADX INFO: renamed from: x */
    public int f8645x;

    /* JADX INFO: renamed from: y */
    public int f8646y;

    /* JADX INFO: renamed from: z */
    public float f8647z;

    /* JADX INFO: renamed from: a */
    public boolean f8606a = false;

    /* JADX INFO: renamed from: d */
    public C0757Rk f8612d = null;

    /* JADX INFO: renamed from: e */
    public C0830TD f8614e = null;

    /* JADX INFO: renamed from: f */
    public final boolean[] f8616f = {true, true};

    /* JADX INFO: renamed from: g */
    public boolean f8618g = true;

    /* JADX INFO: renamed from: h */
    public int f8620h = -1;

    /* JADX INFO: renamed from: i */
    public int f8622i = -1;

    public C2454rb() {
        new HashMap();
        this.f8626k = false;
        this.f8628l = false;
        this.f8630m = false;
        this.f8632n = false;
        this.f8634o = -1;
        this.f8636p = -1;
        this.f8638q = 0;
        this.f8639r = 0;
        this.f8640s = 0;
        this.f8641t = new int[2];
        this.f8642u = 0;
        this.f8643v = 0;
        this.f8644w = 1.0f;
        this.f8645x = 0;
        this.f8646y = 0;
        this.f8647z = 1.0f;
        this.f8580A = -1;
        this.f8581B = 1.0f;
        this.f8582C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f8583D = Float.NaN;
        this.f8584E = false;
        this.f8585F = false;
        this.f8586G = 0;
        this.f8587H = 0;
        C1259cb c1259cb = new C1259cb(this, 2);
        this.f8588I = c1259cb;
        C1259cb c1259cb2 = new C1259cb(this, 3);
        this.f8589J = c1259cb2;
        C1259cb c1259cb3 = new C1259cb(this, 4);
        this.f8590K = c1259cb3;
        C1259cb c1259cb4 = new C1259cb(this, 5);
        this.f8591L = c1259cb4;
        C1259cb c1259cb5 = new C1259cb(this, 6);
        this.f8592M = c1259cb5;
        C1259cb c1259cb6 = new C1259cb(this, 8);
        this.f8593N = c1259cb6;
        C1259cb c1259cb7 = new C1259cb(this, 9);
        this.f8594O = c1259cb7;
        C1259cb c1259cb8 = new C1259cb(this, 7);
        this.f8595P = c1259cb8;
        this.f8596Q = new C1259cb[]{c1259cb, c1259cb3, c1259cb2, c1259cb4, c1259cb5, c1259cb8};
        ArrayList arrayList = new ArrayList();
        this.f8597R = arrayList;
        this.f8598S = new boolean[2];
        this.f8637p0 = new int[]{1, 1};
        this.f8599T = null;
        this.f8600U = 0;
        this.f8601V = 0;
        this.f8602W = 0.0f;
        this.f8603X = -1;
        this.f8604Y = 0;
        this.f8605Z = 0;
        this.f8607a0 = 0;
        this.f8613d0 = 0.5f;
        this.f8615e0 = 0.5f;
        this.f8619g0 = 0;
        this.f8621h0 = null;
        this.f8623i0 = 0;
        this.f8625j0 = 0;
        this.f8627k0 = new float[]{-1.0f, -1.0f};
        this.f8629l0 = new C2454rb[]{null, null};
        this.f8631m0 = new C2454rb[]{null, null};
        this.f8633n0 = -1;
        this.f8635o0 = -1;
        arrayList.add(c1259cb);
        arrayList.add(c1259cb2);
        arrayList.add(c1259cb3);
        arrayList.add(c1259cb4);
        arrayList.add(c1259cb6);
        arrayList.add(c1259cb7);
        arrayList.add(c1259cb8);
        arrayList.add(c1259cb5);
    }

    /* JADX INFO: renamed from: G */
    public static void m4910G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: H */
    public static void m4911H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: o */
    public static void m4912o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        m4910G(i, 0, "      size", sb);
        m4910G(i2, 0, "      min", sb);
        m4910G(i3, Integer.MAX_VALUE, "      max", sb);
        m4910G(i4, 0, "      matchMin", sb);
        m4910G(i5, 0, "      matchDef", sb);
        m4911H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* JADX INFO: renamed from: p */
    public static void m4913p(StringBuilder sb, String str, C1259cb c1259cb) {
        if (c1259cb.f4270f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c1259cb.f4270f);
        sb.append("'");
        if (c1259cb.f4272h != Integer.MIN_VALUE || c1259cb.f4271g != 0) {
            sb.append(",");
            sb.append(c1259cb.f4271g);
            if (c1259cb.f4272h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c1259cb.f4272h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* JADX INFO: renamed from: A */
    public boolean mo4334A() {
        if (this.f8626k) {
            return true;
        }
        return this.f8588I.f4267c && this.f8590K.f4267c;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo4335B() {
        if (this.f8628l) {
            return true;
        }
        return this.f8589J.f4267c && this.f8591L.f4267c;
    }

    /* JADX INFO: renamed from: C */
    public void mo4914C() {
        this.f8588I.m2389j();
        this.f8589J.m2389j();
        this.f8590K.m2389j();
        this.f8591L.m2389j();
        this.f8592M.m2389j();
        this.f8593N.m2389j();
        this.f8594O.m2389j();
        this.f8595P.m2389j();
        this.f8599T = null;
        this.f8583D = Float.NaN;
        this.f8600U = 0;
        this.f8601V = 0;
        this.f8602W = 0.0f;
        this.f8603X = -1;
        this.f8604Y = 0;
        this.f8605Z = 0;
        this.f8607a0 = 0;
        this.f8609b0 = 0;
        this.f8611c0 = 0;
        this.f8613d0 = 0.5f;
        this.f8615e0 = 0.5f;
        int[] iArr = this.f8637p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f8617f0 = null;
        this.f8619g0 = 0;
        this.f8623i0 = 0;
        this.f8625j0 = 0;
        float[] fArr = this.f8627k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8634o = -1;
        this.f8636p = -1;
        int[] iArr2 = this.f8582C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f8639r = 0;
        this.f8640s = 0;
        this.f8644w = 1.0f;
        this.f8647z = 1.0f;
        this.f8643v = Integer.MAX_VALUE;
        this.f8646y = Integer.MAX_VALUE;
        this.f8642u = 0;
        this.f8645x = 0;
        this.f8580A = -1;
        this.f8581B = 1.0f;
        boolean[] zArr = this.f8616f;
        zArr[0] = true;
        zArr[1] = true;
        this.f8585F = false;
        boolean[] zArr2 = this.f8598S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f8618g = true;
        int[] iArr3 = this.f8641t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f8620h = -1;
        this.f8622i = -1;
    }

    /* JADX INFO: renamed from: D */
    public final void m4915D() {
        C2454rb c2454rb = this.f8599T;
        if (c2454rb != null && (c2454rb instanceof C2497sb)) {
            ((C2497sb) c2454rb).getClass();
        }
        ArrayList arrayList = this.f8597R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1259cb) arrayList.get(i)).m2389j();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4916E() {
        this.f8626k = false;
        this.f8628l = false;
        this.f8630m = false;
        this.f8632n = false;
        ArrayList arrayList = this.f8597R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1259cb c1259cb = (C1259cb) arrayList.get(i);
            c1259cb.f4267c = false;
            c1259cb.f4266b = 0;
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo4917F(C2656w4 c2656w4) {
        this.f8588I.m2390k();
        this.f8589J.m2390k();
        this.f8590K.m2390k();
        this.f8591L.m2390k();
        this.f8592M.m2390k();
        this.f8595P.m2390k();
        this.f8593N.m2390k();
        this.f8594O.m2390k();
    }

    /* JADX INFO: renamed from: I */
    public final void m4918I(int i) {
        this.f8607a0 = i;
        this.f8584E = i > 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m4919J(int i, int i2) {
        if (this.f8626k) {
            return;
        }
        this.f8588I.m2391l(i);
        this.f8590K.m2391l(i2);
        this.f8604Y = i;
        this.f8600U = i2 - i;
        this.f8626k = true;
    }

    /* JADX INFO: renamed from: K */
    public final void m4920K(int i, int i2) {
        if (this.f8628l) {
            return;
        }
        this.f8589J.m2391l(i);
        this.f8591L.m2391l(i2);
        this.f8605Z = i;
        this.f8601V = i2 - i;
        if (this.f8584E) {
            this.f8592M.m2391l(i + this.f8607a0);
        }
        this.f8628l = true;
    }

    /* JADX INFO: renamed from: L */
    public final void m4921L(int i) {
        this.f8601V = i;
        int i2 = this.f8611c0;
        if (i < i2) {
            this.f8601V = i2;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4922M(int i) {
        this.f8637p0[0] = i;
    }

    /* JADX INFO: renamed from: N */
    public final void m4923N(int i) {
        this.f8637p0[1] = i;
    }

    /* JADX INFO: renamed from: O */
    public final void m4924O(int i) {
        this.f8600U = i;
        int i2 = this.f8609b0;
        if (i < i2) {
            this.f8600U = i2;
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo4925P(boolean z, boolean z2) {
        int i;
        int i2;
        C0757Rk c0757Rk = this.f8612d;
        boolean z3 = z & c0757Rk.f5063g;
        C0830TD c0830td = this.f8614e;
        boolean z4 = z2 & c0830td.f5063g;
        int i3 = c0757Rk.f5064h.f9116g;
        int i4 = c0830td.f5064h.f9116g;
        int i5 = c0757Rk.f5065i.f9116g;
        int i6 = c0830td.f5065i.f9116g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f8604Y = i3;
        }
        if (z4) {
            this.f8605Z = i4;
        }
        if (this.f8619g0 == 8) {
            this.f8600U = 0;
            this.f8601V = 0;
            return;
        }
        int[] iArr = this.f8637p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.f8600U)) {
                i8 = i2;
            }
            this.f8600U = i8;
            int i10 = this.f8609b0;
            if (i8 < i10) {
                this.f8600U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.f8601V)) {
                i9 = i;
            }
            this.f8601V = i9;
            int i11 = this.f8611c0;
            if (i9 < i11) {
                this.f8601V = i11;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo4336Q(C2244mo c2244mo, boolean z) {
        int i;
        int i2;
        C0830TD c0830td;
        C0757Rk c0757Rk;
        c2244mo.getClass();
        int iM4561n = C2244mo.m4561n(this.f8588I);
        int iM4561n2 = C2244mo.m4561n(this.f8589J);
        int iM4561n3 = C2244mo.m4561n(this.f8590K);
        int iM4561n4 = C2244mo.m4561n(this.f8591L);
        if (z && (c0757Rk = this.f8612d) != null) {
            C2628vd c2628vd = c0757Rk.f5064h;
            if (c2628vd.f9119j) {
                C2628vd c2628vd2 = c0757Rk.f5065i;
                if (c2628vd2.f9119j) {
                    iM4561n = c2628vd.f9116g;
                    iM4561n3 = c2628vd2.f9116g;
                }
            }
        }
        if (z && (c0830td = this.f8614e) != null) {
            C2628vd c2628vd3 = c0830td.f5064h;
            if (c2628vd3.f9119j) {
                C2628vd c2628vd4 = c0830td.f5065i;
                if (c2628vd4.f9119j) {
                    iM4561n2 = c2628vd3.f9116g;
                    iM4561n4 = c2628vd4.f9116g;
                }
            }
        }
        int i3 = iM4561n4 - iM4561n2;
        if (iM4561n3 - iM4561n < 0 || i3 < 0 || iM4561n == Integer.MIN_VALUE || iM4561n == Integer.MAX_VALUE || iM4561n2 == Integer.MIN_VALUE || iM4561n2 == Integer.MAX_VALUE || iM4561n3 == Integer.MIN_VALUE || iM4561n3 == Integer.MAX_VALUE || iM4561n4 == Integer.MIN_VALUE || iM4561n4 == Integer.MAX_VALUE) {
            iM4561n = 0;
            iM4561n2 = 0;
            iM4561n3 = 0;
            iM4561n4 = 0;
        }
        int i4 = iM4561n3 - iM4561n;
        int i5 = iM4561n4 - iM4561n2;
        this.f8604Y = iM4561n;
        this.f8605Z = iM4561n2;
        if (this.f8619g0 == 8) {
            this.f8600U = 0;
            this.f8601V = 0;
            return;
        }
        int[] iArr = this.f8637p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f8600U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f8601V)) {
            i5 = i;
        }
        this.f8600U = i4;
        this.f8601V = i5;
        int i7 = this.f8611c0;
        if (i5 < i7) {
            this.f8601V = i7;
        }
        int i8 = this.f8609b0;
        if (i4 < i8) {
            this.f8600U = i8;
        }
        int i9 = this.f8643v;
        if (i9 > 0 && i6 == 3) {
            this.f8600U = Math.min(this.f8600U, i9);
        }
        int i10 = this.f8646y;
        if (i10 > 0 && iArr[1] == 3) {
            this.f8601V = Math.min(this.f8601V, i10);
        }
        int i11 = this.f8600U;
        if (i4 != i11) {
            this.f8620h = i11;
        }
        int i12 = this.f8601V;
        if (i5 != i12) {
            this.f8622i = i12;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4926a(C2497sb c2497sb, C2244mo c2244mo, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC0714Qj.m1486h(c2497sb, c2244mo, this);
            hashSet.remove(this);
            mo813b(c2244mo, c2497sb.m4984W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f8588I.f4265a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C1259cb) it.next()).f4268d.m4926a(c2497sb, c2244mo, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f8590K.f4265a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C1259cb) it2.next()).f4268d.m4926a(c2497sb, c2244mo, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f8589J.f4265a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C1259cb) it3.next()).f4268d.m4926a(c2497sb, c2244mo, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f8591L.f4265a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C1259cb) it4.next()).f4268d.m4926a(c2497sb, c2244mo, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f8592M.f4265a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C1259cb) it5.next()).f4268d.m4926a(c2497sb, c2244mo, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [rb] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo813b(C2244mo c2244mo, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        C2454rb c2454rb;
        C2454rb c2454rb2;
        boolean[] zArr;
        C1259cb c1259cb;
        boolean[] zArr2;
        C1259cb c1259cb2;
        C1259cb c1259cb3;
        int i6;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int[] iArr;
        float f;
        C1259cb c1259cb4;
        C0256Fy c0256Fy;
        C1259cb c1259cb5;
        int i9;
        int i10;
        int i11;
        boolean z5;
        int i12;
        boolean z6;
        C1259cb c1259cb6;
        int i13;
        int[] iArr2;
        C1259cb c1259cb7;
        C0256Fy c0256Fy2;
        C0256Fy c0256Fy3;
        C1259cb c1259cb8;
        int[] iArr3;
        C0256Fy c0256Fy4;
        boolean z7;
        ?? r3;
        ?? r4;
        C0256Fy c0256Fy5;
        C1259cb c1259cb9;
        C0256Fy c0256Fy6;
        int i14;
        boolean[] zArr3;
        C0256Fy c0256Fy7;
        C0256Fy c0256Fy8;
        C0256Fy c0256Fy9;
        int i15;
        int i16;
        boolean z8;
        int i17;
        C0256Fy c0256Fy10;
        C0256Fy c0256Fy11;
        C0830TD c0830td;
        boolean z9;
        C0757Rk c0757Rk;
        int i18;
        int i19;
        boolean zM4944x;
        int i20;
        boolean zM4945y;
        C0757Rk c0757Rk2;
        C0830TD c0830td2;
        boolean z10;
        C2244mo c2244mo2 = c2244mo;
        C1259cb c1259cb10 = this.f8588I;
        C0256Fy c0256FyM4572k = c2244mo2.m4572k(c1259cb10);
        C1259cb c1259cb11 = this.f8590K;
        C0256Fy c0256FyM4572k2 = c2244mo2.m4572k(c1259cb11);
        C1259cb c1259cb12 = this.f8589J;
        C0256Fy c0256FyM4572k3 = c2244mo2.m4572k(c1259cb12);
        C1259cb c1259cb13 = this.f8591L;
        C0256Fy c0256FyM4572k4 = c2244mo2.m4572k(c1259cb13);
        C1259cb c1259cb14 = this.f8592M;
        C0256Fy c0256FyM4572k5 = c2244mo2.m4572k(c1259cb14);
        C2454rb c2454rb3 = this.f8599T;
        if (c2454rb3 != null) {
            int[] iArr4 = c2454rb3.f8637p0;
            i = 0;
            i3 = iArr4[0] == 2 ? 1 : 0;
            int i21 = iArr4[1] == 2 ? 1 : 0;
            int i22 = this.f8638q;
            if (i22 != 1) {
                if (i22 == 2) {
                    i3 = 0;
                } else if (i22 != 3) {
                }
                i2 = i21;
            } else {
                i2 = 0;
            }
            i4 = this.f8619g0;
            boolean[] zArr4 = this.f8598S;
            int i23 = i2;
            if (i4 != 8) {
                ArrayList arrayList = this.f8597R;
                int size = arrayList.size();
                i5 = i3;
                int i24 = i;
                while (true) {
                    if (i24 < size) {
                        int i25 = size;
                        HashSet hashSet = ((C1259cb) arrayList.get(i24)).f4265a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i24++;
                        size = i25;
                    } else if (!zArr4[i] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                i5 = i3;
            }
            z2 = this.f8626k;
            if (!z2 || this.f8628l) {
                if (z2) {
                    c2244mo2.m4565d(c0256FyM4572k, this.f8604Y);
                    c2244mo2.m4565d(c0256FyM4572k2, this.f8604Y + this.f8600U);
                    if (i5 != 0 && (c2454rb2 = this.f8599T) != null) {
                        C2497sb c2497sb = (C2497sb) c2454rb2;
                        WeakReference weakReference = c2497sb.f8769H0;
                        if (weakReference == null || weakReference.get() == null || c1259cb10.m2383d() > ((C1259cb) c2497sb.f8769H0.get()).m2383d()) {
                            c2497sb.f8769H0 = new WeakReference(c1259cb10);
                        }
                        WeakReference weakReference2 = c2497sb.f8771J0;
                        if (weakReference2 == null || weakReference2.get() == null || c1259cb11.m2383d() > ((C1259cb) c2497sb.f8771J0.get()).m2383d()) {
                            c2497sb.f8771J0 = new WeakReference(c1259cb11);
                        }
                    }
                }
                if (this.f8628l) {
                    c2244mo2.m4565d(c0256FyM4572k3, this.f8605Z);
                    c2244mo2.m4565d(c0256FyM4572k4, this.f8605Z + this.f8601V);
                    HashSet hashSet2 = c1259cb14.f4265a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        c2244mo2.m4565d(c0256FyM4572k5, this.f8605Z + this.f8607a0);
                    }
                    if (i23 != 0 && (c2454rb = this.f8599T) != null) {
                        C2497sb c2497sb2 = (C2497sb) c2454rb;
                        WeakReference weakReference3 = c2497sb2.f8768G0;
                        if (weakReference3 == null || weakReference3.get() == null || c1259cb12.m2383d() > ((C1259cb) c2497sb2.f8768G0.get()).m2383d()) {
                            c2497sb2.f8768G0 = new WeakReference(c1259cb12);
                        }
                        WeakReference weakReference4 = c2497sb2.f8770I0;
                        if (weakReference4 == null || weakReference4.get() == null || c1259cb13.m2383d() > ((C1259cb) c2497sb2.f8770I0.get()).m2383d()) {
                            c2497sb2.f8770I0 = new WeakReference(c1259cb13);
                        }
                    }
                }
                if (this.f8626k && this.f8628l) {
                    ?? r12 = i;
                    this.f8626k = r12;
                    this.f8628l = r12;
                    return;
                }
            }
            zArr = this.f8616f;
            if (z || (c0757Rk2 = this.f8612d) == null || (c0830td2 = this.f8614e) == null) {
                c1259cb = c1259cb14;
                zArr2 = zArr;
            } else {
                c1259cb = c1259cb14;
                C2628vd c2628vd = c0757Rk2.f5064h;
                zArr2 = zArr;
                if (c2628vd.f9119j && c0757Rk2.f5065i.f9119j && c0830td2.f5064h.f9119j && c0830td2.f5065i.f9119j) {
                    c2244mo2.m4565d(c0256FyM4572k, c2628vd.f9116g);
                    c2244mo2.m4565d(c0256FyM4572k2, this.f8612d.f5065i.f9116g);
                    c2244mo2.m4565d(c0256FyM4572k3, this.f8614e.f5064h.f9116g);
                    c2244mo2.m4565d(c0256FyM4572k4, this.f8614e.f5065i.f9116g);
                    c2244mo2.m4565d(c0256FyM4572k5, this.f8614e.f2621k.f9116g);
                    if (this.f8599T == null) {
                        z10 = false;
                    } else {
                        if (i5 != 0 && zArr2[0] && !m4944x()) {
                            c2244mo2.m4567f(c2244mo2.m4572k(this.f8599T.f8590K), c0256FyM4572k2, 0, 8);
                        }
                        if (i23 != 0 && zArr2[1] && !m4945y()) {
                            z10 = false;
                            c2244mo2.m4567f(c2244mo2.m4572k(this.f8599T.f8591L), c0256FyM4572k4, 0, 8);
                        }
                    }
                    this.f8626k = z10;
                    this.f8628l = z10;
                    return;
                }
            }
            if (this.f8599T == null) {
                if (m4943w(0)) {
                    ((C2497sb) this.f8599T).m4980R(this, 0);
                    zM4944x = true;
                    i20 = 1;
                } else {
                    zM4944x = m4944x();
                    i20 = 1;
                }
                if (m4943w(i20)) {
                    ((C2497sb) this.f8599T).m4980R(this, i20);
                    zM4945y = true;
                } else {
                    zM4945y = m4945y();
                }
                if (zM4944x || i5 == 0 || this.f8619g0 == 8 || c1259cb10.f4270f != null || c1259cb11.f4270f != null) {
                    c1259cb2 = c1259cb10;
                } else {
                    c1259cb2 = c1259cb10;
                    c2244mo2.m4567f(c2244mo2.m4572k(this.f8599T.f8590K), c0256FyM4572k2, 0, 1);
                }
                if (!zM4945y && i23 != 0 && this.f8619g0 != 8 && c1259cb12.f4270f == null && c1259cb13.f4270f == null && c1259cb == null) {
                    c2244mo2.m4567f(c2244mo2.m4572k(this.f8599T.f8591L), c0256FyM4572k4, 0, 1);
                }
                c1259cb3 = c1259cb11;
                i6 = i23;
                z4 = zM4945y;
                z3 = zM4944x;
            } else {
                c1259cb2 = c1259cb10;
                c1259cb3 = c1259cb11;
                i6 = i23;
                z3 = false;
                z4 = false;
            }
            i7 = this.f8600U;
            i8 = this.f8609b0;
            if (i7 >= i8) {
                i8 = i7;
            }
            int i26 = this.f8601V;
            C1259cb c1259cb15 = c1259cb3;
            int i27 = this.f8611c0;
            int i28 = i26 >= i27 ? i27 : i26;
            iArr = this.f8637p0;
            int i29 = iArr[0];
            int i30 = i6;
            boolean z11 = i29 == 3;
            int i31 = iArr[1];
            boolean z12 = i31 == 3;
            int i32 = this.f8603X;
            this.f8580A = i32;
            f = this.f8602W;
            this.f8581B = f;
            int i33 = this.f8639r;
            int i34 = this.f8640s;
            if (f <= 0.0f) {
                c1259cb4 = c1259cb13;
                if (this.f8619g0 != 8) {
                    int i35 = (i29 == 3 && i33 == 0) ? 3 : i33;
                    if (i31 == 3 && i34 == 0) {
                        c0256Fy = c0256FyM4572k4;
                        i19 = 3;
                    } else {
                        c0256Fy = c0256FyM4572k4;
                        i19 = i34;
                    }
                    if (i29 == 3 && i31 == 3 && i35 == 3 && i19 == 3) {
                        if (i32 == -1) {
                            if (z11 && !z12) {
                                this.f8580A = 0;
                            } else if (!z11 && z12) {
                                this.f8580A = 1;
                                if (i32 == -1) {
                                    this.f8581B = 1.0f / f;
                                }
                            }
                        }
                        if (this.f8580A == 0 && (!c1259cb12.m2387h() || !c1259cb4.m2387h())) {
                            this.f8580A = 1;
                        } else if (this.f8580A == 1 && (!c1259cb2.m2387h() || !c1259cb15.m2387h())) {
                            this.f8580A = 0;
                        }
                        if (this.f8580A == -1 && (!c1259cb12.m2387h() || !c1259cb4.m2387h() || !c1259cb2.m2387h() || !c1259cb15.m2387h())) {
                            if (c1259cb12.m2387h() && c1259cb4.m2387h()) {
                                this.f8580A = 0;
                            } else if (c1259cb2.m2387h() && c1259cb15.m2387h()) {
                                this.f8581B = 1.0f / this.f8581B;
                                this.f8580A = 1;
                            }
                        }
                        if (this.f8580A == -1) {
                            int i36 = this.f8642u;
                            if (i36 > 0 && this.f8645x == 0) {
                                this.f8580A = 0;
                            } else if (i36 == 0 && this.f8645x > 0) {
                                this.f8581B = 1.0f / this.f8581B;
                                this.f8580A = 1;
                            }
                        }
                    } else {
                        if (i29 != 3 || i35 != 3) {
                            if (i31 == 3 && i19 == 3) {
                                this.f8580A = 1;
                                if (i32 == -1) {
                                    this.f8581B = 1.0f / f;
                                }
                                i9 = (int) (this.f8581B * i7);
                                if (i29 != 3) {
                                    i10 = i35;
                                    c1259cb5 = c1259cb;
                                    i11 = 4;
                                } else {
                                    i10 = i35;
                                    c1259cb5 = c1259cb;
                                }
                            }
                            z5 = true;
                            i11 = i19;
                            int[] iArr5 = this.f8641t;
                            iArr5[0] = i10;
                            iArr5[1] = i11;
                            if (!z5) {
                                int i37 = this.f8580A;
                                i12 = -1;
                                boolean z13 = i37 == 0 || i37 == -1;
                                boolean z14 = z5 && ((i18 = this.f8580A) == 1 || i18 == i12);
                                z6 = iArr[0] == 2 && (this instanceof C2497sb);
                                if (z6) {
                                    i8 = 0;
                                }
                                c1259cb6 = this.f8595P;
                                boolean z15 = !c1259cb6.m2387h();
                                char c = '\b';
                                boolean z16 = zArr4[0];
                                boolean z17 = zArr4[1];
                                i13 = this.f8634o;
                                iArr2 = this.f8582C;
                                if (i13 == 2 || this.f8626k) {
                                    c1259cb7 = c1259cb5;
                                    c0256Fy2 = c0256FyM4572k;
                                    c0256Fy3 = c0256FyM4572k2;
                                    c1259cb8 = c1259cb6;
                                    iArr3 = iArr2;
                                    c0256Fy4 = c0256FyM4572k5;
                                    z7 = z3;
                                    r3 = i5;
                                    r4 = i30;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c1259cb9 = c1259cb4;
                                    c0256Fy6 = c0256Fy;
                                    i14 = i10;
                                    zArr3 = zArr2;
                                } else {
                                    if (z && (c0757Rk = this.f8612d) != null) {
                                        C2628vd c2628vd2 = c0757Rk.f5064h;
                                        if (c2628vd2.f9119j && c0757Rk.f5065i.f9119j) {
                                            if (z) {
                                                c2244mo2.m4565d(c0256FyM4572k, c2628vd2.f9116g);
                                                c2244mo2.m4565d(c0256FyM4572k2, this.f8612d.f5065i.f9116g);
                                                if (this.f8599T != null && i5 != 0 && zArr2[0] && !m4944x()) {
                                                    c2244mo2.m4567f(c2244mo2.m4572k(this.f8599T.f8590K), c0256FyM4572k2, 0, 8);
                                                }
                                            }
                                            c1259cb7 = c1259cb5;
                                            c0256Fy2 = c0256FyM4572k;
                                            c0256Fy3 = c0256FyM4572k2;
                                            c1259cb8 = c1259cb6;
                                            iArr3 = iArr2;
                                            c0256Fy4 = c0256FyM4572k5;
                                            z7 = z3;
                                            r3 = i5;
                                            r4 = i30;
                                            c0256Fy5 = c0256FyM4572k3;
                                            c1259cb9 = c1259cb4;
                                            c0256Fy6 = c0256Fy;
                                            i14 = i10;
                                            zArr3 = zArr2;
                                        } else {
                                            c = '\b';
                                        }
                                    }
                                    C2454rb c2454rb4 = this.f8599T;
                                    C0256Fy c0256FyM4572k6 = c2454rb4 != null ? c2244mo2.m4572k(c2454rb4.f8590K) : null;
                                    C2454rb c2454rb5 = this.f8599T;
                                    C0256Fy c0256FyM4572k7 = c2454rb5 != null ? c2244mo2.m4572k(c2454rb5.f8588I) : null;
                                    ?? r32 = i5;
                                    i14 = i10;
                                    z7 = z3;
                                    c1259cb8 = c1259cb6;
                                    iArr3 = iArr2;
                                    boolean z18 = z13;
                                    c0256Fy2 = c0256FyM4572k;
                                    ?? r42 = i30;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c0256Fy3 = c0256FyM4572k2;
                                    c1259cb9 = c1259cb4;
                                    c0256Fy6 = c0256Fy;
                                    c1259cb7 = c1259cb5;
                                    c0256Fy4 = c0256FyM4572k5;
                                    zArr3 = zArr2;
                                    c2244mo2 = c2244mo;
                                    m4927d(c2244mo2, true, r32, r42, zArr2[0], c0256FyM4572k7, c0256FyM4572k6, iArr[0], z6, this.f8588I, this.f8590K, this.f8604Y, i8, this.f8609b0, iArr2[0], this.f8613d0, z18, iArr[1] == 3, z7, z4, z16, i14, i11, this.f8642u, this.f8643v, this.f8644w, z15);
                                    r3 = r32;
                                    r4 = r42;
                                }
                                if (!z || (c0830td = this.f8614e) == null) {
                                    c0256Fy7 = c0256Fy5;
                                    c0256Fy8 = c0256Fy6;
                                    c0256Fy9 = c0256Fy4;
                                    i15 = 0;
                                    i16 = 8;
                                    z8 = true;
                                    i17 = 1;
                                } else {
                                    C2628vd c2628vd3 = c0830td.f5064h;
                                    if (c2628vd3.f9119j && c0830td.f5065i.f9119j) {
                                        int i38 = c2628vd3.f9116g;
                                        c0256Fy7 = c0256Fy5;
                                        c2244mo2.m4565d(c0256Fy7, i38);
                                        c0256Fy8 = c0256Fy6;
                                        c2244mo2.m4565d(c0256Fy8, this.f8614e.f5065i.f9116g);
                                        c0256Fy9 = c0256Fy4;
                                        c2244mo2.m4565d(c0256Fy9, this.f8614e.f2621k.f9116g);
                                        C2454rb c2454rb6 = this.f8599T;
                                        if (c2454rb6 == null || z4 || r4 == 0) {
                                            i15 = 0;
                                            i16 = 8;
                                            z9 = true;
                                        } else {
                                            z9 = true;
                                            z9 = true;
                                            if (zArr3[1]) {
                                                i15 = 0;
                                                i16 = 8;
                                                c2244mo2.m4567f(c2244mo2.m4572k(c2454rb6.f8591L), c0256Fy8, 0, 8);
                                            } else {
                                                i15 = 0;
                                                i16 = 8;
                                            }
                                        }
                                        i17 = i15;
                                        z8 = z9;
                                    }
                                }
                                if (this.f8636p == 2) {
                                    i17 = i15;
                                }
                                if (i17 == 0 || this.f8628l) {
                                    c0256Fy10 = c0256Fy7;
                                    c0256Fy11 = c0256Fy8;
                                } else {
                                    int i39 = (iArr[z8 ? 1 : 0] == 2 && (this instanceof C2497sb)) ? z8 ? 1 : 0 : i15;
                                    int i40 = i39 != 0 ? i15 : i9;
                                    C2454rb c2454rb7 = this.f8599T;
                                    C0256Fy c0256FyM4572k8 = c2454rb7 != null ? c2244mo2.m4572k(c2454rb7.f8591L) : null;
                                    C2454rb c2454rb8 = this.f8599T;
                                    C0256Fy c0256FyM4572k9 = c2454rb8 != null ? c2244mo2.m4572k(c2454rb8.f8589J) : null;
                                    int i41 = this.f8607a0;
                                    if (i41 <= 0) {
                                        ?? r27 = z15;
                                        if (this.f8619g0 == i16) {
                                            C1259cb c1259cb16 = c1259cb7;
                                            if (c1259cb16.f4270f != null) {
                                                c2244mo2.m4566e(c0256Fy9, c0256Fy7, i41, i16);
                                                c2244mo2.m4566e(c0256Fy9, c2244mo2.m4572k(c1259cb16.f4270f), c1259cb16.m2384e(), i16);
                                                if (r4 != 0) {
                                                    c2244mo2.m4567f(c0256FyM4572k8, c2244mo2.m4572k(c1259cb9), i15, 5);
                                                }
                                                r27 = i15;
                                            } else if (this.f8619g0 == i16) {
                                                c2244mo2.m4566e(c0256Fy9, c0256Fy7, c1259cb16.m2384e(), i16);
                                                r27 = z15;
                                            } else {
                                                c2244mo2.m4566e(c0256Fy9, c0256Fy7, i41, i16);
                                                r27 = z15;
                                            }
                                        }
                                        boolean z19 = zArr3[z8 ? 1 : 0];
                                        int i42 = i15;
                                        int i43 = iArr[z8 ? 1 : 0];
                                        int i44 = this.f8605Z;
                                        int i45 = this.f8611c0;
                                        int i46 = iArr3[z8 ? 1 : 0];
                                        float f2 = this.f8615e0;
                                        int i47 = iArr[i42];
                                        boolean z20 = z8 ? 1 : 0;
                                        ?? r18 = z8;
                                        if (i47 != 3) {
                                            r18 = i42;
                                        }
                                        c0256Fy11 = c0256Fy8;
                                        c0256Fy10 = c0256Fy7;
                                        c2244mo2 = c2244mo;
                                        m4927d(c2244mo2, false, r4, r3, z19, c0256FyM4572k9, c0256FyM4572k8, i43, i39, this.f8589J, this.f8591L, i44, i40, i45, i46, f2, z14, r18, z4, z7, z17, i11, i14, this.f8645x, this.f8646y, this.f8647z, r27);
                                    }
                                }
                                if (z5) {
                                    if (this.f8580A == 1) {
                                        float f3 = this.f8581B;
                                        C0564N4 c0564n4M4573l = c2244mo2.m4573l();
                                        c0564n4M4573l.f1845d.m367g(c0256Fy11, -1.0f);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy10, 1.0f);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy3, f3);
                                        c0564n4M4573l.f1845d.m367g(c0256Fy2, -f3);
                                        c2244mo2.m4564c(c0564n4M4573l);
                                    } else {
                                        float f4 = this.f8581B;
                                        C0564N4 c0564n4M4573l2 = c2244mo2.m4573l();
                                        c0564n4M4573l2.f1845d.m367g(c0256Fy3, -1.0f);
                                        c0564n4M4573l2.f1845d.m367g(c0256Fy2, 1.0f);
                                        c0564n4M4573l2.f1845d.m367g(c0256Fy11, f4);
                                        c0564n4M4573l2.f1845d.m367g(c0256Fy10, -f4);
                                        c2244mo2.m4564c(c0564n4M4573l2);
                                    }
                                }
                                if (c1259cb8.m2387h()) {
                                    C1259cb c1259cb17 = c1259cb8;
                                    C2454rb c2454rb9 = c1259cb17.f4270f.f4268d;
                                    float radians = (float) Math.toRadians(this.f8583D + 90.0f);
                                    int iM2384e = c1259cb17.m2384e();
                                    C0256Fy c0256FyM4572k10 = c2244mo2.m4572k(mo4340i(2));
                                    C0256Fy c0256FyM4572k11 = c2244mo2.m4572k(mo4340i(3));
                                    C0256Fy c0256FyM4572k12 = c2244mo2.m4572k(mo4340i(4));
                                    C0256Fy c0256FyM4572k13 = c2244mo2.m4572k(mo4340i(5));
                                    C0256Fy c0256FyM4572k14 = c2244mo2.m4572k(c2454rb9.mo4340i(2));
                                    C0256Fy c0256FyM4572k15 = c2244mo2.m4572k(c2454rb9.mo4340i(3));
                                    C0256Fy c0256FyM4572k16 = c2244mo2.m4572k(c2454rb9.mo4340i(4));
                                    C0256Fy c0256FyM4572k17 = c2244mo2.m4572k(c2454rb9.mo4340i(5));
                                    C0564N4 c0564n4M4573l3 = c2244mo2.m4573l();
                                    double d = radians;
                                    double dSin = Math.sin(d);
                                    double d2 = iM2384e;
                                    c0564n4M4573l3.f1845d.m367g(c0256FyM4572k15, 0.5f);
                                    c0564n4M4573l3.f1845d.m367g(c0256FyM4572k17, 0.5f);
                                    c0564n4M4573l3.f1845d.m367g(c0256FyM4572k11, -0.5f);
                                    c0564n4M4573l3.f1845d.m367g(c0256FyM4572k13, -0.5f);
                                    c0564n4M4573l3.f1843b = -((float) (dSin * d2));
                                    c2244mo2.m4564c(c0564n4M4573l3);
                                    C0564N4 c0564n4M4573l4 = c2244mo2.m4573l();
                                    float fCos = (float) (Math.cos(d) * d2);
                                    c0564n4M4573l4.f1845d.m367g(c0256FyM4572k14, 0.5f);
                                    c0564n4M4573l4.f1845d.m367g(c0256FyM4572k16, 0.5f);
                                    c0564n4M4573l4.f1845d.m367g(c0256FyM4572k10, -0.5f);
                                    c0564n4M4573l4.f1845d.m367g(c0256FyM4572k12, -0.5f);
                                    c0564n4M4573l4.f1843b = -fCos;
                                    c2244mo2.m4564c(c0564n4M4573l4);
                                }
                                this.f8626k = false;
                                this.f8628l = false;
                            }
                            i12 = -1;
                            if (z5) {
                            }
                            if (iArr[0] == 2) {
                            }
                            if (z6) {
                            }
                            c1259cb6 = this.f8595P;
                            boolean z152 = !c1259cb6.m2387h();
                            char c2 = '\b';
                            boolean z162 = zArr4[0];
                            boolean z172 = zArr4[1];
                            i13 = this.f8634o;
                            iArr2 = this.f8582C;
                            if (i13 == 2) {
                                c1259cb7 = c1259cb5;
                                c0256Fy2 = c0256FyM4572k;
                                c0256Fy3 = c0256FyM4572k2;
                                c1259cb8 = c1259cb6;
                                iArr3 = iArr2;
                                c0256Fy4 = c0256FyM4572k5;
                                z7 = z3;
                                r3 = i5;
                                r4 = i30;
                                c0256Fy5 = c0256FyM4572k3;
                                c1259cb9 = c1259cb4;
                                c0256Fy6 = c0256Fy;
                                i14 = i10;
                                zArr3 = zArr2;
                            }
                            if (z) {
                                c0256Fy7 = c0256Fy5;
                                c0256Fy8 = c0256Fy6;
                                c0256Fy9 = c0256Fy4;
                                i15 = 0;
                                i16 = 8;
                                z8 = true;
                                i17 = 1;
                            }
                            if (this.f8636p == 2) {
                            }
                            if (i17 == 0) {
                                c0256Fy10 = c0256Fy7;
                                c0256Fy11 = c0256Fy8;
                            }
                            if (z5) {
                            }
                            if (c1259cb8.m2387h()) {
                            }
                            this.f8626k = false;
                            this.f8628l = false;
                        }
                        this.f8580A = 0;
                        i8 = (int) (f * i26);
                        if (i31 != 3) {
                            c1259cb5 = c1259cb;
                            i9 = i28;
                            i10 = 4;
                            z5 = false;
                            i11 = i19;
                            int[] iArr52 = this.f8641t;
                            iArr52[0] = i10;
                            iArr52[1] = i11;
                            if (!z5) {
                            }
                            if (z5) {
                            }
                            if (iArr[0] == 2) {
                            }
                            if (z6) {
                            }
                            c1259cb6 = this.f8595P;
                            boolean z1522 = !c1259cb6.m2387h();
                            char c22 = '\b';
                            boolean z1622 = zArr4[0];
                            boolean z1722 = zArr4[1];
                            i13 = this.f8634o;
                            iArr2 = this.f8582C;
                            if (i13 == 2) {
                            }
                            if (z) {
                            }
                            if (this.f8636p == 2) {
                            }
                            if (i17 == 0) {
                            }
                            if (z5) {
                            }
                            if (c1259cb8.m2387h()) {
                            }
                            this.f8626k = false;
                            this.f8628l = false;
                        }
                    }
                    i10 = i35;
                    c1259cb5 = c1259cb;
                    i9 = i28;
                    z5 = true;
                    i11 = i19;
                    int[] iArr522 = this.f8641t;
                    iArr522[0] = i10;
                    iArr522[1] = i11;
                    if (!z5) {
                    }
                    if (z5) {
                    }
                    if (iArr[0] == 2) {
                    }
                    if (z6) {
                    }
                    c1259cb6 = this.f8595P;
                    boolean z15222 = !c1259cb6.m2387h();
                    char c222 = '\b';
                    boolean z16222 = zArr4[0];
                    boolean z17222 = zArr4[1];
                    i13 = this.f8634o;
                    iArr2 = this.f8582C;
                    if (i13 == 2) {
                    }
                    if (z) {
                    }
                    if (this.f8636p == 2) {
                    }
                    if (i17 == 0) {
                    }
                    if (z5) {
                    }
                    if (c1259cb8.m2387h()) {
                    }
                    this.f8626k = false;
                    this.f8628l = false;
                }
                z5 = false;
                int[] iArr5222 = this.f8641t;
                iArr5222[0] = i10;
                iArr5222[1] = i11;
                if (!z5) {
                }
                if (z5) {
                }
                if (iArr[0] == 2) {
                }
                if (z6) {
                }
                c1259cb6 = this.f8595P;
                boolean z152222 = !c1259cb6.m2387h();
                char c2222 = '\b';
                boolean z162222 = zArr4[0];
                boolean z172222 = zArr4[1];
                i13 = this.f8634o;
                iArr2 = this.f8582C;
                if (i13 == 2) {
                }
                if (z) {
                }
                if (this.f8636p == 2) {
                }
                if (i17 == 0) {
                }
                if (z5) {
                }
                if (c1259cb8.m2387h()) {
                }
                this.f8626k = false;
                this.f8628l = false;
            }
            c1259cb4 = c1259cb13;
            c0256Fy = c0256FyM4572k4;
            c1259cb5 = c1259cb;
            i9 = i28;
            i10 = i33;
            i11 = i34;
            z5 = false;
            int[] iArr52222 = this.f8641t;
            iArr52222[0] = i10;
            iArr52222[1] = i11;
            if (!z5) {
            }
            if (z5) {
            }
            if (iArr[0] == 2) {
            }
            if (z6) {
            }
            c1259cb6 = this.f8595P;
            boolean z1522222 = !c1259cb6.m2387h();
            char c22222 = '\b';
            boolean z1622222 = zArr4[0];
            boolean z1722222 = zArr4[1];
            i13 = this.f8634o;
            iArr2 = this.f8582C;
            if (i13 == 2) {
            }
            if (z) {
            }
            if (this.f8636p == 2) {
            }
            if (i17 == 0) {
            }
            if (z5) {
            }
            if (c1259cb8.m2387h()) {
            }
            this.f8626k = false;
            this.f8628l = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.f8619g0;
        boolean[] zArr42 = this.f8598S;
        int i232 = i2;
        if (i4 != 8) {
        }
        z2 = this.f8626k;
        if (!z2) {
            if (z2) {
            }
            if (this.f8628l) {
            }
            if (this.f8626k) {
                ?? r122 = i;
                this.f8626k = r122;
                this.f8628l = r122;
                return;
            }
        }
        zArr = this.f8616f;
        if (z) {
            c1259cb = c1259cb14;
            zArr2 = zArr;
        }
        if (this.f8599T == null) {
        }
        i7 = this.f8600U;
        i8 = this.f8609b0;
        if (i7 >= i8) {
        }
        int i262 = this.f8601V;
        C1259cb c1259cb152 = c1259cb3;
        int i272 = this.f8611c0;
        if (i262 >= i272) {
        }
        iArr = this.f8637p0;
        int i292 = iArr[0];
        int i302 = i6;
        if (i292 == 3) {
        }
        int i312 = iArr[1];
        if (i312 == 3) {
        }
        int i322 = this.f8603X;
        this.f8580A = i322;
        f = this.f8602W;
        this.f8581B = f;
        int i332 = this.f8639r;
        int i342 = this.f8640s;
        if (f <= 0.0f) {
        }
        c0256Fy = c0256FyM4572k4;
        c1259cb5 = c1259cb;
        i9 = i28;
        i10 = i332;
        i11 = i342;
        z5 = false;
        int[] iArr522222 = this.f8641t;
        iArr522222[0] = i10;
        iArr522222[1] = i11;
        if (!z5) {
        }
        if (z5) {
        }
        if (iArr[0] == 2) {
        }
        if (z6) {
        }
        c1259cb6 = this.f8595P;
        boolean z15222222 = !c1259cb6.m2387h();
        char c222222 = '\b';
        boolean z16222222 = zArr42[0];
        boolean z17222222 = zArr42[1];
        i13 = this.f8634o;
        iArr2 = this.f8582C;
        if (i13 == 2) {
        }
        if (z) {
        }
        if (this.f8636p == 2) {
        }
        if (i17 == 0) {
        }
        if (z5) {
        }
        if (c1259cb8.m2387h()) {
        }
        this.f8626k = false;
        this.f8628l = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo4339c() {
        return this.f8619g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0493 A[PHI: r3
  0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4927d(C2244mo c2244mo, boolean z, boolean z2, boolean z3, boolean z4, C0256Fy c0256Fy, C0256Fy c0256Fy2, int i, boolean z5, C1259cb c1259cb, C1259cb c1259cb2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        boolean z16;
        C0256Fy c0256FyM4572k;
        C0256Fy c0256FyM4572k2;
        C1259cb c1259cb3;
        C0256Fy c0256Fy3;
        boolean z17;
        int i12;
        C0256Fy c0256Fy4;
        C0256Fy c0256Fy5;
        C0256Fy c0256Fy6;
        C0256Fy c0256Fy7;
        int i13;
        int i14;
        int i15;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        C2454rb c2454rb;
        int i16;
        int i17;
        C1259cb c1259cb4;
        boolean z22;
        int iMin2;
        boolean z23;
        int i18;
        HashSet hashSet;
        boolean z24;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z25;
        boolean z26;
        int i24;
        C2244mo c2244mo2 = c2244mo;
        int i25 = i8;
        int i26 = i9;
        C0256Fy c0256FyM4572k3 = c2244mo2.m4572k(c1259cb);
        C0256Fy c0256FyM4572k4 = c2244mo2.m4572k(c1259cb2);
        C0256Fy c0256FyM4572k5 = c2244mo2.m4572k(c1259cb.f4270f);
        C0256Fy c0256FyM4572k6 = c2244mo2.m4572k(c1259cb2.f4270f);
        boolean zM2387h = c1259cb.m2387h();
        boolean zM2387h2 = c1259cb2.m2387h();
        boolean zM2387h3 = this.f8595P.m2387h();
        int i27 = zM2387h2 ? (zM2387h ? 1 : 0) + 1 : zM2387h ? 1 : 0;
        if (zM2387h3) {
            i27++;
        }
        int i28 = i27;
        int i29 = z6 ? 3 : i6;
        int iM424v = AbstractC0213Ey.m424v(i);
        boolean z27 = (iM424v == 0 || iM424v == 1 || iM424v != 2 || i29 == 4) ? false : true;
        int i30 = this.f8620h;
        if (i30 == -1 || !z) {
            i30 = i3;
            z12 = z27;
        } else {
            this.f8620h = -1;
            z12 = false;
        }
        int i31 = this.f8622i;
        if (i31 == -1 || z) {
            z13 = z12;
        } else {
            this.f8622i = -1;
            i30 = i31;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.f8619g0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i30;
            z14 = z28;
        }
        if (z11) {
            if (!zM2387h && !zM2387h2 && !zM2387h3) {
                c2244mo2.m4565d(c0256FyM4572k3, i2);
            } else if (zM2387h && !zM2387h2) {
                z15 = z14;
                i10 = 8;
                c2244mo2.m4566e(c0256FyM4572k3, c0256FyM4572k5, c1259cb.m2384e(), 8);
            }
            z15 = z14;
            i10 = 8;
        } else {
            z15 = z14;
            i10 = 8;
        }
        if (z15) {
            if (i28 == 2 || z6 || !(i29 == 1 || i29 == 0)) {
                if (i25 == -2) {
                    i25 = iMin;
                }
                if (i26 == -2) {
                    i26 = iMin;
                }
                if (iMin > 0 && i29 != 1) {
                    iMin = 0;
                }
                if (i25 > 0) {
                    c2244mo2.m4567f(c0256FyM4572k4, c0256FyM4572k3, i25, 8);
                    iMin = Math.max(iMin, i25);
                }
                if (i26 > 0) {
                    if (!z2 || i29 != 1) {
                        c2244mo2.m4568g(c0256FyM4572k4, c0256FyM4572k3, i26, 8);
                    }
                    iMin = Math.min(iMin, i26);
                }
                if (i29 == 1) {
                    if (z2) {
                        c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, iMin, 8);
                    } else if (z8) {
                        c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, iMin, 5);
                        c2244mo2.m4568g(c0256FyM4572k4, c0256FyM4572k3, iMin, 8);
                    } else {
                        c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, iMin, 5);
                        c2244mo2.m4568g(c0256FyM4572k4, c0256FyM4572k3, iMin, 8);
                    }
                } else if (i29 == 2) {
                    int i32 = c1259cb.f4269e;
                    if (i32 == 3 || i32 == 5) {
                        c0256FyM4572k = c2244mo2.m4572k(this.f8599T.mo4340i(3));
                        c0256FyM4572k2 = c2244mo2.m4572k(this.f8599T.mo4340i(5));
                    } else {
                        c0256FyM4572k = c2244mo2.m4572k(this.f8599T.mo4340i(2));
                        c0256FyM4572k2 = c2244mo2.m4572k(this.f8599T.mo4340i(4));
                    }
                    C0564N4 c0564n4M4573l = c2244mo2.m4573l();
                    int i33 = i25;
                    c0564n4M4573l.f1845d.m367g(c0256FyM4572k4, -1.0f);
                    c0564n4M4573l.f1845d.m367g(c0256FyM4572k3, 1.0f);
                    c0564n4M4573l.f1845d.m367g(c0256FyM4572k2, f2);
                    c0564n4M4573l.f1845d.m367g(c0256FyM4572k, -f2);
                    c2244mo2.m4564c(c0564n4M4573l);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i11 = i33;
                } else {
                    i11 = i25;
                    z16 = true;
                }
            } else {
                int iMax = Math.max(i25, iMin);
                if (i26 > 0) {
                    iMax = Math.min(i26, iMax);
                }
                c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, iMax, 8);
                z16 = z4;
                i11 = i25;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i28 >= 2 && z2 && z29) {
                    c2244mo2.m4567f(c0256FyM4572k3, c0256Fy, 0, 8);
                    C1259cb c1259cb5 = this.f8592M;
                    boolean z30 = z || c1259cb5.f4270f == null;
                    if (!z && (c1259cb3 = c1259cb5.f4270f) != null) {
                        C2454rb c2454rb2 = c1259cb3.f4268d;
                        if (c2454rb2.f8602W != 0.0f) {
                            int[] iArr = c2454rb2.f8637p0;
                            z30 = iArr[0] == 3 && iArr[1] == 3;
                        }
                    }
                    if (z30) {
                        c2244mo2.m4567f(c0256Fy2, c0256FyM4572k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!zM2387h && !zM2387h2 && !zM2387h3) {
                c1259cb4 = c1259cb2;
                c0256Fy6 = c0256FyM4572k4;
                z17 = z16;
                c0256Fy3 = c0256FyM4572k6;
            } else if (!zM2387h || zM2387h2) {
                if (zM2387h || !zM2387h2) {
                    c0256Fy3 = c0256FyM4572k6;
                    if (zM2387h && zM2387h2) {
                        C2454rb c2454rb3 = c1259cb.f4270f.f4268d;
                        C2454rb c2454rb4 = c1259cb2.f4270f.f4268d;
                        z17 = z16;
                        C2454rb c2454rb5 = this.f8599T;
                        int i34 = 6;
                        if (z15) {
                            if (i29 == 0) {
                                if (i26 != 0 || i11 != 0) {
                                    i22 = 5;
                                    i23 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (c0256FyM4572k5.f834f && c0256Fy3.f834f) {
                                    c2244mo2.m4566e(c0256FyM4572k3, c0256FyM4572k5, c1259cb.m2384e(), 8);
                                    c2244mo2.m4566e(c0256FyM4572k4, c0256Fy3, -c1259cb2.m2384e(), 8);
                                    return;
                                } else {
                                    i22 = 8;
                                    i23 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((c2454rb3 instanceof C2399q5) || (c2454rb4 instanceof C2399q5)) {
                                    c2244mo2 = c2244mo;
                                    i12 = i29;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c0256Fy6 = c0256FyM4572k4;
                                    z20 = z26;
                                    c0256Fy4 = c0256Fy2;
                                    i14 = i22;
                                    c0256Fy7 = c0256FyM4572k5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = 4;
                                    if (z19 || c0256Fy7 != c0256Fy3 || c2454rb3 == c2454rb5) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        c2454rb = c2454rb4;
                                        i16 = i11;
                                        i17 = i12;
                                        c1259cb4 = c1259cb2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || c0256Fy7 != c0256Fy || c0256Fy3 != c0256Fy4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i19 = i14;
                                        } else {
                                            i13 = 8;
                                            z22 = false;
                                            i19 = 8;
                                            z24 = false;
                                        }
                                        C0256Fy c0256Fy8 = c0256Fy7;
                                        i16 = i11;
                                        i17 = i12;
                                        c2454rb = c2454rb4;
                                        c1259cb4 = c1259cb2;
                                        c2244mo2.m4563b(c0256Fy5, c0256Fy8, c1259cb.m2384e(), f, c0256Fy3, c0256Fy6, c1259cb2.m2384e(), i13);
                                        c0256Fy7 = c0256Fy8;
                                        i14 = i19;
                                        z21 = z24;
                                    }
                                    if (this.f8619g0 != 8 && ((hashSet = c1259cb4.f4265a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && c0256Fy7 != c0256Fy3 && !z15 && ((c2454rb3 instanceof C2399q5) || (c2454rb instanceof C2399q5))) {
                                            i14 = 6;
                                        }
                                        c2244mo2.m4567f(c0256Fy5, c0256Fy7, c1259cb.m2384e(), i14);
                                        c2244mo2.m4568g(c0256Fy6, c0256Fy3, -c1259cb4.m2384e(), i14);
                                    }
                                    if (z22 || !z10 || (c2454rb3 instanceof C2399q5) || (c2454rb instanceof C2399q5) || c2454rb == c2454rb5) {
                                        iMin2 = i15;
                                        z23 = z21;
                                    } else {
                                        iMin2 = 6;
                                        i14 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (c2454rb3 != c2454rb5 && c2454rb != c2454rb5) {
                                                i34 = iMin2;
                                            }
                                            if ((c2454rb3 instanceof C2150kk) || (c2454rb instanceof C2150kk)) {
                                                i34 = 5;
                                            }
                                            if ((c2454rb3 instanceof C2399q5) || (c2454rb instanceof C2399q5)) {
                                                i34 = 5;
                                            }
                                            iMin2 = Math.max(z9 ? 5 : i34, iMin2);
                                        }
                                        if (z22) {
                                            iMin2 = Math.min(i14, iMin2);
                                            int i35 = (z6 && !z9 && (c2454rb3 == c2454rb5 || c2454rb == c2454rb5)) ? 4 : iMin2;
                                            c2244mo2.m4566e(c0256Fy5, c0256Fy7, c1259cb.m2384e(), i35);
                                            c2244mo2.m4566e(c0256Fy6, c0256Fy3, -c1259cb4.m2384e(), i35);
                                        }
                                    }
                                    if (z22) {
                                        int iM2384e = c0256Fy == c0256Fy7 ? c1259cb.m2384e() : 0;
                                        if (c0256Fy7 != c0256Fy) {
                                            c2244mo2.m4567f(c0256Fy5, c0256Fy, iM2384e, 5);
                                        }
                                    }
                                    if (z22 || !z15 || i4 != 0 || i16 != 0) {
                                        i18 = 5;
                                        i24 = i18;
                                    } else if (z15 && i17 == 3) {
                                        c2244mo2.m4567f(c0256Fy6, c0256Fy5, 0, 8);
                                        i18 = 5;
                                        i24 = i18;
                                    } else {
                                        i18 = 5;
                                        c2244mo2.m4567f(c0256Fy6, c0256Fy5, 0, 5);
                                        i24 = i18;
                                    }
                                } else {
                                    c2244mo2 = c2244mo;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c0256Fy6 = c0256FyM4572k4;
                                    z20 = z26;
                                    i14 = i22;
                                    c0256Fy7 = c0256FyM4572k5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = i23;
                                    i12 = i29;
                                    c0256Fy4 = c0256Fy2;
                                    if (z19) {
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.f8619g0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                            iMin2 = i15;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                                i18 = 5;
                                                i24 = i18;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i29 == 2) {
                                    if ((c2454rb3 instanceof C2399q5) || (c2454rb4 instanceof C2399q5)) {
                                        c2244mo2 = c2244mo;
                                        i12 = i29;
                                        c0256Fy5 = c0256FyM4572k3;
                                        c0256Fy6 = c0256FyM4572k4;
                                        c0256Fy7 = c0256FyM4572k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        c2244mo2 = c2244mo;
                                        i12 = i29;
                                        c0256Fy5 = c0256FyM4572k3;
                                        c0256Fy6 = c0256FyM4572k4;
                                        c0256Fy7 = c0256FyM4572k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        c0256Fy4 = c0256Fy2;
                                        if (z19) {
                                        }
                                    }
                                } else if (i29 == 1) {
                                    c2244mo2 = c2244mo;
                                    i12 = i29;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c0256Fy6 = c0256FyM4572k4;
                                    c0256Fy7 = c0256FyM4572k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i29 == 3) {
                                    i12 = i29;
                                    if (this.f8580A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i20 = 5;
                                                i21 = 4;
                                            } else {
                                                i20 = 8;
                                                i21 = 5;
                                            }
                                            i15 = i21;
                                            c0256Fy5 = c0256FyM4572k3;
                                            c0256Fy6 = c0256FyM4572k4;
                                            c0256Fy7 = c0256FyM4572k5;
                                            i13 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            c0256Fy4 = c0256Fy2;
                                        } else if (i26 > 0) {
                                            c2244mo2 = c2244mo;
                                            c0256Fy4 = c0256Fy2;
                                            c0256Fy5 = c0256FyM4572k3;
                                            c0256Fy6 = c0256FyM4572k4;
                                            c0256Fy7 = c0256FyM4572k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i26 != 0 || i11 != 0) {
                                                c2244mo2 = c2244mo;
                                                c0256Fy4 = c0256Fy2;
                                                c0256Fy5 = c0256FyM4572k3;
                                                c0256Fy6 = c0256FyM4572k4;
                                                c0256Fy7 = c0256FyM4572k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i20 = (c2454rb3 == c2454rb5 || c2454rb4 == c2454rb5) ? 5 : 4;
                                                c0256Fy4 = c0256Fy2;
                                                c0256Fy5 = c0256FyM4572k3;
                                                c0256Fy6 = c0256FyM4572k4;
                                                c0256Fy7 = c0256FyM4572k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                c2244mo2 = c2244mo;
                                                c0256Fy4 = c0256Fy2;
                                                c0256Fy5 = c0256FyM4572k3;
                                                c0256Fy6 = c0256FyM4572k4;
                                                c0256Fy7 = c0256FyM4572k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                        }
                                        i14 = i20;
                                        c2244mo2 = c2244mo;
                                        if (z19) {
                                        }
                                    } else if (z9) {
                                        c2244mo2 = c2244mo;
                                        c0256Fy4 = c0256Fy2;
                                        c0256Fy5 = c0256FyM4572k3;
                                        c0256Fy6 = c0256FyM4572k4;
                                        c0256Fy7 = c0256FyM4572k5;
                                        i14 = 8;
                                        i13 = z2 ? 5 : 4;
                                    } else {
                                        c2244mo2 = c2244mo;
                                        c0256Fy4 = c0256Fy2;
                                        c0256Fy5 = c0256FyM4572k3;
                                        c0256Fy6 = c0256FyM4572k4;
                                        c0256Fy7 = c0256FyM4572k5;
                                        i14 = 8;
                                        i13 = 8;
                                    }
                                    i15 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                } else {
                                    i12 = i29;
                                    c2244mo2 = c2244mo;
                                    c0256Fy4 = c0256Fy2;
                                    c0256Fy5 = c0256FyM4572k3;
                                    c0256Fy6 = c0256FyM4572k4;
                                    c0256Fy7 = c0256FyM4572k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i15 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                c0256Fy4 = c0256Fy2;
                                if (z19) {
                                }
                            }
                            if (z22 && z17) {
                                int iM2384e2 = c1259cb4.f4270f != null ? c1259cb4.m2384e() : 0;
                                if (c0256Fy3 != c0256Fy2) {
                                    c2244mo2.m4567f(c0256Fy2, c0256Fy6, iM2384e2, i24);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i29;
                        if (c0256FyM4572k5.f834f && c0256Fy3.f834f) {
                            c2244mo.m4563b(c0256FyM4572k3, c0256FyM4572k5, c1259cb.m2384e(), f, c0256Fy3, c0256FyM4572k4, c1259cb2.m2384e(), 8);
                            if (z2 && z17) {
                                int iM2384e3 = c1259cb2.f4270f != null ? c1259cb2.m2384e() : 0;
                                if (c0256Fy3 != c0256Fy2) {
                                    c2244mo.m4567f(c0256Fy2, c0256FyM4572k4, iM2384e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        c2244mo2 = c2244mo;
                        c0256Fy4 = c0256Fy2;
                        c0256Fy5 = c0256FyM4572k3;
                        c0256Fy6 = c0256FyM4572k4;
                        c0256Fy7 = c0256FyM4572k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    c0256Fy3 = c0256FyM4572k6;
                    c2244mo2.m4566e(c0256FyM4572k4, c0256Fy3, -c1259cb2.m2384e(), 8);
                    if (z2) {
                        c2244mo2.m4567f(c0256FyM4572k3, c0256Fy, 0, 5);
                        c1259cb4 = c1259cb2;
                        i18 = 5;
                        c0256Fy6 = c0256FyM4572k4;
                        z17 = z16;
                        z22 = z2;
                        i24 = i18;
                        if (z22) {
                        }
                    }
                }
                c1259cb4 = c1259cb2;
                c0256Fy6 = c0256FyM4572k4;
                z17 = z16;
            } else {
                c1259cb4 = c1259cb2;
                c0256Fy6 = c0256FyM4572k4;
                z17 = z16;
                c0256Fy3 = c0256FyM4572k6;
                z22 = z2;
                i24 = (z2 && (c1259cb.f4270f.f4268d instanceof C2399q5)) ? 8 : 5;
                if (z22) {
                }
            }
            i18 = 5;
            z22 = z2;
            i24 = i18;
            if (z22) {
            }
        } else if (z5) {
            c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, 0, 3);
            if (i4 > 0) {
                c2244mo2.m4567f(c0256FyM4572k4, c0256FyM4572k3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                c2244mo2.m4568g(c0256FyM4572k4, c0256FyM4572k3, i5, i10);
            }
        } else {
            c2244mo2.m4566e(c0256FyM4572k4, c0256FyM4572k3, iMin, i10);
        }
        z16 = z4;
        i11 = i25;
        if (z11) {
        }
        boolean z292 = z16;
        if (i28 >= 2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4928e(int i, C2454rb c2454rb, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    m4928e(2, c2454rb, i2, 0);
                    m4928e(4, c2454rb, i2, 0);
                    mo4340i(7).m2380a(c2454rb.mo4340i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        m4928e(3, c2454rb, i2, 0);
                        m4928e(5, c2454rb, i2, 0);
                        mo4340i(7).m2380a(c2454rb.mo4340i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C1259cb c1259cbMo4340i = mo4340i(2);
            C1259cb c1259cbMo4340i2 = mo4340i(4);
            C1259cb c1259cbMo4340i3 = mo4340i(3);
            C1259cb c1259cbMo4340i4 = mo4340i(5);
            boolean z2 = true;
            if ((c1259cbMo4340i == null || !c1259cbMo4340i.m2387h()) && (c1259cbMo4340i2 == null || !c1259cbMo4340i2.m2387h())) {
                m4928e(2, c2454rb, 2, 0);
                m4928e(4, c2454rb, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c1259cbMo4340i3 == null || !c1259cbMo4340i3.m2387h()) && (c1259cbMo4340i4 == null || !c1259cbMo4340i4.m2387h())) {
                m4928e(3, c2454rb, 3, 0);
                m4928e(5, c2454rb, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo4340i(7).m2380a(c2454rb.mo4340i(7), 0);
                return;
            } else if (z) {
                mo4340i(8).m2380a(c2454rb.mo4340i(8), 0);
                return;
            } else {
                if (z2) {
                    mo4340i(9).m2380a(c2454rb.mo4340i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C1259cb c1259cbMo4340i5 = mo4340i(2);
            C1259cb c1259cbMo4340i6 = c2454rb.mo4340i(i2);
            C1259cb c1259cbMo4340i7 = mo4340i(4);
            c1259cbMo4340i5.m2380a(c1259cbMo4340i6, 0);
            c1259cbMo4340i7.m2380a(c1259cbMo4340i6, 0);
            mo4340i(8).m2380a(c1259cbMo4340i6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C1259cb c1259cbMo4340i8 = c2454rb.mo4340i(i2);
            mo4340i(3).m2380a(c1259cbMo4340i8, 0);
            mo4340i(5).m2380a(c1259cbMo4340i8, 0);
            mo4340i(9).m2380a(c1259cbMo4340i8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            mo4340i(2).m2380a(c2454rb.mo4340i(2), 0);
            mo4340i(4).m2380a(c2454rb.mo4340i(4), 0);
            mo4340i(8).m2380a(c2454rb.mo4340i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            mo4340i(3).m2380a(c2454rb.mo4340i(3), 0);
            mo4340i(5).m2380a(c2454rb.mo4340i(5), 0);
            mo4340i(9).m2380a(c2454rb.mo4340i(i2), 0);
            return;
        }
        C1259cb c1259cbMo4340i9 = mo4340i(i);
        C1259cb c1259cbMo4340i10 = c2454rb.mo4340i(i2);
        if (c1259cbMo4340i9.m2388i(c1259cbMo4340i10)) {
            if (i == 6) {
                C1259cb c1259cbMo4340i11 = mo4340i(3);
                C1259cb c1259cbMo4340i12 = mo4340i(5);
                if (c1259cbMo4340i11 != null) {
                    c1259cbMo4340i11.m2389j();
                }
                if (c1259cbMo4340i12 != null) {
                    c1259cbMo4340i12.m2389j();
                }
            } else if (i == 3 || i == 5) {
                C1259cb c1259cbMo4340i13 = mo4340i(6);
                if (c1259cbMo4340i13 != null) {
                    c1259cbMo4340i13.m2389j();
                }
                C1259cb c1259cbMo4340i14 = mo4340i(7);
                if (c1259cbMo4340i14.f4270f != c1259cbMo4340i10) {
                    c1259cbMo4340i14.m2389j();
                }
                C1259cb c1259cbM2385f = mo4340i(i).m2385f();
                C1259cb c1259cbMo4340i15 = mo4340i(9);
                if (c1259cbMo4340i15.m2387h()) {
                    c1259cbM2385f.m2389j();
                    c1259cbMo4340i15.m2389j();
                }
            } else if (i == 2 || i == 4) {
                C1259cb c1259cbMo4340i16 = mo4340i(7);
                if (c1259cbMo4340i16.f4270f != c1259cbMo4340i10) {
                    c1259cbMo4340i16.m2389j();
                }
                C1259cb c1259cbM2385f2 = mo4340i(i).m2385f();
                C1259cb c1259cbMo4340i17 = mo4340i(8);
                if (c1259cbMo4340i17.m2387h()) {
                    c1259cbM2385f2.m2389j();
                    c1259cbMo4340i17.m2389j();
                }
            }
            c1259cbMo4340i9.m2380a(c1259cbMo4340i10, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4929f(C1259cb c1259cb, C1259cb c1259cb2, int i) {
        if (c1259cb.f4268d == this) {
            m4928e(c1259cb.f4269e, c1259cb2.f4268d, c1259cb2.f4269e, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4930g(C2244mo c2244mo) {
        c2244mo.m4572k(this.f8588I);
        c2244mo.m4572k(this.f8589J);
        c2244mo.m4572k(this.f8590K);
        c2244mo.m4572k(this.f8591L);
        if (this.f8607a0 > 0) {
            c2244mo.m4572k(this.f8592M);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4931h() {
        if (this.f8612d == null) {
            C0757Rk c0757Rk = new C0757Rk(this);
            c0757Rk.f5064h.f9114e = 4;
            c0757Rk.f5065i.f9114e = 5;
            c0757Rk.f5062f = 0;
            this.f8612d = c0757Rk;
        }
        if (this.f8614e == null) {
            C0830TD c0830td = new C0830TD(this);
            C2628vd c2628vd = new C2628vd(c0830td);
            c0830td.f2621k = c2628vd;
            c0830td.f2622l = null;
            c0830td.f5064h.f9114e = 6;
            c0830td.f5065i.f9114e = 7;
            c2628vd.f9114e = 8;
            c0830td.f5062f = 1;
            this.f8614e = c0830td;
        }
    }

    /* JADX INFO: renamed from: i */
    public C1259cb mo4340i(int i) {
        switch (AbstractC0213Ey.m424v(i)) {
            case 0:
                return null;
            case 1:
                return this.f8588I;
            case 2:
                return this.f8589J;
            case 3:
                return this.f8590K;
            case 4:
                return this.f8591L;
            case 5:
                return this.f8592M;
            case 6:
                return this.f8595P;
            case 7:
                return this.f8593N;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return this.f8594O;
            default:
                throw new AssertionError(AbstractC0213Ey.m423u(i));
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m4932j(int i) {
        int[] iArr = this.f8637p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m4933k() {
        if (this.f8619g0 == 8) {
            return 0;
        }
        return this.f8601V;
    }

    /* JADX INFO: renamed from: l */
    public final C2454rb m4934l(int i) {
        C1259cb c1259cb;
        C1259cb c1259cb2;
        if (i != 0) {
            if (i == 1 && (c1259cb2 = (c1259cb = this.f8591L).f4270f) != null && c1259cb2.f4270f == c1259cb) {
                return c1259cb2.f4268d;
            }
            return null;
        }
        C1259cb c1259cb3 = this.f8590K;
        C1259cb c1259cb4 = c1259cb3.f4270f;
        if (c1259cb4 == null || c1259cb4.f4270f != c1259cb3) {
            return null;
        }
        return c1259cb4.f4268d;
    }

    /* JADX INFO: renamed from: m */
    public final C2454rb m4935m(int i) {
        C1259cb c1259cb;
        C1259cb c1259cb2;
        if (i != 0) {
            if (i == 1 && (c1259cb2 = (c1259cb = this.f8589J).f4270f) != null && c1259cb2.f4270f == c1259cb) {
                return c1259cb2.f4268d;
            }
            return null;
        }
        C1259cb c1259cb3 = this.f8588I;
        C1259cb c1259cb4 = c1259cb3.f4270f;
        if (c1259cb4 == null || c1259cb4.f4270f != c1259cb3) {
            return null;
        }
        return c1259cb4.f4268d;
    }

    /* JADX INFO: renamed from: n */
    public void mo4936n(StringBuilder sb) {
        sb.append("  " + this.f8624j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f8600U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f8601V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f8604Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f8605Z);
        sb.append("\n");
        m4913p(sb, "left", this.f8588I);
        m4913p(sb, "top", this.f8589J);
        m4913p(sb, "right", this.f8590K);
        m4913p(sb, "bottom", this.f8591L);
        m4913p(sb, "baseline", this.f8592M);
        m4913p(sb, "centerX", this.f8593N);
        m4913p(sb, "centerY", this.f8594O);
        int i = this.f8600U;
        int i2 = this.f8609b0;
        int[] iArr = this.f8582C;
        int i3 = iArr[0];
        int i4 = this.f8642u;
        int i5 = this.f8639r;
        float f = this.f8644w;
        int[] iArr2 = this.f8637p0;
        int i6 = iArr2[0];
        float[] fArr = this.f8627k0;
        float f2 = fArr[0];
        m4912o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.f8601V;
        int i8 = this.f8611c0;
        int i9 = iArr[1];
        int i10 = this.f8645x;
        int i11 = this.f8640s;
        float f3 = this.f8647z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        m4912o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.f8602W;
        int i13 = this.f8603X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        m4911H(sb, "    horizontalBias", this.f8613d0, 0.5f);
        m4911H(sb, "    verticalBias", this.f8615e0, 0.5f);
        m4910G(this.f8623i0, 0, "    horizontalChainStyle", sb);
        m4910G(this.f8625j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    /* JADX INFO: renamed from: q */
    public final int m4937q() {
        if (this.f8619g0 == 8) {
            return 0;
        }
        return this.f8600U;
    }

    /* JADX INFO: renamed from: r */
    public final int m4938r() {
        C2454rb c2454rb = this.f8599T;
        return (c2454rb == null || !(c2454rb instanceof C2497sb)) ? this.f8604Y : ((C2497sb) c2454rb).f8781x0 + this.f8604Y;
    }

    /* JADX INFO: renamed from: s */
    public final int m4939s() {
        C2454rb c2454rb = this.f8599T;
        return (c2454rb == null || !(c2454rb instanceof C2497sb)) ? this.f8605Z : ((C2497sb) c2454rb).f8782y0 + this.f8605Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4940t(int i) {
        if (i == 0) {
            return (this.f8588I.f4270f != null ? 1 : 0) + (this.f8590K.f4270f != null ? 1 : 0) < 2;
        }
        if ((this.f8589J.f4270f != null ? 1 : 0) + (this.f8591L.f4270f != null ? 1 : 0) + (this.f8592M.f4270f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f8621h0 != null ? AbstractC0213Ey.m410h(new StringBuilder("id: "), this.f8621h0, " ") : "");
        sb.append("(");
        sb.append(this.f8604Y);
        sb.append(", ");
        sb.append(this.f8605Z);
        sb.append(") - (");
        sb.append(this.f8600U);
        sb.append(" x ");
        return AbstractC0213Ey.m409g(sb, this.f8601V, ")");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4941u(int i, int i2) {
        C1259cb c1259cb;
        C1259cb c1259cb2;
        C1259cb c1259cb3;
        C1259cb c1259cb4;
        if (i == 0) {
            C1259cb c1259cb5 = this.f8588I;
            C1259cb c1259cb6 = c1259cb5.f4270f;
            if (c1259cb6 == null || !c1259cb6.f4267c || (c1259cb4 = (c1259cb3 = this.f8590K).f4270f) == null || !c1259cb4.f4267c) {
                return false;
            }
            return (c1259cb4.m2383d() - c1259cb3.m2384e()) - (c1259cb5.m2384e() + c1259cb5.f4270f.m2383d()) >= i2;
        }
        C1259cb c1259cb7 = this.f8589J;
        C1259cb c1259cb8 = c1259cb7.f4270f;
        if (c1259cb8 == null || !c1259cb8.f4267c || (c1259cb2 = (c1259cb = this.f8591L).f4270f) == null || !c1259cb2.f4267c) {
            return false;
        }
        return (c1259cb2.m2383d() - c1259cb.m2384e()) - (c1259cb7.m2384e() + c1259cb7.f4270f.m2383d()) >= i2;
    }

    /* JADX INFO: renamed from: v */
    public final void m4942v(int i, int i2, int i3, int i4, C2454rb c2454rb) {
        mo4340i(i).m2381b(c2454rb.mo4340i(i2), i3, i4, true);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4943w(int i) {
        C1259cb c1259cb;
        C1259cb c1259cb2;
        int i2 = i * 2;
        C1259cb[] c1259cbArr = this.f8596Q;
        C1259cb c1259cb3 = c1259cbArr[i2];
        C1259cb c1259cb4 = c1259cb3.f4270f;
        return (c1259cb4 == null || c1259cb4.f4270f == c1259cb3 || (c1259cb2 = (c1259cb = c1259cbArr[i2 + 1]).f4270f) == null || c1259cb2.f4270f != c1259cb) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4944x() {
        C1259cb c1259cb = this.f8588I;
        C1259cb c1259cb2 = c1259cb.f4270f;
        if (c1259cb2 != null && c1259cb2.f4270f == c1259cb) {
            return true;
        }
        C1259cb c1259cb3 = this.f8590K;
        C1259cb c1259cb4 = c1259cb3.f4270f;
        return c1259cb4 != null && c1259cb4.f4270f == c1259cb3;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4945y() {
        C1259cb c1259cb = this.f8589J;
        C1259cb c1259cb2 = c1259cb.f4270f;
        if (c1259cb2 != null && c1259cb2.f4270f == c1259cb) {
            return true;
        }
        C1259cb c1259cb3 = this.f8591L;
        C1259cb c1259cb4 = c1259cb3.f4270f;
        return c1259cb4 != null && c1259cb4.f4270f == c1259cb3;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4946z() {
        return this.f8618g && this.f8619g0 != 8;
    }
}
