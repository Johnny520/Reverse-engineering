package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 {

    /* JADX INFO: renamed from: a */
    public final ai2 f844a;

    /* JADX INFO: renamed from: b */
    public final di2 f845b;

    /* JADX INFO: renamed from: c */
    public final boolean f846c;

    /* JADX INFO: renamed from: d */
    public final boolean f847d;

    public bg2(ai2 ai2Var, di2 di2Var, boolean z, boolean z2) {
        this.f844a = ai2Var;
        this.f845b = di2Var;
        this.f846c = z;
        this.f847d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.f844a.equals(bg2Var.f844a) && this.f845b.equals(bg2Var.f845b) && this.f846c == bg2Var.f846c && this.f847d == bg2Var.f847d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f847d) + hk1.m2205d((this.f845b.hashCode() + (this.f844a.hashCode() * 31)) * 31, 31, this.f846c);
    }

    public final String toString() {
        return "ScriptDownloadMediaRequest(media=" + this.f844a + ", destination=" + this.f845b + ", overwrite=" + this.f846c + ", createParents=" + this.f847d + ")";
    }
}
