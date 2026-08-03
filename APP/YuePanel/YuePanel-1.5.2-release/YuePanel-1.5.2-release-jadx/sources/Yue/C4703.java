package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4703 extends AbstractC8547 {

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5801 f1065;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static String m14007(String str) {
        return str == null ? "" : str;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC3453 mo1618(C6848 c6848, String str) {
        return new C3455(c6848, str);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC3453 mo1619(String str, String str2) {
        return new C3455("", str, str2);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC3453 mo14008(String str, String str2, String str3, String str4) {
        return new C3455(str, str2, str3, str4, "CDATA");
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 mo14009(String str) {
        return new C3789(str, true);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 mo14010(String str) {
        return new C3789(str);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC3930 mo14011(String str) {
        return new C3951(str);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC4269 mo14012(String str) {
        return new C4283(str);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC4641 mo14013() {
        return new C4642();
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC4643 mo14014(C6848 c6848, Iterator it) {
        C4644 c4644 = new C4644(c6848);
        while (it != null && it.hasNext()) {
            c4644.m13962((InterfaceC6347) it.next());
        }
        return c4644;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC4643 mo14015(String str, String str2, String str3) {
        return new C4644(new C6848(str2, str3, m14007(str)));
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public InterfaceC4643 mo14016(String str, String str2, String str3, Iterator it) {
        C4644 c4644 = new C4644(new C6848(str2, str3, m14007(str)));
        while (it.hasNext()) {
            c4644.m13962((InterfaceC6347) it.next());
        }
        return c4644;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public InterfaceC4651 mo14017(String str, InterfaceC4648 interfaceC4648) {
        return new C4652(str, interfaceC4648);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC3788 mo14018(String str) {
        C3789 c3789 = new C3789(str);
        c3789.m10449(true);
        c3789.m10448(true);
        return c3789;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public InterfaceC6347 mo14019(String str) {
        return new C6348(str);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public InterfaceC6347 mo14020(String str, String str2) {
        if (str != null) {
            return new C6348(str, str2);
        }
        throw new NullPointerException("The prefix of a namespace may not be set to null");
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC6804 mo14021(String str, String str2) {
        return new C6805(str, str2);
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public InterfaceC3788 mo14022(String str) {
        C3789 c3789 = new C3789(str);
        c3789.m10449(true);
        return c3789;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public InterfaceC7572 mo14023() {
        return new C7573();
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public InterfaceC7572 mo14024(String str) {
        C7573 c7573 = new C7573();
        c7573.m23712(str);
        return c7573;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC7572 mo14025(String str, String str2) {
        C7573 c7573 = new C7573();
        c7573.m23712(str);
        c7573.m23715(str2);
        return c7573;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public InterfaceC7572 mo14026(String str, String str2, boolean z) {
        C7573 c7573 = new C7573();
        c7573.m23712(str);
        c7573.m23715(str2);
        c7573.m23714(z);
        return c7573;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public InterfaceC7574 mo14027(C6848 c6848, Iterator it, Iterator it2) {
        C7575 c7575 = new C7575(c6848);
        while (it != null && it.hasNext()) {
            c7575.m23718((InterfaceC3453) it.next());
        }
        while (it2 != null && it2.hasNext()) {
            c7575.m23719((InterfaceC6347) it2.next());
        }
        return c7575;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public InterfaceC7574 mo14028(String str, String str2, String str3) {
        return new C7575(new C6848(str2, str3, str));
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public InterfaceC7574 mo14029(String str, String str2, String str3, Iterator it, Iterator it2) {
        C7575 c7575 = new C7575(new C6848(str2, str3, m14007(str)));
        while (it != null && it.hasNext()) {
            c7575.m23718((InterfaceC3453) it.next());
        }
        while (it2 != null && it2.hasNext()) {
            c7575.m23719((InterfaceC6347) it2.next());
        }
        return c7575;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InterfaceC7574 mo14030(String str, String str2, String str3, Iterator it, Iterator it2, InterfaceC6349 interfaceC6349) {
        C7575 c7575 = new C7575(new C6848(str2, str3, m14007(str)));
        while (it != null && it.hasNext()) {
            c7575.m23718((InterfaceC3453) it.next());
        }
        while (it2 != null && it2.hasNext()) {
            c7575.m23719((InterfaceC6347) it2.next());
        }
        c7575.m23723(interfaceC6349);
        return c7575;
    }

    @Override // Yue.AbstractC8547
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void mo14031(InterfaceC5801 interfaceC5801) {
        this.f1065 = interfaceC5801;
    }
}
