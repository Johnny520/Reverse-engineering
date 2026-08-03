package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6263 extends Yue.C5376 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.ref.WeakReference<android.content.Context> f22320;

    public C6263(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f22320 = r2
            return
    }

    @Override // Yue.C5376, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r4) throws android.content.res.Resources.NotFoundException {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.m20257(r4)
            java.lang.ref.WeakReference<android.content.Context> r1 = r3.f22320
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            Yue.ۥۡۦۦۢ r2 = Yue.C5354.m20196()
            r2.m20217(r1, r4, r0)
        L17:
            return r0
    }
}
