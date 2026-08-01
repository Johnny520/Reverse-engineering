package p054c0;

import java.lang.reflect.Proxy;
import p059d0.InterfaceC0517b;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513e {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0517b f1619a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC0517b f1620b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0511c c0511c = new C0511c();
        InterfaceC0517b interfaceC0517b = c0511c;
        if (!Proxy.isProxyClass(C0511c.class)) {
            C0512d c0512d = new C0512d();
            c0512d.f1618a = c0511c;
            interfaceC0517b = (InterfaceC0517b) Proxy.newProxyInstance(C0511c.class.getClassLoader(), new Class[]{InterfaceC0517b.class}, c0512d);
        }
        f1619a = interfaceC0517b;
        f1620b = interfaceC0517b;
    }
}
