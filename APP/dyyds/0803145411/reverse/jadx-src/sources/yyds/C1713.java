package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛸᛲᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1713 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2441 f8654;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8655;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0903 f8656;

    public /* synthetic */ C1713(AbstractC2441 abstractC2441, C0903 c0903, int i) {
        this.f8655 = i;
        this.f8654 = abstractC2441;
        this.f8656 = c0903;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        Object c2658;
        C1125 c1125;
        Object c26582;
        C1125 c11252;
        int i = this.f8655;
        List list = C1860.f9345;
        C0805 c0805 = AbstractC0384.f1966;
        C0903 c0903 = this.f8656;
        AbstractC2441 abstractC2441 = this.f8654;
        switch (i) {
            case 0:
                Class cls = (Class) obj;
                C1189 c1189 = (C1189) abstractC2441;
                c0903.getClass();
                try {
                    c2658 = AbstractC2070.m3940(cls.getDeclaredMethods());
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C0078 c0078 = AbstractC2003.f10023;
                    AbstractC2003.m3882("Failed to get declared methods in " + c0805 + " because got an exception.", thM4249);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                List list2 = (List) c2658;
                if (list2 != null) {
                    list = list2;
                }
                C0497 c0497M1105 = AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1099(AbstractC0384.m1093(new C0558(1, list), c1189, c0903), c1189, c0903), c0903, "returnType", c1189.f5455, new C2409(c0903, 2)), c0903, "returnTypeCondition", c1189.f5456, new C1936(16)), c0903, "isBridge", null, new C1936(23)), c0903, "isBridgeNot", null, new C2809(2)), c0903, "isDefault", null, new C2809(3)), c0903, "isDefaultNot", null, new C2809(4));
                C2234 c2234M3448 = AbstractC1700.m3448(Method.class);
                if (c2234M3448.equals(AbstractC1700.m3448(Method.class))) {
                    c1125 = new C1125(c0497M1105, new C2519(c0903, 6));
                } else if (c2234M3448.equals(AbstractC1700.m3448(Constructor.class))) {
                    c1125 = new C1125(c0497M1105, new C2519(c0903, 7));
                } else if (!c2234M3448.equals(AbstractC1700.m3448(Field.class))) {
                    C0188.m791(c0497M1105, "Unsupported member type: ");
                } else {
                    c1125 = new C1125(c0497M1105, new C2519(c0903, 8));
                }
                break;
            default:
                Class cls2 = (Class) obj;
                C0802 c0802 = (C0802) abstractC2441;
                c0903.getClass();
                try {
                    c26582 = AbstractC2070.m3940(cls2.getDeclaredFields());
                } catch (Throwable th2) {
                    c26582 = new C2658(th2);
                }
                Throwable thM42492 = C2248.m4249(c26582);
                if (thM42492 != null) {
                    C0078 c00782 = AbstractC2003.f10023;
                    AbstractC2003.m3882("Failed to get declared fields in " + c0805 + " because got an exception.", thM42492);
                }
                if (c26582 instanceof C2658) {
                    c26582 = null;
                }
                List list3 = (List) c26582;
                if (list3 != null) {
                    list = list3;
                }
                C0497 c0497M11052 = AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1105(AbstractC0384.m1093(new C0558(1, list), c0802, c0903), c0903, "isEnumConstant", null, new C2809(5)), c0903, "isEnumConstantNot", null, new C2809(6)), c0903, "type", c0802.f3681, new C2409(c0903, 17)), c0903, "typeCondition", c0802.f3682, new C1936(8)), c0903, "genericType", null, new C1936(9)), c0903, "genericTypeCondition", null, new C1936(10));
                C2234 c2234M34482 = AbstractC1700.m3448(Field.class);
                if (c2234M34482.equals(AbstractC1700.m3448(Method.class))) {
                    c11252 = new C1125(c0497M11052, new C2519(c0903, 3));
                } else if (c2234M34482.equals(AbstractC1700.m3448(Constructor.class))) {
                    c11252 = new C1125(c0497M11052, new C2519(c0903, 4));
                } else if (!c2234M34482.equals(AbstractC1700.m3448(Field.class))) {
                    C0188.m791(c0497M11052, "Unsupported member type: ");
                } else {
                    c11252 = new C1125(c0497M11052, new C2519(c0903, 5));
                }
                break;
        }
        return null;
    }
}
