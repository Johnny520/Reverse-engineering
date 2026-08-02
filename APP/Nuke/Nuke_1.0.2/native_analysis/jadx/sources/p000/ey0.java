package p000;

import android.os.Bundle;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final ey0 f2675d = new ey0(false);

    /* JADX INFO: renamed from: e */
    public static final int f2676e = R.string.increase_forwarding_limit;

    /* JADX INFO: renamed from: f */
    public static final int f2677f = R.string.increase_forwarding_limit_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f2678g = wm0.f12576j;

    /* JADX INFO: renamed from: h */
    public static final String f2679h = "IncreaseForwardingLimit";

    /* JADX INFO: renamed from: i */
    public static XC_MethodHook.Unhook f2680i;

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f2679h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Class cls;
        sg1 sg1VarM3244v = op0.m3602y(up0.m5529H("com.tencent.mm.ui.mvvm.MvvmContactListUI")).m3244v();
        sg1VarM3244v.f13871b = "onCreate";
        cls = Bundle.class;
        Class<Bundle> clsM3691A = p40.m3691A(d72.m967a(cls));
        sg1VarM3244v.m4864d(clsM3691A != null ? clsM3691A : Bundle.class);
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, new kg3(this, new nx0(2), null));
        unhookHookMethod.getClass();
        f2680i = unhookHookMethod;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        XC_MethodHook.Unhook unhook = f2680i;
        f2680i = null;
        if (unhook != null) {
            unhook.unhook();
        }
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f2677f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f2676e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f2678g;
    }
}
