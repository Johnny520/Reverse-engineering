package Yue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4866 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean f11147 = false;

    /* JADX INFO: renamed from: ۥ */
    public ByteBuffer f1191;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1192;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f11148;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int[] f11149;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f11150;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f11151;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f11152;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f11153;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f11154;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f11155;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f11156;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f11157;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public AbstractC0514 f11158;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final AbstractC8148 f11159;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ */
    public static class C0513 extends InputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public ByteBuffer f11160;

        public C0513(ByteBuffer byteBuffer) {
            this.f11160 = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f11160.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ۟ */
    public static abstract class AbstractC0514 {
        /* JADX INFO: renamed from: ۥ */
        public abstract ByteBuffer mo1770(int i);

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1771(ByteBuffer byteBuffer) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4867 extends AbstractC0514 {

        /* JADX INFO: renamed from: ۥ */
        public static final C4867 f1193 = new C4867();

        @Override // Yue.C4866.AbstractC0514
        /* JADX INFO: renamed from: ۥ */
        public ByteBuffer mo1770(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4866(int i, AbstractC0514 abstractC0514) {
        this(i, abstractC0514, null, AbstractC8148.m26797());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static ByteBuffer m14889(ByteBuffer byteBuffer, AbstractC0514 abstractC0514) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferMo1770 = abstractC0514.mo1770(i);
        byteBufferMo1770.position(byteBufferMo1770.clear().capacity() - iCapacity);
        byteBufferMo1770.put(byteBuffer);
        return byteBufferMo1770;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static boolean m14890(C7710 c7710, int i) {
        return c7710.m24514(i) != 0;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1768(int i) {
        if (i != m14930()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1769(int i, boolean z, boolean z2) {
        if (this.f11157 || z != z2) {
            m14891(z);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m14891(boolean z) {
        m14932(1, 0);
        m14933(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m14892(byte b) {
        m14932(1, 0);
        m14934(b);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m14893(int i, byte b, int i2) {
        if (this.f11157 || b != i2) {
            m14892(b);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m14894(double d) {
        m14932(8, 0);
        m14935(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m14895(int i, double d, double d2) {
        if (this.f11157 || d != d2) {
            m14894(d);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m14896(float f) {
        m14932(4, 0);
        m14936(f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m14897(int i, float f, double d) {
        if (this.f11157 || f != d) {
            m14896(f);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m14898(int i) {
        m14932(4, 0);
        m14937(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m14899(int i, int i2, int i3) {
        if (this.f11157 || i2 != i3) {
            m14898(i2);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m14900(int i, long j, long j2) {
        if (this.f11157 || j != j2) {
            m14901(j);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m14901(long j) {
        m14932(8, 0);
        m14938(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m14902(int i) {
        m14932(4, 0);
        m14937((m14930() - i) + 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m14903(int i, int i2, int i3) {
        if (this.f11157 || i2 != i3) {
            m14902(i2);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m14904(int i, short s, int i2) {
        if (this.f11157 || s != i2) {
            m14905(s);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m14905(short s) {
        m14932(2, 0);
        m14939(s);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m14906(int i, int i2, int i3) {
        if (i2 != i3) {
            m1768(i2);
            m14944(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m14907() {
        this.f1192 = this.f1191.capacity();
        this.f1191.clear();
        this.f11148 = 1;
        while (true) {
            int i = this.f11150;
            if (i <= 0) {
                this.f11150 = 0;
                this.f11151 = false;
                this.f11152 = false;
                this.f11153 = 0;
                this.f11155 = 0;
                this.f11156 = 0;
                return;
            }
            int[] iArr = this.f11149;
            int i2 = i - 1;
            this.f11150 = i2;
            iArr[i2] = 0;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m14908(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m14946(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f1191;
        int i = this.f1192 - iRemaining;
        this.f1192 = i;
        byteBuffer2.position(i);
        this.f1191.put(byteBuffer);
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m14909(byte[] bArr) {
        int length = bArr.length;
        m14946(1, length, 1);
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - length;
        this.f1192 = i;
        byteBuffer.position(i);
        this.f1191.put(bArr);
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int m14910(byte[] bArr, int i, int i2) {
        m14946(1, i2, 1);
        ByteBuffer byteBuffer = this.f1191;
        int i3 = this.f1192 - i2;
        this.f1192 = i3;
        byteBuffer.position(i3);
        this.f1191.put(bArr, i, i2);
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public <T extends C7710> int m14911(T t, int[] iArr) {
        t.m24525(iArr, this.f1191);
        return m14915(iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int m14912(CharSequence charSequence) {
        int iMo26799 = this.f11159.mo26799(charSequence);
        m14892((byte) 0);
        m14946(1, iMo26799, 1);
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - iMo26799;
        this.f1192 = i;
        byteBuffer.position(i);
        this.f11159.mo4176(charSequence, this.f1191);
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int m14913(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m14892((byte) 0);
        m14946(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f1191;
        int i = this.f1192 - iRemaining;
        this.f1192 = i;
        byteBuffer2.position(i);
        this.f1191.put(byteBuffer);
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ByteBuffer m14914(int i, int i2, int i3) {
        int i4 = i * i2;
        m14946(i, i2, i3);
        ByteBuffer byteBuffer = this.f1191;
        int i5 = this.f1192 - i4;
        this.f1192 = i5;
        byteBuffer.position(i5);
        ByteBuffer byteBufferOrder = this.f1191.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i4);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m14915(int[] iArr) {
        m14929();
        m14946(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m14902(iArr[length]);
        }
        return m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public ByteBuffer m14916() {
        m14926();
        return this.f1191;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m14917() {
        m14926();
        return this.f1192;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m14918() {
        int i;
        if (this.f11149 == null || !this.f11151) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m14898(0);
        int iM14930 = m14930();
        int i2 = this.f11150 - 1;
        while (i2 >= 0 && this.f11149[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f11149[i3];
            m14905((short) (i4 != 0 ? iM14930 - i4 : 0));
        }
        m14905((short) (iM14930 - this.f11153));
        m14905((short) ((i2 + 3) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f11155) {
                i = 0;
                break;
            }
            int iCapacity = this.f1191.capacity() - this.f11154[i5];
            int i6 = this.f1192;
            short s = this.f1191.getShort(iCapacity);
            if (s == this.f1191.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f1191.getShort(iCapacity + i7) != this.f1191.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f11154[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.f1191.capacity() - iM14930;
            this.f1192 = iCapacity2;
            this.f1191.putInt(iCapacity2, i - iM14930);
        } else {
            int i8 = this.f11155;
            int[] iArr = this.f11154;
            if (i8 == iArr.length) {
                this.f11154 = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f11154;
            int i9 = this.f11155;
            this.f11155 = i9 + 1;
            iArr2[i9] = m14930();
            ByteBuffer byteBuffer = this.f1191;
            byteBuffer.putInt(byteBuffer.capacity() - iM14930, m14930() - iM14930);
        }
        this.f11151 = false;
        return iM14930;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m14919() {
        if (!this.f11151) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f11151 = false;
        m14937(this.f11156);
        return m14930();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m14920(int i) {
        m14923(i, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m14921(int i, String str) {
        m14922(i, str, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m14922(int i, String str, boolean z) {
        m14932(this.f11148, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            m14892((byte) str.charAt(i2));
        }
        m14923(i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m14923(int i, boolean z) {
        m14932(this.f11148, (z ? 4 : 0) + 4);
        m14902(i);
        if (z) {
            m14898(this.f1191.capacity() - this.f1192);
        }
        this.f1191.position(this.f1192);
        this.f11152 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m14924(int i) {
        m14923(i, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m14925(int i, String str) {
        m14922(i, str, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m14926() {
        if (!this.f11152) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C4866 m14927(boolean z) {
        this.f11157 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public C4866 m14928(ByteBuffer byteBuffer, AbstractC0514 abstractC0514) {
        this.f11158 = abstractC0514;
        this.f1191 = byteBuffer;
        byteBuffer.clear();
        this.f1191.order(ByteOrder.LITTLE_ENDIAN);
        this.f11148 = 1;
        this.f1192 = this.f1191.capacity();
        this.f11150 = 0;
        this.f11151 = false;
        this.f11152 = false;
        this.f11153 = 0;
        this.f11155 = 0;
        this.f11156 = 0;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m14929() {
        if (this.f11151) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int m14930() {
        return this.f1191.capacity() - this.f1192;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m14931(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f1191;
            int i3 = this.f1192 - 1;
            this.f1192 = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m14932(int i, int i2) {
        if (i > this.f11148) {
            this.f11148 = i;
        }
        int i3 = ((~((this.f1191.capacity() - this.f1192) + i2)) + 1) & (i - 1);
        while (this.f1192 < i3 + i + i2) {
            int iCapacity = this.f1191.capacity();
            ByteBuffer byteBuffer = this.f1191;
            ByteBuffer byteBufferM14889 = m14889(byteBuffer, this.f11158);
            this.f1191 = byteBufferM14889;
            if (byteBuffer != byteBufferM14889) {
                this.f11158.m1771(byteBuffer);
            }
            this.f1192 += this.f1191.capacity() - iCapacity;
        }
        m14931(i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m14933(boolean z) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 1;
        this.f1192 = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m14934(byte b) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 1;
        this.f1192 = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m14935(double d) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 8;
        this.f1192 = i;
        byteBuffer.putDouble(i, d);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m14936(float f) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 4;
        this.f1192 = i;
        byteBuffer.putFloat(i, f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m14937(int i) {
        ByteBuffer byteBuffer = this.f1191;
        int i2 = this.f1192 - 4;
        this.f1192 = i2;
        byteBuffer.putInt(i2, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m14938(long j) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 8;
        this.f1192 = i;
        byteBuffer.putLong(i, j);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m14939(short s) {
        ByteBuffer byteBuffer = this.f1191;
        int i = this.f1192 - 2;
        this.f1192 = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m14940(int i, int i2) {
        int iCapacity = this.f1191.capacity() - i;
        if (this.f1191.getShort((iCapacity - this.f1191.getInt(iCapacity)) + i2) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public byte[] m14941() {
        return m14942(this.f1192, this.f1191.capacity() - this.f1192);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public byte[] m14942(int i, int i2) {
        m14926();
        byte[] bArr = new byte[i2];
        this.f1191.position(i);
        this.f1191.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public InputStream m14943() {
        m14926();
        ByteBuffer byteBufferDuplicate = this.f1191.duplicate();
        byteBufferDuplicate.position(this.f1192);
        byteBufferDuplicate.limit(this.f1191.capacity());
        return new C0513(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m14944(int i) {
        this.f11149[i] = m14930();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void m14945(int i) {
        m14929();
        int[] iArr = this.f11149;
        if (iArr == null || iArr.length < i) {
            this.f11149 = new int[i];
        }
        this.f11150 = i;
        Arrays.fill(this.f11149, 0, i, 0);
        this.f11151 = true;
        this.f11153 = m14930();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m14946(int i, int i2, int i3) {
        m14929();
        this.f11156 = i2;
        int i4 = i * i2;
        m14932(4, i4);
        m14932(i3, i4);
        this.f11151 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4866(int i, AbstractC0514 abstractC0514, ByteBuffer byteBuffer, AbstractC8148 abstractC8148) {
        this.f11148 = 1;
        this.f11149 = null;
        this.f11150 = 0;
        this.f11151 = false;
        this.f11152 = false;
        this.f11154 = new int[16];
        this.f11155 = 0;
        this.f11156 = 0;
        this.f11157 = false;
        i = i <= 0 ? 1 : i;
        this.f11158 = abstractC0514;
        if (byteBuffer != null) {
            this.f1191 = byteBuffer;
            byteBuffer.clear();
            this.f1191.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f1191 = abstractC0514.mo1770(i);
        }
        this.f11159 = abstractC8148;
        this.f1192 = this.f1191.capacity();
    }

    public C4866(int i) {
        this(i, C4867.f1193, null, AbstractC8148.m26797());
    }

    public C4866() {
        this(1024);
    }

    public C4866(ByteBuffer byteBuffer, AbstractC0514 abstractC0514) {
        this(byteBuffer.capacity(), abstractC0514, byteBuffer, AbstractC8148.m26797());
    }

    public C4866(ByteBuffer byteBuffer) {
        this(byteBuffer, new C4867());
    }
}
