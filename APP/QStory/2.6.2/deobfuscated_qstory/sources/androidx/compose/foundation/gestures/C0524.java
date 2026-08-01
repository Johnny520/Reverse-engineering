package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1358;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1740;
import androidx.compose.ui.node.InterfaceC1783;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import p112.C7327;
import p176.AbstractC7740;
import p205.C7905;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 extends AbstractC2128 implements InterfaceC1783, InterfaceC1740 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f1535;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Orientation f1536;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f1538;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0495 f1540;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f1541;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0502 f1542;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0541 f1539 = new C0541(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f1537 = -1;

    public C0524(Orientation orientation, C0502 c0502, boolean z, C0495 c0495) {
        this.f1536 = orientation;
        this.f1542 = c0502;
        this.f1541 = z;
        this.f1540 = c0495;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final float m1306(C0524 c0524, InterfaceC0531 interfaceC0531, long j) {
        char c;
        float f;
        long j2;
        C7327 c7327;
        int iCompare;
        long j3 = c0524.f1537;
        C1224 c1224 = c0524.f1539.f1566;
        int i = c1224.f3519 - 1;
        Object[] objArr = c1224.f3520;
        if (i < objArr.length) {
            c7327 = null;
            while (true) {
                if (i < 0) {
                    c = ' ';
                    f = 0.0f;
                    j2 = 4294967295L;
                    break;
                }
                C7327 c73272 = (C7327) ((C0535) objArr[i]).f1558.invoke();
                if (c73272 != null) {
                    long jM12492 = c73272.m12492();
                    long jM13654 = AbstractC8189.m13654(c0524.m1310());
                    f = 0.0f;
                    int i2 = AbstractC0532.f1549[c0524.f1536.ordinal()];
                    if (i2 == 1) {
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM12492 & 4294967295L)), Float.intBitsToFloat((int) (jM13654 & 4294967295L)));
                    } else {
                        if (i2 != 2) {
                            C4210.m8621();
                            return 0.0f;
                        }
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM12492 >> 32)), Float.intBitsToFloat((int) (jM13654 >> 32)));
                    }
                    if (iCompare <= 0) {
                        c7327 = c73272;
                    } else if (c7327 == null) {
                        c7327 = c73272;
                    }
                }
                i--;
            }
        } else {
            c = ' ';
            f = 0.0f;
            j2 = 4294967295L;
            c7327 = null;
        }
        if (c7327 == null) {
            C7327 c73273 = c0524.f1538 ? (C7327) c0524.f1540.invoke() : null;
            if (c73273 == null) {
                return f;
            }
            c7327 = c73273;
        }
        long jM136542 = AbstractC8189.m13654(j3);
        int i3 = AbstractC0532.f1549[c0524.f1536.ordinal()];
        if (i3 == 1) {
            float f2 = c7327.f19544;
            return interfaceC0531.mo1312(f2 - ((int) (j & j2)), c7327.f19542 - f2, Float.intBitsToFloat((int) (jM136542 & j2)));
        }
        if (i3 == 2) {
            float f3 = c7327.f19545;
            return interfaceC0531.mo1312(f3 - ((int) (j >> c)), c7327.f19543 - f3, Float.intBitsToFloat((int) (jM136542 >> c)));
        }
        C4210.m8621();
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m1307(C0524 c0524, C7327 c7327, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c0524.m1310();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM1308 = c0524.m1308(c7327, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM1308 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM1308 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final long m1308(C7327 c7327, long j, long j2) {
        long jM13654 = AbstractC8189.m13654(j);
        int i = AbstractC0532.f1549[this.f1536.ordinal()];
        if (i == 1) {
            InterfaceC0531 interfaceC0531 = (InterfaceC0531) AbstractC1785.m3346(this, AbstractC0534.f1556);
            float f = c7327.f19544;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC0531.mo1312(f - ((int) (j2 & 4294967295L)), c7327.f19542 - f, Float.intBitsToFloat((int) (jM13654 & 4294967295L))))) & 4294967295L);
        }
        if (i != 2) {
            C4210.m8621();
            return 0L;
        }
        InterfaceC0531 interfaceC05312 = (InterfaceC0531) AbstractC1785.m3346(this, AbstractC0534.f1556);
        float f2 = c7327.f19545;
        return (((long) Float.floatToRawIntBits(interfaceC05312.mo1312(f2 - ((int) (j2 >> 32)), c7327.f19543 - f2, Float.intBitsToFloat((int) (jM13654 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1309(long j) {
        C1358 c1358 = AbstractC0534.f1556;
        InterfaceC0531 interfaceC0531 = (InterfaceC0531) AbstractC1785.m3346(this, c1358);
        if (this.f1535) {
            AbstractC7740.m13067("launchAnimation called when previous animation was running");
        }
        ((InterfaceC0531) AbstractC1785.m3346(this, c1358)).getClass();
        InterfaceC0531.f1548.getClass();
        AbstractC5398.m10473(m3857(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new C0487(C0539.f1563), interfaceC0531, j, null), 1);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final long m1310() {
        long j = this.f1537;
        if (C7905.m13329(j, -1L)) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1311(long j) {
        int iM8915;
        long jM1310 = m1310();
        this.f1537 = j;
        int i = AbstractC0532.f1549[this.f1536.ordinal()];
        if (i == 1) {
            iM8915 = AbstractC4394.m8915((int) (j & 4294967295L), (int) (jM1310 & 4294967295L));
        } else {
            if (i != 2) {
                C4210.m8621();
                return;
            }
            iM8915 = AbstractC4394.m8915((int) (j >> 32), (int) (jM1310 >> 32));
        }
        if (iM8915 >= 0) {
            return;
        }
        long j2 = !this.f1541 ? this.f1536 == Orientation.Vertical ? ((long) (((int) (jM1310 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1310 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        C7327 c7327 = (C7327) this.f1540.invoke();
        if (c7327 == null || this.f1535 || this.f1538 || !m1307(this, c7327, jM1310, 0L, 2) || m1307(this, c7327, 0L, j2, 1)) {
            return;
        }
        this.f1538 = true;
        m1309(j2);
    }
}
