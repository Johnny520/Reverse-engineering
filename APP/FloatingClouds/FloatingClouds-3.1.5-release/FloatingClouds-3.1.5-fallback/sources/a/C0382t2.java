package a;

/* JADX INFO: renamed from: a.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0382t2 {
    public static /* bridge */ /* synthetic */ int a(android.content.res.Configuration r0) {
            int r0 = r0.fontWeightAdjustment
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.ContentInfo r0) {
            int r0 = r0.getFlags()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.RoundedCorner r0) {
            int r0 = r0.getRadius()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.ClipData d(android.view.ContentInfo r0) {
            android.content.ClipData r0 = r0.getClip()
            return r0
    }

    public static /* synthetic */ android.view.ContentInfo.Builder e(android.content.ClipData r1, int r2) {
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo f(android.view.ContentInfo.Builder r0) {
            android.view.ContentInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo g(java.lang.Object r0) {
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner h(android.view.WindowInsets r1) {
            r0 = 0
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ void i(android.view.ContentInfo.Builder r0, int r1) {
            r0.setFlags(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.view.ContentInfo.Builder r0, android.net.Uri r1) {
            r0.setLinkUri(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.ContentInfo.Builder r0, android.os.Bundle r1) {
            r0.setExtras(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int l(android.view.ContentInfo r0) {
            int r0 = r0.getSource()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner m(android.view.WindowInsets r1) {
            r0 = 1
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }
}
