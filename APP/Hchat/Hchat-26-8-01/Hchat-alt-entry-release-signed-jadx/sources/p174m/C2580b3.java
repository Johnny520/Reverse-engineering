package p174m;

import p057e1.C0807b;

/* JADX INFO: renamed from: m.b3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2580b3 {

    /* JADX INFO: renamed from: a */
    public final long f8368a;

    /* JADX INFO: renamed from: b */
    public final long f8369b;

    /* JADX INFO: renamed from: c */
    public final boolean f8370c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2580b3(long j3, long j4, boolean z9) {
        this.f8368a = j3;
        this.f8369b = j4;
        this.f8370c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2580b3 m6050a(C2580b3 c2580b3) {
        return new C2580b3(C0807b.m2042e(this.f8368a, c2580b3.f8368a), Math.max(this.f8369b, c2580b3.f8369b), this.f8370c || c2580b3.f8370c);
    }
}
