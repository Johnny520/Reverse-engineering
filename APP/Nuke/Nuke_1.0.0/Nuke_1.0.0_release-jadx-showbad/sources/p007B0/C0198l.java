package p007B0;

import java.util.ArrayList;
import java.util.List;
import p013C0.C0236c;
import p029F0.InterfaceC0430v;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0624v0;
import p061L2.C0981u;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p154e2.C2029h;
import p169h0.AbstractC2206o;
import p186k.AbstractC2434p;
import p186k.C2404A;
import p186k.C2433o;
import p192l.AbstractC2477a;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0198l extends C0199m {

    /* JADX INFO: renamed from: c */
    public final AbstractC2206o f686c;

    /* JADX INFO: renamed from: d */
    public final C0236c f687d;

    /* JADX INFO: renamed from: e */
    public final C2433o f688e;

    /* JADX INFO: renamed from: f */
    public AbstractC0596h0 f689f;

    /* JADX INFO: renamed from: g */
    public C0200n f690g;

    /* JADX INFO: renamed from: h */
    public boolean f691h;

    /* JADX INFO: renamed from: i */
    public boolean f692i;

    /* JADX INFO: renamed from: j */
    public boolean f693j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0198l(AbstractC2206o abstractC2206o) {
        this.f686c = abstractC2206o;
        C0236c c0236c = new C0236c(0);
        c0236c.f794f = new long[2];
        this.f687d = c0236c;
        this.f688e = new C2433o(2);
        this.f692i = true;
        this.f693j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:175:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:178:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:180:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:183:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x004b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:73:0x01ae */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0311  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007B0.C0199m
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo304a(C2433o c2433o, InterfaceC0430v interfaceC0430v, C2029h c2029h, boolean z5) {
        C2433o c2433o2;
        C0236c c0236c;
        Object obj;
        boolean z6;
        boolean z7;
        C0200n c0200n;
        int i5;
        int i6;
        boolean z8;
        int i7;
        boolean z9;
        int i8;
        List list;
        C0209w c0209w;
        InterfaceC0430v interfaceC0430v2 = interfaceC0430v;
        boolean zMo304a = super.mo304a(c2433o, interfaceC0430v, c2029h, z5);
        ?? M1029e = this.f686c;
        boolean z10 = true;
        if (M1029e.f7199q) {
            ?? c1483e = 0;
            while (M1029e != 0) {
                if (M1029e instanceof InterfaceC0624v0) {
                    this.f689f = AbstractC0601k.m1042r((InterfaceC0624v0) M1029e, 16);
                } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                    AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e).f1943s;
                    int i9 = 0;
                    M1029e = M1029e;
                    c1483e = c1483e;
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 16) != 0) {
                            i9++;
                            c1483e = c1483e;
                            if (i9 == 1) {
                                M1029e = abstractC2206o;
                            } else {
                                if (c1483e == 0) {
                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                }
                                if (M1029e != 0) {
                                    c1483e.m2753b(M1029e);
                                    M1029e = 0;
                                }
                                c1483e.m2753b(abstractC2206o);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7191i;
                        M1029e = M1029e;
                        c1483e = c1483e;
                    }
                    if (i9 == 1) {
                    }
                }
                M1029e = AbstractC0601k.m1029e(c1483e);
            }
            if (this.f689f != null) {
                int iM4323h = c2433o.m4323h();
                int i10 = 0;
                while (true) {
                    c2433o2 = this.f688e;
                    c0236c = this.f687d;
                    if (i10 >= iM4323h) {
                        break;
                    }
                    long jM4320a = c2433o.m4320a(i10);
                    C0209w c0209w2 = (C0209w) c2433o.m4324i(i10);
                    if (c0236c.m415c(jM4320a)) {
                        boolean z11 = z10;
                        long j5 = c0209w2.f717g;
                        List list2 = c0209w2.f721k;
                        long j6 = c0209w2.f713c;
                        if ((((j5 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z9 = z11;
                            C0981u c0981u = C0981u.f3047d;
                            z8 = zMo304a;
                            ArrayList arrayList = new ArrayList((list2 == null ? c0981u : list2).size());
                            if (list2 == null) {
                                list2 = c0981u;
                            }
                            int size = list2.size();
                            i7 = iM4323h;
                            int i11 = 0;
                            while (i11 < size) {
                                int i12 = size;
                                C0189c c0189c = (C0189c) list2.get(i11);
                                long j7 = jM4320a;
                                List list3 = list2;
                                long j8 = c0189c.f660b;
                                if ((((j8 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list = list3;
                                    c0209w = c0209w2;
                                    long j9 = c0189c.f659a;
                                    i8 = i11;
                                    AbstractC0596h0 abstractC0596h0 = this.f689f;
                                    AbstractC1665j.m2982b(abstractC0596h0);
                                    arrayList.add(new C0189c(j9, abstractC0596h0.mo635O(interfaceC0430v2, j8), c0189c.f661c));
                                } else {
                                    i8 = i11;
                                    list = list3;
                                    c0209w = c0209w2;
                                }
                                i11 = i8 + 1;
                                list2 = list;
                                size = i12;
                                jM4320a = j7;
                                c0209w2 = c0209w;
                            }
                            long j10 = jM4320a;
                            AbstractC0596h0 abstractC0596h02 = this.f689f;
                            AbstractC1665j.m2982b(abstractC0596h02);
                            long jMo635O = abstractC0596h02.mo635O(interfaceC0430v2, j5);
                            AbstractC0596h0 abstractC0596h03 = this.f689f;
                            AbstractC1665j.m2982b(abstractC0596h03);
                            C0209w c0209w3 = new C0209w(c0209w2.f711a, c0209w2.f712b, abstractC0596h03.mo635O(interfaceC0430v2, j6), c0209w2.f714d, c0209w2.f715e, c0209w2.f716f, jMo635O, c0209w2.f718h, c0209w2.f719i, arrayList, c0209w2.f720j, c0209w2.f722l);
                            C0209w c0209w4 = c0209w2.f725o;
                            if (c0209w4 == null) {
                                c0209w4 = c0209w2;
                            }
                            c0209w3.f725o = c0209w4;
                            C0209w c0209w5 = c0209w2.f725o;
                            if (c0209w5 != null) {
                                c0209w2 = c0209w5;
                            }
                            c0209w3.f725o = c0209w2;
                            c2433o2.m4321e(j10, c0209w3);
                        } else {
                            z8 = zMo304a;
                            i7 = iM4323h;
                            z9 = z11;
                        }
                    } else {
                        z8 = zMo304a;
                        i7 = iM4323h;
                        z9 = z10;
                    }
                    i10++;
                    interfaceC0430v2 = interfaceC0430v;
                    z10 = z9;
                    iM4323h = i7;
                    zMo304a = z8;
                }
                boolean z12 = zMo304a;
                boolean z13 = z10;
                if (c2433o2.m4323h() == 0) {
                    c0236c.f793e = 0;
                    this.f694a.m2758g();
                    return z13;
                }
                int i13 = c0236c.f793e;
                while (true) {
                    i13--;
                    if (-1 >= i13) {
                        break;
                    }
                    long j11 = ((long[]) c0236c.f794f)[i13];
                    if (c2433o.f7854d) {
                        int i14 = c2433o.f7857g;
                        long[] jArr = c2433o.f7855e;
                        Object[] objArr = c2433o.f7856f;
                        int i15 = 0;
                        for (int i16 = 0; i16 < i14; i16++) {
                            Object obj2 = objArr[i16];
                            if (obj2 != AbstractC2434p.f7858a) {
                                if (i16 != i15) {
                                    jArr[i15] = jArr[i16];
                                    objArr[i15] = obj2;
                                    objArr[i16] = null;
                                }
                                i15++;
                            }
                        }
                        c2433o.f7854d = false;
                        c2433o.f7857g = i15;
                    }
                    if (AbstractC2477a.m4421b(c2433o.f7855e, c2433o.f7857g, j11) < 0 && i13 < (i6 = c0236c.f793e)) {
                        int i17 = i6 - 1;
                        int i18 = i13;
                        while (i18 < i17) {
                            long[] jArr2 = (long[]) c0236c.f794f;
                            int i19 = i18 + 1;
                            jArr2[i18] = jArr2[i19];
                            i18 = i19;
                        }
                        c0236c.f793e--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c2433o2.m4323h());
                int iM4323h2 = c2433o2.m4323h();
                for (int i20 = 0; i20 < iM4323h2; i20++) {
                    arrayList2.add(c2433o2.m4324i(i20));
                }
                C0200n c0200n2 = new C0200n(arrayList2, c2029h);
                int size2 = arrayList2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i21);
                    if (c2029h.m3724a(((C0209w) obj).f711a)) {
                        break;
                    }
                    i21++;
                }
                C0209w c0209w6 = (C0209w) obj;
                if (c0209w6 != null) {
                    boolean z14 = c0209w6.f714d;
                    if (z5) {
                        z6 = false;
                        if (!this.f692i && (z14 || c0209w6.f718h)) {
                            AbstractC0596h0 abstractC0596h04 = this.f689f;
                            AbstractC1665j.m2982b(abstractC0596h04);
                            long j12 = abstractC0596h04.f1208f;
                            long j13 = c0209w6.f713c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                            int i22 = (int) (j12 >> 32);
                            this.f692i = !((fIntBitsToFloat2 > ((float) ((int) (j12 & 4294967295L))) ? z13 : false) | (fIntBitsToFloat2 < 0.0f ? z13 : false) | (fIntBitsToFloat > ((float) i22) ? z13 : false) | (fIntBitsToFloat < 0.0f ? z13 : false));
                        }
                    } else {
                        z6 = false;
                        this.f692i = false;
                    }
                    boolean z15 = this.f692i;
                    boolean z16 = this.f691h;
                    if (z15 == z16 || !((i5 = c0200n2.f701f) == 3 || i5 == 4 || i5 == 5)) {
                        int i23 = c0200n2.f701f;
                        if (i23 == 4 && z16 && !this.f693j) {
                            c0200n2.f701f = 3;
                        } else if (i23 == 5 && z15 && z14) {
                            c0200n2.f701f = 3;
                        }
                    } else {
                        c0200n2.f701f = z15 ? 4 : 5;
                    }
                } else {
                    z6 = false;
                }
                if (z12 || c0200n2.f701f != 3 || (c0200n = this.f690g) == null) {
                    z7 = z13;
                    break;
                }
                ?? r12 = c0200n.f696a;
                int size3 = r12.size();
                ?? r4 = c0200n2.f696a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z6; r5 < size4; r5++) {
                        if (!C2683b.m4644b(((C0209w) r12.get(r5)).f713c, ((C0209w) r4.get(r5)).f713c)) {
                            z7 = z13;
                            break;
                        }
                    }
                    z7 = z6;
                }
                this.f690g = c0200n2;
                return z7;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p007B0.C0199m
    /* JADX INFO: renamed from: b */
    public final void mo305b(C2029h c2029h) {
        super.mo305b(c2029h);
        C0200n c0200n = this.f690g;
        if (c0200n == null) {
            return;
        }
        this.f691h = this.f692i;
        ?? r12 = c0200n.f696a;
        int size = r12.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0209w c0209w = (C0209w) r12.get(i5);
            boolean z5 = c0209w.f714d;
            long j5 = c0209w.f711a;
            boolean zM3724a = c2029h.m3724a(j5);
            boolean z6 = this.f692i;
            if ((!z5 && !zM3724a) || (!z5 && !z6)) {
                this.f687d.m419h(j5);
            }
        }
        this.f692i = false;
        this.f693j = c0200n.f701f == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0055 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [h0.o] */
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
    /* JADX WARN: Type inference failed for: r3v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: c */
    public final void m306c() {
        C1483e c1483e = this.f694a;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C0198l) objArr[i6]).m306c();
        }
        ?? M1029e = this.f686c;
        ?? c1483e2 = 0;
        while (M1029e != 0) {
            if (M1029e instanceof InterfaceC0624v0) {
                ((InterfaceC0624v0) M1029e).mo291g0();
            } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e).f1943s;
                int i7 = 0;
                M1029e = M1029e;
                c1483e2 = c1483e2;
                while (abstractC2206o != null) {
                    if ((abstractC2206o.f7188f & 16) != 0) {
                        i7++;
                        c1483e2 = c1483e2;
                        if (i7 == 1) {
                            M1029e = abstractC2206o;
                        } else {
                            if (c1483e2 == 0) {
                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                            }
                            if (M1029e != 0) {
                                c1483e2.m2753b(M1029e);
                                M1029e = 0;
                            }
                            c1483e2.m2753b(abstractC2206o);
                        }
                    }
                    abstractC2206o = abstractC2206o.f7191i;
                    M1029e = M1029e;
                    c1483e2 = c1483e2;
                }
                if (i7 == 1) {
                }
            }
            M1029e = AbstractC0601k.m1029e(c1483e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m307d(C2029h c2029h) {
        boolean z5;
        C2433o c2433o = this.f688e;
        if (c2433o.m4323h() == 0) {
            z5 = false;
        } else {
            AbstractC2206o abstractC2206o = this.f686c;
            if (abstractC2206o.f7199q) {
                C0200n c0200n = this.f690g;
                AbstractC1665j.m2982b(c0200n);
                AbstractC0596h0 abstractC0596h0 = this.f689f;
                AbstractC1665j.m2982b(abstractC0596h0);
                long j5 = abstractC0596h0.f1208f;
                ?? M1029e = abstractC2206o;
                ?? c1483e = 0;
                while (true) {
                    z5 = true;
                    if (M1029e == 0) {
                        break;
                    }
                    if (M1029e instanceof InterfaceC0624v0) {
                        ((InterfaceC0624v0) M1029e).mo286K(c0200n, EnumC0201o.f704f, j5);
                    } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                        int i5 = 0;
                        M1029e = M1029e;
                        c1483e = c1483e;
                        while (abstractC2206o2 != null) {
                            if ((abstractC2206o2.f7188f & 16) != 0) {
                                i5++;
                                c1483e = c1483e;
                                if (i5 == 1) {
                                    M1029e = abstractC2206o2;
                                } else {
                                    if (c1483e == 0) {
                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e != 0) {
                                        c1483e.m2753b(M1029e);
                                        M1029e = 0;
                                    }
                                    c1483e.m2753b(abstractC2206o2);
                                }
                            }
                            abstractC2206o2 = abstractC2206o2.f7191i;
                            M1029e = M1029e;
                            c1483e = c1483e;
                        }
                        if (i5 == 1) {
                        }
                    }
                    M1029e = AbstractC0601k.m1029e(c1483e);
                }
                if (abstractC2206o.f7199q) {
                    C1483e c1483e2 = this.f694a;
                    Object[] objArr = c1483e2.f5181d;
                    int i6 = c1483e2.f5183f;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((C0198l) objArr[i7]).m307d(c2029h);
                    }
                }
            }
        }
        mo305b(c2029h);
        int i8 = c2433o.f7857g;
        Object[] objArr2 = c2433o.f7856f;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr2[i9] = null;
        }
        c2433o.f7857g = 0;
        c2433o.f7854d = false;
        this.f689f = null;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0056 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x005f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x00c7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [V.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: e */
    public final boolean m308e(C2029h c2029h, boolean z5) {
        if (this.f688e.m4323h() == 0) {
            return false;
        }
        ?? M1029e = this.f686c;
        if (!M1029e.f7199q) {
            return false;
        }
        C0200n c0200n = this.f690g;
        AbstractC1665j.m2982b(c0200n);
        AbstractC0596h0 abstractC0596h0 = this.f689f;
        AbstractC1665j.m2982b(abstractC0596h0);
        long j5 = abstractC0596h0.f1208f;
        ?? M1029e2 = M1029e;
        ?? c1483e = 0;
        while (M1029e2 != 0) {
            if (M1029e2 instanceof InterfaceC0624v0) {
                ((InterfaceC0624v0) M1029e2).mo286K(c0200n, EnumC0201o.f702d, j5);
            } else if ((M1029e2.f7188f & 16) != 0 && (M1029e2 instanceof AbstractC0599j)) {
                AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e2).f1943s;
                int i5 = 0;
                M1029e2 = M1029e2;
                c1483e = c1483e;
                while (abstractC2206o != null) {
                    if ((abstractC2206o.f7188f & 16) != 0) {
                        i5++;
                        c1483e = c1483e;
                        if (i5 == 1) {
                            M1029e2 = abstractC2206o;
                        } else {
                            if (c1483e == 0) {
                                c1483e = new C1483e(new AbstractC2206o[16]);
                            }
                            if (M1029e2 != 0) {
                                c1483e.m2753b(M1029e2);
                                M1029e2 = 0;
                            }
                            c1483e.m2753b(abstractC2206o);
                        }
                    }
                    abstractC2206o = abstractC2206o.f7191i;
                    M1029e2 = M1029e2;
                    c1483e = c1483e;
                }
                if (i5 == 1) {
                }
            }
            M1029e2 = AbstractC0601k.m1029e(c1483e);
        }
        if (M1029e.f7199q) {
            C1483e c1483e2 = this.f694a;
            Object[] objArr = c1483e2.f5181d;
            int i6 = c1483e2.f5183f;
            for (int i7 = 0; i7 < i6; i7++) {
                C0198l c0198l = (C0198l) objArr[i7];
                AbstractC1665j.m2982b(this.f689f);
                c0198l.m308e(c2029h, z5);
            }
        }
        if (M1029e.f7199q) {
            ?? c1483e3 = 0;
            while (M1029e != 0) {
                if (M1029e instanceof InterfaceC0624v0) {
                    ((InterfaceC0624v0) M1029e).mo286K(c0200n, EnumC0201o.f703e, j5);
                } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                    int i8 = 0;
                    M1029e = M1029e;
                    c1483e3 = c1483e3;
                    while (abstractC2206o2 != null) {
                        if ((abstractC2206o2.f7188f & 16) != 0) {
                            i8++;
                            c1483e3 = c1483e3;
                            if (i8 == 1) {
                                M1029e = abstractC2206o2;
                            } else {
                                if (c1483e3 == 0) {
                                    c1483e3 = new C1483e(new AbstractC2206o[16]);
                                }
                                if (M1029e != 0) {
                                    c1483e3.m2753b(M1029e);
                                    M1029e = 0;
                                }
                                c1483e3.m2753b(abstractC2206o2);
                            }
                        }
                        abstractC2206o2 = abstractC2206o2.f7191i;
                        M1029e = M1029e;
                        c1483e3 = c1483e3;
                    }
                    if (i8 == 1) {
                    }
                }
                M1029e = AbstractC0601k.m1029e(c1483e3);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m309f(long j5, C2404A c2404a) {
        C0236c c0236c = this.f687d;
        if (c0236c.m415c(j5) && c2404a.m4249g(this) < 0) {
            c0236c.m419h(j5);
            this.f688e.m4322g(j5);
        }
        C1483e c1483e = this.f694a;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C0198l) objArr[i6]).m309f(j5, c2404a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Node(modifierNode=" + this.f686c + ", children=" + this.f694a + ", pointerIds=" + this.f687d + ')';
    }
}
