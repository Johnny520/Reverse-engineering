package p000;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.window.C0988;
import androidx.activity.C0995;
import androidx.activity.result.C0992;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.content.C1006;
import androidx.core.content.C1008;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.textfield.C1041;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1053;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0141d7 extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f1326a;

    /* JADX INFO: renamed from: b */
    public final String f1327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    public C0141d7(Activity activity, String str) {
        String str2;
        super(activity);
        this.f1327b = str;
        int iM2955 = C1011.m2955("ۤۨۢ");
        Paint paint = null;
        Integer numDecode = null;
        while (true) {
            switch (iM2955) {
                case 56452:
                    paint.setAntiAlias(true);
                    if (C1021.f5668 <= 0) {
                        C1013.m2964();
                        iM2955 = C1049.m3104("ۤۨ");
                    } else {
                        iM2955 = (C1006.f5653 - C1059.f5706) + 1752549;
                    }
                    break;
                case 1746696:
                    numDecode = Integer.decode(C0992.m2880("YAZbAY2w4jeQe8p7eIb"));
                    if (C1019.f5666 / (C1056.f5703 * (-6852)) == 0) {
                        iM2955 = (C0998.f5645 % C0994.f5641) + 1749857;
                    } else {
                        C1008.f5655 = 88;
                        iM2955 = C1036.m3057("۠۟ۦ");
                    }
                    break;
                case 1747655:
                    paint.setTextSize((int) TypedValue.applyDimension(1, 14.0f, activity.getResources().getDisplayMetrics()));
                    iM2955 = (C0995.f5642 ^ C1035.f5682) + 56878;
                    break;
                case 1747744:
                    if (C1037.m3060() < 0) {
                        iM2955 = (C1059.f5706 + C1026.f5673) ^ (-1753025);
                    } else if (C1055.f5702 > 0) {
                        str2 = "۟۟ۨ";
                        iM2955 = C0995.m2891(str2);
                    } else {
                        iM2955 = C1034.m3046("۠ۢۢ");
                    }
                    break;
                case 1747930:
                    this.f1326a = paint;
                    if (C1053.m3123() >= 0) {
                        C1019.f5666 = 61;
                        str2 = "ۤۡۤ";
                    } else {
                        str2 = "۠ۢۢ";
                    }
                    iM2955 = C0995.m2891(str2);
                    break;
                case 1748770:
                    iM2955 = (C1059.f5706 + C1026.f5673) ^ (-1753025);
                    break;
                case 1749858:
                    System.out.println(numDecode);
                    if (C1036.f5683 % (C1030.f5677 - 3537) <= 0) {
                        C0997.f5644 = 39;
                    }
                    iM2955 = C1023.m3002("ۥۦۨ");
                    break;
                case 1751559:
                    iM2955 = (C1030.f5677 / C1058.f5705) + 1751776;
                    break;
                case 1751774:
                    Paint paint2 = new Paint();
                    if (C1028.f5675 >= 0) {
                    }
                    iM2955 = C1057.m3139("ۦۨۨ");
                    paint = paint2;
                    break;
                case 1752679:
                    break;
                case 1752704:
                    paint.setTextAlign(Paint.Align.CENTER);
                    if (C1026.f5673 >= 0) {
                    }
                    iM2955 = C1041.m3074("۠ۨۢ");
                    break;
                case 1753702:
                    paint.setColor(Color.parseColor("#1AFFFFFF"));
                    if (C1030.f5677 - (C0988.f5635 + 9738) < 0) {
                        iM2955 = C1036.m3057("۠۟ۦ");
                    } else {
                        C0999.f5646 = 17;
                        iM2955 = C1004.m2927("ۡۤۥ");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022e A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0141d7.onDraw(android.graphics.Canvas):void");
    }
}
