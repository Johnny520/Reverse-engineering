package p001;

/* JADX INFO: renamed from: ۟.g4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0223g4 extends C0195e4 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final C0223g4 f1471 = new C0223g4(1, 0);

    public C0223g4(int i, int i2) {
        super(i, i2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0223g4) {
            if (!isEmpty() || !((C0223g4) obj).isEmpty()) {
                C0223g4 c0223g4 = (C0223g4) obj;
                if (this.f761 != c0223g4.f761 || this.f762 != c0223g4.f762) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f761 * 31) + this.f762;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f761 > this.f762;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f761 + ".." + this.f762;
    }
}
