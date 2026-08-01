package p215oc;

/* JADX INFO: renamed from: oc.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5709d0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f18037a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final void m23124a(long j10, long j11, long j12) {
        if (j11 < 0 || j12 > j10) {
            throw new IndexOutOfBoundsException("startIndex (" + j11 + ") and endIndex (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
        if (j11 <= j12) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j11 + ") > endIndex (" + j12 + ')');
    }

    /* JADX INFO: renamed from: b */
    public static final void m23125b(long j10, long j11, long j12) {
        if (j11 < 0 || j11 > j10 || j10 - j11 < j12 || j12 < 0) {
            throw new IllegalArgumentException("offset (" + j11 + ") and byteCount (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final char[] m23126c() {
        return f18037a;
    }
}
