package p035;

import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0984;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.AbstractC5976;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6961;
import p023.C6978;
import p023.C6980;
import p027.C7036;
import p028.AbstractC7051;
import p028.C7050;
import p028.InterfaceC7044;
import p028.InterfaceC7045;
import p029.AbstractC7059;
import p034.AbstractC7082;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7107 implements InterfaceC7044 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile boolean f17672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Protocol f17673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile C7098 f17674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7106 f17675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7050 f17676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7036 f17677;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List f17671 = AbstractC7059.m12260(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final List f17670 = AbstractC7059.m12260(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public C7107(C6956 c6956, C7036 c7036, C7050 c7050, C7106 c7106) {
        c6956.getClass();
        c7106.getClass();
        this.f17677 = c7036;
        this.f17676 = c7050;
        this.f17675 = c7106;
        List list = c6956.f17085;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f17673 = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p028.InterfaceC7044
    public final void cancel() {
        this.f17672 = true;
        C7098 c7098 = this.f17674;
        if (c7098 != null) {
            c7098.m12345(ErrorCode.CANCEL);
        }
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12218() {
        this.f17675.flush();
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6930 mo12219(C6960 c6960) {
        C7098 c7098 = this.f17674;
        c7098.getClass();
        return c7098.f17614;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12220(C6954 c6954) throws IOException {
        int i;
        C7098 c7098;
        boolean z;
        if (this.f17674 != null) {
            return;
        }
        boolean z2 = c6954.f17058 != null;
        C6980 c6980 = c6954.f17059;
        ArrayList arrayList = new ArrayList(c6980.size() + 4);
        arrayList.add(new C7093(c6954.f17060, C7093.f17590));
        ByteString byteString = C7093.f17594;
        C6978 c6978 = c6954.f17061;
        c6978.getClass();
        String strM12102 = c6978.m12102();
        String strM12100 = c6978.m12100();
        if (strM12100 != null) {
            strM12102 = AbstractC0900.m724('?', strM12102, strM12100);
        }
        arrayList.add(new C7093(strM12102, byteString));
        String strM12110 = c6980.m12110("Host");
        if (strM12110 != null) {
            arrayList.add(new C7093(strM12110, C7093.f17595));
        }
        arrayList.add(new C7093(c6978.f17229, C7093.f17593));
        int size = c6980.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM12109 = c6980.m12109(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strM12109.toLowerCase(locale);
            lowerCase.getClass();
            if (!f17671.contains(lowerCase) || (lowerCase.equals("te") && c6980.m12111(i2).equals("trailers"))) {
                arrayList.add(new C7093(lowerCase, c6980.m12111(i2)));
            }
        }
        C7106 c7106 = this.f17675;
        c7106.getClass();
        boolean z3 = !z2;
        synchronized (c7106.f17645) {
            synchronized (c7106) {
                try {
                    if (c7106.f17661 > 1073741823) {
                        c7106.m12368(ErrorCode.REFUSED_STREAM);
                    }
                    if (c7106.f17665) {
                        throw new ConnectionShutdownException();
                    }
                    i = c7106.f17661;
                    c7106.f17661 = i + 2;
                    c7098 = new C7098(i, c7106, z3, false, null);
                    z = !z2 || c7106.f17656 >= c7106.f17655 || c7098.f17613 >= c7098.f17612;
                    if (c7098.m12352()) {
                        c7106.f17667.put(Integer.valueOf(i), c7098);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c7106.f17645.m12357(z3, i, arrayList);
        }
        if (z) {
            c7106.f17645.flush();
        }
        this.f17674 = c7098;
        boolean z4 = this.f17672;
        C7098 c70982 = this.f17674;
        if (z4) {
            c70982.getClass();
            c70982.m12345(ErrorCode.CANCEL);
            C6755.m11866("Canceled");
        } else {
            c70982.getClass();
            c70982.f17611.mo12014(this.f17676.f17495);
            C7098 c70983 = this.f17674;
            c70983.getClass();
            c70983.f17610.mo12014(this.f17676.f17494);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6961 mo12221(boolean z) throws IOException {
        C6980 c6980;
        C7098 c7098 = this.f17674;
        if (c7098 == null) {
            C6755.m11866("stream wasn't created");
            return null;
        }
        synchronized (c7098) {
            while (true) {
                if (!c7098.f17616.isEmpty() || c7098.m12351() != null) {
                    break;
                }
                if (!z) {
                    c7098.f17618.getClass();
                    C7096 c7096 = c7098.f17615;
                    boolean z2 = c7096.f17602 || c7096.f17603;
                    if (z2) {
                        c7098.f17611.m12053();
                    }
                    try {
                        try {
                            c7098.wait();
                            if (z2) {
                                c7098.f17611.m12362();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            c7098.f17611.m12362();
                        }
                        throw th;
                    }
                }
            }
            if (c7098.f17616.isEmpty()) {
                IOException iOException = c7098.f17608;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeM12351 = c7098.m12351();
                errorCodeM12351.getClass();
                throw new StreamResetException(errorCodeM12351);
            }
            Object objRemoveFirst = c7098.f17616.removeFirst();
            objRemoveFirst.getClass();
            c6980 = (C6980) objRemoveFirst;
        }
        Protocol protocol = this.f17673;
        protocol.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = c6980.size();
        C0984 c0984M12310 = null;
        for (int i = 0; i < size; i++) {
            String strM12109 = c6980.m12109(i);
            String strM12111 = c6980.m12111(i);
            if (strM12109.equals(":status")) {
                c0984M12310 = AbstractC7082.m12310("HTTP/1.1 ".concat(strM12111));
            } else if (!f17670.contains(strM12109)) {
                arrayList.add(strM12109);
                arrayList.add(AbstractC5976.m10714(strM12111).toString());
            }
        }
        if (c0984M12310 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C6961 c6961 = new C6961();
        c6961.f17123 = protocol;
        c6961.f17122 = c0984M12310.f941;
        c6961.f17121 = (String) c0984M12310.f939;
        c6961.f17119 = new C6980((String[]) arrayList.toArray(new String[0])).m12108();
        if (z && c6961.f17122 == 100) {
            return null;
        }
        return c6961;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo12222() {
        boolean z;
        C7098 c7098 = this.f17674;
        if (c7098 != null) {
            synchronized (c7098) {
                C7100 c7100 = c7098.f17614;
                if (c7100.f17630) {
                    z = c7100.f17628.m12037();
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo12223() {
        C7098 c7098 = this.f17674;
        c7098.getClass();
        c7098.f17615.close();
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final long mo12224(C6960 c6960) {
        if (AbstractC7051.m12234(c6960)) {
            return AbstractC7059.m12253(c6960);
        }
        return 0L;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6929 mo12225() {
        C7098 c7098 = this.f17674;
        c7098.getClass();
        return c7098;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC7045 mo12226() {
        return this.f17677;
    }

    @Override // p028.InterfaceC7044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC6932 mo12227(C6954 c6954, long j) {
        C7098 c7098 = this.f17674;
        c7098.getClass();
        return c7098.f17615;
    }
}
