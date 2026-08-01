package defpackage;

import android.app.C0002;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.appcompat.widget.C0014;
import androidx.constraintlayout.widget.C0019;
import androidx.core.content.C0023;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0041;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public abstract class n9 {
    public static Class a;
    public static boolean b;
    public static Boolean c;
    public static long d;
    public static final ConcurrentHashMap e = null;

    static {
        e = new ConcurrentHashMap();
    }

    public static void a(String r6, Throwable r7) {
        Float r0 = null;
        int r1 = C0011.m45("۟ۡ۟");
    L3:
        switch(r1) {
            case 56571: goto L6;
            case 1746749: goto L20;
            case 1748739: goto L38;
            case 1748896: goto L26;
            case 1750539: goto L10;
            case 1751501: goto L16;
            case 1751594: goto L22;
            case 1753453: goto L14;
            case 1754379: goto L42;
            case 1754507: goto L34;
            default: goto L3;
        };
    L6:
        if (C0026.m106() > 0) goto L16;
        if (C0054.f54 <= 0) goto L9;
        String r12 = "ۡۨۧ";
    L30:
        r1 = C0014.m57(r12);
        goto L3
    L9:
        C0066.f66 = 99;
        r1 = C0070.m281("۟ۡ۟");
        goto L3
    L10:
        System.out.println(r0);
        if (C0006.m24() <= 0) goto L12;
        r1 = (C0053.f53 ^ C0059.f59) + 1755134;
        goto L3
    L12:
        r1 = C0002.m8("ۡۨۧ");
        goto L3
    L14:
        r1 = (C0058.f58 * C0063.f63) + 1685189;
    L16:
        if (C0041.m167() > 0) goto L19;
        C0064.m257();
        String r13 = "ۦ۠ۤ";
    L18:
        r1 = C0023.m95(r13);
        goto L3
    L19:
        r13 = "ۣۧ۟";
        goto L18
    L20:
        z30.o("ttXS\n", "wrS1oN8q1Zs=\n", r6, "Dg==\n", "a4/9w+gFbuc=\n");
        r1 = (C0005.f5 / C0041.f41) + 1754507;
    L22:
        if ((C0027.f27 % (C0069.f69 * (-7507))) < 0) goto L25;
        C0053.m214();
        String r14 = "ۧ۠ۨ";
    L24:
        r1 = C0036.m144(r14);
        goto L3
    L25:
        r14 = "ۣۨ";
        goto L24
    L26:
        r0 = Float.decode(C0065.m262("GzxsWEN92Ya0cxFxuNli9"));
        if (C0036.f36 <= 0) goto L28;
        r1 = (C0028.f28 * C0019.f19) + 1803735;
        goto L3
    L28:
        C0052.f52 = 65;
    L29:
        r12 = "ۣۡۥ";
        goto L30
    L34:
        if (e.putIfAbsent(r6, Boolean.TRUE) != null) goto L22;
        if ((C0010.f10 + (C0059.f59 % 737)) < 0) goto L29;
        C0030.f30 = 64;
        r1 = C0069.m277("ۤۢۨ");
        goto L3
    L38:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", r6.concat(" (防抖)"), "Fg==\n", "c8HJlSTQVfc=\n");
        if ((C0070.f70 ^ (C0006.f6 % (-7008))) <= 0) goto L40;
        r1 = (C0071.f71 - C0028.f28) + 56622;
        goto L3
    L40:
        C0005.m20();
        r1 = C0005.m23("ۦ۠ۧ");
        goto L3
    }
}
