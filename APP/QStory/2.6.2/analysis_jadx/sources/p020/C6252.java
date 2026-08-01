package p020;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.recyclerview.widget.C2496;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4394;
import okhttp3.Protocol;
import p005.C6108;
import p005.C6116;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p005.InterfaceC6119;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6205;
import p015.C6222;
import p015.C6224;
import p017.AbstractC6238;
import p021.AbstractC6260;
import p021.InterfaceC6253;
import p021.InterfaceC6254;
import p251.AbstractC8174;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6252 implements InterfaceC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6224 f17219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2496 f17220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f17222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6254 f17223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6200 f17224;

    static {
        C6224 c6224 = C6224.f17131;
        f17219 = AbstractC8174.m13611("OkHttp-Response-Body", "Truncated");
    }

    public C6252(C6200 c6200, InterfaceC6254 interfaceC6254, C0108 c0108) {
        c0108.getClass();
        this.f17224 = c6200;
        this.f17223 = interfaceC6254;
        this.f17222 = c0108;
        this.f17220 = new C2496((C6108) c0108.f320);
    }

    @Override // p021.InterfaceC6253
    public final void cancel() {
        this.f17223.cancel();
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6205 mo11727(boolean z) {
        C2496 c2496 = this.f17220;
        int i = this.f17221;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            C4210.m8622(this.f17221, "state: ");
            return null;
        }
        try {
            String strMo11472 = ((InterfaceC6119) c2496.f7473).mo11472(c2496.f7474);
            c2496.f7474 -= (long) strMo11472.length();
            C0137 c0137M8301 = AbstractC3932.m8301(strMo11472);
            int i2 = c0137M8301.f596;
            C6205 c6205 = new C6205();
            Protocol protocol = (Protocol) c0137M8301.f595;
            protocol.getClass();
            c6205.f17017 = protocol;
            c6205.f17016 = i2;
            c6205.f17015 = (String) c0137M8301.f594;
            c6205.f17013 = c2496.m4940().m11678();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f17221 = 3;
                return c6205;
            }
            if (102 > i2 || i2 >= 200) {
                this.f17221 = 4;
                return c6205;
            }
            this.f17221 = 3;
            return c6205;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f17223.mo11607().f16941.f17054.m11675()), e);
        }
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6110 mo11728(C6204 c6204) {
        C6198 c6198 = c6204.f17012;
        if (!AbstractC6260.m11745(c6204)) {
            return m11735(c6198.f16955, 0L);
        }
        String strM11680 = c6204.f17008.m11680("Transfer-Encoding");
        if (strM11680 == null) {
            strM11680 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11680)) {
            C6222 c6222 = c6198.f16955;
            if (this.f17221 == 4) {
                this.f17221 = 5;
                return new C6249(this, c6222);
            }
            C4210.m8622(this.f17221, "state: ");
            return null;
        }
        long jM11702 = AbstractC6238.m11702(c6204);
        if (jM11702 != -1) {
            return m11735(c6198.f16955, jM11702);
        }
        C6222 c62222 = c6198.f16955;
        if (this.f17221 != 4) {
            C4210.m8622(this.f17221, "state: ");
            return null;
        }
        this.f17221 = 5;
        this.f17223.mo11602();
        c62222.getClass();
        return new C6246(this, c62222);
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6112 mo11729(C6198 c6198, long j) {
        if ("chunked".equalsIgnoreCase(c6198.f16953.m11680("Transfer-Encoding"))) {
            if (this.f17221 == 1) {
                this.f17221 = 2;
                return new C6250(this);
            }
            C4210.m8622(this.f17221, "state: ");
            return null;
        }
        if (j == -1) {
            C5919.m11250("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f17221 == 1) {
            this.f17221 = 2;
            return new C6247(this);
        }
        C4210.m8622(this.f17221, "state: ");
        return null;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo11730() {
        return this.f17221 == 6;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo11731() {
        ((C6116) this.f17222.f318).flush();
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo11732(C6204 c6204) {
        if (!AbstractC6260.m11745(c6204)) {
            return 0L;
        }
        String strM11680 = c6204.f17008.m11680("Transfer-Encoding");
        if (strM11680 == null) {
            strM11680 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11680)) {
            return -1L;
        }
        return AbstractC6238.m11702(c6204);
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6109 mo11733() {
        return this.f17222;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo11734() {
        ((C6116) this.f17222.f318).flush();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6248 m11735(C6222 c6222, long j) {
        if (this.f17221 == 4) {
            this.f17221 = 5;
            return new C6248(this, c6222, j);
        }
        C4210.m8622(this.f17221, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11736(C6224 c6224, String str) {
        c6224.getClass();
        if (this.f17221 != 0) {
            C4210.m8622(this.f17221, "state: ");
            return;
        }
        C0108 c0108 = this.f17222;
        C6116 c6116 = (C6116) c0108.f318;
        c6116.mo11477(str);
        c6116.mo11477("\r\n");
        int size = c6224.size();
        int i = 0;
        while (true) {
            C6116 c61162 = (C6116) c0108.f318;
            if (i >= size) {
                c61162.mo11477("\r\n");
                this.f17221 = 1;
                return;
            } else {
                c61162.mo11477(c6224.m11679(i));
                c61162.mo11477(": ");
                c61162.mo11477(c6224.m11681(i));
                c61162.mo11477("\r\n");
                i++;
            }
        }
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6254 mo11737() {
        return this.f17223;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo11738(C6198 c6198) {
        Proxy.Type type = this.f17223.mo11607().f16940.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(c6198.f16954);
        sb.append(' ');
        C6222 c6222 = c6198.f16955;
        if (AbstractC4394.m8917(c6222.f17123, "https") || type != Proxy.Type.HTTP) {
            String strM11672 = c6222.m11672();
            String strM11670 = c6222.m11670();
            if (strM11670 != null) {
                strM11672 = AbstractC0053.m163('?', strM11672, strM11670);
            }
            sb.append(strM11672);
        } else {
            sb.append(c6222);
        }
        sb.append(" HTTP/1.1");
        m11736(c6198.f16953, sb.toString());
    }
}
