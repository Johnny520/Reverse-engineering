package p042W;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p022L.AbstractC0174d;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.C0265p;
import p045Y.AbstractC0357c;
import p049a0.C0367a;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0342n {

    /* JADX INFO: renamed from: a */
    public final String f765a;

    /* JADX INFO: renamed from: b */
    public final Field f766b;

    /* JADX INFO: renamed from: c */
    public final String f767c;

    /* JADX INFO: renamed from: d */
    public final boolean f768d;

    /* JADX INFO: renamed from: e */
    public final boolean f769e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Method f770f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f771g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC0274y f772h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0261l f773i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0367a f774j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f775k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f776l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0342n(String str, Field field, boolean z2, boolean z3, Method method, boolean z4, AbstractC0274y abstractC0274y, C0261l c0261l, C0367a c0367a, boolean z5, boolean z6) {
        this.f770f = method;
        this.f771g = z4;
        this.f772h = abstractC0274y;
        this.f773i = c0261l;
        this.f774j = c0367a;
        this.f775k = z5;
        this.f776l = z6;
        this.f765a = str;
        this.f766b = field;
        this.f767c = field.getName();
        this.f768d = z2;
        this.f769e = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m601a(C0494c c0494c, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f768d) {
            Field field = this.f766b;
            Method method = this.f770f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e2) {
                    throw new C0265p(AbstractC0174d.m353i("Accessor ", AbstractC0357c.m615d(method, false), " threw exception"), e2.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c0494c.mo590g(this.f765a);
            boolean z2 = this.f771g;
            AbstractC0274y c0347s = this.f772h;
            if (!z2) {
                c0347s = new C0347s(this.f773i, c0347s, this.f774j.f861b);
            }
            c0347s.mo477b(c0494c, objInvoke);
        }
    }
}
