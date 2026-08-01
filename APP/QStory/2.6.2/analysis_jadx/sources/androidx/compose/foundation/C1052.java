package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.C5175;
import p000.AbstractC6087;
import p053.AbstractC6560;
import p112.C7325;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1052 implements InterfaceC1084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f3102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f3103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1034 f3104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f3105 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7895 f3106;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f3107;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f3108;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC1788 f3109;

    public C1052(Context context, InterfaceC7895 interfaceC7895, long j, InterfaceC0664 interfaceC0664) {
        this.f3106 = interfaceC7895;
        C1034 c1034 = new C1034(context, AbstractC1581.m2863(j));
        this.f3104 = c1034;
        this.f3103 = AbstractC1367.m2466(C5175.f14739, C1353.f3919);
        this.f3102 = true;
        this.f3108 = 0L;
        this.f3107 = -1L;
        C1053 c1053 = new C1053(this);
        C1652 c1652 = AbstractC1622.f4744;
        C1627 c1627 = new C1627(null, null, c1053);
        this.f3109 = Build.VERSION.SDK_INT >= 31 ? new C1018(c1627, this, c1034) : new C1018(c1627, this, c1034, interfaceC0664);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m1943() {
        long jM11406 = this.f3105;
        if ((9223372034707292159L & jM11406) == 9205357640488583168L) {
            jM11406 = AbstractC6087.m11406(this.f3108);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM11406 >> 32)) / Float.intBitsToFloat((int) (this.f3108 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM11406 & 4294967295L)) / Float.intBitsToFloat((int) (this.f3108 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1944() {
        boolean z;
        C1034 c1034 = this.f3104;
        EdgeEffect edgeEffect = c1034.f3031;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c1034.f3030;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c1034.f3029;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c1034.f3036;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m1950();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[PHI: r7
  0x0131: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015f, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo1945(long r20, int r22, androidx.compose.foundation.gestures.C0510 r23) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1052.mo1945(long, int, androidx.compose.foundation.gestures.飘花落叶言子哲楪苏世兰):long");
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1946() {
        C1034 c1034 = this.f3104;
        EdgeEffect edgeEffect = c1034.f3031;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1967(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1034.f3030;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1967(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1034.f3029;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1967(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1034.f3036;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1967(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1787 mo1947() {
        return this.f3109;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1948(long r19, p052.InterfaceC6553 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1052.mo1948(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m1949(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1943() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3108 & 4294967295L));
        EdgeEffect edgeEffectM1932 = this.f3104.m1932();
        float fM1966 = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1966 = AbstractC1069.m1966(edgeEffectM1932, fM1966, f);
        } else {
            edgeEffectM1932.onPull(fM1966, f);
        }
        return (i2 >= 31 ? AbstractC1069.m1967(edgeEffectM1932) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f3108)) * (-fM1966) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1950() {
        if (this.f3102) {
            ((AbstractC1347) this.f3103).setValue(C5175.f14739);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m1951(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1943() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3108 & 4294967295L));
        EdgeEffect edgeEffectM1929 = this.f3104.m1929();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1069.m1966(edgeEffectM1929, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM1929.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1069.m1967(edgeEffectM1929) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3108 & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1952(long j) {
        boolean zM12488 = C7325.m12488(this.f3108, 0L);
        boolean zM124882 = C7325.m12488(j, this.f3108);
        this.f3108 = j;
        if (!zM124882) {
            int iM12006 = AbstractC6560.m12006(Float.intBitsToFloat((int) (j >> 32)));
            long jM12006 = (((long) AbstractC6560.m12006(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM12006) << 32);
            C1034 c1034 = this.f3104;
            c1034.f3032 = jM12006;
            EdgeEffect edgeEffect = c1034.f3031;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM12006 >> 32), (int) (jM12006 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1034.f3030;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM12006 >> 32), (int) (jM12006 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1034.f3029;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM12006 & 4294967295L), (int) (jM12006 >> 32));
            }
            EdgeEffect edgeEffect4 = c1034.f3036;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM12006 & 4294967295L), (int) (jM12006 >> 32));
            }
            EdgeEffect edgeEffect5 = c1034.f3035;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM12006 >> 32), (int) (jM12006 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1034.f3038;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM12006 >> 32), (int) (jM12006 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1034.f3039;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM12006 & 4294967295L), (int) (jM12006 >> 32));
            }
            EdgeEffect edgeEffect8 = c1034.f3037;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM12006), (int) (jM12006 >> 32));
            }
        }
        if (zM12488 || zM124882) {
            return;
        }
        m1944();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m1953(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1943() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3108 >> 32));
        EdgeEffect edgeEffectM1931 = this.f3104.m1931();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1069.m1966(edgeEffectM1931, fIntBitsToFloat2, f);
        } else {
            edgeEffectM1931.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC1069.m1967(edgeEffectM1931) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3108 >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m1954(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1943() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3108 >> 32));
        EdgeEffect edgeEffectM1930 = this.f3104.m1930();
        float fM1966 = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1966 = AbstractC1069.m1966(edgeEffectM1930, fM1966, fIntBitsToFloat);
        } else {
            edgeEffectM1930.onPull(fM1966, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1069.m1967(edgeEffectM1930) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3108 >> 32)) * (-fM1966) : Float.intBitsToFloat(i);
    }
}
