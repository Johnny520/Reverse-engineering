package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: Zp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106Zp {

    /* JADX INFO: renamed from: a */
    public static final C2283nk f3500a = null;

    static {
        int r1 = AbstractC1356eA.f4858a;
        Object r12 = null;
        String r0 = System.getProperty("kotlinx.coroutines.fast.service.loader");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L31;
        Boolean.parseBoolean(r0);
    L31:
        Iterator r02 = AbstractC0040Ax.m59I(new C1216bb(new C2381po(1, Arrays.asList(new C0003A2[]{new C0003A2()}).iterator()))).iterator();
        if (r02.hasNext() == false) goto L19;
        r12 = r02.next();
        if (r02.hasNext() == false) goto L19;
        ((C0003A2) r12).getClass();
    L16:
        ((C0003A2) r02.next()).getClass();
        if (r02.hasNext() == true) goto L16;
    L19:
        if (((C0003A2) r12) == null) goto L27;
        Looper r03 = Looper.getMainLooper();
        if (r03 == null) goto L25;
        f3500a = new C2283nk(AbstractC2326ok.m4727a(r03), false);
        return;
    L25:
        throw new IllegalStateException("The main looper is not available");
    L27:
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    L28:
        th = move-exception;
        throw new ServiceConfigurationError(th.getMessage(), th);
    L5:
        r0 = null;
        goto L6
    }
}
