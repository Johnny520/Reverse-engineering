package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 extends gx2 {
    public static final y80 d = new y80(true);
    public static final int e = R.string.disable_typing_status;
    public static final int f = R.string.disable_typing_status_description;
    public static final wm0 g = wm0.i;
    public static final String h = "DisableTypingStatus";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        ln1.d.getClass();
        sg1 sg1VarV = op0.y((Class) ln1.f.getValue()).v();
        sg1VarV.b = "doScene";
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new gs(12), null)).getClass();
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
