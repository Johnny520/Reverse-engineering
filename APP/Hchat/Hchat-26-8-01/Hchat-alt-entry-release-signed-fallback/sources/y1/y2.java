package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements y1.w1, gg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0.o f22165a;

    public y2(i0.o r1) {
            r0 = this;
            r0.<init>()
            r0.f22165a = r1
            return
    }

    @Override // gg.h
    public final gg.j a() {
            r8 = this;
            gg.j r0 = new gg.j
            r6 = 0
            r7 = 0
            r1 = 1
            i0.o r2 = r8.f22165a
            java.lang.Class<i0.o> r3 = i0.o.class
            java.lang.String r4 = "scheduleFrameEndCallback"
            java.lang.String r5 = "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof y1.w1
            if (r0 == 0) goto L17
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L17
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
        L17:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
    }
}
