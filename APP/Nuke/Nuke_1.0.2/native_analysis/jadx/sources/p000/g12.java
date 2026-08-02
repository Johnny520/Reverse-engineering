package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g12 extends AbstractC0812vj {

    /* JADX INFO: renamed from: d */
    public static final g12 f3248d = new g12(true);

    /* JADX INFO: renamed from: e */
    public static final String f3249e = "PlusMenuInjector";

    /* JADX INFO: renamed from: f */
    public static final boolean f3250f = true;

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: b */
    public final boolean mo1778b() {
        return f3250f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f3249e;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        sg1 sg1VarM3244v = op0.m3602y(up0.m5529H("com.tencent.widget.PopupMenuDialog")).m3244v();
        sg1VarM3244v.f13871b = "createAndAttachItemsView";
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new eq1(11), null)).getClass();
        sg1 sg1VarM3244v2 = op0.m3602y(up0.m5529H("com.tencent.widget.PopupMenuDialog")).m3244v();
        sg1VarM3244v2.f13871b = "onClick";
        Method method2 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).f13895j;
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new eq1(12), null)).getClass();
    }
}
