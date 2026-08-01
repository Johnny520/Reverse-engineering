package androidx.recyclerview.widget;

import androidx.compose.ui.graphics.vector.C1562;
import kotlin.text.AbstractC5144;
import p004.C6099;
import p004.InterfaceC6110;
import p007.C6151;
import p175.AbstractC7739;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f7475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7476;

    public C2496(C6099 c6099) {
        this.f7476 = 2;
        c6099.getClass();
        this.f7474 = c6099;
        this.f7475 = 262144L;
    }

    public String toString() {
        switch (this.f7476) {
            case 0:
                if (((C2496) this.f7474) == null) {
                    return Long.toBinaryString(this.f7475);
                }
                return ((C2496) this.f7474).toString() + "xx" + Long.toBinaryString(this.f7475);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6151 m4950() {
        C1562 c1562 = new C1562(6, false);
        while (true) {
            String strMo11479 = ((InterfaceC6110) this.f7474).mo11479(this.f7475);
            this.f7475 -= (long) strMo11479.length();
            if (strMo11479.length() == 0) {
                return c1562.m2838();
            }
            int iM10171 = AbstractC5144.m10171(strMo11479, ':', 1, 4);
            if (iM10171 != -1) {
                AbstractC7739.m13082(c1562, strMo11479.substring(0, iM10171), strMo11479.substring(iM10171 + 1));
            } else if (strMo11479.charAt(0) == ':') {
                AbstractC7739.m13082(c1562, "", strMo11479.substring(1));
            } else {
                AbstractC7739.m13082(c1562, "", strMo11479);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m4951(int i, boolean z) {
        if (i >= 64) {
            m4953();
            ((C2496) this.f7474).m4951(i - 64, z);
            return;
        }
        long j = this.f7475;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7475 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4958(i);
        } else {
            m4955(i);
        }
        if (z2 || ((C2496) this.f7474) != null) {
            m4953();
            ((C2496) this.f7474).m4951(0, z2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m4952(int i) {
        if (i < 64) {
            return ((1 << i) & this.f7475) != 0;
        }
        m4953();
        return ((C2496) this.f7474).m4952(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4953() {
        if (((C2496) this.f7474) == null) {
            this.f7474 = new C2496();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4954(int i) {
        C2496 c2496 = (C2496) this.f7474;
        if (c2496 == null) {
            long j = this.f7475;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f7475);
        }
        return Long.bitCount(this.f7475) + c2496.m4954(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4955(int i) {
        if (i < 64) {
            this.f7475 &= ~(1 << i);
            return;
        }
        C2496 c2496 = (C2496) this.f7474;
        if (c2496 != null) {
            c2496.m4955(i - 64);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m4956() {
        this.f7475 = 0L;
        C2496 c2496 = (C2496) this.f7474;
        if (c2496 != null) {
            c2496.m4956();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m4957(int i) {
        if (i >= 64) {
            m4953();
            return ((C2496) this.f7474).m4957(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7475;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7475 = j3;
        long j4 = j - 1;
        this.f7475 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2496 c2496 = (C2496) this.f7474;
        if (c2496 != null) {
            if (c2496.m4952(0)) {
                m4958(63);
            }
            ((C2496) this.f7474).m4957(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m4958(int i) {
        if (i < 64) {
            this.f7475 |= 1 << i;
        } else {
            m4953();
            ((C2496) this.f7474).m4958(i - 64);
        }
    }

    public C2496(String str, long j) {
        this.f7476 = 1;
        this.f7474 = str;
        this.f7475 = j;
    }

    public C2496() {
        this.f7476 = 0;
        this.f7475 = 0L;
    }
}
