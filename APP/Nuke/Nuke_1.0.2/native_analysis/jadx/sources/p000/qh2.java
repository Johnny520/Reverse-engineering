package p000;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qh2 {

    /* JADX INFO: renamed from: a */
    public final Instant f8975a;

    /* JADX INFO: renamed from: b */
    public final ph2 f8976b;

    /* JADX INFO: renamed from: c */
    public final sh2 f8977c;

    /* JADX INFO: renamed from: d */
    public final String f8978d;

    /* JADX INFO: renamed from: e */
    public final String f8979e;

    /* JADX INFO: renamed from: f */
    public final si2 f8980f;

    /* JADX INFO: renamed from: g */
    public final Throwable f8981g;

    public qh2(Instant instant, ph2 ph2Var, sh2 sh2Var, String str, String str2, si2 si2Var, Throwable th) {
        ph2Var.getClass();
        this.f8975a = instant;
        this.f8976b = ph2Var;
        this.f8977c = sh2Var;
        this.f8978d = str;
        this.f8979e = str2;
        this.f8980f = si2Var;
        this.f8981g = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return t11.m5086l(this.f8975a, qh2Var.f8975a) && this.f8976b == qh2Var.f8976b && this.f8977c == qh2Var.f8977c && t11.m5086l(this.f8978d, qh2Var.f8978d) && t11.m5086l(this.f8979e, qh2Var.f8979e) && this.f8980f == qh2Var.f8980f && t11.m5086l(this.f8981g, qh2Var.f8981g);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f8978d, (this.f8977c.hashCode() + ((this.f8976b.hashCode() + (this.f8975a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.f8979e;
        int iHashCode = (iM2207f + (str == null ? 0 : str.hashCode())) * 31;
        si2 si2Var = this.f8980f;
        int iHashCode2 = (iHashCode + (si2Var == null ? 0 : si2Var.hashCode())) * 31;
        Throwable th = this.f8981g;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ScriptLogRecord(timestamp=" + this.f8975a + ", level=" + this.f8976b + ", source=" + this.f8977c + ", message=" + this.f8978d + ", scriptId=" + this.f8979e + ", phase=" + this.f8980f + ", error=" + this.f8981g + ")";
    }
}
