package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl1 implements Supplier {
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new SecurityException("Native release manifest is missing");
            case 1:
                return new SecurityException("Native release Engine is missing");
            default:
                ThreadLocal threadLocal = am1.a;
                return Boolean.FALSE;
        }
    }
}
