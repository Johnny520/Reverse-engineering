package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q71 {

    /* JADX INFO: renamed from: a */
    public final String f5080a;

    /* JADX INFO: renamed from: b */
    public String f5081b;

    /* JADX INFO: renamed from: c */
    public boolean f5082c = false;

    /* JADX INFO: renamed from: d */
    public zo0 f5083d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q71(String str, String str2) {
        this.f5080a = str;
        this.f5081b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q71)) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return p30.m3002l(this.f5080a, q71Var.f5080a) && p30.m3002l(this.f5081b, q71Var.f5081b) && this.f5082c == q71Var.f5082c && p30.m3002l(this.f5083d, q71Var.f5083d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4145c = AbstractC0748t1.m4145c((this.f5081b.hashCode() + (this.f5080a.hashCode() * 31)) * 31, 31, this.f5082c);
        zo0 zo0Var = this.f5083d;
        return iM4145c + (zo0Var == null ? 0 : zo0Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f5083d + ", isShowingSubstitution=" + this.f5082c + ')';
    }
}
