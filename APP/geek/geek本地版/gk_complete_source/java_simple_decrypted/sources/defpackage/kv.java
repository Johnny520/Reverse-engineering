package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.content.Context;
import android.support.v4.graphics.drawable.C0006;
import androidx.activity.result.C0008;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.savedstate.C0035;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0042;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.floatingactionbutton.C0060;
import com.ljx.wechatmod.auth.C0065;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv implements sm {
    public final int a;
    public final Context b;

    public /* synthetic */ kv(Context r4, int r5) {
        this.a = r5;
        this.b = r4;
        int r2 = C0022.m90("ۧۥۢ");
        Integer r1 = null;
    L3:
        switch(r2) {
            case 56351: goto L6;
            case 56389: goto L11;
            case 1753574: goto L25;
            case 1753604: goto L21;
            case 1754564: goto L16;
            case 1755495: goto L26;
            default: goto L3;
        };
    L6:
        if (C0065.f65 < 0) goto L9;
        C0002.m10();
        String r0 = "ۣۥۣ";
    L8:
        r2 = C0000.m2(r0);
        goto L3
    L9:
        r0 = "ۧۥۢ";
    L11:
        if (C0029.m118() > 0) goto L14;
        C0027.m111();
        String r02 = "۟ۧ۟";
    L13:
        r2 = C0003.m13(r02);
        goto L3
    L14:
        r0 = "ۣۨۤ";
        goto L8
    L16:
        if (C0054.m217() < 0) goto L11;
        if ((C0006.f6 ^ (C0023.f23 ^ 7166)) > 0) goto L20;
        C0038.f38 = 99;
    L20:
        r2 = C0001.m5("ۦۤۤ");
        goto L3
    L21:
        System.out.println(r1);
        if (C0042.f42 < 0) goto L24;
        C0027.m111();
        r2 = C0001.m5("ۧۥۢ");
        goto L3
    L24:
        r02 = "ۣۨۤ";
        goto L13
    L25:
        Integer r03 = Integer.valueOf(C0055.m222("fqvllKtCK2AL76O"));
        r2 = 1754224 + (C0037.f37 % C0035.f35);
        r1 = r03;
        goto L3
    }

    @Override // defpackage.sm
    public final Object f(Object r3) {
        int r0 = C0069.m277("ۥۨ۟");
    L3:
        switch(r0) {
            case 56418: goto L6;
            case 1749733: goto L29;
            case 1752644: goto L10;
            case 1752732: goto L9;
            case 1753632: goto L16;
            case 1755494: goto L12;
            default: goto L3;
        };
    L6:
        return Float.valueOf(((Float) r3).floatValue() * this.b.getResources().getDisplayMetrics().density);
    L29:
        return Integer.valueOf((int) (((Integer) r3).intValue() * this.b.getResources().getDisplayMetrics().density));
    L9:
        switch(this.a) {
            case 0: goto L16;
            default: goto L10;
        };
    L10:
        r0 = (C0001.f1 * C0008.f8) ^ 153033;
        goto L3
    L12:
        if (C0072.m289() > 0) goto L15;
        C0073.m295();
        String r02 = "ۣۤۥ";
    L14:
        r0 = C0060.m241(r02);
        goto L3
    L15:
        r02 = "ۥۨ۟";
    L16:
        r02 = "ۢۤۧ";
        goto L14
    }
}
