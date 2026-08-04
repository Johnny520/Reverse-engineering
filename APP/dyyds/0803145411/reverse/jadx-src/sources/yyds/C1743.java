package yyds;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: renamed from: yyds.ᛸᛳᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1743 implements InterfaceC1863 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8797;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f8798;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f8799;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0078 f8800 = new C0078(new C1223(5, this));

    public C1743(String str) {
        int iM1311 = AbstractC0473.m1311(str, "->", 0, false, 6);
        int iM13112 = AbstractC0473.m1311(str, ":", iM1311 + 1, false, 4);
        if (iM1311 == -1 || iM13112 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f8797 = AbstractC2431.m4474(str.substring(0, iM1311));
        this.f8798 = str.substring(iM1311 + 2, iM13112);
        this.f8799 = AbstractC2431.m4474(str.substring(iM13112 + 1));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Field m3483(C1743 c1743, ClassLoader classLoader) throws NoSuchFieldException {
        Object c2658;
        Object c26582;
        c1743.getClass();
        C0078 c0078 = c1743.f8800;
        C0299 c0299 = AbstractC1962.f9855;
        String str = c1743.f8798;
        Class clsM3794 = AbstractC1962.m3794(classLoader, c1743.f8797);
        try {
            c2658 = AbstractC1962.m3794(classLoader, c1743.f8799);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + c1743 + " not available: type missing");
            noSuchFieldException.initCause(thM4249);
            throw noSuchFieldException;
        }
        Class cls = (Class) c2658;
        Class superclass = clsM3794;
        while (true) {
            if (superclass == null) {
                for (Class superclass2 = clsM3794; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Field[] declaredFields = superclass2.getDeclaredFields();
                        int i = 0;
                        while (i < declaredFields.length) {
                            int i2 = i + 1;
                            try {
                                Field field = declaredFields[i];
                                if (AbstractC1544.m3188(str, field.getName()) && AbstractC1544.m3188((String) c0078.getValue(), AbstractC2431.m4475(field.getType()))) {
                                    field.setAccessible(true);
                                    return field;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                Field reflectedField = NativeReflect.getReflectedField(clsM3794, str, (String) c0078.getValue(), null);
                if (reflectedField != null) {
                    reflectedField.setAccessible(true);
                    return reflectedField;
                }
                throw new NoSuchFieldException("Field " + c1743 + " not found");
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                c26582 = declaredField;
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            Field field2 = (Field) (c26582 instanceof C2658 ? null : c26582);
            if (field2 != null && AbstractC1544.m3188(field2.getType(), cls)) {
                return field2;
            }
            superclass = superclass.getSuperclass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1743)) {
            return false;
        }
        C1743 c1743 = (C1743) obj;
        return AbstractC1544.m3188(this.f8797, c1743.f8797) && AbstractC1544.m3188(this.f8798, c1743.f8798) && AbstractC1544.m3188(this.f8799, c1743.f8799);
    }

    public final int hashCode() {
        return this.f8799.hashCode() + (this.f8798.hashCode() * 31) + (this.f8797.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2431.m4476(this.f8797) + "->" + this.f8798 + ":" + ((String) this.f8800.getValue());
    }
}
