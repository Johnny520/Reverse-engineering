package p007B0;

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

    public C0191e(InterfaceC0430v interfaceC0430v) {
        this.f665a = interfaceC0430v;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m292a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0191e.m292a(long, java.util.List, boolean):void");
    }

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
