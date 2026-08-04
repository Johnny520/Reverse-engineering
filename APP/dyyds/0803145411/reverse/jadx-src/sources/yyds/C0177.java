package yyds;

import java.util.EnumSet;

/* JADX INFO: renamed from: yyds.ᛱᛷᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2623 f1004;

    public C0177(String str, InterfaceC0845[] interfaceC0845Arr) {
        this.f1004 = C0119.m534(str, interfaceC0845Arr);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0367 m738(String str) {
        C1312 c1312 = C1312.f5998;
        C0299 c0299M2175 = C0989.m2175();
        c1312.getClass();
        c0299M2175.f1577 = new C0052(0);
        ((EnumSet) c0299M2175.f1576).addAll(EnumSet.noneOf(EnumC0445.class));
        C0989 c0989M954 = c0299M2175.m954();
        AbstractC0902.m2008(str, "json string can not be null or empty");
        C0052 c0052 = c0989M954.f4503;
        c0052.getClass();
        try {
            C1342 c1342 = new C1342(-8193);
            C0721 c0721 = (C0721) c0052.f551;
            C2072 c2072 = c1342.f6223;
            if (c2072 == null) {
                c2072 = new C2072(-8193);
                c1342.f6223 = c2072;
            }
            return new C0367(c2072.m3979(str, c0721), c0989M954);
        } catch (C2240 e) {
            throw new C1292(e);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Object m739(String str, String str2, InterfaceC0845... interfaceC0845Arr) {
        C1312 c1312 = C1312.f5998;
        C0299 c0299M2175 = C0989.m2175();
        c1312.getClass();
        c0299M2175.f1577 = new C0052(0);
        ((EnumSet) c0299M2175.f1576).addAll(EnumSet.noneOf(EnumC0445.class));
        C0989 c0989M954 = c0299M2175.m954();
        AbstractC0902.m2008(str, "json string can not be null or empty");
        C0052 c0052 = c0989M954.f4503;
        c0052.getClass();
        try {
            C1342 c1342 = new C1342(-8193);
            C0721 c0721 = (C0721) c0052.f551;
            C2072 c2072 = c1342.f6223;
            if (c2072 == null) {
                c2072 = new C2072(-8193);
                c1342.f6223 = c2072;
            }
            return new C0367(c2072.m3979(str, c0721), c0989M954).m1065(str2, interfaceC0845Arr);
        } catch (C2240 e) {
            throw new C1292(e);
        }
    }
}
