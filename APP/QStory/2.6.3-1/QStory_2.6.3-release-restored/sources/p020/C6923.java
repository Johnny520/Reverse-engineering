package p020;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6923 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6939 f16995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16996;

    public /* synthetic */ C6923(InterfaceC6939 interfaceC6939, int i) {
        this.f16996 = i;
        this.f16995 = interfaceC6939;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f16996;
        InterfaceC6939 interfaceC6939 = this.f16995;
        switch (i) {
            case 0:
                return (int) Math.min(((C6921) interfaceC6939).f16992, 2147483647L);
            default:
                C6928 c6928 = (C6928) interfaceC6939;
                if (!c6928.f17017) {
                    return (int) Math.min(c6928.f17016.f16992, 2147483647L);
                }
                C6755.m11866("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16996) {
            case 0:
                break;
            default:
                ((C6928) this.f16995).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f16996;
        InterfaceC6939 interfaceC6939 = this.f16995;
        switch (i) {
            case 0:
                C6921 c6921 = (C6921) interfaceC6939;
                if (c6921.f16992 > 0) {
                    return c6921.readByte() & DefaultClassResolver.NAME;
                }
                return -1;
            default:
                C6928 c6928 = (C6928) interfaceC6939;
                C6921 c69212 = c6928.f17016;
                if (c6928.f17017) {
                    C6755.m11866("closed");
                    return 0;
                }
                if (c69212.f16992 == 0 && c6928.f17018.mo11491(c69212, 8192L) == -1) {
                    return -1;
                }
                return c69212.readByte() & DefaultClassResolver.NAME;
        }
    }

    public final String toString() {
        int i = this.f16996;
        InterfaceC6939 interfaceC6939 = this.f16995;
        switch (i) {
            case 0:
                return ((C6921) interfaceC6939) + ".inputStream()";
            default:
                return ((C6928) interfaceC6939) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f16996) {
            case 1:
                outputStream.getClass();
                C6928 c6928 = (C6928) this.f16995;
                C6921 c6921 = c6928.f17016;
                if (c6928.f17017) {
                    C6755.m11866("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c6921.f16992 == 0 && c6928.f17018.mo11491(c6921, 8192L) == -1) {
                        return j;
                    }
                    long j2 = c6921.f16992;
                    j += j2;
                    AbstractC8568.m13625(j2, 0L, j2);
                    C6927 c6927 = c6921.f16993;
                    while (j2 > 0) {
                        c6927.getClass();
                        int iMin = (int) Math.min(j2, c6927.f17012 - c6927.f17013);
                        outputStream.write(c6927.f17014, c6927.f17013, iMin);
                        int i = c6927.f17013 + iMin;
                        c6927.f17013 = i;
                        long j3 = iMin;
                        c6921.f16992 -= j3;
                        j2 -= j3;
                        if (i == c6927.f17012) {
                            C6927 c6927M12059 = c6927.m12059();
                            c6921.f16993 = c6927M12059;
                            AbstractC6931.m12064(c6927);
                            c6927 = c6927M12059;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m12052() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f16996;
        InterfaceC6939 interfaceC6939 = this.f16995;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((C6921) interfaceC6939).read(bArr, i, i2);
            default:
                C6928 c6928 = (C6928) interfaceC6939;
                C6921 c6921 = c6928.f17016;
                if (!c6928.f17017) {
                    AbstractC8568.m13625(bArr.length, i, i2);
                    if (c6921.f16992 == 0 && c6928.f17018.mo11491(c6921, 8192L) == -1) {
                        return -1;
                    }
                    return c6921.read(bArr, i, i2);
                }
                C6755.m11866("closed");
                return 0;
        }
    }
}
