package p034;

import io.ktor.client.plugins.api.C4718;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import p033.AbstractC7067;
import p033.C7069;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7073 implements InterfaceC7078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4718 f17552 = new C4718(25);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f17553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method f17554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f17555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f17556;

    public C7073(Class cls) throws NoSuchMethodException {
        this.f17556 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f17555 = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f17554 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f17553 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo12287(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f17556.isInstance(sSLSocket)) {
            try {
                this.f17555.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f17553;
                AbstractC7067 abstractC7067 = AbstractC7067.f17543;
                method.invoke(sSLSocket, C9452.m14868(list));
            } catch (IllegalAccessException e) {
                C6755.m11863(e);
            } catch (InvocationTargetException e2) {
                C6755.m11863(e2);
            }
        }
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String mo12288(SSLSocket sSLSocket) {
        if (this.f17556.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f17554.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5964.f15033);
                }
            } catch (IllegalAccessException e) {
                C6755.m11863(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC5227.m9466(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C6755.m11863(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo12289(SSLSocket sSLSocket) {
        return this.f17556.isInstance(sSLSocket);
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo12290() {
        boolean z = C7069.f17544;
        return C7069.f17544;
    }
}
