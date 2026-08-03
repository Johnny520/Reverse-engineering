package p000;

import android.content.Context;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes.dex */
public final class C2101jf {

    /* JADX INFO: renamed from: f */
    public static final int f7389f = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f7390a;

    /* JADX INFO: renamed from: b */
    public final int f7391b;

    /* JADX INFO: renamed from: c */
    public final int f7392c;

    /* JADX INFO: renamed from: d */
    public final int f7393d;

    /* JADX INFO: renamed from: e */
    public final float f7394e;

    static {
        f7389f = (int) Math.round(5.1000000000000005d);
    }

    public C2101jf(Context r6) {
        boolean r0 = AbstractC1293cr.m2538Q(r6, R.attr.elevationOverlayEnabled, false);
        int r2 = AbstractC0295Gu.m620m(r6, R.attr.elevationOverlayColor, 0);
        int r3 = AbstractC0295Gu.m620m(r6, R.attr.elevationOverlayAccentColor, 0);
        int r1 = AbstractC0295Gu.m620m(r6, R.attr.colorSurface, 0);
        float r62 = r6.getResources().getDisplayMetrics().density;
        this.f7390a = r0;
        this.f7391b = r2;
        this.f7392c = r3;
        this.f7393d = r1;
        this.f7394e = r62;
    }
}
