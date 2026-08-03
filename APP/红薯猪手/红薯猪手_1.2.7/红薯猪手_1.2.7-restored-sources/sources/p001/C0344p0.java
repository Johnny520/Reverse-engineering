package p001;

/* JADX INFO: renamed from: ۟.p0 */
/* JADX INFO: loaded from: classes.dex */
public class C0344p0 {

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC0438w3 f1017;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f1018;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public CharSequence f1733;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public CharSequence f1734;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public String f1735;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final String f1736;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final boolean f1737;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public InterfaceC0222g3<? super C0344p0, C0433vb> f1738;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public Boolean f1739;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final InterfaceC0222g3<Boolean, C0433vb> f1740;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public Boolean f1741;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final InterfaceC0222g3<Boolean, C0433vb> f1742;

    /* JADX INFO: renamed from: ۥ۠ */
    public final boolean f1019;

    public C0344p0() {
        this(null, null, null, null, null, null, null, null, null, null, false, 8191);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0344p0(EnumC0164c1 enumC0164c1, String str, CharSequence charSequence, CharSequence charSequence2, String str2, String str3, InterfaceC0222g3 interfaceC0222g3, Boolean bool, InterfaceC0222g3 interfaceC0222g32, Boolean bool2, boolean z, int i) {
        InterfaceC0438w3 interfaceC0438w3 = (i & 1) != 0 ? EnumC0220g1.f1468 : enumC0164c1;
        String str4 = (i & 2) != 0 ? "" : str;
        CharSequence charSequence3 = (i & 4) != 0 ? "" : charSequence;
        CharSequence charSequence4 = (i & 8) != 0 ? "" : charSequence2;
        String str5 = (i & 16) != 0 ? "" : str2;
        String str6 = (i & 32) == 0 ? str3 : "";
        InterfaceC0222g3 interfaceC0222g33 = (i & 128) != 0 ? null : interfaceC0222g3;
        Boolean bool3 = (i & 256) != 0 ? null : bool;
        InterfaceC0222g3 interfaceC0222g34 = (i & 512) != 0 ? null : interfaceC0222g32;
        Boolean bool4 = (i & 1024) != 0 ? null : bool2;
        boolean z2 = (i & 4096) != 0 ? false : z;
        C0237h4.m1090("data", interfaceC0438w3);
        C0237h4.m1090("key", str4);
        C0237h4.m1090("title", charSequence3);
        C0237h4.m1090("desc", charSequence4);
        C0237h4.m1090("textValue", str5);
        C0237h4.m1090("depend", str6);
        this.f1017 = interfaceC0438w3;
        this.f1018 = str4;
        this.f1733 = charSequence3;
        this.f1734 = charSequence4;
        this.f1735 = str5;
        this.f1736 = str6;
        this.f1737 = false;
        this.f1738 = interfaceC0222g33;
        this.f1739 = bool3;
        this.f1740 = interfaceC0222g34;
        this.f1741 = bool4;
        this.f1742 = null;
        this.f1019 = z2;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m916(String str) {
        C0237h4.m1090("<set-?>", str);
        this.f1735 = str;
    }
}
