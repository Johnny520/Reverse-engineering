package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0.p f2931n;

    public a(f0.p r7) {
            r6 = this;
            r6.f2931n = r7
            java.lang.String r4 = "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"
            r5 = 0
            r1 = 1
            java.lang.Class<gg.k> r2 = gg.k.class
            java.lang.String r3 = "localToScreen"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            f1.i0 r3 = (f1.i0) r3
            float[] r3 = r3.f3066a
            f0.p r0 = r2.f2931n
            i0.j1 r0 = r0.f2979x
            java.lang.Object r0 = r0.getValue()
            v1.t r0 = (v1.t) r0
            if (r0 == 0) goto L1e
            boolean r1 = r0.C()
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L1e
        L1b:
            r0.E(r3)
        L1e:
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
