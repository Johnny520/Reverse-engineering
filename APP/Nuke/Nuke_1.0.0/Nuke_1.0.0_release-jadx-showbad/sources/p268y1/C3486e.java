package p268y1;

/* JADX INFO: renamed from: y1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3486e {

    /* JADX INFO: renamed from: a */
    public final long f10826a;

    /* JADX INFO: renamed from: b */
    public final long f10827b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3486e(long j5, long j6) {
        if (j6 == 0) {
            this.f10826a = 0L;
            this.f10827b = 1L;
        } else {
            this.f10826a = j5;
            this.f10827b = j6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10826a + "/" + this.f10827b;
    }
}
