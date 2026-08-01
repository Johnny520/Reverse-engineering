package p190k3;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p061L2.C0979s;
import p117X2.AbstractC1665j;
import p143c3.AbstractC1907i;
import p143c3.C1899a;
import p166g3.AbstractC2188e;
import p166g3.C2184a;
import p166g3.C2187d;

/* JADX INFO: renamed from: k3.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2466n {

    /* JADX INFO: renamed from: a */
    public static final C2187d f7954a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i5 = AbstractC2472t.f7960a;
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
            Iterator it = Arrays.asList(new C2184a()).iterator();
            AbstractC1665j.m2985e(it, "<this>");
            Iterator it2 = AbstractC1907i.m3392v(new C1899a(new C0979s(1, it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C2184a) next).getClass();
                    do {
                        ((C2184a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C2184a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f7954a = new C2187d(AbstractC2188e.m4010a(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
