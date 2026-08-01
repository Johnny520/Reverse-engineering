package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ls {
    public static final jo a = null;

    static {
        int r1 = r50.a;
        Object r12 = null;
        String r0 = System.getProperty("kotlinx.coroutines.fast.service.loader");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L8;
        Boolean.parseBoolean(r0);
    L8:
        Iterator r02 = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
        ip.o("<this>", r02);
        Iterator r03 = j20.I(new bc(new l20(r02))).iterator();
        if (r03.hasNext() == false) goto L18;
        r12 = r03.next();
        if (r03.hasNext() == false) goto L18;
        ((MainDispatcherFactory) r12).getClass();
    L15:
        ((MainDispatcherFactory) r03.next()).getClass();
        if (r03.hasNext() == true) goto L15;
    L18:
        if (((MainDispatcherFactory) r12) == null) goto L26;
        Looper r04 = Looper.getMainLooper();
        if (r04 == null) goto L24;
        a = new jo(ko.a(r04), false);
        return;
    L24:
        throw new IllegalStateException("The main looper is not available");
    L26:
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    L5:
        r0 = null;
        goto L6
    }
}
