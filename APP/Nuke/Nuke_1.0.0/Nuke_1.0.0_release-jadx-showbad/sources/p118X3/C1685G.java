package p118X3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: X3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1685G extends Reader {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2708g f5754d;

    /* JADX INFO: renamed from: e */
    public final Charset f5755e;

    /* JADX INFO: renamed from: f */
    public boolean f5756f;

    /* JADX INFO: renamed from: g */
    public InputStreamReader f5757g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1685G(InterfaceC2708g interfaceC2708g, Charset charset) {
        AbstractC1665j.m2985e(interfaceC2708g, "source");
        AbstractC1665j.m2985e(charset, "charset");
        this.f5754d = interfaceC2708g;
        this.f5755e = charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5756f = true;
        InputStreamReader inputStreamReader = this.f5757g;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f5754d.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Reader
    public final int read(char[] cArr, int i5, int i6) throws IOException {
        AbstractC1665j.m2985e(cArr, "cbuf");
        if (this.f5756f) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f5757g;
        if (inputStreamReader == null) {
            InterfaceC2708g interfaceC2708g = this.f5754d;
            inputStreamReader = new InputStreamReader(interfaceC2708g.mo4700B(), AbstractC1776g.m3178e(interfaceC2708g, this.f5755e));
            this.f5757g = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i5, i6);
    }
}
