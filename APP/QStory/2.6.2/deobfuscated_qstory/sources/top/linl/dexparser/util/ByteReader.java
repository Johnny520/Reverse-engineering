package top.linl.dexparser.util;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ByteReader {
    private int position = 0;
    private final byte[] srcData;

    public ByteReader(byte[] bArr) {
        this.srcData = bArr;
    }

    public int getPosition() {
        return this.position;
    }

    public byte[] read(int i) {
        byte[] bArrCopyArrays = Utils.copyArrays(this.srcData, this.position, i);
        this.position += i;
        return bArrCopyArrays;
    }

    public int readUnsignedLeb128() {
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr = this.srcData;
            int i3 = this.position;
            byte b = bArr[i3];
            i |= (b & 127) << (i2 * 7);
            i2++;
            this.position = i3 + 1;
            if ((b & 128) != 128) {
                break;
            }
        } while (i2 < 5);
        return i;
    }

    public void setStartPosition(int i) {
        this.position = i;
    }
}
