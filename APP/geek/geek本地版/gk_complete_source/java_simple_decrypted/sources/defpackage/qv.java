package defpackage;

import android.app.C0001;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.result.C0008;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0041;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.carousel.C0053;
import com.google.android.material.chip.C0056;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import java.util.ArrayList;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class qv implements TextWatcher {
    public final i00 a;
    public final ArrayList b;
    public final g00 c;
    public final i00 d;

    public qv(g00 r4, i00 r5, i00 r6, ArrayList r7) {
        int r2 = C0001.m5("ۨۥۢ");
        Long r1 = null;
    L3:
        switch(r2) {
            case 56295: goto L6;
            case 1746813: goto L32;
            case 1748672: goto L31;
            case 1749671: goto L16;
            case 1749796: goto L11;
            case 1751772: goto L23;
            case 1753546: goto L27;
            case 1754508: goto L38;
            case 1754600: goto L8;
            case 1755525: goto L36;
            default: goto L3;
        };
    L6:
        if (C0013.m52() >= 0) goto L7;
        r2 = C0030.m120("ۨۥۢ");
        goto L3
    L7:
        C0022.m88();
        r2 = C0071.m286("۠۟ۥ");
        goto L3
    L8:
        System.out.println(r1);
        if ((C0072.f72 + (C0073.f73 / (-491))) >= 0) goto L10;
    L13:
        r2 = C0025.m102("ۣۧۨ");
        goto L3
    L10:
        C0067.m269();
        r2 = C0013.m53("ۡۡ۠");
        goto L3
    L11:
        this.b = r7;
        if ((C0065.f65 + (C0056.f56 / 4434)) >= 0) goto L13;
        r2 = (C0049.f49 / C0059.f59) + 1753546;
        goto L3
    L16:
        if (C0031.m124() > 0) goto L23;
        if ((C0066.f66 - (C0026.f26 ^ (-511))) > 0) goto L21;
        C0012.f12 = 10;
        String r0 = "۟ۦ";
    L20:
        r2 = C0035.m140(r0);
        goto L3
    L21:
        r0 = "ۣ۟ۡ";
    L23:
        if (C0024.f24 <= 0) goto L24;
        r2 = C0006.m26("ۣۧۨ");
        goto L3
    L24:
        C0071.m284();
        String r02 = "ۡۡۥ";
    L25:
        r2 = C0029.m116(r02);
        goto L3
    L27:
        this.c = r4;
        if ((C0004.f4 - (C0038.f38 | (-5262))) >= 0) goto L29;
        r2 = (C0049.f49 | C0028.f28) ^ (-1748169);
        goto L3
    L29:
        C0029.m118();
        r2 = C0014.m57("ۢۦۨ");
        goto L3
    L31:
        this.d = r6;
        r02 = "ۢۢۧ";
        goto L25
    L32:
        Long r03 = Long.valueOf(C0073.m293("VbNvQBKku52qlgUej6BGyxaHZc73"));
        if ((C0072.f72 + (C0007.f7 / (-5281))) >= 0) goto L34;
        r2 = C0027.m110("ۧۦۧ");
        r1 = r03;
        goto L3
    L34:
        C0017.m71();
        r2 = C0037.m149("ۨۥۢ");
        r1 = r03;
        goto L3
    L36:
        this.a = r5;
        r0 = "ۢۦۨ";
        goto L20
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r6) {
        int r3 = C0058.m234("ۣۧۦ");
        String r2 = null;
        i00 r0 = null;
    L3:
        switch(r3) {
            case 56359: goto L5;
            case 56443: goto L10;
            case 1747838: goto L25;
            case 1748617: goto L13;
            case 1749730: goto L21;
            case 1750786: goto L17;
            default: goto L3;
        };
    L5:
        uv.g(this.c, r0, this.d, this.b);
        if ((C0046.f46 ^ (C0039.f39 / 5549)) <= 0) goto L7;
        r3 = (C0006.f6 % C0006.f6) ^ 1747838;
        goto L3
    L7:
        C0033.m135();
        String r1 = "ۡۨ";
    L8:
        r3 = C0060.m241(r1);
        goto L3
    L10:
        r0.b = r2;
        String r12 = "ۡۨ";
    L11:
        r3 = C0010.m43(r12);
        goto L3
    L13:
        if (C0031.m124() > 0) goto L16;
        String r13 = "ۢۢ";
    L15:
        r3 = C0046.m186(r13);
        goto L3
    L16:
        r13 = "ۣۧۦ";
        goto L15
    L17:
        String r14 = String.valueOf(r6);
        if (C0061.f61 <= 0) goto L19;
        r3 = 1749723 + (C0050.f50 % C0047.f47);
        r2 = r14;
        goto L3
    L19:
        r3 = C0056.m226("۠ۥۣ");
        r2 = r14;
        goto L3
    L21:
        r0 = this.a;
        if (C0043.m172() < 0) goto L24;
        r12 = "ۣۧۦ";
        goto L11
    L24:
        r1 = "ۤ۟";
        goto L8
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r4, int r5, int r6, int r7) {
        int r2 = C0068.m272("ۥۦۥ");
        String r1 = null;
    L3:
        switch(r2) {
            case 56326: goto L5;
            case 1750627: goto L21;
            case 1752454: goto L13;
            case 1752676: goto L7;
            case 1753604: goto L26;
            case 1755522: goto L18;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0046.m185() > 0) goto L13;
        if ((C0035.f35 | (C0023.f23 - 1318)) >= 0) goto L10;
        r2 = (C0003.f3 - C0030.f30) ^ 1750228;
        goto L3
    L10:
        C0034.f34 = 23;
        r2 = C0053.m213("ۥۦۥ");
    L13:
        if (C0041.m167() <= 0) goto L14;
        r2 = (C0072.f72 ^ C0001.f1) ^ 57024;
        goto L3
    L14:
        C0039.f39 = 84;
        String r0 = "ۦ۠ۨ";
    L15:
        r2 = C0019.m79(r0);
        goto L3
    L18:
        if ((C0049.f49 | (C0015.f15 | 7703)) >= 0) goto L19;
        r2 = (C0010.f10 + C0070.f70) + 1752842;
        goto L3
    L19:
        r2 = C0072.m288("ۧۥۣ");
        goto L3
    L21:
        r1 = C0036.m146("BjZiBXXMISGnPJy4vJl9PHLL2VX0U");
        if ((C0065.f65 ^ (C0014.f14 - 825)) > 0) goto L25;
        C0066.m265();
        String r02 = "ۨۥ۟";
    L24:
        r2 = C0001.m5(r02);
        goto L3
    L25:
        r02 = "ۦۥۣ";
        goto L24
    L26:
        System.out.println(r1);
        if (C0003.f3 > 0) goto L29;
        r2 = C0006.m26("۠ۦ");
        goto L3
    L29:
        r0 = "۠ۦ";
        goto L15
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r4, int r5, int r6, int r7) {
        Integer r0 = null;
        int r1 = C0018.m73("ۡۢ۠");
    L3:
        switch(r1) {
            case 56448: goto L6;
            case 1748703: goto L22;
            case 1750538: goto L16;
            case 1750780: goto L10;
            case 1751740: goto L27;
            case 1753663: goto L20;
            default: goto L3;
        };
    L6:
        if (C0038.f38 < 0) goto L9;
        C0044.m178();
        String r12 = "ۦۥۨ";
    L8:
        r1 = C0044.m176(r12);
        goto L3
    L9:
        r12 = "ۡۢ۠";
        goto L8
    L10:
        System.out.println(r0);
        if (C0030.m121() >= 0) goto L12;
        r1 = (C0036.f36 + C0046.f46) + 1750491;
        goto L3
    L12:
        C0016.f16 = 73;
    L13:
        r1 = C0005.m23("ۣۧ۠");
    L16:
        if ((C0044.f44 + (C0063.f63 % 3322)) <= 0) goto L17;
        r1 = (C0056.f56 | C0008.f8) ^ (-1751997);
        goto L3
    L17:
        C0018.f18 = 26;
        String r13 = "ۤۧۤ";
    L18:
        r1 = C0046.m186(r13);
        goto L3
    L20:
        r0 = Integer.decode(C0031.m125("eoStiZvq7hitXPzwLWzVyOC"));
        goto L13
    L22:
        if (C0025.m103() < 0) goto L16;
        if (C0035.m143() > 0) goto L26;
        C0049.f49 = 38;
        r1 = C0059.m239("ۤۤ");
        goto L3
    L26:
        r13 = "ۦۧ۠";
        goto L18
    }
}
