package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: Zp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106Zp {

    /* JADX INFO: renamed from: a */
    public static final C2283nk f3500a;

    static {
        String property;
        int i = AbstractC1356eA.f4858a;
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
            Iterator it = AbstractC0040Ax.m59I(new C1216bb(new C2381po(1, Arrays.asList(new C0003A2()).iterator()))).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C0003A2) next).getClass();
                    do {
                        ((C0003A2) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C0003A2) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f3500a = new C2283nk(AbstractC2326ok.m4727a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
