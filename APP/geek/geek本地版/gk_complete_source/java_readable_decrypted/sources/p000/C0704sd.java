package p000;

import android.app.C0986;
import android.app.C0989;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0991;
import android.support.v4.graphics.drawable.C0992;
import android.view.C0993;
import androidx.activity.C0996;
import androidx.activity.C0997;
import androidx.activity.result.C0995;
import androidx.appcompat.app.C0998;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1005;
import androidx.coordinatorlayout.widget.C1007;
import androidx.core.widget.C1011;
import androidx.emoji2.text.C1012;
import androidx.lifecycle.C1015;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.savedstate.C1021;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1025;
import androidx.versionedparcelable.C1028;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.github.megatronking.stringfog.xor.C1031;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1038;
import com.google.android.material.carousel.C1040;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.chip.C1043;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.theme.C1050;
import com.ljx.wechatmod.auth.C1051;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;
import io.fastkv.C1054;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: sd */
/* JADX INFO: loaded from: classes.dex */
public final class C0704sd extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f4426a;

    /* JADX INFO: renamed from: b */
    public final Paint f4427b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f4428c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0122 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0704sd(android.graphics.Bitmap r14, android.content.Context r15) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0704sd.<init>(android.graphics.Bitmap, android.content.Context):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String str;
        String str2;
        float width;
        Rect bounds;
        String str3;
        float fWidth;
        String str4;
        Matrix matrix = null;
        Rect rect = null;
        Bitmap bitmap = null;
        Paint paint = null;
        int iM2951 = C1012.m2951("ۣۨ۟");
        float fHeight = 0.0f;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch (iM2951) {
                case 56357:
                    break;
                case 56539:
                    matrix = new Matrix();
                    if (C1032.f5676 + (C1043.f5687 | (-9150)) < 0) {
                        iM2951 = (C0993.f5637 / C0990.f5634) + 1753422;
                    } else {
                        C0989.m2860();
                        str = "ۣۨ۟";
                        iM2951 = C1011.m2948(str);
                    }
                    break;
                case 1746720:
                    fHeight = rect.height() / bitmap.getHeight();
                    if (C1012.m2952() > 0) {
                        bounds = rect;
                        str4 = "ۧۢ";
                        rect = bounds;
                        iM2951 = C1052.m3109(str4);
                    } else {
                        C1003.f5647 = 43;
                        iM2951 = C1034.m3038("ۧۦۢ");
                    }
                    break;
                case 1746786:
                    canvas.drawRoundRect(new RectF(rect), f3, f3, paint);
                    str2 = "ۥ۠ۥ";
                    width = f;
                    iM2951 = C1012.m2951(str2);
                    f = width;
                    break;
                case 1747679:
                    bitmap = this.f4428c;
                    if (C1054.f5698 * (C1035.f5679 + 681) < 0) {
                        str4 = "ۧۥۤ";
                        bounds = rect;
                        rect = bounds;
                        iM2951 = C1052.m3109(str4);
                    } else {
                        C0998.m2897();
                        iM2951 = C1050.m3103("ۡۦ");
                    }
                    break;
                case 1748766:
                    AbstractC0346ip.m1502n("getBounds(...)", rect);
                    str2 = "ۨ۟ۢ";
                    width = f;
                    iM2951 = C1012.m2951(str2);
                    f = width;
                    break;
                case 1748768:
                    if (C1031.m3026() > 0) {
                        iM2951 = (C1000.f5644 | C1040.f5684) + 1755487;
                    } else {
                        C1011.m2949();
                        str2 = "ۤۢۥ";
                        width = f;
                        iM2951 = C1012.m2951(str2);
                        f = width;
                    }
                    break;
                case 1748771:
                    fWidth = 0.2f * rect.width();
                    str3 = "۟ۢۥ";
                    iM2951 = C1023.m2995(str3);
                    f3 = fWidth;
                    break;
                case 1751771:
                    bounds = getBounds();
                    if (C1033.m3036() < 0) {
                        rect = bounds;
                        iM2951 = C0997.m2891("ۡۤۡ");
                    } else {
                        C1038.m3055();
                        str4 = "ۧۢ";
                        rect = bounds;
                        iM2951 = C1052.m3109(str4);
                    }
                    break;
                case 1752490:
                    canvas.drawRoundRect(new RectF(rect), f3, f3, this.f4427b);
                    if (C1040.m3062() >= 0) {
                        C1025.m3003();
                        iM2951 = C0995.m2884("ۤۨ۟");
                    } else {
                        iM2951 = (C1052.f5696 % C1024.f5668) ^ 56471;
                    }
                    break;
                case 1753422:
                    matrix.setScale(f, fHeight);
                    if (C0996.f5640 + (C0999.f5643 * 4247) < 0) {
                        str = "ۧۦۢ";
                        iM2951 = C1011.m2948(str);
                    } else {
                        C0991.f5635 = 4;
                        str3 = "ۨ۟ۢ";
                        fWidth = f3;
                        iM2951 = C1023.m2995(str3);
                        f3 = fWidth;
                    }
                    break;
                case 1754566:
                    width = f2 / bitmap.getWidth();
                    str2 = "۟۠ۡ";
                    iM2951 = C1012.m2951(str2);
                    f = width;
                    break;
                case 1754595:
                    Paint paint2 = this.f4426a;
                    if (C1055.m3121() >= 0) {
                        C1030.f5674 = 99;
                        paint = paint2;
                        iM2951 = C1021.m2986("ۣۡۤ");
                    } else {
                        paint = paint2;
                        iM2951 = (C1046.f5690 / C1057.f5701) + 1755560;
                    }
                    break;
                case 1755339:
                    float fWidth2 = rect.width();
                    iM2951 = (C1021.f5665 | C1040.f5684) + 1746914;
                    f2 = fWidth2;
                    break;
                case 1755460:
                    AbstractC0346ip.m1503o("canvas", canvas);
                    if ((C1041.f5685 ^ (C0992.f5636 / 2321)) >= 0) {
                        C1043.f5687 = 19;
                        iM2951 = C1053.m3116("ۧۥۤ");
                    } else {
                        iM2951 = C1005.f5649 + C1042.f5686 + 1751952;
                    }
                    break;
                case 1755559:
                    paint.getShader().setLocalMatrix(matrix);
                    iM2951 = (C0986.f5630 | C0989.f5633) ^ 1748092;
                    break;
            }
            return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return C0992.f5636 ^ (-437);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        String str;
        int iM2932 = C1007.m2932("ۢۨۡ");
        while (true) {
            switch (iM2932) {
                case 1749851:
                    this.f4426a.setAlpha(i);
                    iM2932 = C0996.m2889("ۧۢۤ");
                    break;
                case 1754446:
                    if (C0995.m2882() >= 0) {
                        C1051.f5695 = 13;
                        str = "ۥۢ۠";
                    } else {
                        str = "ۢۨۡ";
                    }
                    iM2932 = C1019.m2978(str);
                    break;
                case 1754473:
                    return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        String str;
        int iM3016 = C1028.m3016("ۢۧۦ");
        while (true) {
            switch (iM3016) {
                case 1748612:
                    if (C1020.m2983() <= 0) {
                        C1029.f5673 = 36;
                        str = "ۡ۠ۥ";
                    } else {
                        str = "ۢۧۦ";
                    }
                    iM3016 = C1043.m3074(str);
                    break;
                case 1749825:
                    this.f4426a.setColorFilter(colorFilter);
                    if (C1015.f5659 - (C1052.f5696 * 9397) >= 0) {
                    }
                    iM3016 = C1005.m2925("ۣۧۡ");
                    break;
                case 1750781:
                    return;
            }
        }
    }
}
