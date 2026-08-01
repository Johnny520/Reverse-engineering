package defpackage;

import android.app.C0001;
import android.app.C0002;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0006;
import android.widget.LinearLayout;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0020;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.floatingactionbutton.C0060;
import com.ljx.wechatmod.hook.C0066;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln implements sh {
    public final int a;
    public final LinearLayout b;

    public /* synthetic */ ln(LinearLayout r4, int r5) {
        this.a = r5;
        this.b = r4;
        String r1 = null;
        int r2 = C0057.m229("ۢۧ۠");
    L3:
        switch(r2) {
            case 1747679: goto L6;
            case 1747897: goto L15;
            case 1749819: goto L12;
            case 1750633: goto L10;
            case 1753663: goto L19;
            case 1753670: goto L23;
            default: goto L3;
        };
    L6:
        if ((C0068.f68 % (C0046.f46 | (-4267))) < 0) goto L9;
        C0014.f14 = 81;
        String r0 = "ۦۦ۟";
    L8:
        r2 = C0028.m114(r0);
        goto L3
    L9:
        r0 = "ۦۧۧ";
        goto L8
    L10:
        System.out.println(r1);
        r2 = C0011.m45("ۦۧۧ");
        goto L3
    L12:
        if (C0038.m155() > 0) goto L6;
        r2 = (C0001.f1 - C0009.f9) + 1752981;
        goto L3
    L15:
        if (C0052.m210() <= 0) goto L16;
        r2 = (C0034.f34 ^ C0069.f69) + 1748861;
        goto L3
    L16:
        C0012.f12 = 39;
        String r22 = "ۥۡۥ";
        String r02 = r1;
    L17:
        r2 = C0058.m234(r22);
        r1 = r02;
        goto L3
    L19:
        r02 = C0069.m279("rXVNtbS");
        if ((C0006.f6 + (C0016.f16 ^ 2820)) > 0) goto L22;
        C0060.f60 = 85;
        r2 = C0002.m8("ۢۧ۠");
        r1 = r02;
        goto L3
    L22:
        r22 = "ۣۢۨ";
        goto L17
    }

    @Override // defpackage.sh
    public final void a() {
        int r0 = C0038.m153("ۣۤ۠");
    L3:
        switch(r0) {
            case 1746816: goto L5;
            case 1747682: goto L27;
            case 1749726: goto L13;
            case 1749757: goto L9;
            case 1750748: goto L24;
            case 1751617: goto L11;
            case 1752643: goto L17;
            case 1754445: goto L27;
            case 1754593: goto L8;
            case 1755343: goto L19;
            case 1755463: goto L27;
            default: goto L3;
        };
    L5:
        this.b.setLayerType(0, null);
        if ((C0033.f33 ^ (C0020.f20 | 5125)) >= 0) goto L7;
        r0 = (C0036.f36 / C0027.f27) ^ (-1755464);
        goto L3
    L7:
        C0066.f66 = 85;
        r0 = C0029.m116("ۧۦ۠");
    L8:
        r0 = C0032.m130("ۣ۟ۤ");
        goto L3
    L9:
        this.b.setLayerType(0, null);
        r0 = (C0053.f53 - C0044.f44) + 1754743;
        goto L3
    L11:
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L17;
            default: goto L13;
        };
    L13:
        if ((C0012.f12 + (C0018.f18 - 2784)) >= 0) goto L14;
        String r02 = "ۢۥ۠";
    L16:
        r0 = C0017.m70(r02);
        goto L3
    L14:
        r0 = C0008.m35("ۢۥۦ");
    L17:
        r02 = "ۨ۟ۦ";
        goto L16
    L19:
        this.b.setLayerType(0, null);
        if (C0004.f4 >= 0) goto L21;
        r0 = (C0049.f49 ^ C0034.f34) + 1748622;
        goto L3
    L21:
        C0068.f68 = 85;
        r0 = C0035.m140("ۢۤ۠");
        goto L3
    L24:
        if (C0029.m118() <= 0) goto L25;
        r0 = (C0058.f58 - C0017.f17) + 1751493;
        goto L3
    L25:
        r02 = "ۥۥۨ";
        goto L16
    }
}
