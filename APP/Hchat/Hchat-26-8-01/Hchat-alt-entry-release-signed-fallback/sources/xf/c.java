package xf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yf.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.p f21587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wf.c f21588i;

    public c(wf.c r1, wf.g r2, fg.p r3, wf.c r4) {
            r0 = this;
            r0.f21587h = r3
            r0.f21588i = r4
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f21586g
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Le
            r3.f21586g = r1
            f8.i.I0(r4)
            return r4
        Le:
            java.lang.String r4 = "This coroutine had already completed"
            j8.o.A(r4)
            r4 = 0
            return r4
        L15:
            r3.f21586g = r2
            f8.i.I0(r4)
            fg.p r4 = r3.f21587h
            r4.getClass()
            gg.x.c(r1, r4)
            wf.c r0 = r3.f21588i
            java.lang.Object r4 = r4.invoke(r0, r3)
            return r4
    }
}
