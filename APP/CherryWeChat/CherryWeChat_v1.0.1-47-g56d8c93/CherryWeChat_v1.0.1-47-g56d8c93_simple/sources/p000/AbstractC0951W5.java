package p000;

import android.content.ClipData;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* JADX INFO: renamed from: W5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0951W5 {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m1808a(Configuration r0) {
        return r0.fontWeightAdjustment;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m1809b(PositionedGlyphs r0) {
        return r0.glyphCount();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m1810c(ContentInfo r0) {
        return r0.getFlags();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ int m1811d(RoundedCorner r0) {
        return r0.getRadius();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ClipData m1812e(ContentInfo r0) {
        return r0.getClip();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Font.Builder m1813f(Font r1) {
        return new Font.Builder(r1);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Font m1814g(PositionedGlyphs r1) {
        return r1.getFont(0);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PositionedGlyphs m1815h(Paint r9) {
        return TextRunShaper.shapeTextRun(" ", 0, 1, 0, 1, 0.0f, 0.0f, false, r9);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ContentInfo.Builder m1816i(ClipData r1, int r2) {
        return new ContentInfo.Builder(r1, r2);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ContentInfo m1817j(ContentInfo.Builder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ ContentInfo m1818k(Object r0) {
        return (ContentInfo) r0;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ RoundedCorner m1819l(WindowInsets r1) {
        return r1.getRoundedCorner(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m1820m(ContentInfo.Builder r0, int r1) {
        r0.setFlags(r1);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m1821n(ContentInfo.Builder r0, Uri r1) {
        r0.setLinkUri(r1);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m1822o(ContentInfo.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ int m1823p(ContentInfo r0) {
        return r0.getSource();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ RoundedCorner m1824q(WindowInsets r1) {
        return r1.getRoundedCorner(1);
    }
}
