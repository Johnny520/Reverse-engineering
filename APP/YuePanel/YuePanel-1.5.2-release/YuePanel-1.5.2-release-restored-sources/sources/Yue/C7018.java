package Yue;

import java.io.FileReader;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7018 {

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8563 f2632;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7018() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m21810(String[] strArr) throws Exception {
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        AbstractC8554 abstractC8554M28453 = AbstractC8554.m28453();
        InterfaceC8561 interfaceC8561Mo18443 = abstractC8553M28451.mo18443(new FileReader(strArr[0]));
        InterfaceC8563 interfaceC8563Mo28457 = abstractC8554M28453.mo28457(System.out);
        C7018 c7018 = new C7018(interfaceC8563Mo28457);
        while (interfaceC8561Mo18443.hasNext()) {
            c7018.mo21812(interfaceC8561Mo18443);
            interfaceC8561Mo18443.next();
        }
        interfaceC8563Mo28457.flush();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m21811(InterfaceC8563 interfaceC8563) {
        this.f2632 = interfaceC8563;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void mo21812(InterfaceC8561 interfaceC8561) throws C8559 {
        System.out.println("wrote event");
        switch (interfaceC8561.mo18329()) {
            case 1:
                String prefix = interfaceC8561.getPrefix();
                if (interfaceC8561.mo18325() == null) {
                    this.f2632.mo28500(interfaceC8561.mo18348());
                } else if (prefix != null) {
                    this.f2632.mo28496(interfaceC8561.getPrefix(), interfaceC8561.mo18348(), interfaceC8561.mo18325());
                } else {
                    this.f2632.mo28497(interfaceC8561.mo18325(), interfaceC8561.mo18348());
                }
                for (int i = 0; i < interfaceC8561.mo18345(); i++) {
                    this.f2632.mo28477(interfaceC8561.mo18337(i), interfaceC8561.mo18350(i));
                }
                break;
            case 2:
                this.f2632.mo28498();
                break;
            case 3:
                this.f2632.mo28476(interfaceC8561.mo18335(), interfaceC8561.mo18346());
                break;
            case 4:
            case 6:
                this.f2632.mo28505(interfaceC8561.mo18332(), interfaceC8561.mo18349(), interfaceC8561.mo18336());
                break;
            case 5:
                this.f2632.mo28482(interfaceC8561.getText());
                break;
            case 7:
                String strMo18323 = interfaceC8561.mo18323();
                String version = interfaceC8561.getVersion();
                if (strMo18323 != null && version != null) {
                    this.f2632.mo28481(strMo18323, version);
                } else if (version != null) {
                    this.f2632.mo28473(interfaceC8561.getVersion());
                }
                break;
            case 8:
                this.f2632.mo28499();
                break;
            case 9:
                this.f2632.mo28479(interfaceC8561.mo18348());
                break;
            case 11:
                this.f2632.mo28475(interfaceC8561.getText());
                break;
            case 12:
                this.f2632.mo28480(interfaceC8561.getText());
                break;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public InterfaceC8563 m21813(InterfaceC8561 interfaceC8561) throws C8559 {
        while (interfaceC8561.hasNext()) {
            mo21812(interfaceC8561);
            interfaceC8561.next();
        }
        this.f2632.flush();
        return this.f2632;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7018(InterfaceC8563 interfaceC8563) {
        this.f2632 = interfaceC8563;
    }
}
