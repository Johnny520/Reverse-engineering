package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ti2 {
    public final String a;
    public final long b;
    public final String c;
    public final List d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ti2(String str, long j, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti2)) {
            return false;
        }
        ti2 ti2Var = (ti2) obj;
        return t11.l(this.a, ti2Var.a) && this.b == ti2Var.b && this.c.equals(ti2Var.c) && this.d.equals(ti2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + hk1.f(this.c, (((Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + 92796966) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptReceivedMessage(id=" + this.a + ", timestamp=" + this.b + ", direction=incoming, text=" + this.c + ", segments=" + this.d + ")";
    }
}
