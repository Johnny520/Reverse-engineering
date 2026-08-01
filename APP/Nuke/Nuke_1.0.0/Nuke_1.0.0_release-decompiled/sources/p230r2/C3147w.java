package p230r2;

import com.bumptech.glide.AbstractC1923e;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p154e2.C2029h;
import p213o2.AbstractC2770B;
import p213o2.C2781j;
import p213o2.C2785n;
import p213o2.EnumC2779h;
import p213o2.InterfaceC2771C;
import p224q2.AbstractC2917h;
import p224q2.C2913d;
import p241t2.AbstractC3211c;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3147w implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final C2029h f9905d;

    /* JADX INFO: renamed from: e */
    public final EnumC2779h f9906e;

    /* JADX INFO: renamed from: f */
    public final C2913d f9907f;

    /* JADX INFO: renamed from: g */
    public final C3136l f9908g;

    /* JADX INFO: renamed from: h */
    public final List f9909h;

    public C3147w(C2029h c2029h, EnumC2779h enumC2779h, C2913d c2913d, C3136l c3136l, List list) {
        this.f9905d = c2029h;
        this.f9906e = enumC2779h;
        this.f9907f = c2913d;
        this.f9908g = c3136l;
        this.f9909h = list;
    }

    /* JADX INFO: renamed from: b */
    public static void m5419b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC3211c.m5489c(field) + " and " + AbstractC3211c.m5489c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class cls = c3352a.f10417a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C2781j(2);
        }
        AbstractC2917h.m5114f(this.f9909h);
        return AbstractC3211c.f9992a.mo3488I(cls) ? new C3146v(cls, m5420c(c2785n, c3352a, cls, true)) : new C3144t(this.f9905d.m3725c(c3352a, true), m5420c(c2785n, c3352a, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [r2.w] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p230r2.C3145u m5420c(p213o2.C2785n r30, p252v2.C3352a r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p230r2.C3147w.m5420c(o2.n, v2.a, java.lang.Class, boolean):r2.u");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5421d(Field field, boolean z5) {
        boolean z6;
        C2913d c2913d = this.f9907f;
        c2913d.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c2913d.m5108e(field.getType(), z5)) {
            z6 = true;
        } else {
            List list = z5 ? c2913d.f9208d : c2913d.f9209e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z6 = false;
        }
        return !z6;
    }
}
