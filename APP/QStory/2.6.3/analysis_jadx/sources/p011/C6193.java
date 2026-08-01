package p011;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.net.ProtocolException;
import p004.AbstractC6112;
import p004.C6092;
import p004.InterfaceC6101;
import p012.InterfaceC6215;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6193 extends AbstractC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17020;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f17021;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C0734 f17022;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17023;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f17025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f17026;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6193(C0734 c0734, InterfaceC6101 interfaceC6101, long j, boolean z) {
        super(interfaceC6101);
        interfaceC6101.getClass();
        this.f17022 = c0734;
        this.f17025 = j;
        this.f17026 = z;
        this.f17020 = true;
        if (j == 0) {
            m11615(null);
        }
    }

    @Override // p004.AbstractC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17024) {
            return;
        }
        this.f17024 = true;
        try {
            super.close();
            m11615(null);
        } catch (IOException e) {
            IOException iOExceptionM11615 = m11615(e);
            iOExceptionM11615.getClass();
            throw iOExceptionM11615;
        }
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        C0734 c0734 = this.f17022;
        c6092.getClass();
        if (this.f17024) {
            C5925.m11311("closed");
            return 0L;
        }
        try {
            long jMo10932 = this.f16693.mo10932(c6092, 8192L);
            if (this.f17020) {
                this.f17020 = false;
            }
            if (jMo10932 == -1) {
                m11615(null);
                return -1L;
            }
            long j2 = this.f17021 + jMo10932;
            long j3 = this.f17025;
            if (j3 == -1 || j2 <= j3) {
                this.f17021 = j2;
                if (((InterfaceC6215) c0734.f2069).mo11663()) {
                    m11615(null);
                }
                return jMo10932;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionM11615 = m11615(e);
            iOExceptionM11615.getClass();
            throw iOExceptionM11615;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final IOException m11615(IOException iOException) {
        if (this.f17023) {
            return iOException;
        }
        this.f17023 = true;
        if (iOException == null && this.f17020) {
            this.f17020 = false;
        }
        return C0734.m1536(this.f17022, this.f17026, iOException, 8);
    }
}
