package p053dd;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1950b {
    public byte[] bytes;
    public String json;
    public int type;
    public String uri;

    public C1950b(int i10, String str, String str2, byte[] bArr) {
        this.type = i10;
        this.uri = str;
        this.json = str2;
        this.bytes = bArr;
    }

    private String bytesToHex(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public String toString() {
        return "CgiData{type=" + this.type + ", uri='" + this.uri + "', json='" + this.json + "', hex='" + bytesToHex(this.bytes) + "'}";
    }
}
