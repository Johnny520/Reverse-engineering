package defpackage;

import android.content.Context;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class xh {
    public static final int f = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
        f = (int) Math.round(5.1000000000000005d);
    }

    public xh(Context r6) {
        boolean r0 = gt.z(r6, R.attr.elevationOverlayEnabled, false);
        int r2 = zt.j(r6, R.attr.elevationOverlayColor, 0);
        int r3 = zt.j(r6, R.attr.elevationOverlayAccentColor, 0);
        int r1 = zt.j(r6, R.attr.colorSurface, 0);
        float r62 = r6.getResources().getDisplayMetrics().density;
        this.a = r0;
        this.b = r2;
        this.c = r3;
        this.d = r1;
        this.e = r62;
    }
}
