package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends android.util.LruCache {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11686;

    public /* synthetic */ wd1(int r1, int r2) {
            r0 = this;
            r0.f11686 = r2
            r0.<init>(r1)
            return
    }

    @Override // android.util.LruCache
    public final int sizeOf(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f11686
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.getClass()
            r2.getClass()
        Lf:
            r0 = 1
            return r0
        L11:
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.getClass()
            r2.getClass()
            goto Lf
    }
}
