package p000;

import android.content.Context;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: xh */
/* JADX INFO: loaded from: classes.dex */
public final class C0893xh {

    /* JADX INFO: renamed from: f */
    public static final int f5160f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f5161a;

    /* JADX INFO: renamed from: b */
    public final int f5162b;

    /* JADX INFO: renamed from: c */
    public final int f5163c;

    /* JADX INFO: renamed from: d */
    public final int f5164d;

    /* JADX INFO: renamed from: e */
    public final float f5165e;

    public C0893xh(Context context) {
        boolean zM1317z = AbstractC0273gt.m1317z(context, R.attr.elevationOverlayEnabled, false);
        int iM2829j = AbstractC0979zt.m2829j(context, R.attr.elevationOverlayColor, 0);
        int iM2829j2 = AbstractC0979zt.m2829j(context, R.attr.elevationOverlayAccentColor, 0);
        int iM2829j3 = AbstractC0979zt.m2829j(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5161a = zM1317z;
        this.f5162b = iM2829j;
        this.f5163c = iM2829j2;
        this.f5164d = iM2829j3;
        this.f5165e = f;
    }
}
