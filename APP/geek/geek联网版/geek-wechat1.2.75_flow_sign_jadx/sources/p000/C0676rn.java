package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import android.window.C0988;
import android.window.C0990;
import androidx.activity.result.C0993;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1013;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1028;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.snackbar.C1040;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import io.fastkv.C1052;

/* JADX INFO: renamed from: rn */
/* JADX INFO: loaded from: classes.dex */
public final class C0676rn extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final String f4156a;

    /* JADX INFO: renamed from: b */
    public final int f4157b;

    /* JADX INFO: renamed from: c */
    public final int f4158c;

    /* JADX INFO: renamed from: d */
    public final boolean f4159d;

    /* JADX INFO: renamed from: e */
    public final TextView f4160e;

    /* JADX INFO: renamed from: f */
    public float f4161f;

    /* JADX INFO: renamed from: g */
    public final float f4162g;

    /* JADX INFO: renamed from: h */
    public final float f4163h;

    /* JADX INFO: renamed from: i */
    public final float f4164i;

    /* JADX INFO: renamed from: j */
    public final Matrix f4165j;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0676rn(java.lang.String r4, int r5, int r6, boolean r7, android.widget.TextView r8) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0676rn.<init>(java.lang.String, int, int, boolean, android.widget.TextView):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0076. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x080e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x080a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f4 A[SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r77, java.lang.CharSequence r78, int r79, int r80, float r81, int r82, int r83, int r84, android.graphics.Paint r85) {
        /*
            Method dump skipped, instruction units count: 2584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0676rn.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int iM2938 = C1007.m2938("۠ۨۧ");
        while (true) {
            switch (iM2938) {
                case 56384:
                    return (int) this.f4161f;
                case 1746784:
                    iM2938 = (C1037.f5684 % C0993.f5640) ^ 1747364;
                    continue;
                case 1747713:
                    float f4 = C1034.f5681 ^ (-796);
                    if (C1059.m3144() >= 0) {
                    }
                    iM2938 = C1022.m3001("ۡۥۨ");
                    f3 = f4;
                    continue;
                case 1747935:
                    AbstractC0493mp.m1857g(b50.m492a("Iyj4fgA=\n", "U0mREHSEaDA=\n"), paint);
                    str = "ۥۤۧ";
                    break;
                case 1748804:
                    this.f4161f = ((this.f4162g * f3) - (0.0f - f)) - (0.0f - this.f4164i);
                    if (C1013.m2964() > 0) {
                        iM2938 = (C1028.f5675 | C0997.f5644) ^ (-1748969);
                    } else {
                        C1047.f5694 = 77;
                        str = "ۣ۟ۢ";
                    }
                    break;
                case 1748828:
                    paint.setTextSize(f2);
                    iM2938 = C1052.m3118("ۢۢ");
                    continue;
                case 1749760:
                    float fMeasureText = paint.measureText(this.f4156a);
                    if (C1040.f5687 / (C0999.f5646 | (-4580)) <= 0) {
                        C0990.m2872();
                        iM2938 = C0988.m2863("ۢۢ");
                        f = fMeasureText;
                    } else {
                        iM2938 = (-1747714) ^ (C1010.f5657 / C1027.f5674);
                        f = fMeasureText;
                        continue;
                    }
                    break;
                case 1752616:
                    float textSize = paint.getTextSize();
                    iM2938 = (-1753451) ^ (C0993.f5640 | C1048.f5695);
                    f2 = textSize;
                    continue;
                case 1753450:
                    paint.setTextSize(0.78f * f2);
                    if ((C1018.f5665 ^ (C1023.f5670 / 7301)) <= 0) {
                        iM2938 = C1048.m3101("ۦ۠ۤ");
                    } else {
                        iM2938 = C1001.m2914("ۢۥۣ");
                        continue;
                    }
                    break;
            }
            iM2938 = C1015.m2970(str);
        }
    }
}
