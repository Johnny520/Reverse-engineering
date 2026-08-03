package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k.g f6904h;

    public /* synthetic */ a(k.g r1, int r2) {
            r0 = this;
            r0.f6903g = r2
            r0.f6904h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f6903g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            k.g r0 = r4.f6904h
            fg.a r0 = r0.C
            r0.invoke()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lf:
            i0.u r0 = k.v0.f7087a
            k.g r1 = r4.f6904h
            java.lang.Object r0 = x1.k.h(r1, r0)
            k.y0 r0 = (k.y0) r0
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            o.b.a(r2)
        L2c:
            k.y0 r2 = r1.E
            r1.E = r0
            if (r2 == 0) goto L4b
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L4b
            x1.i r0 = r1.H
            if (r0 != 0) goto L40
            boolean r2 = r1.N
            if (r2 != 0) goto L4b
        L40:
            if (r0 == 0) goto L45
            r1.l1(r0)
        L45:
            r0 = 0
            r1.H = r0
            r1.v1()
        L4b:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
