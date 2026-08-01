package p308;

import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import p025.AbstractC7012;
import p300.InterfaceC9214;
import p300.InterfaceC9215;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9386 implements InterfaceC9215, InterfaceC9214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C9387 f24225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteBuffer f24227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24228;

    public C9386(C9387 c9387, String str, ByteBuffer byteBuffer) {
        this.f24225 = c9387;
        this.f24228 = str;
        this.f24227 = byteBuffer;
        this.f24226 = byteBuffer.position();
    }

    @Override // p300.InterfaceC9215
    public final byte readByte() {
        return this.f24227.get();
    }

    public final void write(byte[] bArr) {
        this.f24227.put(bArr);
    }

    @Override // p300.InterfaceC9214
    public final void writeByte(int i) {
        this.f24227.put((byte) i);
    }

    public final void writeInt(int i) {
        this.f24227.putInt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14679() {
        return this.f24227.position() - this.f24226;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14680() {
        return this.f24227.getShort() & 65535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9377 m14681() {
        short[] sArr;
        ByteBuffer byteBuffer = this.f24227;
        int i = byteBuffer.getInt();
        if (i == 0) {
            sArr = C9387.f24229;
        } else {
            short[] sArr2 = new short[i];
            for (int i2 = 0; i2 < i; i2++) {
                sArr2[i2] = byteBuffer.getShort();
            }
            sArr = sArr2;
        }
        return new C9377(this.f24225, sArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m14682() {
        ByteBuffer byteBuffer = this.f24227;
        int i = byteBuffer.getInt();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            try {
                int iM7204 = AbstractC3887.m7204(this);
                String strM7427 = AbstractC3898.m7427(this, new char[iM7204]);
                if (strM7427.length() == iM7204) {
                    return strM7427;
                }
                throw new DexException("Declared length " + iM7204 + " doesn't match decoded length of " + strM7427.length());
            } catch (UTFDataFormatException e) {
                throw new DexException(e);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9371[] m14683(int i) {
        C9371[] c9371Arr = new C9371[i];
        int iM7204 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM7204 += AbstractC3887.m7204(this);
            c9371Arr[i2] = new C9371(iM7204, AbstractC3887.m7204(this), AbstractC3887.m7204(this));
        }
        return c9371Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14684() {
        if ((this.f24227.position() & 3) == 0) {
            return;
        }
        C6755.m11870("Not four byte aligned!");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14685(int i) {
        try {
            AbstractC3887.m7193(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f24227.limit() + " exceeded by " + this.f24228);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14686(short s) {
        this.f24227.putShort(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14687(int i) {
        try {
            AbstractC3887.m7194(this, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new DexException("Section limit " + this.f24227.limit() + " exceeded by " + this.f24228);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14688(int i) {
        short s = (short) i;
        if (i == (65535 & s)) {
            m14686(s);
        } else {
            C6755.m11869(AbstractC7012.m12147(i, "Expected an unsigned short: "));
        }
    }
}
