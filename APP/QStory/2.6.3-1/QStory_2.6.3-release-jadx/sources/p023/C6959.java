package p023;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p020.InterfaceC6939;
import p029.AbstractC7059;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6959 extends Reader {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStreamReader f17099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Charset f17100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6939 f17102;

    public C6959(InterfaceC6939 interfaceC6939, Charset charset) {
        interfaceC6939.getClass();
        charset.getClass();
        this.f17102 = interfaceC6939;
        this.f17100 = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17101 = true;
        InputStreamReader inputStreamReader = this.f17099;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f17102.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.f17101) {
            C6755.m11866("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.f17099;
        if (inputStreamReader == null) {
            InterfaceC6939 interfaceC6939 = this.f17102;
            inputStreamReader = new InputStreamReader(interfaceC6939.mo12049(), AbstractC7059.m12252(interfaceC6939, this.f17100));
            this.f17099 = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
