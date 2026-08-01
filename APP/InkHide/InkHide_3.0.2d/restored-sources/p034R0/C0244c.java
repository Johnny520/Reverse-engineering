package p034R0;

/* JADX INFO: renamed from: R0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0244c extends C0242a {

    /* JADX INFO: renamed from: d */
    public static final C0244c f590d = new C0244c(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m459a(int i2) {
        return this.f583a <= i2 && i2 <= this.f584b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p034R0.C0242a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0244c)) {
            return false;
        }
        if (isEmpty() && ((C0244c) obj).isEmpty()) {
            return true;
        }
        C0244c c0244c = (C0244c) obj;
        if (this.f583a == c0244c.f583a) {
            return this.f584b == c0244c.f584b;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p034R0.C0242a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f583a * 31) + this.f584b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p034R0.C0242a
    public final boolean isEmpty() {
        return this.f583a > this.f584b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p034R0.C0242a
    public final String toString() {
        return this.f583a + ".." + this.f584b;
    }
}
