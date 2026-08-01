package p020;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p004.C6092;
import p007.C6149;
import p007.C6151;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6287 extends AbstractC6290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C6291 f17355;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6287(C6291 c6291, C6149 c6149, long j) {
        super(c6291, c6149);
        c6149.getClass();
        this.f17355 = c6291;
        this.f17354 = j;
        if (j == 0) {
            m11817(C6151.f16892);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM11700;
        if (this.f17364) {
            return;
        }
        if (this.f17354 != 0) {
            TimeZone timeZone = AbstractC6230.f17167;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM11700 = AbstractC6230.m11700(this, 100);
            } catch (IOException unused) {
                zM11700 = false;
            }
            if (!zM11700) {
                this.f17355.f17370.mo11621();
                m11817(C6291.f17366);
            }
        }
        this.f17364 = true;
    }

    @Override // p020.AbstractC6290, p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        c6092.getClass();
        if (this.f17364) {
            C5925.m11311("closed");
            return 0L;
        }
        long j2 = this.f17354;
        if (j2 == 0) {
            return -1L;
        }
        long jMo10932 = super.mo10932(c6092, Math.min(j2, 8192L));
        if (jMo10932 == -1) {
            this.f17355.f17370.mo11621();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m11817(C6291.f17366);
            throw protocolException;
        }
        long j3 = this.f17354 - jMo10932;
        this.f17354 = j3;
        if (j3 == 0) {
            m11817(C6151.f16892);
        }
        return jMo10932;
    }
}
