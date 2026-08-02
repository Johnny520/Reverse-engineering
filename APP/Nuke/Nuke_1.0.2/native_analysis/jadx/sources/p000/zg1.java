package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 extends l01 {

    /* JADX INFO: renamed from: j */
    public final Method f13895j;

    public zg1(Method method) {
        this.f13895j = method;
    }

    @Override // p000.AbstractC0738tl
    /* JADX INFO: renamed from: H */
    public final Member mo2762H() {
        return this.f13895j;
    }

    @Override // p000.l01
    /* JADX INFO: renamed from: f0 */
    public final l01 mo2782f0(Object obj) {
        m2781e0(obj);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m6415g0(Object... objArr) {
        m5328R();
        return this.f13895j.invoke(this.f5866i, Arrays.copyOf(objArr, objArr.length));
    }
}
