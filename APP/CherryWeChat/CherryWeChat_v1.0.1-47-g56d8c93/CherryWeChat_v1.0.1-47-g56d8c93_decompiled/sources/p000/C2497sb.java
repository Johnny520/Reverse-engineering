package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: sb */
/* JADX INFO: loaded from: classes.dex */
public final class C2497sb extends C2454rb {

    /* JADX INFO: renamed from: A0 */
    public int f8762A0;

    /* JADX INFO: renamed from: B0 */
    public C2178l7[] f8763B0;

    /* JADX INFO: renamed from: C0 */
    public C2178l7[] f8764C0;

    /* JADX INFO: renamed from: D0 */
    public int f8765D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f8766E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f8767F0;

    /* JADX INFO: renamed from: G0 */
    public WeakReference f8768G0;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f8769H0;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f8770I0;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f8771J0;

    /* JADX INFO: renamed from: K0 */
    public final HashSet f8772K0;

    /* JADX INFO: renamed from: L0 */
    public final C0178E5 f8773L0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f8774q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final C2656w4 f8775r0 = new C2656w4(this);

    /* JADX INFO: renamed from: s0 */
    public final C2585ud f8776s0;

    /* JADX INFO: renamed from: t0 */
    public int f8777t0;

    /* JADX INFO: renamed from: u0 */
    public C1496hb f8778u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f8779v0;

    /* JADX INFO: renamed from: w0 */
    public final C2244mo f8780w0;

    /* JADX INFO: renamed from: x0 */
    public int f8781x0;

    /* JADX INFO: renamed from: y0 */
    public int f8782y0;

    /* JADX INFO: renamed from: z0 */
    public int f8783z0;

    public C2497sb() {
        C2585ud c2585ud = new C2585ud();
        c2585ud.f8948b = true;
        c2585ud.f8949c = true;
        c2585ud.f8951e = new ArrayList();
        new ArrayList();
        c2585ud.f8952f = null;
        c2585ud.f8953g = new C0178E5();
        c2585ud.f8954h = new ArrayList();
        c2585ud.f8947a = this;
        c2585ud.f8950d = this;
        this.f8776s0 = c2585ud;
        this.f8778u0 = null;
        this.f8779v0 = false;
        this.f8780w0 = new C2244mo();
        this.f8783z0 = 0;
        this.f8762A0 = 0;
        this.f8763B0 = new C2178l7[4];
        this.f8764C0 = new C2178l7[4];
        this.f8765D0 = 257;
        this.f8766E0 = false;
        this.f8767F0 = false;
        this.f8768G0 = null;
        this.f8769H0 = null;
        this.f8770I0 = null;
        this.f8771J0 = null;
        this.f8772K0 = new HashSet();
        this.f8773L0 = new C0178E5();
    }

