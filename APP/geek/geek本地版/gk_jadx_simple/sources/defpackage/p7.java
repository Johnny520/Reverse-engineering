package defpackage;

import android.content.ClipData;
import android.content.res.Configuration;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p7 {
    public static /* bridge */ /* synthetic */ int a(Configuration r0) {
        return r0.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ int b(ContentInfo r0) {
        return r0.getFlags();
    }

    public static /* bridge */ /* synthetic */ int c(RoundedCorner r0) {
        return r0.getRadius();
    }

    public static /* bridge */ /* synthetic */ ClipData d(ContentInfo r0) {
        return r0.getClip();
    }

    public static /* bridge */ /* synthetic */ RenderEffect e(float r1, float r2) {
        return RenderEffect.createBlurEffect(r1, r2, Shader.TileMode.CLAMP);
    }

    public static /* synthetic */ ContentInfo.Builder f(ClipData r1, int r2) {
        return new ContentInfo.Builder(r1, r2);
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(ContentInfo.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object r0) {
        return (ContentInfo) r0;
    }

    public static /* bridge */ /* synthetic */ RoundedCorner i(WindowInsets r1) {
        return r1.getRoundedCorner(0);
    }

    public static /* bridge */ /* synthetic */ void j(ContentInfo.Builder r0, int r1) {
        r0.setFlags(r1);
    }

    public static /* bridge */ /* synthetic */ void k(ContentInfo.Builder r0, Uri r1) {
        r0.setLinkUri(r1);
    }

    public static /* bridge */ /* synthetic */ void l(ContentInfo.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    public static /* bridge */ /* synthetic */ void m(WindowManager.LayoutParams r1) {
        r1.setBlurBehindRadius(50);
    }

    public static /* bridge */ /* synthetic */ void n(WindowManager.LayoutParams r0, int r1) {
        r0.setBlurBehindRadius(r1);
    }

    public static /* bridge */ /* synthetic */ void o(ImageView r1) {
        r1.setRenderEffect(null);
    }

    public static /* bridge */ /* synthetic */ void p(ImageView r0, RenderEffect r1) {
        r0.setRenderEffect(r1);
    }

    public static /* bridge */ /* synthetic */ void q(TextView r1) {
        r1.setRenderEffect(null);
    }

    public static /* bridge */ /* synthetic */ void r(TextView r0, RenderEffect r1) {
        r0.setRenderEffect(r1);
    }

    public static /* bridge */ /* synthetic */ int s(ContentInfo r0) {
        return r0.getSource();
    }

    public static /* bridge */ /* synthetic */ RoundedCorner t(WindowInsets r1) {
        return r1.getRoundedCorner(1);
    }

    public static /* bridge */ /* synthetic */ void u(WindowManager.LayoutParams r1) {
        r1.setBlurBehindRadius(40);
    }
}
