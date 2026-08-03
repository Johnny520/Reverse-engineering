package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4295 extends AbstractC4284 {

    /* JADX INFO: renamed from: ۥ۟ */
    public String f799;

    @Override // Yue.AbstractC4284
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4295) || !super.equals(obj)) {
            return false;
        }
        C4295 c4295 = (C4295) obj;
        String str = this.f799;
        if (str == null) {
            if (c4295.f799 != null) {
                return false;
            }
        } else if (!str.equals(c4295.f799)) {
            return false;
        }
        return true;
    }

    @Override // Yue.AbstractC4284, Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("PUBLIC \"");
        printWriter.print(this.f799);
        printWriter.print("\"");
        if (this.f790 != null) {
            printWriter.print(" \"");
            printWriter.print(this.f790);
            printWriter.print("\"");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12414() {
        return this.f799;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12415(String str) {
        this.f799 = str;
    }
}
