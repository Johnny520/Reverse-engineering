package p000;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.view.WindowInsets;

/* JADX INFO: renamed from: Lj */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0499Lj {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m963a(Gainmap r0) {
        return r0.getDisplayRatioForFullHdr();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m964b() {
        return WindowInsets.Type.systemOverlays();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Bitmap m965c(Gainmap r0) {
        return r0.getGainmapContents();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Gainmap m966d(Bitmap r0) {
        return r0.getGainmap();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m967e(Bitmap r0, Gainmap r1) {
        r0.setGainmap(r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m968f(Gainmap r0, float r1) {
        r0.setDisplayRatioForFullHdr(r1);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m969g(Gainmap r0, float r1, float r2, float r3) {
        r0.setGamma(r1, r2, r3);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ float[] m970h(Gainmap r0) {
        return r0.getGamma();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ float m971i(Gainmap r0) {
        return r0.getMinDisplayRatioForHdrTransition();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Gainmap m972j(Bitmap r1) {
        return new Gainmap(r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m973k(Gainmap r0, float r1) {
        r0.setMinDisplayRatioForHdrTransition(r1);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m974l(Gainmap r0, float r1, float r2, float r3) {
        r0.setEpsilonSdr(r1, r2, r3);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ float[] m975m(Gainmap r0) {
        return r0.getEpsilonSdr();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m976n(Gainmap r0, float r1, float r2, float r3) {
        r0.setEpsilonHdr(r1, r2, r3);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ float[] m977o(Gainmap r0) {
        return r0.getEpsilonHdr();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m978p(Gainmap r0, float r1, float r2, float r3) {
        r0.setRatioMin(r1, r2, r3);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ float[] m979q(Gainmap r0) {
        return r0.getRatioMin();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m980r(Gainmap r0, float r1, float r2, float r3) {
        r0.setRatioMax(r1, r2, r3);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ float[] m981s(Gainmap r0) {
        return r0.getRatioMax();
    }
}
