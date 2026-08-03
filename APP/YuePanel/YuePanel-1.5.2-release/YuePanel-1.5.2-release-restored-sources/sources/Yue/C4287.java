package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4287 extends AbstractC4285 {

    /* JADX INFO: renamed from: ۥ۟ */
    public String f792;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4287() {
    }

    @Override // Yue.AbstractC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4287) || !super.equals(obj)) {
            return false;
        }
        C4287 c4287 = (C4287) obj;
        String str = this.f792;
        if (str == null) {
            if (c4287.f792 != null) {
                return false;
            }
        } else if (!str.equals(c4287.f792)) {
            return false;
        }
        return true;
    }

    @Override // Yue.AbstractC4285, Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print(this.f792);
        this.f791.mo1236(printWriter);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12381() {
        return this.f792;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12382(String str) {
        this.f792 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4287(String str) {
        this.f792 = str;
    }
}
