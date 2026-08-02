package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 extends gx2 implements w70 {
    public static final cl0 d = new cl0(false);
    public static final int e = R.string.focus_pad_mode;
    public static final String f = "FocusPadMode";
    public static final boolean g = true;
    public static final wm0 h = wm0.n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(he.h);
        arrayList.add(he.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean c() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        he heVar = he.i;
        heVar.getClass();
        Method methodE = heVar.e();
        gs gsVar = new gs(22);
        cl0 cl0Var = d;
        XposedBridge.hookMethod(methodE, new kg3(cl0Var, gsVar, null)).getClass();
        he heVar2 = he.h;
        heVar2.getClass();
        XposedBridge.hookMethod(heVar2.e(), new kg3(cl0Var, new gs(21), null)).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return h;
    }
}
