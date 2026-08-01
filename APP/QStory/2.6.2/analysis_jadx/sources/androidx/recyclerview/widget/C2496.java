package androidx.recyclerview.widget;

import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3065;
import kotlin.text.AbstractC5143;
import p005.C6108;
import p005.InterfaceC6119;
import p015.C6224;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f7474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7475;

    public C2496(C6108 c6108) {
        this.f7475 = 2;
        c6108.getClass();
        this.f7473 = c6108;
        this.f7474 = 262144L;
    }

    public String toString() {
        switch (this.f7475) {
            case 0:
                if (((C2496) this.f7473) == null) {
                    return Long.toBinaryString(this.f7474);
                }
                return ((C2496) this.f7473).toString() + "xx" + Long.toBinaryString(this.f7474);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6224 m4940() {
        C1562 c1562 = new C1562(6, false);
        while (true) {
            String strMo11472 = ((InterfaceC6119) this.f7473).mo11472(this.f7474);
            this.f7474 -= (long) strMo11472.length();
            if (strMo11472.length() == 0) {
                return c1562.m2828();
            }
            int iM10151 = AbstractC5143.m10151(strMo11472, ':', 1, 4);
            if (iM10151 != -1) {
                AbstractC3065.m6839(c1562, strMo11472.substring(0, iM10151), strMo11472.substring(iM10151 + 1));
            } else if (strMo11472.charAt(0) == ':') {
                AbstractC3065.m6839(c1562, "", strMo11472.substring(1));
            } else {
                AbstractC3065.m6839(c1562, "", strMo11472);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m4941(int i, boolean z) {
        if (i >= 64) {
            m4943();
            ((C2496) this.f7473).m4941(i - 64, z);
            return;
        }
        long j = this.f7474;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7474 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4948(i);
        } else {
            m4945(i);
        }
        if (z2 || ((C2496) this.f7473) != null) {
            m4943();
            ((C2496) this.f7473).m4941(0, z2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m4942(int i) {
        if (i < 64) {
            return ((1 << i) & this.f7474) != 0;
        }
        m4943();
        return ((C2496) this.f7473).m4942(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4943() {
        if (((C2496) this.f7473) == null) {
            this.f7473 = new C2496();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4944(int i) {
        C2496 c2496 = (C2496) this.f7473;
        if (c2496 == null) {
            long j = this.f7474;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f7474);
        }
        return Long.bitCount(this.f7474) + c2496.m4944(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4945(int i) {
        if (i < 64) {
            this.f7474 &= ~(1 << i);
            return;
        }
        C2496 c2496 = (C2496) this.f7473;
        if (c2496 != null) {
            c2496.m4945(i - 64);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m4946() {
        this.f7474 = 0L;
        C2496 c2496 = (C2496) this.f7473;
        if (c2496 != null) {
            c2496.m4946();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m4947(int i) {
        if (i >= 64) {
            m4943();
            return ((C2496) this.f7473).m4947(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7474;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7474 = j3;
        long j4 = j - 1;
        this.f7474 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2496 c2496 = (C2496) this.f7473;
        if (c2496 != null) {
            if (c2496.m4942(0)) {
                m4948(63);
            }
            ((C2496) this.f7473).m4947(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m4948(int i) {
        if (i < 64) {
            this.f7474 |= 1 << i;
        } else {
            m4943();
            ((C2496) this.f7473).m4948(i - 64);
        }
    }

    public C2496(String str, long j) {
        this.f7475 = 1;
        this.f7473 = str;
        this.f7474 = j;
    }

    public C2496() {
        this.f7475 = 0;
        this.f7474 = 0L;
    }
}
