package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.u f2101h;

    public /* synthetic */ g(gg.u r1, int r2) {
            r0 = this;
            r0.f2100g = r2
            r0.f2101h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2100g
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            x1.e2 r3 = (x1.e2) r3
            r3.getClass()
            s.g1 r3 = (s.g1) r3
            s.m0 r3 = r3.f12016u
            gg.u r0 = r2.f2101h
            java.lang.Object r1 = r0.f4564g
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L1a
            r1.add(r3)
            goto L22
        L1a:
            s.m0[] r3 = new s.m0[]{r3}
            java.util.ArrayList r1 = a.a.C0(r3)
        L22:
            r0.f4564g = r1
            x1.d2 r3 = x1.d2.f20873h
            return r3
        L27:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            r3.getClass()
            gg.u r0 = r2.f2101h
            java.lang.Object r0 = r0.f4564g
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            return r3
    }
}
