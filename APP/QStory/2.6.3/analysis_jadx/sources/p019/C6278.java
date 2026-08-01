package p019;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6149;
import p007.C6151;
import p011.C6207;
import p012.AbstractC6222;
import p012.C6221;
import p012.InterfaceC6215;
import p012.InterfaceC6216;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6278 implements InterfaceC6215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile boolean f17327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Protocol f17328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile C6269 f17329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6277 f17330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6221 f17331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6207 f17332;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List f17326 = AbstractC6230.m11701(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final List f17325 = AbstractC6230.m11701(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    public C6278(C6127 c6127, C6207 c6207, C6221 c6221, C6277 c6277) {
        c6127.getClass();
        c6277.getClass();
        this.f17332 = c6207;
        this.f17331 = c6221;
        this.f17330 = c6277;
        List list = c6127.f16740;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f17328 = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p012.InterfaceC6215
    public final void cancel() {
        this.f17327 = true;
        C6269 c6269 = this.f17329;
        if (c6269 != null) {
            c6269.m11786(ErrorCode.CANCEL);
        }
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11659() {
        this.f17330.flush();
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6101 mo11660(C6131 c6131) {
        C6269 c6269 = this.f17329;
        c6269.getClass();
        return c6269.f17269;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11661(C6125 c6125) throws IOException {
        int i;
        C6269 c6269;
        boolean z;
        if (this.f17329 != null) {
            return;
        }
        boolean z2 = c6125.f16713 != null;
        C6151 c6151 = c6125.f16714;
        ArrayList arrayList = new ArrayList(c6151.size() + 4);
        arrayList.add(new C6264(c6125.f16715, C6264.f17245));
        ByteString byteString = C6264.f17249;
        C6149 c6149 = c6125.f16716;
        c6149.getClass();
        String strM11543 = c6149.m11543();
        String strM11541 = c6149.m11541();
        if (strM11541 != null) {
            strM11543 = AbstractC0053.m164('?', strM11543, strM11541);
        }
        arrayList.add(new C6264(strM11543, byteString));
        String strM11551 = c6151.m11551("Host");
        if (strM11551 != null) {
            arrayList.add(new C6264(strM11551, C6264.f17250));
        }
        arrayList.add(new C6264(c6149.f16884, C6264.f17248));
        int size = c6151.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM11550 = c6151.m11550(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strM11550.toLowerCase(locale);
            lowerCase.getClass();
            if (!f17326.contains(lowerCase) || (lowerCase.equals("te") && c6151.m11552(i2).equals("trailers"))) {
                arrayList.add(new C6264(lowerCase, c6151.m11552(i2)));
            }
        }
        C6277 c6277 = this.f17330;
        c6277.getClass();
        boolean z3 = !z2;
        synchronized (c6277.f17300) {
            synchronized (c6277) {
                try {
                    if (c6277.f17316 > 1073741823) {
                        c6277.m11809(ErrorCode.REFUSED_STREAM);
                    }
                    if (c6277.f17320) {
                        throw new ConnectionShutdownException();
                    }
                    i = c6277.f17316;
                    c6277.f17316 = i + 2;
                    c6269 = new C6269(i, c6277, z3, false, null);
                    z = !z2 || c6277.f17311 >= c6277.f17310 || c6269.f17268 >= c6269.f17267;
                    if (c6269.m11793()) {
                        c6277.f17322.put(Integer.valueOf(i), c6269);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6277.f17300.m11798(z3, i, arrayList);
        }
        if (z) {
            c6277.f17300.flush();
        }
        this.f17329 = c6269;
        boolean z4 = this.f17327;
        C6269 c62692 = this.f17329;
        if (z4) {
            c62692.getClass();
            c62692.m11786(ErrorCode.CANCEL);
            C5925.m11307("Canceled");
        } else {
            c62692.getClass();
            c62692.f17266.mo11455(this.f17331.f17150);
            C6269 c62693 = this.f17329;
            c62693.getClass();
            c62693.f17265.mo11455(this.f17331.f17149);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p007.C6132 mo11662(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6278.mo11662(boolean):飘花落叶言世兰子哲苏楪.飘花落叶言子世苏楪兰哲");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo11663() {
        /*
            r4 = this;
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲世苏 r4 = r4.f17329
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏世哲 r1 = r4.f17269     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.f17285     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏 r1 = r1.f17283     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.m11478()     // Catch: java.lang.Throwable -> L17
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
        throw new UnsupportedOperationException("Method not decompiled: p019.C6278.mo11663():boolean");
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11664() {
        C6269 c6269 = this.f17329;
        c6269.getClass();
        c6269.f17270.close();
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final long mo11665(C6131 c6131) {
        if (AbstractC6222.m11675(c6131)) {
            return AbstractC6230.m11694(c6131);
        }
        return 0L;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6100 mo11666() {
        C6269 c6269 = this.f17329;
        c6269.getClass();
        return c6269;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6216 mo11667() {
        return this.f17332;
    }

    @Override // p012.InterfaceC6215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC6103 mo11668(C6125 c6125, long j) {
        C6269 c6269 = this.f17329;
        c6269.getClass();
        return c6269.f17270;
    }
}
