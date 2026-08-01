package p292;

import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3065;
import p144.C7546;
import p283.C8381;
import p284.InterfaceC8385;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8385 f23863;

    public C8557(C8558 c8558, int i) {
        this(new C8381(c8558.f23864), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14093() {
        m14098(23);
        this.f23862 = -1;
        return AbstractC3054.m6604(this.f23863, this.f23860, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m14094() {
        m14098(6);
        this.f23862 = -1;
        int i = this.f23860;
        long j = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            j = (j >>> 8) | ((((long) this.f23863.readByte()) & 255) << 56);
        }
        return j >> ((7 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m14095() {
        m14098(17);
        this.f23862 = -1;
        long j = 0;
        for (int i = this.f23860; i >= 0; i--) {
            j = (j >>> 8) | ((((long) this.f23863.readByte()) & 255) << 56);
        }
        return Double.longBitsToDouble(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14096() {
        m14098(29);
        this.f23862 = -1;
        InterfaceC8385 interfaceC8385 = this.f23863;
        this.f23861 = AbstractC3065.m6852(interfaceC8385);
        return AbstractC3065.m6852(interfaceC8385);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14097() {
        if (this.f23862 == -1) {
            byte b = this.f23863.readByte();
            this.f23862 = b & 31;
            this.f23860 = (b & 224) >> 5;
        }
        return this.f23862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14098(int i) {
        if (m14097() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", Integer.valueOf(i), Integer.valueOf(m14097())));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14099() {
        int iM14097 = m14097();
        InterfaceC8385 interfaceC8385 = this.f23863;
        int i = 0;
        if (iM14097 == 0) {
            m14098(0);
            this.f23862 = -1;
            AbstractC3054.m6603(interfaceC8385, this.f23860);
            return;
        }
        if (iM14097 == 6) {
            m14094();
            return;
        }
        if (iM14097 == 2) {
            m14098(2);
            this.f23862 = -1;
            AbstractC3054.m6603(interfaceC8385, this.f23860);
            return;
        }
        if (iM14097 == 3) {
            m14098(3);
            this.f23862 = -1;
            AbstractC3054.m6604(interfaceC8385, this.f23860, false);
            return;
        }
        if (iM14097 == 4) {
            m14098(4);
            this.f23862 = -1;
            AbstractC3054.m6603(interfaceC8385, this.f23860);
            return;
        }
        if (iM14097 == 16) {
            m14098(16);
            this.f23862 = -1;
            Float.intBitsToFloat(AbstractC3054.m6604(interfaceC8385, this.f23860, true));
            return;
        }
        if (iM14097 == 17) {
            m14095();
            return;
        }
        switch (iM14097) {
            case 21:
                m14098(21);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 22:
                m14098(22);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 23:
                m14093();
                break;
            case 24:
                m14098(24);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 25:
                m14098(25);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 26:
                m14098(26);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 27:
                m14098(27);
                this.f23862 = -1;
                AbstractC3054.m6604(interfaceC8385, this.f23860, false);
                break;
            case 28:
                m14098(28);
                this.f23862 = -1;
                int iM6852 = AbstractC3065.m6852(interfaceC8385);
                while (i < iM6852) {
                    m14099();
                    i++;
                }
                break;
            case 29:
                int iM14096 = m14096();
                while (i < iM14096) {
                    AbstractC3065.m6852(interfaceC8385);
                    m14099();
                    i++;
                }
                break;
            case 30:
                m14098(30);
                this.f23862 = -1;
                break;
            case 31:
                m14098(31);
                this.f23862 = -1;
                break;
            default:
                C7546.m12741(Integer.toHexString(this.f23862), "Unexpected type: ");
                break;
        }
    }

    public C8557(InterfaceC8385 interfaceC8385) {
        this.f23862 = -1;
        this.f23863 = interfaceC8385;
    }

    public C8557(InterfaceC8385 interfaceC8385, int i) {
        this.f23863 = interfaceC8385;
        this.f23862 = i;
    }
}
