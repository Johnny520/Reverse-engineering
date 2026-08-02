package p000;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0311ie extends gx2 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final C0311ie f4577d = new C0311ie(false);

    /* JADX INFO: renamed from: e */
    public static final int f4578e = R.string.anti_revoke_notip;

    /* JADX INFO: renamed from: f */
    public static final int f4579f = R.string.anti_revoke_notip_desc;

    /* JADX INFO: renamed from: g */
    public static final wm0 f4580g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f4581h = "AntiRevokeNoTip";

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(C0274he.f3964c);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4581h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        C0274he c0274he = C0274he.f3964c;
        c0274he.getClass();
        XposedBridge.hookMethod(c0274he.m5640e(), new kg3(f4577d, new C0829w(8), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f4579f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f4578e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f4580g;
    }
}
