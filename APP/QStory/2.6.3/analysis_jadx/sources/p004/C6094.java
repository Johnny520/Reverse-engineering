package p004;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6094 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6110 f16650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16651;

    public /* synthetic */ C6094(InterfaceC6110 interfaceC6110, int i) {
        this.f16651 = i;
        this.f16650 = interfaceC6110;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f16651;
        InterfaceC6110 interfaceC6110 = this.f16650;
        switch (i) {
            case 0:
                return (int) Math.min(((C6092) interfaceC6110).f16647, 2147483647L);
            default:
                C6099 c6099 = (C6099) interfaceC6110;
                if (!c6099.f16672) {
                    return (int) Math.min(c6099.f16671.f16647, 2147483647L);
                }
                C5925.m11307("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16651) {
            case 0:
                break;
            default:
                ((C6099) this.f16650).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f16651;
        InterfaceC6110 interfaceC6110 = this.f16650;
        switch (i) {
            case 0:
                C6092 c6092 = (C6092) interfaceC6110;
                if (c6092.f16647 > 0) {
                    return c6092.readByte() & DefaultClassResolver.NAME;
                }
                return -1;
            default:
                C6099 c6099 = (C6099) interfaceC6110;
                C6092 c60922 = c6099.f16671;
                if (c6099.f16672) {
                    C5925.m11307("closed");
                    return 0;
                }
                if (c60922.f16647 == 0 && c6099.f16673.mo10932(c60922, 8192L) == -1) {
                    return -1;
                }
                return c60922.readByte() & DefaultClassResolver.NAME;
        }
    }

    public final String toString() {
        int i = this.f16651;
        InterfaceC6110 interfaceC6110 = this.f16650;
        switch (i) {
            case 0:
                return ((C6092) interfaceC6110) + ".inputStream()";
            default:
                return ((C6099) interfaceC6110) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f16651) {
            case 1:
                outputStream.getClass();
                C6099 c6099 = (C6099) this.f16650;
                C6092 c6092 = c6099.f16671;
                if (c6099.f16672) {
                    C5925.m11307("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c6092.f16647 == 0 && c6099.f16673.mo10932(c6092, 8192L) == -1) {
                        return j;
                    }
                    long j2 = c6092.f16647;
                    j += j2;
                    AbstractC7739.m13066(j2, 0L, j2);
                    C6098 c6098 = c6092.f16648;
                    while (j2 > 0) {
                        c6098.getClass();
                        int iMin = (int) Math.min(j2, c6098.f16667 - c6098.f16668);
                        outputStream.write(c6098.f16669, c6098.f16668, iMin);
                        int i = c6098.f16668 + iMin;
                        c6098.f16668 = i;
                        long j3 = iMin;
                        c6092.f16647 -= j3;
                        j2 -= j3;
                        if (i == c6098.f16667) {
                            C6098 c6098M11500 = c6098.m11500();
                            c6092.f16648 = c6098M11500;
                            AbstractC6102.m11505(c6098);
                            c6098 = c6098M11500;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m11493() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f16651;
        InterfaceC6110 interfaceC6110 = this.f16650;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((C6092) interfaceC6110).read(bArr, i, i2);
            default:
                C6099 c6099 = (C6099) interfaceC6110;
                C6092 c6092 = c6099.f16671;
                if (!c6099.f16672) {
                    AbstractC7739.m13066(bArr.length, i, i2);
                    if (c6092.f16647 == 0 && c6099.f16673.mo10932(c6092, 8192L) == -1) {
                        return -1;
                    }
                    return c6092.read(bArr, i, i2);
                }
                C5925.m11307("closed");
                return 0;
        }
    }
}
