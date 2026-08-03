package p267s1;

import p057e1.C0807b;

/* JADX INFO: renamed from: s1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3887c {

    /* JADX INFO: renamed from: a */
    public final long f12748a;

    /* JADX INFO: renamed from: b */
    public final long f12749b;

    /* JADX INFO: renamed from: c */
    public final float f12750c;

    /* JADX INFO: renamed from: d */
    public final long f12751d;

    /* JADX INFO: renamed from: e */
    public final long f12752e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3887c(long j3, long j4, float f3, long j5, long j10) {
        this.f12748a = j3;
        this.f12749b = j4;
        this.f12750c = f3;
        this.f12751d = j5;
        this.f12752e = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f12748a + ", position=" + ((Object) C0807b.m2044g(this.f12749b)) + ", scaleFactor=" + this.f12750c + ", panOffset=" + ((Object) C0807b.m2044g(this.f12751d)) + ')';
    }
}
