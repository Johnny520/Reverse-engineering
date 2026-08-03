package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4277 extends AbstractC4285 {

    /* JADX INFO: renamed from: ۥ۟ */
    public Vector f782 = new Vector();

    @Override // Yue.AbstractC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4277) && super.equals(obj)) {
            return this.f782.equals(((AbstractC4277) obj).f782);
        }
        return false;
    }

    @Override // Yue.AbstractC4285, Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo1236(PrintWriter printWriter) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12341(AbstractC4285 abstractC4285) {
        this.f782.addElement(abstractC4285);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public AbstractC4285 m12342(int i) {
        return (AbstractC4285) this.f782.elementAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AbstractC4285[] m12343() {
        AbstractC4285[] abstractC4285Arr = new AbstractC4285[this.f782.size()];
        this.f782.copyInto(abstractC4285Arr);
        return abstractC4285Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC4285[] m12344() {
        AbstractC4285[] abstractC4285Arr = new AbstractC4285[this.f782.size()];
        this.f782.copyInto(abstractC4285Arr);
        return abstractC4285Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Vector m12345() {
        return this.f782;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12346(AbstractC4285 abstractC4285) {
        this.f782.removeElement(abstractC4285);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m12347(AbstractC4285 abstractC4285, int i) {
        this.f782.setElementAt(abstractC4285, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m12348(AbstractC4285[] abstractC4285Arr) {
        this.f782 = new Vector(abstractC4285Arr.length);
        for (AbstractC4285 abstractC4285 : abstractC4285Arr) {
            this.f782.addElement(abstractC4285);
        }
    }
}
