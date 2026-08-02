package defpackage;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(jg3 jg3Var, Object... objArr) {
        jg3Var.getClass();
        XC_MethodHook.MethodHookParam methodHookParam = jg3Var.a;
        Object[] objArrA = objArr.length == 0 ? jg3Var.a() : Arrays.copyOf(objArr, objArr.length);
        Member member = methodHookParam.method;
        member.getClass();
        XposedBridge.invokeOriginalMethod(member, methodHookParam.thisObject, objArrA);
    }
}
