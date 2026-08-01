package p132a3;

/* JADX INFO: renamed from: a3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1804d extends C1802b {

    /* JADX INFO: renamed from: g */
    public static final C1804d f6147g = new C1804d(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p132a3.C1802b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1804d)) {
            return false;
        }
        if (isEmpty() && ((C1804d) obj).isEmpty()) {
            return true;
        }
        C1804d c1804d = (C1804d) obj;
        return this.f6140d == c1804d.f6140d && this.f6141e == c1804d.f6141e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p132a3.C1802b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6140d * 31) + this.f6141e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p132a3.C1802b
    public final boolean isEmpty() {
        return this.f6140d > this.f6141e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p132a3.C1802b
    public final String toString() {
        return this.f6140d + ".." + this.f6141e;
    }
}
