package p006D;

import android.content.ClipData;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0093c {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m324a(Configuration r02) {
        return r02.fontWeightAdjustment;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m325b(ContentInfo r02) {
        return r02.getFlags();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m326c(RoundedCorner r02) {
        return r02.getRadius();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ClipData m327d(ContentInfo r02) {
        return r02.getClip();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ContentInfo.Builder m328e(ClipData r1, int r2) {
        return new ContentInfo.Builder(r1, r2);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ContentInfo m329f(ContentInfo.Builder r02) {
        return r02.build();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ ContentInfo m330g(Object r02) {
        return (ContentInfo) r02;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ RoundedCorner m331h(WindowInsets r1) {
        return r1.getRoundedCorner(0);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m332i(ContentInfo.Builder r02, int r1) {
        r02.setFlags(r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m333j(ContentInfo.Builder r02, Uri r1) {
        r02.setLinkUri(r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m334k(ContentInfo.Builder r02, Bundle r1) {
        r02.setExtras(r1);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ int m335l(ContentInfo r02) {
        return r02.getSource();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ RoundedCorner m336m(WindowInsets r1) {
        return r1.getRoundedCorner(1);
    }
}
