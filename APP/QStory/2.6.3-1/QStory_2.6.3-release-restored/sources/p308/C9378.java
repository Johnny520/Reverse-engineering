package p308;

import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import p160.C8376;
import p299.C9211;
import p300.InterfaceC9215;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9378 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9215 f24199;

    public C9378(C9379 c9379, int i) {
        this(new C9211(c9379.f24200), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m14671() {
        m14676(23);
        this.f24198 = -1;
        return AbstractC3888.m7238(this.f24199, this.f24196, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m14672() {
        m14676(6);
        this.f24198 = -1;
        int i = this.f24196;
        long j = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            j = (j >>> 8) | ((((long) this.f24199.readByte()) & 255) << 56);
        }
        return j >> ((7 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m14673() {
        m14676(17);
        this.f24198 = -1;
        long j = 0;
        for (int i = this.f24196; i >= 0; i--) {
            j = (j >>> 8) | ((((long) this.f24199.readByte()) & 255) << 56);
        }
        return Double.longBitsToDouble(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14674() {
        m14676(29);
        this.f24198 = -1;
        InterfaceC9215 interfaceC9215 = this.f24199;
        this.f24197 = AbstractC3887.m7204(interfaceC9215);
        return AbstractC3887.m7204(interfaceC9215);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14675() {
        if (this.f24198 == -1) {
            byte b = this.f24199.readByte();
            this.f24198 = b & 31;
            this.f24196 = (b & 224) >> 5;
        }
        return this.f24198;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14676(int i) {
        if (m14675() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", Integer.valueOf(i), Integer.valueOf(m14675())));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14677() {
        int iM14675 = m14675();
        InterfaceC9215 interfaceC9215 = this.f24199;
        int i = 0;
        if (iM14675 == 0) {
            m14676(0);
            this.f24198 = -1;
            AbstractC3888.m7241(interfaceC9215, this.f24196);
            return;
        }
        if (iM14675 == 6) {
            m14672();
            return;
        }
        if (iM14675 == 2) {
            m14676(2);
            this.f24198 = -1;
            AbstractC3888.m7241(interfaceC9215, this.f24196);
            return;
        }
        if (iM14675 == 3) {
            m14676(3);
            this.f24198 = -1;
            AbstractC3888.m7238(interfaceC9215, this.f24196, false);
            return;
        }
        if (iM14675 == 4) {
            m14676(4);
            this.f24198 = -1;
            AbstractC3888.m7241(interfaceC9215, this.f24196);
            return;
        }
        if (iM14675 == 16) {
            m14676(16);
            this.f24198 = -1;
            Float.intBitsToFloat(AbstractC3888.m7238(interfaceC9215, this.f24196, true));
            return;
        }
        if (iM14675 == 17) {
            m14673();
            return;
        }
        switch (iM14675) {
            case 21:
                m14676(21);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 22:
                m14676(22);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 23:
                m14671();
                break;
            case 24:
                m14676(24);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 25:
                m14676(25);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 26:
                m14676(26);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 27:
                m14676(27);
                this.f24198 = -1;
                AbstractC3888.m7238(interfaceC9215, this.f24196, false);
                break;
            case 28:
                m14676(28);
                this.f24198 = -1;
                int iM7204 = AbstractC3887.m7204(interfaceC9215);
                while (i < iM7204) {
                    m14677();
                    i++;
                }
                break;
            case 29:
                int iM14674 = m14674();
                while (i < iM14674) {
                    AbstractC3887.m7204(interfaceC9215);
                    m14677();
                    i++;
                }
                break;
            case 30:
                m14676(30);
                this.f24198 = -1;
                break;
            case 31:
                m14676(31);
                this.f24198 = -1;
                break;
            default:
                C8376.m13329(Integer.toHexString(this.f24198), "Unexpected type: ");
                break;
        }
    }

    public C9378(InterfaceC9215 interfaceC9215) {
        this.f24198 = -1;
        this.f24199 = interfaceC9215;
    }

    public C9378(InterfaceC9215 interfaceC9215, int i) {
        this.f24199 = interfaceC9215;
        this.f24198 = i;
    }
}
