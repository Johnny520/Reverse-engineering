package ec;

import java.lang.reflect.InvocationTargetException;
import p145jc.AbstractC3804f;
import p172l8.AbstractC4693f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2157m0 {
    /* JADX INFO: renamed from: a */
    public static final void m7839a(InterfaceC5980j interfaceC5980j, Throwable th) {
        if (th instanceof C2209z0) {
            th = ((C2209z0) th).getCause();
        }
        try {
            InterfaceC2153l0 interfaceC2153l0 = (InterfaceC2153l0) interfaceC5980j.mo1654h(InterfaceC2153l0.f5982f);
            if (interfaceC2153l0 != null) {
                interfaceC2153l0.mo167j0(interfaceC5980j, th);
            } else {
                AbstractC3804f.m15160a(interfaceC5980j, th);
            }
        } catch (Throwable th2) {
            AbstractC3804f.m15160a(interfaceC5980j, m7840b(th, th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m7840b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC4693f.m18753a(runtimeException, th);
        return runtimeException;
    }
}
