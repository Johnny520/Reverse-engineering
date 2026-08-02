package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 implements InterfaceC0772ug {

    /* JADX INFO: renamed from: a */
    public static final ye2 f13430a = new ye2();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.InterfaceC0772ug
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2148a(Object[] objArr, t00 t00Var) {
        xe2 xe2Var;
        if (t00Var instanceof xe2) {
            xe2Var = (xe2) t00Var;
            int i = xe2Var.f13002m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe2Var.f13002m = i - Integer.MIN_VALUE;
            } else {
                xe2Var = new xe2(this, (u00) t00Var);
            }
        }
        Object obj = xe2Var.f13000k;
        int i2 = xe2Var.f13002m;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                sp0.m4929a0(1, objArr);
                long jM4935d0 = sp0.m4935d0(objArr[0], "delayMs", 0L, Long.MAX_VALUE);
                xe2Var.f13002m = 1;
                Object objM1425F = AbstractC0179eu.m1425F(jM4935d0, xe2Var);
                k20 k20Var = k20.f5323h;
                if (objM1425F == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
            }
            return AbstractC0179eu.m1472v(a83.f116a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return AbstractC0179eu.m1471u(th);
        }
    }
}
