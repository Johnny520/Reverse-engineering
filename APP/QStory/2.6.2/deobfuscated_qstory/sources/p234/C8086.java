package p234;

import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.InputStream;
import java.util.ArrayList;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8086 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2973 f22312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8082 f22313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22314;

    public C8086(ArrayList arrayList, C8082 c8082, C2973 c2973) {
        this.f22314 = arrayList;
        this.f22313 = c8082;
        this.f22312 = c2973;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bumptech.glide.load.engine.InterfaceC2988 mo6464(java.lang.Object r6, int r7, int r8, p286.C8396 r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏哲兰 r5 = r5.f22313
            com.bumptech.glide.load.engine.飘花落叶言子世楪苏兰哲 r2 = r5.mo6464(r6, r7, r8, r9)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p234.C8086.mo6464(java.lang.Object, int, int, 飘花落叶言楪子兰哲苏世.飘花落叶言子楪苏世兰哲):com.bumptech.glide.load.engine.飘花落叶言子世楪苏兰哲");
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) {
        return !((Boolean) c8396.m13947(AbstractC8085.f22310)).booleanValue() && AbstractC2904.m6246(this.f22314, (InputStream) obj, this.f22312) == ImageHeaderParser$ImageType.GIF;
    }
}
