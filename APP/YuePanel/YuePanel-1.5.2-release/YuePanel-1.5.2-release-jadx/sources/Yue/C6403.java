package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6403 extends AbstractC3516 implements InterfaceC6402 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f16167;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String f16168;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final String f16169;

    public C6403(String str, String str2, String str3) {
        super(14);
        this.f16167 = str;
        this.f16168 = str2;
        this.f16169 = str3;
    }

    @Override // Yue.InterfaceC6402
    public String getName() {
        return this.f16167;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return this.f16169;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo9145() {
        return this.f16168;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<!NOTATION ");
        writer.write(getName());
        if (this.f16168 != null) {
            writer.write(" PUBLIC \"");
            writer.write(this.f16168);
            writer.write(34);
        } else if (this.f16169 != null) {
            writer.write(" SYSTEM");
        }
        if (this.f16169 != null) {
            writer.write(" \"");
            writer.write(this.f16169);
            writer.write(34);
        }
        writer.write(62);
    }
}
