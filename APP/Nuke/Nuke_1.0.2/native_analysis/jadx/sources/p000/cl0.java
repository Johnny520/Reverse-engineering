package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 extends gx2 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final cl0 f1609d = new cl0(false);

    /* JADX INFO: renamed from: e */
    public static final int f1610e = R.string.focus_pad_mode;

    /* JADX INFO: renamed from: f */
    public static final String f1611f = "FocusPadMode";

    /* JADX INFO: renamed from: g */
    public static final boolean f1612g = true;

    /* JADX INFO: renamed from: h */
    public static final wm0 f1613h = wm0.f12580n;

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(C0274he.f3969h);
        arrayList.add(C0274he.f3970i);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: c */
    public final boolean mo849c() {
        return f1612g;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f1611f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        C0274he c0274he = C0274he.f3970i;
        c0274he.getClass();
        Method methodM5640e = c0274he.m5640e();
        C0251gs c0251gs = new C0251gs(22);
        cl0 cl0Var = f1609d;
        XposedBridge.hookMethod(methodM5640e, new kg3(cl0Var, c0251gs, null)).getClass();
        C0274he c0274he2 = C0274he.f3969h;
        c0274he2.getClass();
        XposedBridge.hookMethod(c0274he2.m5640e(), new kg3(cl0Var, new C0251gs(21), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f1610e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f1613h;
    }
}
