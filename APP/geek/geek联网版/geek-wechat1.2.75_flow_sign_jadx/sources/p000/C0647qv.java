package p000;

import android.app.C0986;
import android.window.C0988;
import androidx.activity.C0996;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1000;
import androidx.legacy.content.C1014;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.theme.C1042;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;

/* JADX INFO: renamed from: qv */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0647qv implements InterfaceC0379jm {

    /* JADX INFO: renamed from: a */
    public final int f3975a;

    /* JADX INFO: renamed from: b */
    public final Object f3976b;

    /* JADX INFO: renamed from: c */
    public final Object f3977c;

    /* JADX INFO: renamed from: d */
    public final Object f3978d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    public /* synthetic */ C0647qv(Object obj, Object obj2, Object obj3, int i) {
        String str;
        this.f3975a = i;
        this.f3976b = obj;
        this.f3977c = obj2;
        this.f3978d = obj3;
        Float fDecode = null;
        int iM2885 = C0993.m2885("ۦۥ۟");
        while (true) {
            switch (iM2885) {
                case 1748770:
                    break;
                case 1750628:
                    if (C1049.m3105() > 0) {
                        iM2885 = (C1000.f5647 % C1034.f5681) + 1753481;
                    } else {
                        C1020.m2990();
                        str = "۟ۡۥ";
                        iM2885 = C0988.m2863(str);
                    }
                    break;
                case 1752484:
                    str = "ۡۤۥ";
                    iM2885 = C0988.m2863(str);
                    break;
                case 1753600:
                    if (C1042.m3080() > 0) {
                        str = "ۡۤۥ";
                        iM2885 = C0988.m2863(str);
                    } else {
                        iM2885 = (C1045.f5692 / C0996.f5643) ^ (-1754592);
                    }
                    break;
                case 1754623:
                    fDecode = Float.decode(C0996.m2895("4DP"));
                    if (C1018.f5665 > 0) {
                        str = "ۨۤۨ";
                        iM2885 = C0988.m2863(str);
                    } else {
                        iM2885 = C0986.m2856("ۨۤۨ");
                    }
                    break;
                case 1755500:
                    System.out.println(fDecode);
                    iM2885 = (C1014.f5661 | (C1050.f5697 % (-7560))) <= 0 ? C1039.m3067("ۦۥ۟") : (C0994.f5641 | C1019.f5666) ^ (-1748803);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0843 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x086a  */
    @Override // p000.InterfaceC0379jm
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo474a() {
        /*
            Method dump skipped, instruction units count: 2368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0647qv.mo474a():java.lang.Object");
    }
}
