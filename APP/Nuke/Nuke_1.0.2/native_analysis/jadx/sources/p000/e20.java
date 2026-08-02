package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e20 {

    /* JADX INFO: renamed from: a */
    public static final List f2297a;

    static {
        try {
            Iterator it = Arrays.asList(new C0764u8()).iterator();
            it.getClass();
            f2297a = wo2.m5947T(new C0184ez(new C0497ng(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
