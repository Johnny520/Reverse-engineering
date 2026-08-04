package yyds;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛴᲇᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0973 extends AbstractC2026 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1985 f4465 = new C1985(24);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static void m2115(AbstractC2026 abstractC2026, String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762, InterfaceC0396 interfaceC0396) {
        C1762 c17622 = c1762;
        InterfaceC0396 interfaceC03962 = interfaceC0396;
        C0989 c0989 = c17622.f8846;
        c0989.f4503.getClass();
        if (obj instanceof Map) {
            if (interfaceC03962.mo561(obj)) {
                abstractC2026.mo827(str, abstractC1614, obj, c1762);
            }
            for (String str2 : c0989.f4503.m393(obj)) {
                String str3 = str + "['" + str2 + "']";
                c0989.f4503.getClass();
                Map map = (Map) obj;
                boolean zContainsKey = map.containsKey(str2);
                Object obj2 = C0052.f549;
                Object obj3 = !zContainsKey ? obj2 : map.get(str2);
                if (obj3 != obj2) {
                    C1875 c1875 = new C1875(obj);
                    c1875.f9430 = str2;
                    m2115(abstractC2026, str3, c1875, obj3, c17622, interfaceC03962);
                }
            }
            return;
        }
        C0052 c0052 = c0989.f4503;
        C0052 c00522 = c0989.f4503;
        c0052.getClass();
        if (obj instanceof List) {
            if (interfaceC03962.mo561(obj)) {
                if (abstractC2026.m3900()) {
                    abstractC2026.mo827(str, abstractC1614, obj, c1762);
                } else {
                    AbstractC2026 abstractC2026M3899 = abstractC2026.m3899();
                    int i = 0;
                    for (Object obj4 : c00522.m379(obj)) {
                        abstractC2026M3899.f10100 = i;
                        abstractC2026M3899.mo827(str + "[" + i + "]", abstractC1614, obj4, c1762);
                        i++;
                    }
                }
            }
            int i2 = 0;
            for (Object obj5 : c00522.m379(obj)) {
                C0225 c0225 = new C0225(obj);
                c0225.f1242 = i2;
                m2115(abstractC2026, str + "[" + i2 + "]", c0225, obj5, c17622, interfaceC03962);
                i2++;
                c17622 = c1762;
                interfaceC03962 = interfaceC0396;
            }
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        AbstractC2026 abstractC2026M3899 = m3899();
        m2115(abstractC2026M3899, str, abstractC1614, obj, c1762, abstractC2026M3899 instanceof C0197 ? new C0119((C0197) abstractC2026M3899, 9, c1762) : abstractC2026M3899 instanceof AbstractC0789 ? new C2014(15, c1762) : abstractC2026M3899 instanceof C2046 ? new C0469(24) : abstractC2026M3899 instanceof C2189 ? new C0119((C2189) abstractC2026M3899, 8, c1762) : f4465);
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return "..";
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return false;
    }
}
