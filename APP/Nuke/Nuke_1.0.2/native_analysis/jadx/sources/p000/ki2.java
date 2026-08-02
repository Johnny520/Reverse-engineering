package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a */
    public final String f5586a;

    /* JADX INFO: renamed from: b */
    public final d41 f5587b;

    public ki2(d41 d41Var, String str) {
        this.f5586a = str;
        this.f5587b = d41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki2)) {
            return false;
        }
        ki2 ki2Var = (ki2) obj;
        return this.f5586a.equals(ki2Var.f5586a) && this.f5587b.equals(ki2Var.f5587b);
    }

    public final int hashCode() {
        return this.f5587b.f1861h.hashCode() + (this.f5586a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptOutgoingMessageSegment(type=" + this.f5586a + ", fields=" + this.f5587b + ")";
    }
}
