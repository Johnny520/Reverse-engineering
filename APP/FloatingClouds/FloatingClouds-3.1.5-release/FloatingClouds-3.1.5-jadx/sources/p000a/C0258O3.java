package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000a.C0240N3;
import p000a.C0548e2;

/* JADX INFO: renamed from: a.O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0258O3 extends C0620hh {

    /* JADX INFO: renamed from: f0 */
    public final C0548e2 f927f0 = new C0548e2(this);

    /* JADX INFO: renamed from: g0 */
    public final C0366U4 f928g0;

    /* JADX INFO: renamed from: h0 */
    public C0548e2.b f929h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f930i0;

    /* JADX INFO: renamed from: j0 */
    public final C0029B9 f931j0;

    /* JADX INFO: renamed from: k0 */
    public int f932k0;

    /* JADX INFO: renamed from: l0 */
    public int f933l0;

    /* JADX INFO: renamed from: m0 */
    public int f934m0;

    /* JADX INFO: renamed from: n0 */
    public int f935n0;

    /* JADX INFO: renamed from: o0 */
    public C0346T2[] f936o0;

    /* JADX INFO: renamed from: p0 */
    public C0346T2[] f937p0;

    /* JADX INFO: renamed from: q0 */
    public int f938q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f939r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f940s0;

    public C0258O3() {
        C0366U4 c0366u4 = new C0366U4();
        c0366u4.f1369b = true;
        c0366u4.f1370c = true;
        c0366u4.f1372e = new ArrayList<>();
        new ArrayList();
        c0366u4.f1373f = null;
        c0366u4.f1374g = new C0548e2.a();
        c0366u4.f1375h = new ArrayList<>();
        c0366u4.f1368a = this;
        c0366u4.f1371d = this;
        this.f928g0 = c0366u4;
        this.f929h0 = null;
        this.f930i0 = false;
        this.f931j0 = new C0029B9();
        this.f934m0 = 0;
        this.f935n0 = 0;
        this.f936o0 = new C0346T2[4];
        this.f937p0 = new C0346T2[4];
        this.f938q0 = 263;
        this.f939r0 = false;
        this.f940s0 = false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:123:0x01fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0182 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x01c7 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9 A[PHI: r0 r15
  0x01f9: PHI (r0v16 boolean) = (r0v15 boolean), (r0v18 boolean), (r0v18 boolean), (r0v18 boolean) binds: [B:92:0x01c7, B:101:0x01e5, B:102:0x01e7, B:104:0x01ed] A[DONT_GENERATE, DONT_INLINE]
  0x01f9: PHI (r15v5 boolean) = (r15v4 boolean), (r15v7 boolean), (r15v7 boolean), (r15v7 boolean) binds: [B:92:0x01c7, B:101:0x01e5, B:102:0x01e7, B:104:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p000a.C0620hh
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo742B() {
        boolean z;
        boolean z2;
        C0240N3.a[] aVarArr;
        boolean z3;
        boolean z4;
        int iMax;
        int iM648l;
        int iMax2;
        boolean z5;
        boolean z6;
        ?? r2;
        boolean z7;
        boolean z8 = false;
        this.f798P = 0;
        this.f799Q = 0;
        int iMax3 = Math.max(0, m648l());
        int iMax4 = Math.max(0, m645i());
        this.f939r0 = false;
        this.f940s0 = false;
        int i = this.f938q0;
        boolean z9 = true;
        boolean z10 = ((i & 64) == 64) || (i & 128) == 128;
        C0029B9 c0029b9 = this.f931j0;
        c0029b9.getClass();
        c0029b9.f99f = false;
        if (this.f938q0 != 0 && z10) {
            c0029b9.f99f = true;
        }
        C0240N3.a[] aVarArr2 = this.f792J;
        C0240N3.a aVar = aVarArr2[1];
        C0240N3.a aVar2 = aVarArr2[0];
        ArrayList<C0240N3> arrayList = this.f2295e0;
        C0240N3.a aVar3 = C0240N3.a.f840b;
        boolean z11 = aVar2 == aVar3 || aVar == aVar3;
        this.f934m0 = 0;
        this.f935n0 = 0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0240N3 c0240n3 = this.f2295e0.get(i2);
            if (c0240n3 instanceof C0620hh) {
                ((C0620hh) c0240n3).mo742B();
            }
        }
        int i3 = 0;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = z11;
        while (z13) {
            boolean z15 = z9;
            int i4 = i3 + 1;
            try {
                c0029b9.m86r();
                this.f934m0 = z8 ? 1 : 0;
                this.f935n0 = z8 ? 1 : 0;
                m642f(c0029b9);
                int i5 = z8 ? 1 : 0;
                while (i5 < size) {
                    z = z8;
                    try {
                        this.f2295e0.get(i5).m642f(c0029b9);
                        i5++;
                        z8 = z ? 1 : 0;
                    } catch (Exception e) {
                        e = e;
                        z7 = z13;
                        e.printStackTrace();
                        aVarArr = aVarArr2;
                        z2 = z14;
                        System.out.println("EXCEPTION : " + e);
                        z3 = z7;
                        boolean[] zArr = C0634ic.f2309a;
                        if (z3) {
                        }
                        if (z2) {
                            z4 = z ? 1 : 0;
                        }
                        iMax = Math.max(this.f801S, m648l());
                        iM648l = m648l();
                        C0240N3.a aVar4 = C0240N3.a.f839a;
                        boolean z16 = z4;
                        boolean z17 = z12;
                        if (iMax > iM648l) {
                        }
                        iMax2 = Math.max(this.f802T, m645i());
                        boolean z18 = z16;
                        z5 = z17;
                        if (iMax2 > m645i()) {
                        }
                        if (z5) {
                        }
                        i3 = i4;
                        z8 = z ? 1 : 0;
                        aVarArr2 = aVarArr;
                        z14 = z2;
                        z9 = true;
                        z13 = z6;
                        z12 = z5;
                    }
                }
                z = z8;
                m744D(c0029b9);
            } catch (Exception e2) {
                e = e2;
                z = z8 ? 1 : 0;
                z7 = z13;
            }
            try {
                C0141Hc c0141Hc = c0029b9.f95b;
                if (c0029b9.f99f) {
                    int i6 = z ? 1 : 0;
                    while (true) {
                        if (i6 >= c0029b9.f102i) {
                            for (int i7 = z ? 1 : 0; i7 < c0029b9.f102i; i7++) {
                                C0184K1 c0184k1 = c0029b9.f98e[i7];
                                c0184k1.f633a.f2584e = c0184k1.f634b;
                            }
                        } else {
                            if (!c0029b9.f98e[i6].f637e) {
                                c0029b9.m83o(c0141Hc);
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    c0029b9.m83o(c0141Hc);
                }
                aVarArr = aVarArr2;
                z2 = z14;
                z3 = z15 ? 1 : 0;
            } catch (Exception e3) {
                e = e3;
                z7 = z15 ? 1 : 0;
                e.printStackTrace();
                aVarArr = aVarArr2;
                z2 = z14;
                System.out.println("EXCEPTION : " + e);
                z3 = z7;
            }
            boolean[] zArr2 = C0634ic.f2309a;
            if (z3) {
                mo637A(c0029b9);
                for (int i8 = z ? 1 : 0; i8 < size; i8++) {
                    this.f2295e0.get(i8).mo637A(c0029b9);
                }
            } else {
                zArr2[2] = z;
                mo637A(c0029b9);
                int size2 = this.f2295e0.size();
                for (int i9 = z ? 1 : 0; i9 < size2; i9++) {
                    this.f2295e0.get(i9).mo637A(c0029b9);
                }
            }
            if (z2 || i4 >= 8 || !zArr2[2]) {
                z4 = z ? 1 : 0;
            } else {
                int i10 = z ? 1 : 0;
                int iMax5 = i10;
                int iMax6 = iMax5;
                while (i10 < size) {
                    C0240N3 c0240n32 = this.f2295e0.get(i10);
                    iMax5 = Math.max(iMax5, c0240n32.m648l() + c0240n32.f798P);
                    iMax6 = Math.max(iMax6, c0240n32.m645i() + c0240n32.f799Q);
                    i10++;
                }
                int iMax7 = Math.max(this.f801S, iMax5);
                int iMax8 = Math.max(this.f802T, iMax6);
                if (aVar2 != aVar3 || m648l() >= iMax7) {
                    z4 = z ? 1 : 0;
                    z12 = z12;
                } else {
                    m661y(iMax7);
                    aVarArr[z ? 1 : 0] = aVar3;
                    boolean z19 = z15 ? 1 : 0;
                    z12 = z19 ? 1 : 0;
                    z4 = z19;
                }
                if (aVar == aVar3 && m645i() < iMax8) {
                    m658v(iMax8);
                    aVarArr[z15 ? 1 : 0] = aVar3;
                    z4 = z15 ? 1 : 0;
                    z12 = z4 ? 1 : 0;
                }
            }
            iMax = Math.max(this.f801S, m648l());
            iM648l = m648l();
            C0240N3.a aVar42 = C0240N3.a.f839a;
            boolean z162 = z4;
            boolean z172 = z12;
            if (iMax > iM648l) {
                m661y(iMax);
                aVarArr[z ? 1 : 0] = aVar42;
                boolean z20 = z15 ? 1 : 0;
                z172 = z20 ? 1 : 0;
                z162 = z20;
            }
            iMax2 = Math.max(this.f802T, m645i());
            boolean z182 = z162;
            z5 = z172;
            if (iMax2 > m645i()) {
                m658v(iMax2);
                aVarArr[z15 ? 1 : 0] = aVar42;
                boolean z21 = z15 ? 1 : 0;
                z5 = z21 ? 1 : 0;
                z182 = z21;
            }
            if (z5) {
                z6 = z182;
            } else {
                if (aVarArr[z ? 1 : 0] != aVar3 || iMax3 <= 0 || m648l() <= iMax3) {
                    r2 = z15 ? 1 : 0;
                    z182 = z182;
                    z5 = z5;
                } else {
                    boolean z22 = z15 ? 1 : 0;
                    this.f939r0 = z22;
                    aVarArr[z ? 1 : 0] = aVar42;
                    m661y(iMax3);
                    boolean z23 = z22 ? 1 : 0;
                    z5 = z23 ? 1 : 0;
                    z182 = z23;
                    r2 = z22;
                }
                if (aVarArr[r2] == aVar3 && iMax4 > 0 && m645i() > iMax4) {
                    this.f940s0 = r2;
                    aVarArr[r2] = aVar42;
                    m658v(iMax4);
                    z6 = true;
                    z5 = true;
                }
            }
            i3 = i4;
            z8 = z ? 1 : 0;
            aVarArr2 = aVarArr;
            z14 = z2;
            z9 = true;
            z13 = z6;
            z12 = z5;
        }
        boolean z24 = z8 ? 1 : 0;
        C0240N3.a[] aVarArr3 = aVarArr2;
        this.f2295e0 = arrayList;
        if (z12) {
            aVarArr3[z24 ? 1 : 0] = aVar2;
            aVarArr3[1] = aVar;
        }
        mo657u(c0029b9.f104k);
    }

    /* JADX INFO: renamed from: C */
    public final void m743C(C0240N3 c0240n3, int i) {
        if (i == 0) {
            int i2 = this.f934m0 + 1;
            C0346T2[] c0346t2Arr = this.f937p0;
            if (i2 >= c0346t2Arr.length) {
                this.f937p0 = (C0346T2[]) Arrays.copyOf(c0346t2Arr, c0346t2Arr.length * 2);
            }
            C0346T2[] c0346t2Arr2 = this.f937p0;
            int i3 = this.f934m0;
            c0346t2Arr2[i3] = new C0346T2(c0240n3, 0, this.f930i0);
            this.f934m0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f935n0 + 1;
            C0346T2[] c0346t2Arr3 = this.f936o0;
            if (i4 >= c0346t2Arr3.length) {
                this.f936o0 = (C0346T2[]) Arrays.copyOf(c0346t2Arr3, c0346t2Arr3.length * 2);
            }
            C0346T2[] c0346t2Arr4 = this.f936o0;
            int i5 = this.f935n0;
            c0346t2Arr4[i5] = new C0346T2(c0240n3, 1, this.f930i0);
            this.f935n0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m744D(C0029B9 c0029b9) {
        int i;
        int i2;
        mo357a(c0029b9);
        int size = this.f2295e0.size();
        int i3 = 0;
        boolean z = false;
        while (true) {
            i = 1;
            if (i3 >= size) {
                break;
            }
            C0240N3 c0240n3 = this.f2295e0.get(i3);
            boolean[] zArr = c0240n3.f791I;
            zArr[0] = false;
            zArr[1] = false;
            if (c0240n3 instanceof C0381V1) {
                z = true;
            }
            i3++;
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                C0240N3 c0240n32 = this.f2295e0.get(i4);
                if (c0240n32 instanceof C0381V1) {
                    C0381V1 c0381v1 = (C0381V1) c0240n32;
                    for (int i5 = 0; i5 < c0381v1.f2135f0; i5++) {
                        C0240N3 c0240n33 = c0381v1.f2134e0[i5];
                        int i6 = c0381v1.f1438g0;
                        if (i6 == 0 || i6 == 1) {
                            c0240n33.f791I[0] = true;
                        } else if (i6 == 2 || i6 == 3) {
                            c0240n33.f791I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C0240N3 c0240n34 = this.f2295e0.get(i7);
            c0240n34.getClass();
            if ((c0240n34 instanceof C0450Yg) || (c0240n34 instanceof C0478a8)) {
                c0240n34.mo357a(c0029b9);
            }
        }
        int i8 = 0;
        while (i8 < size) {
            C0240N3 c0240n35 = this.f2295e0.get(i8);
            boolean z2 = c0240n35 instanceof C0258O3;
            C0240N3.a aVar = C0240N3.a.f840b;
            if (z2) {
                C0240N3.a[] aVarArr = c0240n35.f792J;
                C0240N3.a aVar2 = aVarArr[0];
                C0240N3.a aVar3 = aVarArr[i];
                C0240N3.a aVar4 = C0240N3.a.f839a;
                if (aVar2 == aVar) {
                    c0240n35.m659w(aVar4);
                }
                if (aVar3 == aVar) {
                    c0240n35.m660x(aVar4);
                }
                c0240n35.mo357a(c0029b9);
                if (aVar2 == aVar) {
                    c0240n35.m659w(aVar2);
                }
                if (aVar3 == aVar) {
                    c0240n35.m660x(aVar3);
                }
                i2 = i;
            } else {
                c0240n35.f820h = -1;
                c0240n35.f821i = -1;
                C0240N3.a[] aVarArr2 = this.f792J;
                C0240N3.a aVar5 = aVarArr2[0];
                C0240N3.a aVar6 = C0240N3.a.f842d;
                C0240N3.a[] aVarArr3 = c0240n35.f792J;
                if (aVar5 == aVar || aVarArr3[0] != aVar6) {
                    i2 = i;
                } else {
                    C0222M3 c0222m3 = c0240n35.f837y;
                    int i9 = c0222m3.f748e;
                    int iM648l = m648l();
                    C0222M3 c0222m32 = c0240n35.f783A;
                    i2 = i;
                    int i10 = iM648l - c0222m32.f748e;
                    c0222m3.f750g = c0029b9.m79j(c0222m3);
                    c0222m32.f750g = c0029b9.m79j(c0222m32);
                    c0029b9.m73d(c0222m3.f750g, i9);
                    c0029b9.m73d(c0222m32.f750g, i10);
                    c0240n35.f820h = 2;
                    c0240n35.f798P = i9;
                    int i11 = i10 - i9;
                    c0240n35.f794L = i11;
                    int i12 = c0240n35.f801S;
                    if (i11 < i12) {
                        c0240n35.f794L = i12;
                    }
                }
                if (aVarArr2[i2] != aVar && aVarArr3[i2] == aVar6) {
                    C0222M3 c0222m33 = c0240n35.f838z;
                    int i13 = c0222m33.f748e;
                    int iM645i = m645i();
                    C0222M3 c0222m34 = c0240n35.f784B;
                    int i14 = iM645i - c0222m34.f748e;
                    c0222m33.f750g = c0029b9.m79j(c0222m33);
                    c0222m34.f750g = c0029b9.m79j(c0222m34);
                    c0029b9.m73d(c0222m33.f750g, i13);
                    c0029b9.m73d(c0222m34.f750g, i14);
                    if (c0240n35.f800R > 0 || c0240n35.f806X == 8) {
                        C0222M3 c0222m35 = c0240n35.f785C;
                        C0693le c0693leM79j = c0029b9.m79j(c0222m35);
                        c0222m35.f750g = c0693leM79j;
                        c0029b9.m73d(c0693leM79j, c0240n35.f800R + i13);
                    }
                    c0240n35.f821i = 2;
                    c0240n35.f799Q = i13;
                    int i15 = i14 - i13;
                    c0240n35.f795M = i15;
                    int i16 = c0240n35.f802T;
                    if (i15 < i16) {
                        c0240n35.f795M = i16;
                    }
                }
                if (!(c0240n35 instanceof C0450Yg) && !(c0240n35 instanceof C0478a8)) {
                    c0240n35.mo357a(c0029b9);
                }
            }
            i8++;
            i = i2;
        }
        int i17 = i;
        if (this.f934m0 > 0) {
            C0328S2.m907a(this, c0029b9, 0);
        }
        if (this.f935n0 > 0) {
            C0328S2.m907a(this, c0029b9, i17);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m745E(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0240N3.a aVar;
        boolean z6;
        C0366U4 c0366u4 = this.f928g0;
        C0258O3 c0258o3 = c0366u4.f1368a;
        C0240N3.a aVarM644h = c0258o3.m644h(0);
        C0240N3.a aVarM644h2 = c0258o3.m644h(1);
        int iM649m = c0258o3.m649m();
        int iM650n = c0258o3.m650n();
        ArrayList<AbstractC0639ih> arrayList = c0366u4.f1372e;
        C0240N3.a aVar2 = C0240N3.a.f839a;
        C0752og c0752og = c0258o3.f817e;
        C0191K8 c0191k8 = c0258o3.f815d;
        if (z && (aVarM644h == (aVar = C0240N3.a.f840b) || aVarM644h2 == aVar)) {
            Iterator<AbstractC0639ih> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = z;
                    break;
                }
                AbstractC0639ih next = it.next();
                if (next.f2347f == i && !next.mo525k()) {
                    z6 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z6 && aVarM644h == aVar) {
                    c0258o3.m659w(aVar2);
                    c0258o3.m661y(c0366u4.m984d(c0258o3, 0));
                    c0191k8.f2346e.mo1014d(c0258o3.m648l());
                }
            } else if (z6 && aVarM644h2 == aVar) {
                c0258o3.m660x(aVar2);
                c0258o3.m658v(c0366u4.m984d(c0258o3, 1));
                c0752og.f2346e.mo1014d(c0258o3.m645i());
            }
        }
        C0240N3.a aVar3 = C0240N3.a.f842d;
        C0240N3.a[] aVarArr = c0258o3.f792J;
        if (i == 0) {
            z2 = false;
            C0240N3.a aVar4 = aVarArr[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iM648l = c0258o3.m648l() + iM649m;
                c0191k8.f2350i.mo1014d(iM648l);
                c0191k8.f2346e.mo1014d(iM648l - iM649m);
                z4 = true;
                z3 = true;
            } else {
                z3 = true;
                z4 = z2;
            }
        } else {
            z2 = false;
            z3 = true;
            C0240N3.a aVar5 = aVarArr[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int iM645i = c0258o3.m645i() + iM650n;
                c0752og.f2350i.mo1014d(iM645i);
                c0752og.f2346e.mo1014d(iM645i - iM650n);
                z4 = true;
            } else {
                z4 = z2;
            }
        }
        c0366u4.m987g();
        for (AbstractC0639ih abstractC0639ih : arrayList) {
            if (abstractC0639ih.f2347f == i && (abstractC0639ih.f2343b != c0258o3 || abstractC0639ih.f2348g)) {
                abstractC0639ih.mo523e();
            }
        }
        for (AbstractC0639ih abstractC0639ih2 : arrayList) {
            if (abstractC0639ih2.f2347f == i && (z4 || abstractC0639ih2.f2343b != c0258o3)) {
                if (!abstractC0639ih2.f2349h.f1452j || !abstractC0639ih2.f2350i.f1452j || (!(abstractC0639ih2 instanceof C0364U2) && !abstractC0639ih2.f2346e.f1452j)) {
                    z5 = z2;
                    break;
                }
            }
        }
        z5 = z3;
        c0258o3.m659w(aVarM644h);
        c0258o3.m660x(aVarM644h2);
        return z5;
    }

    @Override // p000a.C0620hh, p000a.C0240N3
    /* JADX INFO: renamed from: s */
    public final void mo655s() {
        this.f931j0.m86r();
        this.f932k0 = 0;
        this.f933l0 = 0;
        super.mo655s();
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: z */
    public final void mo662z(boolean z, boolean z2) {
        super.mo662z(z, z2);
        int size = this.f2295e0.size();
        for (int i = 0; i < size; i++) {
            this.f2295e0.get(i).mo662z(z, z2);
        }
    }
}
