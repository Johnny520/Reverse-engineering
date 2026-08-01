package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import androidx.activity.result.C0994;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.textfield.C1041;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;

/* JADX INFO: loaded from: classes.dex */
public final class r80 implements SensorEventListener {
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        String str;
        String strM2998 = null;
        int iM3009 = C1024.m3009("ۣۡۨ");
        while (true) {
            switch (iM3009) {
                case 1747837:
                    break;
                case 1748773:
                    iM3009 = C1057.m3139(C1034.f5681 / (C1036.f5683 + 9191) != 0 ? "ۤۦۤ" : "ۣۡۨ");
                    break;
                case 1748892:
                    if (C1049.m3105() > 0) {
                        iM3009 = (C0994.f5641 - C1012.f5659) + 1747755;
                    } else {
                        str = "ۣۨ۟";
                        iM3009 = C0994.m2889(str);
                    }
                    break;
                case 1749726:
                    iM3009 = (C0994.f5641 - C1012.f5659) + 1747755;
                    break;
                case 1755460:
                    strM2998 = C1022.m2998("H1H7Wj6tXv0CIIOkMv");
                    if (C1013.m2964() > 0) {
                        iM3009 = C1019.f5666 + C1041.f5688 + 1755383;
                    } else {
                        str = "ۢۤ۠";
                        iM3009 = C0994.m2889(str);
                    }
                    break;
                case 1755494:
                    System.out.println(strM2998);
                    if (C1018.m2982() >= 0) {
                        C1048.m3102();
                        iM3009 = C1002.m2920("ۡۤۨ");
                    } else {
                        iM3009 = C1003.m2922("۠ۥۢ");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ab A[SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r23) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r80.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
