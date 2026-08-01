package kotlinx.io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5482 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5481 f15154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f15155;

    public C5482(InterfaceC6543 interfaceC6543, InterfaceC5481 interfaceC5481) {
        this.f15155 = interfaceC6543;
        this.f15154 = interfaceC5481;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!((Boolean) this.f15155.invoke()).booleanValue()) {
            return (int) Math.min(this.f15154.mo10603().f15142, 2147483647L);
        }
        C5925.m11307("Underlying source is closed.");
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
            C5925.m11307("Underlying source is closed.");
            return 0;
        }
        AbstractC5478.m10620(bArr.length, i, i2);
        return this.f15154.mo10607(i, bArr, i2 + i);
    }

    public final String toString() {
        return this.f15154 + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!((Boolean) this.f15155.invoke()).booleanValue()) {
            InterfaceC5481 interfaceC5481 = this.f15154;
            if (interfaceC5481.mo10604()) {
                return -1;
            }
            return interfaceC5481.readByte() & DefaultClassResolver.NAME;
        }
        C5925.m11307("Underlying source is closed.");
        return 0;
    }
}
