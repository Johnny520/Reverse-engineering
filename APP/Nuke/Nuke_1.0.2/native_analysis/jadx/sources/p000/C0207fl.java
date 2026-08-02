package p000;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: fl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207fl extends gx2 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final C0207fl f3031d = new C0207fl(false);

    /* JADX INFO: renamed from: e */
    public static final int f3032e = R.string.block_xposed_detection;

    /* JADX INFO: renamed from: f */
    public static final wm0 f3033f = wm0.f12580n;

    /* JADX INFO: renamed from: g */
    public static final int f3034g = R.string.block_xposed_detection_summary;

    /* JADX INFO: renamed from: h */
    public static final String f3035h = "BlockXposedDetection";

    /* JADX INFO: renamed from: i */
    public static final boolean f3036i = true;

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(C0274he.f3965d);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: c */
    public final boolean mo849c() {
        return f3036i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f3035h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        C0274he c0274he = C0274he.f3965d;
        c0274he.getClass();
        XposedBridge.hookMethod(c0274he.m5640e(), new kg3(f3031d, new C0829w(21), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f3034g);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f3032e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f3033f;
    }
}
