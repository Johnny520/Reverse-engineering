package defpackage;

import androidx.lifecycle.C0029;
import com.github.megatronking.stringfog.annotation.C0044;
import com.google.android.material.appbar.C0049;
import com.google.android.material.chip.C0057;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.theme.C0063;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;

/* JADX INFO: loaded from: classes.dex */
public final class ms extends XC_MethodReplacement {
    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam r3) {
        int r0 = C0029.m116("ۣۣۤ");
    L3:
        switch(r0) {
            case 1746690: goto L6;
            case 1746783: goto L8;
            case 1750660: goto L12;
            default: goto L3;
        };
    L6:
        return Boolean.TRUE;
    L8:
        if (C0057.m230() < 0) goto L11;
        C0060.m240();
        String r02 = "ۣۢۥ";
    L10:
        r0 = C0063.m254(r02);
        goto L3
    L11:
        r02 = "ۣۣۤ";
        goto L10
    L12:
        ip.o("param", r3);
        r0 = (C0044.f44 | C0049.f49) + 1746315;
        goto L3
    }
}
