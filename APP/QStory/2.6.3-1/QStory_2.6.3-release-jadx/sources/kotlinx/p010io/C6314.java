package kotlinx.p010io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6314 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6313 f15499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f15500;

    public C6314(InterfaceC7372 interfaceC7372, InterfaceC6313 interfaceC6313) {
        this.f15500 = interfaceC7372;
        this.f15499 = interfaceC6313;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!((Boolean) this.f15500.invoke()).booleanValue()) {
            return (int) Math.min(this.f15499.mo11162().f15487, 2147483647L);
        }
        C6755.m11866("Underlying source is closed.");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f15499.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (((Boolean) this.f15500.invoke()).booleanValue()) {
            C6755.m11866("Underlying source is closed.");
            return 0;
        }
        AbstractC6310.m11179(bArr.length, i, i2);
        return this.f15499.mo11166(i, bArr, i2 + i);
    }

    public final String toString() {
        return this.f15499 + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!((Boolean) this.f15500.invoke()).booleanValue()) {
            InterfaceC6313 interfaceC6313 = this.f15499;
            if (interfaceC6313.mo11163()) {
                return -1;
            }
            return interfaceC6313.readByte() & DefaultClassResolver.NAME;
        }
        C6755.m11866("Underlying source is closed.");
        return 0;
    }
}
