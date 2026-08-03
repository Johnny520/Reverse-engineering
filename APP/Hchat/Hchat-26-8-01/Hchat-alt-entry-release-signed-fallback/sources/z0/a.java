package z0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends gg.m implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0.c f22474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22475h;

    public a(z0.c r1, int r2) {
            r0 = this;
            r0.f22474g = r1
            r0.f22475h = r2
            r1 = 4
            r0.<init>(r1)
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            z0.c r0 = r3.f22474g
            xe.e r1 = r0.f22478g
            y1.t r0 = r0.f22480i
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r4, r5, r6, r7)
            java.lang.Object r4 = r1.f21559b
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            int r5 = r3.f22475h
            r4.notifyViewEntered(r0, r5, r2)
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
