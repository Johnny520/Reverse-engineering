package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0197fb implements zs2 {

    /* JADX INFO: renamed from: e */
    public static final C0160eb f2887e = new C0160eb(0);

    /* JADX INFO: renamed from: a */
    public final Class f2888a;

    /* JADX INFO: renamed from: b */
    public final Method f2889b;

    /* JADX INFO: renamed from: c */
    public final Method f2890c;

    /* JADX INFO: renamed from: d */
    public final Method f2891d;

    public C0197fb(Class cls) throws NoSuchMethodException {
        this.f2888a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f2889b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f2890c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2891d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: a */
    public final String mo920a(SSLSocket sSLSocket) {
        if (this.f2888a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2890c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC0856wq.f12612a);
                }
            } catch (IllegalAccessException e) {
                C0676s.m4650i(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !t11.m5086l(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C0676s.m4650i(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: b */
    public final boolean mo921b(SSLSocket sSLSocket) {
        return this.f2888a.isInstance(sSLSocket);
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: c */
    public final boolean mo922c() {
        boolean z = C0084ca.f1255d;
        return C0084ca.f1255d;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: d */
    public final void mo923d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f2888a.isInstance(sSLSocket)) {
            try {
                this.f2889b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f2891d;
                zz1 zz1Var = zz1.f14161a;
                method.invoke(sSLSocket, j51.m2440v(list));
            } catch (IllegalAccessException e) {
                C0676s.m4650i(e);
            } catch (InvocationTargetException e2) {
                C0676s.m4650i(e2);
            }
        }
    }
}
