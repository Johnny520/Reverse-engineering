package p007;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p004.InterfaceC6110;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6130 extends Reader {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStreamReader f16754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Charset f16755;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6110 f16757;

    public C6130(InterfaceC6110 interfaceC6110, Charset charset) {
        interfaceC6110.getClass();
        charset.getClass();
        this.f16757 = interfaceC6110;
        this.f16755 = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16756 = true;
        InputStreamReader inputStreamReader = this.f16754;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f16757.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.f16756) {
            C5925.m11307("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.f16754;
        if (inputStreamReader == null) {
            InterfaceC6110 interfaceC6110 = this.f16757;
            inputStreamReader = new InputStreamReader(interfaceC6110.mo11490(), AbstractC6230.m11693(interfaceC6110, this.f16755));
            this.f16754 = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
