package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16592l;

    public /* synthetic */ hl(boolean r1, android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f16587g = r6
            r0.f16588h = r1
            r0.f16589i = r2
            r0.f16590j = r3
            r0.f16591k = r4
            r0.f16592l = r5
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f16587g
            java.util.List r3 = (java.util.List) r3
            switch(r0) {
                case 0: goto L2e;
                default: goto L7;
            }
        L7:
            r3.getClass()
            boolean r0 = r2.f16588h
            if (r0 == 0) goto L14
            i0.a1 r0 = r2.f16590j
            r0.setValue(r3)
            goto L19
        L14:
            i0.a1 r0 = r2.f16591k
            r0.setValue(r3)
        L19:
            r3 = 0
            i0.a1 r0 = r2.f16592l
            r0.setValue(r3)
            java.lang.String r3 = "回复步骤已更新"
            r0 = 0
            android.content.Context r1 = r2.f16589i
            android.widget.Toast r3 = android.widget.Toast.makeText(r1, r3, r0)
            r3.show()
        L2b:
            sf.n r3 = sf.n.f12433a
            return r3
        L2e:
            r3.getClass()
            boolean r0 = r2.f16588h
            if (r0 == 0) goto L3b
            i0.a1 r0 = r2.f16590j
            r0.setValue(r3)
            goto L40
        L3b:
            i0.a1 r0 = r2.f16591k
            r0.setValue(r3)
        L40:
            r3 = 0
            i0.a1 r0 = r2.f16592l
            r0.setValue(r3)
            java.lang.String r3 = "回复步骤已更新"
            r0 = 0
            android.content.Context r1 = r2.f16589i
            android.widget.Toast r3 = android.widget.Toast.makeText(r1, r3, r0)
            r3.show()
            goto L2b
    }
}
