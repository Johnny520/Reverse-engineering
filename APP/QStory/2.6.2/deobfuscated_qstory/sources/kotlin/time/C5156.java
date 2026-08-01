package kotlin.time;

import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p000.AbstractC6087;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5156 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f14714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8631 f14712 = new C8631(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f14713 = AbstractC5159.m10196(4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long f14711 = AbstractC5159.m10196(-4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long f14710 = 9223372036854759646L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m10183(long j) {
        return j == f14713 || j == f14711;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m10184(long j) {
        if (m10183(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m10185(long j) {
        return ((((int) j) & 1) != 1 || m10183(j)) ? m10192(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m10186(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC4394.m8914(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m10187(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            String strM10162 = AbstractC5143.m10162(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM10162.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM10162.charAt(length) != '0') {
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
                sb.append((CharSequence) strM10162, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM10162, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m10188(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM10198 = AbstractC5159.m10198(j, j3);
        if (-4611686018426L > jM10198 || jM10198 >= 4611686018427L) {
            return AbstractC5159.m10196(jM10198);
        }
        long j4 = ((jM10198 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC5155.f14709;
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m10189(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC5155.f14709;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m10190(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m10188(j >> 1, j2 >> 1) : m10188(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC5159.m10196(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = AbstractC5155.f14709;
            return j4;
        }
        long jM10198 = AbstractC5159.m10198(j >> 1, j2 >> 1);
        if (jM10198 == 9223372036854759646L) {
            C5919.m11249("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM10198 == 4611686018427387903L || jM10198 == -4611686018427387903L) {
            return AbstractC5159.m10196(jM10198);
        }
        if (-4611686018426L > jM10198 || jM10198 >= 4611686018427L) {
            return AbstractC5159.m10196(AbstractC6087.m11417(jM10198));
        }
        long j5 = (jM10198 * 1000000) << 1;
        int i3 = AbstractC5155.f14709;
        return j5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m10191(long j) {
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
            j = m10189(j);
        }
        long jM10192 = m10192(j, DurationUnit.DAYS);
        int iM10192 = m10183(j) ? 0 : (int) (m10192(j, DurationUnit.HOURS) % 24);
        int iM101922 = m10183(j) ? 0 : (int) (m10192(j, DurationUnit.MINUTES) % 60);
        int iM101923 = m10183(j) ? 0 : (int) (m10192(j, DurationUnit.SECONDS) % 60);
        int iM10184 = m10184(j);
        boolean z2 = jM10192 != 0;
        boolean z3 = iM10192 != 0;
        boolean z4 = iM101922 != 0;
        boolean z5 = (iM101923 == 0 && iM10184 == 0) ? false : true;
        if (z2) {
            sb.append(jM10192);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM10192);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM101922);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL);
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM101923 != 0 || z2 || z3 || z4) {
                m10187(sb, iM101923, iM10184, 9, "s", false);
            } else if (iM10184 >= 1000000) {
                m10187(sb, iM10184 / 1000000, iM10184 % 1000000, 6, "ms", false);
            } else if (iM10184 >= 1000) {
                m10187(sb, iM10184 / DescriptorProtos$Edition.EDITION_2023_VALUE, iM10184 % DescriptorProtos$Edition.EDITION_2023_VALUE, 3, "us", false);
            } else {
                sb.append(iM10184);
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
    public static final long m10192(long j, DurationUnit durationUnit) {
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
        return m10186(this.f14714, ((C5156) obj).f14714);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5156) {
            return this.f14714 == ((C5156) obj).f14714;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14714);
    }

    public final String toString() {
        return m10191(this.f14714);
    }
}
