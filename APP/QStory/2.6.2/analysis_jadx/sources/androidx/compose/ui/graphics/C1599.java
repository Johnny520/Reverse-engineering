package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import androidx.collection.C0246;
import androidx.compose.ui.graphics.colorspace.AbstractC1490;
import androidx.compose.ui.graphics.colorspace.AbstractC1498;
import androidx.compose.ui.graphics.colorspace.AbstractC1501;
import androidx.compose.ui.graphics.colorspace.C1486;
import androidx.compose.ui.graphics.colorspace.C1489;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5186;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1599 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f4691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f4692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f4693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f4694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f4695 = AbstractC1581.m2870(4278190080L);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long f4696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f4697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ int f4698 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4699;

    static {
        AbstractC1581.m2870(4282664004L);
        f4694 = AbstractC1581.m2870(4287137928L);
        AbstractC1581.m2870(4291611852L);
        f4693 = AbstractC1581.m2870(4294967295L);
        f4692 = AbstractC1581.m2870(4294901760L);
        AbstractC1581.m2870(4278255360L);
        f4691 = AbstractC1581.m2870(4278190335L);
        AbstractC1581.m2870(4294967040L);
        AbstractC1581.m2870(4278255615L);
        AbstractC1581.m2870(4294902015L);
        f4697 = AbstractC1581.m2872(0);
        f4696 = AbstractC1581.m2873(0.0f, 0.0f, 0.0f, 0.0f, C1489.f4220);
    }

    public /* synthetic */ C1599(long j) {
        this.f4699 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC1490 m2936(long j) {
        float[] fArr = C1489.f4215;
        return C1489.f4209[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float m2937(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5186.m10208((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = Opcodes.CONST_METHOD_TYPE;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4670;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float m2938(long j) {
        float fM10208;
        float f;
        if ((63 & j) == 0) {
            fM10208 = (float) AbstractC5186.m10208((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM10208 = (float) AbstractC5186.m10208((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM10208 / f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2939(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m2940(float f, long j) {
        return AbstractC1581.m2873(m2942(j), m2943(j), m2937(j), f, m2936(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m2941(long j, AbstractC1490 abstractC1490) {
        C1486 c1486M2659;
        AbstractC1490 abstractC1490M2936 = m2936(j);
        int i = abstractC1490M2936.f4234;
        int i2 = abstractC1490.f4234;
        if ((i | i2) < 0) {
            c1486M2659 = AbstractC1501.m2659(abstractC1490M2936, abstractC1490);
        } else {
            C0246 c0246 = AbstractC1498.f4267;
            int i3 = i | (i2 << 6);
            Object objM832 = c0246.m832(i3);
            if (objM832 == null) {
                objM832 = AbstractC1501.m2659(abstractC1490M2936, abstractC1490);
                c0246.m789(i3, objM832);
            }
            c1486M2659 = (C1486) objM832;
        }
        return c1486M2659.mo2646(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m2942(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5186.m10208((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = Opcodes.CONST_METHOD_TYPE;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4670;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final float m2943(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5186.m10208((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = Opcodes.CONST_METHOD_TYPE;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4670;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m2944(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m2942(j));
        sb.append(", ");
        sb.append(m2943(j));
        sb.append(", ");
        sb.append(m2937(j));
        sb.append(", ");
        sb.append(m2938(j));
        sb.append(", ");
        return AbstractC0053.m155(sb, m2936(j).f4236, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1599) {
            return this.f4699 == ((C1599) obj).f4699;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4699);
    }

    public final String toString() {
        return m2944(this.f4699);
    }
}
