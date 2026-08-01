package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p7 {
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

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect e(float r1, float r2) {
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RenderEffect r1 = android.graphics.RenderEffect.createBlurEffect(r1, r2, r0)
            return r1
    }

    public static /* synthetic */ android.view.ContentInfo.Builder f(android.content.ClipData r1, int r2) {
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo g(android.view.ContentInfo.Builder r0) {
            android.view.ContentInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.ContentInfo h(java.lang.Object r0) {
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner i(android.view.WindowInsets r1) {
            r0 = 0
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ void j(android.view.ContentInfo.Builder r0, int r1) {
            r0.setFlags(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.ContentInfo.Builder r0, android.net.Uri r1) {
            r0.setLinkUri(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.view.ContentInfo.Builder r0, android.os.Bundle r1) {
            r0.setExtras(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.view.WindowManager.LayoutParams r1) {
            r0 = 50
            r1.setBlurBehindRadius(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.WindowManager.LayoutParams r0, int r1) {
            r0.setBlurBehindRadius(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.widget.ImageView r1) {
            r0 = 0
            r1.setRenderEffect(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.widget.ImageView r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.widget.TextView r1) {
            r0 = 0
            r1.setRenderEffect(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.widget.TextView r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int s(android.view.ContentInfo r0) {
            int r0 = r0.getSource()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner t(android.view.WindowInsets r1) {
            r0 = 1
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ void u(android.view.WindowManager.LayoutParams r1) {
            r0 = 40
            r1.setBlurBehindRadius(r0)
            return
    }
}
