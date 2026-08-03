package p000a;

import android.content.Context;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.J5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0170J5 {

    /* JADX INFO: renamed from: f */
    public static final int f598f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f599a;

    /* JADX INFO: renamed from: b */
    public final int f600b;

    /* JADX INFO: renamed from: c */
    public final int f601c;

    /* JADX INFO: renamed from: d */
    public final int f602d;

    /* JADX INFO: renamed from: e */
    public final float f603e;

    public C0170J5(Context context) {
        boolean zM2245b = C0955za.m2245b(context, C1247R.attr.elevationOverlayEnabled, false);
        int iM683a = C0247Na.m683a(context, C1247R.attr.elevationOverlayColor, 0);
        int iM683a2 = C0247Na.m683a(context, C1247R.attr.elevationOverlayAccentColor, 0);
        int iM683a3 = C0247Na.m683a(context, C1247R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f599a = zM2245b;
        this.f600b = iM683a;
        this.f601c = iM683a2;
        this.f602d = iM683a3;
        this.f603e = f;
    }
}
