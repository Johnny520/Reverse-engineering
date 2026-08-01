package p020;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0137;
import androidx.recyclerview.widget.C2496;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4395;
import okhttp3.Protocol;
import p004.C6099;
import p004.C6107;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p004.InterfaceC6110;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6132;
import p007.C6149;
import p007.C6151;
import p012.AbstractC6222;
import p012.InterfaceC6215;
import p012.InterfaceC6216;
import p013.AbstractC6230;
import p018.AbstractC6253;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6291 implements InterfaceC6215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6151 f17366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2496 f17367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f17369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6216 f17370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6127 f17371;

    static {
        C6151 c6151 = C6151.f16892;
        f17366 = AbstractC3057.m6745("OkHttp-Response-Body", "Truncated");
    }

    public C6291(C6127 c6127, InterfaceC6216 interfaceC6216, C0108 c0108) {
        c0108.getClass();
        this.f17371 = c6127;
        this.f17370 = interfaceC6216;
        this.f17369 = c0108;
        this.f17367 = new C2496((C6099) c0108.f320);
    }

    @Override // p012.InterfaceC6215
    public final void cancel() {
        this.f17370.cancel();
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11659() {
        ((C6107) this.f17369.f318).flush();
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6101 mo11660(C6131 c6131) {
        C6125 c6125 = c6131.f16773;
        if (!AbstractC6222.m11675(c6131)) {
            return m11818(c6125.f16716, 0L);
        }
        String strM11551 = c6131.f16769.m11551("Transfer-Encoding");
        if (strM11551 == null) {
            strM11551 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11551)) {
            C6149 c6149 = c6125.f16716;
            if (this.f17368 == 4) {
                this.f17368 = 5;
                return new C6288(this, c6149);
            }
            C4211.m8612(this.f17368, "state: ");
            return null;
        }
        long jM11694 = AbstractC6230.m11694(c6131);
        if (jM11694 != -1) {
            return m11818(c6125.f16716, jM11694);
        }
        C6149 c61492 = c6125.f16716;
        if (this.f17368 != 4) {
            C4211.m8612(this.f17368, "state: ");
            return null;
        }
        this.f17368 = 5;
        this.f17370.mo11621();
        c61492.getClass();
        return new C6285(this, c61492);
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11661(C6125 c6125) {
        Proxy.Type type = this.f17370.mo11626().f16701.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(c6125.f16715);
        sb.append(' ');
        C6149 c6149 = c6125.f16716;
        if (AbstractC4395.m8907(c6149.f16884, "https") || type != Proxy.Type.HTTP) {
            String strM11543 = c6149.m11543();
            String strM11541 = c6149.m11541();
            if (strM11541 != null) {
                strM11543 = AbstractC0053.m164('?', strM11543, strM11541);
            }
            sb.append(strM11543);
        } else {
            sb.append(c6149);
        }
        sb.append(" HTTP/1.1");
        m11819(c6125.f16714, sb.toString());
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6132 mo11662(boolean z) {
        C2496 c2496 = this.f17367;
        int i = this.f17368;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            C4211.m8612(this.f17368, "state: ");
            return null;
        }
        try {
            String strMo11479 = ((InterfaceC6110) c2496.f7474).mo11479(c2496.f7475);
            c2496.f7475 -= (long) strMo11479.length();
            C0137 c0137M11751 = AbstractC6253.m11751(strMo11479);
            int i2 = c0137M11751.f596;
            C6132 c6132 = new C6132();
            Protocol protocol = (Protocol) c0137M11751.f595;
            protocol.getClass();
            c6132.f16778 = protocol;
            c6132.f16777 = i2;
            c6132.f16776 = (String) c0137M11751.f594;
            c6132.f16774 = c2496.m4950().m11549();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f17368 = 3;
                return c6132;
            }
            if (102 > i2 || i2 >= 200) {
                this.f17368 = 4;
                return c6132;
            }
            this.f17368 = 3;
            return c6132;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f17370.mo11626().f16702.f16815.m11546()), e);
        }
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11663() {
        return this.f17368 == 6;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11664() {
        ((C6107) this.f17369.f318).flush();
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final long mo11665(C6131 c6131) {
        if (!AbstractC6222.m11675(c6131)) {
            return 0L;
        }
        String strM11551 = c6131.f16769.m11551("Transfer-Encoding");
        if (strM11551 == null) {
            strM11551 = null;
        }
        if ("chunked".equalsIgnoreCase(strM11551)) {
            return -1L;
        }
        return AbstractC6230.m11694(c6131);
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6100 mo11666() {
        return this.f17369;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6287 m11818(C6149 c6149, long j) {
        if (this.f17368 == 4) {
            this.f17368 = 5;
            return new C6287(this, c6149, j);
        }
        C4211.m8612(this.f17368, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11819(C6151 c6151, String str) {
        c6151.getClass();
        if (this.f17368 != 0) {
            C4211.m8612(this.f17368, "state: ");
            return;
        }
        C0108 c0108 = this.f17369;
        C6107 c6107 = (C6107) c0108.f318;
        c6107.mo11463(str);
        c6107.mo11463("\r\n");
        int size = c6151.size();
        int i = 0;
        while (true) {
            C6107 c61072 = (C6107) c0108.f318;
            if (i >= size) {
                c61072.mo11463("\r\n");
                this.f17368 = 1;
                return;
            } else {
                c61072.mo11463(c6151.m11550(i));
                c61072.mo11463(": ");
                c61072.mo11463(c6151.m11552(i));
                c61072.mo11463("\r\n");
                i++;
            }
        }
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6216 mo11667() {
        return this.f17370;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC6103 mo11668(C6125 c6125, long j) {
        if ("chunked".equalsIgnoreCase(c6125.f16714.m11551("Transfer-Encoding"))) {
            if (this.f17368 == 1) {
                this.f17368 = 2;
                return new C6289(this);
            }
            C4211.m8612(this.f17368, "state: ");
            return null;
        }
        if (j == -1) {
            C5925.m11311("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f17368 == 1) {
            this.f17368 = 2;
            return new C6286(this);
        }
        C4211.m8612(this.f17368, "state: ");
        return null;
    }
}
