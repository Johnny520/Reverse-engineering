package p285;

import android.graphics.Bitmap;
import android.util.Log;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p230.C8052;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8386 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short[] f23224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f23225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ByteBuffer f23226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8052 f23227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f23229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Boolean f23231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f23232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Bitmap f23233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f23236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f23237;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte[] f23238;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f23239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8388 f23241;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[] f23242;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int[] f23243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f23228 = new int[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Bitmap.Config f23230 = Bitmap.Config.ARGB_8888;

    public C8386(C8052 c8052, C8388 c8388, ByteBuffer byteBuffer, int i) {
        this.f23227 = c8052;
        this.f23241 = new C8388();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f23236 = 0;
                this.f23241 = c8388;
                this.f23240 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f23226 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f23226.order(ByteOrder.LITTLE_ENDIAN);
                this.f23232 = false;
                Iterator it = c8388.f23249.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C8389) it.next()).f23266 == 3) {
                        this.f23232 = true;
                        break;
                    }
                }
                this.f23237 = iHighestOneBit;
                int i2 = c8388.f23248;
                this.f23235 = i2 / iHighestOneBit;
                int i3 = c8388.f23255;
                this.f23234 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C2973 c2973 = (C2973) this.f23227.f22226;
                this.f23242 = c2973 == null ? new byte[i4] : (byte[]) c2973.m6388(i4, byte[].class);
                C8052 c80522 = this.f23227;
                int i5 = this.f23235 * this.f23234;
                C2973 c29732 = (C2973) c80522.f22226;
                this.f23243 = c29732 == null ? new int[i5] : (int[]) c29732.m6388(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7 A[PHI: r7
  0x01e7: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d3, B:97:0x01de, B:98:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m13937(p285.C8389 r37, p285.C8389 r38) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p285.C8386.m13937(飘花落叶言楪子兰哲世苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世苏哲兰):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13938(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f23230 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m13939() {
        try {
            if (this.f23241.f23251 <= 0 || this.f23240 < 0) {
                if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                    Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, frameCount=" + this.f23241.f23251 + ", framePointer=" + this.f23240);
                }
                this.f23236 = 1;
            }
            int i = this.f23236;
            if (i != 1 && i != 2) {
                this.f23236 = 0;
                if (this.f23225 == null) {
                    C2973 c2973 = (C2973) this.f23227.f22226;
                    this.f23225 = c2973 == null ? new byte[Opcodes.CONST_METHOD_TYPE] : (byte[]) c2973.m6388(Opcodes.CONST_METHOD_TYPE, byte[].class);
                }
                C8389 c8389 = (C8389) this.f23241.f23249.get(this.f23240);
                int i2 = this.f23240 - 1;
                C8389 c83892 = i2 >= 0 ? (C8389) this.f23241.f23249.get(i2) : null;
                int[] iArr = c8389.f23267;
                if (iArr == null) {
                    iArr = this.f23241.f23253;
                }
                this.f23229 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                        Log.d("飘花落叶言子楪世哲兰苏", "No valid color table found for frame #" + this.f23240);
                    }
                    this.f23236 = 1;
                    return null;
                }
                if (c8389.f23259) {
                    System.arraycopy(iArr, 0, this.f23228, 0, iArr.length);
                    int[] iArr2 = this.f23228;
                    this.f23229 = iArr2;
                    iArr2[c8389.f23265] = 0;
                    if (c8389.f23266 == 2 && this.f23240 == 0) {
                        this.f23231 = Boolean.TRUE;
                    }
                }
                return m13937(c8389, c83892);
            }
            if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, status=" + this.f23236);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bitmap m13940() {
        Boolean bool = this.f23231;
        Bitmap bitmapMo6398 = ((InterfaceC2978) this.f23227.f22227).mo6398(this.f23235, this.f23234, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f23230);
        bitmapMo6398.setHasAlpha(true);
        return bitmapMo6398;
    }
}
