package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5131;
import p019.AbstractC6241;
import p019.C6243;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6078 implements InterfaceC6083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8631 f16625 = new C8631(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f16626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method f16627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f16628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f16629;

    public C6078(Class cls) throws NoSuchMethodException {
        this.f16629 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f16628 = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f16627 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f16626 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11380(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f16629.isInstance(sSLSocket)) {
            try {
                this.f16628.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f16626;
                AbstractC6241 abstractC6241 = AbstractC6241.f17194;
                method.invoke(sSLSocket, C8631.m14292(list));
            } catch (IllegalAccessException e) {
                C5919.m11243(e);
            } catch (InvocationTargetException e2) {
                C5919.m11243(e2);
            }
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String mo11381(SSLSocket sSLSocket) {
        if (this.f16629.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f16627.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5131.f14688);
                }
            } catch (IllegalAccessException e) {
                C5919.m11243(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC4394.m8917(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C5919.m11243(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo11382(SSLSocket sSLSocket) {
        return this.f16629.isInstance(sSLSocket);
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo11383() {
        boolean z = C6243.f17195;
        return C6243.f17195;
    }
}
