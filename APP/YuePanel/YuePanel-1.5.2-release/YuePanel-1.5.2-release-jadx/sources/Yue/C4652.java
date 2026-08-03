package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4652 extends AbstractC3516 implements InterfaceC4651 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f9980;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String f9981;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public InterfaceC4648 f9982;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4652() {
        m13995();
    }

    @Override // Yue.InterfaceC4651
    public String getName() {
        return this.f9980;
    }

    @Override // Yue.AbstractC3516
    public String toString() {
        String strM13993 = m13993();
        if (strM13993 == null) {
            strM13993 = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&");
        stringBuffer.append(getName());
        stringBuffer.append(":='");
        stringBuffer.append(strM13993);
        stringBuffer.append("'");
        return stringBuffer.toString();
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return null;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo9145() {
        return null;
    }

    @Override // Yue.InterfaceC4651
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public InterfaceC4648 mo13992() {
        return this.f9982;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public String m13993() {
        return this.f9982.mo13989();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public String m13994() {
        return null;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write(38);
        writer.write(getName());
        writer.write(59);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m13995() {
        m9418(9);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m13996(String str) {
        this.f9980 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m13997(String str) {
        this.f9981 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4652(String str, InterfaceC4648 interfaceC4648) {
        m13995();
        this.f9980 = str;
        this.f9982 = interfaceC4648;
    }
}
