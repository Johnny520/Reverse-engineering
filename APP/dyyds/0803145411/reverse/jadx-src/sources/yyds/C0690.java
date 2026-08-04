package yyds;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: yyds.ᛳᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0690 implements InterfaceC0881 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0805 f3267 = new C0805(6);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f3268;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Method f3269;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Method f3270;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Method f3271;

    public C0690(Class cls) throws NoSuchMethodException {
        this.f3268 = cls;
        this.f3269 = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        cls.getMethod("setHostname", String.class);
        this.f3270 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3271 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo844(SSLSocket sSLSocket) {
        if (this.f3268.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f3270.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC0347.f1806);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC1544.m3188(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo845(SSLSocket sSLSocket) {
        return this.f3268.isInstance(sSLSocket);
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo846() {
        int i = AbstractC2765.f13498;
        return false;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo847(SSLSocket sSLSocket, String str, List list) {
        if (this.f3268.isInstance(sSLSocket)) {
            try {
                this.f3269.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f3271;
                C1966 c1966 = AbstractC1325.f6087;
                method.invoke(sSLSocket, C0135.m589(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
