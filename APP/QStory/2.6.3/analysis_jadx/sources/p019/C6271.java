package p019;

import java.util.TimeZone;
import p004.C6090;
import p004.C6092;
import p004.InterfaceC6101;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6271 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C6269 f17284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f17287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6092 f17286 = new C6092();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6092 f17283 = new C6092();

    public C6271(C6269 c6269, long j, boolean z) {
        this.f17284 = c6269;
        this.f17287 = j;
        this.f17285 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C6269 c6269 = this.f17284;
        synchronized (c6269) {
            this.f17282 = true;
            C6092 c6092 = this.f17283;
            j = c6092.f16647;
            c6092.m11475();
            c6269.notifyAll();
        }
        if (j > 0) {
            C6269 c62692 = this.f17284;
            TimeZone timeZone = AbstractC6230.f17167;
            c62692.f17273.m11808(j);
        }
        this.f17284.m11790();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo10932(p004.C6092 r22, long r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6271.mo10932(飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, long):long");
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f17284.f17266;
    }
}
