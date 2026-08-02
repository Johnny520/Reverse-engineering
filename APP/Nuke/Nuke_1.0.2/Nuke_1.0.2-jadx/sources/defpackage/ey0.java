package defpackage;

import android.os.Bundle;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 extends gx2 {
    public static final ey0 d = new ey0(false);
    public static final int e = R.string.increase_forwarding_limit;
    public static final int f = R.string.increase_forwarding_limit_description;
    public static final wm0 g = wm0.j;
    public static final String h = "IncreaseForwardingLimit";
    public static XC_MethodHook.Unhook i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Class cls;
        sg1 sg1VarV = op0.y(up0.H("com.tencent.mm.ui.mvvm.MvvmContactListUI")).v();
        sg1VarV.b = "onCreate";
        cls = Bundle.class;
        Class<Bundle> clsA = p40.A(d72.a(cls));
        sg1VarV.d(clsA != null ? clsA : Bundle.class);
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, new kg3(this, new nx0(2), null));
        unhookHookMethod.getClass();
        i = unhookHookMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        XC_MethodHook.Unhook unhook = i;
        i = null;
        if (unhook != null) {
            unhook.unhook();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }
}
