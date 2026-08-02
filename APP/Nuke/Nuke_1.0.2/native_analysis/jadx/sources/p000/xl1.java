package p000;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl1 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13072a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f13072a) {
            case 0:
                return new SecurityException("Native release manifest is missing");
            case 1:
                return new SecurityException("Native release Engine is missing");
            default:
                ThreadLocal threadLocal = am1.f250a;
                return Boolean.FALSE;
        }
    }
}
