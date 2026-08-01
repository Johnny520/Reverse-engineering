package p001A0;

import java.util.concurrent.atomic.AtomicBoolean;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: A0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038k {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f251a = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m60a() {
        Object c0104d;
        AtomicBoolean atomicBoolean = f251a;
        if (atomicBoolean.get()) {
            return true;
        }
        try {
            System.loadLibrary("dexkit");
            atomicBoolean.set(true);
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("dexkit library load fail", thM246a);
            c0104d = Boolean.FALSE;
        }
        return ((Boolean) c0104d).booleanValue();
    }
}
