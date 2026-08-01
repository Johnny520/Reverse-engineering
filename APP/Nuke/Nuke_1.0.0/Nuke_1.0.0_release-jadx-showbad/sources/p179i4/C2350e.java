package p179i4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1973a;
import p173h4.AbstractC2263d;
import p173h4.C2262c;

/* JADX INFO: renamed from: i4.e */
/* JADX INFO: loaded from: classes.dex */
public class C2350e implements InterfaceC2359n {

    /* JADX INFO: renamed from: e */
    public static final C1577b f7646e = new C1577b(29);

    /* JADX INFO: renamed from: a */
    public final Class f7647a;

    /* JADX INFO: renamed from: b */
    public final Method f7648b;

    /* JADX INFO: renamed from: c */
    public final Method f7649c;

    /* JADX INFO: renamed from: d */
    public final Method f7650d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2350e(Class cls) throws NoSuchMethodException {
        this.f7647a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC1665j.m2984d(declaredMethod, "getDeclaredMethod(...)");
        this.f7648b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f7649c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f7650d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: a */
    public final boolean mo4172a(SSLSocket sSLSocket) {
        return this.f7647a.isInstance(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: b */
    public final String mo4173b(SSLSocket sSLSocket) {
        if (this.f7647a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f7649c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC1973a.f6662a);
                }
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                Throwable cause = e6.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC1665j.m2981a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e6);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: c */
    public final boolean mo4174c() {
        boolean z5 = C2262c.f7402d;
        return C2262c.f7402d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: d */
    public final void mo4175d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1665j.m2985e(list, "protocols");
        if (this.f7647a.isInstance(sSLSocket)) {
            try {
                this.f7648b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f7650d;
                AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                method.invoke(sSLSocket, C1577b.m2845m(list));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }
    }
}
