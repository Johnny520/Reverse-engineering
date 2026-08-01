package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.widget.C0025;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.savedstate.C0035;
import androidx.versionedparcelable.C0041;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.chip.C0057;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy {
    public static final Map a = null;
    public static final Set b = null;
    public static final ConcurrentHashMap c = null;
    public static int d;
    public static int e;
    public static float f;
    public static final i00 g = null;
    public static final ay h = null;

    static {
        int r0 = C0061.m246("ۣۡ۟");
    L3:
        switch(r0) {
            case 56359: goto L6;
            case 56449: goto L10;
            case 56571: goto L8;
            case 1747774: goto L19;
            case 1748733: goto L31;
            case 1749827: goto L24;
            case 1750602: goto L35;
            case 1750780: goto L16;
            case 1751748: goto L27;
            case 1752615: goto L39;
            default: goto L3;
        };
    L6:
        if (C0069.m276() >= 0) goto L7;
        r0 = (C0015.f15 | C0041.f41) + 1749290;
        goto L3
    L7:
        C0057.m230();
        r0 = C0045.m182("ۧ۟");
        goto L3
    L8:
        e = -1;
        String r02 = "ۤۥ";
    L9:
        r0 = C0001.m5(r02);
        goto L3
    L10:
        f = -1.0f;
        if (C0004.f4 >= 0) goto L12;
        r0 = (C0069.f69 | C0009.f9) + 1749862;
        goto L3
    L12:
        String r03 = "ۡۨ";
    L13:
        r0 = C0047.m189(r03);
        goto L3
    L16:
        b = Collections.newSetFromMap(new ConcurrentHashMap());
        if (C0008.m33() <= 0) goto L18;
    L29:
        r0 = C0063.m254("ۤۧۧ");
        goto L3
    L18:
        C0008.f8 = 54;
        r0 = C0065.m263("ۢۧۨ");
        goto L3
    L19:
        h = new ay(0);
        if (C0013.f13 >= 0) goto L21;
        r0 = (C0035.f35 | C0008.f8) + 1753002;
        goto L3
    L21:
        C0064.f64 = 85;
    L22:
        r0 = C0007.m28("ۣ۠ۡ");
        goto L3
    L24:
        g = new i00(u40.a("UusOPfE9PIR6A/DiY6FNhSIB9/wVqEzhVAKC7Q==\n", "CSmr0k6YYdg=\n"));
        if (C0006.m24() > 0) goto L22;
        C0047.m191();
        r0 = C0022.m90("ۥۤۦ");
        goto L3
    L27:
        c = new ConcurrentHashMap();
        if ((C0025.f25 % (C0070.f70 - 9687)) >= 0) goto L29;
        r03 = "ۣۡۨ";
        goto L13
    L31:
        a = Collections.synchronizedMap(new WeakHashMap());
        if (C0048.m194() <= 0) goto L33;
        r0 = C0028.m114("ۣۧ۠");
        goto L3
    L33:
        C0004.m18();
        r02 = "ۣۡ۟";
        goto L9
    L35:
        d = -1;
        if ((C0030.f30 * (C0066.f66 | (-387))) < 0) goto L38;
        C0000.m0();
        r0 = C0046.m186("ۤۥ");
        goto L3
    L38:
        r02 = "ۣۨ";
        goto L9
    }
}
