package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.savedstate.C0034;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class m80 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor r4, int r5) {
        Float r1 = null;
        int r2 = C0028.m114("ۢۥۣ");
    L3:
        switch(r2) {
            case 56412: goto L5;
            case 1748646: goto L26;
            case 1749668: goto L25;
            case 1749760: goto L16;
            case 1751621: goto L21;
            case 1754623: goto L11;
            default: goto L3;
        };
    L5:
        Float r0 = Float.decode(C0041.m165("7DB1yrdVtWs48GQ"));
        if (C0051.f51 < 0) goto L8;
        C0041.m167();
    L8:
        String r22 = "ۣۤۤ";
    L9:
        r2 = C0046.m186(r22);
        r1 = r0;
    L11:
        if ((C0046.f46 ^ (C0030.f30 / 2708)) <= 0) goto L12;
        r2 = (C0030.f30 - C0020.f20) + 1748248;
        goto L3
    L12:
        C0021.m84();
        String r02 = "ۨ۠۠";
    L13:
        r2 = C0021.m86(r02);
        goto L3
    L16:
        if (C0015.m61() > 0) goto L11;
        if ((C0057.f57 + (C0063.f63 | (-5715))) < 0) goto L20;
        C0010.f10 = 2;
        r2 = C0036.m144("ۧۧ۟");
        goto L3
    L20:
        r02 = "ۣ۟";
        goto L13
    L21:
        System.out.println(r1);
        if (C0037.m150() > 0) goto L24;
        r2 = C0023.m95("ۢۥۣ");
        goto L3
    L24:
        r22 = "ۡ۠ۥ";
        r0 = r1;
        goto L9
    L25:
        r2 = (C0017.f17 + C0050.f50) + 1748992;
        goto L3
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent r23) {
        float r20 = 0.0f;
        int r19 = 0;
        int r16 = 0;
        String r13 = null;
        int r15 = 0;
        int r14 = 0;
        int r17 = 0;
        int r9 = 0;
        int r3 = 0;
        int r8 = 0;
        int r2 = 0;
        int r11 = 0;
        int r10 = 0;
        int r4 = 0;
        int r12 = 0;
        int r5 = 0;
        Integer r18 = null;
        int r21 = C0052.m209("ۤۢ");
    L3:
        switch(r21) {
            case 56446: goto L5;
            case 56543: goto L33;
            case 1746719: goto L121;
            case 1746785: goto L14;
            case 1746812: goto L48;
            case 1746843: goto L14;
            case 1746970: goto L137;
            case 1747745: goto L85;
            case 1747899: goto L90;
            case 1747927: goto L134;
            case 1748679: goto L28;
            case 1748767: goto L117;
            case 1748769: goto L52;
            case 1748832: goto L31;
            case 1749609: goto L141;
            case 1749665: goto L11;
            case 1749669: goto L28;
            case 1749703: goto L45;
            case 1749726: goto L103;
            case 1750659: goto L54;
            case 1750694: goto L75;
            case 1750757: goto L36;
            case 1750784: goto L19;
            case 1751492: goto L98;
            case 1751710: goto L113;
            case 1751717: goto L61;
            case 1751778: goto L94;
            case 1752646: goto L28;
            case 1752673: goto L83;
            case 1753480: goto L14;
            case 1753669: goto L41;
            case 1754472: goto L67;
            case 1754508: goto L25;
            case 1754626: goto L108;
            case 1755336: goto L72;
            case 1755556: goto L129;
            case 1755616: goto L79;
            case 1755620: goto L123;
            default: goto L3;
        };
    L5:
        ip.o(u40.a("cy+2bhM=\n", "FlnTAGf+rVU=\n"), r23);
        if (r23.sensor.getType() != 1) goto L11;
        if ((C0031.f31 + (C0051.f51 + 184)) >= 0) goto L9;
        r21 = (C0042.f42 / C0038.f38) + 1746968;
        goto L3
    L9:
        C0039.m157();
        String r6 = "ۥۥۦ";
        String r1 = r13;
        int r7 = r14;
    L10:
        r13 = r1;
        r14 = r7;
        r21 = C0015.m60(r6);
    L11:
        String r110 = "ۨۨۤ";
    L12:
        r21 = C0048.m193(r110);
        goto L3
    L14:
        if (C0053.m214() > 0) goto L17;
        C0049.m199();
        String r111 = "ۥۢۤ";
    L16:
        r21 = C0018.m73(r111);
        goto L3
    L17:
        r111 = "ۣۢۨ";
        goto L16
    L19:
        if (r20 >= (-1.5f)) goto L67;
        r9 = ((r16 + 9) - 1) - 9;
        if ((C0011.f11 + (C0073.f73 * (-7462))) >= 0) goto L22;
        String r112 = "ۢۤ۠";
        int r62 = r12;
    L24:
        r12 = r62;
        r21 = C0043.m173(r112);
        goto L3
    L22:
        C0073.m295();
        r21 = C0009.m38("ۤۨۦ");
        goto L3
    L25:
        r3 = ((r14 + 21) - 1) - 21;
        String r113 = "ۡۤۤ";
    L26:
        r21 = C0028.m114(r113);
        goto L3
    L28:
        if (C0000.f0 <= 0) goto L29;
        r21 = C0014.m57("ۨۨ۠");
        goto L3
    L29:
        r113 = "ۣۣۨ";
        goto L26
    L31:
        int r132 = gt.j(u40.a("d0KH4JouNIRDVZfYljM=\n", "HCf+v/5HV+E=\n"), C0018.f18 ^ 203);
        r1 = u40.a("Bl4t6J5VyT8yXTjWjg==\n", "bTtUt/o8qlo=\n");
        r6 = "ۣۤۧ";
        r7 = r14;
        r16 = r132;
    L33:
        if (C0007.m31() >= 0) goto L34;
        r21 = (C0013.f13 | C0006.f6) + 1753735;
        goto L3
    L34:
        r110 = "ۡۥۢ";
        goto L12
    L36:
        if (r17 <= 0) goto L48;
        if (C0029.m118() <= 0) goto L39;
        r21 = C0002.m8("ۤۦ۠");
        r5 = r2;
        goto L3
    L39:
        C0063.f63 = 89;
        r21 = C0016.m65("۟۠۠");
        r5 = r2;
        goto L3
    L41:
        r62 = ((r10 + 27) - 1) - 27;
        if (C0068.m273() < 0) goto L44;
        C0068.m273();
        r12 = r62;
        r21 = C0054.m219("ۢۤ۠");
        goto L3
    L44:
        r112 = "ۨۦۢ";
        goto L24
    L45:
        a80.u = r5;
    L46:
        r21 = C0000.m2("ۨۨۤ");
    L48:
        if ((C0030.f30 - (C0017.f17 * (-2112))) <= 0) goto L49;
        r21 = (C0064.f64 | C0028.f28) + 1751222;
        goto L3
    L49:
        C0029.m118();
        String r63 = "۠ۢۥ";
        Integer r114 = r18;
    L50:
        r18 = r114;
        r21 = C0016.m65(r63);
        goto L3
    L52:
        r21 = (C0002.f2 - C0042.f42) ^ 1757091;
        r8 = r3;
        goto L3
    L54:
        if (r20 >= (-1.5f)) goto L33;
        int r115 = ((r11 - 3) - 1) + 3;
        if ((C0062.f62 | (C0030.f30 + 5458)) >= 0) goto L57;
        r4 = r115;
        r21 = C0012.m50("ۤۨۦ");
        goto L3
    L57:
        C0007.m31();
    L58:
        Object r64 = "۠ۧۢ";
        int r72 = r115;
    L59:
        r4 = r72;
        r21 = C0002.m8(r64);
        goto L3
    L61:
        int r116 = (r20 > 1.5f ? 1 : (r20 == 1.5f ? 0 : -1));
        if (r116 > 0) goto L64;
        r17 = r116;
        goto L134
    L64:
        if (C0015.m61() <= 0) goto L65;
    L105:
        r17 = r116;
        r21 = C0034.m138("ۥۦۢ");
        goto L3
    L65:
        C0006.f6 = 3;
        r17 = r116;
        r21 = C0014.m57("ۤۦۧ");
    L67:
        if (C0000.f0 > 0) goto L70;
        C0005.f5 = 59;
        String r117 = "۠ۨ۠";
        int r65 = r10;
        int r73 = r11;
    L69:
        r10 = r65;
        r11 = r73;
        r21 = C0046.m186(r117);
        goto L3
    L70:
        r117 = "ۣۧۨ";
        r65 = r10;
        r73 = r11;
        goto L69
    L72:
        if (C0001.m4() <= 0) goto L73;
        r21 = C0034.m138("ۡۡۧ");
        goto L3
    L73:
        C0028.f28 = 97;
        r21 = C0049.m197("۟ۤ۠");
        goto L3
    L75:
        r15 = C0048.f48 ^ 300;
        r7 = gt.j(r13, r15);
        if ((C0015.f15 * (C0069.f69 + 5873)) < 0) goto L78;
        r14 = r7;
        r21 = C0015.m60("۟ۢۤ");
        goto L3
    L78:
        r6 = "ۤۦۧ";
        r1 = r13;
        goto L10
    L79:
        a80.t = r8;
        r2 = ((gt.j(u40.a("mTrfEBAugLKeOsA7\n", "8l+mT2Je8+0=\n"), 1) + 0) - 1) + 0;
        if (C0064.m257() < 0) goto L82;
        C0029.m118();
        r21 = C0072.m288("ۡۦۥ");
        goto L3
    L82:
        r113 = "ۣ۠ۢ";
        goto L26
    L83:
        int r118 = r19;
        r8 = r19;
        float r66 = r20;
    L84:
        r19 = r118;
        r21 = C0021.m86("ۨ۟۟");
        r20 = r66;
        goto L3
    L85:
        r73 = gt.j(u40.a("JwzhoQ7V/wU+AP+WCA==\n", "TGmY/nyljFo=\n"), r15);
        r65 = gt.j(u40.a("H6PUsyI0rbkSqsyY\n", "dMat7FBE3uY=\n"), C0014.f14 ^ (-701));
        if ((C0012.f12 ^ (C0069.f69 * (-6918))) > 0) goto L88;
        r10 = r65;
        r11 = r73;
        goto L46
    L88:
        r117 = "ۣۦۨ";
        goto L69
    L90:
        if (C0038.m155() <= 0) goto L91;
        r21 = (C0045.f45 | C0010.f10) ^ (-1746758);
        goto L3
    L91:
        r21 = C0046.m186("ۤۢ");
        goto L3
    L94:
        if ((C0013.f13 | (C0009.f9 / 1292)) < 0) goto L96;
        C0043.f43 = 50;
        r21 = C0021.m86("ۣۤۧ");
        r5 = r4;
        goto L3
    L96:
        r115 = r4;
        r5 = r4;
        goto L58
    L98:
        if (C0025.f25 < 0) goto L100;
        C0066.f66 = 40;
        r112 = "ۧۦ";
        r62 = r12;
        goto L24
    L100:
        r111 = "ۢۢۥ";
        goto L16
    L103:
        if (C0017.f17 > 0) goto L106;
        r116 = r17;
        r8 = r9;
        goto L105
    L106:
        r64 = "ۤ۟۟";
        r72 = r4;
        r8 = r9;
        goto L59
    L108:
        if (C0070.f70 > 0) goto L111;
        C0066.f66 = 9;
        String r119 = "ۣۢ";
    L110:
        r21 = C0073.m292(r119);
        goto L3
    L111:
        r119 = "ۤۢ";
        goto L110
    L113:
        if (C0013.f13 < 0) goto L116;
        C0055.f55 = 66;
        String r120 = "ۦۣۡ";
    L115:
        r21 = C0004.m16(r120);
        goto L3
    L116:
        r111 = "۟ۤ۠";
        goto L16
    L117:
        System.out.println(r18);
        if (C0006.f6 > 0) goto L120;
        r21 = C0020.m80("ۣۢۨ");
        goto L3
    L120:
        r120 = "ۢ۠ۧ";
    L121:
        r21 = (C0067.f67 ^ C0045.f45) ^ 1749977;
        goto L3
    L123:
        if (C0058.m232() > 0) goto L121;
        r114 = Integer.valueOf(C0071.m287("9pR7aDG4e"));
        if (C0041.m167() > 0) goto L127;
        C0014.f14 = 96;
        r18 = r114;
        r21 = C0053.m213("ۨۦۢ");
        goto L3
    L127:
        r63 = "ۡۤۢ";
        goto L50
    L129:
        if (C0065.m260() <= 0) goto L130;
        r21 = (C0029.f29 + C0041.f41) ^ 1749512;
        r5 = r12;
        goto L3
    L130:
        C0059.m236();
        r21 = C0029.m116("ۣ۟۠");
        r5 = r12;
    L134:
        if (C0066.f66 <= 0) goto L135;
        r119 = "ۣۧۤ";
        goto L110
    L135:
        C0061.f61 = 18;
        r21 = C0042.m170("۟۟ۧ");
        goto L3
    L137:
        r66 = r23.values[0];
        r118 = ((gt.j(u40.a("oxaoSfQkykaXH7Rw5A==\n", "yHPRFpBNqSM=\n"), 1) + 10) - 1) - 10;
        if (C0026.m106() <= 0) goto L139;
        r19 = r118;
        r21 = (C0047.f47 / C0018.f18) + 1748832;
        r20 = r66;
        goto L3
    L139:
        C0048.f48 = 69;
        goto L84
    }
}
