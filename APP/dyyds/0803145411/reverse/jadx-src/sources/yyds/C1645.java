package yyds;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛷᲁᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1645 {
    static {
        AbstractC2328.m4341(-1725464029332334L);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100 A[PHI: r15 r16 r17 r21
  0x0100: PHI (r15v17 boolean) = 
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
  (r15v14 boolean)
  (r15v12 boolean)
  (r15v12 boolean)
 binds: [B:78:0x01af, B:80:0x01b6, B:93:0x01f6, B:76:0x01a9, B:48:0x0126, B:49:0x0127, B:51:0x012d, B:62:0x016d, B:64:0x0173, B:73:0x0196, B:72:0x0192, B:59:0x0158, B:45:0x0116, B:30:0x00db, B:39:0x00f4, B:28:0x00d8, B:25:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r16v17 int) = 
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v10 int)
  (r16v11 int)
  (r16v11 int)
  (r16v13 int)
  (r16v10 int)
  (r16v10 int)
  (r16v15 int)
  (r16v10 int)
  (r16v10 int)
 binds: [B:78:0x01af, B:80:0x01b6, B:93:0x01f6, B:76:0x01a9, B:48:0x0126, B:49:0x0127, B:51:0x012d, B:62:0x016d, B:64:0x0173, B:73:0x0196, B:72:0x0192, B:59:0x0158, B:45:0x0116, B:30:0x00db, B:39:0x00f4, B:28:0x00d8, B:25:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r17v14 int) = 
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v9 int)
  (r17v9 int)
  (r17v8 int)
  (r17v8 int)
  (r17v8 int)
  (r17v12 int)
  (r17v8 int)
  (r17v8 int)
 binds: [B:78:0x01af, B:80:0x01b6, B:93:0x01f6, B:76:0x01a9, B:48:0x0126, B:49:0x0127, B:51:0x012d, B:62:0x016d, B:64:0x0173, B:73:0x0196, B:72:0x0192, B:59:0x0158, B:45:0x0116, B:30:0x00db, B:39:0x00f4, B:28:0x00d8, B:25:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r21v11 boolean) = 
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v5 boolean)
  (r21v6 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
  (r21v8 boolean)
  (r21v4 boolean)
  (r21v4 boolean)
 binds: [B:78:0x01af, B:80:0x01b6, B:93:0x01f6, B:76:0x01a9, B:48:0x0126, B:49:0x0127, B:51:0x012d, B:62:0x016d, B:64:0x0173, B:73:0x0196, B:72:0x0192, B:59:0x0158, B:45:0x0116, B:30:0x00db, B:39:0x00f4, B:28:0x00d8, B:25:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0639 m3356(File file, File file2) throws IOException {
        int i;
        C2579 c2579;
        boolean z;
        boolean z2;
        Paint paint;
        String str;
        ArrayList arrayList;
        byte[] bArrM4336;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        Charset charset;
        long j;
        String absolutePath = file.getAbsolutePath();
        AbstractC2328.m4341(-1724222783783790L);
        AbstractC2328.m4341(-1723011603006318L);
        File file3 = new File(absolutePath);
        int i5 = 1;
        if (!file3.exists() || file3.length() < 12) {
            i = 2;
            c2579 = null;
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file3, AbstractC2328.m4341(-1723050257711982L));
            try {
                bArr = new byte[4];
                randomAccessFile.readFully(bArr);
                charset = AbstractC0347.f1811;
            } catch (Throwable th) {
                th = th;
                i = 2;
            }
            if (new String(bArr, charset).equals(AbstractC2328.m4341(-1723058847646574L))) {
                long jM4340 = AbstractC2328.m4340(randomAccessFile);
                byte[] bArr2 = new byte[4];
                randomAccessFile.readFully(bArr2);
                if (new String(bArr2, charset).equals(AbstractC2328.m4341(-1723080322483054L))) {
                    ArrayList arrayList3 = new ArrayList();
                    long j2 = jM4340 + 12;
                    boolean z3 = 0;
                    int iM4348 = 0;
                    int iM43482 = 0;
                    int iM4337 = 0;
                    int i6 = 0;
                    boolean z4 = 0;
                    while (randomAccessFile.getFilePointer() < j2 && randomAccessFile.getFilePointer() + 8 <= randomAccessFile.length()) {
                        randomAccessFile.getFilePointer();
                        byte[] bArr3 = new byte[4];
                        randomAccessFile.readFully(bArr3);
                        String str2 = new String(bArr3, AbstractC0347.f1811);
                        i = 2;
                        try {
                            long jM43402 = AbstractC2328.m4340(randomAccessFile);
                            long filePointer = randomAccessFile.getFilePointer();
                            switch (str2.hashCode()) {
                                case 2013713:
                                    j = j2;
                                    if (str2.equals(AbstractC2328.m4341(-1723187696665454L)) && jM43402 >= 6) {
                                        i6 = ((randomAccessFile.readByte() & 255) << 8) | ((randomAccessFile.readByte() & 255) << 16) | ((randomAccessFile.readByte() & 255) << 24) | (randomAccessFile.readByte() & 255);
                                        iM4337 = AbstractC2328.m4337(randomAccessFile);
                                    }
                                    break;
                                case 2013830:
                                    if (str2.equals(AbstractC2328.m4341(-1723144746992494L)) && jM43402 >= 16 && jM43402 <= 2147483647L) {
                                        int iM43483 = AbstractC2328.m4348(randomAccessFile) * 2;
                                        int iM43484 = AbstractC2328.m4348(randomAccessFile) * 2;
                                        int iM43485 = AbstractC2328.m4348(randomAccessFile) + 1;
                                        int iM43486 = AbstractC2328.m4348(randomAccessFile) + 1;
                                        int iM43487 = AbstractC2328.m4348(randomAccessFile);
                                        byte b = randomAccessFile.readByte();
                                        boolean z5 = (b & 1) != 0 ? i5 : 0;
                                        boolean z6 = (b & 2) != 0 ? i5 : 0;
                                        long j3 = filePointer + 16;
                                        int i7 = ((int) jM43402) - 16;
                                        int i8 = iM43487 <= 0 ? 100 : iM43487;
                                        if (i7 > 0) {
                                            j = j2;
                                            if (j3 + ((long) i7) <= randomAccessFile.length() && arrayList3.size() < 10000) {
                                                arrayList3.add(new C1899(iM43483, iM43484, iM43485, iM43486, i8, z6, z5, j3, i7));
                                            }
                                        } else {
                                            j = j2;
                                        }
                                        break;
                                    }
                                    break;
                                case 2640674:
                                    if (str2.equals(AbstractC2328.m4341(-1723166221828974L))) {
                                        if (z3 == 0 && arrayList3.isEmpty()) {
                                            if (str2.equals(AbstractC2328.m4341(-1723209171501934L)) && jM43402 >= 10) {
                                                randomAccessFile.skipBytes(3);
                                                randomAccessFile.skipBytes(3);
                                                int iM43372 = AbstractC2328.m4337(randomAccessFile) & 16383;
                                                int iM43373 = AbstractC2328.m4337(randomAccessFile) & 16383;
                                                if (iM4348 == 0) {
                                                    iM4348 = iM43372;
                                                }
                                                if (iM43482 == 0) {
                                                    j = j2;
                                                    iM43482 = iM43373;
                                                }
                                            } else if (str2.equals(AbstractC2328.m4341(-1723230646338414L)) && jM43402 >= 5) {
                                                randomAccessFile.skipBytes(i5);
                                                int iM4340 = (int) AbstractC2328.m4340(randomAccessFile);
                                                int i9 = (iM4340 & 16383) + i5;
                                                int i10 = ((iM4340 >> 14) & 16383) + i5;
                                                if (iM4348 == 0) {
                                                    iM4348 = i9;
                                                }
                                                if (iM43482 == 0) {
                                                    iM43482 = i10;
                                                }
                                                z4 = ((iM4340 >> 28) & i5) != 0 ? i5 : 0;
                                            }
                                            break;
                                        }
                                    }
                                    j = j2;
                                    break;
                                case 2640718:
                                    if (!str2.equals(AbstractC2328.m4341(-1723123272156014L))) {
                                    }
                                    j = j2;
                                    break;
                                case 2640730:
                                    if (str2.equals(AbstractC2328.m4341(-1723101797319534L)) && jM43402 >= 10) {
                                        byte b2 = randomAccessFile.readByte();
                                        randomAccessFile.skipBytes(3);
                                        z3 = (b2 & 2) != 0 ? i5 : 0;
                                        z4 = (b2 & 16) != 0 ? i5 : 0;
                                        iM4348 = AbstractC2328.m4348(randomAccessFile) + 1;
                                        iM43482 = AbstractC2328.m4348(randomAccessFile) + 1;
                                    }
                                    j = j2;
                                    break;
                                default:
                                    j = j2;
                                    break;
                            }
                            randomAccessFile.seek(filePointer + jM43402 + (jM43402 % 2));
                            j2 = j;
                            i5 = 1;
                            z3 = z3;
                            z4 = z4;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    i = 2;
                    c2579 = new C2579(z3, iM4348, iM43482, iM4337, i6, arrayList3, z4);
                }
                try {
                    th.printStackTrace();
                    c2579 = null;
                } finally {
                }
            }
            i = 2;
            c2579 = null;
        }
        if (c2579 == null) {
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1724312978097006L), 62);
        }
        int i11 = c2579.f12718;
        ArrayList arrayList4 = c2579.f12717;
        if (!c2579.f12713 || arrayList4.isEmpty()) {
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1724364517704558L), 62);
        }
        int i12 = c2579.f12714;
        int i13 = c2579.f12716;
        if (i12 <= 0 || i13 <= 0) {
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1724467596919662L) + i12 + 'x' + i13, 62);
        }
        if (((long) i12) * ((long) i13) * ((long) arrayList4.size()) > 64000000) {
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1724506251625326L) + i12 + 'x' + i13 + AbstractC2328.m4341(-1724536316396398L) + arrayList4.size() + AbstractC2328.m4341(-1724553496265582L), 62);
        }
        Log.d(AbstractC2328.m4341(-1724652280513390L), AbstractC2328.m4341(-1724733884892014L) + i12 + 'x' + i13 + AbstractC2328.m4341(-1724763949663086L) + arrayList4.size() + AbstractC2328.m4341(-1724776834564974L) + c2579.f12715 + AbstractC2328.m4341(-1724824079205230L) + i11);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        AbstractC2328.m4341(-1724858438943598L);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint2 = new Paint(3);
        Paint paint3 = new Paint();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        bitmapCreateBitmap.eraseColor(0);
        int size = arrayList4.size();
        int i14 = 0;
        while (i14 < size) {
            C1899 c1899 = (C1899) arrayList4.get(i14);
            AbstractC2328.m4341(-1723252121174894L);
            int i15 = c1899.f9610;
            if (i15 <= 0) {
                str = absolutePath;
                paint = paint3;
                arrayList = arrayList4;
            } else {
                paint = paint3;
                str = absolutePath;
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(absolutePath), AbstractC2328.m4341(-1723295070847854L));
                arrayList = arrayList4;
                try {
                    randomAccessFile2.seek(c1899.f9609);
                    byte[] bArr4 = new byte[i15];
                    randomAccessFile2.readFully(bArr4);
                    bArrM4336 = AbstractC2328.m4336(bArr4, c1899);
                } finally {
                    try {
                        bArrM4336 = null;
                    } finally {
                    }
                }
                if (bArrM4336 != null) {
                    C2701 c2701 = C2701.f13261;
                    String str3 = AbstractC2328.m4341(-1724935748354926L) + i14 + AbstractC2328.m4341(-1724948633256814L);
                    c2701.getClass();
                    C2701.m4802(str3);
                    arrayList2 = arrayList;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    options.inPreferredConfig = config;
                    arrayList2 = arrayList;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM4336, 0, bArrM4336.length, options);
                    if (bitmapDecodeByteArray == null) {
                        C2701 c27012 = C2701.f13261;
                        String str4 = AbstractC2328.m4341(-1724987287962478L) + i14 + AbstractC2328.m4341(-1725000172864366L);
                        c27012.getClass();
                        C2701.m4802(str4);
                    } else {
                        int i16 = c1899.f9612;
                        int i17 = c1899.f9613;
                        i2 = i12;
                        i3 = i13;
                        Rect rect = new Rect(i16, i17, c1899.f9615 + i16, c1899.f9617 + i17);
                        if (c1899.f9616) {
                            i4 = i14;
                            canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, paint);
                            canvas.drawBitmap(bitmapDecodeByteArray, (Rect) null, rect, paint2);
                        } else {
                            i4 = i14;
                            canvas.drawBitmap(bitmapDecodeByteArray, (Rect) null, rect, paint2);
                        }
                        arrayList5.add(bitmapCreateBitmap.copy(config, false));
                        int i18 = c1899.f9611;
                        if (i18 <= 0) {
                            i18 = 100;
                        }
                        arrayList6.add(Integer.valueOf(i18));
                        if (c1899.f9614) {
                            canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, paint);
                        }
                        bitmapDecodeByteArray.recycle();
                        i14 = i4 + 1;
                        paint3 = paint;
                        absolutePath = str;
                        arrayList4 = arrayList2;
                        i12 = i2;
                        i13 = i3;
                    }
                }
                i2 = i12;
                i3 = i13;
                i4 = i14;
                i14 = i4 + 1;
                paint3 = paint;
                absolutePath = str;
                arrayList4 = arrayList2;
                i12 = i2;
                i13 = i3;
            }
            bArrM4336 = null;
            if (bArrM4336 != null) {
            }
            i2 = i12;
            i3 = i13;
            i4 = i14;
            i14 = i4 + 1;
            paint3 = paint;
            absolutePath = str;
            arrayList4 = arrayList2;
            i12 = i2;
            i13 = i3;
        }
        int i19 = i12;
        int i20 = i13;
        bitmapCreateBitmap.recycle();
        if (arrayList5.isEmpty()) {
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1725038827570030L), 62);
        }
        Log.d(AbstractC2328.m4341(-1725081777242990L), AbstractC2328.m4341(-1725163381621614L) + arrayList5.size() + AbstractC2328.m4341(-1725180561490798L));
        Iterator it = arrayList5.iterator();
        while (true) {
            if (it.hasNext()) {
                Bitmap bitmap = (Bitmap) it.next();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i21 = width * height;
                int[] iArr = new int[i21];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                int i22 = 0;
                for (int i23 = 0; i23 < i21; i23++) {
                    if (((iArr[i23] >> 24) & 255) < 128) {
                        i22++;
                    }
                }
                if (((double) i22) / ((double) i21) > 0.01d) {
                    z = true;
                }
            } else {
                z = false;
            }
        }
        Log.d(AbstractC2328.m4341(-1725202036327278L), AbstractC2328.m4341(-1725283640705902L) + z + AbstractC2328.m4341(-1725339475280750L));
        int[] iArrM3268 = AbstractC1595.m3268(arrayList6);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 65536);
        try {
            try {
                C0884 c0884 = new C0884(bufferedOutputStream);
                if (i11 >= 0) {
                    c0884.f4057 = i11;
                }
                c0884.f4045 = 10;
                c0884.f4051 = z;
                if (z) {
                    c0884.f4053 = i;
                }
                C0884.m1973(c0884, arrayList5);
                c0884.m1979();
                int size2 = arrayList5.size();
                int i24 = 0;
                while (i24 < size2) {
                    c0884.f4046 = (i24 < 0 || i24 >= iArrM3268.length) ? 100 : iArrM3268[i24];
                    c0884.m1975((Bitmap) arrayList5.get(i24));
                    i24++;
                }
                BufferedOutputStream bufferedOutputStream2 = c0884.f4047;
                if (c0884.f4056) {
                    try {
                        bufferedOutputStream2.write(59);
                        bufferedOutputStream2.flush();
                        c0884.f4056 = false;
                    } catch (Exception unused) {
                    }
                }
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused2) {
                }
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
                z2 = true;
            } catch (Exception e) {
                C2701 c27013 = C2701.f13261;
                String strM4341 = AbstractC2328.m4341(-1725425374626670L);
                c27013.getClass();
                C2701.m4801(strM4341, e);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused4) {
                }
                try {
                    fileOutputStream.close();
                } catch (Exception unused5) {
                }
                z2 = false;
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                ((Bitmap) it2.next()).recycle();
            }
            if (z2 && file2.exists() && file2.length() != 0) {
                return new C0639(true, file2.getPath(), arrayList5.size(), i19, i20, z, null, 64);
            }
            file2.delete();
            return new C0639(false, null, 0, 0, 0, false, AbstractC2328.m4341(-1725386719921006L), 62);
        } catch (Throwable th3) {
            try {
                bufferedOutputStream.close();
            } catch (Exception unused6) {
            }
            try {
                fileOutputStream.close();
                throw th3;
            } catch (Exception unused7) {
                throw th3;
            }
        }
    }
}
