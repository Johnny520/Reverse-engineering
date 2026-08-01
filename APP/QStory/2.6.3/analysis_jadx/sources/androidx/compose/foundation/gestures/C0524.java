package androidx.compose.foundation.gestures;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1740;
import androidx.compose.ui.node.InterfaceC1783;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import p112.C7328;
import p176.AbstractC7741;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 extends AbstractC2128 implements InterfaceC1783, InterfaceC1740 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f1536;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Orientation f1537;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f1539;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0495 f1541;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f1542;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0502 f1543;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0541 f1540 = new C0541(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f1538 = -1;

    public C0524(Orientation orientation, C0502 c0502, boolean z, C0495 c0495) {
        this.f1537 = orientation;
        this.f1543 = c0502;
        this.f1542 = z;
        this.f1541 = c0495;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final float m1316(C0524 c0524, InterfaceC0531 interfaceC0531, long j) {
        char c;
        float f;
        long j2;
        C7328 c7328;
        int iCompare;
        long j3 = c0524.f1538;
        C1224 c1224 = c0524.f1540.f1567;
        int i = c1224.f3520 - 1;
        Object[] objArr = c1224.f3521;
        if (i < objArr.length) {
            c7328 = null;
            while (true) {
                if (i < 0) {
                    c = ' ';
                    f = 0.0f;
                    j2 = 4294967295L;
                    break;
                }
                C7328 c73282 = (C7328) ((C0535) objArr[i]).f1559.invoke();
                if (c73282 != null) {
                    long jM12519 = c73282.m12519();
                    long jM1140 = AbstractC0455.m1140(c0524.m1320());
                    f = 0.0f;
                    int i2 = AbstractC0532.f1550[c0524.f1537.ordinal()];
                    if (i2 == 1) {
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM12519 & 4294967295L)), Float.intBitsToFloat((int) (jM1140 & 4294967295L)));
                    } else {
                        if (i2 != 2) {
                            C4211.m8611();
                            return 0.0f;
                        }
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM12519 >> 32)), Float.intBitsToFloat((int) (jM1140 >> 32)));
                    }
                    if (iCompare <= 0) {
                        c7328 = c73282;
                    } else if (c7328 == null) {
                        c7328 = c73282;
                    }
                }
                i--;
            }
        } else {
            c = ' ';
            f = 0.0f;
            j2 = 4294967295L;
            c7328 = null;
        }
        if (c7328 == null) {
            C7328 c73283 = c0524.f1539 ? (C7328) c0524.f1541.invoke() : null;
            if (c73283 == null) {
                return f;
            }
            c7328 = c73283;
        }
        long jM11402 = AbstractC0455.m1140(j3);
        int i3 = AbstractC0532.f1550[c0524.f1537.ordinal()];
        if (i3 == 1) {
            float f2 = c7328.f19539;
            return interfaceC0531.mo1322(f2 - ((int) (j & j2)), c7328.f19537 - f2, Float.intBitsToFloat((int) (jM11402 & j2)));
        }
        if (i3 == 2) {
            float f3 = c7328.f19540;
            return interfaceC0531.mo1322(f3 - ((int) (j >> c)), c7328.f19538 - f3, Float.intBitsToFloat((int) (jM11402 >> c)));
        }
        C4211.m8611();
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m1317(C0524 c0524, C7328 c7328, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c0524.m1320();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM1318 = c0524.m1318(c7328, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM1318 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM1318 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final long m1318(C7328 c7328, long j, long j2) {
        long jM1140 = AbstractC0455.m1140(j);
        int i = AbstractC0532.f1550[this.f1537.ordinal()];
        if (i == 1) {
            InterfaceC0531 interfaceC0531 = (InterfaceC0531) AbstractC1785.m3356(this, AbstractC0534.f1557);
            float f = c7328.f19539;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC0531.mo1322(f - ((int) (j2 & 4294967295L)), c7328.f19537 - f, Float.intBitsToFloat((int) (jM1140 & 4294967295L))))) & 4294967295L);
        }
        if (i != 2) {
            C4211.m8611();
            return 0L;
        }
        InterfaceC0531 interfaceC05312 = (InterfaceC0531) AbstractC1785.m3356(this, AbstractC0534.f1557);
        float f2 = c7328.f19540;
        return (((long) Float.floatToRawIntBits(interfaceC05312.mo1322(f2 - ((int) (j2 >> 32)), c7328.f19538 - f2, Float.intBitsToFloat((int) (jM1140 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1319(long j) {
        C1358 c1358 = AbstractC0534.f1557;
        InterfaceC0531 interfaceC0531 = (InterfaceC0531) AbstractC1785.m3356(this, c1358);
        if (this.f1536) {
            AbstractC7741.m13095("launchAnimation called when previous animation was running");
        }
        ((InterfaceC0531) AbstractC1785.m3356(this, c1358)).getClass();
        InterfaceC0531.f1549.getClass();
        AbstractC5399.m10477(m3867(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new C0487(C0539.f1564), interfaceC0531, j, null), 1);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final long m1320() {
        long j = this.f1538;
        if (C7906.m13357(j, -1L)) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1321(long j) {
        int iM8905;
        long jM1320 = m1320();
        this.f1538 = j;
        int i = AbstractC0532.f1550[this.f1537.ordinal()];
        if (i == 1) {
            iM8905 = AbstractC4395.m8905((int) (j & 4294967295L), (int) (jM1320 & 4294967295L));
        } else {
            if (i != 2) {
                C4211.m8611();
                return;
            }
            iM8905 = AbstractC4395.m8905((int) (j >> 32), (int) (jM1320 >> 32));
        }
        if (iM8905 >= 0) {
            return;
        }
        long j2 = !this.f1542 ? this.f1537 == Orientation.Vertical ? ((long) (((int) (jM1320 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1320 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        C7328 c7328 = (C7328) this.f1541.invoke();
        if (c7328 == null || this.f1536 || this.f1539 || !m1317(this, c7328, jM1320, 0L, 2) || m1317(this, c7328, 0L, j2, 1)) {
            return;
        }
        this.f1539 = true;
        m1319(j2);
    }
}
