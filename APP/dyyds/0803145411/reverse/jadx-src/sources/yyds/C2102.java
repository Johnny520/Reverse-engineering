package yyds;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᲀᲁᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0414 f10427 = new C0414();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final HashMap f10428;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap f10429;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final HashMap f10430;

    public C2102(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int iCeil = (int) Math.ceil(i / 0.75f);
            this.f10428 = new HashMap(iCeil);
            this.f10429 = new HashMap(iCeil);
            this.f10430 = new HashMap(iCeil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC0770 interfaceC0770 = (InterfaceC0770) field2.getAnnotation(InterfaceC0770.class);
                if (interfaceC0770 != null) {
                    strName = interfaceC0770.value();
                    for (String str : interfaceC0770.alternate()) {
                        this.f10428.put(str, r4);
                    }
                }
                this.f10428.put(strName, r4);
                this.f10429.put(string, r4);
                this.f10430.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        String strM3745 = c1942.m3745();
        Enum r0 = (Enum) this.f10428.get(strM3745);
        return r0 == null ? (Enum) this.f10429.get(strM3745) : r0;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        Enum r2 = (Enum) obj;
        c1405.m2852(r2 == null ? null : (String) this.f10430.get(r2));
    }
}
