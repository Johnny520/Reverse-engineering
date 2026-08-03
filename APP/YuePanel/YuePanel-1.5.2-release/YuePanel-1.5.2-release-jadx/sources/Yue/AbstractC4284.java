package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4284 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f790;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4284)) {
            return false;
        }
        AbstractC4284 abstractC4284 = (AbstractC4284) obj;
        String str = this.f790;
        if (str == null) {
            if (abstractC4284.f790 != null) {
                return false;
            }
        } else if (!str.equals(abstractC4284.f790)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo1236(PrintWriter printWriter) throws IOException;

    /* JADX INFO: renamed from: ۥ۟ */
    public String m1244() {
        return this.f790;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12379(String str) {
        this.f790 = str;
    }
}
