package p000;

import de.robv.android.xposed.XC_MethodHook;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qh1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z70 f8974b;

    public qh1(int i, z70 z70Var) {
        this.f8973a = i;
        this.f8974b = z70Var;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        methodHookParam.getClass();
        Object[] objArr = methodHookParam.args;
        objArr.getClass();
        Object objM3099n0 = AbstractC0460mg.m3099n0(this.f8973a, objArr);
        Integer num = objM3099n0 instanceof Integer ? (Integer) objM3099n0 : null;
        if (num == null || (str = (String) ((ConcurrentHashMap) this.f8974b.f13762m).get(num)) == null) {
            return;
        }
        methodHookParam.setResult(str);
    }
}
