package p020;

import java.io.IOException;
import java.nio.ByteBuffer;
import okio.ByteString;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6936 implements InterfaceC6940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6921 f17031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6932 f17033;

    public C6936(InterfaceC6932 interfaceC6932) {
        interfaceC6932.getClass();
        this.f17033 = interfaceC6932;
        this.f17031 = new C6921();
    }

    @Override // p020.InterfaceC6932, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC6932 interfaceC6932 = this.f17033;
        if (this.f17032) {
            return;
        }
        try {
            C6921 c6921 = this.f17031;
            long j = c6921.f16992;
            if (j > 0) {
                interfaceC6932.mo11494(c6921, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC6932.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f17032 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p020.InterfaceC6940, p020.InterfaceC6932, java.io.Flushable
    public final void flush() {
        if (this.f17032) {
            C6755.m11870("closed");
            return;
        }
        C6921 c6921 = this.f17031;
        long j = c6921.f16992;
        InterfaceC6932 interfaceC6932 = this.f17033;
        if (j > 0) {
            interfaceC6932.mo11494(c6921, j);
        }
        interfaceC6932.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17032;
    }

    public final String toString() {
        return "buffer(" + this.f17033 + ')';
    }

    @Override // p020.InterfaceC6940
    public final InterfaceC6940 write(byte[] bArr) {
        bArr.getClass();
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.write(bArr, 0, bArr.length);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    public final InterfaceC6940 writeByte(int i) {
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.m12029(i);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    public final InterfaceC6940 writeInt(int i) {
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.m12017(i);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    public final InterfaceC6940 writeShort(int i) {
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.m12016(i);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final InterfaceC6940 mo12018(ByteString byteString) {
        byteString.getClass();
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.m12030(byteString);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC6940 mo12022(String str) {
        str.getClass();
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.m12050(str);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final InterfaceC6940 mo12024(byte[] bArr, int i) {
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        this.f17031.write(bArr, 0, i);
        m12067();
        return this;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo12027(InterfaceC6930 interfaceC6930) throws IOException {
        long j = 0;
        while (true) {
            long jMo11491 = ((C6937) interfaceC6930).mo11491(this.f17031, 8192L);
            if (jMo11491 == -1) {
                return j;
            }
            j += jMo11491;
            m12067();
        }
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11493() {
        return this.f17033.mo11493();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6940 m12067() {
        if (this.f17032) {
            C6755.m11870("closed");
            return null;
        }
        C6921 c6921 = this.f17031;
        long jM12031 = c6921.m12031();
        if (jM12031 > 0) {
            this.f17033.mo11494(c6921, jM12031);
        }
        return this;
    }

    @Override // p020.InterfaceC6940
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C6921 mo12035() {
        return this.f17031;
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11494(C6921 c6921, long j) {
        c6921.getClass();
        if (this.f17032) {
            C6755.m11870("closed");
        } else {
            this.f17031.mo11494(c6921, j);
            m12067();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f17032) {
            int iWrite = this.f17031.write(byteBuffer);
            m12067();
            return iWrite;
        }
        C6755.m11870("closed");
        return 0;
    }
}
