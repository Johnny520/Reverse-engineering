package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ti2 {

    /* JADX INFO: renamed from: a */
    public final String f10788a;

    /* JADX INFO: renamed from: b */
    public final long f10789b;

    /* JADX INFO: renamed from: c */
    public final String f10790c;

    /* JADX INFO: renamed from: d */
    public final List f10791d;

    public ti2(String str, long j, String str2, List list) {
        this.f10788a = str;
        this.f10789b = j;
        this.f10790c = str2;
        this.f10791d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti2)) {
            return false;
        }
        ti2 ti2Var = (ti2) obj;
        return t11.m5086l(this.f10788a, ti2Var.f10788a) && this.f10789b == ti2Var.f10789b && this.f10790c.equals(ti2Var.f10790c) && this.f10791d.equals(ti2Var.f10791d);
    }

    public final int hashCode() {
        String str = this.f10788a;
        return this.f10791d.hashCode() + hk1.m2207f(this.f10790c, (((Long.hashCode(this.f10789b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + 92796966) * 31, 31);
    }

    public final String toString() {
        return "ScriptReceivedMessage(id=" + this.f10788a + ", timestamp=" + this.f10789b + ", direction=incoming, text=" + this.f10790c + ", segments=" + this.f10791d + ")";
    }
}
