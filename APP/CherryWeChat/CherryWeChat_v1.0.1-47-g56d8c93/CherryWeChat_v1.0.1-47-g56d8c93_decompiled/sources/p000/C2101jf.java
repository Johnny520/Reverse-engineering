package p000;

import android.content.Context;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes.dex */
public final class C2101jf {

    /* JADX INFO: renamed from: f */
    public static final int f7389f = (int) Math.round(5.1000000000000005d);

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

    public C2101jf(Context context) {
        boolean zM2538Q = AbstractC1293cr.m2538Q(context, R.attr.elevationOverlayEnabled, false);
        int iM620m = AbstractC0295Gu.m620m(context, R.attr.elevationOverlayColor, 0);
        int iM620m2 = AbstractC0295Gu.m620m(context, R.attr.elevationOverlayAccentColor, 0);
        int iM620m3 = AbstractC0295Gu.m620m(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7390a = zM2538Q;
        this.f7391b = iM620m;
        this.f7392c = iM620m2;
        this.f7393d = iM620m3;
        this.f7394e = f;
    }
}
