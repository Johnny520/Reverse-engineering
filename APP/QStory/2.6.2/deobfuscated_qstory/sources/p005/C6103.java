package p005;

import com.bumptech.glide.AbstractC3055;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6103 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6119 f16660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16661;

    public /* synthetic */ C6103(InterfaceC6119 interfaceC6119, int i) {
        this.f16661 = i;
        this.f16660 = interfaceC6119;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f16661;
        InterfaceC6119 interfaceC6119 = this.f16660;
        switch (i) {
            case 0:
                return (int) Math.min(((C6101) interfaceC6119).f16657, 2147483647L);
            default:
                C6108 c6108 = (C6108) interfaceC6119;
                if (!c6108.f16682) {
                    return (int) Math.min(c6108.f16681.f16657, 2147483647L);
                }
                C5919.m11246("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f16661) {
            case 0:
                break;
            default:
                ((C6108) this.f16660).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f16661;
        InterfaceC6119 interfaceC6119 = this.f16660;
        switch (i) {
            case 0:
                C6101 c6101 = (C6101) interfaceC6119;
                if (c6101.f16657 > 0) {
                    return c6101.readByte() & DefaultClassResolver.NAME;
                }
                return -1;
            default:
                C6108 c6108 = (C6108) interfaceC6119;
                C6101 c61012 = c6108.f16681;
                if (c6108.f16682) {
                    C5919.m11246("closed");
                    return 0;
                }
                if (c61012.f16657 == 0 && c6108.f16683.mo10876(c61012, 8192L) == -1) {
                    return -1;
                }
                return c61012.readByte() & DefaultClassResolver.NAME;
        }
    }

    public final String toString() {
        int i = this.f16661;
        InterfaceC6119 interfaceC6119 = this.f16660;
        switch (i) {
            case 0:
                return ((C6101) interfaceC6119) + ".inputStream()";
            default:
                return ((C6108) interfaceC6119) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f16661) {
            case 1:
                outputStream.getClass();
                C6108 c6108 = (C6108) this.f16660;
                C6101 c6101 = c6108.f16681;
                if (c6108.f16682) {
                    C5919.m11246("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c6101.f16657 == 0 && c6108.f16683.mo10876(c6101, 8192L) == -1) {
                        return j;
                    }
                    long j2 = c6101.f16657;
                    j += j2;
                    AbstractC3055.m6628(j2, 0L, j2);
                    C6107 c6107 = c6101.f16658;
                    while (j2 > 0) {
                        c6107.getClass();
                        int iMin = (int) Math.min(j2, c6107.f16677 - c6107.f16678);
                        outputStream.write(c6107.f16679, c6107.f16678, iMin);
                        int i = c6107.f16678 + iMin;
                        c6107.f16678 = i;
                        long j3 = iMin;
                        c6101.f16657 -= j3;
                        j2 -= j3;
                        if (i == c6107.f16677) {
                            C6107 c6107M11507 = c6107.m11507();
                            c6101.f16658 = c6107M11507;
                            AbstractC6111.m11512(c6107);
                            c6107 = c6107M11507;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m11500() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f16661;
        InterfaceC6119 interfaceC6119 = this.f16660;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((C6101) interfaceC6119).read(bArr, i, i2);
            default:
                C6108 c6108 = (C6108) interfaceC6119;
                C6101 c6101 = c6108.f16681;
                if (!c6108.f16682) {
                    AbstractC3055.m6628(bArr.length, i, i2);
                    if (c6101.f16657 == 0 && c6108.f16683.mo10876(c6101, 8192L) == -1) {
                        return -1;
                    }
                    return c6101.read(bArr, i, i2);
                }
                C5919.m11246("closed");
                return 0;
        }
    }
}
