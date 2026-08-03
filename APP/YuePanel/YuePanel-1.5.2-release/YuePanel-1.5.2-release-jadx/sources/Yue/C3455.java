package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3455 implements InterfaceC3453, InterfaceC5801 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public String f5576;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C6848 f5577;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C6848 f5578;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public String f5579;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f5580 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5581 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5582 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f5583 = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3455(String str, String str2, String str3, String str4, String str5) {
        this.f5577 = new C6848(str2, str3, str == null ? "" : str);
        this.f5576 = str4;
        this.f5578 = new C6848(str5);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static void m9144(Writer writer, char c) throws IOException {
        writer.write("&#");
        writer.write(Integer.toString(c));
        writer.write(59);
    }

    @Override // Yue.InterfaceC3453
    public C6848 getName() {
        return this.f5577;
    }

    @Override // Yue.InterfaceC3453
    public String getValue() {
        return this.f5576;
    }

    @Override // Yue.InterfaceC8543
    public boolean isAttribute() {
        return true;
    }

    public String toString() {
        if (this.f5577.m21588() == null || this.f5577.m21588().equals("")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f5577.m3294());
            stringBuffer.append("='");
            stringBuffer.append(this.f5576);
            stringBuffer.append("'");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("['");
        stringBuffer2.append(this.f5577.m3295());
        stringBuffer2.append("']:");
        stringBuffer2.append(this.f5577.m21588());
        stringBuffer2.append(":");
        stringBuffer2.append(this.f5577.m3294());
        stringBuffer2.append("='");
        stringBuffer2.append(this.f5576);
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return null;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String mo9145() {
        return null;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo9146() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String mo9147() {
        return this.f5577.m3295();
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo9148() {
        return false;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo9149() {
        return false;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int mo9150() {
        return 10;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC5801 mo9151() {
        return this;
    }

    @Override // Yue.InterfaceC3453
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo9124() {
        return true;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int mo9152() {
        return this.f5582;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m9153() {
        return this.f5577 != null;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean mo9154() {
        return false;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void mo9155(Writer writer) throws C8559 {
        char cCharAt;
        try {
            String strM21588 = this.f5577.m21588();
            if (strM21588 != null && strM21588.length() > 0) {
                writer.write(strM21588);
                writer.write(58);
            }
            writer.write(this.f5577.m3294());
            writer.write("=\"");
            String str = this.f5576;
            int length = str.length();
            if (length > 0) {
                int i = 0;
                while (i < length && (cCharAt = str.charAt(i)) != '\"' && cCharAt != '&' && cCharAt != '<' && cCharAt >= ' ') {
                    i++;
                }
                if (i == length) {
                    writer.write(str);
                } else {
                    if (i > 0) {
                        writer.write(str, 0, i);
                    }
                    while (i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 == '\"') {
                            writer.write("&quot;");
                        } else if (cCharAt2 == '&') {
                            writer.write("&amp;");
                        } else if (cCharAt2 == '<') {
                            writer.write("&lt;");
                        } else if (cCharAt2 < ' ') {
                            m9144(writer, cCharAt2);
                        } else {
                            writer.write(cCharAt2);
                        }
                        i++;
                    }
                }
            }
            writer.write(34);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public C6848 mo9156() {
        return null;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean mo9157() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public String m9158() {
        return this.f5577.m3294();
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public InterfaceC4643 mo9159() {
        throw new ClassCastException("cannnot cast AttributeBase to EndElement");
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int mo9160() {
        return this.f5581;
    }

    @Override // Yue.InterfaceC3453
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public String mo9125() {
        return "CDATA";
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public InterfaceC3788 mo9161() {
        throw new ClassCastException("cannnot cast AttributeBase to Characters");
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public InterfaceC7574 mo9162() {
        throw new ClassCastException("cannnot cast AttributeBase to StartElement");
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public int mo9163() {
        return this.f5583;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean mo9164() {
        return false;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean mo9165() {
        return false;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public boolean mo9166() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public String m9167() {
        return this.f5579;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public String m9168() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m9169() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m9170() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public boolean m9171() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m9172() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m9173() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m9174(int i) {
        this.f5583 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m9175(int i) {
        this.f5582 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m9176(int i) {
        this.f5581 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m9177(String str) {
        this.f5579 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m9178(String str) {
        this.f5577 = new C6848(str, this.f5577.m3294());
    }

    public C3455(String str, String str2, String str3) {
        this.f5577 = new C6848("", str2, str == null ? "" : str);
        this.f5576 = str3;
    }

    public C3455(C6848 c6848, String str) {
        this.f5577 = c6848;
        this.f5576 = str;
    }
}
