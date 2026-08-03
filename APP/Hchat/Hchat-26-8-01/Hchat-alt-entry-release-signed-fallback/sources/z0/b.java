package z0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.m implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0.c f22476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x1.f0 f22477h;

    public b(z0.c r1, x1.f0 r2) {
            r0 = this;
            r0.f22476g = r1
            r0.f22477h = r2
            r1 = 4
            r0.<init>(r1)
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            z0.c r0 = r2.f22476g
            android.graphics.Rect r1 = r0.f22483l
            r1.set(r3, r4, r5, r6)
            xe.e r3 = r0.f22478g
            y1.t r4 = r0.f22480i
            x1.f0 r5 = r2.f22477h
            int r5 = r5.f20890h
            android.graphics.Rect r6 = r0.f22483l
            java.lang.Object r3 = r3.f21559b
            android.view.autofill.AutofillManager r3 = (android.view.autofill.AutofillManager) r3
            r3.requestAutofill(r4, r5, r6)
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
