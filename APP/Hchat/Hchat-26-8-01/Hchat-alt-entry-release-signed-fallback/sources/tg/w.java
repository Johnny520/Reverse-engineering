package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13256a;

    public /* synthetic */ w(int r1) {
            r0 = this;
            r0.f13256a = r1
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f13256a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "SharingStarted.Lazily"
            return r0
        L8:
            java.lang.String r0 = "SharingStarted.Eagerly"
            return r0
    }
}
