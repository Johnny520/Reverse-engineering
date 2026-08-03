package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7594 implements InterfaceC8544 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f22963 = "javax.xml.stream.notations";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f22964 = "javax.xml.stream.entities";

    /* JADX INFO: renamed from: ۥ */
    public C7575 f2957 = new C7575();

    /* JADX INFO: renamed from: ۥ۟ */
    public C4644 f2958 = new C4644();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C3789 f22965 = new C3789();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C3789 f22966 = new C3789("", true);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C3789 f22967 = new C3789();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C3951 f22968 = new C3951();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C4652 f22969 = new C4652();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6805 f22970 = new C6805();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C7573 f22971 = new C7573();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C4642 f22972 = new C4642();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C4283 f22973 = new C4283();

    public String toString() {
        return "Static Allocator";
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8543 mo3751(InterfaceC8561 interfaceC8561) throws C8559 {
        switch (interfaceC8561.mo18329()) {
            case 1:
                return m23788(interfaceC8561);
            case 2:
                return m23783(interfaceC8561);
            case 3:
                return m23785(interfaceC8561);
            case 4:
                return m23779(interfaceC8561);
            case 5:
                return m23780(interfaceC8561);
            case 6:
                return m23779(interfaceC8561);
            case 7:
                return m23787(interfaceC8561);
            case 8:
                return m23782(interfaceC8561);
            case 9:
                return m23784(interfaceC8561);
            case 10:
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to allocate event[");
                stringBuffer.append(C4606.m1561(interfaceC8561.mo18329()));
                stringBuffer.append("]");
                throw new C8559(stringBuffer.toString());
            case 11:
                return m23781(interfaceC8561);
            case 12:
                return m23778(interfaceC8561);
        }
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo3752(InterfaceC8561 interfaceC8561, InterfaceC8546 interfaceC8546) throws C8559 {
        interfaceC8546.mo28423(mo3751(interfaceC8561));
    }

    @Override // Yue.InterfaceC8544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC8544 mo23777() {
        return new C7594();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 m23778(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22966.m10447(interfaceC8561.getText());
        return this.f22966;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC3788 m23779(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22965.m10447(interfaceC8561.getText());
        return this.f22965;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC3930 m23780(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22968.m10447(interfaceC8561.getText());
        return this.f22968;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC4269 m23781(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22973.m12376(interfaceC8561.getText());
        return this.f22973;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC4641 m23782(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f22972;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC4643 m23783(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f2958.m13964();
        this.f2958.m19840(new C6848(interfaceC8561.mo18325(), interfaceC8561.mo18348(), C4703.m14007(interfaceC8561.getPrefix())));
        Iterator itM28410 = C8545.m28410(interfaceC8561);
        while (itM28410.hasNext()) {
            this.f2958.m13962((InterfaceC6347) itM28410.next());
        }
        return this.f2958;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC4651 m23784(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22969.m13996(interfaceC8561.mo18348());
        this.f22969.m13997(interfaceC8561.getText());
        return this.f22969;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public InterfaceC6804 m23785(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22970.m21522(interfaceC8561.mo18335());
        this.f22970.m21521(interfaceC8561.mo18346());
        return this.f22970;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public InterfaceC3788 m23786(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22967.m10449(true);
        this.f22967.m10447(interfaceC8561.getText());
        return this.f22967;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC7572 m23787(InterfaceC8561 interfaceC8561) throws C8559 {
        m23789(interfaceC8561);
        return this.f22971;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public InterfaceC7574 m23788(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f2957.m23721();
        this.f2957.m19840(new C6848(interfaceC8561.mo18325(), interfaceC8561.mo18348(), C4703.m14007(interfaceC8561.getPrefix())));
        Iterator itM28409 = C8545.m28409(interfaceC8561);
        while (itM28409.hasNext()) {
            this.f2957.m23718((InterfaceC3453) itM28409.next());
        }
        Iterator itM28410 = C8545.m28410(interfaceC8561);
        while (itM28410.hasNext()) {
            this.f2957.m23718((InterfaceC6347) itM28410.next());
        }
        return this.f2957;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public InterfaceC7572 m23789(InterfaceC8561 interfaceC8561) throws C8559 {
        this.f22971.m23710();
        String strMo18323 = interfaceC8561.mo18323();
        String version = interfaceC8561.getVersion();
        boolean zMo18327 = interfaceC8561.mo18327();
        if (strMo18323 != null && version != null && !zMo18327) {
            this.f22971.m23712(strMo18323);
            this.f22971.m23715(version);
            this.f22971.m23714(zMo18327);
            return this.f22971;
        }
        if (version == null || strMo18323 == null) {
            if (strMo18323 != null) {
                this.f22971.m23712(strMo18323);
            }
            return this.f22971;
        }
        this.f22971.m23712(strMo18323);
        this.f22971.m23715(version);
        return this.f22971;
    }
}
