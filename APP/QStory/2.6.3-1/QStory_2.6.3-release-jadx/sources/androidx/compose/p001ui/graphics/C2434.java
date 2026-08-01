package androidx.compose.p001ui.graphics;

import androidx.activity.AbstractC0900;
import androidx.collection.C1093;
import androidx.compose.p001ui.graphics.colorspace.AbstractC2325;
import androidx.compose.p001ui.graphics.colorspace.AbstractC2333;
import androidx.compose.p001ui.graphics.colorspace.AbstractC2336;
import androidx.compose.p001ui.graphics.colorspace.C2321;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6019;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2434 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f5037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f5038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f5039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f5040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f5041 = AbstractC2416.m3440(4278190080L);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long f5042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f5043;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ int f5044 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5045;

    static {
        AbstractC2416.m3440(4282664004L);
        f5040 = AbstractC2416.m3440(4287137928L);
        AbstractC2416.m3440(4291611852L);
        f5039 = AbstractC2416.m3440(4294967295L);
        f5038 = AbstractC2416.m3440(4294901760L);
        AbstractC2416.m3440(4278255360L);
        f5037 = AbstractC2416.m3440(4278190335L);
        AbstractC2416.m3440(4294967040L);
        AbstractC2416.m3440(4278255615L);
        AbstractC2416.m3440(4294902015L);
        f5043 = AbstractC2416.m3442(0);
        f5042 = AbstractC2416.m3443(0.0f, 0.0f, 0.0f, 0.0f, C2324.f4566);
    }

    public /* synthetic */ C2434(long j) {
        this.f5045 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC2325 m3506(long j) {
        float[] fArr = C2324.f4561;
        return C2324.f4555[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float m3507(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC6019.m10771((j >>> 32) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2419.f5016;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float m3508(long j) {
        float fM10771;
        float f;
        if ((63 & j) == 0) {
            fM10771 = (float) AbstractC6019.m10771((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM10771 = (float) AbstractC6019.m10771((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM10771 / f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m3509(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m3510(float f, long j) {
        return AbstractC2416.m3443(m3512(j), m3513(j), m3507(j), f, m3506(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m3511(long j, AbstractC2325 abstractC2325) {
        C2321 c2321M3229;
        AbstractC2325 abstractC2325M3506 = m3506(j);
        int i = abstractC2325M3506.f4580;
        int i2 = abstractC2325.f4580;
        if ((i | i2) < 0) {
            c2321M3229 = AbstractC2336.m3229(abstractC2325M3506, abstractC2325);
        } else {
            C1093 c1093 = AbstractC2333.f4613;
            int i3 = i | (i2 << 6);
            Object objM1393 = c1093.m1393(i3);
            if (objM1393 == null) {
                objM1393 = AbstractC2336.m3229(abstractC2325M3506, abstractC2325);
                c1093.m1350(i3, objM1393);
            }
            c2321M3229 = (C2321) objM1393;
        }
        return c2321M3229.mo3216(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m3512(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC6019.m10771((j >>> 48) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2419.f5016;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final float m3513(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC6019.m10771((j >>> 40) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC2419.f5016;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m3514(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m3512(j));
        sb.append(", ");
        sb.append(m3513(j));
        sb.append(", ");
        sb.append(m3507(j));
        sb.append(", ");
        sb.append(m3508(j));
        sb.append(", ");
        return AbstractC0900.m708(sb, m3506(j).f4582, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2434) {
            return this.f5045 == ((C2434) obj).f5045;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5045);
    }

    public final String toString() {
        return m3514(this.f5045);
    }
}
