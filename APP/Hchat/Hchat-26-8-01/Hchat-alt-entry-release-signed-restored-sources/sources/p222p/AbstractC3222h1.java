package p222p;

import p015b0.C0154t;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: p.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3222h1 {

    /* JADX INFO: renamed from: a */
    public static final C3200a0 f10287a = new C3200a0(EnumC3269y.f10411h, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final C3200a0 f10288b = new C3200a0(EnumC3269y.f10410g, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final C3200a0 f10289c;

    /* JADX INFO: renamed from: d */
    public static final C3258t1 f10290d;

    /* JADX INFO: renamed from: e */
    public static final C3258t1 f10291e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3269y enumC3269y = EnumC3269y.f10412i;
        f10289c = new C3200a0(enumC3269y, 1.0f);
        C5845g c5845g = C5840b.f23765k;
        int i9 = 17;
        f10290d = new C3258t1(enumC3269y, new C0154t(c5845g, i9), c5845g);
        C5845g c5845g2 = C5840b.f23761g;
        f10291e = new C3258t1(enumC3269y, new C0154t(c5845g2, i9), c5845g2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5853o m6898a(float f3, float f10) {
        return new C3237m1(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC5853o m6899b(float f3) {
        return new C3237m1(f3, Float.NaN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC5853o m6900c(InterfaceC5853o interfaceC5853o) {
        return interfaceC5853o.mo10549d(f10289c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC5853o m6901d(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(f3 == 1.0f ? f10287a : new C3200a0(EnumC3269y.f10411h, f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC5853o m6902e(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3219g1(0.0f, f3, 0.0f, f3, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC5853o m6903f(InterfaceC5853o interfaceC5853o, float f3, float f10) {
        return interfaceC5853o.mo10549d(new C3219g1(0.0f, f3, 0.0f, f10, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC5853o m6904g(InterfaceC5853o interfaceC5853o, float f3, float f10, int i9) {
        if ((i9 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i9 & 2) != 0) {
            f10 = Float.NaN;
        }
        return m6903f(interfaceC5853o, f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC5853o m6905h(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, f3, f3, f3, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static InterfaceC5853o m6906i(InterfaceC5853o interfaceC5853o, float f3, float f10, float f11, float f12, int i9) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, (i9 & 2) != 0 ? Float.NaN : f10, (i9 & 4) != 0 ? Float.NaN : f11, (i9 & 8) != 0 ? Float.NaN : f12, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC5853o m6907j(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, f3, f3, f3, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC5853o m6908k(InterfaceC5853o interfaceC5853o, float f3, float f10) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, f10, f3, f10, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC5853o m6909l(InterfaceC5853o interfaceC5853o, float f3, float f10, float f11, float f12) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, f10, f11, f12, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC5853o m6910m(InterfaceC5853o interfaceC5853o, float f3, float f10, int i9) {
        if ((i9 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i9 & 4) != 0) {
            f10 = Float.NaN;
        }
        return m6909l(interfaceC5853o, f3, Float.NaN, f10, Float.NaN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC5853o m6911n(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3219g1(f3, 0.0f, f3, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static InterfaceC5853o m6912o(InterfaceC5853o interfaceC5853o, float f3) {
        return interfaceC5853o.mo10549d(new C3219g1(Float.NaN, 0.0f, f3, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public static InterfaceC5853o m6913p(InterfaceC5853o interfaceC5853o) {
        C3258t1 c3258t1;
        C5845g c5845g = C5840b.f23765k;
        if (c5845g.equals(c5845g)) {
            c3258t1 = f10290d;
        } else if (c5845g.equals(C5840b.f23761g)) {
            c3258t1 = f10291e;
        } else {
            c3258t1 = new C3258t1(EnumC3269y.f10412i, new C0154t(c5845g, 17), c5845g);
        }
        return interfaceC5853o.mo10549d(c3258t1);
    }
}
