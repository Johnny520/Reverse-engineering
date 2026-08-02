package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ni */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0499ni extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0499ni f7160d = new C0499ni(false);

    /* JADX INFO: renamed from: e */
    public static final int f7161e = R.string.auto_win_login;

    /* JADX INFO: renamed from: f */
    public static final wm0 f7162f = wm0.f12580n;

    /* JADX INFO: renamed from: g */
    public static final String f7163g = "AutoWinLogin";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f7163g;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        sg1 sg1VarM3244v = op0.m3602y(up0.m5529H("com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI")).m3244v();
        sg1VarM3244v.f13871b = "initView";
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new C0829w(19))).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f7161e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f7162f;
    }
}
