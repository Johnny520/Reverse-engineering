package p000;

import android.content.Context;
import android.widget.BaseAdapter;
import android.window.C0988;
import android.window.C0990;
import androidx.activity.C0995;
import androidx.activity.result.C0992;
import androidx.activity.result.C0993;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1009;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import io.fastkv.C1053;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: vv */
/* JADX INFO: loaded from: classes.dex */
public final class C0832vv extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Context f5004a;

    /* JADX INFO: renamed from: b */
    public List f5005b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f5006c;

    /* JADX INFO: renamed from: d */
    public final C0721sv f5007d;

    /* JADX INFO: renamed from: e */
    public final C0907xv f5008e;

    /* JADX INFO: renamed from: f */
    public final boolean f5009f;

    /* JADX INFO: renamed from: g */
    public final C0647qv f5010g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f5011h;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x003c. Please report as an issue. */
    public C0832vv(Context context, ArrayList arrayList, LinkedHashSet linkedHashSet, C0721sv c0721sv, C0721sv c0721sv2, C0907xv c0907xv, boolean z, C0647qv c0647qv) {
        String str;
        "context";
        "dataList";
        "selectedSet";
        "dp";
        "dpf";
        "theme";
        "onSelectChange";
        int iM2931 = C1005.m2931("ۦ۟ۦ");
        Float f = null;
        while (true) {
            switch (iM2931) {
                case 56448:
                    if (C1047.m3099() < 0) {
                        iM2931 = (C0998.f5645 - C0995.f5642) + 1753902;
                    } else {
                        C0993.m2882();
                        str = "ۤۥۢ";
                        iM2931 = C1041.m3074(str);
                    }
                    break;
                case 1746784:
                    break;
                case 1746851:
                    System.out.println(f);
                    break;
                case 1746913:
                    this.f5005b = arrayList;
                    if ((C1029.f5676 ^ (C1026.f5673 / 295)) >= 0) {
                        C1023.m3003();
                        iM2931 = C0988.m2863("۠ۨ۟");
                    } else {
                        iM2931 = C1043.m763("۠ۥ۟");
                    }
                    break;
                case 1746936:
                    this.f5008e = c0907xv;
                    if (C1059.f5706 >= 0) {
                        C1015.m2972();
                        iM2931 = C1055.m3131("ۦ۟ۦ");
                    } else {
                        iM2931 = (C0995.f5642 ^ C1037.f5684) + 1751564;
                    }
                    break;
                case 1747714:
                    str = "ۣ۟ۢ";
                    iM2931 = C1041.m3074(str);
                    break;
                case 1747834:
                    this.f5006c = linkedHashSet;
                    iM2931 = (C1054.f5701 | C1010.f5657) ^ (-1752298);
                    break;
                case 1747927:
                    this.f5010g = c0647qv;
                    iM2931 = C1026.f5673 / (C1041.f5688 ^ (-2614)) == 0 ? C0992.m2881("ۦۣۦ") : C1050.m3111("ۣ۟ۢ");
                    break;
                case 1752485:
                    this.f5009f = z;
                    if (C1053.m3123() < 0) {
                        iM2931 = (C1027.f5674 | C1030.f5677) + 1747416;
                    } else {
                        C0997.f5644 = 95;
                        iM2931 = C1011.m2955("ۨۤۧ");
                    }
                    break;
                case 1752553:
                    this.f5007d = c0721sv;
                    iM2931 = C1021.m2995() >= 0 ? C1018.m2984("ۤۤ") : (C0990.f5637 % C1009.f5656) + 1746854;
                    break;
                case 1753421:
                    this.f5004a = context;
                    if (C1005.m2933() < 0) {
                        iM2931 = C1058.m3140("۟ۦۨ");
                    } else {
                        C1018.m2982();
                        iM2931 = C1049.m3104("ۥۢۦ");
                    }
                    break;
                case 1753545:
                    this.f5011h = new ConcurrentHashMap();
                    if ((C1042.f5689 | (C1049.f5696 ^ (-546))) > 0) {
                        str = "ۨ۠ۧ";
                        iM2931 = C1041.m3074(str);
                    } else {
                        C1034.f5681 = 0;
                    }
                    break;
                case 1755375:
                    if (C1058.m3141() > 0) {
                        str = "ۣ۟ۢ";
                        iM2931 = C1041.m3074(str);
                    } else if (C1008.m2943() < 0) {
                        iM2931 = C1011.m2955("ۨۤۧ");
                    } else {
                        C1000.f5647 = 91;
                        iM2931 = C1058.m3140("۟ۦۨ");
                    }
                    break;
                case 1755499:
                    Float fDecode = Float.decode(C1001.m2915("Nh2mxXhhYDwOuw9OenZe"));
                    if (C1029.f5676 * C1008.f5655 * (-2838) >= 0) {
                        C0992.m2879();
                        iM2931 = C1020.m2993("ۥ۠۠");
                        f = fDecode;
                    } else {
                        iM2931 = 1747108 + (C1004.f5651 | C1023.f5670);
                        f = fDecode;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5005b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int iM3057 = C1036.m3057("۠ۨۨ");
        while (true) {
            switch (iM3057) {
                case 1747936:
                    return this.f5005b.get(i);
                case 1750563:
                    iM3057 = C1055.m3130() < 0 ? (C1033.f5680 % C1026.f5673) + 1747859 : C1040.m3072("۠ۡ");
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        int iM2885 = C0993.m2885("ۣۥۦ");
        while (true) {
            switch (iM2885) {
                case 1747843:
                    if ((C1029.f5676 ^ (C1057.f5704 / 429)) < 0) {
                        iM2885 = (C1042.f5689 * C1010.f5657) ^ (-1615468);
                    } else {
                        C1052.f5699 = 78;
                        iM2885 = C1017.m2981("۟۟ۥ");
                    }
                    break;
                case 1750724:
                    return i;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0557 A[SYNTHETIC] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r64, android.view.View r65, android.view.ViewGroup r66) {
        /*
            Method dump skipped, instruction units count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0832vv.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
