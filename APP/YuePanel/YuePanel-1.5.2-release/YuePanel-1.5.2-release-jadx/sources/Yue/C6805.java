package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۡۥۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6805 extends AbstractC3516 implements InterfaceC6804 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f17685;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String f17686;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6805() {
        m21520();
    }

    @Override // Yue.InterfaceC6804
    public String getData() {
        return this.f17686;
    }

    @Override // Yue.InterfaceC6804
    public String getTarget() {
        return this.f17685;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<?");
        String str = this.f17685;
        if (str != null) {
            writer.write(str);
        }
        if (this.f17686 != null) {
            writer.write(32);
            writer.write(this.f17686);
        }
        writer.write("?>");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m21520() {
        m9418(3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m21521(String str) {
        this.f17686 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m21522(String str) {
        this.f17685 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6805(String str, String str2) {
        m21520();
        this.f17685 = str;
        this.f17686 = str2;
    }
}
