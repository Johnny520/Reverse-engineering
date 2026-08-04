package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛸᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1782 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8972;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f8973;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8974;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Field f8975;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8976;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f8977;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f8978;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Method f8979;

    public C1782(String str, Field field, Method method, AbstractC2720 abstractC2720, AbstractC2720 abstractC27202, boolean z, boolean z2) {
        this.f8979 = method;
        this.f8973 = abstractC2720;
        this.f8978 = abstractC27202;
        this.f8976 = z;
        this.f8972 = z2;
        this.f8974 = str;
        this.f8975 = field;
        this.f8977 = field.getName();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3540(C1405 c1405, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f8979;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C1600(AbstractC2104.m4014("Accessor ", AbstractC1301.m2589(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.f8975.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c1405.m2856(this.f8974);
        this.f8973.mo485(c1405, objInvoke);
    }
}
