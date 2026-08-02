package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 {
    public final ai2 a;
    public final di2 b;
    public final boolean c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bg2(ai2 ai2Var, di2 di2Var, boolean z, boolean z2) {
        this.a = ai2Var;
        this.b = di2Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.a.equals(bg2Var.a) && this.b.equals(bg2Var.b) && this.c == bg2Var.c && this.d == bg2Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + hk1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptDownloadMediaRequest(media=" + this.a + ", destination=" + this.b + ", overwrite=" + this.c + ", createParents=" + this.d + ")";
    }
}
