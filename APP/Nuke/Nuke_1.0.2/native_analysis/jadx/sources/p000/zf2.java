package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zf2 {

    /* JADX INFO: renamed from: a */
    public final File f13876a;

    /* JADX INFO: renamed from: b */
    public final ag2 f13877b;

    /* JADX INFO: renamed from: c */
    public final String f13878c;

    /* JADX INFO: renamed from: d */
    public final Throwable f13879d;

    public zf2(File file, ag2 ag2Var, String str, Throwable th) {
        this.f13876a = file;
        this.f13877b = ag2Var;
        this.f13878c = str;
        this.f13879d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf2)) {
            return false;
        }
        zf2 zf2Var = (zf2) obj;
        return t11.m5086l(this.f13876a, zf2Var.f13876a) && this.f13877b == zf2Var.f13877b && t11.m5086l(this.f13878c, zf2Var.f13878c) && t11.m5086l(this.f13879d, zf2Var.f13879d);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f13878c, (this.f13877b.hashCode() + (this.f13876a.hashCode() * 31)) * 31, 31);
        Throwable th = this.f13879d;
        return iM2207f + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "ScriptDiscoveryIssue(directory=" + this.f13876a + ", type=" + this.f13877b + ", message=" + this.f13878c + ", cause=" + this.f13879d + ")";
    }
}
