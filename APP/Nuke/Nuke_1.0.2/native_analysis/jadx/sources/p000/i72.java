package p000;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i72 {

    /* JADX INFO: renamed from: a */
    public final String f4471a;

    /* JADX INFO: renamed from: b */
    public final Field f4472b;

    /* JADX INFO: renamed from: c */
    public final String f4473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f4474d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ q43 f4475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ q43 f4476f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f4477g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f4478h;

    public i72(String str, Field field, Method method, q43 q43Var, q43 q43Var2, boolean z, boolean z2) {
        this.f4474d = method;
        this.f4475e = q43Var;
        this.f4476f = q43Var2;
        this.f4477g = z;
        this.f4478h = z2;
        this.f4471a = str;
        this.f4472b = field;
        this.f4473c = field.getName();
    }

    /* JADX INFO: renamed from: a */
    public final void m2297a(o41 o41Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f4474d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new t31(vi0.m5691j("Accessor ", h72.m2119d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.f4472b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        o41Var.m3496k(this.f4471a);
        this.f4475e.mo98c(o41Var, objInvoke);
    }
}