    /* JADX INFO: renamed from: V */
    public static void m4979V(C2454rb c2454rb, C1496hb c1496hb, C0178E5 c0178e5) {
        int i;
        int i2;
        if (c1496hb == null) {
            return;
        }
        int i3 = c2454rb.f8619g0;
        int[] iArr = c2454rb.f8641t;
        if (i3 == 8 || (c2454rb instanceof C2150kk) || (c2454rb instanceof C2399q5)) {
            c0178e5.f524e = 0;
            c0178e5.f525f = 0;
            return;
        }
        int[] iArr2 = c2454rb.f8637p0;
        c0178e5.f520a = iArr2[0];
        c0178e5.f521b = iArr2[1];
        c0178e5.f522c = c2454rb.m4937q();
        c0178e5.f523d = c2454rb.m4933k();
        c0178e5.f528i = false;
        c0178e5.f529j = 0;
        boolean z = c0178e5.f520a == 3;
        boolean z2 = c0178e5.f521b == 3;
        boolean z3 = z && c2454rb.f8602W > 0.0f;
        boolean z4 = z2 && c2454rb.f8602W > 0.0f;
        if (z && c2454rb.m4940t(0) && c2454rb.f8639r == 0 && !z3) {
            c0178e5.f520a = 2;
            if (z2 && c2454rb.f8640s == 0) {
                c0178e5.f520a = 1;
            }
            z = false;
        }
        if (z2 && c2454rb.m4940t(1) && c2454rb.f8640s == 0 && !z4) {
            c0178e5.f521b = 2;
            if (z && c2454rb.f8639r == 0) {
                c0178e5.f521b = 1;
            }
            z2 = false;
        }
        if (c2454rb.mo4334A()) {
            c0178e5.f520a = 1;
            z = false;
        }
        if (c2454rb.mo4335B()) {
            c0178e5.f521b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c0178e5.f520a = 1;
            } else if (!z2) {
                if (c0178e5.f521b == 1) {
                    i2 = c0178e5.f523d;
                } else {
                    c0178e5.f520a = 2;
                    c1496hb.m2865b(c2454rb, c0178e5);
                    i2 = c0178e5.f525f;
                }
                c0178e5.f520a = 1;
                c0178e5.f522c = (int) (c2454rb.f8602W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c0178e5.f521b = 1;
            } else if (!z) {
                if (c0178e5.f520a == 1) {
                    i = c0178e5.f522c;
                } else {
                    c0178e5.f521b = 2;
                    c1496hb.m2865b(c2454rb, c0178e5);
                    i = c0178e5.f524e;
                }
                c0178e5.f521b = 1;
                if (c2454rb.f8603X == -1) {
                    c0178e5.f523d = (int) (i / c2454rb.f8602W);
                } else {
                    c0178e5.f523d = (int) (c2454rb.f8602W * i);
                }
            }
        }
        c1496hb.m2865b(c2454rb, c0178e5);
        c2454rb.m4924O(c0178e5.f524e);
        c2454rb.m4921L(c0178e5.f525f);
        c2454rb.f8584E = c0178e5.f527h;
        c2454rb.m4918I(c0178e5.f526g);
        c0178e5.f529j = 0;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: C */
    public final void mo4914C() {
        this.f8780w0.m4580t();
        this.f8781x0 = 0;
        this.f8782y0 = 0;
        this.f8774q0.clear();
        super.mo4914C();
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: F */
    public final void mo4917F(C2656w4 c2656w4) {
        super.mo4917F(c2656w4);
        int size = this.f8774q0.size();
        for (int i = 0; i < size; i++) {
            ((C2454rb) this.f8774q0.get(i)).mo4917F(c2656w4);
        }
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: P */
    public final void mo4925P(boolean z, boolean z2) {
        super.mo4925P(z, z2);
        int size = this.f8774q0.size();
        for (int i = 0; i < size; i++) {
            ((C2454rb) this.f8774q0.get(i)).mo4925P(z, z2);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m4980R(C2454rb c2454rb, int i) {
        if (i == 0) {
            int i2 = this.f8783z0 + 1;
            C2178l7[] c2178l7Arr = this.f8764C0;
            if (i2 >= c2178l7Arr.length) {
                this.f8764C0 = (C2178l7[]) Arrays.copyOf(c2178l7Arr, c2178l7Arr.length * 2);
            }
            C2178l7[] c2178l7Arr2 = this.f8764C0;
            int i3 = this.f8783z0;
            c2178l7Arr2[i3] = new C2178l7(c2454rb, 0, this.f8779v0);
            this.f8783z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f8762A0 + 1;
            C2178l7[] c2178l7Arr3 = this.f8763B0;
            if (i4 >= c2178l7Arr3.length) {
                this.f8763B0 = (C2178l7[]) Arrays.copyOf(c2178l7Arr3, c2178l7Arr3.length * 2);
            }
            C2178l7[] c2178l7Arr4 = this.f8763B0;
            int i5 = this.f8762A0;
            c2178l7Arr4[i5] = new C2178l7(c2454rb, 1, this.f8779v0);
            this.f8762A0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m4981S(C2244mo c2244mo) {
        C2497sb c2497sb;
        C2244mo c2244mo2;
        boolean zM4984W = m4984W(64);
        mo813b(c2244mo, zM4984W);
        int size = this.f8774q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2454rb c2454rb = (C2454rb) this.f8774q0.get(i);
            boolean[] zArr = c2454rb.f8598S;
            zArr[0] = false;
            zArr[1] = false;
            if (c2454rb instanceof C2399q5) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C2454rb c2454rb2 = (C2454rb) this.f8774q0.get(i2);
                if (c2454rb2 instanceof C2399q5) {
                    C2399q5 c2399q5 = (C2399q5) c2454rb2;
                    for (int i3 = 0; i3 < c2399q5.f8966r0; i3++) {
                        C2454rb c2454rb3 = c2399q5.f8965q0[i3];
                        if (c2399q5.f8408t0 || c2454rb3.mo4339c()) {
                            int i4 = c2399q5.f8407s0;
                            if (i4 == 0 || i4 == 1) {
                                c2454rb3.f8598S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c2454rb3.f8598S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f8772K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C2454rb c2454rb4 = (C2454rb) this.f8774q0.get(i5);
            c2454rb4.getClass();
            boolean z2 = c2454rb4 instanceof C0368Ih;
            if (z2 || (c2454rb4 instanceof C2150kk)) {
                if (z2) {
                    hashSet.add(c2454rb4);
                } else {
                    c2454rb4.mo813b(c2244mo, zM4984W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0368Ih c0368Ih = (C0368Ih) ((C2454rb) it.next());
                for (int i6 = 0; i6 < c0368Ih.f8966r0; i6++) {
                    if (hashSet.contains(c0368Ih.f8965q0[i6])) {
                        c0368Ih.mo813b(c2244mo, zM4984W);
                        hashSet.remove(c0368Ih);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2454rb) it2.next()).mo813b(c2244mo, zM4984W);
                }
                hashSet.clear();
            }
        }
        if (C2244mo.f7925q) {
            HashSet<C2454rb> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C2454rb c2454rb5 = (C2454rb) this.f8774q0.get(i7);
                c2454rb5.getClass();
                if (!(c2454rb5 instanceof C0368Ih) && !(c2454rb5 instanceof C2150kk)) {
                    hashSet2.add(c2454rb5);
                }
            }
            c2497sb = this;
            c2244mo2 = c2244mo;
            c2497sb.m4926a(this, c2244mo2, hashSet2, this.f8637p0[0] == 2 ? 0 : 1, false);
            for (C2454rb c2454rb6 : hashSet2) {
                AbstractC0714Qj.m1486h(this, c2244mo2, c2454rb6);
                c2454rb6.mo813b(c2244mo2, zM4984W);
            }
        } else {
            c2497sb = this;
            c2244mo2 = c2244mo;
            for (int i8 = 0; i8 < size; i8++) {
                C2454rb c2454rb7 = (C2454rb) c2497sb.f8774q0.get(i8);
                if (c2454rb7 instanceof C2497sb) {
                    int[] iArr = c2454rb7.f8637p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c2454rb7.m4922M(1);
                    }
                    if (i10 == 2) {
                        c2454rb7.m4923N(1);
                    }
                    c2454rb7.mo813b(c2244mo2, zM4984W);
                    if (i9 == 2) {
                        c2454rb7.m4922M(i9);
                    }
                    if (i10 == 2) {
                        c2454rb7.m4923N(i10);
                    }
                } else {
                    AbstractC0714Qj.m1486h(this, c2244mo2, c2454rb7);
                    if (!(c2454rb7 instanceof C0368Ih) && !(c2454rb7 instanceof C2150kk)) {
                        c2454rb7.mo813b(c2244mo2, zM4984W);
                    }
                }
            }
        }
        if (c2497sb.f8783z0 > 0) {
            AbstractC1406fG.m2681F(this, c2244mo2, null, 0);
        }
        if (c2497sb.f8762A0 > 0) {
            AbstractC1406fG.m2681F(this, c2244mo2, null, 1);
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4982T(int i, boolean z) {
        boolean z2;
        boolean z3;
        C2585ud c2585ud = this.f8776s0;
        ArrayList<AbstractC1449gF> arrayList = c2585ud.f8951e;
        C2497sb c2497sb = c2585ud.f8947a;
        boolean z4 = false;
        int iM4932j = c2497sb.m4932j(0);
        int[] iArr = c2497sb.f8637p0;
        int iM4932j2 = c2497sb.m4932j(1);
        int iM4938r = c2497sb.m4938r();
        int iM4939s = c2497sb.m4939s();
        if (z && (iM4932j == 2 || iM4932j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                AbstractC1449gF abstractC1449gF = (AbstractC1449gF) it.next();
                if (abstractC1449gF.f5062f == i && !abstractC1449gF.mo1550k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iM4932j == 2) {
                    c2497sb.m4922M(1);
                    c2497sb.m4924O(c2585ud.m5090d(c2497sb, 0));
                    c2497sb.f8612d.f5061e.mo1539d(c2497sb.m4937q());
                }
            } else if (z3 && iM4932j2 == 2) {
                c2497sb.m4923N(1);
                c2497sb.m4921L(c2585ud.m5090d(c2497sb, 1));
                c2497sb.f8614e.f5061e.mo1539d(c2497sb.m4933k());
            }
        }
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM4937q = c2497sb.m4937q() + iM4938r;
                c2497sb.f8612d.f5065i.mo1539d(iM4937q);
                c2497sb.f8612d.f5061e.mo1539d(iM4937q - iM4938r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM4933k = c2497sb.m4933k() + iM4939s;
                c2497sb.f8614e.f5065i.mo1539d(iM4933k);
                c2497sb.f8614e.f5061e.mo1539d(iM4933k - iM4939s);
                z2 = true;
            }
            z2 = false;
        }
        c2585ud.m5093g();
        for (AbstractC1449gF abstractC1449gF2 : arrayList) {
            if (abstractC1449gF2.f5062f == i && (abstractC1449gF2.f5058b != c2497sb || abstractC1449gF2.f5063g)) {
                abstractC1449gF2.mo1548e();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1449gF abstractC1449gF3 = (AbstractC1449gF) it2.next();
            if (abstractC1449gF3.f5062f == i && (z2 || abstractC1449gF3.f5058b != c2497sb)) {
                if (!abstractC1449gF3.f5064h.f9119j || !abstractC1449gF3.f5065i.f9119j || (!(abstractC1449gF3 instanceof C2221m7) && !abstractC1449gF3.f5061e.f9119j)) {
                    break;
                }
            }
        }
        c2497sb.m4922M(iM4932j);
        c2497sb.m4923N(iM4932j2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x083b A[LOOP:14: B:497:0x0839->B:498:0x083b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [rb, sb] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v94, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v80, types: [int] */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4983U() {
        boolean[] zArr;
        ?? r21;
        C1259cb c1259cb;
        int i;
        boolean z;
        char c;
        int i2;
        ?? r13;
        boolean z2;
        boolean z3;
        C1259cb c1259cb2;
        boolean z4;
        boolean z5;
        int iMax;
        ?? r10;
        ?? r17;
        boolean z6;
        int iMax2;
        ?? r0;
        boolean z7;
        boolean z8;
        ?? r02;
        ?? r132;
        int i3;
        boolean z9;
        int i4;
        int iMax3;
        boolean z10;
        int iM2678b;
        int i5;
        ArrayList arrayList;
        C1405fF c1405fF;
        C1405fF c1405fF2;
        boolean z11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C1496hb c1496hb;
        ArrayList arrayList4;
        int i6;
        boolean z12;
        boolean[] zArr2 = AbstractC0714Qj.f2297d;
        this.f8604Y = 0;
        this.f8605Z = 0;
        this.f8766E0 = false;
        this.f8767F0 = false;
        int size = this.f8774q0.size();
        int iMax4 = Math.max(0, m4937q());
        int iMax5 = Math.max(0, m4933k());
        int[] iArr = this.f8637p0;
        int i7 = iArr[1];
        int i8 = iArr[0];
        int i9 = this.f8777t0;
        C1259cb c1259cb3 = this.f8589J;
        C1259cb c1259cb4 = this.f8588I;
        if (i9 == 0 && AbstractC0714Qj.m1492n(this.f8765D0, 1)) {
            C1496hb c1496hb2 = this.f8778u0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            m4916E();
            ArrayList arrayList5 = this.f8774q0;
            int size2 = arrayList5.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((C2454rb) arrayList5.get(i12)).m4916E();
            }
            boolean z13 = this.f8779v0;
            zArr = zArr2;
            if (i10 == 1) {
                m4919J(0, m4937q());
            } else {
                c1259cb4.m2391l(0);
                this.f8604Y = 0;
            }
            int i13 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i13 < size2) {
                int i14 = i13;
                C2454rb c2454rb = (C2454rb) arrayList5.get(i13);
                int[] iArr2 = iArr;
                if (c2454rb instanceof C2150kk) {
                    C2150kk c2150kk = (C2150kk) c2454rb;
                    z12 = z14;
                    if (c2150kk.f7522u0 == 1) {
                        int i15 = c2150kk.f7519r0;
                        if (i15 != -1) {
                            c2150kk.m4337R(i15);
                        } else if (c2150kk.f7520s0 != -1 && mo4334A()) {
                            c2150kk.m4337R(m4937q() - c2150kk.f7520s0);
                        } else if (mo4334A()) {
                            c2150kk.m4337R((int) ((c2150kk.f7518q0 * m4937q()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else {
                    z12 = z14;
                    if ((c2454rb instanceof C2399q5) && ((C2399q5) c2454rb).m4836U() == 0) {
                        z14 = z12;
                        z15 = true;
                    }
                    i13 = i14 + 1;
                    iArr = iArr2;
                }
                z14 = z12;
                i13 = i14 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z14) {
                for (int i16 = 0; i16 < size2; i16 = i6 + 1) {
                    C2454rb c2454rb2 = (C2454rb) arrayList5.get(i16);
                    if (c2454rb2 instanceof C2150kk) {
                        C2150kk c2150kk2 = (C2150kk) c2454rb2;
                        i6 = i16;
                        if (c2150kk2.f7522u0 == 1) {
                            AbstractC0828TB.m1648q(0, c1496hb2, c2150kk2, z13);
                        }
                    } else {
                        i6 = i16;
                    }
                }
            }
            AbstractC0828TB.m1648q(0, c1496hb2, this, z13);
            if (z15) {
                for (int i17 = 0; i17 < size2; i17++) {
                    C2454rb c2454rb3 = (C2454rb) arrayList5.get(i17);
                    if (c2454rb3 instanceof C2399q5) {
                        C2399q5 c2399q5 = (C2399q5) c2454rb3;
                        if (c2399q5.m4836U() == 0 && c2399q5.m4835T()) {
                            AbstractC0828TB.m1648q(1, c1496hb2, c2399q5, z13);
                        }
                    }
                }
            }
            if (i11 == 1) {
                m4920K(0, m4933k());
            } else {
                c1259cb3.m2391l(0);
                this.f8605Z = 0;
            }
            int i18 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i18 < size2) {
                C2454rb c2454rb4 = (C2454rb) arrayList5.get(i18);
                int i19 = i18;
                if (c2454rb4 instanceof C2150kk) {
                    C2150kk c2150kk3 = (C2150kk) c2454rb4;
                    if (c2150kk3.f7522u0 == 0) {
                        int i20 = c2150kk3.f7519r0;
                        if (i20 != -1) {
                            c2150kk3.m4337R(i20);
                        } else if (c2150kk3.f7520s0 != -1 && mo4335B()) {
                            c2150kk3.m4337R(m4933k() - c2150kk3.f7520s0);
                        } else if (mo4335B()) {
                            c2150kk3.m4337R((int) ((c2150kk3.f7518q0 * m4933k()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else if ((c2454rb4 instanceof C2399q5) && ((C2399q5) c2454rb4).m4836U() == 1) {
                    z17 = true;
                }
                i18 = i19 + 1;
            }
            if (z16) {
                for (int i21 = 0; i21 < size2; i21++) {
                    C2454rb c2454rb5 = (C2454rb) arrayList5.get(i21);
                    if (c2454rb5 instanceof C2150kk) {
                        C2150kk c2150kk4 = (C2150kk) c2454rb5;
                        if (c2150kk4.f7522u0 == 0) {
                            AbstractC0828TB.m1633K(1, c1496hb2, c2150kk4);
                        }
                    }
                }
            }
            AbstractC0828TB.m1633K(0, c1496hb2, this);
            if (z17) {
                for (int i22 = 0; i22 < size2; i22++) {
                    C2454rb c2454rb6 = (C2454rb) arrayList5.get(i22);
                    if (c2454rb6 instanceof C2399q5) {
                        C2399q5 c2399q52 = (C2399q5) c2454rb6;
                        if (c2399q52.m4836U() == 1 && c2399q52.m4835T()) {
                            AbstractC0828TB.m1633K(1, c1496hb2, c2399q52);
                        }
                    }
                }
            }
            for (int i23 = 0; i23 < size2; i23++) {
                C2454rb c2454rb7 = (C2454rb) arrayList5.get(i23);
                if (c2454rb7.m4946z() && AbstractC0828TB.m1638e(c2454rb7)) {
                    m4979V(c2454rb7, c1496hb2, AbstractC0828TB.f2609a);
                    if (!(c2454rb7 instanceof C2150kk)) {
                        AbstractC0828TB.m1648q(0, c1496hb2, c2454rb7, z13);
                        AbstractC0828TB.m1633K(0, c1496hb2, c2454rb7);
                    } else if (((C2150kk) c2454rb7).f7522u0 == 0) {
                        AbstractC0828TB.m1633K(0, c1496hb2, c2454rb7);
                    } else {
                        AbstractC0828TB.m1648q(0, c1496hb2, c2454rb7, z13);
                    }
                }
            }
            for (int i24 = 0; i24 < size; i24++) {
                C2454rb c2454rb8 = (C2454rb) this.f8774q0.get(i24);
                if (c2454rb8.m4946z() && !(c2454rb8 instanceof C2150kk) && !(c2454rb8 instanceof C2399q5) && !(c2454rb8 instanceof C0368Ih) && !c2454rb8.f8585F) {
                    int iM4932j = c2454rb8.m4932j(0);
                    int iM4932j2 = c2454rb8.m4932j(1);
                    if (iM4932j != 3 || c2454rb8.f8639r == 1 || iM4932j2 != 3 || c2454rb8.f8640s == 1) {
                        m4979V(c2454rb8, this.f8778u0, new C0178E5());
                    }
                }
            }
        } else {
            zArr = zArr2;
            r21 = iArr;
        }
        C2244mo c2244mo = this.f8780w0;
        if (size > 2 && ((i8 == 2 || i7 == 2) && AbstractC0714Qj.m1492n(this.f8765D0, 1024))) {
            C1496hb c1496hb3 = this.f8778u0;
            ArrayList arrayList6 = this.f8774q0;
            int size3 = arrayList6.size();
            int i25 = 0;
            while (true) {
                if (i25 < size3) {
                    C2454rb c2454rb9 = (C2454rb) arrayList6.get(i25);
                    ?? r3 = r21[0];
                    ?? r6 = r21[1];
                    int i26 = i25;
                    int[] iArr3 = c2454rb9.f8637p0;
                    c1259cb = c1259cb4;
                    if (!AbstractC0148Dc.m290x(r3, r6, iArr3[0], iArr3[1]) || (c2454rb9 instanceof C0368Ih)) {
                        break;
                    }
                    i25 = i26 + 1;
                    c1259cb4 = c1259cb;
                } else {
                    c1259cb = c1259cb4;
                    int i27 = 0;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    while (i27 < size3) {
                        int i28 = i27;
                        C2454rb c2454rb10 = (C2454rb) arrayList6.get(i27);
                        ArrayList arrayList13 = arrayList7;
                        ?? r32 = r21[0];
                        ArrayList arrayList14 = arrayList8;
                        ?? r62 = r21[1];
                        ArrayList arrayList15 = arrayList9;
                        int[] iArr4 = c2454rb10.f8637p0;
                        ArrayList arrayList16 = arrayList10;
                        if (!AbstractC0148Dc.m290x(r32, r62, iArr4[0], iArr4[1])) {
                            m4979V(c2454rb10, c1496hb3, this.f8773L0);
                        }
                        boolean z18 = c2454rb10 instanceof C2150kk;
                        if (z18) {
                            C2150kk c2150kk5 = (C2150kk) c2454rb10;
                            if (c2150kk5.f7522u0 == 0) {
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(c2150kk5);
                            } else {
                                arrayList9 = arrayList15;
                            }
                            z11 = z18;
                            if (c2150kk5.f7522u0 == 1) {
                                arrayList2 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList2.add(c2150kk5);
                            } else {
                                arrayList2 = arrayList13;
                            }
                        } else {
                            z11 = z18;
                            arrayList2 = arrayList13;
                            arrayList9 = arrayList15;
                        }
                        if (!(c2454rb10 instanceof AbstractC2592uk)) {
                            arrayList3 = arrayList2;
                            c1496hb = c1496hb3;
                            arrayList8 = arrayList14;
                        } else if (c2454rb10 instanceof C2399q5) {
                            C2399q5 c2399q53 = (C2399q5) c2454rb10;
                            if (c2399q53.m4836U() == 0) {
                                arrayList4 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList4.add(c2399q53);
                            } else {
                                arrayList4 = arrayList14;
                            }
                            arrayList3 = arrayList2;
                            c1496hb = c1496hb3;
                            if (c2399q53.m4836U() == 1) {
                                ArrayList arrayList17 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList17.add(c2399q53);
                                arrayList16 = arrayList17;
                            }
                            arrayList8 = arrayList4;
                        } else {
                            arrayList3 = arrayList2;
                            c1496hb = c1496hb3;
                            AbstractC2592uk abstractC2592uk = (AbstractC2592uk) c2454rb10;
                            arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                            arrayList8.add(abstractC2592uk);
                            arrayList10 = arrayList16 == null ? new ArrayList() : arrayList16;
                            arrayList10.add(abstractC2592uk);
                            if (c2454rb10.f8588I.f4270f == null && c2454rb10.f8590K.f4270f == null && !z11 && !(c2454rb10 instanceof C2399q5)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(c2454rb10);
                                arrayList11 = arrayList18;
                            }
                            if (c2454rb10.f8589J.f4270f != null && c2454rb10.f8591L.f4270f == null && c2454rb10.f8592M.f4270f == null && !z11 && !(c2454rb10 instanceof C2399q5)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c2454rb10);
                                arrayList12 = arrayList19;
                            }
                            i27 = i28 + 1;
                            arrayList7 = arrayList3;
                            c1496hb3 = c1496hb;
                        }
                        arrayList10 = arrayList16;
                        if (c2454rb10.f8588I.f4270f == null) {
                            if (arrayList11 == null) {
                            }
                            ArrayList arrayList182 = arrayList11;
                            arrayList182.add(c2454rb10);
                            arrayList11 = arrayList182;
                        }
                        if (c2454rb10.f8589J.f4270f != null) {
                        }
                        i27 = i28 + 1;
                        arrayList7 = arrayList3;
                        c1496hb3 = c1496hb;
                    }
                    ArrayList arrayList20 = arrayList7;
                    ArrayList<AbstractC2592uk> arrayList21 = arrayList8;
                    ArrayList arrayList22 = arrayList9;
                    ArrayList<AbstractC2592uk> arrayList23 = arrayList10;
                    ArrayList<C1405fF> arrayList24 = new ArrayList();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            AbstractC0148Dc.m275i((C2150kk) it.next(), 0, arrayList24, null);
                        }
                    }
                    C1405fF c1405fF3 = null;
                    int i29 = 0;
                    if (arrayList21 != null) {
                        for (AbstractC2592uk abstractC2592uk2 : arrayList21) {
                            C1405fF c1405fFM275i = AbstractC0148Dc.m275i(abstractC2592uk2, i29, arrayList24, c1405fF3);
                            abstractC2592uk2.m5100R(i29, c1405fFM275i, arrayList24);
                            c1405fFM275i.m2677a(arrayList24);
                            c1405fF3 = null;
                            i29 = 0;
                        }
                    }
                    HashSet hashSet = mo4340i(2).f4265a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it2.next()).f4268d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet2 = mo4340i(4).f4265a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it3.next()).f4268d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet3 = mo4340i(7).f4265a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it4.next()).f4268d, 0, arrayList24, null);
                        }
                    }
                    C1405fF c1405fF4 = null;
                    if (arrayList11 != null) {
                        Iterator it5 = arrayList11.iterator();
                        while (it5.hasNext()) {
                            AbstractC0148Dc.m275i((C2454rb) it5.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it6 = arrayList22.iterator();
                        while (it6.hasNext()) {
                            AbstractC0148Dc.m275i((C2150kk) it6.next(), 1, arrayList24, null);
                        }
                    }
                    int i30 = 1;
                    if (arrayList23 != null) {
                        for (AbstractC2592uk abstractC2592uk3 : arrayList23) {
                            C1405fF c1405fFM275i2 = AbstractC0148Dc.m275i(abstractC2592uk3, i30, arrayList24, c1405fF4);
                            abstractC2592uk3.m5100R(i30, c1405fFM275i2, arrayList24);
                            c1405fFM275i2.m2677a(arrayList24);
                            c1405fF4 = null;
                            i30 = 1;
                        }
                    }
                    HashSet hashSet4 = mo4340i(3).f4265a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it7.next()).f4268d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet5 = mo4340i(6).f4265a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it8.next()).f4268d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet6 = mo4340i(5).f4265a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it9.next()).f4268d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet7 = mo4340i(7).f4265a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC0148Dc.m275i(((C1259cb) it10.next()).f4268d, 1, arrayList24, null);
                        }
                    }
                    boolean z19 = true;
                    if (arrayList12 != null) {
                        Iterator it11 = arrayList12.iterator();
                        while (it11.hasNext()) {
                            AbstractC0148Dc.m275i((C2454rb) it11.next(), 1, arrayList24, null);
                        }
                    }
                    int i31 = 0;
                    while (i31 < size3) {
                        C2454rb c2454rb11 = (C2454rb) arrayList6.get(i31);
                        int[] iArr5 = c2454rb11.f8637p0;
                        boolean z20 = z19;
                        if (iArr5[0] == 3 && iArr5[z20 ? 1 : 0] == 3) {
                            int i32 = c2454rb11.f8633n0;
                            int size4 = arrayList24.size();
                            int i33 = 0;
                            while (true) {
                                if (i33 >= size4) {
                                    i5 = i31;
                                    arrayList = arrayList6;
                                    c1405fF = null;
                                    break;
                                }
                                i5 = i31;
                                c1405fF = (C1405fF) arrayList24.get(i33);
                                arrayList = arrayList6;
                                if (i32 == c1405fF.f4979b) {
                                    break;
                                }
                                i33++;
                                arrayList6 = arrayList;
                                i31 = i5;
                            }
                            int i34 = c2454rb11.f8635o0;
                            int size5 = arrayList24.size();
                            int i35 = 0;
                            while (true) {
                                if (i35 >= size5) {
                                    c1405fF2 = null;
                                    break;
                                }
                                c1405fF2 = (C1405fF) arrayList24.get(i35);
                                if (i34 == c1405fF2.f4979b) {
                                    break;
                                } else {
                                    i35++;
                                }
                            }
                            if (c1405fF != null && c1405fF2 != null) {
                                c1405fF.m2679c(0, c1405fF2);
                                c1405fF2.f4980c = 2;
                                arrayList24.remove(c1405fF);
                            }
                        } else {
                            i5 = i31;
                            arrayList = arrayList6;
                        }
                        i31 = i5 + 1;
                        arrayList6 = arrayList;
                        z19 = true;
                    }
                    if (arrayList24.size() <= 1) {
                        break;
                    }
                    int i36 = 0;
                    if (r21[0] == 2) {
                        int i37 = 0;
                        C1405fF c1405fF5 = null;
                        for (C1405fF c1405fF6 : arrayList24) {
                            if (c1405fF6.f4980c != 1) {
                                int iM2678b2 = c1405fF6.m2678b(c2244mo, i36);
                                if (iM2678b2 > i37) {
                                    c1405fF5 = c1405fF6;
                                    i37 = iM2678b2;
                                }
                                i36 = 0;
                            }
                        }
                        if (c1405fF5 != null) {
                            m4922M(1);
                            m4924O(i37);
                        } else {
                            c1405fF5 = null;
                        }
                        if (r21[1] == 2) {
                            int i38 = 0;
                            C1405fF c1405fF7 = null;
                            for (C1405fF c1405fF8 : arrayList24) {
                                if (c1405fF8.f4980c != 0 && (iM2678b = c1405fF8.m2678b(c2244mo, 1)) > i38) {
                                    c1405fF7 = c1405fF8;
                                    i38 = iM2678b;
                                }
                            }
                            if (c1405fF7 != null) {
                                m4923N(1);
                                m4921L(i38);
                            } else {
                                c1405fF7 = null;
                            }
                            if (c1405fF5 != null || c1405fF7 != null) {
                                if (i8 == 2) {
                                    if (iMax4 >= m4937q() || iMax4 <= 0) {
                                        iMax4 = m4937q();
                                    } else {
                                        m4924O(iMax4);
                                        this.f8766E0 = true;
                                    }
                                }
                                if (i7 == 2) {
                                    if (iMax5 >= m4933k() || iMax5 <= 0) {
                                        iMax5 = m4933k();
                                    } else {
                                        m4921L(iMax5);
                                        this.f8767F0 = true;
                                    }
                                }
                                i = iMax4;
                                z = true;
                            }
                        }
                    }
                }
            }
            boolean z21 = !m4984W(64) || m4984W(128);
            c2244mo.getClass();
            c2244mo.f7933h = false;
            if (this.f8765D0 == 0 && z21) {
                c = 1;
                c2244mo.f7933h = true;
            } else {
                c = 1;
            }
            ArrayList arrayList25 = this.f8774q0;
            boolean z22 = r21[0] != 2 || r21[c] == 2;
            this.f8783z0 = 0;
            this.f8762A0 = 0;
            for (i2 = 0; i2 < size; i2++) {
                C2454rb c2454rb12 = (C2454rb) this.f8774q0.get(i2);
                if (c2454rb12 instanceof C2497sb) {
                    ((C2497sb) c2454rb12).m4983U();
                }
            }
            boolean zM4984W = m4984W(64);
            r13 = z;
            int i39 = 0;
            z2 = true;
            while (z2) {
                int i40 = i39 + 1;
                try {
                    c2244mo.m4580t();
                    this.f8783z0 = 0;
                    this.f8762A0 = 0;
                    m4930g(c2244mo);
                    for (int i41 = 0; i41 < size; i41++) {
                        ((C2454rb) this.f8774q0.get(i41)).m4930g(c2244mo);
                    }
                    m4981S(c2244mo);
                    try {
                        WeakReference weakReference = this.f8768G0;
                        if (weakReference == null || weakReference.get() == null) {
                            z3 = z22;
                        } else {
                            z3 = z22;
                            try {
                                c2244mo.m4567f(c2244mo.m4572k((C1259cb) this.f8768G0.get()), c2244mo.m4572k(c1259cb3), 0, 5);
                                this.f8768G0 = null;
                            } catch (Exception e) {
                                e = e;
                                z10 = true;
                                e.printStackTrace();
                                c1259cb2 = c1259cb3;
                                System.out.println("EXCEPTION : " + e);
                                z4 = z10;
                                if (z4) {
                                }
                                if (z3) {
                                    int iMax6 = 0;
                                    int iMax7 = 0;
                                    while (i4 < size) {
                                    }
                                    int iMax8 = Math.max(this.f8609b0, iMax7);
                                    iMax3 = Math.max(this.f8611c0, iMax6);
                                    r13 = r13;
                                    z5 = z5;
                                    if (i8 == 2) {
                                    }
                                    if (i7 == 2) {
                                        m4921L(iMax3);
                                        r21[1] = 2;
                                        r13 = 1;
                                        z5 = true;
                                    }
                                }
                                iMax = Math.max(this.f8609b0, m4937q());
                                if (iMax > m4937q()) {
                                }
                                iMax2 = Math.max(this.f8611c0, m4933k());
                                if (iMax2 > m4933k()) {
                                }
                                if (r0 == 0) {
                                }
                                r132 = r02;
                                i3 = 8;
                                z9 = z8;
                                if (i40 <= i3) {
                                }
                                i39 = i40;
                                z22 = z3;
                                c1259cb3 = c1259cb2;
                                r13 = r132;
                                z2 = z9;
                            }
                        }
                        WeakReference weakReference2 = this.f8770I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            c2244mo.m4567f(c2244mo.m4572k(this.f8591L), c2244mo.m4572k((C1259cb) this.f8770I0.get()), 0, 5);
                            this.f8770I0 = null;
                        }
                        WeakReference weakReference3 = this.f8769H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            C1259cb c1259cb5 = c1259cb;
                            try {
                                c1259cb = c1259cb5;
                                c2244mo.m4567f(c2244mo.m4572k((C1259cb) this.f8769H0.get()), c2244mo.m4572k(c1259cb5), 0, 5);
                                this.f8769H0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                c1259cb = c1259cb5;
                                z10 = true;
                                e.printStackTrace();
                                c1259cb2 = c1259cb3;
                                System.out.println("EXCEPTION : " + e);
                                z4 = z10;
                                if (z4) {
                                }
                                if (z3) {
                                }
                                iMax = Math.max(this.f8609b0, m4937q());
                                if (iMax > m4937q()) {
                                }
                                iMax2 = Math.max(this.f8611c0, m4933k());
                                if (iMax2 > m4933k()) {
                                }
                                if (r0 == 0) {
                                }
                                r132 = r02;
                                i3 = 8;
                                z9 = z8;
                                if (i40 <= i3) {
                                }
                                i39 = i40;
                                z22 = z3;
                                c1259cb3 = c1259cb2;
                                r13 = r132;
                                z2 = z9;
                            }
                        }
                        WeakReference weakReference4 = this.f8771J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            try {
                                try {
                                    c2244mo.m4567f(c2244mo.m4572k(this.f8590K), c2244mo.m4572k((C1259cb) this.f8771J0.get()), 0, 5);
                                } catch (Exception e3) {
                                    e = e3;
                                    z10 = true;
                                    e.printStackTrace();
                                    c1259cb2 = c1259cb3;
                                    System.out.println("EXCEPTION : " + e);
                                    z4 = z10;
                                }
                                try {
                                    this.f8771J0 = null;
                                } catch (Exception e4) {
                                    e = e4;
                                    z10 = true;
                                    e.printStackTrace();
                                    c1259cb2 = c1259cb3;
                                    System.out.println("EXCEPTION : " + e);
                                    z4 = z10;
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                        c2244mo.m4576p();
                        c1259cb2 = c1259cb3;
                        z4 = true;
                    } catch (Exception e6) {
                        e = e6;
                        z3 = z22;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z3 = z22;
                    z10 = z2;
                }
                if (z4) {
                    zArr[2] = false;
                    boolean zM4984W2 = m4984W(64);
                    mo4336Q(c2244mo, zM4984W2);
                    int size6 = this.f8774q0.size();
                    int i42 = 0;
                    boolean z23 = false;
                    while (i42 < size6) {
                        C2454rb c2454rb13 = (C2454rb) this.f8774q0.get(i42);
                        c2454rb13.mo4336Q(c2244mo, zM4984W2);
                        boolean z24 = zM4984W2;
                        int i43 = size6;
                        if (c2454rb13.f8620h != -1 || c2454rb13.f8622i != -1) {
                            z23 = true;
                        }
                        i42++;
                        zM4984W2 = z24;
                        size6 = i43;
                        z23 = z23;
                    }
                    z5 = z23;
                } else {
                    mo4336Q(c2244mo, zM4984W);
                    for (int i44 = 0; i44 < size; i44++) {
                        ((C2454rb) this.f8774q0.get(i44)).mo4336Q(c2244mo, zM4984W);
                    }
                    z5 = false;
                }
                if (z3 && i40 < 8 && zArr[2]) {
                    int iMax62 = 0;
                    int iMax72 = 0;
                    for (i4 = 0; i4 < size; i4++) {
                        C2454rb c2454rb14 = (C2454rb) this.f8774q0.get(i4);
                        iMax72 = Math.max(iMax72, c2454rb14.m4937q() + c2454rb14.f8604Y);
                        iMax62 = Math.max(iMax62, c2454rb14.m4933k() + c2454rb14.f8605Z);
                    }
                    int iMax82 = Math.max(this.f8609b0, iMax72);
                    iMax3 = Math.max(this.f8611c0, iMax62);
                    r13 = r13;
                    z5 = z5;
                    if (i8 == 2) {
                        r13 = r13;
                        z5 = z5;
                        if (m4937q() < iMax82) {
                            m4924O(iMax82);
                            r21[0] = 2;
                            r13 = 1;
                            z5 = true;
                        }
                    }
                    if (i7 == 2 && m4933k() < iMax3) {
                        m4921L(iMax3);
                        r21[1] = 2;
                        r13 = 1;
                        z5 = true;
                    }
                }
                iMax = Math.max(this.f8609b0, m4937q());
                if (iMax > m4937q()) {
                    m4924O(iMax);
                    r10 = 1;
                    r21[0] = 1;
                    z6 = true;
                    r17 = 1;
                } else {
                    r10 = 1;
                    r17 = r13;
                    z6 = z5;
                }
                iMax2 = Math.max(this.f8611c0, m4933k());
                if (iMax2 > m4933k()) {
                    m4921L(iMax2);
                    r21[r10] = r10;
                    ?? r03 = r10;
                    z7 = r03 == true ? 1 : 0;
                    r0 = r03;
                } else {
                    r0 = r17;
                    z7 = z6;
                }
                if (r0 == 0) {
                    ?? r04 = r0;
                    r04 = r0;
                    boolean z25 = z7;
                    z25 = z7;
                    if (r21[0] == 2 && i > 0) {
                        r04 = r0;
                        z25 = z7;
                        if (m4937q() > i) {
                            this.f8766E0 = r10;
                            r21[0] = r10;
                            m4924O(i);
                            ?? r05 = r10;
                            z25 = r05 == true ? 1 : 0;
                            r04 = r05;
                        }
                    }
                    r02 = r04;
                    r02 = r04;
                    z8 = z25;
                    z8 = z25;
                    if (r21[r10] == 2 && iMax5 > 0) {
                        r02 = r04;
                        z8 = z25;
                        if (m4933k() > iMax5) {
                            this.f8767F0 = r10;
                            r21[r10] = r10;
                            m4921L(iMax5);
                            i3 = 8;
                            r132 = 1;
                            z9 = true;
                        }
                    }
                    if (i40 <= i3) {
                        z9 = false;
                    }
                    i39 = i40;
                    z22 = z3;
                    c1259cb3 = c1259cb2;
                    r13 = r132;
                    z2 = z9;
                } else {
                    r02 = r0;
                    z8 = z7;
                }
                r132 = r02;
                i3 = 8;
                z9 = z8;
                if (i40 <= i3) {
                }
                i39 = i40;
                z22 = z3;
                c1259cb3 = c1259cb2;
                r13 = r132;
                z2 = z9;
            }
            this.f8774q0 = arrayList25;
            if (r13 != 0) {
                r21[0] = i8;
                r21[1] = i7;
            }
            mo4917F(c2244mo.f7938m);
        }
        c1259cb = c1259cb4;
        i = iMax4;
        z = false;
        if (m4984W(64)) {
        }
        c2244mo.getClass();
        c2244mo.f7933h = false;
        if (this.f8765D0 == 0) {
            c = 1;
        }
        ArrayList arrayList252 = this.f8774q0;
        if (r21[0] != 2) {
        }
        this.f8783z0 = 0;
        this.f8762A0 = 0;
        while (i2 < size) {
        }
        boolean zM4984W3 = m4984W(64);
        r13 = z;
        int i392 = 0;
        z2 = true;
        while (z2) {
        }
        this.f8774q0 = arrayList252;
        if (r13 != 0) {
        }
        mo4917F(c2244mo.f7938m);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m4984W(int i) {
        return (this.f8765D0 & i) == i;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: n */
    public final void mo4936n(StringBuilder sb) {
        sb.append(this.f8624j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f8600U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f8601V);
        sb.append("\n");
        Iterator it = this.f8774q0.iterator();
        while (it.hasNext()) {
            ((C2454rb) it.next()).mo4936n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
