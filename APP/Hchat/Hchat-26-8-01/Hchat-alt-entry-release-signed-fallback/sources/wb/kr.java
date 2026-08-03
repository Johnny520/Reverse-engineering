package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fb.d1 f17354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17356j;

    public /* synthetic */ kr(fb.d1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17353g = r4
            r0.f17354h = r1
            r0.f17355i = r2
            r0.f17356j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f17353g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            fb.d1 r0 = r3.f17354h
            java.lang.String r1 = r0.f3484b
            i0.a1 r2 = r3.f17355i
            r2.setValue(r1)
            java.lang.String r0 = r0.f3483a
            i0.a1 r1 = r3.f17356j
            r1.setValue(r0)
        L15:
            sf.n r0 = sf.n.f12433a
            return r0
        L18:
            fb.d1 r0 = r3.f17354h
            java.lang.String r0 = r0.f3483a
            i0.a1 r1 = r3.f17355i
            r1.setValue(r0)
            r0 = 0
            i0.a1 r1 = r3.f17356j
            r1.setValue(r0)
            goto L15
    }
}
