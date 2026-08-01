package p007B0;

import java.util.List;
import p029F0.InterfaceC0430v;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p154e2.C2029h;
import p169h0.AbstractC2206o;
import p186k.C2404A;
import p186k.C2433o;
import p186k.C2442x;

/* JADX INFO: renamed from: B0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0191e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0430v f665a;

    /* JADX INFO: renamed from: b */
    public boolean f666b;

    /* JADX INFO: renamed from: c */
    public boolean f667c;

    /* JADX INFO: renamed from: d */
    public boolean f668d;

    /* JADX INFO: renamed from: e */
    public boolean f669e;

    /* JADX INFO: renamed from: f */
    public final C2404A f670f = new C2404A();

    /* JADX INFO: renamed from: g */
    public final C0199m f671g = new C0199m();

    /* JADX INFO: renamed from: h */
    public final C2442x f672h = new C2442x(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0191e(InterfaceC0430v interfaceC0430v) {
        this.f665a = interfaceC0430v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m292a(long j5, List list, boolean z5) {
        C2442x c2442x;
        int i5;
        C0198l c0198l;
        Object obj;
        int size = list.size();
        C0199m c0199m = this.f671g;
        C0199m c0199m2 = c0199m;
        boolean z6 = true;
        int i6 = 0;
        while (true) {
            c2442x = this.f672h;
            if (i6 >= size) {
                break;
            }
            AbstractC2206o abstractC2206o = (AbstractC2206o) list.get(i6);
            if (abstractC2206o.f7199q) {
                abstractC2206o.f7198p = new C0190d(0, this, abstractC2206o);
                if (z6) {
                    C1483e c1483e = c0199m2.f694a;
                    Object[] objArr = c1483e.f5181d;
                    int i7 = c1483e.f5183f;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i8];
                        if (AbstractC1665j.m2981a(((C0198l) obj).f686c, abstractC2206o)) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    c0198l = (C0198l) obj;
                    if (c0198l != null) {
                        c0198l.f692i = true;
                        c0198l.f687d.m414a(j5);
                        if (z5) {
                            Object objM4355d = c2442x.m4355d(j5);
                            if (objM4355d == null) {
                                objM4355d = new C2404A();
                                c2442x.m4357f(j5, objM4355d);
                            }
                            ((C2404A) objM4355d).m4243a(c0198l);
                        }
                        c0199m2 = c0198l;
                    } else {
                        z6 = false;
                        c0198l = new C0198l(abstractC2206o);
                        c0198l.f687d.m414a(j5);
                        if (z5) {
                            Object objM4355d2 = c2442x.m4355d(j5);
                            if (objM4355d2 == null) {
                                objM4355d2 = new C2404A();
                                c2442x.m4357f(j5, objM4355d2);
                            }
                            ((C2404A) objM4355d2).m4243a(c0198l);
                        }
                        c0199m2.f694a.m2753b(c0198l);
                        c0199m2 = c0198l;
                    }
                } else {
                    c0198l = new C0198l(abstractC2206o);
                    c0198l.f687d.m414a(j5);
                    if (z5) {
                    }
                    c0199m2.f694a.m2753b(c0198l);
                    c0199m2 = c0198l;
                }
            }
            i6++;
        }
        if (z5) {
            long[] jArr = c2442x.f7888b;
            Object[] objArr2 = c2442x.f7889c;
            long[] jArr2 = c2442x.f7887a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j6 = jArr2[i9];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((255 & j6) < 128) {
                                int i13 = (i9 << 3) + i12;
                                long j7 = jArr[i13];
                                C2404A c2404a = (C2404A) objArr2[i13];
                                i5 = i10;
                                C1483e c1483e2 = c0199m.f694a;
                                Object[] objArr3 = c1483e2.f5181d;
                                int i14 = c1483e2.f5183f;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    ((C0198l) objArr3[i15]).m309f(j7, c2404a);
                                }
                            } else {
                                i5 = i10;
                            }
                            j6 >>= i5;
                            i12++;
                            i10 = i5;
                        }
                        if (i11 != i10) {
                            break;
                        } else if (i9 == length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
        }
        c2442x.m4352a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m293b(C2029h c2029h, boolean z5) {
        C2433o c2433o = (C2433o) c2029h.f6763f;
        InterfaceC0430v interfaceC0430v = this.f665a;
        C0199m c0199m = this.f671g;
        boolean zMo304a = c0199m.mo304a(c2433o, interfaceC0430v, c2029h, z5);
        C1483e c1483e = c0199m.f694a;
        if (!zMo304a) {
            return false;
        }
        boolean z6 = true;
        this.f666b = true;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        boolean z7 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            z7 = ((C0198l) objArr[i6]).m308e(c2029h, z5) || z7;
        }
        Object[] objArr2 = c1483e.f5181d;
        int i7 = c1483e.f5183f;
        boolean z8 = false;
        for (int i8 = 0; i8 < i7; i8++) {
            z8 = ((C0198l) objArr2[i8]).m307d(c2029h) || z8;
        }
        c0199m.mo305b(c2029h);
        if (!z8 && !z7) {
            z6 = false;
        }
        this.f666b = false;
        if (this.f669e) {
            this.f669e = false;
            C2404A c2404a = this.f670f;
            int i9 = c2404a.f7767b;
            for (int i10 = 0; i10 < i9; i10++) {
                m295d((AbstractC2206o) c2404a.m4248f(i10));
            }
            c2404a.m4246d();
        }
        if (this.f667c) {
            this.f667c = false;
            m294c();
        }
        if (this.f668d) {
            this.f668d = false;
            c0199m.f694a.m2758g();
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m294c() {
        if (this.f666b) {
            this.f667c = true;
            return;
        }
        C0199m c0199m = this.f671g;
        C1483e c1483e = c0199m.f694a;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((C0198l) objArr[i6]).m306c();
        }
        if (this.f668d) {
            this.f668d = true;
        } else {
            c0199m.f694a.m2758g();
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
    public final void m295d(AbstractC2206o abstractC2206o) {
        if (this.f666b) {
            this.f669e = true;
            this.f670f.m4243a(abstractC2206o);
            return;
        }
        C0199m c0199m = this.f671g;
        C2404A c2404a = c0199m.f695b;
        c2404a.m4246d();
        c2404a.m4243a(c0199m);
        while (c2404a.m4251i()) {
            C0199m c0199m2 = (C0199m) c2404a.m4253k(c2404a.f7767b - 1);
            int i5 = 0;
            while (true) {
                C1483e c1483e = c0199m2.f694a;
                if (i5 < c1483e.f5183f) {
                    C0198l c0198l = (C0198l) c1483e.f5181d[i5];
                    if (AbstractC1665j.m2981a(c0198l.f686c, abstractC2206o)) {
                        c0199m2.f694a.m2761j(c0198l);
                        c0198l.m306c();
                    } else {
                        c2404a.m4243a(c0198l);
                        i5++;
                    }
                }
            }
        }
    }
}
