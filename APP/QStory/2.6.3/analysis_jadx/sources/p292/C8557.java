package p292;

import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import p009.AbstractC6183;
import p284.InterfaceC8385;
import p284.InterfaceC8386;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8557 implements InterfaceC8386, InterfaceC8385 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C8558 f23880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteBuffer f23882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23883;

    public C8557(C8558 c8558, String str, ByteBuffer byteBuffer) {
        this.f23880 = c8558;
        this.f23883 = str;
        this.f23882 = byteBuffer;
        this.f23881 = byteBuffer.position();
    }

    @Override // p284.InterfaceC8386
    public final byte readByte() {
        return this.f23882.get();
    }

    public final void write(byte[] bArr) {
        this.f23882.put(bArr);
    }

    @Override // p284.InterfaceC8385
    public final void writeByte(int i) {
        this.f23882.put((byte) i);
    }

    public final void writeInt(int i) {
        this.f23882.putInt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14120() {
        return this.f23882.position() - this.f23881;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14121() {
        return this.f23882.getShort() & 65535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8548 m14122() {
        short[] sArr;
        ByteBuffer byteBuffer = this.f23882;
        int i = byteBuffer.getInt();
        if (i == 0) {
            sArr = C8558.f23884;
        } else {
            short[] sArr2 = new short[i];
            for (int i2 = 0; i2 < i; i2++) {
                sArr2[i2] = byteBuffer.getShort();
            }
            sArr = sArr2;
        }
        return new C8548(this.f23880, sArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m14123() {
        ByteBuffer byteBuffer = this.f23882;
        int i = byteBuffer.getInt();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                int iM6644 = AbstractC3055.m6644(this);
                String strM6867 = AbstractC3066.m6867(this, new char[iM6644]);
                if (strM6867.length() == iM6644) {
                    return strM6867;
                }
                throw new DexException("Declared length " + iM6644 + " doesn't match decoded length of " + strM6867.length());
            } catch (UTFDataFormatException e) {
                throw new DexException(e);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8542[] m14124(int i) {
        C8542[] c8542Arr = new C8542[i];
        int iM6644 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM6644 += AbstractC3055.m6644(this);
            c8542Arr[i2] = new C8542(iM6644, AbstractC3055.m6644(this), AbstractC3055.m6644(this));
        }
        return c8542Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14125() {
        if ((this.f23882.position() & 3) == 0) {
            return;
        }
        C5925.m11311("Not four byte aligned!");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14126(int i) {
        try {
            AbstractC3055.m6633(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f23882.limit() + " exceeded by " + this.f23883);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14127(short s) {
        this.f23882.putShort(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14128(int i) {
        try {
            AbstractC3055.m6634(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f23882.limit() + " exceeded by " + this.f23883);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14129(int i) {
        short s = (short) i;
        if (i == (65535 & s)) {
            m14127(s);
        } else {
            C5925.m11310(AbstractC6183.m11588(i, "Expected an unsigned short: "));
        }
    }
}
