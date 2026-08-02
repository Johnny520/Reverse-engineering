package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ni extends gx2 {
    public static final ni d = new ni(false);
    public static final int e = R.string.auto_win_login;
    public static final wm0 f = wm0.n;
    public static final String g = "AutoWinLogin";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        sg1 sg1VarV = op0.y(up0.H("com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI")).v();
        sg1VarV.b = "initView";
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new w(19))).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return f;
    }
}
