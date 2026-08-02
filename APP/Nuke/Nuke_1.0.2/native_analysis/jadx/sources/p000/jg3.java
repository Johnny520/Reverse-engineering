package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jg3 {

    /* JADX INFO: renamed from: a */
    public final XC_MethodHook.MethodHookParam f5028a;

    public jg3(XC_MethodHook.MethodHookParam methodHookParam) {
        this.f5028a = methodHookParam;
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m2496a() {
        Object[] objArr = this.f5028a.args;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m2497b(Object obj) {
        this.f5028a.setResult(obj);
    }
}
