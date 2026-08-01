package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.graphics.Outline;
import android.os.Build;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.xor.C0045;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class rs extends ViewOutlineProvider {
    public final float a;

    public rs(float r5) {
        this.a = r5;
        double r2 = 0.0d;
        int r0 = C0055.m220("ۧۡۢ");
    L3:
        switch(r0) {
            case 1751718: goto L5;
            case 1754440: goto L18;
            case 1754442: goto L15;
            case 1754444: goto L11;
            case 1755400: goto L7;
            case 1755430: goto L16;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0036.f36 > 0) goto L10;
        C0068.f68 = 95;
        String r02 = "ۣۨۡ";
    L9:
        r0 = C0043.m173(r02);
        goto L3
    L10:
        r02 = "ۤۦۨ";
        goto L9
    L11:
        r2 = Double.parseDouble(C0047.m188("dVsuwM"));
        if ((C0033.f33 / (C0071.f71 ^ (-4020))) != 0) goto L13;
        r0 = (C0001.f1 / C0041.f41) + 1755430;
        goto L3
    L13:
        C0057.f57 = 26;
        r0 = C0063.m254("ۧۡۢ");
        goto L3
    L15:
        r0 = (C0000.f0 | C0050.f50) + 1753865;
        goto L3
    L16:
        System.out.println(r2);
        r0 = C0025.m102("ۤۦۨ");
        goto L3
    L18:
        if (C0048.m194() > 0) goto L7;
        r0 = (C0001.f1 + C0042.f42) ^ (-1754804);
        goto L3
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r12, Outline r13) {
        ViewGroup.LayoutParams r6 = null;
        int r0 = C0002.m8("ۣۨۡ");
        int r7 = 0;
        float r10 = 0.0f;
        float r8 = 0.0f;
        float r5 = 0.0f;
    L3:
        switch(r0) {
            case 56293: goto L5;
            case 56358: goto L8;
            case 56513: goto L23;
            case 1746727: goto L85;
            case 1746757: goto L28;
            case 1746908: goto L30;
            case 1746913: goto L40;
            case 1747682: goto L10;
            case 1747905: goto L19;
            case 1748858: goto L34;
            case 1749576: goto L82;
            case 1750662: goto L53;
            case 1750785: goto L30;
            case 1750812: goto L78;
            case 1751590: goto L75;
            case 1751622: goto L57;
            case 1751686: goto L45;
            case 1752521: goto L47;
            case 1752586: goto L15;
            case 1753420: goto L38;
            case 1753693: goto L69;
            case 1754531: goto L62;
            case 1755561: goto L65;
            case 1755617: goto L15;
            default: goto L3;
        };
    L5:
        ip.m("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams", r6);
    L6:
        String r02 = "ۡۧ";
    L7:
        r0 = C0029.m116(r02);
        goto L3
    L8:
        int r2 = ((FrameLayout.LayoutParams) r6).bottomMargin;
        String r03 = "۟ۦۨ";
    L9:
        r0 = C0007.m28(r03);
        r7 = r2;
        goto L3
    L10:
        r6 = r12.getLayoutParams();
        if ((C0058.f58 ^ (C0018.f18 | (-4047))) >= 0) goto L12;
        r0 = (C0025.f25 ^ C0055.f55) + 55967;
        goto L3
    L12:
        r0 = C0054.m219("ۧۤ۠");
        goto L3
    L15:
        if (C0033.f33 <= 0) goto L16;
        r0 = (C0019.f19 | C0068.f68) + 1747558;
        goto L3
    L16:
        C0067.f67 = 75;
        r0 = C0045.m182("ۣۢۨ");
    L19:
        if (C0069.m276() >= 0) goto L20;
        String r04 = "۟۠ۨ";
    L22:
        r0 = C0006.m26(r04);
        goto L3
    L20:
        r03 = "۟۟۠";
        r2 = r7;
        goto L9
    L23:
        float r22 = 100.0f * r10;
        if (C0022.m88() <= 0) goto L25;
        String r05 = "ۣۤۥ";
    L27:
        r0 = C0049.m197(r05);
        r8 = r22;
        goto L3
    L25:
        C0066.m265();
        r0 = C0027.m110("ۥۡۥ");
        r8 = r22;
        goto L3
    L28:
        r0 = (C0014.f14 % C0009.f9) + 1747611;
        goto L3
    L30:
        if (C0040.f40 > 0) goto L32;
        C0056.m224();
        r0 = C0035.m140("ۨۨ۠");
        goto L3
    L32:
        r05 = "ۨۦۧ";
        r22 = r8;
        goto L27
    L34:
        if (C0049.m199() < 0) goto L36;
        C0003.m14();
        r0 = C0047.m189("ۣۧۥ");
        r5 = 0.0f;
        goto L3
    L36:
        r04 = "ۦ۟ۥ";
        r5 = 0.0f;
        goto L22
    L38:
        if ((C0008.f8 * (C0014.f14 + 4960)) >= 0) goto L6;
        r0 = (C0056.f56 % C0039.f39) + 1755891;
        goto L3
    L40:
        float r23 = this.a;
        if ((C0001.f1 % (C0061.f61 + 7674)) >= 0) goto L42;
        String r06 = "ۦۨ۟";
    L44:
        r0 = C0029.m116(r06);
        r10 = r23;
        goto L3
    L42:
        C0048.m194();
        r0 = C0029.m116("۟ۦۨ");
        r10 = r23;
        goto L3
    L45:
        r13.offset(0, (int) (6.0f * r10));
        r0 = (C0063.f63 + C0019.f19) ^ 1746818;
        goto L3
    L47:
        if (Build.VERSION.SDK_INT < 29) goto L19;
        if ((C0035.f35 | (C0053.f53 - 1511)) >= 0) goto L50;
        r0 = (C0012.f12 % C0053.f53) + 1751685;
        goto L3
    L50:
        r0 = C0018.m73("ۦۨ۟");
        goto L3
    L53:
        if ((C0042.f42 | (C0049.f49 - 5479)) >= 0) goto L54;
        r0 = C0038.m153("ۣۨۡ");
        goto L3
    L54:
        r05 = "۟ۧ";
        r22 = r8;
        goto L27
    L57:
        if (C0072.m289() <= 0) goto L58;
        r0 = (C0037.f37 * C0057.f57) + 1478917;
        r5 = r8;
        goto L3
    L58:
        r5 = r8;
    L59:
        r0 = C0047.m189("۠۠ۢ");
    L62:
        if ((C0066.f66 / (C0023.f23 % (-7284))) <= 0) goto L63;
        r0 = C0071.m286("ۤۢۤ");
        goto L3
    L63:
        C0021.m84();
        r04 = "ۧۧۧ";
        goto L22
    L65:
        r13.setRoundRect(0, 0, r12.getWidth(), r12.getHeight(), r5);
        if ((C0006.f6 + (C0013.f13 * 3341)) < 0) goto L68;
        C0018.f18 = 13;
        r0 = C0004.m16("ۣۣۦ");
        goto L3
    L68:
        r03 = "ۥۡۥ";
        r2 = r7;
        goto L9
    L69:
        if (r7 <= 0) goto L62;
        if ((C0068.f68 % (C0063.f63 * 6351)) < 0) goto L73;
        C0005.f5 = 66;
        r0 = C0055.m220("ۤۥۧ");
        goto L3
    L73:
        r04 = "ۦۧ";
        goto L22
    L75:
        if (C0008.f8 < 0) goto L77;
        C0071.f71 = 7;
        r0 = C0035.m140("۟ۦۣ");
        goto L3
    L77:
        r02 = "ۡۧ۠";
        goto L7
    L78:
        ip.o("view", r12);
        if (C0012.f12 > 0) goto L81;
        C0043.f43 = 23;
        r06 = "ۦۧ";
        r23 = r10;
        goto L44
    L81:
        r05 = "ۢ۟ۥ";
        r22 = r8;
        goto L27
    L82:
        ip.o("outline", r13);
        if ((C0032.f32 ^ (C0012.f12 + 9398)) < 0) goto L59;
        r0 = C0049.m197("۟ۤ");
        goto L3
    }
}
