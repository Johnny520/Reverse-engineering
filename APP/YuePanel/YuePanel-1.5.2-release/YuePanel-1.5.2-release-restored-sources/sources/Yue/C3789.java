package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3789 extends AbstractC3516 implements InterfaceC3788 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f6990;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f6991;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f6992;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f6993;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3789() {
        this.f6991 = false;
        this.f6992 = false;
        this.f6993 = false;
        mo10446();
    }

    @Override // Yue.InterfaceC3788
    public String getData() {
        return this.f6990;
    }

    @Override // Yue.InterfaceC3788
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo10441() {
        return this.f6992;
    }

    @Override // Yue.InterfaceC3788
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public boolean mo10442() {
        return this.f6991;
    }

    @Override // Yue.InterfaceC3788
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public boolean mo10443() {
        return this.f6993;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        char cCharAt;
        if (this.f6991) {
            writer.write("<![CDATA[");
            writer.write(getData());
            writer.write("]]>");
            return;
        }
        String data = getData();
        int length = data.length();
        if (length > 0) {
            int i = 0;
            while (i < length && (cCharAt = data.charAt(i)) != '&' && cCharAt != '<' && cCharAt != '>') {
                i++;
            }
            if (i == length) {
                writer.write(data);
                return;
            }
            if (i > 0) {
                writer.write(data, 0, i);
            }
            while (i < length) {
                char cCharAt2 = data.charAt(i);
                if (cCharAt2 == '&') {
                    writer.write("&amp;");
                } else if (cCharAt2 == '<') {
                    writer.write("&lt;");
                } else if (cCharAt2 != '>') {
                    writer.write(cCharAt2);
                } else {
                    writer.write("&gt;");
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public char[] m10444() {
        return this.f6990.toCharArray();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public boolean m10445() {
        return this.f6990 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void mo10446() {
        m9418(4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m10447(String str) {
        this.f6990 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m10448(boolean z) {
        this.f6993 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m10449(boolean z) {
        this.f6992 = z;
    }

    public C3789(String str) {
        this.f6991 = false;
        this.f6992 = false;
        this.f6993 = false;
        mo10446();
        m10447(str);
    }

    public C3789(String str, boolean z) {
        this.f6991 = false;
        this.f6992 = false;
        this.f6993 = false;
        mo10446();
        m10447(str);
        this.f6991 = z;
    }
}
