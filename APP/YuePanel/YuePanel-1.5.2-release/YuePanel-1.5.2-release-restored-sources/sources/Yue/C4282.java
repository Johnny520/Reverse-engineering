package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4282 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public Vector f789 = new Vector();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4282) {
            return this.f789.equals(((C4282) obj).f789);
        }
        return false;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("( ");
        Enumeration enumerationElements = m12369().elements();
        boolean z = true;
        while (enumerationElements.hasMoreElements()) {
            if (!z) {
                printWriter.print(" | ");
            }
            printWriter.print(enumerationElements.nextElement());
            z = false;
        }
        printWriter.print(")");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1243(String str) {
        this.f789.addElement(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m12366(int i) {
        return (String) this.f789.elementAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String[] m12367() {
        return m12368();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String[] m12368() {
        String[] strArr = new String[this.f789.size()];
        this.f789.copyInto(strArr);
        return strArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Vector m12369() {
        return this.f789;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12370(String str) {
        this.f789.removeElement(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12371(String str, int i) {
        this.f789.setElementAt(str, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12372(String[] strArr) {
        this.f789 = new Vector(strArr.length);
        for (String str : strArr) {
            this.f789.addElement(str);
        }
    }
}
