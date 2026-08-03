package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4296 extends AbstractC4277 {
    @Override // Yue.AbstractC4277, Yue.AbstractC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4296) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // Yue.AbstractC4277, Yue.AbstractC4285, Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("(");
        Enumeration enumerationElements = m12345().elements();
        boolean z = true;
        while (enumerationElements.hasMoreElements()) {
            if (!z) {
                printWriter.print(",");
            }
            ((AbstractC4285) enumerationElements.nextElement()).mo1236(printWriter);
            z = false;
        }
        printWriter.print(")");
        this.f791.mo1236(printWriter);
    }
}
