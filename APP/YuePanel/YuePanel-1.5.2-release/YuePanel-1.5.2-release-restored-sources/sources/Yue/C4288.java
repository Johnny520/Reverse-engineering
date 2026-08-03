package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4288 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f793;

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC4284 f794;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4288() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4288)) {
            return false;
        }
        C4288 c4288 = (C4288) obj;
        String str = this.f793;
        if (str == null) {
            if (c4288.f793 != null) {
                return false;
            }
        } else if (!str.equals(c4288.f793)) {
            return false;
        }
        AbstractC4284 abstractC4284 = this.f794;
        if (abstractC4284 == null) {
            if (c4288.f794 != null) {
                return false;
            }
        } else if (!abstractC4284.equals(c4288.f794)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<!NOTATION ");
        printWriter.print(this.f793);
        printWriter.print(" ");
        this.f794.mo1236(printWriter);
        printWriter.println(">");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC4284 m1246() {
        return this.f794;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m12383() {
        return this.f793;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12384(AbstractC4284 abstractC4284) {
        this.f794 = abstractC4284;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12385(String str) {
        this.f793 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4288(String str) {
        this.f793 = str;
    }
}
