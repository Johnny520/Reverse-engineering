package p022;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p013.C6181;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6222;
import p015.C6224;
import p017.AbstractC6238;
import p021.AbstractC6260;
import p021.C6259;
import p021.InterfaceC6253;
import p021.InterfaceC6254;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6282 implements InterfaceC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile boolean f17345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Protocol f17346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile C6273 f17347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6281 f17348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6259 f17349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6181 f17350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List f17344 = AbstractC6238.m11709(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final List f17343 = AbstractC6238.m11709(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public C6282(C6200 c6200, C6181 c6181, C6259 c6259, C6281 c6281) {
        c6200.getClass();
        c6281.getClass();
        this.f17350 = c6181;
        this.f17349 = c6259;
        this.f17348 = c6281;
        List list = c6200.f16979;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f17346 = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p021.InterfaceC6253
    public final void cancel() {
        this.f17345 = true;
        C6273 c6273 = this.f17347;
        if (c6273 != null) {
            c6273.m11769(ErrorCode.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p015.C6205 mo11727(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6282.mo11727(boolean):飘花落叶言世兰楪子苏哲.飘花落叶言子世苏楪兰哲");
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6110 mo11728(C6204 c6204) {
        C6273 c6273 = this.f17347;
        c6273.getClass();
        return c6273.f17287;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC6112 mo11729(C6198 c6198, long j) {
        C6273 c6273 = this.f17347;
        c6273.getClass();
        return c6273.f17288;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo11730() {
        /*
            r4 = this;
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲世苏 r4 = r4.f17347
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰苏世哲 r1 = r4.f17287     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.f17303     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏 r1 = r1.f17301     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.m11483()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6282.mo11730():boolean");
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo11731() {
        C6273 c6273 = this.f17347;
        c6273.getClass();
        c6273.f17288.close();
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11732(C6204 c6204) {
        if (AbstractC6260.m11745(c6204)) {
            return AbstractC6238.m11702(c6204);
        }
        return 0L;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC6109 mo11733() {
        C6273 c6273 = this.f17347;
        c6273.getClass();
        return c6273;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo11734() {
        this.f17348.flush();
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6254 mo11737() {
        return this.f17350;
    }

    @Override // p021.InterfaceC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11738(C6198 c6198) throws IOException {
        int i;
        C6273 c6273;
        boolean z;
        if (this.f17347 != null) {
            return;
        }
        boolean z2 = c6198.f16952 != null;
        C6224 c6224 = c6198.f16953;
        ArrayList arrayList = new ArrayList(c6224.size() + 4);
        arrayList.add(new C6268(c6198.f16954, C6268.f17263));
        ByteString byteString = C6268.f17267;
        C6222 c6222 = c6198.f16955;
        c6222.getClass();
        String strM11672 = c6222.m11672();
        String strM11670 = c6222.m11670();
        if (strM11670 != null) {
            strM11672 = AbstractC0053.m163('?', strM11672, strM11670);
        }
        arrayList.add(new C6268(strM11672, byteString));
        String strM11680 = c6224.m11680("Host");
        if (strM11680 != null) {
            arrayList.add(new C6268(strM11680, C6268.f17268));
        }
        arrayList.add(new C6268(c6222.f17123, C6268.f17266));
        int size = c6224.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM11679 = c6224.m11679(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strM11679.toLowerCase(locale);
            lowerCase.getClass();
            if (!f17344.contains(lowerCase) || (lowerCase.equals("te") && c6224.m11681(i2).equals("trailers"))) {
                arrayList.add(new C6268(lowerCase, c6224.m11681(i2)));
            }
        }
        C6281 c6281 = this.f17348;
        c6281.getClass();
        boolean z3 = !z2;
        synchronized (c6281.f17318) {
            synchronized (c6281) {
                try {
                    if (c6281.f17334 > 1073741823) {
                        c6281.m11792(ErrorCode.REFUSED_STREAM);
                    }
                    if (c6281.f17338) {
                        throw new ConnectionShutdownException();
                    }
                    i = c6281.f17334;
                    c6281.f17334 = i + 2;
                    c6273 = new C6273(i, c6281, z3, false, null);
                    z = !z2 || c6281.f17329 >= c6281.f17328 || c6273.f17286 >= c6273.f17285;
                    if (c6273.m11776()) {
                        c6281.f17340.put(Integer.valueOf(i), c6273);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6281.f17318.m11781(z3, i, arrayList);
        }
        if (z) {
            c6281.f17318.flush();
        }
        this.f17347 = c6273;
        boolean z4 = this.f17345;
        C6273 c62732 = this.f17347;
        if (z4) {
            c62732.getClass();
            c62732.m11769(ErrorCode.CANCEL);
            C5919.m11246("Canceled");
        } else {
            c62732.getClass();
            c62732.f17284.mo11462(this.f17349.f17236);
            C6273 c62733 = this.f17347;
            c62733.getClass();
            c62733.f17283.mo11462(this.f17349.f17235);
        }
    }
}
