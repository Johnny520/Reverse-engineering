package p020;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p007.C6149;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6288 extends AbstractC6290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17357;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C6291 f17358;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6288(C6291 c6291, C6149 c6149) {
        super(c6291, c6149);
        c6149.getClass();
        this.f17358 = c6291;
        this.f17356 = -1L;
        this.f17357 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM11700;
        if (this.f17364) {
            return;
        }
        if (this.f17357) {
            TimeZone timeZone = AbstractC6230.f17167;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM11700 = AbstractC6230.m11700(this, 100);
            } catch (IOException unused) {
                zM11700 = false;
            }
            if (!zM11700) {
                this.f17358.f17370.mo11621();
                m11817(C6291.f17366);
            }
        }
        this.f17364 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.f17357 == false) goto L46;
     */
    @Override // p020.AbstractC6290, p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo10932(p004.C6092 r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020.C6288.mo10932(飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, long):long");
    }
}
