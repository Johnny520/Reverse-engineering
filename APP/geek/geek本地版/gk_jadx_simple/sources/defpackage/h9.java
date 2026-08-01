package defpackage;

import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0020;
import androidx.fragment.app.C0027;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.savedstate.C0034;
import androidx.versionedparcelable.C0041;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.carousel.C0052;
import com.google.android.material.chip.C0056;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends ThreadLocal {
    public final int a;

    public /* synthetic */ h9(int r4) {
        this.a = r4;
        int r2 = C0010.m43("ۧ۟ۢ");
        Integer r1 = null;
    L3:
        switch(r2) {
            case 56292: goto L5;
            case 1746727: goto L17;
            case 1747777: goto L12;
            case 1749666: goto L6;
            case 1749789: goto L15;
            case 1754378: goto L21;
            default: goto L3;
        };
    L5:
        return;
    L6:
        System.out.println(r1);
        if (C0064.m257() < 0) goto L10;
        String r0 = "ۣ۠ۤ";
    L9:
        r2 = C0046.m186(r0);
        goto L3
    L10:
        r0 = "ۣ۟";
        goto L9
    L12:
        if (C0044.f44 <= 0) goto L13;
        r2 = (C0045.f45 | C0052.f52) + 1754673;
        goto L3
    L13:
        r2 = C0059.m239("۠۟");
        goto L3
    L15:
        Integer r02 = Integer.decode(C0041.m165("MNpbvepmspXqYzuYsMIZ7cO049"));
        r2 = 2140640 + (C0013.f13 * C0003.f3);
        r1 = r02;
    L17:
        if ((C0027.f27 * (C0065.f65 * (-6089))) <= 0) goto L18;
        r2 = (C0043.f43 % C0034.f34) ^ 55998;
        goto L3
    L18:
        C0018.m75();
        r2 = C0012.m50("ۡۧ");
        goto L3
    L21:
        if (C0031.m124() > 0) goto L17;
        if ((C0061.f61 + (C0056.f56 ^ (-4024))) <= 0) goto L24;
        r2 = (C0011.f11 | C0010.f10) ^ (-1749950);
        goto L3
    L24:
        C0020.f20 = 42;
        r2 = C0072.m288("۟۠ۨ");
        goto L3
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int r0 = C0030.m120("ۦۡۤ");
    L3:
        switch(r0) {
            case 1746941: goto L6;
            case 1747773: goto L32;
            case 1752462: goto L7;
            case 1752706: goto L10;
            case 1753481: goto L9;
            case 1754499: goto L13;
            default: goto L3;
        };
    L6:
        return new Random();
    L7:
        r0 = (C0034.f34 * C0015.f15) ^ 1483088;
        goto L3
    L9:
        switch(this.a) {
            case 0: goto L13;
            default: goto L10;
        };
    L10:
        r0 = (C0031.f31 | C0002.f2) ^ (-1746944);
        goto L3
    L32:
        return new SimpleDateFormat(u40.a("PK9V5pbxePM=\n", "dOdvi/vLC4A=\n"), Locale.CHINA);
    L13:
        if (C0015.m61() <= 0) goto L14;
        r0 = (C0009.f9 % C0032.f32) ^ (-1747822);
        goto L3
    L14:
        C0034.f34 = 83;
        r0 = C0004.m16("ۤۤ۟");
        goto L3
    }
}
