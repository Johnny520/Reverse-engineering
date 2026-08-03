package p267s1;

import gg.AbstractC1416l;
import java.util.List;
import p028c1.C0372b;
import p069f.C0933f0;
import p069f.C0952p;
import p069f.C0968z;
import p100h0.C1545q0;
import p131j0.C2046b;
import p308v1.InterfaceC4428t;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3889d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4428t f12754a;

    /* JADX INFO: renamed from: b */
    public boolean f12755b;

    /* JADX INFO: renamed from: c */
    public boolean f12756c;

    /* JADX INFO: renamed from: d */
    public boolean f12757d;

    /* JADX INFO: renamed from: e */
    public boolean f12758e;

    /* JADX INFO: renamed from: f */
    public final C0933f0 f12759f = new C0933f0();

    /* JADX INFO: renamed from: g */
    public final C3901j f12760g = new C3901j();

    /* JADX INFO: renamed from: h */
    public final C0968z f12761h = new C0968z(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3889d(InterfaceC4428t interfaceC4428t) {
        this.f12754a = interfaceC4428t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8075a(long j3, List list, boolean z9) {
        C0968z c0968z;
        int i9;
        C3899i c3899i;
        Object obj;
        int size = list.size();
        C3901j c3901j = this.f12760g;
        C3901j c3901j2 = c3901j;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            c0968z = this.f12761h;
            if (i10 >= size) {
                break;
            }
            AbstractC5852n abstractC5852n = (AbstractC5852n) list.get(i10);
            if (abstractC5852n.f23801t) {
                abstractC5852n.f23800s = new C0372b(this, 3, abstractC5852n);
                if (z10) {
                    C2046b c2046b = c3901j2.f12795a;
                    Object[] objArr = c2046b.f6891g;
                    int i11 = c2046b.f6893i;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i12];
                        if (AbstractC1416l.m3825a(((C3899i) obj).f12783c, abstractC5852n)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    c3899i = (C3899i) obj;
                    if (c3899i != null) {
                        c3899i.f12789i = true;
                        c3899i.f12784d.m199c(j3);
                        if (z9) {
                            Object objM2390d = c0968z.m2390d(j3);
                            if (objM2390d == null) {
                                objM2390d = new C0933f0();
                                c0968z.m2393g(objM2390d, j3);
                            }
                            ((C0933f0) objM2390d).m2286a(c3899i);
                        }
                        c3901j2 = c3899i;
                    } else {
                        z10 = false;
                        c3899i = new C3899i(abstractC5852n);
                        c3899i.f12784d.m199c(j3);
                        if (z9) {
                            Object objM2390d2 = c0968z.m2390d(j3);
                            if (objM2390d2 == null) {
                                objM2390d2 = new C0933f0();
                                c0968z.m2393g(objM2390d2, j3);
                            }
                            ((C0933f0) objM2390d2).m2286a(c3899i);
                        }
                        c3901j2.f12795a.m5056b(c3899i);
                        c3901j2 = c3899i;
                    }
                } else {
                    c3899i = new C3899i(abstractC5852n);
                    c3899i.f12784d.m199c(j3);
                    if (z9) {
                    }
                    c3901j2.f12795a.m5056b(c3899i);
                    c3901j2 = c3899i;
                }
            }
            i10++;
        }
        if (z9) {
            long[] jArr = c0968z.f3046b;
            Object[] objArr2 = c0968z.f3047c;
            long[] jArr2 = c0968z.f3045a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j4 = jArr2[i13];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((255 & j4) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j5 = jArr[i17];
                                C0933f0 c0933f0 = (C0933f0) objArr2[i17];
                                i9 = i14;
                                C2046b c2046b2 = c3901j.f12795a;
                                Object[] objArr3 = c2046b2.f6891g;
                                int i18 = c2046b2.f6893i;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((C3899i) objArr3[i19]).m8097f(j5, c0933f0);
                                }
                            } else {
                                i9 = i14;
                            }
                            j4 >>= i9;
                            i16++;
                            i14 = i9;
                        }
                        if (i15 != i14) {
                            break;
                        } else if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        c0968z.m2387a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m8076b(C1545q0 c1545q0, boolean z9) {
        C0952p c0952p = (C0952p) c1545q0.f5153c;
        InterfaceC4428t interfaceC4428t = this.f12754a;
        C3901j c3901j = this.f12760g;
        boolean zMo8092a = c3901j.mo8092a(c0952p, interfaceC4428t, c1545q0, z9);
        C2046b c2046b = c3901j.f12795a;
        if (!zMo8092a) {
            return false;
        }
        boolean z10 = true;
        this.f12755b = true;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        boolean z11 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            z11 = ((C3899i) objArr[i10]).m8096e(c1545q0, z9) || z11;
        }
        Object[] objArr2 = c2046b.f6891g;
        int i11 = c2046b.f6893i;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z12 = ((C3899i) objArr2[i12]).m8095d(c1545q0) || z12;
        }
        c3901j.mo8093b(c1545q0);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.f12755b = false;
        if (this.f12758e) {
            this.f12758e = false;
            C0933f0 c0933f0 = this.f12759f;
            int i13 = c0933f0.f2924b;
            for (int i14 = 0; i14 < i13; i14++) {
                m8078d((AbstractC5852n) c0933f0.m2291f(i14));
            }
            c0933f0.m2289d();
        }
        if (this.f12756c) {
            this.f12756c = false;
            m8077c();
        }
        if (this.f12757d) {
            this.f12757d = false;
            c3901j.f12795a.m5061g();
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m8077c() {
        if (this.f12755b) {
            this.f12756c = true;
            return;
        }
        C3901j c3901j = this.f12760g;
        C2046b c2046b = c3901j.f12795a;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C3899i) objArr[i10]).m8094c();
        }
        if (this.f12757d) {
            this.f12757d = true;
        } else {
            c3901j.f12795a.m5061g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: d */
    public final void m8078d(AbstractC5852n abstractC5852n) {
        if (this.f12755b) {
            this.f12758e = true;
            this.f12759f.m2286a(abstractC5852n);
            return;
        }
        C3901j c3901j = this.f12760g;
        C0933f0 c0933f0 = c3901j.f12796b;
        c0933f0.m2289d();
        c0933f0.m2286a(c3901j);
        while (c0933f0.m2294i()) {
            C3901j c3901j2 = (C3901j) c0933f0.m2296k(c0933f0.f2924b - 1);
            int i9 = 0;
            while (true) {
                C2046b c2046b = c3901j2.f12795a;
                if (i9 < c2046b.f6893i) {
                    C3899i c3899i = (C3899i) c2046b.f6891g[i9];
                    if (AbstractC1416l.m3825a(c3899i.f12783c, abstractC5852n)) {
                        c3901j2.f12795a.m5064j(c3899i);
                        c3899i.m8094c();
                    } else {
                        c0933f0.m2286a(c3899i);
                        i9++;
                    }
                }
            }
        }
    }
}
