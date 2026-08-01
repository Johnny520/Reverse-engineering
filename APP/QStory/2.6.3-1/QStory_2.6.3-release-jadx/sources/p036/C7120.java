package p036;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C0984;
import androidx.recyclerview.widget.C3329;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC5227;
import okhttp3.Protocol;
import p020.C6928;
import p020.C6936;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p020.InterfaceC6939;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6961;
import p023.C6978;
import p023.C6980;
import p028.AbstractC7051;
import p028.InterfaceC7044;
import p028.InterfaceC7045;
import p029.AbstractC7059;
import p034.AbstractC7082;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7120 implements InterfaceC7044 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6980 f17711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3329 f17712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f17713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0955 f17714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7045 f17715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6956 f17716;

    static {
        C6980 c6980 = C6980.f17237;
        f17711 = AbstractC3889.m7305("OkHttp-Response-Body", "Truncated");
    }

    public C7120(C6956 c6956, InterfaceC7045 interfaceC7045, C0955 c0955) {
        c0955.getClass();
        this.f17716 = c6956;
        this.f17715 = interfaceC7045;
        this.f17714 = c0955;
        this.f17712 = new C3329((C6928) c0955.f665);
    }

    @Override // p028.InterfaceC7044
    public final void cancel() {
        this.f17715.cancel();
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12218() {
        ((C6936) this.f17714.f663).flush();
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6930 mo12219(C6960 c6960) {
        C6954 c6954 = c6960.f17118;
        if (!AbstractC7051.m12234(c6960)) {
            return m12377(c6954.f17061, 0L);
        }
        String strM12110 = c6960.f17114.m12110("Transfer-Encoding");
        if (strM12110 == null) {
            strM12110 = null;
        }
        if ("chunked".equalsIgnoreCase(strM12110)) {
            C6978 c6978 = c6954.f17061;
            if (this.f17713 == 4) {
                this.f17713 = 5;
                return new C7117(this, c6978);
            }
            C5043.m9171(this.f17713, "state: ");
            return null;
        }
        long jM12253 = AbstractC7059.m12253(c6960);
        if (jM12253 != -1) {
            return m12377(c6954.f17061, jM12253);
        }
        C6978 c69782 = c6954.f17061;
        if (this.f17713 != 4) {
            C5043.m9171(this.f17713, "state: ");
            return null;
        }
        this.f17713 = 5;
        this.f17715.mo12180();
        c69782.getClass();
        return new C7114(this, c69782);
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12220(C6954 c6954) {
        Proxy.Type type = this.f17715.mo12185().f17046.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(c6954.f17060);
        sb.append(' ');
        C6978 c6978 = c6954.f17061;
        if (AbstractC5227.m9466(c6978.f17229, "https") || type != Proxy.Type.HTTP) {
            String strM12102 = c6978.m12102();
            String strM12100 = c6978.m12100();
            if (strM12100 != null) {
                strM12102 = AbstractC0900.m724('?', strM12102, strM12100);
            }
            sb.append(strM12102);
        } else {
            sb.append(c6978);
        }
        sb.append(" HTTP/1.1");
        m12378(c6954.f17059, sb.toString());
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C6961 mo12221(boolean z) {
        C3329 c3329 = this.f17712;
        int i = this.f17713;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            C5043.m9171(this.f17713, "state: ");
            return null;
        }
        try {
            String strMo12038 = ((InterfaceC6939) c3329.f7819).mo12038(c3329.f7820);
            c3329.f7820 -= (long) strMo12038.length();
            C0984 c0984M12310 = AbstractC7082.m12310(strMo12038);
            int i2 = c0984M12310.f941;
            C6961 c6961 = new C6961();
            Protocol protocol = (Protocol) c0984M12310.f940;
            protocol.getClass();
            c6961.f17123 = protocol;
            c6961.f17122 = i2;
            c6961.f17121 = (String) c0984M12310.f939;
            c6961.f17119 = c3329.m5510().m12108();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f17713 = 3;
                return c6961;
            }
            if (102 > i2 || i2 >= 200) {
                this.f17713 = 4;
                return c6961;
            }
            this.f17713 = 3;
            return c6961;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f17715.mo12185().f17047.f17160.m12105()), e);
        }
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12222() {
        return this.f17713 == 6;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12223() {
        ((C6936) this.f17714.f663).flush();
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final long mo12224(C6960 c6960) {
        if (!AbstractC7051.m12234(c6960)) {
            return 0L;
        }
        String strM12110 = c6960.f17114.m12110("Transfer-Encoding");
        if (strM12110 == null) {
            strM12110 = null;
        }
        if ("chunked".equalsIgnoreCase(strM12110)) {
            return -1L;
        }
        return AbstractC7059.m12253(c6960);
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6929 mo12225() {
        return this.f17714;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7116 m12377(C6978 c6978, long j) {
        if (this.f17713 == 4) {
            this.f17713 = 5;
            return new C7116(this, c6978, j);
        }
        C5043.m9171(this.f17713, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12378(C6980 c6980, String str) {
        c6980.getClass();
        if (this.f17713 != 0) {
            C5043.m9171(this.f17713, "state: ");
            return;
        }
        C0955 c0955 = this.f17714;
        C6936 c6936 = (C6936) c0955.f663;
        c6936.mo12022(str);
        c6936.mo12022("\r\n");
        int size = c6980.size();
        int i = 0;
        while (true) {
            C6936 c69362 = (C6936) c0955.f663;
            if (i >= size) {
                c69362.mo12022("\r\n");
                this.f17713 = 1;
                return;
            } else {
                c69362.mo12022(c6980.m12109(i));
                c69362.mo12022(": ");
                c69362.mo12022(c6980.m12111(i));
                c69362.mo12022("\r\n");
                i++;
            }
        }
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC7045 mo12226() {
        return this.f17715;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC6932 mo12227(C6954 c6954, long j) {
        if ("chunked".equalsIgnoreCase(c6954.f17059.m12110("Transfer-Encoding"))) {
            if (this.f17713 == 1) {
                this.f17713 = 2;
                return new C7118(this);
            }
            C5043.m9171(this.f17713, "state: ");
            return null;
        }
        if (j == -1) {
            C6755.m11870("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f17713 == 1) {
            this.f17713 = 2;
            return new C7115(this);
        }
        C5043.m9171(this.f17713, "state: ");
        return null;
    }
}
