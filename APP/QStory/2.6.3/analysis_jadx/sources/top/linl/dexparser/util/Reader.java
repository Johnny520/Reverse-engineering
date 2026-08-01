package top.linl.dexparser.util;

import java.io.IOException;
import java.io.InputStream;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C5925.m11307("read -1");
        return null;
    }
}
