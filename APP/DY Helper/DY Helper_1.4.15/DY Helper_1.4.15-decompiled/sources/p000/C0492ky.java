package p000;

/* JADX INFO: renamed from: ky */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0492ky implements p000.InterfaceC0332gr {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.jr0 f6308;

    public C0492ky(androidx.emoji2.text.EmojiCompatInitializer r1, p000.jr0 r2) {
            r0 = this;
            r0.<init>()
            r0.f6308 = r2
            return
    }

    @Override // p000.InterfaceC0332gr
    /* JADX INFO: renamed from: θ */
    public final void mo386(p000.hr0 r4) {
            r3 = this;
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = p000.AbstractC0402io.m2776(r4)
            md r0 = new md
            r0.<init>()
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r1)
            jr0 r4 = r3.f6308
            r4.m2985(r3)
            return
    }
}
