package defpackage;

/* JADX INFO: renamed from: ᛲᲁᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0356 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ float f1849;

    public C0356(float r1) {
            r0 = this;
            r0.f1849 = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r9, android.graphics.Outline r10) {
            r8 = this;
            r0 = -106652912492078(0xffff9effef0961d2, double:NaN)
            r0 = -106674387328558(0xffff9efaef0961d2, double:NaN)
            int r5 = r9.getWidth()
            int r6 = r9.getHeight()
            r9 = 1101004800(0x41a00000, float:20.0)
            float r8 = r8.f1849
            float r7 = r9 * r8
            r3 = 0
            r4 = 0
            r2 = r10
            r2.setRoundRect(r3, r4, r5, r6, r7)
            return
    }
}
