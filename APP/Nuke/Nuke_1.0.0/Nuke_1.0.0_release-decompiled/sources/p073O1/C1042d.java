package p073O1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p000A.C0038T0;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: O1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1042d {

    /* JADX INFO: renamed from: a */
    public int[] f3261a;

    /* JADX INFO: renamed from: c */
    public final C0038T0 f3263c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f3264d;

    /* JADX INFO: renamed from: e */
    public byte[] f3265e;

    /* JADX INFO: renamed from: f */
    public short[] f3266f;

    /* JADX INFO: renamed from: g */
    public byte[] f3267g;

    /* JADX INFO: renamed from: h */
    public byte[] f3268h;

    /* JADX INFO: renamed from: i */
    public byte[] f3269i;

    /* JADX INFO: renamed from: j */
    public final int[] f3270j;

    /* JADX INFO: renamed from: k */
    public int f3271k;

    /* JADX INFO: renamed from: l */
    public C1040b f3272l;

    /* JADX INFO: renamed from: m */
    public Bitmap f3273m;

    /* JADX INFO: renamed from: n */
    public final boolean f3274n;

    /* JADX INFO: renamed from: o */
    public int f3275o;

    /* JADX INFO: renamed from: p */
    public final int f3276p;

    /* JADX INFO: renamed from: q */
    public final int f3277q;

    /* JADX INFO: renamed from: r */
    public final int f3278r;

    /* JADX INFO: renamed from: s */
    public Boolean f3279s;

    /* JADX INFO: renamed from: b */
    public final int[] f3262b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f3280t = Bitmap.Config.ARGB_8888;

    public C1042d(C0038T0 c0038t0, C1040b c1040b, ByteBuffer byteBuffer, int i5) {
        this.f3263c = c0038t0;
        this.f3272l = new C1040b();
        synchronized (this) {
            try {
                if (i5 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i5);
                }
                int iHighestOneBit = Integer.highestOneBit(i5);
                this.f3275o = 0;
                this.f3272l = c1040b;
                this.f3271k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3264d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3264d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3274n = false;
                Iterator it = c1040b.f3250e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C1039a) it.next()).f3241g == 3) {
                        this.f3274n = true;
                        break;
                    }
                }
                this.f3276p = iHighestOneBit;
                int i6 = c1040b.f3251f;
                this.f3278r = i6 / iHighestOneBit;
                int i7 = c1040b.f3252g;
                this.f3277q = i7 / iHighestOneBit;
                int i8 = i6 * i7;
                C1294f c1294f = (C1294f) this.f3263c.f170f;
                this.f3269i = c1294f == null ? new byte[i8] : (byte[]) c1294f.m2384c(i8, byte[].class);
                C0038T0 c0038t02 = this.f3263c;
                int i9 = this.f3278r * this.f3277q;
                C1294f c1294f2 = (C1294f) c0038t02.f170f;
                this.f3270j = c1294f2 == null ? new int[i9] : (int[]) c1294f2.m2384c(i9, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m2119a() {
        Boolean bool = this.f3279s;
        Bitmap bitmapMo151b = ((InterfaceC1289a) this.f3263c.f169e).mo151b(this.f3278r, this.f3277q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3280t);
        bitmapMo151b.setHasAlpha(true);
        return bitmapMo151b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m2120b() {
        try {
            if (this.f3272l.f3248c <= 0 || this.f3271k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f3272l.f3248c + ", framePointer=" + this.f3271k);
                }
                this.f3275o = 1;
            }
            int i5 = this.f3275o;
            if (i5 != 1 && i5 != 2) {
                this.f3275o = 0;
                if (this.f3265e == null) {
                    C1294f c1294f = (C1294f) this.f3263c.f170f;
                    this.f3265e = c1294f == null ? new byte[255] : (byte[]) c1294f.m2384c(255, byte[].class);
                }
                C1039a c1039a = (C1039a) this.f3272l.f3250e.get(this.f3271k);
                int i6 = this.f3271k - 1;
                C1039a c1039a2 = i6 >= 0 ? (C1039a) this.f3272l.f3250e.get(i6) : null;
                int[] iArr = c1039a.f3245k;
                if (iArr == null) {
                    iArr = this.f3272l.f3246a;
                }
                this.f3261a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f3271k);
                    }
                    this.f3275o = 1;
                    return null;
                }
                if (c1039a.f3240f) {
                    System.arraycopy(iArr, 0, this.f3262b, 0, iArr.length);
                    int[] iArr2 = this.f3262b;
                    this.f3261a = iArr2;
                    iArr2[c1039a.f3242h] = 0;
                    if (c1039a.f3241g == 2 && this.f3271k == 0) {
                        this.f3279s = Boolean.TRUE;
                    }
                }
                return m2122d(c1039a, c1039a2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f3275o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2121c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f3280t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc A[PHI: r5
  0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m2122d(p073O1.C1039a r36, p073O1.C1039a r37) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073O1.C1042d.m2122d(O1.a, O1.a):android.graphics.Bitmap");
    }
}
