package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4294 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f798;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4294() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4294)) {
            return false;
        }
        C4294 c4294 = (C4294) obj;
        String str = this.f798;
        if (str == null) {
            if (c4294.f798 != null) {
                return false;
            }
        } else if (!str.equals(c4294.f798)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f798;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<?");
        printWriter.print(this.f798);
        printWriter.println("?>");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m1252() {
        return this.f798;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12413(String str) {
        this.f798 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4294(String str) {
        this.f798 = str;
    }
}
