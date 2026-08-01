package androidx.recyclerview.widget;

import androidx.compose.p001ui.graphics.vector.C2397;
import kotlin.text.AbstractC5976;
import p020.C6928;
import p020.InterfaceC6939;
import p023.C6980;
import p191.AbstractC8568;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3329 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f7820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7821;

    public C3329(C6928 c6928) {
        this.f7821 = 2;
        c6928.getClass();
        this.f7819 = c6928;
        this.f7820 = 262144L;
    }

    public String toString() {
        switch (this.f7821) {
            case 0:
                if (((C3329) this.f7819) == null) {
                    return Long.toBinaryString(this.f7820);
                }
                return ((C3329) this.f7819).toString() + "xx" + Long.toBinaryString(this.f7820);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6980 m5510() {
        C2397 c2397 = new C2397(6, false);
        while (true) {
            String strMo12038 = ((InterfaceC6939) this.f7819).mo12038(this.f7820);
            this.f7820 -= (long) strMo12038.length();
            if (strMo12038.length() == 0) {
                return c2397.m3398();
            }
            int iM10730 = AbstractC5976.m10730(strMo12038, ':', 1, 4);
            if (iM10730 != -1) {
                AbstractC8568.m13641(c2397, strMo12038.substring(0, iM10730), strMo12038.substring(iM10730 + 1));
            } else if (strMo12038.charAt(0) == ':') {
                AbstractC8568.m13641(c2397, "", strMo12038.substring(1));
            } else {
                AbstractC8568.m13641(c2397, "", strMo12038);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m5511(int i, boolean z) {
        if (i >= 64) {
            m5513();
            ((C3329) this.f7819).m5511(i - 64, z);
            return;
        }
        long j = this.f7820;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7820 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m5518(i);
        } else {
            m5515(i);
        }
        if (z2 || ((C3329) this.f7819) != null) {
            m5513();
            ((C3329) this.f7819).m5511(0, z2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m5512(int i) {
        if (i < 64) {
            return ((1 << i) & this.f7820) != 0;
        }
        m5513();
        return ((C3329) this.f7819).m5512(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5513() {
        if (((C3329) this.f7819) == null) {
            this.f7819 = new C3329();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m5514(int i) {
        C3329 c3329 = (C3329) this.f7819;
        if (c3329 == null) {
            long j = this.f7820;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f7820);
        }
        return Long.bitCount(this.f7820) + c3329.m5514(i - 64);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m5515(int i) {
        if (i < 64) {
            this.f7820 &= ~(1 << i);
            return;
        }
        C3329 c3329 = (C3329) this.f7819;
        if (c3329 != null) {
            c3329.m5515(i - 64);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m5516() {
        this.f7820 = 0L;
        C3329 c3329 = (C3329) this.f7819;
        if (c3329 != null) {
            c3329.m5516();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean m5517(int i) {
        if (i >= 64) {
            m5513();
            return ((C3329) this.f7819).m5517(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7820;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7820 = j3;
        long j4 = j - 1;
        this.f7820 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C3329 c3329 = (C3329) this.f7819;
        if (c3329 != null) {
            if (c3329.m5512(0)) {
                m5518(63);
            }
            ((C3329) this.f7819).m5517(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m5518(int i) {
        if (i < 64) {
            this.f7820 |= 1 << i;
        } else {
            m5513();
            ((C3329) this.f7819).m5518(i - 64);
        }
    }

    public C3329(String str, long j) {
        this.f7821 = 1;
        this.f7819 = str;
        this.f7820 = j;
    }

    public C3329() {
        this.f7821 = 0;
        this.f7820 = 0L;
    }
}
