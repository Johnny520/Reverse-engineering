package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zf2 {
    public final File a;
    public final ag2 b;
    public final String c;
    public final Throwable d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zf2(File file, ag2 ag2Var, String str, Throwable th) {
        this.a = file;
        this.b = ag2Var;
        this.c = str;
        this.d = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf2)) {
            return false;
        }
        zf2 zf2Var = (zf2) obj;
        return t11.l(this.a, zf2Var.a) && this.b == zf2Var.b && t11.l(this.c, zf2Var.c) && t11.l(this.d, zf2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Throwable th = this.d;
        return iF + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptDiscoveryIssue(directory=" + this.a + ", type=" + this.b + ", message=" + this.c + ", cause=" + this.d + ")";
    }
}
