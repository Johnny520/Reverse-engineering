package Yue;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7710 {

    /* JADX INFO: renamed from: ۥ */
    public int f3039;

    /* JADX INFO: renamed from: ۥ۟ */
    public ByteBuffer f3040;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23217;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23218;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public AbstractC8148 f23219 = AbstractC8148.m26797();

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ$ۥ */
    public class C1333 implements Comparator<Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ByteBuffer f23220;

        public C1333(ByteBuffer byteBuffer) {
            this.f23220 = byteBuffer;
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return C7710.this.m24524(num, num2, this.f23220);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3812(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m24508(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m24509(int i, int i2, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m24510(int i, ByteBuffer byteBuffer, AbstractC8148 abstractC8148) {
        int i2 = i + byteBuffer.getInt(i);
        return abstractC8148.mo4175(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C7710 m24511(C7710 c7710, int i, ByteBuffer byteBuffer) {
        c7710.m24516(m24508(i, byteBuffer), byteBuffer);
        return c7710;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m24512(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int iMin = Math.min(i5, i6);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m24513(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int iMin = Math.min(i3, length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m3813(int i) {
        return i + this.f3040.getInt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m24514(int i) {
        if (i < this.f23218) {
            return this.f3040.getShort(this.f23217 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m24515() {
        m24516(0, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m24516(int i, ByteBuffer byteBuffer) {
        this.f3040 = byteBuffer;
        if (byteBuffer == null) {
            this.f3039 = 0;
            this.f23217 = 0;
            this.f23218 = 0;
        } else {
            this.f3039 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f23217 = i2;
            this.f23218 = this.f3040.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m24517(int i) {
        return m24510(i, this.f3040, this.f23219);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C7710 m24518(C7710 c7710, int i) {
        return m24511(c7710, i, this.f3040);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m24519(int i) {
        int i2 = i + this.f3039;
        return i2 + this.f3040.getInt(i2) + 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public ByteBuffer m24520(int i, int i2) {
        int iM24514 = m24514(i);
        if (iM24514 == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f3040.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iM24519 = m24519(iM24514);
        byteBufferOrder.position(iM24519);
        byteBufferOrder.limit(iM24519 + (m24522(iM24514) * i2));
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public ByteBuffer m24521(ByteBuffer byteBuffer, int i, int i2) {
        int iM24514 = m24514(i);
        if (iM24514 == 0) {
            return null;
        }
        int iM24519 = m24519(iM24514);
        byteBuffer.rewind();
        byteBuffer.limit((m24522(iM24514) * i2) + iM24519);
        byteBuffer.position(iM24519);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m24522(int i) {
        int i2 = i + this.f3039;
        return this.f3040.getInt(i2 + this.f3040.getInt(i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public ByteBuffer m24523() {
        return this.f3040;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m24524(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m24525(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C1333(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
