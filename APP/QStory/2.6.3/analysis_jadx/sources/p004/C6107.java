package p004;

import java.io.IOException;
import java.nio.ByteBuffer;
import okio.ByteString;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6107 implements InterfaceC6111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6092 f16686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6103 f16688;

    public C6107(InterfaceC6103 interfaceC6103) {
        interfaceC6103.getClass();
        this.f16688 = interfaceC6103;
        this.f16686 = new C6092();
    }

    @Override // p004.InterfaceC6103, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC6103 interfaceC6103 = this.f16688;
        if (this.f16687) {
            return;
        }
        try {
            C6092 c6092 = this.f16686;
            long j = c6092.f16647;
            if (j > 0) {
                interfaceC6103.mo10935(c6092, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC6103.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16687 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p004.InterfaceC6111, p004.InterfaceC6103, java.io.Flushable
    public final void flush() {
        if (this.f16687) {
            C5925.m11311("closed");
            return;
        }
        C6092 c6092 = this.f16686;
        long j = c6092.f16647;
        InterfaceC6103 interfaceC6103 = this.f16688;
        if (j > 0) {
            interfaceC6103.mo10935(c6092, j);
        }
        interfaceC6103.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16687;
    }

    public final String toString() {
        return "buffer(" + this.f16688 + ')';
    }

    @Override // p004.InterfaceC6111
    public final InterfaceC6111 write(byte[] bArr) {
        bArr.getClass();
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.write(bArr, 0, bArr.length);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    public final InterfaceC6111 writeByte(int i) {
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.m11470(i);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    public final InterfaceC6111 writeInt(int i) {
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.m11458(i);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    public final InterfaceC6111 writeShort(int i) {
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.m11457(i);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final InterfaceC6111 mo11459(ByteString byteString) {
        byteString.getClass();
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.m11471(byteString);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC6111 mo11463(String str) {
        str.getClass();
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.m11491(str);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final InterfaceC6111 mo11465(byte[] bArr, int i) {
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        this.f16686.write(bArr, 0, i);
        m11508();
        return this;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo11468(InterfaceC6101 interfaceC6101) throws IOException {
        long j = 0;
        while (true) {
            long jMo10932 = ((C6108) interfaceC6101).mo10932(this.f16686, 8192L);
            if (jMo10932 == -1) {
                return j;
            }
            j += jMo10932;
            m11508();
        }
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10934() {
        return this.f16688.mo10934();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6111 m11508() {
        if (this.f16687) {
            C5925.m11311("closed");
            return null;
        }
        C6092 c6092 = this.f16686;
        long jM11472 = c6092.m11472();
        if (jM11472 > 0) {
            this.f16688.mo10935(c6092, jM11472);
        }
        return this;
    }

    @Override // p004.InterfaceC6111
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6092 mo11476() {
        return this.f16686;
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10935(C6092 c6092, long j) {
        c6092.getClass();
        if (this.f16687) {
            C5925.m11311("closed");
        } else {
            this.f16686.mo10935(c6092, j);
            m11508();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f16687) {
            int iWrite = this.f16686.write(byteBuffer);
            m11508();
            return iWrite;
        }
        C5925.m11311("closed");
        return 0;
    }
}
