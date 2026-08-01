package p015;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p005.InterfaceC6119;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6203 extends Reader {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStreamReader f16993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Charset f16994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6119 f16996;

    public C6203(InterfaceC6119 interfaceC6119, Charset charset) {
        interfaceC6119.getClass();
        charset.getClass();
        this.f16996 = interfaceC6119;
        this.f16994 = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16995 = true;
        InputStreamReader inputStreamReader = this.f16993;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f16996.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.f16995) {
            C5919.m11246("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.f16993;
        if (inputStreamReader == null) {
            InterfaceC6119 interfaceC6119 = this.f16996;
            inputStreamReader = new InputStreamReader(interfaceC6119.mo11497(), AbstractC6238.m11701(interfaceC6119, this.f16994));
            this.f16993 = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
