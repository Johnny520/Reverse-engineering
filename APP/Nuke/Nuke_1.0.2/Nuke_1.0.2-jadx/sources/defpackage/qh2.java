package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qh2 {
    public final Instant a;
    public final ph2 b;
    public final sh2 c;
    public final String d;
    public final String e;
    public final si2 f;
    public final Throwable g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qh2(Instant instant, ph2 ph2Var, sh2 sh2Var, String str, String str2, si2 si2Var, Throwable th) {
        ph2Var.getClass();
        this.a = instant;
        this.b = ph2Var;
        this.c = sh2Var;
        this.d = str;
        this.e = str2;
        this.f = si2Var;
        this.g = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return t11.l(this.a, qh2Var.a) && this.b == qh2Var.b && this.c == qh2Var.c && t11.l(this.d, qh2Var.d) && t11.l(this.e, qh2Var.e) && this.f == qh2Var.f && t11.l(this.g, qh2Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        si2 si2Var = this.f;
        int iHashCode2 = (iHashCode + (si2Var == null ? 0 : si2Var.hashCode())) * 31;
        Throwable th = this.g;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptLogRecord(timestamp=" + this.a + ", level=" + this.b + ", source=" + this.c + ", message=" + this.d + ", scriptId=" + this.e + ", phase=" + this.f + ", error=" + this.g + ")";
    }
}
