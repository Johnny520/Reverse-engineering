package p292;

import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.AbstractC3065;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import p007.AbstractC6136;
import p284.InterfaceC8384;
import p284.InterfaceC8385;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8565 implements InterfaceC8385, InterfaceC8384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C8566 f23889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteBuffer f23891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23892;

    public C8565(C8566 c8566, String str, ByteBuffer byteBuffer) {
        this.f23889 = c8566;
        this.f23892 = str;
        this.f23891 = byteBuffer;
        this.f23890 = byteBuffer.position();
    }

    @Override // p284.InterfaceC8385
    public final byte readByte() {
        return this.f23891.get();
    }

    public final void write(byte[] bArr) {
        this.f23891.put(bArr);
    }

    @Override // p284.InterfaceC8384
    public final void writeByte(int i) {
        this.f23891.put((byte) i);
    }

    public final void writeInt(int i) {
        this.f23891.putInt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14101() {
        return this.f23891.position() - this.f23890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14102() {
        return this.f23891.getShort() & 65535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8556 m14103() {
        short[] sArr;
        ByteBuffer byteBuffer = this.f23891;
        int i = byteBuffer.getInt();
        if (i == 0) {
            sArr = C8566.f23893;
        } else {
            short[] sArr2 = new short[i];
            for (int i2 = 0; i2 < i; i2++) {
                sArr2[i2] = byteBuffer.getShort();
            }
            sArr = sArr2;
        }
        return new C8556(this.f23889, sArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m14104() {
        ByteBuffer byteBuffer = this.f23891;
        int i = byteBuffer.getInt();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                int iM6852 = AbstractC3065.m6852(this);
                String strM6772 = AbstractC3064.m6772(this, new char[iM6852]);
                if (strM6772.length() == iM6852) {
                    return strM6772;
                }
                throw new DexException("Declared length " + iM6852 + " doesn't match decoded length of " + strM6772.length());
            } catch (UTFDataFormatException e) {
                throw new DexException(e);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8550[] m14105(int i) {
        C8550[] c8550Arr = new C8550[i];
        int iM6852 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM6852 += AbstractC3065.m6852(this);
            c8550Arr[i2] = new C8550(iM6852, AbstractC3065.m6852(this), AbstractC3065.m6852(this));
        }
        return c8550Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14106() {
        if ((this.f23891.position() & 3) == 0) {
            return;
        }
        C5919.m11250("Not four byte aligned!");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14107(int i) {
        try {
            AbstractC3065.m6827(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f23891.limit() + " exceeded by " + this.f23892);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14108(short s) {
        this.f23891.putShort(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14109(int i) {
        try {
            AbstractC3065.m6829(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f23891.limit() + " exceeded by " + this.f23892);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14110(int i) {
        short s = (short) i;
        if (i == (65535 & s)) {
            m14108(s);
        } else {
            C5919.m11249(AbstractC6136.m11556(i, "Expected an unsigned short: "));
        }
    }
}
