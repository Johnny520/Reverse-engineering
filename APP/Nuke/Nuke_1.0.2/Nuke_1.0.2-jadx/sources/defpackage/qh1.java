package defpackage;

import de.robv.android.xposed.XC_MethodHook;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qh1 extends XC_MethodHook {
    public final /* synthetic */ int a;
    public final /* synthetic */ z70 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qh1(int i, z70 z70Var) {
        this.a = i;
        this.b = z70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        methodHookParam.getClass();
        Object[] objArr = methodHookParam.args;
        objArr.getClass();
        Object objN0 = mg.n0(this.a, objArr);
        Integer num = objN0 instanceof Integer ? (Integer) objN0 : null;
        if (num == null || (str = (String) ((ConcurrentHashMap) this.b.m).get(num)) == null) {
            return;
        }
        methodHookParam.setResult(str);
    }
}
