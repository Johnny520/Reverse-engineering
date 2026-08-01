package p027E4;

import java.io.IOException;
import java.lang.reflect.Method;
import p118X3.AbstractC1682D;

/* JADX INFO: renamed from: E4.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0291E extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final Method f933d;

    /* JADX INFO: renamed from: e */
    public final int f934e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0327n f935f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0291E(Method method, int i5, InterfaceC0327n interfaceC0327n) {
        this.f933d = method;
        this.f934e = i5;
        this.f935f = interfaceC0327n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        int i5 = this.f934e;
        Method method = this.f933d;
        if (obj == null) {
            throw AbstractC0315b0.m543n(method, i5, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c0303q.f978k = (AbstractC1682D) this.f935f.mo63a(obj);
        } catch (IOException e5) {
            throw AbstractC0315b0.m544o(method, e5, i5, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
