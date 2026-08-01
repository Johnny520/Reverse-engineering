package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.C0002;
import android.app.C0003;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
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
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import io.fastkv.C0068;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class en implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r5, Bundle r6) {
        long r0 = 0;
        int r2 = C0023.m95("ۨ۠ۨ");
    L3:
        switch(r2) {
            case 1746912: goto L5;
            case 1746944: goto L7;
            case 1747716: goto L19;
            case 1751771: goto L11;
            case 1753669: goto L15;
            case 1754570: goto L28;
            case 1755376: goto L24;
            default: goto L3;
        };
    L5:
        r2 = (C0072.f72 % C0030.f30) + 1755439;
    L7:
        if ((C0064.f64 / (C0026.f26 * 9886)) == 0) goto L10;
        C0068.f68 = 53;
        String r22 = "ۤۦۨ";
    L9:
        r2 = C0004.m16(r22);
        goto L3
    L10:
        r22 = "ۧۥۨ";
        goto L9
    L11:
        r0 = Long.parseLong(C0010.m41("Ad5fd62yzZxEps2ic2EpxpkN"));
        if (C0036.f36 > 0) goto L14;
        C0027.f27 = 74;
        r2 = C0022.m90("ۦۧۦ");
        goto L3
    L14:
        r22 = "ۦۧۦ";
        goto L9
    L15:
        System.out.println(r0);
        if (C0051.f51 >= 0) goto L17;
    L17:
        r2 = C0018.m73("ۧۥۨ");
        goto L3
    L19:
        if (C0029.m118() > 0) goto L7;
        if ((C0057.f57 * (C0046.f46 - 3831)) <= 0) goto L22;
        r2 = (C0063.f63 * C0029.f29) ^ (-1769173);
        goto L3
    L22:
        r2 = C0004.m16("۟ۦۧ");
        goto L3
    L24:
        ip.o(u40.a("pl2E\n", "xz7w2PqCZGw=\n"), r5);
        if ((C0027.f27 / (C0043.f43 | (-343))) > 0) goto L27;
        C0022.f22 = 70;
        r2 = C0057.m229("۠ۡۥ");
        goto L3
    L27:
        r22 = "۠ۡۥ";
        goto L9
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r4) {
        Float r0 = null;
        int r1 = C0022.m90("ۨۧۢ");
    L3:
        switch(r1) {
            case 56449: goto L6;
            case 1747656: goto L29;
            case 1747902: goto L25;
            case 1748704: goto L24;
            case 1752676: goto L16;
            case 1755367: goto L21;
            case 1755587: goto L11;
            default: goto L3;
        };
    L6:
        if (C0027.m111() > 0) goto L21;
        if (C0022.f22 >= 0) goto L9;
        r1 = (C0071.f71 * C0043.f43) + 1963460;
        goto L3
    L9:
        r1 = C0047.m189("۠۟ۧ");
        goto L3
    L11:
        ip.o(u40.a("rs+T\n", "z6zn5nClTAQ=\n"), r4);
        if (C0060.f60 > 0) goto L14;
        C0050.f50 = 11;
    L14:
        String r12 = "ۤۥ";
    L15:
        r1 = C0043.m173(r12);
        goto L3
    L16:
        System.out.println(r0);
        if ((C0041.f41 ^ (C0020.f20 | 7868)) >= 0) goto L18;
        r1 = (C0061.f61 / C0069.f69) + 1747669;
        goto L3
    L18:
        C0056.f56 = 87;
        r1 = C0056.m226("ۨۧۢ");
    L21:
        if ((C0050.f50 % (C0013.f13 - 8874)) <= 0) goto L22;
        r1 = (C0016.f16 / C0056.f56) + 1747657;
        goto L3
    L22:
        r1 = C0054.m219("ۣۧۤ");
        goto L3
    L24:
        r1 = (C0027.f27 + C0045.f45) + 1756326;
        goto L3
    L25:
        r0 = Float.decode(C0021.m85("soiXpb"));
        if ((C0069.f69 ^ (C0047.f47 - 7189)) > 0) goto L28;
        C0053.f53 = 1;
        r1 = C0032.m130("ۨ۠۟");
        goto L3
    L28:
        r12 = "ۥۦۥ";
        goto L15
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r4) {
        int r2 = C0003.m13("ۨۤۥ");
        Float r1 = null;
    L3:
        switch(r2) {
            case 1746718: goto L6;
            case 1750724: goto L23;
            case 1750726: goto L15;
            case 1750753: goto L10;
            case 1752675: goto L18;
            case 1755370: goto L17;
            case 1755497: goto L11;
            default: goto L3;
        };
    L6:
        if ((C0072.f72 * (C0021.f21 * (-6732))) < 0) goto L9;
        C0071.m284();
        String r0 = "ۢۡ۠";
    L8:
        r2 = C0069.m277(r0);
        goto L3
    L9:
        r0 = "ۨۤۥ";
    L10:
        r2 = (C0026.f26 | C0073.f73) + 1749910;
        goto L3
    L11:
        ip.o(u40.a("CiWN\n", "a0b55eJghxw=\n"), r4);
        if ((C0013.f13 % (C0032.f32 ^ 3745)) >= 0) goto L13;
    L21:
        r2 = C0022.m90("ۣۥۨ");
        goto L3
    L13:
        C0047.m191();
        r2 = C0055.m220("ۣۥۦ");
        goto L3
    L15:
        if (C0039.m157() < 0) goto L10;
        r2 = (C0061.f61 | C0068.f68) ^ (-1755851);
        goto L3
    L17:
        Float r02 = Float.valueOf(C0047.m188("05FqpLRgsOKS3mcv8VG3U"));
        r2 = 1753515 + (C0065.f65 | C0030.f30);
        r1 = r02;
        goto L3
    L18:
        System.out.println(r1);
        if (C0050.m202() >= 0) goto L20;
        r2 = (C0052.f52 * C0048.f48) + 1592861;
        goto L3
    L20:
        C0054.f54 = 6;
        goto L21
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r7) {
        float r0 = 0.0f;
        int r4 = C0046.m186("ۥۣۤ");
        WeakReference r5 = null;
        String r2 = null;
        gn r3 = null;
    L3:
        switch(r4) {
            case 1746749: goto L5;
            case 1746967: goto L23;
            case 1748709: goto L32;
            case 1748764: goto L51;
            case 1748892: goto L56;
            case 1749610: goto L8;
            case 1752612: goto L16;
            case 1752674: goto L27;
            case 1752706: goto L40;
            case 1753634: goto L43;
            case 1754382: goto L20;
            case 1754472: goto L59;
            case 1754570: goto L34;
            case 1755616: goto L48;
            default: goto L3;
        };
    L5:
        WeakReference r1 = new WeakReference(r7);
        if ((C0065.f65 / (C0042.f42 + 1673)) >= 0) goto L7;
        r4 = (C0030.f30 % C0023.f23) + 1749466;
        r5 = r1;
        goto L3
    L7:
        C0006.m24();
        r4 = C0056.m226("ۥۧۤ");
        r5 = r1;
        goto L3
    L8:
        r3.getClass();
        if ((C0011.f11 / (C0043.f43 - 992)) != 0) goto L10;
        String r12 = r2;
    L14:
        r4 = C0062.m249("ۡۢۦ");
        r2 = r12;
        goto L3
    L10:
        C0070.f70 = 33;
    L11:
        String r13 = "ۥۦۣ";
    L12:
        r4 = C0045.m182(r13);
        goto L3
    L16:
        ip.o(u40.a("6AAA\n", "iWN09Dsl+Cg=\n"), r7);
        if (C0016.m66() > 0) goto L19;
        C0009.m36();
        r4 = C0050.m203("۟ۨ۠");
        goto L3
    L19:
        r13 = "ۡۤ۟";
        goto L12
    L20:
        gn.e = r2;
        if ((C0055.f55 % (C0035.f35 % (-1659))) >= 0) goto L22;
    L50:
        r4 = C0058.m234("ۧۥۨ");
        goto L3
    L22:
        C0056.f56 = 46;
        r4 = C0045.m182("ۣۡۨ");
        goto L3
    L23:
        r12 = r7.getClass().getName();
        if (C0038.m155() <= 0) goto L25;
        r4 = 1753474 + (C0037.f37 ^ C0059.f59);
        r2 = r12;
        goto L3
    L25:
        C0070.m280();
        goto L14
    L27:
        System.out.println(r0);
        if (C0054.f54 <= 0) goto L29;
        String r14 = "ۣۧۢ";
    L31:
        r4 = C0046.m186(r14);
        goto L3
    L29:
        C0062.f62 = 99;
        r4 = C0053.m213("ۨۨ۠");
        goto L3
    L32:
        gn.f = r5;
        r4 = (C0009.f9 ^ C0016.f16) + 1747619;
        goto L3
    L34:
        if (C0005.m20() < 0) goto L40;
        if (C0042.f42 >= 0) goto L37;
        r4 = (C0009.f9 / C0071.f71) ^ 1755617;
        goto L3
    L37:
        C0046.m185();
        r14 = "۟ۡ۟";
    L40:
        if (C0071.f71 >= 0) goto L41;
        r4 = (C0022.f22 * C0006.f6) ^ (-2070262);
        goto L3
    L41:
        C0014.m58();
        r4 = C0024.m98("ۡۢ۠");
        goto L3
    L43:
        u40.a("ANPNWd5DOQ==\n", "PKCoLfN8By8=\n");
        if ((C0048.f48 - (C0040.f40 / 2252)) <= 0) goto L45;
        r4 = (C0050.f50 - C0002.f2) ^ (-1755097);
        goto L3
    L45:
        C0059.f59 = 90;
        String r42 = "ۡۤ۟";
        gn r15 = r3;
    L46:
        r4 = C0008.m35(r42);
        r3 = r15;
        goto L3
    L48:
        r0 = Float.parseFloat(C0046.m187("JBsG"));
        if (C0051.m206() < 0) goto L11;
    L51:
        r15 = gn.a;
        if ((C0055.f55 * (C0018.f18 % 2393)) < 0) goto L54;
        C0060.m240();
        r4 = C0015.m60("ۣۧۢ");
        r3 = r15;
        goto L3
    L54:
        r42 = "۟ۡ۟";
        goto L46
    L56:
        if (C0020.f20 >= 0) goto L57;
        r4 = (C0056.f56 - C0057.f57) + 1752454;
        goto L3
    L57:
        C0018.m75();
        r4 = C0073.m292("ۦۧ۟");
        goto L3
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r3, Bundle r4) {
        int r0 = C0033.m132("ۤۥ۠");
    L3:
        switch(r0) {
            case 1746941: goto L6;
            case 1747804: goto L9;
            case 1750692: goto L13;
            case 1751679: goto L10;
            default: goto L3;
        };
    L6:
        if (C0024.f24 <= 0) goto L7;
        r0 = (C0043.f43 / C0008.f8) + 1751679;
        goto L3
    L7:
        C0007.m31();
        r0 = C0065.m263("ۣۧۡ");
        goto L3
    L9:
        ip.o(u40.a("mcKkFT2mD30=\n", "9rfQRknHexg=\n"), r4);
        r0 = C0048.m193("ۣۤۥ");
        goto L3
    L10:
        ip.o(u40.a("1Pxy\n", "tZ8GfTARZZA=\n"), r3);
        if (C0008.m33() <= 0) goto L12;
    L12:
        r0 = C0018.m73("۠ۤ۠");
        goto L3
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r3) {
        int r0 = C0070.m281("ۢۦ۠");
    L3:
        switch(r0) {
            case 1746723: goto L5;
            case 1749788: goto L6;
            case 1755436: goto L10;
            default: goto L3;
        };
    L5:
        r0 = (C0056.f56 | C0046.f46) ^ (-1749790);
        goto L3
    L6:
        ip.o(u40.a("TLc/\n", "LdRLKVTmox4=\n"), r3);
        if ((C0018.f18 * (C0020.f20 / 4875)) != 0) goto L8;
        r0 = (C0036.f36 + C0058.f58) ^ 1757072;
        goto L3
    L8:
        C0058.f58 = 95;
        r0 = C0037.m149("۟۠ۤ");
        goto L3
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r3) {
        int r0 = C0065.m263("ۥۣۡ");
    L3:
        switch(r0) {
            case 1747871: goto L6;
            case 1752519: goto L9;
            case 1754502: goto L14;
            default: goto L3;
        };
    L6:
        if (C0039.m157() < 0) goto L13;
        C0061.f61 = 38;
        String r02 = "ۣ۟۠";
    L8:
        r0 = C0062.m249(r02);
        goto L3
    L13:
        r02 = "ۥۣۡ";
        goto L8
    L9:
        ip.o(u40.a("mrq2\n", "+9nCnYbx/f0=\n"), r3);
        if ((C0045.f45 + (C0034.f34 / 9714)) >= 0) goto L11;
        r0 = C0051.m207("ۣۧۢ");
        goto L3
    L11:
        C0027.f27 = 60;
        r0 = C0042.m170("ۥۣۡ");
        goto L3
    }
}
