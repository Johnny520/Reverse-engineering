package com.ljx.wechatmod.auth;

import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0998;
import androidx.core.widget.C1011;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.internal.C1038;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1053;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: loaded from: classes.dex */
public final class StringFog {
    public static final StringFog INSTANCE = new StringFog();

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    private StringFog() {
        String str;
        double d = 0.0d;
        int iM3027 = C1029.m3027("ۣۧۦ");
        while (true) {
            switch (iM3027) {
                case 1748741:
                    System.out.println(d);
                    iM3027 = (C1035.f5682 % C0994.f5641) + 1754514;
                    break;
                case 1748866:
                    if (C1011.f5658 < 0) {
                        iM3027 = C1053.f5700 + C1054.f5701 + 1751111;
                    } else {
                        C1046.m3094();
                        str = "ۤۢ۟";
                        iM3027 = C1049.m3104(str);
                    }
                    break;
                case 1749852:
                    str = "ۧۡ۠";
                    iM3027 = C1049.m3104(str);
                    break;
                case 1750786:
                    if (C0998.m2903() > 0) {
                        str = "ۧۡ۠";
                        iM3027 = C1049.m3104(str);
                    } else if (C1056.f5703 <= 0) {
                        C1034.m3049();
                        iM3027 = C1043.m763("ۢۨۢ");
                    } else {
                        iM3027 = C1018.m2984("ۤۡۡ");
                    }
                    break;
                case 1751556:
                    d = Double.parseDouble(C1040.m3073("y74Q4AYeDwUN9A8"));
                    if (C1053.m3123() >= 0) {
                        C0993.m2882();
                        iM3027 = C1042.m3078("ۣۧۦ");
                    } else {
                        iM3027 = (C1011.f5658 - C1038.f5685) + 1748898;
                    }
                    break;
                case 1754438:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String decrypt(java.lang.String r11, int r12) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ljx.wechatmod.auth.StringFog.decrypt(java.lang.String, int):java.lang.String");
    }
}
