package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.app.Dialog;
import android.support.v4.graphics.drawable.C0005;
import android.view.C0007;
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0022;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.behavior.C0050;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements sh {
    public final int a;
    public final KeyEvent.Callback b;

    public /* synthetic */ c6(KeyEvent.Callback r4, int r5) {
        this.a = r5;
        this.b = r4;
        float r0 = 0.0f;
        int r1 = C0037.m149("ۥۥۣ");
    L3:
        switch(r1) {
            case 1748894: goto L5;
            case 1749725: goto L17;
            case 1751742: goto L14;
            case 1752643: goto L7;
            case 1752739: goto L12;
            case 1755524: goto L21;
            default: goto L3;
        };
    L5:
        r1 = (C0000.f0 % C0027.f27) + 1752548;
        goto L3
    L7:
        if (C0018.m75() > 0) goto L14;
        if (C0002.f2 <= 0) goto L10;
        r1 = (C0047.f47 | C0015.f15) + 1749734;
        goto L3
    L10:
        C0003.m14();
        r1 = C0016.m65("ۤۧۡ");
        goto L3
    L12:
        System.out.println(r0);
        r1 = (C0066.f66 % C0005.f5) ^ 1755588;
    L14:
        if (C0022.m88() <= 0) goto L15;
        r1 = (C0044.f44 - C0009.f9) ^ 1756482;
        goto L3
    L15:
        r1 = C0070.m281("۟ۦۨ");
        goto L3
    L17:
        r0 = Float.parseFloat(C0026.m107("4zVe8QdCJQllDjeTmNtg7"));
        if ((C0019.f19 | (C0067.f67 | 4344)) >= 0) goto L19;
        r1 = (C0072.f72 + C0011.f11) + 1753614;
        goto L3
    L19:
        C0054.m217();
        r1 = C0033.m132("ۢۤ۟");
        goto L3
    }

    @Override // defpackage.sh
    public final void a() {
        Double r1 = null;
        int r3 = C0029.m116("۠ۢۤ");
    L3:
        switch(r3) {
            case 56359: goto L5;
            case 1746817: goto L40;
            case 1746851: goto L32;
            case 1746877: goto L35;
            case 1747746: goto L14;
            case 1747935: goto L48;
            case 1750598: goto L48;
            case 1750725: goto L48;
            case 1751558: goto L23;
            case 1751748: goto L25;
            case 1752643: goto L8;
            case 1753570: goto L44;
            case 1753670: goto L30;
            case 1754531: goto L16;
            case 1755586: goto L19;
            default: goto L3;
        };
    L5:
        ((Dialog) this.b).dismiss();
        if ((C0070.f70 ^ (C0046.f46 | 3489)) <= 0) goto L7;
    L11:
        r3 = C0017.m70("ۤۧۧ");
        goto L3
    L7:
        C0069.f69 = 79;
        r3 = C0056.m226("ۦۧۧ");
        goto L3
    L8:
        ((View) this.b).setLayerType(0, null);
        if ((C0011.f11 + (C0014.f14 / (-2808))) >= 0) goto L10;
        r3 = (C0058.f58 ^ C0061.f61) + 1750076;
        goto L3
    L10:
        C0062.f62 = 85;
        goto L11
    L14:
        switch(this.a) {
            case 0: goto L32;
            case 1: goto L40;
            default: goto L16;
        };
    L16:
        if (C0040.f40 > 0) goto L47;
        C0008.f8 = 57;
        String r0 = "ۣۥ۟";
    L18:
        r3 = C0067.m271(r0);
        goto L3
    L47:
        r0 = "ۥۥۣ";
        goto L18
    L19:
        System.out.println(r1);
        if (C0046.f46 <= 0) goto L21;
        r3 = (C0001.f1 + C0014.f14) + 1748823;
        goto L3
    L21:
        r3 = C0044.m176("ۥۥۣ");
    L23:
        r3 = (C0053.f53 / C0013.f13) + 1747935;
        goto L3
    L25:
        if (C0031.m124() > 0) goto L23;
        if ((C0009.f9 - (C0032.f32 / 9070)) >= 0) goto L28;
        r3 = C0007.m28("۟ۥۣ");
        goto L3
    L28:
        C0071.f71 = 34;
        r3 = C0019.m79("ۦۤ۠");
        goto L3
    L30:
        ((Dialog) this.b).dismiss();
        r3 = (C0068.f68 - C0018.f18) + 1751624;
    L32:
        if (C0054.m217() >= 0) goto L33;
        r3 = (C0068.f68 ^ C0022.f22) + 56319;
        goto L3
    L33:
        r3 = C0032.m130("ۦ۠ۢ");
        goto L3
    L35:
        Double r02 = Double.valueOf(C0041.m165("UI0vUmE5P1yJByWERyE"));
        if ((C0010.f10 * (C0032.f32 - 9199)) <= 0) goto L37;
        r3 = 1755647 + (C0034.f34 % C0057.f57);
        r1 = r02;
        goto L3
    L37:
        C0059.f59 = 95;
        r3 = C0073.m292("ۣۤۡ");
        r1 = r02;
    L40:
        if (C0033.m135() >= 0) goto L41;
        r3 = (C0038.f38 * C0060.f60) + 2105256;
        goto L3
    L41:
        C0007.f7 = 16;
        r3 = C0008.m35("ۦ۠ۧ");
        goto L3
    L44:
        if (C0058.f58 <= 0) goto L45;
        r3 = (C0050.f50 + C0033.f33) + 1747495;
        goto L3
    L45:
        C0017.f17 = 34;
        r3 = C0032.m130("ۡۤۢ");
        goto L3
    }
}
