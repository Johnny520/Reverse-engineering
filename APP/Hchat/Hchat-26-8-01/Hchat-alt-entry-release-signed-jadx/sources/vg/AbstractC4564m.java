package vg;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import ng.AbstractC3015m;
import p136j8.C2104o;
import p263rg.AbstractC3810g;
import p263rg.C3804a;
import p263rg.C3808e;

/* JADX INFO: renamed from: vg.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4564m {

    /* JADX INFO: renamed from: a */
    public static final C3808e f15049a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i9 = AbstractC4570s.f15055a;
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
            Iterator it = AbstractC3015m.m6418b0(AbstractC3015m.m6408R(Arrays.asList(new C3804a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C3804a) next).getClass();
                    do {
                        ((C3804a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C3804a) next) == null) {
                C2104o.m5276A("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f15049a = new C3808e(AbstractC3810g.m7999b(mainLooper));
            } else {
                C2104o.m5276A("The main looper is not available");
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
