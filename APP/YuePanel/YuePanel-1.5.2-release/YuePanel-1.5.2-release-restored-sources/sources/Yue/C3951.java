package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3951 extends C3789 implements InterfaceC3930 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3951() {
        mo10446();
    }

    @Override // Yue.InterfaceC3930
    public String getText() {
        return getData();
    }

    @Override // Yue.C3789, Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<!--");
        String text = getText();
        if (text.length() > 0) {
            writer.write(text);
        }
        writer.write("-->");
    }

    @Override // Yue.C3789
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public void mo10446() {
        m9418(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3951(String str) {
        mo10446();
        m10447(str);
    }
}
