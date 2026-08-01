package androidx.compose.ui.graphics;

import androidx.activity.AbstractC0053;
import androidx.collection.C0246;
import androidx.compose.ui.graphics.colorspace.AbstractC1490;
import androidx.compose.ui.graphics.colorspace.AbstractC1498;
import androidx.compose.ui.graphics.colorspace.AbstractC1501;
import androidx.compose.ui.graphics.colorspace.C1486;
import androidx.compose.ui.graphics.colorspace.C1489;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5187;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1599 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f4692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f4693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f4694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f4695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f4696 = AbstractC1581.m2880(4278190080L);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long f4697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f4698;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ int f4699 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4700;

    static {
        AbstractC1581.m2880(4282664004L);
        f4695 = AbstractC1581.m2880(4287137928L);
        AbstractC1581.m2880(4291611852L);
        f4694 = AbstractC1581.m2880(4294967295L);
        f4693 = AbstractC1581.m2880(4294901760L);
        AbstractC1581.m2880(4278255360L);
        f4692 = AbstractC1581.m2880(4278190335L);
        AbstractC1581.m2880(4294967040L);
        AbstractC1581.m2880(4278255615L);
        AbstractC1581.m2880(4294902015L);
        f4698 = AbstractC1581.m2882(0);
        f4697 = AbstractC1581.m2883(0.0f, 0.0f, 0.0f, 0.0f, C1489.f4221);
    }

    public /* synthetic */ C1599(long j) {
        this.f4700 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC1490 m2946(long j) {
        float[] fArr = C1489.f4216;
        return C1489.f4210[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float m2947(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5187.m10212((j >>> 32) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4671;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float m2948(long j) {
        float fM10212;
        float f;
        if ((63 & j) == 0) {
            fM10212 = (float) AbstractC5187.m10212((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM10212 = (float) AbstractC5187.m10212((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM10212 / f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2949(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m2950(float f, long j) {
        return AbstractC1581.m2883(m2952(j), m2953(j), m2947(j), f, m2946(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m2951(long j, AbstractC1490 abstractC1490) {
        C1486 c1486M2669;
        AbstractC1490 abstractC1490M2946 = m2946(j);
        int i = abstractC1490M2946.f4235;
        int i2 = abstractC1490.f4235;
        if ((i | i2) < 0) {
            c1486M2669 = AbstractC1501.m2669(abstractC1490M2946, abstractC1490);
        } else {
            C0246 c0246 = AbstractC1498.f4268;
            int i3 = i | (i2 << 6);
            Object objM833 = c0246.m833(i3);
            if (objM833 == null) {
                objM833 = AbstractC1501.m2669(abstractC1490M2946, abstractC1490);
                c0246.m790(i3, objM833);
            }
            c1486M2669 = (C1486) objM833;
        }
        return c1486M2669.mo2656(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m2952(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5187.m10212((j >>> 48) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4671;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final float m2953(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC5187.m10212((j >>> 40) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC1584.f4671;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m2954(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m2952(j));
        sb.append(", ");
        sb.append(m2953(j));
        sb.append(", ");
        sb.append(m2947(j));
        sb.append(", ");
        sb.append(m2948(j));
        sb.append(", ");
        return AbstractC0053.m148(sb, m2946(j).f4237, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1599) {
            return this.f4700 == ((C1599) obj).f4700;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4700);
    }

    public final String toString() {
        return m2954(this.f4700);
    }
}
