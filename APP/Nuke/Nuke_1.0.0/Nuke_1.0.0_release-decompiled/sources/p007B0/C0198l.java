package p007B0;

import p013C0.C0236c;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0624v0;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p154e2.C2029h;
import p169h0.AbstractC2206o;
import p186k.C2404A;
import p186k.C2433o;

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

    public C0198l(AbstractC2206o abstractC2206o) {
        this.f686c = abstractC2206o;
        C0236c c0236c = new C0236c(0);
        c0236c.f794f = new long[2];
        this.f687d = c0236c;
        this.f688e = new C2433o(2);
        this.f692i = true;
        this.f693j = true;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo304a(p186k.C2433o r53, p029F0.InterfaceC0430v r54, p154e2.C2029h r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0198l.mo304a(k.o, F0.v, e2.h, boolean):boolean");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m307d(p154e2.C2029h r15) {
        /*
            r14 = this;
            k.o r0 = r14.f688e
            int r1 = r0.m4323h()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            h0.o r1 = r14.f686c
            boolean r4 = r1.f7199q
            if (r4 != 0) goto L14
            goto La
        L14:
            B0.n r4 = r14.f690g
            p117X2.AbstractC1665j.m2982b(r4)
            H0.h0 r5 = r14.f689f
            p117X2.AbstractC1665j.m2982b(r5)
            long r5 = r5.f1208f
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof p041H0.InterfaceC0624v0
            if (r10 == 0) goto L31
            H0.v0 r7 = (p041H0.InterfaceC0624v0) r7
            B0.o r9 = p007B0.EnumC0201o.f704f
            r7.mo286K(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.f7188f
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof p041H0.AbstractC0599j
            if (r10 == 0) goto L67
            r10 = r7
            H0.j r10 = (p041H0.AbstractC0599j) r10
            h0.o r10 = r10.f1943s
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.f7188f
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            V.e r8 = new V.e
            h0.o[] r13 = new p169h0.AbstractC2206o[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.m2753b(r7)
            r7 = r2
        L5e:
            r8.m2753b(r10)
        L61:
            h0.o r10 = r10.f7191i
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            h0.o r7 = p041H0.AbstractC0601k.m1029e(r8)
            goto L22
        L6c:
            boolean r1 = r1.f7199q
            if (r1 == 0) goto L83
            V.e r1 = r14.f694a
            java.lang.Object[] r4 = r1.f5181d
            int r1 = r1.f5183f
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            B0.l r6 = (p007B0.C0198l) r6
            r6.m307d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.mo305b(r15)
            int r15 = r0.f7857g
            java.lang.Object[] r1 = r0.f7856f
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.f7857g = r3
            r0.f7854d = r3
            r14.f689f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0198l.m307d(e2.h):boolean");
    }

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

    public final String toString() {
        return "Node(modifierNode=" + this.f686c + ", children=" + this.f694a + ", pointerIds=" + this.f687d + ')';
    }
}
