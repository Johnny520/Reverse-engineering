package Yue;

import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7573 extends AbstractC3516 implements InterfaceC7572 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f22876 = "";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String f22877 = "";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public String f22878 = Key.STRING_CHARSET_NAME;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f22879 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f22880 = "1.0";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f22881 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f22882 = false;

    public C7573() {
        m23711();
    }

    @Override // Yue.InterfaceC7572
    public String getVersion() {
        return this.f22880;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return this.f22876;
    }

    @Override // Yue.InterfaceC7572
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo23706() {
        return this.f22882;
    }

    @Override // Yue.InterfaceC7572
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public String mo23707() {
        return this.f22878;
    }

    @Override // Yue.InterfaceC7572
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo23708() {
        return this.f22879;
    }

    @Override // Yue.InterfaceC7572
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo23709() {
        return this.f22881;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<?xml version=\"");
        writer.write(this.f22880);
        writer.write("\" encoding='");
        writer.write(this.f22878);
        writer.write(39);
        if (this.f22882) {
            writer.write(" standalone='");
            writer.write(this.f22879 ? "yes'" : "no'");
        }
        writer.write("?>");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m23710() {
        this.f22878 = Key.STRING_CHARSET_NAME;
        this.f22879 = true;
        this.f22880 = "1.0";
        this.f22881 = false;
        this.f22882 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m23711() {
        m9418(7);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m23712(String str) {
        this.f22878 = str;
        this.f22881 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m23713(String str) {
        this.f22882 = true;
        if (str == null) {
            this.f22879 = true;
        } else if (str.equals("yes")) {
            this.f22879 = true;
        } else {
            this.f22879 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m23714(boolean z) {
        this.f22882 = true;
        this.f22879 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m23715(String str) {
        this.f22880 = str;
    }
}
