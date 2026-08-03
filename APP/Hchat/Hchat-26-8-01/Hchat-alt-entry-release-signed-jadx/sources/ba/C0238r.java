package ba;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p129ig.AbstractC2043a;
import p276sf.C3959f;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ba.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238r {

    /* JADX INFO: renamed from: a */
    public static final C0238r f632a = new C0238r();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f633b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static File m947a(Context context, EnumC0234n enumC0234n) {
        return new File(new File(AbstractC4302b.m8641d(context), "message_bubbles"), enumC0234n.f614g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public static C0235o m948b(File file) throws IOException {
        C0235o c0235o;
        Rect rect;
        Object c3959f;
        int i9;
        int i10;
        int i11;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        if (i12 > 0 && i13 > 0 && i12 <= 2048 && i13 <= 2048 && ((long) i12) * ((long) i13) <= 2000000) {
            Rect rect2 = new Rect();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, rect2, options2);
                fileInputStream.close();
                if (bitmapDecodeStream != null) {
                    if (!(!bitmapDecodeStream.isRecycled() && bitmapDecodeStream.getWidth() > 0 && bitmapDecodeStream.getHeight() > 0)) {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        byte[] ninePatchChunk = bitmapDecodeStream.getNinePatchChunk();
                        if (ninePatchChunk == null || !NinePatch.isNinePatchChunk(ninePatchChunk)) {
                            ninePatchChunk = null;
                        }
                        if (ninePatchChunk != null) {
                            byte[] bArrCopyOf = Arrays.copyOf(ninePatchChunk, ninePatchChunk.length);
                            int i14 = rect2.left;
                            if (i14 < 0 || (i9 = rect2.top) < 0 || (i10 = rect2.right) < 0 || (i11 = rect2.bottom) < 0 || i14 + i9 + i10 + i11 <= 0) {
                                rect2 = null;
                            }
                            return new C0235o(bitmapDecodeStream, bArrCopyOf, rect2 != null ? new Rect(rect2) : null, m953h(bitmapDecodeStream));
                        }
                        if (bitmapDecodeStream.getWidth() >= 3 && bitmapDecodeStream.getHeight() >= 3 && m950d(bitmapDecodeStream.getPixel(0, 0)) && m950d(bitmapDecodeStream.getPixel(bitmapDecodeStream.getWidth() - 1, 0)) && m950d(bitmapDecodeStream.getPixel(0, bitmapDecodeStream.getHeight() - 1)) && m950d(bitmapDecodeStream.getPixel(bitmapDecodeStream.getWidth() - 1, bitmapDecodeStream.getHeight() - 1))) {
                            int width = bitmapDecodeStream.getWidth() - 1;
                            int i15 = 1;
                            boolean z9 = false;
                            while (true) {
                                if (i15 < width) {
                                    int pixel = bitmapDecodeStream.getPixel(i15, 0);
                                    if (!m950d(pixel) && !m949c(pixel)) {
                                        break;
                                    }
                                    if (m949c(pixel)) {
                                        z9 = true;
                                    }
                                    int pixel2 = bitmapDecodeStream.getPixel(i15, bitmapDecodeStream.getHeight() - 1);
                                    if (!m950d(pixel2) && !m949c(pixel2)) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    int height = bitmapDecodeStream.getHeight() - 1;
                                    int i16 = 1;
                                    boolean z10 = false;
                                    while (true) {
                                        if (i16 < height) {
                                            int pixel3 = bitmapDecodeStream.getPixel(0, i16);
                                            if (!m950d(pixel3) && !m949c(pixel3)) {
                                                break;
                                            }
                                            if (m949c(pixel3)) {
                                                z10 = true;
                                            }
                                            int pixel4 = bitmapDecodeStream.getPixel(bitmapDecodeStream.getWidth() - 1, i16);
                                            if (!m950d(pixel4) && !m949c(pixel4)) {
                                                break;
                                            }
                                            i16++;
                                        } else {
                                            if (!z9 || !z10) {
                                                break;
                                            }
                                            int width2 = bitmapDecodeStream.getWidth() - 2;
                                            int height2 = bitmapDecodeStream.getHeight() - 2;
                                            int[] iArrM951f = m951f(bitmapDecodeStream, true, false);
                                            if (iArrM951f.length == 0) {
                                                iArrM951f = null;
                                            }
                                            if (iArrM951f == null) {
                                                iArrM951f = new int[]{0, width2};
                                            }
                                            int[] iArrM951f2 = m951f(bitmapDecodeStream, false, false);
                                            if (iArrM951f2.length == 0) {
                                                iArrM951f2 = null;
                                            }
                                            if (iArrM951f2 == null) {
                                                iArrM951f2 = new int[]{0, height2};
                                            }
                                            int[] iArrM951f3 = m951f(bitmapDecodeStream, true, true);
                                            int[] iArrM951f4 = m951f(bitmapDecodeStream, false, true);
                                            if (iArrM951f3.length == 2 && iArrM951f4.length == 2) {
                                                int i17 = iArrM951f3[0];
                                                int i18 = iArrM951f4[0];
                                                int i19 = width2 - iArrM951f3[1];
                                                if (i19 < 0) {
                                                    i19 = 0;
                                                }
                                                int i20 = height2 - iArrM951f4[1];
                                                if (i20 < 0) {
                                                    i20 = 0;
                                                }
                                                rect = new Rect(i17, i18, i19, i20);
                                            } else {
                                                rect = null;
                                            }
                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 1, 1, width2, height2);
                                            bitmapCreateBitmap.getClass();
                                            bitmapDecodeStream.recycle();
                                            int length = (iArrM951f2.length + 1) * (iArrM951f.length + 1);
                                            int[] iArr = new int[length];
                                            for (int i21 = 0; i21 < length; i21++) {
                                                iArr[i21] = 1;
                                            }
                                            ByteBuffer byteBufferOrder = ByteBuffer.allocate(((iArrM951f.length + iArrM951f2.length + length) * 4) + 32).order(ByteOrder.nativeOrder());
                                            byteBufferOrder.put((byte) 1);
                                            byteBufferOrder.put((byte) iArrM951f.length);
                                            byteBufferOrder.put((byte) iArrM951f2.length);
                                            byteBufferOrder.put((byte) length);
                                            byteBufferOrder.putInt(0);
                                            byteBufferOrder.putInt(0);
                                            byteBufferOrder.putInt(rect != null ? rect.left : 0);
                                            byteBufferOrder.putInt(rect != null ? rect.right : 0);
                                            byteBufferOrder.putInt(rect != null ? rect.top : 0);
                                            byteBufferOrder.putInt(rect != null ? rect.bottom : 0);
                                            byteBufferOrder.putInt(0);
                                            for (int i22 : iArrM951f) {
                                                byteBufferOrder.putInt(i22);
                                            }
                                            for (int i23 : iArrM951f2) {
                                                byteBufferOrder.putInt(i23);
                                            }
                                            for (int i24 = 0; i24 < length; i24++) {
                                                byteBufferOrder.putInt(iArr[i24]);
                                            }
                                            byte[] bArrArray = byteBufferOrder.array();
                                            bArrArray.getClass();
                                            try {
                                                c3959f = Boolean.valueOf(NinePatch.isNinePatchChunk(bArrArray));
                                            } catch (Throwable th2) {
                                                c3959f = new C3959f(th2);
                                            }
                                            Object obj = Boolean.FALSE;
                                            if (c3959f instanceof C3959f) {
                                                c3959f = obj;
                                            }
                                            if (!((Boolean) c3959f).booleanValue()) {
                                                bArrArray = null;
                                            }
                                            c0235o = new C0235o(bitmapCreateBitmap, bArrArray, rect, m953h(bitmapCreateBitmap));
                                        }
                                    }
                                }
                            }
                            c0235o = null;
                        } else {
                            c0235o = null;
                        }
                        return c0235o != null ? c0235o : new C0235o(bitmapDecodeStream, null, null, m953h(bitmapDecodeStream));
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC2043a.m5035i(fileInputStream, th3);
                    throw th4;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m949c(int i9) {
        return (i9 >>> 24) != 0 && (i9 & 16777215) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m950d(int i9) {
        return (i9 >>> 24) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int[] m951f(Bitmap bitmap, boolean z9, boolean z10) {
        int pixel;
        int width = (z9 ? bitmap.getWidth() : bitmap.getHeight()) - 1;
        int i9 = -1;
        int i10 = 1;
        int i11 = -1;
        while (true) {
            if (i10 >= width) {
                break;
            }
            if (z9) {
                pixel = bitmap.getPixel(i10, z10 ? bitmap.getHeight() - 1 : 0);
            } else {
                pixel = bitmap.getPixel(z10 ? bitmap.getWidth() - 1 : 0, i10);
            }
            if (m949c(pixel)) {
                if (i9 < 0) {
                    i9 = i10 - 1;
                }
                i11 = i10;
            }
            i10++;
        }
        return (i9 < 0 || i11 <= i9) ? new int[0] : new int[]{i9, i11};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m952g(Context context, boolean z9) {
        Iterator it = AbstractC0000a.m101y0(Boolean.FALSE, Boolean.TRUE).iterator();
        while (it.hasNext()) {
            boolean zBooleanValue = ((Boolean) it.next()).booleanValue();
            EnumC0234n.f608l.getClass();
            EnumC0221a enumC0221a = EnumC0221a.GENERAL;
            EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221a, zBooleanValue, z9);
            C0238r c0238r = f632a;
            if (c0238r.m954e(context, enumC0234nM169E) == null && enumC0234nM169E.f618k) {
                c0238r.m954e(context, C0014a.m169E(enumC0221a, zBooleanValue, false));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m953h(Bitmap bitmap) {
        int width = bitmap.getWidth() / 32;
        if (width < 1) {
            width = 1;
        }
        int height = bitmap.getHeight() / 32;
        int i9 = height >= 1 ? height : 1;
        double dBlue = 0.0d;
        int i10 = 0;
        for (int i11 = 0; i11 < bitmap.getHeight(); i11 += i9) {
            for (int i12 = 0; i12 < bitmap.getWidth(); i12 += width) {
                int pixel = bitmap.getPixel(i12, i11);
                if (Color.alpha(pixel) >= 96) {
                    dBlue += ((((double) Color.blue(pixel)) * 0.114d) + ((((double) Color.green(pixel)) * 0.587d) + (((double) Color.red(pixel)) * 0.299d))) / 255.0d;
                    i10++;
                }
            }
        }
        return (i10 <= 0 || dBlue / ((double) i10) < 0.58d) ? -1 : -16777216;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized C0235o m954e(Context context, EnumC0234n enumC0234n) {
        try {
            File fileM947a = m947a(context, enumC0234n);
            if (fileM947a.isFile() && fileM947a.length() > 0) {
                ConcurrentHashMap concurrentHashMap = f633b;
                C0236p c0236p = (C0236p) concurrentHashMap.get(enumC0234n);
                if (c0236p != null) {
                    if (!(c0236p.f623a == fileM947a.lastModified() && c0236p.f624b == fileM947a.length() && !c0236p.f625c.f619a.isRecycled())) {
                        c0236p = null;
                    }
                    if (c0236p != null) {
                        return c0236p.f625c;
                    }
                }
                C0235o c0235oM948b = m948b(fileM947a);
                if (c0235oM948b == null) {
                    return null;
                }
                concurrentHashMap.put(enumC0234n, new C0236p(fileM947a.lastModified(), fileM947a.length(), c0235oM948b));
                return c0235oM948b;
            }
            f633b.remove(enumC0234n);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
