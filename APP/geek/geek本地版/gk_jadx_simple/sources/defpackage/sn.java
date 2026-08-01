package defpackage;

import android.app.C0002;
import android.support.v4.graphics.drawable.C0006;
import android.view.animation.Interpolator;
import androidx.activity.C0011;
import androidx.appcompat.widget.C0015;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.core.widget.C0025;
import androidx.legacy.content.C0028;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.versionedparcelable.C0040;
import androidx.viewpager2.adapter.C0043;
import com.ljx.wechatmod.auth.C0065;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r13) {
        int r0 = C0017.m70("ۢۧ۟");
        double r2 = 0.0d;
        double r6 = 0.0d;
        double r8 = 0.0d;
    L3:
        switch(r0) {
            case 56356: goto L6;
            case 1746781: goto L16;
            case 1748734: goto L8;
            case 1749818: goto L12;
            case 1755619: goto L20;
            default: goto L3;
        };
    L6:
        return (float) (0.0d - ((0.0d - (Math.sin(((((r6 + 3.0d) - (r2 / 4.0d)) - 3.0d) * 6.283185307179586d) / r2) * r8)) - 1.0d));
    L8:
        if (C0034.m137() <= 0) goto L9;
        r0 = C0033.m132("ۢۧ۟");
        goto L3
    L9:
        C0025.f25 = 28;
        String r02 = "ۥۣۢ";
    L10:
        r0 = C0040.m160(r02);
        goto L3
    L12:
        r6 = r13;
        if ((C0033.f33 - (C0043.f43 % (-6160))) < 0) goto L15;
        C0015.f15 = 6;
    L15:
        r0 = C0002.m8("ۣۨۨ");
        goto L3
    L16:
        r2 = 0.28f;
        if (C0019.m77() > 0) goto L19;
        C0006.f6 = 55;
        r0 = C0028.m114("۟ۢ۠");
        goto L3
    L19:
        r02 = "ۡۥ";
        goto L10
    L20:
        r8 = Math.pow(2.0d, (-10.0d) * r6);
        if (C0011.f11 < 0) goto L24;
        String r03 = "ۢۧ۟";
    L23:
        r0 = C0065.m263(r03);
        goto L3
    L24:
        r03 = "۟ۢ۠";
        goto L23
    }
}
