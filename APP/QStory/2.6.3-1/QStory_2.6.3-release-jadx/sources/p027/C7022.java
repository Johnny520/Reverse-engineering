package p027;

import androidx.compose.foundation.lazy.layout.C1575;
import java.io.IOException;
import java.net.ProtocolException;
import p020.AbstractC6941;
import p020.C6921;
import p020.InterfaceC6930;
import p028.InterfaceC7044;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7022 extends AbstractC6941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17365;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f17366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C1575 f17367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f17370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f17371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7022(C1575 c1575, InterfaceC6930 interfaceC6930, long j, boolean z) {
        super(interfaceC6930);
        interfaceC6930.getClass();
        this.f17367 = c1575;
        this.f17370 = j;
        this.f17371 = z;
        this.f17365 = true;
        if (j == 0) {
            m12174(null);
        }
    }

    @Override // p020.AbstractC6941, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17369) {
            return;
        }
        this.f17369 = true;
        try {
            super.close();
            m12174(null);
        } catch (IOException e) {
            IOException iOExceptionM12174 = m12174(e);
            iOExceptionM12174.getClass();
            throw iOExceptionM12174;
        }
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        C1575 c1575 = this.f17367;
        c6921.getClass();
        if (this.f17369) {
            C6755.m11870("closed");
            return 0L;
        }
        try {
            long jMo11491 = this.f17038.mo11491(c6921, 8192L);
            if (this.f17365) {
                this.f17365 = false;
            }
            if (jMo11491 == -1) {
                m12174(null);
                return -1L;
            }
            long j2 = this.f17366 + jMo11491;
            long j3 = this.f17370;
            if (j3 == -1 || j2 <= j3) {
                this.f17366 = j2;
                if (((InterfaceC7044) c1575.f2414).mo12222()) {
                    m12174(null);
                }
                return jMo11491;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionM12174 = m12174(e);
            iOExceptionM12174.getClass();
            throw iOExceptionM12174;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final IOException m12174(IOException iOException) {
        if (this.f17368) {
            return iOException;
        }
        this.f17368 = true;
        if (iOException == null && this.f17365) {
            this.f17365 = false;
        }
        return C1575.m2096(this.f17367, this.f17371, iOException, 8);
    }
}
