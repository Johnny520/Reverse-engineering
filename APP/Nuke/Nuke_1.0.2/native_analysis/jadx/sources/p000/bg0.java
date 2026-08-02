package p000;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 extends q43 {

    /* JADX INFO: renamed from: d */
    public static final ag0 f840d = new ag0();

    /* JADX INFO: renamed from: a */
    public final HashMap f841a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f842b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f843c = new HashMap();

    public bg0(Class cls) {
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
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String strName = r5.name();
                String string = r5.toString();
                fp2 fp2Var = (fp2) field2.getAnnotation(fp2.class);
                if (fp2Var != null) {
                    strName = fp2Var.value();
                    for (String str : fp2Var.alternate()) {
                        this.f841a.put(str, r5);
                    }
                }
                this.f841a.put(strName, r5);
                this.f842b.put(string, r5);
                this.f843c.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            C0676s.m4650i(e);
            throw null;
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        Enum r0 = (Enum) this.f841a.get(strM2812G);
        return r0 == null ? (Enum) this.f842b.get(strM2812G) : r0;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        o41Var.m3487D(r2 == null ? null : (String) this.f843c.get(r2));
    }
}
