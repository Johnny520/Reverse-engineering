package Yue;

import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4297 extends AbstractC4284 {
    @Override // Yue.AbstractC4284
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4297) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // Yue.AbstractC4284, Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) {
        if (this.f790 != null) {
            printWriter.print("SYSTEM \"");
            printWriter.print(this.f790);
            printWriter.print("\"");
        }
    }
}
