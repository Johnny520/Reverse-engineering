package p000;

import android.app.C0986;
import android.window.C0990;
import androidx.activity.C0995;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1052;
import io.fastkv.C1053;
import java.util.ArrayList;

/* JADX INFO: renamed from: zv */
/* JADX INFO: loaded from: classes.dex */
public final class C0981zv extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public int f5622e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5623f;

    /* JADX INFO: renamed from: g */
    public final n00 f5624g;

    /* JADX INFO: renamed from: h */
    public final p00 f5625h;

    /* JADX INFO: renamed from: i */
    public final p00 f5626i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0981zv(ArrayList arrayList, n00 n00Var, p00 p00Var, p00 p00Var2, InterfaceC0814vd interfaceC0814vd) {
        super(interfaceC0814vd);
        this.f5623f = arrayList;
        this.f5624g = n00Var;
        this.f5625h = p00Var;
        this.f5626i = p00Var2;
        String strM3106 = null;
        int iM3140 = C1058.m3140("ۢۦ۠");
        while (true) {
            switch (iM3140) {
                case 1747900:
                    iM3140 = C1025.m3011((C1058.f5705 | (C1026.f5673 * (-1282))) >= 0 ? "ۡ۠ۨ" : "ۢۦ۠");
                    continue;
                case 1749610:
                    strM3106 = C1049.m3106("3YB");
                    iM3140 = (C1019.f5666 ^ C0997.f5644) + 1753136;
                    continue;
                case 1749788:
                    if (C1039.m3068() >= 0) {
                        if (C1001.f5648 <= 0) {
                            C1010.m2950();
                        }
                        iM3140 = C1008.m2944("ۢ۠ۨ");
                    }
                    break;
                case 1753602:
                    System.out.println(strM3106);
                    iM3140 = (C1024.f5671 ^ C1011.f5658) ^ (-1753188);
                    continue;
                case 1753631:
                    return;
                case 1753632:
                    break;
            }
            iM3140 = C0990.m2873(C1029.m3029() >= 0 ? "ۢۧۥ" : "ۦۦ۟");
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        String str;
        int iM2856 = C0986.m2856("ۡۥۣ");
        p00 p00Var = null;
        p00 p00Var2 = null;
        while (true) {
            switch (iM2856) {
                case 1748799:
                    p00Var = this.f5625h;
                    if ((C0995.f5642 ^ (C1046.f5693 / (-1745))) > 0) {
                        str = "ۡۧۧ";
                    } else {
                        C1036.f5683 = 42;
                        str = "ۡۥۣ";
                    }
                    break;
                case 1748865:
                    p00Var2 = this.f5626i;
                    str = "ۨۨۡ";
                    break;
                case 1749695:
                    iM2856 = (C1019.f5666 + C1048.f5695) ^ (-1748662);
                    continue;
                case 1755617:
                    return new C0981zv(this.f5623f, this.f5624g, p00Var, p00Var2, interfaceC0814vd);
            }
            iM2856 = C1015.m2970(str);
        }
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) {
        int iM3067 = C1039.m3067("ۥ۠ۢ");
        while (true) {
            switch (iM3067) {
                case 1748833:
                    iM3067 = C1052.m3118(C1001.f5648 <= 0 ? "ۣۣ۠" : "ۥ۠ۢ");
                    break;
                case 1752487:
                    if (C1043.f5690 < 0) {
                        iM3067 = (C1052.f5699 % C0994.f5641) ^ 1752325;
                    } else {
                        C1025.f5672 = 57;
                        iM3067 = C1053.m3122("ۡۦۦ");
                    }
                    break;
                case 1752524:
                    return ((C0981zv) mo35a((InterfaceC0814vd) obj2)).mo37g(C0893xh.f5258n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0981zv.mo37g(java.lang.Object):java.lang.Object");
    }
}
