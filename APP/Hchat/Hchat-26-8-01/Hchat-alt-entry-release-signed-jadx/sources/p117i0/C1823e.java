package p117i0;

import gg.AbstractC1416l;
import p089g1.C1275d;
import p162l3.C2463q;
import p223p0.C3274b;
import p223p0.C3282j;
import p235q0.C3419a;
import p235q0.C3420b;
import p252r0.C3643b;
import tg.C4183b0;
import ug.AbstractC4338c;
import wf.InterfaceC5560f;

/* JADX INFO: renamed from: i0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1823e implements InterfaceC5560f {

    /* JADX INFO: renamed from: h */
    public static final C1275d f6047h = new C1275d(14);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C1823e f6048i = new C1823e(1);

    /* JADX INFO: renamed from: j */
    public static final C1823e f6049j = new C1823e(2);

    /* JADX INFO: renamed from: k */
    public static final C1823e f6050k = new C1823e(3);

    /* JADX INFO: renamed from: l */
    public static final C1823e f6051l = new C1823e(4);

    /* JADX INFO: renamed from: m */
    public static final C1823e f6052m = new C1823e(5);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6053g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i0.e.<clinit>():void, i0.l.<clinit>():void] */
    public /* synthetic */ C1823e(int i9) {
        this.f6053g = i9;
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
    /* JADX INFO: renamed from: a */
    public static final void m4459a(C1823e c1823e) {
        C4183b0 c4183b0;
        C3420b c3420b;
        Object obj;
        C4183b0 c4183b02 = C1897y1.f6302z;
        do {
            c4183b0 = C1897y1.f6302z;
            C3420b c3420b2 = (C3420b) c4183b0.getValue();
            C3274b c3274bM6938a = c3420b2.f11049i;
            C3419a c3419a = (C3419a) c3274bM6938a.get(c1823e);
            if (c3419a == null) {
                c3420b = c3420b2;
            } else {
                Object obj2 = c3419a.f11044a;
                Object obj3 = c3419a.f11045b;
                C3282j c3282j = c3274bM6938a.f10424g;
                C3282j c3282jM6964v = c3282j.m6964v(c1823e != null ? c1823e.hashCode() : 0, 0, c1823e);
                if (c3282j != c3282jM6964v) {
                    c3274bM6938a = c3282jM6964v == null ? C3274b.f10423i : new C3274b(c3282jM6964v, c3274bM6938a.f10425h - 1);
                }
                C3643b c3643b = C3643b.f11822a;
                if (obj2 != c3643b) {
                    Object obj4 = c3274bM6938a.get(obj2);
                    obj4.getClass();
                    c3274bM6938a = c3274bM6938a.m6938a(obj2, new C3419a(((C3419a) obj4).f11044a, obj3));
                }
                if (obj3 != c3643b) {
                    Object obj5 = c3274bM6938a.get(obj3);
                    obj5.getClass();
                    c3274bM6938a = c3274bM6938a.m6938a(obj3, new C3419a(obj2, ((C3419a) obj5).f11045b));
                }
                Object obj6 = obj2 != c3643b ? c3420b2.f11047g : obj3;
                if (obj3 != c3643b) {
                    obj2 = c3420b2.f11048h;
                }
                c3420b = new C3420b(obj6, obj2, c3274bM6938a);
            }
            if (c3420b2 == c3420b) {
                return;
            }
            C2463q c2463q = AbstractC4338c.f14500b;
            obj = c3420b2;
            if (c3420b2 == null) {
                obj = c2463q;
            }
        } while (!c4183b0.m8446h(obj, c3420b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean m4460b(Object obj, Object obj2) {
        switch (this.f6053g) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return AbstractC1416l.m3825a(obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f6053g) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
