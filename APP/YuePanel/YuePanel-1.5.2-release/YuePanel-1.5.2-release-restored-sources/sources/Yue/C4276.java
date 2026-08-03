package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4276 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f781;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4276() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4276)) {
            return false;
        }
        C4276 c4276 = (C4276) obj;
        String str = this.f781;
        if (str != null || c4276.f781 == null) {
            return str == null || str.equals(c4276.f781);
        }
        return false;
    }

    public String toString() {
        return this.f781;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<!--");
        printWriter.print(this.f781);
        printWriter.println("-->");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m1240() {
        return this.f781;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12340(String str) {
        this.f781 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4276(String str) {
        this.f781 = str;
    }
}
