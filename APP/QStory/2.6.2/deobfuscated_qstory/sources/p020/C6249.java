package p020;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p015.C6222;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6249 extends AbstractC6251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17209;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17210;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C6252 f17211;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6249(C6252 c6252, C6222 c6222) {
        super(c6252, c6222);
        c6222.getClass();
        this.f17211 = c6252;
        this.f17209 = -1L;
        this.f17210 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM11708;
        if (this.f17217) {
            return;
        }
        if (this.f17210) {
            TimeZone timeZone = AbstractC6238.f17190;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM11708 = AbstractC6238.m11708(this, 100);
            } catch (IOException unused) {
                zM11708 = false;
            }
            if (!zM11708) {
                this.f17211.f17223.mo11602();
                m11726(C6252.f17219);
            }
        }
        this.f17217 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.f17210 == false) goto L46;
     */
    @Override // p020.AbstractC6251, p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo10876(p005.C6101 r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020.C6249.mo10876(飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏, long):long");
    }
}
