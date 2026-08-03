package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.u9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859u9<R> implements InterfaceC0298Q7<R>, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f3366a;

    public AbstractC0859u9(int i) {
        this.f3366a = i;
    }

    @Override // p000a.InterfaceC0298Q7
    /* JADX INFO: renamed from: b */
    public final int mo145b() {
        return this.f3366a;
    }

    public final String toString() {
        C0356Tc.f1350a.getClass();
        String strM1002a = C0374Uc.m1002a(this);
        C0631i9.m1481d(strM1002a, "renderLambdaToString(...)");
        return strM1002a;
    }
}
