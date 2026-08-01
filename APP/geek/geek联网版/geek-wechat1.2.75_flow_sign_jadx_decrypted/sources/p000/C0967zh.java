package p000;

import android.content.Context;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: zh */
/* JADX INFO: loaded from: classes.dex */
public final class C0967zh {

    /* JADX INFO: renamed from: f */
    public static final int f5587f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f5588a;

    /* JADX INFO: renamed from: b */
    public final int f5589b;

    /* JADX INFO: renamed from: c */
    public final int f5590c;

    /* JADX INFO: renamed from: d */
    public final int f5591d;

    /* JADX INFO: renamed from: e */
    public final float f5592e;

    public C0967zh(Context context) {
        boolean zM1837K = AbstractC0493mp.m1837K(context, R.attr.elevationOverlayEnabled, false);
        int iM1197l = g80.m1197l(context, R.attr.elevationOverlayColor, 0);
        int iM1197l2 = g80.m1197l(context, R.attr.elevationOverlayAccentColor, 0);
        int iM1197l3 = g80.m1197l(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5588a = zM1837K;
        this.f5589b = iM1197l;
        this.f5590c = iM1197l2;
        this.f5591d = iM1197l3;
        this.f5592e = f;
    }
}
