package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t73 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final t73 f10595d = new t73(false);

    /* JADX INFO: renamed from: e */
    public static final int f10596e = R.string.unlock_picture_send_limit;

    /* JADX INFO: renamed from: f */
    public static final wm0 f10597f = wm0.f12575i;

    /* JADX INFO: renamed from: g */
    public static final String f10598g = "UnLockPictureSendLimit";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f10598g;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        sg1 sg1VarM3244v = op0.m3602y(up0.m5529H("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI")).m3244v();
        sg1VarM3244v.f13871b = "onCreate";
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new kx2(9), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f10596e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f10597f;
    }
}
