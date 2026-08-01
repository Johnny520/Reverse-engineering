package p292;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import p144.C7547;
import p283.C8382;
import p284.InterfaceC8386;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8549 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8386 f23854;

    public C8549(C8550 c8550, int i) {
        this(new C8382(c8550.f23855), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14112() {
        m14117(23);
        this.f23853 = -1;
        return AbstractC3056.m6678(this.f23854, this.f23851, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m14113() {
        m14117(6);
        this.f23853 = -1;
        int i = this.f23851;
        long j = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            j = (j >>> 8) | ((((long) this.f23854.readByte()) & 255) << 56);
        }
        return j >> ((7 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m14114() {
        m14117(17);
        this.f23853 = -1;
        long j = 0;
        for (int i = this.f23851; i >= 0; i--) {
            j = (j >>> 8) | ((((long) this.f23854.readByte()) & 255) << 56);
        }
        return Double.longBitsToDouble(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14115() {
        m14117(29);
        this.f23853 = -1;
        InterfaceC8386 interfaceC8386 = this.f23854;
        this.f23852 = AbstractC3055.m6644(interfaceC8386);
        return AbstractC3055.m6644(interfaceC8386);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14116() {
        if (this.f23853 == -1) {
            byte b = this.f23854.readByte();
            this.f23853 = b & 31;
            this.f23851 = (b & 224) >> 5;
        }
        return this.f23853;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14117(int i) {
        if (m14116() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", Integer.valueOf(i), Integer.valueOf(m14116())));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14118() {
        int iM14116 = m14116();
        InterfaceC8386 interfaceC8386 = this.f23854;
        int i = 0;
        if (iM14116 == 0) {
            m14117(0);
            this.f23853 = -1;
            AbstractC3056.m6681(interfaceC8386, this.f23851);
            return;
        }
        if (iM14116 == 6) {
            m14113();
            return;
        }
        if (iM14116 == 2) {
            m14117(2);
            this.f23853 = -1;
            AbstractC3056.m6681(interfaceC8386, this.f23851);
            return;
        }
        if (iM14116 == 3) {
            m14117(3);
            this.f23853 = -1;
            AbstractC3056.m6678(interfaceC8386, this.f23851, false);
            return;
        }
        if (iM14116 == 4) {
            m14117(4);
            this.f23853 = -1;
            AbstractC3056.m6681(interfaceC8386, this.f23851);
            return;
        }
        if (iM14116 == 16) {
            m14117(16);
            this.f23853 = -1;
            Float.intBitsToFloat(AbstractC3056.m6678(interfaceC8386, this.f23851, true));
            return;
        }
        if (iM14116 == 17) {
            m14114();
            return;
        }
        switch (iM14116) {
            case 21:
                m14117(21);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 22:
                m14117(22);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 23:
                m14112();
                break;
            case 24:
                m14117(24);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 25:
                m14117(25);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 26:
                m14117(26);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 27:
                m14117(27);
                this.f23853 = -1;
                AbstractC3056.m6678(interfaceC8386, this.f23851, false);
                break;
            case 28:
                m14117(28);
                this.f23853 = -1;
                int iM6644 = AbstractC3055.m6644(interfaceC8386);
                while (i < iM6644) {
                    m14118();
                    i++;
                }
                break;
            case 29:
                int iM14115 = m14115();
                while (i < iM14115) {
                    AbstractC3055.m6644(interfaceC8386);
                    m14118();
                    i++;
                }
                break;
            case 30:
                m14117(30);
                this.f23853 = -1;
                break;
            case 31:
                m14117(31);
                this.f23853 = -1;
                break;
            default:
                C7547.m12770(Integer.toHexString(this.f23853), "Unexpected type: ");
                break;
        }
    }

    public C8549(InterfaceC8386 interfaceC8386) {
        this.f23853 = -1;
        this.f23854 = interfaceC8386;
    }

    public C8549(InterfaceC8386 interfaceC8386, int i) {
        this.f23854 = interfaceC8386;
        this.f23853 = i;
    }
}
