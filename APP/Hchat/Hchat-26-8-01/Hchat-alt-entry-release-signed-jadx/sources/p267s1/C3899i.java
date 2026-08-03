package p267s1;

import java.util.ArrayList;
import java.util.List;
import p005a5.C0016a;
import p057e1.C0807b;
import p069f.AbstractC0954q;
import p069f.C0933f0;
import p069f.C0952p;
import p087g.AbstractC1256a;
import p100h0.C1545q0;
import p131j0.C2046b;
import p308v1.InterfaceC4428t;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.InterfaceC5656w1;
import p356y0.AbstractC5852n;
import tf.C4173t;

/* JADX INFO: renamed from: s1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3899i extends C3901j {

    /* JADX INFO: renamed from: c */
    public final AbstractC5852n f12783c;

    /* JADX INFO: renamed from: d */
    public final C0016a f12784d;

    /* JADX INFO: renamed from: e */
    public final C0952p f12785e;

    /* JADX INFO: renamed from: f */
    public AbstractC5614i1 f12786f;

    /* JADX INFO: renamed from: g */
    public C3903k f12787g;

    /* JADX INFO: renamed from: h */
    public boolean f12788h;

    /* JADX INFO: renamed from: i */
    public boolean f12789i;

    /* JADX INFO: renamed from: j */
    public boolean f12790j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3899i(AbstractC5852n abstractC5852n) {
        this.f12783c = abstractC5852n;
        C0016a c0016a = new C0016a((byte) 0, 10);
        c0016a.f56i = new long[2];
        this.f12784d = c0016a;
        this.f12785e = new C0952p(2);
        this.f12789i = true;
        this.f12790j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:177:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:180:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:185:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x004b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:75:0x01c9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032c  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // p267s1.C3901j
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo8092a(C0952p c0952p, InterfaceC4428t interfaceC4428t, C1545q0 c1545q0, boolean z9) {
        C0016a c0016a;
        C0952p c0952p2;
        Object obj;
        boolean z10;
        boolean z11;
        C3903k c3903k;
        int i9;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int i13;
        C3914t c3914t;
        InterfaceC4428t interfaceC4428t2 = interfaceC4428t;
        boolean zMo8092a = super.mo8092a(c0952p, interfaceC4428t, c1545q0, z9);
        ?? M10149e = this.f12783c;
        boolean z14 = true;
        if (M10149e.f23801t) {
            ?? c2046b = 0;
            while (M10149e != 0) {
                if (M10149e instanceof InterfaceC5656w1) {
                    this.f12786f = AbstractC5618k.m10164t((InterfaceC5656w1) M10149e, 16);
                } else if ((M10149e.f23790i & 16) != 0 && (M10149e instanceof AbstractC5615j)) {
                    AbstractC5852n abstractC5852n = ((AbstractC5615j) M10149e).f22875v;
                    int i14 = 0;
                    M10149e = M10149e;
                    c2046b = c2046b;
                    while (abstractC5852n != null) {
                        if ((abstractC5852n.f23790i & 16) != 0) {
                            i14++;
                            c2046b = c2046b;
                            if (i14 == 1) {
                                M10149e = abstractC5852n;
                            } else {
                                if (c2046b == 0) {
                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                }
                                if (M10149e != 0) {
                                    c2046b.m5056b(M10149e);
                                    M10149e = 0;
                                }
                                c2046b.m5056b(abstractC5852n);
                            }
                        }
                        abstractC5852n = abstractC5852n.f23793l;
                        M10149e = M10149e;
                        c2046b = c2046b;
                    }
                    if (i14 == 1) {
                    }
                }
                M10149e = AbstractC5618k.m10149e(c2046b);
            }
            if (this.f12786f != null) {
                int iM2345d = c0952p.m2345d();
                int i15 = 0;
                while (true) {
                    c0016a = this.f12784d;
                    c0952p2 = this.f12785e;
                    if (i15 >= iM2345d) {
                        break;
                    }
                    long jM2342a = c0952p.m2342a(i15);
                    C3914t c3914t2 = (C3914t) c0952p.m2346e(i15);
                    if (c0016a.m201e(jM2342a)) {
                        boolean z15 = z14;
                        long j3 = c3914t2.f12840g;
                        ArrayList arrayList = c3914t2.f12846m;
                        long j4 = c3914t2.f12836c;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z13 = z15;
                            C4173t c4173t = C4173t.f13710g;
                            z12 = zMo8092a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? c4173t : arrayList).size());
                            List list = arrayList == null ? c4173t : arrayList;
                            i11 = iM2345d;
                            int size = list.size();
                            i12 = i15;
                            int i16 = 0;
                            while (i16 < size) {
                                List list2 = list;
                                C3887c c3887c = (C3887c) list.get(i16);
                                C0952p c0952p3 = c0952p2;
                                long j5 = jM2342a;
                                long j10 = c3887c.f12749b;
                                if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    c3914t = c3914t2;
                                    long j11 = c3887c.f12748a;
                                    i13 = size;
                                    AbstractC5614i1 abstractC5614i1 = this.f12786f;
                                    abstractC5614i1.getClass();
                                    arrayList2.add(new C3887c(j11, abstractC5614i1.mo8861W(interfaceC4428t2, j10), c3887c.f12750c, c3887c.f12751d, c3887c.f12752e));
                                } else {
                                    i13 = size;
                                    c3914t = c3914t2;
                                }
                                i16++;
                                size = i13;
                                list = list2;
                                c0952p2 = c0952p3;
                                jM2342a = j5;
                                c3914t2 = c3914t;
                            }
                            C0952p c0952p4 = c0952p2;
                            long j12 = jM2342a;
                            AbstractC5614i1 abstractC5614i12 = this.f12786f;
                            abstractC5614i12.getClass();
                            long jMo8861W = abstractC5614i12.mo8861W(interfaceC4428t2, j3);
                            AbstractC5614i1 abstractC5614i13 = this.f12786f;
                            abstractC5614i13.getClass();
                            C3914t c3914t3 = new C3914t(c3914t2.f12834a, c3914t2.f12835b, abstractC5614i13.mo8861W(interfaceC4428t2, j4), c3914t2.f12837d, c3914t2.f12838e, c3914t2.f12839f, jMo8861W, c3914t2.f12841h, c3914t2.f12842i, arrayList2, c3914t2.f12843j, c3914t2.f12844k, c3914t2.f12845l, c3914t2.f12847n);
                            C3914t c3914t4 = c3914t2.f12850q;
                            if (c3914t4 == null) {
                                c3914t4 = c3914t2;
                            }
                            c3914t3.f12850q = c3914t4;
                            C3914t c3914t5 = c3914t2.f12850q;
                            if (c3914t5 != null) {
                                c3914t2 = c3914t5;
                            }
                            c3914t3.f12850q = c3914t2;
                            c0952p4.m2343b(c3914t3, j12);
                        } else {
                            z12 = zMo8092a;
                            i11 = iM2345d;
                            i12 = i15;
                            z13 = z15;
                        }
                    } else {
                        z12 = zMo8092a;
                        i11 = iM2345d;
                        z13 = z14;
                        i12 = i15;
                    }
                    i15 = i12 + 1;
                    interfaceC4428t2 = interfaceC4428t;
                    iM2345d = i11;
                    z14 = z13;
                    zMo8092a = z12;
                }
                boolean z16 = zMo8092a;
                boolean z17 = z14;
                if (c0952p2.m2345d() == 0) {
                    c0016a.f55h = 0;
                    this.f12795a.m5061g();
                    return z17;
                }
                int i17 = c0016a.f55h;
                while (true) {
                    i17--;
                    if (-1 >= i17) {
                        break;
                    }
                    long j13 = ((long[]) c0016a.f56i)[i17];
                    if (c0952p.f2998g) {
                        int i18 = c0952p.f3001j;
                        long[] jArr = c0952p.f2999h;
                        Object[] objArr = c0952p.f3000i;
                        int i19 = 0;
                        for (int i20 = 0; i20 < i18; i20++) {
                            Object obj2 = objArr[i20];
                            if (obj2 != AbstractC0954q.f3004a) {
                                if (i20 != i19) {
                                    jArr[i19] = jArr[i20];
                                    objArr[i19] = obj2;
                                    objArr[i20] = null;
                                }
                                i19++;
                            }
                        }
                        c0952p.f2998g = false;
                        c0952p.f3001j = i19;
                    }
                    if (AbstractC1256a.m3380b(c0952p.f2999h, c0952p.f3001j, j13) < 0 && i17 < (i10 = c0016a.f55h)) {
                        int i21 = i10 - 1;
                        int i22 = i17;
                        while (i22 < i21) {
                            long[] jArr2 = (long[]) c0016a.f56i;
                            int i23 = i22 + 1;
                            jArr2[i22] = jArr2[i23];
                            i22 = i23;
                        }
                        c0016a.f55h--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(c0952p2.m2345d());
                int iM2345d2 = c0952p2.m2345d();
                for (int i24 = 0; i24 < iM2345d2; i24++) {
                    arrayList3.add(c0952p2.m2346e(i24));
                }
                C3903k c3903k2 = new C3903k(arrayList3, c1545q0);
                int size2 = arrayList3.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i25);
                    if (c1545q0.m4041a(((C3914t) obj).f12834a)) {
                        break;
                    }
                    i25++;
                }
                C3914t c3914t6 = (C3914t) obj;
                if (c3914t6 != null) {
                    boolean z18 = c3914t6.f12837d;
                    if (z9) {
                        z10 = false;
                        if (!this.f12789i && (z18 || c3914t6.f12841h)) {
                            AbstractC5614i1 abstractC5614i14 = this.f12786f;
                            abstractC5614i14.getClass();
                            long j14 = abstractC5614i14.f14595i;
                            long j15 = c3914t6.f12836c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & 4294967295L));
                            int i26 = (int) (j14 >> 32);
                            this.f12789i = !((fIntBitsToFloat2 > ((float) ((int) (j14 & 4294967295L))) ? z17 : false) | (fIntBitsToFloat2 < 0.0f ? z17 : false) | (fIntBitsToFloat > ((float) i26) ? z17 : false) | (fIntBitsToFloat < 0.0f ? z17 : false));
                        }
                    } else {
                        z10 = false;
                        this.f12789i = false;
                    }
                    boolean z19 = this.f12789i;
                    boolean z20 = this.f12788h;
                    if (z19 == z20 || !((i9 = c3903k2.f12805f) == 3 || i9 == 4 || i9 == 5)) {
                        int i27 = c3903k2.f12805f;
                        if (i27 == 4 && z20 && !this.f12790j) {
                            c3903k2.f12805f = 3;
                        } else if (i27 == 5 && z19 && z18) {
                            c3903k2.f12805f = 3;
                        }
                    } else {
                        c3903k2.f12805f = z19 ? 4 : 5;
                    }
                } else {
                    z10 = false;
                }
                if (z16 || c3903k2.f12805f != 3 || (c3903k = this.f12787g) == null) {
                    z11 = z17;
                    break;
                }
                ?? r12 = c3903k.f12800a;
                int size3 = r12.size();
                ?? r42 = c3903k2.f12800a;
                if (size3 == r42.size()) {
                    int size4 = r42.size();
                    for (?? r5 = z10; r5 < size4; r5++) {
                        if (!C0807b.m2039b(((C3914t) r12.get(r5)).f12836c, ((C3914t) r42.get(r5)).f12836c)) {
                            z11 = z17;
                            break;
                        }
                    }
                    z11 = z10;
                }
                this.f12787g = c3903k2;
                return z11;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p267s1.C3901j
    /* JADX INFO: renamed from: b */
    public final void mo8093b(C1545q0 c1545q0) {
        super.mo8093b(c1545q0);
        C3903k c3903k = this.f12787g;
        if (c3903k == null) {
            return;
        }
        this.f12788h = this.f12789i;
        ?? r12 = c3903k.f12800a;
        int size = r12.size();
        for (int i9 = 0; i9 < size; i9++) {
            C3914t c3914t = (C3914t) r12.get(i9);
            boolean z9 = c3914t.f12837d;
            long j3 = c3914t.f12834a;
            boolean zM4041a = c1545q0.m4041a(j3);
            boolean z10 = this.f12789i;
            if ((!z9 && !zM4041a) || (!z9 && !z10)) {
                this.f12784d.m212p(j3);
            }
        }
        this.f12789i = false;
        this.f12790j = c3903k.f12805f == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0055 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: c */
    public final void m8094c() {
        C2046b c2046b = this.f12795a;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C3899i) objArr[i10]).m8094c();
        }
        ?? M10149e = this.f12783c;
        ?? c2046b2 = 0;
        while (M10149e != 0) {
            if (M10149e instanceof InterfaceC5656w1) {
                ((InterfaceC5656w1) M10149e).mo1611b0();
            } else if ((M10149e.f23790i & 16) != 0 && (M10149e instanceof AbstractC5615j)) {
                AbstractC5852n abstractC5852n = ((AbstractC5615j) M10149e).f22875v;
                int i11 = 0;
                M10149e = M10149e;
                c2046b2 = c2046b2;
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & 16) != 0) {
                        i11++;
                        c2046b2 = c2046b2;
                        if (i11 == 1) {
                            M10149e = abstractC5852n;
                        } else {
                            if (c2046b2 == 0) {
                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                            }
                            if (M10149e != 0) {
                                c2046b2.m5056b(M10149e);
                                M10149e = 0;
                            }
                            c2046b2.m5056b(abstractC5852n);
                        }
                    }
                    abstractC5852n = abstractC5852n.f23793l;
                    M10149e = M10149e;
                    c2046b2 = c2046b2;
                }
                if (i11 == 1) {
                }
            }
            M10149e = AbstractC5618k.m10149e(c2046b2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8095d(C1545q0 c1545q0) {
        boolean z9;
        boolean z10;
        C5602f0 c5602f0;
        C0952p c0952p = this.f12785e;
        if (c0952p.m2345d() == 0) {
            z9 = false;
        } else {
            AbstractC5852n abstractC5852n = this.f12783c;
            if (abstractC5852n.f23801t) {
                AbstractC5614i1 abstractC5614i1 = abstractC5852n.f23795n;
                if ((abstractC5614i1 == null || (c5602f0 = abstractC5614i1.f22868u) == null) ? false : c5602f0.m10011H()) {
                    C3903k c3903k = this.f12787g;
                    c3903k.getClass();
                    AbstractC5614i1 abstractC5614i12 = this.f12786f;
                    abstractC5614i12.getClass();
                    long j3 = abstractC5614i12.f14595i;
                    AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                    C2046b c2046b = null;
                    while (true) {
                        z9 = true;
                        if (abstractC5852nM10149e == null) {
                            break;
                        }
                        if (abstractC5852nM10149e instanceof InterfaceC5656w1) {
                            ((InterfaceC5656w1) abstractC5852nM10149e).mo1608P(c3903k, EnumC3905l.f12814i, j3);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (((abstractC5852nM10149e.f23790i & 16) != 0) && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i9 = 0;
                                for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                    if ((abstractC5852n2.f23790i & 16) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC5852nM10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b == null) {
                                                c2046b = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b.m5056b(abstractC5852n2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                        }
                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                    }
                    if (abstractC5852n.f23801t) {
                        C2046b c2046b2 = this.f12795a;
                        Object[] objArr = c2046b2.f6891g;
                        int i10 = c2046b2.f6893i;
                        for (int i11 = 0; i11 < i10; i11++) {
                            ((C3899i) objArr[i11]).m8095d(c1545q0);
                        }
                    }
                }
            }
        }
        mo8093b(c1545q0);
        int i12 = c0952p.f3001j;
        Object[] objArr2 = c0952p.f3000i;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr2[i13] = null;
        }
        c0952p.f3001j = 0;
        c0952p.f2998g = false;
        this.f12786f = null;
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m8096e(C1545q0 c1545q0, boolean z9) {
        boolean z10;
        boolean z11;
        C5602f0 c5602f0;
        if (this.f12785e.m2345d() == 0) {
            return false;
        }
        AbstractC5852n abstractC5852nM10149e = this.f12783c;
        if (abstractC5852nM10149e.f23801t) {
            AbstractC5614i1 abstractC5614i1 = abstractC5852nM10149e.f23795n;
            if ((abstractC5614i1 == null || (c5602f0 = abstractC5614i1.f22868u) == null) ? false : c5602f0.m10011H()) {
                C3903k c3903k = this.f12787g;
                c3903k.getClass();
                AbstractC5614i1 abstractC5614i12 = this.f12786f;
                abstractC5614i12.getClass();
                long j3 = abstractC5614i12.f14595i;
                AbstractC5852n abstractC5852nM10149e2 = abstractC5852nM10149e;
                C2046b c2046b = null;
                while (abstractC5852nM10149e2 != null) {
                    if (abstractC5852nM10149e2 instanceof InterfaceC5656w1) {
                        ((InterfaceC5656w1) abstractC5852nM10149e2).mo1608P(c3903k, EnumC3905l.f12812g, j3);
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        if (((abstractC5852nM10149e2.f23790i & 16) != 0) && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                            int i9 = 0;
                            for (AbstractC5852n abstractC5852n = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
                                if ((abstractC5852n.f23790i & 16) != 0) {
                                    i9++;
                                    if (i9 == 1) {
                                        abstractC5852nM10149e2 = abstractC5852n;
                                    } else {
                                        if (c2046b == null) {
                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (abstractC5852nM10149e2 != null) {
                                            c2046b.m5056b(abstractC5852nM10149e2);
                                            abstractC5852nM10149e2 = null;
                                        }
                                        c2046b.m5056b(abstractC5852n);
                                    }
                                }
                            }
                            if (i9 == 1) {
                            }
                        }
                    }
                    abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b);
                }
                if (abstractC5852nM10149e.f23801t) {
                    C2046b c2046b2 = this.f12795a;
                    Object[] objArr = c2046b2.f6891g;
                    int i10 = c2046b2.f6893i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        C3899i c3899i = (C3899i) objArr[i11];
                        this.f12786f.getClass();
                        c3899i.m8096e(c1545q0, z9);
                    }
                }
                if (abstractC5852nM10149e.f23801t) {
                    C2046b c2046b3 = null;
                    while (abstractC5852nM10149e != null) {
                        if (abstractC5852nM10149e instanceof InterfaceC5656w1) {
                            ((InterfaceC5656w1) abstractC5852nM10149e).mo1608P(c3903k, EnumC3905l.f12813h, j3);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (((abstractC5852nM10149e.f23790i & 16) != 0) && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i12 = 0;
                                for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                    if ((abstractC5852n2.f23790i & 16) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC5852nM10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b3 == null) {
                                                c2046b3 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b3.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b3.m5056b(abstractC5852n2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                        }
                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m8097f(long j3, C0933f0 c0933f0) {
        C0016a c0016a = this.f12784d;
        if (c0016a.m201e(j3) && c0933f0.m2292g(this) < 0) {
            c0016a.m212p(j3);
            this.f12785e.m2344c(j3);
        }
        C2046b c2046b = this.f12795a;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C3899i) objArr[i10]).m8097f(j3, c0933f0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Node(modifierNode=" + this.f12783c + ", children=" + this.f12795a + ", pointerIds=" + this.f12784d + ')';
    }
}
