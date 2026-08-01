package p000;

import android.app.C0986;
import android.app.C0987;
import android.app.C0988;
import android.app.C0989;
import android.content.Context;
import android.support.v4.graphics.drawable.C0991;
import android.view.C0993;
import androidx.activity.C0996;
import androidx.activity.result.C0995;
import androidx.appcompat.widget.C1000;
import androidx.appcompat.widget.C1002;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1005;
import androidx.coordinatorlayout.widget.C1007;
import androidx.coordinatorlayout.widget.C1008;
import androidx.core.content.C1009;
import androidx.core.content.C1010;
import androidx.core.widget.C1011;
import androidx.emoji2.text.C1012;
import androidx.profileinstaller.C1016;
import androidx.savedstate.C1020;
import androidx.savedstate.C1021;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.behavior.C1036;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1038;
import com.google.android.material.carousel.C1039;
import com.google.android.material.carousel.C1040;
import com.google.android.material.chip.C1042;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.floatingactionbutton.C1046;
import com.ljx.wechatmod.auth.C1051;
import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0626q9 extends m50 implements InterfaceC0861wm {

    /* JADX INFO: renamed from: e */
    public final int f4042e = 0;

    /* JADX INFO: renamed from: f */
    public final ClassLoader f4043f;

    /* JADX INFO: renamed from: g */
    public final String f4044g;

    /* JADX INFO: renamed from: h */
    public final Serializable f4045h;

    /* JADX INFO: renamed from: i */
    public final Object f4046i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626q9(i00 i00Var, String str, ClassLoader classLoader, C0551o9 c0551o9, InterfaceC0444ld interfaceC0444ld) {
        String str2;
        String str3;
        super(interfaceC0444ld);
        this.f4045h = i00Var;
        this.f4044g = str;
        this.f4043f = classLoader;
        this.f4046i = c0551o9;
        Integer numDecode = null;
        int iM3038 = C1034.m3038("۟۟ۡ");
        while (true) {
            switch (iM3038) {
                case 1746689:
                    if (C0991.m2866() >= 0) {
                        if (C1011.f5655 - (C1021.f5665 ^ (-1390)) <= 0) {
                            C1044.m3077();
                            str3 = "ۣۣۧ";
                        } else {
                            str3 = "ۣۤۡ";
                        }
                        iM3038 = C1037.m3052(str3);
                    }
                    break;
                case 1749762:
                    break;
                case 1750663:
                    iM3038 = (C1030.f5674 / C0995.f5639) ^ 1746689;
                    continue;
                case 1750688:
                    numDecode = Integer.decode(C1016.m2968("hEDKH"));
                    if ((C1042.f5686 | (C0996.f5640 % 9544)) >= 0) {
                        C0993.f5637 = 70;
                        str2 = "ۧ۠ۦ";
                    } else {
                        str2 = "ۥ۟ۧ";
                    }
                    iM3038 = C1046.m3086(str2);
                    continue;
                case 1752461:
                    System.out.println(numDecode);
                    if (C1009.f5653 - (C1020.f5664 % 4731) <= 0) {
                        iM3038 = C1036.m3048("ۢۥۥ");
                    } else {
                        iM3038 = C1036.m3048("ۧ۠ۦ");
                        continue;
                    }
                    break;
                case 1754413:
                    return;
            }
            iM3038 = (C1057.f5701 ^ C0986.f5630) + 1754530;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626q9(LinkedHashSet linkedHashSet, ClassLoader classLoader, String str, Context context, InterfaceC0444ld interfaceC0444ld) {
        String str2;
        super(interfaceC0444ld);
        this.f4045h = linkedHashSet;
        this.f4043f = classLoader;
        this.f4044g = str;
        this.f4046i = context;
        Float fValueOf = null;
        int iM2936 = C1008.m2936("ۨۦۧ");
        while (true) {
            switch (iM2936) {
                case 1746720:
                    if (C1005.f5649 - (C1057.f5701 - 3677) <= 0) {
                        C1038.m3055();
                        iM2936 = C1044.m3079("ۣۧۢ");
                    } else {
                        iM2936 = (C0989.f5633 + C0986.f5630) ^ 1756360;
                        continue;
                    }
                    break;
                case 1747869:
                    return;
                case 1750694:
                    break;
                case 1754500:
                    fValueOf = Float.valueOf(C0987.m2852("KG6bp"));
                    if ((C1000.f5644 ^ (C0988.f5632 + 759)) >= 0) {
                        C1010.f5654 = 18;
                        iM2936 = C1010.m2944("ۣۧ۠");
                    } else {
                        iM2936 = (C1040.f5684 | C1051.f5695) ^ (-1755196);
                        continue;
                    }
                    break;
                case 1755432:
                    System.out.println(fValueOf);
                    if (C0988.f5632 * (C1039.f5683 | (-3813)) >= 0) {
                        C1012.f5656 = 83;
                        iM2936 = C1029.m3019("ۨۦۧ");
                    } else {
                        iM2936 = C0996.m2889("۠ۦۣ");
                        continue;
                    }
                    break;
                case 1755561:
                    if (C1002.m2912() <= 0) {
                        if (C0991.m2866() >= 0) {
                            C1040.m3062();
                            str2 = "ۨۢۢ";
                        } else {
                            str2 = "ۣۧ۠";
                        }
                        iM2936 = C1056.m3126(str2);
                    }
                    break;
            }
            iM2936 = (C1007.f5651 - C1003.f5647) ^ (-1748757);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x001e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0444ld mo471a(p000.InterfaceC0444ld r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0626q9.mo471a(ld):ld");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0082. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6 A[SYNTHETIC] */
    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo472e(java.lang.Object r7, java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0626q9.mo472e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0117. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x023b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x022d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029e A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo473g(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0626q9.mo473g(java.lang.Object):java.lang.Object");
    }
}
