package p005;

import java.io.IOException;
import java.nio.ByteBuffer;
import okio.ByteString;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6116 implements InterfaceC6120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6101 f16696;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6112 f16698;

    public C6116(InterfaceC6112 interfaceC6112) {
        interfaceC6112.getClass();
        this.f16698 = interfaceC6112;
        this.f16696 = new C6101();
    }

    @Override // p005.InterfaceC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC6112 interfaceC6112 = this.f16698;
        if (this.f16697) {
            return;
        }
        try {
            C6101 c6101 = this.f16696;
            long j = c6101.f16657;
            if (j > 0) {
                interfaceC6112.mo10877(c6101, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC6112.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16697 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p005.InterfaceC6120, p005.InterfaceC6112, java.io.Flushable
    public final void flush() {
        if (this.f16697) {
            C5919.m11250("closed");
            return;
        }
        C6101 c6101 = this.f16696;
        long j = c6101.f16657;
        InterfaceC6112 interfaceC6112 = this.f16698;
        if (j > 0) {
            interfaceC6112.mo10877(c6101, j);
        }
        interfaceC6112.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16697;
    }

    public final String toString() {
        return "buffer(" + this.f16698 + ')';
    }

    @Override // p005.InterfaceC6120
    public final InterfaceC6120 write(byte[] bArr) {
        bArr.getClass();
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.write(bArr, 0, bArr.length);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6120
    public final InterfaceC6120 writeByte(int i) {
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.m11474(i);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6120
    public final InterfaceC6120 writeInt(int i) {
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.m11463(i);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6120
    public final InterfaceC6120 writeShort(int i) {
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.m11465(i);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC6120 mo11464(ByteString byteString) {
        byteString.getClass();
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.m11476(byteString);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final InterfaceC6120 mo11470(byte[] bArr, int i) {
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.write(bArr, 0, i);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo10877(C6101 c6101, long j) {
        c6101.getClass();
        if (this.f16697) {
            C5919.m11250("closed");
        } else {
            this.f16696.mo10877(c6101, j);
            m11515();
        }
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC6120 mo11477(String str) {
        str.getClass();
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        this.f16696.m11498(str);
        m11515();
        return this;
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10878() {
        return this.f16698.mo10878();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6120 m11515() {
        if (this.f16697) {
            C5919.m11250("closed");
            return null;
        }
        C6101 c6101 = this.f16696;
        long jM11478 = c6101.m11478();
        if (jM11478 > 0) {
            this.f16698.mo10877(c6101, jM11478);
        }
        return this;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6101 mo11482() {
        return this.f16696;
    }

    @Override // p005.InterfaceC6120
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final long mo11495(InterfaceC6110 interfaceC6110) throws IOException {
        long j = 0;
        while (true) {
            long jMo10876 = ((C6117) interfaceC6110).mo10876(this.f16696, 8192L);
            if (jMo10876 == -1) {
                return j;
            }
            j += jMo10876;
            m11515();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f16697) {
            int iWrite = this.f16696.write(byteBuffer);
            m11515();
            return iWrite;
        }
        C5919.m11250("closed");
        return 0;
    }
}
