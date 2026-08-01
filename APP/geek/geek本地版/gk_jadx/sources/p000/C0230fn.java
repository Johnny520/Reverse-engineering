package p000;

import android.app.Activity;
import android.app.C0986;
import android.app.C0989;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0991;
import android.support.v4.graphics.drawable.C0992;
import android.view.C0993;
import android.view.ViewGroup;
import androidx.appcompat.app.C0998;
import androidx.constraintlayout.widget.C1004;
import androidx.coordinatorlayout.widget.C1008;
import androidx.fragment.app.C1013;
import androidx.legacy.content.C1014;
import androidx.lifecycle.C1015;
import androidx.savedstate.C1022;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1026;
import androidx.versionedparcelable.C1027;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1039;
import com.google.android.material.carousel.C1040;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1050;
import com.ljx.wechatmod.hook.C1052;

/* JADX INFO: renamed from: fn */
/* JADX INFO: loaded from: classes.dex */
public final class C0230fn extends m50 implements InterfaceC0861wm {

    /* JADX INFO: renamed from: e */
    public int f1984e;

    /* JADX INFO: renamed from: f */
    public final Activity f1985f;

    /* JADX INFO: renamed from: g */
    public final i00 f1986g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f1987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230fn(Activity activity, i00 i00Var, ViewGroup viewGroup, InterfaceC0444ld interfaceC0444ld) {
        String str;
        super(interfaceC0444ld);
        this.f1985f = activity;
        this.f1986g = i00Var;
        this.f1987h = viewGroup;
        Integer numDecode = null;
        int iM3103 = C1050.m3103("ۦۡۦ");
        while (true) {
            switch (iM3103) {
                case 1747655:
                    numDecode = Integer.decode(C1040.m3063("eaCXPKIas3VonK1RxnELi"));
                    if (C1008.f5652 + (C1023.f5667 - 5715) >= 0) {
                        C0993.m2877();
                        str = "۠۟ۦ";
                    } else {
                        str = "ۡۧۦ";
                    }
                    iM3103 = C1014.m2960(str);
                    continue;
                case 1747743:
                    break;
                case 1748864:
                    System.out.println(numDecode);
                    iM3103 = (C1029.f5673 * C1026.f5670) + 1579758;
                    continue;
                case 1751647:
                    iM3103 = C0998.m2896("ۦۡۦ");
                    continue;
                case 1753483:
                    if (C0992.m2870() <= 0) {
                        iM3103 = (C1045.f5689 | C0989.f5633) ^ (-1747536);
                    }
                    break;
                case 1755526:
                    return;
            }
            iM3103 = (C1052.f5696 * C1035.f5679) + 1705366;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0444ld mo471a(InterfaceC0444ld interfaceC0444ld) {
        int iM3058 = C1039.m3058("ۤۡۤ");
        i00 i00Var = null;
        ViewGroup viewGroup = null;
        while (true) {
            switch (iM3058) {
                case 56507:
                    ViewGroup viewGroup2 = this.f1987h;
                    iM3058 = (-1754035) ^ (C1013.f5657 % C0990.f5634);
                    viewGroup = viewGroup2;
                    break;
                case 1751559:
                    i00Var = this.f1986g;
                    iM3058 = (C1047.f5691 - C0998.f5642) + 56144;
                    break;
                case 1753574:
                    iM3058 = (C1027.f5671 | (C1015.f5659 / (-2767))) > 0 ? (C1022.f5666 / C1034.f5678) + 1751557 : C0986.m2848("ۧ۟");
                    break;
                case 1753608:
                    return new C0230fn(this.f1985f, i00Var, viewGroup, interfaceC0444ld);
            }
        }
    }

    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    public final Object mo472e(Object obj, Object obj2) {
        int iM3021 = C1030.m3021("ۤۤۦ");
        while (true) {
            switch (iM3021) {
                case 56478:
                    iM3021 = C0991.m2869(C1057.f5701 >= 0 ? "۠ۥۤ" : "ۤۤۦ");
                    break;
                case 1751654:
                    iM3021 = (C1035.f5679 - C1004.f5648) + 1755616;
                    break;
                case 1755466:
                    return ((C0230fn) mo471a((InterfaceC0444ld) obj2)).mo473g(C0819vh.f4855n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x017a A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo473g(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0230fn.mo473g(java.lang.Object):java.lang.Object");
    }
}
