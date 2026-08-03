package p001;

import java.util.Set;
import p001.C0178d1;

/* JADX INFO: renamed from: ۟.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0192e1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m846(EnumC0164c1 enumC0164c1) {
        C0237h4.m1090("<this>", enumC0164c1);
        C0286kb c0286kb = C0178d1.f750;
        InterfaceC0451x3 interfaceC0451x3M841 = C0178d1.b.m841();
        String str = enumC0164c1.f728;
        Object obj = enumC0164c1.f1394;
        C0237h4.m1088("null cannot be cast to non-null type kotlin.Boolean", obj);
        return interfaceC0451x3M841.mo1059(str, ((Boolean) obj).booleanValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m847(EnumC0164c1 enumC0164c1) {
        C0237h4.m1090("<this>", enumC0164c1);
        C0286kb c0286kb = C0178d1.f750;
        InterfaceC0451x3 interfaceC0451x3M841 = C0178d1.b.m841();
        String str = enumC0164c1.f728;
        Object obj = enumC0164c1.f1394;
        C0237h4.m1088("null cannot be cast to non-null type kotlin.String", obj);
        return interfaceC0451x3M841.mo849(str, (String) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Set<String> m1053(InterfaceC0438w3 interfaceC0438w3) {
        C0237h4.m1090("<this>", interfaceC0438w3);
        C0286kb c0286kb = C0178d1.f750;
        InterfaceC0451x3 interfaceC0451x3M841 = C0178d1.b.m841();
        String key = interfaceC0438w3.getKey();
        Object objMo833 = interfaceC0438w3.mo833();
        C0237h4.m1088("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>", objMo833);
        if (objMo833 instanceof InterfaceC0321n4) {
            C0394sb.m941("kotlin.collections.MutableSet", objMo833);
            throw null;
        }
        try {
            return interfaceC0451x3M841.mo1058(key, (Set) objMo833);
        } catch (ClassCastException e) {
            C0237h4.m1091(C0394sb.class.getName(), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1054(EnumC0164c1 enumC0164c1, InterfaceC0208f3 interfaceC0208f3) {
        C0237h4.m1090("<this>", enumC0164c1);
        if (m846(enumC0164c1)) {
            interfaceC0208f3.mo7();
        }
    }
}
