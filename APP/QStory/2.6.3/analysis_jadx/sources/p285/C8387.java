package p285;

import android.graphics.Bitmap;
import android.util.Log;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p230.C8053;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short[] f23223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f23224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ByteBuffer f23225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8053 f23226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f23228;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Boolean f23230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f23231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Bitmap f23232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f23235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f23236;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte[] f23237;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f23238;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8389 f23240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[] f23241;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int[] f23242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f23227 = new int[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Bitmap.Config f23229 = Bitmap.Config.ARGB_8888;

    public C8387(C8053 c8053, C8389 c8389, ByteBuffer byteBuffer, int i) {
        this.f23226 = c8053;
        this.f23240 = new C8389();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f23235 = 0;
                this.f23240 = c8389;
                this.f23239 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f23225 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f23225.order(ByteOrder.LITTLE_ENDIAN);
                this.f23231 = false;
                Iterator it = c8389.f23248.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C8390) it.next()).f23265 == 3) {
                        this.f23231 = true;
                        break;
                    }
                }
                this.f23236 = iHighestOneBit;
                int i2 = c8389.f23247;
                this.f23234 = i2 / iHighestOneBit;
                int i3 = c8389.f23254;
                this.f23233 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C2974 c2974 = (C2974) this.f23226.f22224;
                this.f23241 = c2974 == null ? new byte[i4] : (byte[]) c2974.m6446(i4, byte[].class);
                C8053 c80532 = this.f23226;
                int i5 = this.f23234 * this.f23233;
                C2974 c29742 = (C2974) c80532.f22224;
                this.f23242 = c29742 == null ? new int[i5] : (int[]) c29742.m6446(i5, int[].class);
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
    public final android.graphics.Bitmap m13954(p285.C8390 r37, p285.C8390 r38) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p285.C8387.m13954(飘花落叶言楪子兰哲世苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世苏哲兰):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13955(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f23229 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m13956() {
        try {
            if (this.f23240.f23250 <= 0 || this.f23239 < 0) {
                if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                    Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, frameCount=" + this.f23240.f23250 + ", framePointer=" + this.f23239);
                }
                this.f23235 = 1;
            }
            int i = this.f23235;
            if (i != 1 && i != 2) {
                this.f23235 = 0;
                if (this.f23224 == null) {
                    C2974 c2974 = (C2974) this.f23226.f22224;
                    this.f23224 = c2974 == null ? new byte[Opcodes.CONST_METHOD_TYPE] : (byte[]) c2974.m6446(Opcodes.CONST_METHOD_TYPE, byte[].class);
                }
                C8390 c8390 = (C8390) this.f23240.f23248.get(this.f23239);
                int i2 = this.f23239 - 1;
                C8390 c83902 = i2 >= 0 ? (C8390) this.f23240.f23248.get(i2) : null;
                int[] iArr = c8390.f23266;
                if (iArr == null) {
                    iArr = this.f23240.f23252;
                }
                this.f23228 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                        Log.d("飘花落叶言子楪世哲兰苏", "No valid color table found for frame #" + this.f23239);
                    }
                    this.f23235 = 1;
                    return null;
                }
                if (c8390.f23258) {
                    System.arraycopy(iArr, 0, this.f23227, 0, iArr.length);
                    int[] iArr2 = this.f23227;
                    this.f23228 = iArr2;
                    iArr2[c8390.f23264] = 0;
                    if (c8390.f23265 == 2 && this.f23239 == 0) {
                        this.f23230 = Boolean.TRUE;
                    }
                }
                return m13954(c8390, c83902);
            }
            if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, status=" + this.f23235);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bitmap m13957() {
        Boolean bool = this.f23230;
        Bitmap bitmapMo6456 = ((InterfaceC2979) this.f23226.f22225).mo6456(this.f23234, this.f23233, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f23229);
        bitmapMo6456.setHasAlpha(true);
        return bitmapMo6456;
    }
}
