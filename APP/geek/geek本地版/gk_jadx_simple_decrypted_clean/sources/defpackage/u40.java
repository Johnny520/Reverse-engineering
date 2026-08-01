package defpackage;

import android.app.C0002;
import androidx.activity.C0011;
import androidx.coordinatorlayout.widget.C0022;
import androidx.savedstate.C0034;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0040;
import com.github.megatronking.stringfog.Base64;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.theme.C0062;

/* JADX INFO: loaded from: classes.dex */
public abstract class u40 {
    public static final StringFogImpl a = null;

    static {
        a = new StringFogImpl();
    }

    public static String a(String r5, String r6) {
        int r3 = C0059.m239("ۣۧۥ");
        byte[] r1 = null;
        byte[] r2 = null;
    L3:
        switch(r3) {
            case 1749573: goto L5;
            case 1749765: goto L10;
            case 1752520: goto L16;
            case 1754505: goto L6;
            default: goto L3;
        };
    L5:
        r3 = (C0034.f34 % C0048.f48) + 1754521;
        goto L3
    L6:
        byte[] r0 = Base64.decode(r5, 0);
        if ((C0058.f58 % (C0044.f44 * (-1381))) <= 0) goto L8;
        r3 = 1749390 + (C0037.f37 ^ C0022.f22);
        r1 = r0;
        goto L3
    L8:
        C0040.f40 = 78;
        r3 = C0002.m8("ۣۧۥ");
        r1 = r0;
        goto L3
    L10:
        r2 = Base64.decode(r6, 0);
        if (C0062.f62 < 0) goto L14;
        String r02 = "ۢ۟ۢ";
    L13:
        r3 = C0011.m45(r02);
        goto L3
    L14:
        r02 = "ۥۡۤ";
        goto L13
    L16:
        return a.decrypt(r1, r2);
    }
}
