package defpackage;

import android.app.C0002;
import android.content.Context;
import android.view.C0007;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0021;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends FrameLayout {
    public final int a;

    public z9(Context r5, int r6) {
        this.a = r6;
        super(r5);
        double r0 = 0.0d;
        int r2 = C0030.m120("ۦ۠۟");
    L3:
        switch(r2) {
            case 1746939: goto L5;
            case 1746967: goto L19;
            case 1748764: goto L24;
            case 1749852: goto L27;
            case 1753445: goto L11;
            case 1754411: goto L15;
            default: goto L3;
        };
    L5:
        r0 = Double.parseDouble(C0059.m237("fZlGY8iQhu0CGt9FnXlz3R"));
        if ((C0041.f41 / (C0015.f15 % 5018)) == 0) goto L17;
        C0042.m169();
    L8:
        String r22 = "ۣ۟ۧ";
    L9:
        r2 = C0021.m86(r22);
        goto L3
    L17:
        r22 = "ۧ۠ۤ";
        goto L9
    L11:
        if (C0053.m214() > 0) goto L24;
        if (C0009.m36() < 0) goto L8;
        r2 = C0029.m116("ۡۤ۟");
        goto L3
    L15:
        System.out.println(r0);
        String r23 = "ۢۨۢ";
    L16:
        r2 = C0057.m229(r23);
        goto L3
    L19:
        if ((C0033.f33 * (C0031.f31 - 7589)) < 0) goto L22;
        C0033.f33 = 50;
        String r24 = "ۥ۠";
    L21:
        r2 = C0031.m127(r24);
        goto L3
    L22:
        r24 = "ۦ۠۟";
    L24:
        if (C0057.m230() >= 0) goto L25;
        r2 = (C0035.f35 % C0063.f63) + 1749795;
        goto L3
    L25:
        C0041.f41 = 94;
        r23 = "ۣۨۨ";
        goto L16
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        int r6 = C0014.m57("ۥۤۦ");
        int r2 = 0;
        int r5 = 0;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
    L3:
        switch(r6) {
            case 56537: goto L6;
            case 1748610: goto L14;
            case 1748835: goto L28;
            case 1748896: goto L10;
            case 1749603: goto L45;
            case 1752550: goto L26;
            case 1752554: goto L21;
            case 1752615: goto L42;
            case 1754562: goto L32;
            case 1755404: goto L17;
            case 1755461: goto L37;
            default: goto L3;
        };
    L6:
        if ((C0067.f67 * (C0011.f11 + 9952)) < 0) goto L15;
        C0002.m10();
        String r0 = "ۧ۟ۥ";
    L8:
        r6 = C0038.m153(r0);
        goto L3
    L15:
        r0 = "ۣۨ۠";
        goto L8
    L10:
        if ((C0036.f36 + (C0047.f47 | 2254)) <= 0) goto L11;
        r6 = C0061.m246("ۣۨ۠");
        r3 = r1;
        goto L3
    L11:
        C0068.f68 = 31;
        String r02 = "ۧ۠";
        r3 = r1;
    L12:
        r6 = C0068.m272(r02);
        goto L3
    L14:
        int r03 = View.MeasureSpec.getSize(r4);
        r6 = C0054.m219("ۥۣۢ");
        r5 = r03;
        goto L3
    L17:
        if ((C0042.f42 * (C0066.f66 + 1849)) < 0) goto L20;
        C0054.m217();
        String r04 = "۠۟۟";
    L19:
        r6 = C0017.m70(r04);
        goto L3
    L20:
        r04 = "ۥۤۦ";
        goto L19
    L21:
        r1 = View.MeasureSpec.makeMeasureSpec(r2, 2147483374 ^ C0056.f56);
        if ((C0019.f19 + (C0048.f48 | 8122)) > 0) goto L25;
        C0071.f71 = 19;
        int r05 = r2;
    L24:
        r6 = C0036.m144("ۡۦۨ");
        r2 = r05;
        goto L3
    L25:
        r04 = "ۡۨۧ";
        goto L19
    L26:
        r05 = this.a;
        goto L24
    L28:
        if (C0023.f23 <= 0) goto L29;
        String r06 = "ۧۥ۠";
        r3 = r4;
    L31:
        r6 = C0015.m60(r06);
        goto L3
    L29:
        C0011.m44();
        r6 = C0010.m43("ۧۥ۠");
        r3 = r4;
        goto L3
    L32:
        if (r5 <= r2) goto L6;
        if ((C0036.f36 % (C0029.f29 % (-6062))) <= 0) goto L35;
        r6 = (C0007.f7 ^ C0021.f21) ^ (-1752487);
        goto L3
    L35:
        C0035.m143();
        r06 = "ۡ۟۠";
        goto L31
    L37:
        super.onMeasure(r8, r3);
        if (C0029.m118() <= 0) goto L39;
        r6 = (C0014.f14 * C0025.f25) ^ 1211246;
        goto L3
    L39:
        r6 = C0021.m86("ۣۨ۠");
        goto L3
    L42:
        if ((C0008.f8 / (C0009.f9 + 7242)) == 0) goto L44;
        C0059.f59 = 81;
        r6 = C0015.m60("ۥۢۧ");
        r4 = r9;
        goto L3
    L44:
        r02 = "ۡ۟۠";
        r4 = r9;
        goto L12
    }
}
