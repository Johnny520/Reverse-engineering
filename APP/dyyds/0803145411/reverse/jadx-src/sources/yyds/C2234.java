package yyds;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲁᛵᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2234 implements InterfaceC2786 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Map f11034;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f11035;

    static {
        List listM4854 = AbstractC2725.m4854(InterfaceC2266.class, InterfaceC1549.class, InterfaceC0477.class, InterfaceC0295.class, InterfaceC1540.class, InterfaceC1195.class, InterfaceC1211.class, InterfaceC1297.class, InterfaceC2350.class, InterfaceC2735.class, InterfaceC1023.class, InterfaceC0173.class, InterfaceC1318.class, InterfaceC2421.class, InterfaceC0653.class, InterfaceC0403.class, InterfaceC2131.class, InterfaceC2584.class, InterfaceC1528.class, InterfaceC2779.class, InterfaceC1058.class, InterfaceC2516.class, InterfaceC0751.class);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM4854, 10));
        int i = 0;
        for (Object obj : listM4854) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2725.m4853();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f11034 = AbstractC2366.m4383(arrayList);
    }

    public C2234(Class cls) {
        this.f11035 = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2234) && AbstractC0578.m1458(this).equals(AbstractC0578.m1458((C2234) obj));
    }

    public final int hashCode() {
        return AbstractC0578.m1458(this).hashCode();
    }

    public final String toString() {
        return this.f11035.toString() + " (Kotlin reflection is not available)";
    }

    @Override // yyds.InterfaceC2786
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo3993() {
        return this.f11035;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4234() {
        String strM3191;
        Class cls = this.f11035;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM31912 = AbstractC1544.m3191(cls.getName());
            return strM31912 == null ? cls.getCanonicalName() : strM31912;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM3191 = AbstractC1544.m3191(componentType.getName())) != null) {
            strConcat = strM3191.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m4235(Object obj) {
        Map map = f11034;
        Class clsM1458 = this.f11035;
        Integer num = (Integer) map.get(clsM1458);
        if (num != null) {
            return AbstractC0395.m1139(num.intValue(), obj);
        }
        if (clsM1458.isPrimitive()) {
            clsM1458 = AbstractC0578.m1458(AbstractC1700.m3448(clsM1458));
        }
        return clsM1458.isInstance(obj);
    }
}
