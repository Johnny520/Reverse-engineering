package p000;

import android.app.C0987;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0992;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import androidx.activity.C0996;
import androidx.activity.C0997;
import androidx.activity.result.C0994;
import androidx.activity.result.C0995;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1000;
import androidx.appcompat.widget.C1002;
import androidx.fragment.app.C1013;
import androidx.lifecycle.C1015;
import androidx.recyclerview.widget.C1019;
import androidx.versionedparcelable.C1024;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.google.android.material.behavior.C1036;
import com.google.android.material.theme.C1050;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: nn */
/* JADX INFO: loaded from: classes.dex */
public final class C0528nn extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final String f3432a;

    /* JADX INFO: renamed from: b */
    public final int f3433b;

    /* JADX INFO: renamed from: c */
    public final int f3434c;

    /* JADX INFO: renamed from: d */
    public final boolean f3435d;

    /* JADX INFO: renamed from: e */
    public final TextView f3436e;

    /* JADX INFO: renamed from: f */
    public float f3437f;

    /* JADX INFO: renamed from: g */
    public final float f3438g;

    /* JADX INFO: renamed from: h */
    public final float f3439h;

    /* JADX INFO: renamed from: i */
    public final float f3440i;

    /* JADX INFO: renamed from: j */
    public final Matrix f3441j;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0528nn(java.lang.String r4, int r5, int r6, boolean r7, android.widget.TextView r8) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0528nn.<init>(java.lang.String, int, int, boolean, android.widget.TextView):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0078. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01c0 A[SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r75, java.lang.CharSequence r76, int r77, int r78, float r79, int r80, int r81, int r82, android.graphics.Paint r83) {
        /*
            Method dump skipped, instruction units count: 2644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0528nn.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        String str2;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int iM3034 = C1033.m3034("ۢۦ۠");
        while (true) {
            switch (iM3034) {
                case 56510:
                    paint.setTextSize(0.78f * f2);
                    if (C1057.f5701 * (C1015.f5659 - 630) > 0) {
                        str = "ۢ۠ۢ";
                        iM3034 = C1055.m3122(str);
                    } else {
                        C0995.m2882();
                        iM3034 = C0996.m2889("ۢ۠ۢ");
                    }
                    break;
                case 56543:
                    break;
                case 1746696:
                    this.f3437f = ((((this.f3438g * f3) - 32.0f) + f) + 32.0f) - (0.0f - this.f3440i);
                    if (C1019.f5663 * (C0987.f5631 % (-1193)) < 0) {
                        str = "۟۠ۡ";
                        iM3034 = C1055.m3122(str);
                    } else {
                        str2 = "۟۟ۨ";
                        iM3034 = C0999.m2899(str2);
                    }
                    break;
                case 1746720:
                    paint.setTextSize(f2);
                    str2 = "ۧۦ";
                    iM3034 = C0999.m2899(str2);
                    break;
                case 1749604:
                    float fMeasureText = paint.measureText(this.f3432a);
                    iM3034 = (-1752512) ^ (C1057.f5701 % C1050.f5694);
                    f = fMeasureText;
                    break;
                case 1749788:
                    AbstractC0346ip.m1503o("paint", paint);
                    if (C1058.f5702 % (C1033.f5677 + 3239) < 0) {
                        iM3034 = (C1013.f5657 * C1033.f5677) + 1747311;
                    } else {
                        C1002.f5646 = 66;
                        str = "ۢۦ۠";
                        iM3034 = C1055.m3122(str);
                    }
                    break;
                case 1751741:
                    float textSize = paint.getTextSize();
                    iM3034 = 56713 + (C1036.f5680 | C0997.f5641);
                    f2 = textSize;
                    break;
                case 1752453:
                    f3 = C0995.f5639 ^ (-865);
                    if (C0990.m2864() < 0) {
                        str = "۟۟ۨ";
                        iM3034 = C1055.m3122(str);
                    } else {
                        C1034.f5678 = 20;
                        iM3034 = C1024.m2999("ۧۦ");
                    }
                    break;
                case 1753481:
                    if (C1057.f5701 >= 0) {
                        C0992.f5636 = 79;
                        iM3034 = C0994.m2881("ۨۧ");
                    } else {
                        iM3034 = (C1000.f5644 / C1058.f5702) + 1749787;
                    }
                    break;
            }
            return (int) this.f3437f;
        }
    }
}
