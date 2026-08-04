package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛸᲀᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1872 extends AbstractC1741 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Method f9420;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Method f9421;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Method f9423 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Method f9422 = Class.class.getMethod("getRecordComponents", null);

    public C1872() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f9420 = cls.getMethod("getName", null);
        this.f9421 = cls.getMethod("getType", null);
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final Constructor mo2340(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f9422.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f9421.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            C1693.m3442("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final boolean mo2341(Class cls) {
        try {
            return ((Boolean) this.f9423.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            C1693.m3442("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Method mo2342(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            C1693.m3442("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String[] mo2343(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f9422.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f9420.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            C1693.m3442("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
