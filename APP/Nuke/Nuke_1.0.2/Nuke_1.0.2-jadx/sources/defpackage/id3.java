package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id3 extends tb1 {
    public static final id3 e = new id3();
    public static final String f = "WeMsgListener";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        bj1.d.getClass();
        Method method = (Method) bj1.g.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new yb3(18))).getClass();
    }
}
