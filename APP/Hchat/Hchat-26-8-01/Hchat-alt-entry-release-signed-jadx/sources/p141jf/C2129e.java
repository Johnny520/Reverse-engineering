package p141jf;

import ac.C0058k;
import af.C0081d;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: jf.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2129e {

    /* JADX INFO: renamed from: a */
    public final int f7097a;

    /* JADX INFO: renamed from: b */
    public final int f7098b;

    /* JADX INFO: renamed from: c */
    public final int f7099c;

    /* JADX INFO: renamed from: d */
    public final int f7100d;

    /* JADX INFO: renamed from: e */
    public final int f7101e;

    /* JADX INFO: renamed from: f */
    public final int f7102f;

    /* JADX INFO: renamed from: g */
    public final int f7103g;

    /* JADX INFO: renamed from: h */
    public final int f7104h;

    /* JADX INFO: renamed from: i */
    public final int f7105i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2129e(C0058k c0058k) {
        ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
        byteBuffer.get(new byte[4]);
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        new String(bArr, StandardCharsets.US_ASCII);
        c0058k.m347M(1);
        c0058k.m342H();
        byteBuffer.get(new byte[20]);
        c0058k.m342H();
        c0058k.m342H();
        int i9 = byteBuffer.getInt();
        if (i9 != 305419896) {
            throw new C0081d(AbstractC4855en.m9263g("Unexpected endian tag: 0x", Integer.toHexString(i9)));
        }
        c0058k.m342H();
        c0058k.m342H();
        int i10 = byteBuffer.getInt();
        c0058k.m342H();
        this.f7099c = byteBuffer.getInt();
        c0058k.m342H();
        this.f7100d = byteBuffer.getInt();
        c0058k.m342H();
        this.f7102f = byteBuffer.getInt();
        c0058k.m342H();
        this.f7101e = byteBuffer.getInt();
        c0058k.m342H();
        this.f7103g = byteBuffer.getInt();
        this.f7097a = byteBuffer.getInt();
        this.f7098b = byteBuffer.getInt();
        c0058k.m342H();
        c0058k.m342H();
        c0058k.m351a(i10);
        int i11 = byteBuffer.getInt();
        for (int i12 = 0; i12 < i11; i12++) {
            int iM346L = c0058k.m346L();
            c0058k.m347M(6);
            int i13 = byteBuffer.getInt();
            if (iM346L == 7) {
                this.f7104h = i13;
            } else if (iM346L == 8) {
                this.f7105i = i13;
            }
        }
    }
}
