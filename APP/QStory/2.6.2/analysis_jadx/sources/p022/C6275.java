package p022;

import java.util.TimeZone;
import p005.C6099;
import p005.C6101;
import p005.InterfaceC6110;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6275 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17300;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C6273 f17302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f17305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6101 f17304 = new C6101();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6101 f17301 = new C6101();

    public C6275(C6273 c6273, long j, boolean z) {
        this.f17302 = c6273;
        this.f17305 = j;
        this.f17303 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C6273 c6273 = this.f17302;
        synchronized (c6273) {
            this.f17300 = true;
            C6101 c6101 = this.f17301;
            j = c6101.f16657;
            c6101.m11481();
            c6273.notifyAll();
        }
        if (j > 0) {
            C6273 c62732 = this.f17302;
            TimeZone timeZone = AbstractC6238.f17190;
            c62732.f17291.m11791(j);
        }
        this.f17302.m11773();
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f17302.f17284;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo10876(p005.C6101 r22, long r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6275.mo10876(飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏, long):long");
    }
}
