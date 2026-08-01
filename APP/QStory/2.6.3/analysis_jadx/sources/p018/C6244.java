package p018;

import io.ktor.client.plugins.api.C3886;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5132;
import p017.AbstractC6238;
import p017.C6240;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6244 implements InterfaceC6249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3886 f17207 = new C3886(25);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f17208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method f17209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f17210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f17211;

    public C6244(Class cls) throws NoSuchMethodException {
        this.f17211 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f17210 = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f17209 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f17208 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11728(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f17211.isInstance(sSLSocket)) {
            try {
                this.f17210.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f17208;
                AbstractC6238 abstractC6238 = AbstractC6238.f17198;
                method.invoke(sSLSocket, C8623.m14309(list));
            } catch (IllegalAccessException e) {
                C5925.m11304(e);
            } catch (InvocationTargetException e2) {
                C5925.m11304(e2);
            }
        }
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String mo11729(SSLSocket sSLSocket) {
        if (this.f17211.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f17209.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5132.f14688);
                }
            } catch (IllegalAccessException e) {
                C5925.m11304(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC4395.m8907(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C5925.m11304(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo11730(SSLSocket sSLSocket) {
        return this.f17211.isInstance(sSLSocket);
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo11731() {
        boolean z = C6240.f17199;
        return C6240.f17199;
    }
}
