package p000;

import android.support.v4.graphics.drawable.C0987;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1030;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import io.fastkv.C1053;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: wn */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InterpolatorC0862wn implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int iM3002 = C1023.m3002("ۣۡ۠");
        double d = 0.0d;
        double d2 = 0.0d;
        double dPow = 0.0d;
        while (true) {
            switch (iM3002) {
                case 1750594:
                    d2 = f;
                    if (C1053.m3123() >= 0) {
                        C0987.f5634 = 57;
                    }
                    iM3002 = C1050.m3111("ۨۢۧ");
                    break;
                case 1753572:
                    if (C1025.f5672 - (C1055.f5702 * (-1881)) > 0) {
                        iM3002 = (C0999.f5646 ^ C1045.f5692) ^ 1750238;
                    } else {
                        C1016.f5663 = 99;
                        iM3002 = C1052.m3118("ۣۣۤ");
                    }
                    break;
                case 1755437:
                    dPow = Math.pow(2.0d, (-10.0d) * d2);
                    if (C1052.f5699 > 0) {
                        iM3002 = (C1030.f5677 | C0998.f5645) ^ 1755349;
                    } else {
                        C1048.f5695 = 56;
                        iM3002 = C1018.m2984("ۣۡ۠");
                    }
                    break;
                case 1755464:
                    d = 0.28f;
                    if ((C1001.f5648 | (C1044.f5691 + 9478)) <= 0) {
                    }
                    iM3002 = C1047.m3096("ۨۤ۟");
                    break;
                case 1755491:
                    return (float) (1.0d - (0.0d - (Math.sin(((((d2 + 18.0d) - (d / 4.0d)) - 18.0d) * 6.283185307179586d) / d) * dPow)));
            }
        }
    }
}
