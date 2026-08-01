package p000;

import android.app.C0988;
import android.support.v4.graphics.drawable.C0992;
import android.view.animation.Interpolator;
import androidx.activity.C0997;
import androidx.appcompat.widget.C1001;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1005;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1014;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.versionedparcelable.C1026;
import androidx.viewpager2.adapter.C1029;
import com.ljx.wechatmod.auth.C1051;

/* JADX INFO: renamed from: sn */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InterpolatorC0714sn implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        String str;
        int iM2916 = C1003.m2916("ۢۧ۟");
        double d = 0.0d;
        double d2 = 0.0d;
        double dPow = 0.0d;
        while (true) {
            switch (iM2916) {
                case 56356:
                    return (float) (0.0d - ((0.0d - (Math.sin(((((d2 + 3.0d) - (d / 4.0d)) - 3.0d) * 6.283185307179586d) / d) * dPow)) - 1.0d));
                case 1746781:
                    d = 0.28f;
                    if (C1005.m2923() > 0) {
                        str = "ۡۥ";
                    } else {
                        C0992.f5636 = 55;
                        iM2916 = C1014.m2960("۟ۢ۠");
                    }
                    break;
                case 1748734:
                    if (C1020.m2983() > 0) {
                        iM2916 = C1019.m2978("ۢۧ۟");
                    } else {
                        C1011.f5655 = 28;
                        str = "ۥۣۢ";
                    }
                    break;
                case 1749818:
                    d2 = f;
                    if (C1019.f5663 - (C1029.f5673 % (-6160)) >= 0) {
                        C1001.f5645 = 6;
                    }
                    iM2916 = C0988.m2854("ۣۨۨ");
                    continue;
                case 1755619:
                    dPow = Math.pow(2.0d, (-10.0d) * d2);
                    iM2916 = C1051.m3108(C0997.f5641 >= 0 ? "ۢۧ۟" : "۟ۢ۠");
                    continue;
            }
            iM2916 = C1026.m3006(str);
        }
    }
}
