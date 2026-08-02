package p000;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412l5 {

    /* JADX INFO: renamed from: a */
    public final ci2 f5935a;

    /* JADX INFO: renamed from: b */
    public final String f5936b;

    public C0412l5(ci2 ci2Var, String str) {
        this.f5935a = ci2Var;
        this.f5936b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0412l5) {
            C0412l5 c0412l5 = (C0412l5) obj;
            if (this.f5935a == c0412l5.f5935a && this.f5936b.equals(c0412l5.f5936b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5936b.hashCode() + (this.f5935a.hashCode() * 31);
    }

    public final String toString() {
        return "AdaptedWeChatMessage(event=" + this.f5935a + ", messageKey=" + this.f5936b + ")";
    }
}
