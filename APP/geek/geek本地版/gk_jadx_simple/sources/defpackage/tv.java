package defpackage;

import android.app.C0000;
import android.app.C0003;
import android.app.Dialog;
import android.content.Context;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
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
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class tv extends m50 implements wm {
    public int e;
    public final Dialog f;
    public final Context g;
    public final LinkedHashSet h;
    public final ClassLoader i;
    public final String j;

    public tv(Dialog r4, Context r5, LinkedHashSet r6, ClassLoader r7, String r8, ld r9) {
        this.f = r4;
        this.g = r5;
        this.h = r6;
        this.i = r7;
        this.j = r8;
        super(r9);
        Long r1 = null;
        int r0 = C0019.m79("۠ۢ۠");
    L3:
        switch(r0) {
            case 1747742: goto L6;
            case 1749637: goto L13;
            case 1750629: goto L10;
            case 1751621: goto L15;
            case 1754506: goto L16;
            case 1755466: goto L14;
            default: goto L3;
        };
    L6:
        if (C0044.m178() < 0) goto L10;
        String r02 = "ۢۡۤ";
    L8:
        r0 = C0010.m43(r02);
    L10:
        if (C0064.m257() < 0) goto L12;
        C0066.m265();
        r02 = "ۣۨۧ";
        goto L8
    L12:
        r02 = "ۣۧۦ";
        goto L8
    L13:
        r1 = Long.decode(C0050.m201("Sd6B9FAhJhJSduoAbrSfk2Tz2"));
        r0 = (C0051.f51 * C0000.f0) + 1850692;
        goto L3
    L14:
        System.out.println(r1);
        r02 = "ۣۧۦ";
        goto L8
    L15:
        r0 = C0026.m105("۠ۢ۠");
        goto L3
    }

    @Override // defpackage.m50
    public final ld a(ld r8) {
        int r1 = C0044.m176("ۧ۠ۦ");
        ClassLoader r4 = null;
        String r5 = null;
    L3:
        switch(r1) {
            case 1748866: goto L5;
            case 1749641: goto L15;
            case 1752674: goto L9;
            case 1754413: goto L13;
            default: goto L3;
        };
    L5:
        r5 = this.j;
        if (C0005.m20() >= 0) goto L7;
        r1 = (C0063.f63 | C0044.f44) + 1749278;
        goto L3
    L7:
        r1 = C0040.m160("ۡۧۨ");
        goto L3
    L9:
        if ((C0039.f39 / (C0021.f21 * (-6847))) != 0) goto L10;
        r1 = (C0057.f57 % C0067.f67) + 1754541;
        goto L3
    L10:
        C0071.f71 = 47;
        String r0 = "ۣۢۡ";
    L11:
        r1 = C0015.m60(r0);
        goto L3
    L13:
        r4 = this.i;
        r0 = "ۡۧۨ";
        goto L11
    L15:
        return new tv(this.f, this.g, this.h, r4, r5, r8);
    }

    @Override // defpackage.wm
    public final Object e(Object r3, Object r4) {
        int r0 = C0017.m70("ۣۧۡ");
    L3:
        switch(r0) {
            case 1751560: goto L6;
            case 1753663: goto L12;
            case 1754441: goto L7;
            default: goto L3;
        };
    L6:
        return ((tv) a((ld) r4)).g(vh.n);
    L7:
        oe r02 = (oe) r3;
        if (C0007.f7 <= 0) goto L9;
        r0 = (C0065.f65 | C0063.f63) ^ (-1751328);
        goto L3
    L9:
        C0005.m20();
        r0 = C0018.m73("ۦۧ۠");
        goto L3
    L12:
        if (C0007.m31() >= 0) goto L13;
        r0 = (C0058.f58 * C0067.f67) + 1884401;
        goto L3
    L13:
        C0056.f56 = 66;
        r0 = C0008.m35("ۣۢۦ");
        goto L3
    }

    @Override // defpackage.m50
    public final Object g(Object r20) {
        Object r10 = null;
        int r11 = 0;
        Context r5 = null;
        nf r9 = null;
        q9 r4 = null;
        pe r15 = null;
        Object r7 = null;
        String r8 = null;
        gn r13 = null;
        StringBuilder r12 = null;
        String r14 = null;
        int r6 = C0021.m86("ۣۨ۟");
        kx r16 = null;
        Object r17 = null;
        int r18 = 0;
    L3:
        switch(r6) {
            case 56325: goto L6;
            case 56389: goto L52;
            case 56451: goto L33;
            case 1746725: goto L26;
            case 1746753: goto L95;
            case 1746780: goto L38;
            case 1746842: goto L111;
            case 1746904: goto L265;
            case 1746913: goto L43;
            case 1746936: goto L136;
            case 1747657: goto L49;
            case 1747810: goto L98;
            case 1748618: goto L122;
            case 1748671: goto L114;
            case 1748826: goto L21;
            case 1749576: goto L41;
            case 1749579: goto L128;
            case 1749788: goto L71;
            case 1750754: goto L137;
            case 1750815: goto L103;
            case 1751558: goto L21;
            case 1752489: goto L78;
            case 1753516: goto L15;
            case 1754414: goto L118;
            case 1754505: goto L27;
            case 1754594: goto L107;
            case 1754629: goto L41;
            case 1755367: goto L132;
            case 1755460: goto L66;
            case 1755465: goto L45;
            case 1755493: goto L95;
            case 1755499: goto L8;
            case 1755555: goto L62;
            case 1755591: goto L89;
            default: goto L3;
        };
    L137:
        this.f.dismiss();     // Catch: Throwable -> L83
        if ((C0036.f36 * (C0043.f43 * 2557)) <= 0) goto L59;
        r6 = (C0030.f30 / C0000.f0) + 1755499;
        goto L3
    L59:
        C0028.m112();
    L60:
        r6 = C0004.m16("۟ۦۨ");
    L85:
        if ((C0021.f21 + (C0065.f65 * (-8271))) <= 0) goto L86;
        r6 = (C0066.f66 + C0028.f28) ^ 1754961;
        goto L3
    L86:
        C0042.m169();
        r6 = C0051.m207("ۣۨ۟");
        goto L3
    L6:
        if ((C0047.f47 + (C0017.f17 * 1106)) <= 0) goto L7;
        r6 = C0072.m288("ۣۦۥ");
        goto L3
    L7:
        C0006.f6 = 23;
        r6 = C0072.m288("ۣ۠ۨ");
        goto L3
    L8:
        if (r18 <= 0) goto L111;
        gn r1 = gn.a;
        if ((C0073.f73 - (C0028.f28 + 2949)) >= 0) goto L11;
        String r2 = r14;
    L13:
        String r3 = "ۣۧۥ";
    L14:
        r13 = r1;
        r14 = r2;
        r6 = C0039.m159(r3);
        goto L3
    L11:
        r13 = r1;
        r6 = C0024.m98("ۨۤۧ");
        goto L3
    L15:
        r13.getClass();
        gn.k(r5, r14);
        if (C0046.f46 <= 0) goto L17;
        String r32 = "ۤۧ";
    L19:
        r6 = C0041.m164(r32);
        goto L3
    L17:
        C0071.f71 = 13;
        r6 = C0020.m80("ۨۧۦ");
        goto L3
    L21:
        if ((C0052.f52 ^ (C0040.f40 + 9898)) > 0) goto L24;
        String r19 = "ۣۢ۟";
    L23:
        r6 = C0064.m258(r19);
        goto L3
    L24:
        r19 = "۟ۦۨ";
        goto L23
    L26:
        throw new IllegalStateException(u40.a("c/5n+vb7D2037W7lo+IFajD9bvC5/QVtN/Zl4LnkBWow6GLivq8DImLwfuK/4QU=\n", "EJ8LltaPYE0=\n"));
    L27:
        StringBuilder r22 = new StringBuilder("✅ 成功极速分发给 ");
        r22.append(r18);
        if ((C0068.f68 + (C0062.f62 % (-50))) >= 0) goto L29;
        String r33 = "ۢۧ";
        q9 r110 = r4;
    L31:
        r4 = r110;
        r12 = r22;
        r6 = C0030.m120(r33);
        goto L3
    L29:
        r12 = r22;
        r6 = C0062.m249("ۨ۠۟");
        goto L3
    L33:
        if (C0025.f25 >= 0) goto L34;
        String r111 = "ۡۦ۟";
    L37:
        r6 = C0046.m186(r111);
        goto L3
    L34:
        C0066.m265();
        Object r112 = r10;
        int r23 = r11;
    L35:
        r32 = "ۡ۟ۨ";
        r10 = r112;
        r11 = r23;
        goto L19
    L38:
        gn.k(r5, r8);
        if ((C0068.f68 % (C0068.f68 | (-1495))) < 0) goto L60;
        r6 = C0026.m105("ۧ۠ۧ");
        goto L3
    L41:
        r6 = (C0019.f19 % C0050.f50) + 1755480;
        goto L3
    L43:
        return vh.n;
    L45:
        if ((C0025.f25 ^ (C0045.f45 - 2611)) <= 0) goto L46;
        r6 = (C0036.f36 * C0057.f57) + 2122133;
        goto L3
    L46:
        C0055.m223();
        r33 = "ۨۦۦ";
        r110 = r4;
        r22 = r12;
    L49:
        if ((C0057.f57 - (C0067.f67 * 9894)) > 0) goto L51;
        C0062.m248();
        r6 = C0014.m57("ۦۢ۟");
        goto L3
    L51:
        r33 = "۟ۧ۠";
        r110 = r4;
        r22 = r12;
        goto L31
    L52:
        r12.append(" 个对象！");
        r2 = r12.toString();
        if ((C0012.f12 + (C0051.f51 ^ 9338)) >= 0) goto L54;
        r14 = r2;
        r6 = (C0046.f46 - C0046.f46) ^ 1753516;
        goto L3
    L54:
        C0052.f52 = 25;
        r1 = r13;
        goto L13
    L62:
        gn.a.getClass();
        if ((C0065.f65 - (C0066.f66 + 5522)) >= 0) goto L64;
    L120:
        r6 = C0006.m26("۟ۢ۟");
        goto L3
    L64:
        C0033.m135();
        r6 = C0007.m28("ۣۨۤ");
        goto L3
    L66:
        r23 = this.e;
        if ((C0048.f48 % (C0028.f28 + 2160)) > 0) goto L70;
        String r113 = "۠ۥ";
        r10 = r20;
    L69:
        r11 = r23;
        r6 = C0071.m286(r113);
        goto L3
    L70:
        r112 = r20;
        goto L35
    L71:
        String r114 = (String) r16.b;
        if (C0023.f23 > 0) goto L76;
        C0006.m24();
        nf r24 = r9;
    L74:
        String r34 = "۠ۤۦ";
    L75:
        r8 = r114;
        r9 = r24;
        r6 = C0003.m13(r34);
        goto L3
    L76:
        r34 = "ۣۦۥ";
        r24 = r9;
        goto L75
    L78:
        if (r11 != 1) goto L45;
        ct.y(r10);
        if ((C0018.f18 | (C0045.f45 / (-1205))) > 0) goto L82;
        C0062.m248();
        r6 = C0048.m193("ۡۡ۟");
        goto L3
    L82:
        r113 = "ۧ۠ۧ";
        r23 = r11;
        goto L69
    L89:
        if (r17 != r15) goto L95;
        if (C0046.f46 <= 0) goto L92;
        r6 = (C0065.f65 % C0034.f34) + 1747760;
        goto L3
    L92:
        C0030.f30 = 26;
        r6 = C0042.m170("۟ۤ۟");
    L95:
        if (C0044.f44 <= 0) goto L96;
        r6 = (C0061.f61 | C0007.f7) ^ 1754140;
        goto L3
    L96:
        C0049.m199();
        r6 = C0042.m170("ۦۣۧ");
        goto L3
    L98:
        r110 = new q9(this.h, this.i, this.j, r5, null);
        if ((C0050.f50 | (C0035.f35 * (-8693))) < 0) goto L101;
        r4 = r110;
        r6 = C0033.m132("ۧۦۡ");
        goto L3
    L101:
        r33 = "ۨ۠۟";
        r22 = r12;
        goto L31
    L103:
        if ((C0003.f3 % (C0017.f17 + 116)) <= 0) goto L104;
        r6 = (C0031.f31 ^ C0060.f60) + 1756474;
        goto L3
    L104:
        C0013.m52();
        r111 = "ۢۧ";
        goto L37
    L265:
        return r15;
    L107:
        kx r115 = (kx) r7;
        int r25 = ((Number) r115.a).intValue();
        if ((C0058.f58 / (C0031.f31 | (-6645))) >= 0) goto L109;
        r16 = r115;
        r18 = r25;
        r6 = (C0019.f19 ^ C0024.f24) ^ 1749826;
        goto L3
    L109:
        C0046.m185();
        r16 = r115;
        r18 = r25;
        r6 = C0041.m164("ۣۨۤ");
    L111:
        String r116 = "ۨۦۡ";
    L112:
        r6 = C0038.m153(r116);
        goto L3
    L114:
        if (C0013.f13 < 0) goto L116;
        C0009.m36();
        r116 = "ۦ۟ۦ";
        goto L112
    L116:
        r116 = "ۣۨ۟";
        goto L112
    L118:
        if (C0059.m236() > 0) goto L121;
        C0063.f63 = 4;
        r7 = r10;
        goto L120
    L121:
        r3 = "ۣۨۤ";
        r1 = r13;
        r2 = r14;
        r7 = r10;
        goto L14
    L122:
        r5 = this.g;
        if (r11 == 0) goto L49;
        if ((C0015.f15 * (C0048.f48 % (-4528))) >= 0) goto L126;
        r6 = (C0008.f8 - C0071.f71) + 1752765;
        goto L3
    L126:
        r6 = C0052.m209("ۨۤۡ");
        goto L3
    L128:
        r15 = pe.a;
        if (C0022.m88() <= 0) goto L130;
        r7 = r17;
        r6 = (C0033.f33 | C0008.f8) + 1756360;
        goto L3
    L130:
        C0046.m185();
        r7 = r17;
        r6 = C0009.m38("۟ۧ۠");
        goto L3
    L132:
        this.e = 1;
        Object r117 = a80.I(r9, r4, this);
        if (C0047.f47 >= 0) goto L134;
        r17 = r117;
        r6 = C0034.m138("ۢ۟ۨ");
        goto L3
    L134:
        r17 = r117;
        r6 = C0056.m226("ۣ۟ۡ");
        goto L3
    L136:
        ct.y(r10);
        r24 = wg.b;
        r114 = r8;
        goto L74
    }
}
