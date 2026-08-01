package p308;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3887;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p025.AbstractC7012;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f24229 = new short[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9389 f24230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9389 f24231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9389 f24232;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9375 f24234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteBuffer f24235;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9389 f24236;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9389 f24237;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9389 f24238;

    public C9387(File file) throws IOException {
        this.f24234 = new C9375();
        this.f24233 = 0;
        this.f24232 = new C9389(this, 3);
        this.f24231 = new C9389(this, 4);
        this.f24230 = new C9389(this, 5);
        this.f24237 = new C9389(this, 2);
        this.f24236 = new C9389(this, 0);
        this.f24238 = new C9389(this, 1);
        String name = file.getName();
        if (!name.endsWith(".zip") && !name.endsWith(".jar") && !name.endsWith(".apk")) {
            if (!file.getName().endsWith(".dex")) {
                C8376.m13327(file, "unknown output extension: ");
                throw null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                m14693(fileInputStream);
                fileInputStream.close();
                return;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ZipFile zipFile = new ZipFile(file);
        ZipEntry entry = zipFile.getEntry("classes.dex");
        if (entry == null) {
            C8376.m13327(file, "Expected classes.dex in ");
            throw null;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        try {
            m14693(inputStream);
            inputStream.close();
            zipFile.close();
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14689(int i, int i2) {
        if (i < 0 || i >= i2) {
            C8376.m13331(AbstractC7012.m12150(i, i2, "index:", ", length="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r0[r1] = new p308.C9384(r2, r9, r14);
        r1 = r1 + 1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9388 m14690(C9371 c9371) {
        short[] sArr;
        C9385[] c9385Arr;
        C9384[] c9384Arr;
        int i = c9371.f24150;
        if (i == 0) {
            C6755.m11869("offset == 0");
            return null;
        }
        C9386 c9386M14692 = m14692(i);
        ByteBuffer byteBuffer = c9386M14692.f24227;
        int iM14680 = c9386M14692.m14680();
        int iM146802 = c9386M14692.m14680();
        int iM146803 = c9386M14692.m14680();
        int iM146804 = c9386M14692.m14680();
        int i2 = byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        if (i3 == 0) {
            sArr = f24229;
        } else {
            short[] sArr2 = new short[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                sArr2[i4] = byteBuffer.getShort();
            }
            sArr = sArr2;
        }
        if (iM146804 > 0) {
            if (sArr.length % 2 == 1) {
                byteBuffer.getShort();
            }
            C9386 c9386M146922 = c9386M14692.f24225.m14692(byteBuffer.position());
            int i5 = iM146804 * 8;
            if (i5 < 0) {
                C6755.m11865();
                return null;
            }
            int iPosition = byteBuffer.position();
            int iM7204 = AbstractC3887.m7204(c9386M14692);
            c9385Arr = new C9385[iM7204];
            int i6 = 0;
            while (i6 < iM7204) {
                int iPosition2 = byteBuffer.position() - iPosition;
                int iM7205 = AbstractC3887.m7205(c9386M14692);
                int iAbs = Math.abs(iM7205);
                int[] iArr = new int[iAbs];
                C9386 c9386 = c9386M14692;
                int[] iArr2 = new int[iAbs];
                ByteBuffer byteBuffer2 = byteBuffer;
                for (int i7 = 0; i7 < iAbs; i7++) {
                    iArr[i7] = AbstractC3887.m7204(c9386);
                    iArr2[i7] = AbstractC3887.m7204(c9386);
                }
                c9385Arr[i6] = new C9385(iM7205 <= 0 ? AbstractC3887.m7204(c9386) : -1, iPosition2, iArr, iArr2);
                i6++;
                c9386M14692 = c9386;
                byteBuffer = byteBuffer2;
            }
            C9384[] c9384Arr2 = new C9384[iM146804];
            int i8 = 0;
            while (i8 < iM146804) {
                int i9 = c9386M146922.f24227.getInt();
                int iM146805 = c9386M146922.m14680();
                int iM146806 = c9386M146922.m14680();
                int i10 = 0;
                while (i10 < iM7204) {
                    if (c9385Arr[i10].f24221 == iM146806) {
                        break;
                    }
                    i10++;
                }
                C6755.m11865();
                return null;
            }
            c9384Arr = c9384Arr2;
        } else {
            c9385Arr = new C9385[0];
            c9384Arr = new C9384[0];
        }
        return new C9388(iM14680, iM146802, iM146803, i2, sArr, c9384Arr, c9385Arr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9370 m14691(C9369 c9369) {
        int i = c9369.f24144;
        if (i == 0) {
            C6755.m11869("offset == 0");
            return null;
        }
        C9386 c9386M14692 = m14692(i);
        int iM7204 = AbstractC3887.m7204(c9386M14692);
        int iM72042 = AbstractC3887.m7204(c9386M14692);
        int iM72043 = AbstractC3887.m7204(c9386M14692);
        int iM72044 = AbstractC3887.m7204(c9386M14692);
        C9372[] c9372Arr = new C9372[iM7204];
        int iM72045 = 0;
        for (int i2 = 0; i2 < iM7204; i2++) {
            iM72045 += AbstractC3887.m7204(c9386M14692);
            c9372Arr[i2] = new C9372(iM72045, AbstractC3887.m7204(c9386M14692));
        }
        C9372[] c9372Arr2 = new C9372[iM72042];
        int iM72046 = 0;
        for (int i3 = 0; i3 < iM72042; i3++) {
            iM72046 += AbstractC3887.m7204(c9386M14692);
            c9372Arr2[i3] = new C9372(iM72046, AbstractC3887.m7204(c9386M14692));
        }
        return new C9370(c9372Arr, c9372Arr2, c9386M14692.m14683(iM72043), c9386M14692.m14683(iM72044));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9386 m14692(int i) {
        if (i < 0 || i >= this.f24235.capacity()) {
            C8376.m13335(AbstractC0900.m710(i, "position=", " length="), this.f24235.capacity());
            return null;
        }
        ByteBuffer byteBufferDuplicate = this.f24235.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        return new C9386(this, "section", byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14693(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                this.f24235 = byteBufferWrap;
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                this.f24234.m14668(this);
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9386 m14694(int i, String str) {
        if ((i & 3) != 0) {
            C6755.m11870("Not four byte aligned!");
            return null;
        }
        int i2 = this.f24233 + i;
        ByteBuffer byteBufferDuplicate = this.f24235.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        C9386 c9386 = new C9386(this, str, byteBufferDuplicate);
        this.f24233 = i2;
        return c9386;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14695(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.f24235.duplicate();
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(8192, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            outputStream.write(bArr, 0, iMin);
        }
    }

    public C9387(int i) {
        this.f24234 = new C9375();
        this.f24233 = 0;
        this.f24232 = new C9389(this, 3);
        this.f24231 = new C9389(this, 4);
        this.f24230 = new C9389(this, 5);
        this.f24237 = new C9389(this, 2);
        this.f24236 = new C9389(this, 0);
        this.f24238 = new C9389(this, 1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[i]);
        this.f24235 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public C9387(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C9375 c9375 = new C9375();
        this.f24234 = c9375;
        this.f24233 = 0;
        this.f24232 = new C9389(this, 3);
        this.f24231 = new C9389(this, 4);
        this.f24230 = new C9389(this, 5);
        this.f24237 = new C9389(this, 2);
        this.f24236 = new C9389(this, 0);
        this.f24238 = new C9389(this, 1);
        this.f24235 = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        c9375.m14668(this);
    }
}
