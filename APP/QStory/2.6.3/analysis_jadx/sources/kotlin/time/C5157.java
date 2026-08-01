package kotlin.time;

import androidx.window.area.AbstractC2567;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5157 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f14714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8623 f14712 = new C8623(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f14713 = AbstractC5160.m10200(4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long f14711 = AbstractC5160.m10200(-4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long f14710 = 9223372036854759646L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m10187(long j) {
        return j == f14713 || j == f14711;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m10188(long j) {
        if (m10187(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m10189(long j) {
        return ((((int) j) & 1) != 1 || m10187(j)) ? m10196(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m10190(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC4395.m8904(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m10191(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            String strM10167 = AbstractC5144.m10167(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM10167.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM10167.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM10167, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM10167, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m10192(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM10202 = AbstractC5160.m10202(j, j3);
        if (-4611686018426L > jM10202 || jM10202 >= 4611686018427L) {
            return AbstractC5160.m10200(jM10202);
        }
        long j4 = ((jM10202 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC5156.f14709;
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m10193(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC5156.f14709;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m10194(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m10192(j >> 1, j2 >> 1) : m10192(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC5160.m10200(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = AbstractC5156.f14709;
            return j4;
        }
        long jM10202 = AbstractC5160.m10202(j >> 1, j2 >> 1);
        if (jM10202 == 9223372036854759646L) {
            C5925.m11310("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM10202 == 4611686018427387903L || jM10202 == -4611686018427387903L) {
            return AbstractC5160.m10200(jM10202);
        }
        if (-4611686018426L > jM10202 || jM10202 >= 4611686018427L) {
            return AbstractC5160.m10200(AbstractC2567.m5089(jM10202));
        }
        long j5 = (jM10202 * 1000000) << 1;
        int i3 = AbstractC5156.f14709;
        return j5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m10195(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f14713) {
            return "Infinity";
        }
        if (j == f14711) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(SignatureVisitor.SUPER);
        }
        if (j < 0) {
            j = m10193(j);
        }
        long jM10196 = m10196(j, DurationUnit.DAYS);
        int iM10196 = m10187(j) ? 0 : (int) (m10196(j, DurationUnit.HOURS) % 24);
        int iM101962 = m10187(j) ? 0 : (int) (m10196(j, DurationUnit.MINUTES) % 60);
        int iM101963 = m10187(j) ? 0 : (int) (m10196(j, DurationUnit.SECONDS) % 60);
        int iM10188 = m10188(j);
        boolean z2 = jM10196 != 0;
        boolean z3 = iM10196 != 0;
        boolean z4 = iM101962 != 0;
        boolean z5 = (iM101963 == 0 && iM10188 == 0) ? false : true;
        if (z2) {
            sb.append(jM10196);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM10196);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM101962);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL);
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM101963 != 0 || z2 || z3 || z4) {
                m10191(sb, iM101963, iM10188, 9, "s", false);
            } else if (iM10188 >= 1000000) {
                m10191(sb, iM10188 / 1000000, iM10188 % 1000000, 6, "ms", false);
            } else if (iM10188 >= 1000) {
                m10191(sb, iM10188 / DescriptorProtos$Edition.EDITION_2023_VALUE, iM10188 % DescriptorProtos$Edition.EDITION_2023_VALUE, 3, "us", false);
            } else {
                sb.append(iM10188);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m10196(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == f14713) {
            return Long.MAX_VALUE;
        }
        if (j == f14711) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        DurationUnit durationUnit2 = (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
        durationUnit2.getClass();
        return durationUnit.getTimeUnit().convert(j2, durationUnit2.getTimeUnit());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m10190(this.f14714, ((C5157) obj).f14714);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5157) {
            return this.f14714 == ((C5157) obj).f14714;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14714);
    }

    public final String toString() {
        return m10195(this.f14714);
    }
}
