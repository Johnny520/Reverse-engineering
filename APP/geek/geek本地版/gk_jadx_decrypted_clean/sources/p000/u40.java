package p000;

import android.app.C0988;
import androidx.activity.C0997;
import androidx.coordinatorlayout.widget.C1008;
import androidx.savedstate.C1020;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1026;
import com.github.megatronking.stringfog.Base64;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.theme.C1048;

/* JADX INFO: loaded from: classes.dex */
public abstract class u40 {

    /* JADX INFO: renamed from: a */
    public static final StringFogImpl f4663a = new StringFogImpl();

    /* JADX INFO: renamed from: a */
    public static String m2419a(String str, String str2) {
        int iM3084 = C1045.m3084("ۣۧۥ");
        byte[] bArr = null;
        byte[] bArrDecode = null;
        while (true) {
            switch (iM3084) {
                case 1749573:
                    iM3084 = (C1020.f5664 % C1034.f5678) + 1754521;
                    break;
                case 1749765:
                    bArrDecode = Base64.decode(str2, 0);
                    iM3084 = C0997.m2891(C1048.f5692 >= 0 ? "ۢ۟ۢ" : "ۥۡۤ");
                    break;
                case 1752520:
                    return f4663a.decrypt(bArr, bArrDecode);
                case 1754505:
                    byte[] bArrDecode2 = Base64.decode(str, 0);
                    if (C1044.f5688 % (C1030.f5674 * (-1381)) > 0) {
                        iM3084 = 1749390 + (C1023.f5667 ^ C1008.f5652);
                        bArr = bArrDecode2;
                    } else {
                        C1026.f5670 = 78;
                        iM3084 = C0988.m2854("ۣۧۥ");
                        bArr = bArrDecode2;
                    }
                    break;
            }
        }
    }
}
