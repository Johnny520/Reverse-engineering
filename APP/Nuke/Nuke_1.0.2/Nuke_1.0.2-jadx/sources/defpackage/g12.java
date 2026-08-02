package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g12 extends vj {
    public static final g12 d = new g12(true);
    public static final String e = "PlusMenuInjector";
    public static final boolean f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean b() {
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        sg1 sg1VarV = op0.y(up0.H("com.tencent.widget.PopupMenuDialog")).v();
        sg1VarV.b = "createAndAttachItemsView";
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new eq1(11), null)).getClass();
        sg1 sg1VarV2 = op0.y(up0.H("com.tencent.widget.PopupMenuDialog")).v();
        sg1VarV2.b = "onClick";
        Method method2 = ((zg1) du.o0(sg1VarV2.c())).j;
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new eq1(12), null)).getClass();
    }
}
