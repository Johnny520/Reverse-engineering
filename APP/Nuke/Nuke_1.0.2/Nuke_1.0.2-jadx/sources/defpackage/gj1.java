package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends vj implements w70 {
    public static final gj1 d = new gj1(true);
    public static final String e = "MsgLongClickMenu";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(ej1.b);
        arrayList.add(fj1.b);
        arrayList.add(cj1.b);
        arrayList.add(dj1.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        XposedBridge.hookMethod(ej1.b.e(), new kg3(this, null, new vi1(2))).getClass();
        XposedBridge.hookMethod(fj1.b.e(), new kg3(this, new vi1(3), null)).getClass();
    }
}
