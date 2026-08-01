package kotlinx.io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5481 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5480 f15154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f15155;

    public C5481(InterfaceC6542 interfaceC6542, InterfaceC5480 interfaceC5480) {
        this.f15155 = interfaceC6542;
        this.f15154 = interfaceC5480;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!((Boolean) this.f15155.invoke()).booleanValue()) {
            return (int) Math.min(this.f15154.mo10600().f15142, 2147483647L);
        }
        C5919.m11246("Underlying source is closed.");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f15154.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (((Boolean) this.f15155.invoke()).booleanValue()) {
            C5919.m11246("Underlying source is closed.");
            return 0;
        }
        AbstractC5477.m10616(bArr.length, i, i2);
        return this.f15154.mo10603(i, bArr, i2 + i);
    }

    public final String toString() {
        return this.f15154 + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!((Boolean) this.f15155.invoke()).booleanValue()) {
            InterfaceC5480 interfaceC5480 = this.f15154;
            if (interfaceC5480.mo10601()) {
                return -1;
            }
            return interfaceC5480.readByte() & DefaultClassResolver.NAME;
        }
        C5919.m11246("Underlying source is closed.");
        return 0;
    }
}
