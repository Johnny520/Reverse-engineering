package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4272 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f775;

    /* JADX INFO: renamed from: ۥ۟ */
    public Vector f776 = new Vector();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4272() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4272)) {
            return false;
        }
        C4272 c4272 = (C4272) obj;
        String str = this.f775;
        if (str == null && c4272.f775 != null) {
            return false;
        }
        if (str == null || str.equals(c4272.f775)) {
            return this.f776.equals(c4272.f776);
        }
        return false;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<!ATTLIST ");
        printWriter.println(this.f775);
        Iterator it = this.f776.iterator();
        while (it.hasNext()) {
            printWriter.print("           ");
            ((C4273) it.next()).mo1236(printWriter);
            if (it.hasNext()) {
                printWriter.println();
            } else {
                printWriter.println(">");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C4273 m1238(int i) {
        return (C4273) this.f776.elementAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4273[] m12328() {
        C4273[] c4273Arr = new C4273[this.f776.size()];
        this.f776.copyInto(c4273Arr);
        return c4273Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12329() {
        return this.f775;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12330(C4273 c4273, int i) {
        this.f776.setElementAt(c4273, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12331(C4273[] c4273Arr) {
        this.f776 = new Vector(c4273Arr.length);
        for (C4273 c4273 : c4273Arr) {
            this.f776.addElement(c4273);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12332(String str) {
        this.f775 = str;
    }

    public C4272(String str) {
        this.f775 = str;
    }
}
