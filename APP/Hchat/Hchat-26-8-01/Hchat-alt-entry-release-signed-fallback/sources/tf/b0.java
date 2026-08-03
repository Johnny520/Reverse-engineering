package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends tf.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ tf.c0 f13142k;

    public b0(tf.c0 r2) {
            r1 = this;
            r1.<init>()
            r1.f13142k = r2
            int r0 = r2.size()
            r1.f13140i = r0
            int r2 = r2.f13145i
            r1.f13141j = r2
            return
    }

    @Override // tf.b
    public final void a() {
            r4 = this;
            int r0 = r4.f13140i
            if (r0 != 0) goto L8
            r0 = 2
            r4.f13138g = r0
            return
        L8:
            tf.c0 r1 = r4.f13142k
            java.lang.Object[] r2 = r1.f13143g
            int r3 = r4.f13141j
            r2 = r2[r3]
            r4.f13139h = r2
            r2 = 1
            r4.f13138g = r2
            int r3 = r3 + r2
            int r1 = r1.f13144h
            int r3 = r3 % r1
            r4.f13141j = r3
            int r0 = r0 + (-1)
            r4.f13140i = r0
            return
    }
}
