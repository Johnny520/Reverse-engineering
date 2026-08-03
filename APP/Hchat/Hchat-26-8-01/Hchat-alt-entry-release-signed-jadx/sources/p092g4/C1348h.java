package p092g4;

import p295u4.C4265o;

/* JADX INFO: renamed from: g4.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1348h {

    /* JADX INFO: renamed from: a */
    public final C1342b f4458a;

    /* JADX INFO: renamed from: b */
    public final C1350j f4459b;

    /* JADX INFO: renamed from: c */
    public int f4460c = -1;

    /* JADX INFO: renamed from: d */
    public C4265o f4461d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1348h(C1342b c1342b, C1350j c1350j) {
        this.f4458a = c1342b;
        this.f4459b = c1350j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C4265o m3624a() {
        if (this.f4461d == null) {
            this.f4458a.m3616f();
            if (this.f4461d == null) {
                throw new AssertionError();
            }
        }
        return this.f4461d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "v" + this.f4460c + "(" + this.f4459b + ")";
    }
}
