package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4270 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public Hashtable f773 = new Hashtable();

    /* JADX INFO: renamed from: ۥ۟ */
    public Hashtable f774 = new Hashtable();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Hashtable f8792 = new Hashtable();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Hashtable f8793 = new Hashtable();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Vector f8794 = new Vector();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C4279 f8795;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4270) {
            return this.f8794.equals(((C4270) obj).f8794);
        }
        return false;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        Enumeration enumerationElements = this.f8794.elements();
        while (enumerationElements.hasMoreElements()) {
            ((InterfaceC4290) enumerationElements.nextElement()).mo1236(printWriter);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Object m1237(int i) {
        return this.f8794.elementAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Object[] m12324() {
        return this.f8794.toArray();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Vector m12325(Class cls) {
        Vector vector = new Vector();
        Enumeration enumerationElements = this.f8794.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (cls.isAssignableFrom(objNextElement.getClass())) {
                vector.addElement(objNextElement);
            }
        }
        return vector;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12326(Object obj, int i) {
        this.f8794.setElementAt(obj, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12327(Object[] objArr) {
        this.f8794 = new Vector(objArr.length);
        for (Object obj : objArr) {
            this.f8794.addElement(obj);
        }
    }
}
