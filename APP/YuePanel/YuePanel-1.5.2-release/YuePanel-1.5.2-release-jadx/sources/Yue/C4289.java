package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4289 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public Vector f795 = new Vector();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4289) {
            return this.f795.equals(((C4289) obj).f795);
        }
        return false;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("NOTATION ( ");
        Enumeration enumerationElements = m12389().elements();
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
    public void m1247(String str) {
        this.f795.addElement(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m12386(int i) {
        return (String) this.f795.elementAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String[] m12387() {
        return m12388();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String[] m12388() {
        String[] strArr = new String[this.f795.size()];
        this.f795.copyInto(strArr);
        return strArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Vector m12389() {
        return this.f795;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12390(String str) {
        this.f795.removeElement(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12391(String str, int i) {
        this.f795.setElementAt(str, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12392(String[] strArr) {
        this.f795 = new Vector(strArr.length);
        for (String str : strArr) {
            this.f795.addElement(str);
        }
    }
}
