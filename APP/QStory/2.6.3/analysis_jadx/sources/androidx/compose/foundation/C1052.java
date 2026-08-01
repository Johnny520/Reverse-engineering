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
import kotlin.C5176;
import p053.AbstractC6561;
import p112.C7326;
import p205.InterfaceC7896;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1052 implements InterfaceC1084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f3103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f3104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1034 f3105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f3106 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7896 f3107;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f3108;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f3109;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC1788 f3110;

    public C1052(Context context, InterfaceC7896 interfaceC7896, long j, InterfaceC0664 interfaceC0664) {
        this.f3107 = interfaceC7896;
        C1034 c1034 = new C1034(context, AbstractC1581.m2873(j));
        this.f3105 = c1034;
        this.f3104 = AbstractC1367.m2475(C5176.f14739, C1353.f3920);
        this.f3103 = true;
        this.f3109 = 0L;
        this.f3108 = -1L;
        C1053 c1053 = new C1053(this);
        C1652 c1652 = AbstractC1622.f4745;
        C1627 c1627 = new C1627(null, null, c1053);
        this.f3110 = Build.VERSION.SDK_INT >= 31 ? new C1018(c1627, this, c1034) : new C1018(c1627, this, c1034, interfaceC0664);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m1953() {
        long jM13705 = this.f3106;
        if ((9223372034707292159L & jM13705) == 9205357640488583168L) {
            jM13705 = AbstractC8190.m13705(this.f3109);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM13705 >> 32)) / Float.intBitsToFloat((int) (this.f3109 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM13705 & 4294967295L)) / Float.intBitsToFloat((int) (this.f3109 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1954() {
        boolean z;
        C1034 c1034 = this.f3105;
        EdgeEffect edgeEffect = c1034.f3032;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c1034.f3031;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c1034.f3030;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c1034.f3037;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m1960();
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
    public final long mo1955(long r20, int r22, androidx.compose.foundation.gestures.C0510 r23) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1052.mo1955(long, int, androidx.compose.foundation.gestures.飘花落叶言子哲楪苏世兰):long");
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1956() {
        C1034 c1034 = this.f3105;
        EdgeEffect edgeEffect = c1034.f3032;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1977(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1034.f3031;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1977(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1034.f3030;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1977(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1034.f3037;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1977(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1787 mo1957() {
        return this.f3110;
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
    public final java.lang.Object mo1958(long r19, p052.InterfaceC6554 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1052.mo1958(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m1959(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1953() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3109 & 4294967295L));
        EdgeEffect edgeEffectM1942 = this.f3105.m1942();
        float fM1976 = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1976 = AbstractC1069.m1976(edgeEffectM1942, fM1976, f);
        } else {
            edgeEffectM1942.onPull(fM1976, f);
        }
        return (i2 >= 31 ? AbstractC1069.m1977(edgeEffectM1942) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f3109)) * (-fM1976) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1960() {
        if (this.f3103) {
            ((AbstractC1347) this.f3104).setValue(C5176.f14739);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m1961(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1953() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3109 & 4294967295L));
        EdgeEffect edgeEffectM1939 = this.f3105.m1939();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1069.m1976(edgeEffectM1939, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM1939.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1069.m1977(edgeEffectM1939) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3109 & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1962(long j) {
        boolean zM12515 = C7326.m12515(this.f3109, 0L);
        boolean zM125152 = C7326.m12515(j, this.f3109);
        this.f3109 = j;
        if (!zM125152) {
            int iM12058 = AbstractC6561.m12058(Float.intBitsToFloat((int) (j >> 32)));
            long jM12058 = (((long) AbstractC6561.m12058(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM12058) << 32);
            C1034 c1034 = this.f3105;
            c1034.f3033 = jM12058;
            EdgeEffect edgeEffect = c1034.f3032;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM12058 >> 32), (int) (jM12058 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1034.f3031;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM12058 >> 32), (int) (jM12058 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1034.f3030;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM12058 & 4294967295L), (int) (jM12058 >> 32));
            }
            EdgeEffect edgeEffect4 = c1034.f3037;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM12058 & 4294967295L), (int) (jM12058 >> 32));
            }
            EdgeEffect edgeEffect5 = c1034.f3036;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM12058 >> 32), (int) (jM12058 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1034.f3039;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM12058 >> 32), (int) (jM12058 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1034.f3040;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM12058 & 4294967295L), (int) (jM12058 >> 32));
            }
            EdgeEffect edgeEffect8 = c1034.f3038;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM12058), (int) (jM12058 >> 32));
            }
        }
        if (zM12515 || zM125152) {
            return;
        }
        m1954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m1963(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1953() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3109 >> 32));
        EdgeEffect edgeEffectM1941 = this.f3105.m1941();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC1069.m1976(edgeEffectM1941, fIntBitsToFloat2, f);
        } else {
            edgeEffectM1941.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC1069.m1977(edgeEffectM1941) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3109 >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m1964(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m1953() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f3109 >> 32));
        EdgeEffect edgeEffectM1940 = this.f3105.m1940();
        float fM1976 = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1976 = AbstractC1069.m1976(edgeEffectM1940, fM1976, fIntBitsToFloat);
        } else {
            edgeEffectM1940.onPull(fM1976, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC1069.m1977(edgeEffectM1940) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f3109 >> 32)) * (-fM1976) : Float.intBitsToFloat(i);
    }
}
