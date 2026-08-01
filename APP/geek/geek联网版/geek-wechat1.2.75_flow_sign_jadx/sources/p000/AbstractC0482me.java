package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: me */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0482me {

    /* JADX INFO: renamed from: a */
    public static final List f3130a;

    static {
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        AbstractC0493mp.m1857g("<this>", it);
        f3130a = q20.m2111J(new C0406kc(new s20(it)));
    }
}
