package p151k6;

import af.C0081d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p068eh.AbstractC0921a;
import p105h6.AbstractC1622n;
import p165l6.AbstractC2512c;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2313r {

    /* JADX INFO: renamed from: a */
    public final String f7632a;

    /* JADX INFO: renamed from: b */
    public final Field f7633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f7634c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1622n f7635d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2313r(String str, Field field, Method method, AbstractC1622n abstractC1622n) {
        this.f7634c = method;
        this.f7635d = abstractC1622n;
        this.f7632a = str;
        this.f7633b = field;
        field.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5530a(C3066a c3066a, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f7634c;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new C0081d(AbstractC0921a.m2251n("Accessor ", AbstractC2512c.m5902d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            objInvoke = this.f7633b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c3066a.m6506i(this.f7632a);
        this.f7635d.mo4127b(c3066a, objInvoke);
    }
}
