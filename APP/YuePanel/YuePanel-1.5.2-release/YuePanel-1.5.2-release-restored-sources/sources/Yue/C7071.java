package Yue;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: Yue.ۥۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7071 {

    /* JADX INFO: renamed from: ۥ */
    public static final C7072 f2661;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2662 = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC5585[] f21356;

    static {
        C7072 c7072 = null;
        try {
            c7072 = (C7072) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c7072 == null) {
            c7072 = new C7072();
        }
        f2661 = c7072;
        f21356 = new InterfaceC5585[0];
    }

    /* JADX INFO: renamed from: ۥ */
    public static InterfaceC5585 m3352(Class cls) {
        return f2661.m3354(cls);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC5585 m3353(Class cls, String str) {
        return f2661.m3355(cls, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static InterfaceC5590 m21995(C5152 c5152) {
        return f2661.m22025(c5152);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC5585 m21996(Class cls) {
        return f2661.m22026(cls);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static InterfaceC5585 m21997(Class cls, String str) {
        return f2661.m22027(cls, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static InterfaceC5585[] m21998(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f21356;
        }
        InterfaceC5585[] interfaceC5585Arr = new InterfaceC5585[length];
        for (int i = 0; i < length; i++) {
            interfaceC5585Arr[i] = m21996(clsArr[i]);
        }
        return interfaceC5585Arr;
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static InterfaceC5589 m21999(Class cls) {
        return f2661.m22028(cls, "");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static InterfaceC5589 m22000(Class cls, String str) {
        return f2661.m22028(cls, str);
    }

    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static InterfaceC5609 m22001(InterfaceC5609 interfaceC5609) {
        return f2661.m22029(interfaceC5609);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static InterfaceC5599 m22002(AbstractC6301 abstractC6301) {
        return f2661.m22030(abstractC6301);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static InterfaceC5600 m22003(AbstractC6303 abstractC6303) {
        return f2661.m22031(abstractC6303);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static InterfaceC5601 m22004(AbstractC6305 abstractC6305) {
        return f2661.m22032(abstractC6305);
    }

    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static InterfaceC5609 m22005(InterfaceC5609 interfaceC5609) {
        return f2661.m22033(interfaceC5609);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static InterfaceC5609 m22006(InterfaceC5588 interfaceC5588) {
        return f2661.m22041(interfaceC5588, Collections.emptyList(), true);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static InterfaceC5609 m22007(Class cls) {
        return f2661.m22041(m21996(cls), Collections.emptyList(), true);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static InterfaceC5609 m22008(Class cls, C5612 c5612) {
        return f2661.m22041(m21996(cls), Collections.singletonList(c5612), true);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static InterfaceC5609 m22009(Class cls, C5612 c5612, C5612 c56122) {
        return f2661.m22041(m21996(cls), Arrays.asList(c5612, c56122), true);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static InterfaceC5609 m22010(Class cls, C5612... c5612Arr) {
        return f2661.m22041(m21996(cls), C3411.m8926(c5612Arr), true);
    }

    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static InterfaceC5609 m22011(InterfaceC5609 interfaceC5609, InterfaceC5609 interfaceC56092) {
        return f2661.m22034(interfaceC5609, interfaceC56092);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static InterfaceC5606 m22012(AbstractC6826 abstractC6826) {
        return f2661.m22035(abstractC6826);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static InterfaceC5607 m22013(AbstractC6828 abstractC6828) {
        return f2661.m22036(abstractC6828);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static InterfaceC5608 m22014(AbstractC6830 abstractC6830) {
        return f2661.m22037(abstractC6830);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String m22015(InterfaceC5149 interfaceC5149) {
        return f2661.m22038(interfaceC5149);
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static String m22016(AbstractC5673 abstractC5673) {
        return f2661.m22039(abstractC5673);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m22017(InterfaceC5611 interfaceC5611, InterfaceC5609 interfaceC5609) {
        f2661.m22040(interfaceC5611, Collections.singletonList(interfaceC5609));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m22018(InterfaceC5611 interfaceC5611, InterfaceC5609... interfaceC5609Arr) {
        f2661.m22040(interfaceC5611, C3411.m8926(interfaceC5609Arr));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static InterfaceC5609 m22019(InterfaceC5588 interfaceC5588) {
        return f2661.m22041(interfaceC5588, Collections.emptyList(), false);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static InterfaceC5609 m22020(Class cls) {
        return f2661.m22041(m21996(cls), Collections.emptyList(), false);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static InterfaceC5609 m22021(Class cls, C5612 c5612) {
        return f2661.m22041(m21996(cls), Collections.singletonList(c5612), false);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static InterfaceC5609 m22022(Class cls, C5612 c5612, C5612 c56122) {
        return f2661.m22041(m21996(cls), Arrays.asList(c5612, c56122), false);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static InterfaceC5609 m22023(Class cls, C5612... c5612Arr) {
        return f2661.m22041(m21996(cls), C3411.m8926(c5612Arr), false);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static InterfaceC5611 m22024(Object obj, String str, EnumC5613 enumC5613, boolean z) {
        return f2661.m22042(obj, str, enumC5613, z);
    }
}
