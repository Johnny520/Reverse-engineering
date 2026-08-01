package p230r2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p011B4.AbstractC0231b;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p241t2.AbstractC3211c;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3142r {

    /* JADX INFO: renamed from: a */
    public final String f9888a;

    /* JADX INFO: renamed from: b */
    public final Field f9889b;

    /* JADX INFO: renamed from: c */
    public final String f9890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f9891d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC2770B f9892e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC2770B f9893f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f9894g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f9895h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3142r(String str, Field field, Method method, AbstractC2770B abstractC2770B, AbstractC2770B abstractC2770B2, boolean z5, boolean z6) {
        this.f9891d = method;
        this.f9892e = abstractC2770B;
        this.f9893f = abstractC2770B2;
        this.f9894g = z5;
        this.f9895h = z6;
        this.f9888a = str;
        this.f9889b = field;
        this.f9890c = field.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5415a(C3391b c3391b, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f9891d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e5) {
                throw new C2789r(AbstractC0231b.m400k("Accessor ", AbstractC3211c.m5490d(method, false), " threw exception"), e5.getCause());
            }
        } else {
            objInvoke = this.f9889b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c3391b.m5664l(this.f9888a);
        this.f9892e.mo4965c(c3391b, objInvoke);
    }
}
