package top.linl.dexparser.util;

import java.io.IOException;
import java.io.InputStream;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Reader {
    private final InputStream inputStream;

    public Reader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void close() throws IOException {
        this.inputStream.close();
    }

    public byte[] read(int i) throws IOException {
        byte[] bArr = new byte[i];
        if (this.inputStream.read(bArr) != -1) {
            return bArr;
        }
        C5919.m11246("read -1");
        return null;
    }
}
