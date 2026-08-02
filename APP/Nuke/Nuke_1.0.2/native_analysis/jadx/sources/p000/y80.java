package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final y80 f13342d = new y80(true);

    /* JADX INFO: renamed from: e */
    public static final int f13343e = R.string.disable_typing_status;

    /* JADX INFO: renamed from: f */
    public static final int f13344f = R.string.disable_typing_status_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f13345g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f13346h = "DisableTypingStatus";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f13346h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        ln1.f6218d.getClass();
        sg1 sg1VarM3244v = op0.m3602y((Class) ln1.f6220f.getValue()).m3244v();
        sg1VarM3244v.f13871b = "doScene";
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new C0251gs(12), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f13344f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f13343e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f13345g;
    }
}
