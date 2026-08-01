package p015C2;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import p020D2.AbstractC0263a;

/* JADX INFO: renamed from: C2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0243c extends AbstractC0263a {

    /* JADX INFO: renamed from: g */
    public final Method f814g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0243c(Method method) {
        this.f814g = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020D2.AbstractC0263a
    /* JADX INFO: renamed from: I */
    public final Member mo444I() {
        return this.f814g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020D2.AbstractC0263a
    /* JADX INFO: renamed from: J */
    public final AbstractC0263a mo445J(Object obj) {
        m457H(obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m446K(Object... objArr) {
        Method method = this.f814g;
        Method method2 = method != null ? method : null;
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        return method.invoke(this.f855f, Arrays.copyOf(objArr, objArr.length));
    }
}
