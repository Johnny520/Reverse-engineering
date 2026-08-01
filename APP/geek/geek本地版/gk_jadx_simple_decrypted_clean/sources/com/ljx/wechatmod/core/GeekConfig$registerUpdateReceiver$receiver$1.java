package com.ljx.wechatmod.core;

import android.app.C0000;
import android.app.C0002;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.appcompat.widget.C0014;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.recyclerview.widget.C0032;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import defpackage.C0071;
import defpackage.ac;
import defpackage.dy;
import defpackage.od;
import defpackage.u40;
import defpackage.z30;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class GeekConfig$registerUpdateReceiver$receiver$1 extends BroadcastReceiver {
    public static final int a = 0;

    public GeekConfig$registerUpdateReceiver$receiver$1() {
        double r0 = 0.0d;
        int r2 = C0019.m79("ۣۥ۟");
    L3:
        switch(r2) {
            case 1746752: goto L5;
            case 1748615: goto L19;
            case 1749823: goto L16;
            case 1750717: goto L10;
            case 1752523: goto L6;
            case 1752705: goto L17;
            default: goto L3;
        };
    L5:
        return;
    L6:
        r0 = Double.parseDouble(C0058.m235("Taydzr9kGhJ"));
        if (C0057.m230() >= 0) goto L8;
    L14:
        r2 = C0004.m16("ۢۧۤ");
        goto L3
    L8:
        r2 = C0069.m277("ۣۥ۟");
        goto L3
    L10:
        if (C0040.m162() < 0) goto L19;
        if ((C0069.f69 ^ (C0022.f22 + 2709)) >= 0) goto L13;
        r2 = C0035.m140("ۥۡۧ");
        goto L3
    L13:
        C0043.m172();
        goto L14
    L16:
        System.out.println(r0);
        r2 = C0032.m130("۟ۡۢ");
        goto L3
    L17:
        r2 = C0044.m176("ۣۥ۟");
    L19:
        if (C0066.f66 <= 0) goto L20;
        r2 = (C0008.f8 % C0017.f17) ^ (-1746920);
        goto L3
    L20:
        C0060.f60 = 93;
        r2 = C0069.m277("ۣۢ۠");
        goto L3
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r7, Intent r8) {
        Float r1 = null;
        int r0 = C0011.m45("۠ۤ");
    L3:
        switch(r0) {
            case 56293: goto L6;
            case 56324: goto L71;
            case 56351: goto L33;
            case 1746749: goto L17;
            case 1746756: goto L38;
            case 1746850: goto L75;
            case 1746944: goto L54;
            case 1747773: goto L31;
            case 1748733: goto L26;
            case 1751560: goto L70;
            case 1753485: goto L78;
            case 1754377: goto L79;
            case 1754383: goto L57;
            case 1754626: goto L57;
            case 1755337: goto L42;
            case 1755400: goto L21;
            case 1755460: goto L59;
            case 1755623: goto L48;
            default: goto L3;
        };
    L6:
        if (C0051.m206() < 0) goto L75;
        if ((C0005.f5 % (C0044.f44 - 511)) <= 0) goto L9;
        String r02 = "ۤۡۥ";
    L19:
        r0 = C0064.m258(r02);
        goto L3
    L9:
        C0066.m265();
        r0 = C0005.m23("ۧۧۢ");
        goto L3
    L79:
        dy.f = -1.0f;     // Catch: Throwable -> L65
        if ((C0011.f11 % (C0028.f28 * 3581)) >= 0) goto L14;
        r0 = (C0011.f11 / C0050.f50) ^ (-1748729);
        goto L3
    L14:
        C0022.m88();
        r0 = C0027.m110("۟ۡۦ");
    L66:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "GeekConfig_PrivacyHook", "Fg==\n", "c8HJlSTQVfc=\n");
        if (C0045.m181() <= 0) goto L68;
        String r03 = "ۧ۟ۧ";
    L63:
        r0 = C0052.m209(r03);
        goto L3
    L68:
        r0 = C0055.m220("ۤۡۥ");
        goto L3
    L17:
        if ((C0056.f56 * (C0056.f56 / 1516)) != 0) goto L18;
        r0 = C0036.m144("ۧۧۢ");
        goto L3
    L18:
        r02 = "ۧ۟ۧ";
        goto L19
    L21:
        System.out.println(r1);
        if ((C0041.f41 * (C0055.f55 + 6512)) > 0) goto L25;
        String r04 = "۠ۤ";
    L24:
        r0 = C0032.m130(r04);
        goto L3
    L25:
        r04 = "ۦۡۨ";
        goto L24
    L26:
        dy.a.clear();     // Catch: Throwable -> L65
        if ((C0057.f57 ^ (C0046.f46 / 2864)) >= 0) goto L29;
        r0 = (C0048.f48 / C0019.f19) ^ 56348;
    L29:
        r0 = C0034.m138("ۣ۠۠");
        goto L3
    L31:
        dy.c.clear();     // Catch: Throwable -> L65
        r0 = (C0043.f43 ^ C0066.f66) + 1746035;
        goto L3
    L33:
        dy.b.clear();     // Catch: Throwable -> L65
        if (C0014.m58() > 0) goto L29;
        r0 = C0007.m28("۟ۡ۟");
        goto L3
    L38:
        if (C0027.m111() <= 0) goto L39;
        r0 = C0065.m263("۠ۤ");
        goto L3
    L39:
        C0071.m284();
        r0 = C0060.m241("ۦ۟۠");
        goto L3
    L42:
        new Handler(Looper.getMainLooper()).post(new od(C0030.f30 ^ 146));
        if ((C0019.f19 ^ (C0064.f64 ^ (-3181))) >= 0) goto L44;
        r0 = (C0000.f0 % C0034.f34) + 55755;
        goto L3
    L44:
        C0023.m92();
    L45:
        r0 = C0054.m219("ۣۨ۟");
        goto L3
    L48:
        if ((C0025.f25 / (C0063.f63 * (-9728))) != 0) goto L49;
        String r05 = "۟ۡ۟";
    L52:
        r0 = C0047.m189(r05);
        goto L3
    L49:
        String r06 = "ۡۡۨ";
    L50:
        r0 = C0005.m23(r06);
        goto L3
    L54:
        if ((C0060.f60 - (C0038.f38 / 1292)) <= 0) goto L55;
        r0 = C0030.m120("ۣۨ۟");
        goto L3
    L55:
        C0061.m244();
        r05 = "ۡ۠ۧ";
        goto L52
    L57:
        r0 = (C0035.f35 | C0049.f49) + 1754698;
        goto L3
    L59:
        dy.d = -1;     // Catch: Throwable -> L65
        if ((C0067.f67 + (C0065.f65 % 5801)) >= 0) goto L62;
        r0 = (C0005.f5 | C0069.f69) ^ (-1754378);
        goto L3
    L62:
        r03 = "ۨۨۧ";
        goto L63
    L70:
        r1 = Float.valueOf(C0048.m195("dXHJcDbU3DvcNhkPE"));
        r0 = (C0052.f52 / C0038.f38) + 1755401;
        goto L3
    L71:
        ac.a();
        if ((C0011.f11 | (C0028.f28 - 6438)) < 0) goto L45;
        C0055.f55 = 58;
        r0 = C0007.m28("ۦۡۨ");
    L75:
        if ((C0002.f2 * (C0059.f59 ^ 7660)) >= 0) goto L76;
        r06 = "ۦۡۨ";
        goto L50
    L76:
        C0010.m40();
        r0 = C0055.m220("ۣۢ۟");
        goto L3
    }
}
