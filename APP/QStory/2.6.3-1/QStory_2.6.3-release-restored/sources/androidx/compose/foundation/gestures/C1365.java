package androidx.compose.foundation.gestures;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2575;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.collection.C2059;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import p128.C8157;
import p192.AbstractC8570;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1365 extends AbstractC2961 implements InterfaceC2618, InterfaceC2575 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f1881;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Orientation f1882;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f1884;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1336 f1886;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f1887;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1343 f1888;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1382 f1885 = new C1382(0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f1883 = -1;

    public C1365(Orientation orientation, C1343 c1343, boolean z, C1336 c1336) {
        this.f1882 = orientation;
        this.f1888 = c1343;
        this.f1887 = z;
        this.f1886 = c1336;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final float m1876(C1365 c1365, InterfaceC1372 interfaceC1372, long j) {
        char c;
        float f;
        long j2;
        C8157 c8157;
        int iCompare;
        long j3 = c1365.f1883;
        C2059 c2059 = c1365.f1885.f1912;
        int i = c2059.f3865 - 1;
        Object[] objArr = c2059.f3866;
        if (i < objArr.length) {
            c8157 = null;
            while (true) {
                if (i < 0) {
                    c = ' ';
                    f = 0.0f;
                    j2 = 4294967295L;
                    break;
                }
                C8157 c81572 = (C8157) ((C1376) objArr[i]).f1904.invoke();
                if (c81572 != null) {
                    long jM13078 = c81572.m13078();
                    long jM1700 = AbstractC1298.m1700(c1365.m1880());
                    f = 0.0f;
                    int i2 = AbstractC1373.f1895[c1365.f1882.ordinal()];
                    if (i2 == 1) {
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM13078 & 4294967295L)), Float.intBitsToFloat((int) (jM1700 & 4294967295L)));
                    } else {
                        if (i2 != 2) {
                            C5043.m9170();
                            return 0.0f;
                        }
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM13078 >> 32)), Float.intBitsToFloat((int) (jM1700 >> 32)));
                    }
                    if (iCompare <= 0) {
                        c8157 = c81572;
                    } else if (c8157 == null) {
                        c8157 = c81572;
                    }
                }
                i--;
            }
        } else {
            c = ' ';
            f = 0.0f;
            j2 = 4294967295L;
            c8157 = null;
        }
        if (c8157 == null) {
            C8157 c81573 = c1365.f1884 ? (C8157) c1365.f1886.invoke() : null;
            if (c81573 == null) {
                return f;
            }
            c8157 = c81573;
        }
        long jM17002 = AbstractC1298.m1700(j3);
        int i3 = AbstractC1373.f1895[c1365.f1882.ordinal()];
        if (i3 == 1) {
            float f2 = c8157.f19884;
            return interfaceC1372.mo1882(f2 - ((int) (j & j2)), c8157.f19882 - f2, Float.intBitsToFloat((int) (jM17002 & j2)));
        }
        if (i3 == 2) {
            float f3 = c8157.f19885;
            return interfaceC1372.mo1882(f3 - ((int) (j >> c)), c8157.f19883 - f3, Float.intBitsToFloat((int) (jM17002 >> c)));
        }
        C5043.m9170();
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m1877(C1365 c1365, C8157 c8157, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c1365.m1880();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM1878 = c1365.m1878(c8157, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM1878 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM1878 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final long m1878(C8157 c8157, long j, long j2) {
        long jM1700 = AbstractC1298.m1700(j);
        int i = AbstractC1373.f1895[this.f1882.ordinal()];
        if (i == 1) {
            InterfaceC1372 interfaceC1372 = (InterfaceC1372) AbstractC2620.m3916(this, AbstractC1375.f1902);
            float f = c8157.f19884;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC1372.mo1882(f - ((int) (j2 & 4294967295L)), c8157.f19882 - f, Float.intBitsToFloat((int) (jM1700 & 4294967295L))))) & 4294967295L);
        }
        if (i != 2) {
            C5043.m9170();
            return 0L;
        }
        InterfaceC1372 interfaceC13722 = (InterfaceC1372) AbstractC2620.m3916(this, AbstractC1375.f1902);
        float f2 = c8157.f19885;
        return (((long) Float.floatToRawIntBits(interfaceC13722.mo1882(f2 - ((int) (j2 >> 32)), c8157.f19883 - f2, Float.intBitsToFloat((int) (jM1700 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1879(long j) {
        C2193 c2193 = AbstractC1375.f1902;
        InterfaceC1372 interfaceC1372 = (InterfaceC1372) AbstractC2620.m3916(this, c2193);
        if (this.f1881) {
            AbstractC8570.m13654("launchAnimation called when previous animation was running");
        }
        ((InterfaceC1372) AbstractC2620.m3916(this, c2193)).getClass();
        InterfaceC1372.f1894.getClass();
        AbstractC6231.m11036(m4427(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new C1328(C1380.f1909), interfaceC1372, j, null), 1);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final long m1880() {
        long j = this.f1883;
        if (C8735.m13916(j, -1L)) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2575
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1881(long j) {
        int iM9464;
        long jM1880 = m1880();
        this.f1883 = j;
        int i = AbstractC1373.f1895[this.f1882.ordinal()];
        if (i == 1) {
            iM9464 = AbstractC5227.m9464((int) (j & 4294967295L), (int) (jM1880 & 4294967295L));
        } else {
            if (i != 2) {
                C5043.m9170();
                return;
            }
            iM9464 = AbstractC5227.m9464((int) (j >> 32), (int) (jM1880 >> 32));
        }
        if (iM9464 >= 0) {
            return;
        }
        long j2 = !this.f1887 ? this.f1882 == Orientation.Vertical ? ((long) (((int) (jM1880 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1880 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        C8157 c8157 = (C8157) this.f1886.invoke();
        if (c8157 == null || this.f1881 || this.f1884 || !m1877(this, c8157, jM1880, 0L, 2) || m1877(this, c8157, 0L, j2, 1)) {
            return;
        }
        this.f1884 = true;
        m1879(j2);
    }
}
