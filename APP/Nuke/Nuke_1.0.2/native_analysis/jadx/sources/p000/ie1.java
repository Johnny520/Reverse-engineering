package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie1 {

    /* JADX INFO: renamed from: a */
    public static final vr0 f4583a;

    static {
        String property;
        int i = nx2.f7364a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new C0452m8()).iterator();
            it.getClass();
            Iterator it2 = wo2.m5947T(new C0184ez(new C0497ng(2, it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C0452m8) next).getClass();
                    do {
                        ((C0452m8) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C0452m8) next) == null) {
                C0676s.m4653l("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f4583a = new vr0(wr0.m5984a(mainLooper));
            } else {
                C0676s.m4653l("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
