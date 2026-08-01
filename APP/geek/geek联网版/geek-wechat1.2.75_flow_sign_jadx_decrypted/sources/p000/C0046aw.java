package p000;

import android.app.Dialog;
import android.content.Context;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.result.C0992;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1000;
import androidx.core.app.C1005;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1053;
import java.util.LinkedHashSet;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0046aw extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public int f638e;

    /* JADX INFO: renamed from: f */
    public final Dialog f639f;

    /* JADX INFO: renamed from: g */
    public final Context f640g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f641h;

    /* JADX INFO: renamed from: i */
    public final ClassLoader f642i;

    /* JADX INFO: renamed from: j */
    public final String f643j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046aw(Dialog dialog, Context context, LinkedHashSet linkedHashSet, ClassLoader classLoader, String str, InterfaceC0814vd interfaceC0814vd) {
        String str2;
        super(interfaceC0814vd);
        this.f639f = dialog;
        this.f640g = context;
        this.f641h = linkedHashSet;
        this.f642i = classLoader;
        this.f643j = str;
        Double dValueOf = null;
        int iM3085 = C1044.m3085("ۨۦۡ");
        while (true) {
            switch (iM3085) {
                case 56538:
                    iM3085 = (C1045.f5692 - C1049.f5696) + 1755983;
                    continue;
                case 1746913:
                    return;
                case 1749607:
                    System.out.println(dValueOf);
                    iM3085 = C1016.m2975("۟ۦۨ");
                    continue;
                case 1751681:
                    dValueOf = Double.valueOf(C1013.m2963("eIoDLgkTNOt4eYX7iV"));
                    iM3085 = C1013.m2965(C1000.f5647 <= 0 ? "ۧۡ" : "ۢ۠ۥ");
                    continue;
                case 1754414:
                    break;
                case 1755555:
                    if (C1021.m2995() >= 0) {
                        if (C0992.m2879() >= 0) {
                            C1053.m3123();
                            str2 = "ۧ۠ۧ";
                        } else {
                            str2 = "ۤۥۢ";
                        }
                        iM3085 = C0994.m2889(str2);
                    }
                    break;
            }
            iM3085 = (C1019.f5666 ^ C0991.f5638) ^ (-1746171);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        String str;
        int iM3009 = C1024.m3009("ۣ۠۟");
        String str2 = null;
        ClassLoader classLoader = null;
        while (true) {
            switch (iM3009) {
                case 1750562:
                    classLoader = this.f642i;
                    str = "ۦۦۡ";
                    iM3009 = C1027.m3021(str);
                    break;
                case 1752462:
                    if (C1056.m3134() < 0) {
                        iM3009 = (C1029.f5676 % C1037.f5684) + 1751067;
                    } else {
                        str = "ۥۡ۟";
                        iM3009 = C1027.m3021(str);
                    }
                    break;
                case 1753633:
                    str2 = this.f643j;
                    str = "ۧۤۡ";
                    iM3009 = C1027.m3021(str);
                    break;
                case 1754532:
                    break;
            }
            return new C0046aw(this.f639f, this.f640g, this.f641h, classLoader, str2, interfaceC0814vd);
        }
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) {
        int iM2931 = C1005.m2931("ۢۥۧ");
        while (true) {
            switch (iM2931) {
                case 1746845:
                    iM2931 = C1023.f5670 < 0 ? (C1036.f5683 + C1000.f5647) ^ 1749157 : C0995.m2891("۠۟ۤ");
                    break;
                case 1749764:
                    iM2931 = (C1049.f5696 - C1017.f5664) + 1751655;
                    break;
                case 1751774:
                    return ((C0046aw) mo35a((InterfaceC0814vd) obj2)).mo37g(C0893xh.f5258n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0046aw.mo37g(java.lang.Object):java.lang.Object");
    }
}
