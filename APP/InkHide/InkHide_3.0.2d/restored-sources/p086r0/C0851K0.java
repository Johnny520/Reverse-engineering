package p086r0;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Set;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851K0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0854L0 f2914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f2915c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0851K0(C0854L0 c0854l0, Method method, int i2) {
        this.f2913a = i2;
        this.f2914b = c0854l0;
        this.f2915c = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2913a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l0 = this.f2914b;
                if (C0854L0.m1718d(c0854l0)) {
                    Set setM1750n = c0854l0.m1750n();
                    if (!setM1750n.isEmpty()) {
                        AbstractC0223g.m415b(this.f2915c);
                        C0854L0.m1716b(c0854l0, methodHookParam, setM1750n);
                        C0854L0.m1717c(c0854l0, methodHookParam.thisObject, setM1750n);
                        break;
                    }
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0854L0 c0854l02 = this.f2914b;
                if (C0854L0.m1718d(c0854l02)) {
                    Set setM1750n2 = c0854l02.m1750n();
                    if (!setM1750n2.isEmpty()) {
                        AbstractC0223g.m415b(this.f2915c);
                        C0854L0.m1716b(c0854l02, methodHookParam, setM1750n2);
                        break;
                    }
                }
                break;
        }
    }
}
