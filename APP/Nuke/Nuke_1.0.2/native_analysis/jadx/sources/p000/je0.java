package p000;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 extends gx2 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final je0 f4991d = new je0(false);

    /* JADX INFO: renamed from: e */
    public static final int f4992e = R.string.enable_round_avatar;

    /* JADX INFO: renamed from: f */
    public static final String f4993f = "EnableRoundAvatar";

    /* JADX INFO: renamed from: g */
    public static final wm0 f4994g = wm0.f12579m;

    /* JADX INFO: renamed from: h */
    public static final boolean f4995h = true;

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(C0274he.f3968g);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4993f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f4995h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        XposedBridge.hookMethod(C0274he.f3968g.m5640e(), new kg3(this, null, new C0251gs(18))).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f4992e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f4994g;
    }
}
