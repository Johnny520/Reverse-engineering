package p000;

import android.os.Looper;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: renamed from: ps */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0607ps {

    /* JADX INFO: renamed from: a */
    public static final C0529no f3752a;

    static {
        String property;
        int i = y50.f5358a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator it = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
        AbstractC0493mp.m1857g("<this>", it);
        Iterator it2 = q20.m2111J(new C0406kc(new s20(it))).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                ((MainDispatcherFactory) next).getClass();
                do {
                    ((MainDispatcherFactory) it2.next()).getClass();
                } while (it2.hasNext());
            }
        }
        if (((MainDispatcherFactory) next) == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        f3752a = new C0529no(AbstractC0566oo.m2051a(mainLooper), false);
    }
}
