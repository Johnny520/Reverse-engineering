package p000;

import android.app.C0986;
import android.window.C0989;
import android.window.C0990;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.app.C1005;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1012;
import com.google.android.material.appbar.C1020;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1027;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import io.fastkv.C1052;
import java.util.Iterator;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: loaded from: classes.dex */
public final class f40 extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public int f1729e;

    /* JADX INFO: renamed from: f */
    public Iterator f1730f;

    /* JADX INFO: renamed from: g */
    public String f1731g;

    /* JADX INFO: renamed from: h */
    public Object f1732h;

    /* JADX INFO: renamed from: i */
    public long f1733i;

    /* JADX INFO: renamed from: j */
    public int f1734j;

    /* JADX INFO: renamed from: k */
    public final p00 f1735k;

    /* JADX INFO: renamed from: l */
    public final ClassLoader f1736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(p00 p00Var, ClassLoader classLoader, InterfaceC0814vd interfaceC0814vd) {
        String str;
        super(interfaceC0814vd);
        this.f1735k = p00Var;
        this.f1736l = classLoader;
        float f = 0.0f;
        int iM3042 = C1033.m3042("ۡ۠ۢ");
        while (true) {
            switch (iM3042) {
                case 1747687:
                    if (C0997.f5644 >= 0) {
                        C1002.m2921();
                        iM3042 = C1040.m3072("ۣ۟ۦ");
                    } else {
                        iM3042 = (C1005.f5652 + C1007.f5654) ^ 1748776;
                        continue;
                    }
                    break;
                case 1748643:
                    if (C1034.m3049() >= 0) {
                        if (C1003.m2923() >= 0) {
                            C1027.f5674 = 82;
                            iM3042 = C0986.m2856("ۧۦۦ");
                        } else {
                            iM3042 = (C1020.f5667 / C1020.f5667) + 1753450;
                        }
                    }
                    break;
                case 1752584:
                    return;
                case 1753451:
                    f = Float.parseFloat(C1043.m3083("qpHLnm9ZxTr9AyuOiTTS2HfW"));
                    if (C1001.m2916() >= 0) {
                        C1034.f5681 = 47;
                        str = "۠۠ۧ";
                    } else {
                        str = "ۧۤۥ";
                    }
                    iM3042 = C1037.m3059(str);
                    continue;
                case 1754536:
                    System.out.println(f);
                    if (C1009.f5656 >= 0) {
                        C1052.f5699 = 16;
                        iM3042 = C1002.m2920("ۧۤۥ");
                    } else {
                        iM3042 = (C1055.f5702 * C0999.f5646) ^ (-1791550);
                        continue;
                    }
                    break;
                case 1754599:
                    break;
            }
            if (C1041.f5688 <= 0) {
                C1005.f5652 = 50;
                iM3042 = C1001.m2914("ۣۥۥ");
            } else {
                iM3042 = (C1031.f5678 - C1052.f5699) + 1751849;
            }
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        int iM3145 = C1059.m3145("ۥۧۧ");
        while (true) {
            switch (iM3145) {
                case 1749573:
                    iM3145 = (C1057.f5704 + C1012.f5659) ^ 1753052;
                    break;
                case 1752709:
                    return new f40(this.f1735k, this.f1736l, interfaceC0814vd);
            }
        }
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) {
        int iM2885 = C0993.m2885("ۣۨ۟");
        while (true) {
            switch (iM2885) {
                case 1747716:
                    if ((C0994.f5641 | (C1024.f5671 + 8873)) > 0) {
                        iM2885 = (C1058.f5705 | C1012.f5659) + 1750941;
                    } else {
                        C0990.f5637 = 40;
                        iM2885 = C1054.m3127("ۧۡۡ");
                    }
                    break;
                case 1750810:
                    iM2885 = (C1002.f5649 ^ C0989.f5636) + 1753695;
                    break;
                case 1753546:
                    return ((f40) mo35a((InterfaceC0814vd) obj2)).mo37g(C0893xh.f5258n);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:5|(3:97|6|7)|93|8|9|99|10|11|117|(5:14|15|(1:17)(1:36)|(3:107|19|(9:109|21|22|101|23|(4:26|(3:119|28|122)(1:121)|120|24)|118|37|(24:105|39|(1:41)(1:52)|(3:43|(5:46|(1:48)(1:53)|49|(1:IC)(1:123)|44)|111)(1:110)|56|57|58|91|59|60|103|61|62|63|64|65|95|66|67|68|69|70|71|(1:73)(9:90|93|8|9|99|10|11|117|(1:12)))(1:115))(1:114))(1:113)|112)|108|(1:82)|83|124) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:5|97|6|7|93|8|9|99|10|11|117|(5:14|15|(1:17)(1:36)|(3:107|19|(9:109|21|22|101|23|(4:26|(3:119|28|122)(1:121)|120|24)|118|37|(24:105|39|(1:41)(1:52)|(3:43|(5:46|(1:48)(1:53)|49|(1:IC)(1:123)|44)|111)(1:110)|56|57|58|91|59|60|103|61|62|63|64|65|95|66|67|68|69|70|71|(1:73)(9:90|93|8|9|99|10|11|117|(1:12)))(1:115))(1:114))(1:113)|112)|108|(1:82)|83|124) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:(1:105)|39|(1:41)(1:52)|(3:43|(5:46|(1:48)(1:53)|49|(1:IC)(1:123)|44)|111)(1:110)|56|57|58|91|59|60|103|61|62|63|64|95|66|67|68|69|70|71|(1:73)(9:90|93|8|9|99|10|11|117|(1:12))) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:(1:105)|39|(1:41)(1:52)|(3:43|(5:46|(1:48)(1:53)|49|(1:IC)(1:123)|44)|111)(1:110)|56|57|58|91|59|60|103|61|62|63|64|65|95|66|67|68|69|70|71|(1:73)(9:90|93|8|9|99|10|11|117|(1:12))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:109|21|22|101|23|(4:26|(3:119|28|122)(1:121)|120|24)|118|37|(24:105|39|(1:41)(1:52)|(3:43|(5:46|(1:48)(1:53)|49|(1:IC)(1:123)|44)|111)(1:110)|56|57|58|91|59|60|103|61|62|63|64|65|95|66|67|68|69|70|71|(1:73)(9:90|93|8|9|99|10|11|117|(1:12)))(1:115)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        r2 = r4;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025b, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a3, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a4, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ff -> B:12:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02a7 -> B:93:0x0028). Please report as a decompilation issue!!! */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f40.mo37g(java.lang.Object):java.lang.Object");
    }
}
