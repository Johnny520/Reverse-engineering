package p000;

import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends AbstractC0812vj implements w70 {

    /* JADX INFO: renamed from: d */
    public static final gj1 f3541d = new gj1(true);

    /* JADX INFO: renamed from: e */
    public static final String f3542e = "MsgLongClickMenu";

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(ej1.f2459b);
        arrayList.add(fj1.f3016b);
        arrayList.add(cj1.f1586b);
        arrayList.add(dj1.f2079b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f3542e;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        XposedBridge.hookMethod(ej1.f2459b.m5640e(), new kg3(this, null, new vi1(2))).getClass();
        XposedBridge.hookMethod(fj1.f3016b.m5640e(), new kg3(this, new vi1(3), null)).getClass();
    }
}
