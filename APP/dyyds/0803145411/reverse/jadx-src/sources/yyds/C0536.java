package yyds;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛳᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536 extends AbstractC0625 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Method f2572;

    public C0536(Method method) {
        this.f2572 = method;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final Object m1372(Object... objArr) {
        m3482();
        return this.f2572.invoke(this.f3014, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final Member mo1373() {
        return this.f2572;
    }

    @Override // yyds.AbstractC0625
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final AbstractC0625 mo1374(Object obj) {
        m1524(obj);
        return this;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final Object m1375(Object... objArr) {
        Object c2658;
        try {
            c2658 = m1372(Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final Object m1376(Object... objArr) {
        Object c2658;
        try {
            c2658 = m1377(Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final Object m1377(Object... objArr) throws IllegalAccessException, InvocationTargetException {
        m3482();
        Object objInvoke = this.f2572.invoke(this.f3014, Arrays.copyOf(objArr, objArr.length));
        if (objInvoke == null) {
            return null;
        }
        return objInvoke;
    }
}
