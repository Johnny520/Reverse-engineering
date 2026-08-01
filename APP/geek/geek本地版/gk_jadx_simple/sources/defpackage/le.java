package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class le {
    public static final List a = null;

    static {
        Iterator r0 = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        ip.o("<this>", r0);
        a = j20.I(new bc(new l20(r0)));
    }
}
