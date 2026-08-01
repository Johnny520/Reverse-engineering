package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: le */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0445le {

    /* JADX INFO: renamed from: a */
    public static final List f3046a;

    static {
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        AbstractC0346ip.m1503o("<this>", it);
        f3046a = j20.m1545I(new C0063bc(new l20(it)));
    }
}
