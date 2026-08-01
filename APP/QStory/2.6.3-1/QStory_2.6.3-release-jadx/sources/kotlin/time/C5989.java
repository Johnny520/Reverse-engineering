package kotlin.time;

import androidx.window.area.AbstractC3400;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5989 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f15059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9452 f15057 = new C9452(21);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f15058 = AbstractC5992.m10759(4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long f15056 = AbstractC5992.m10759(-4611686018427387903L);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final long f15055 = 9223372036854759646L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m10746(long j) {
        return j == f15058 || j == f15056;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m10747(long j) {
        if (m10746(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m10748(long j) {
        return ((((int) j) & 1) != 1 || m10746(j)) ? m10755(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m10749(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC5227.m9463(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m10750(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            String strM10726 = AbstractC5976.m10726(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM10726.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM10726.charAt(length) != '0') {
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
                sb.append((CharSequence) strM10726, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM10726, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m10751(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM10761 = AbstractC5992.m10761(j, j3);
        if (-4611686018426L > jM10761 || jM10761 >= 4611686018427L) {
            return AbstractC5992.m10759(jM10761);
        }
        long j4 = ((jM10761 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC5988.f15054;
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long m10752(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC5988.f15054;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m10753(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m10751(j >> 1, j2 >> 1) : m10751(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC5992.m10759(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = AbstractC5988.f15054;
            return j4;
        }
        long jM10761 = AbstractC5992.m10761(j >> 1, j2 >> 1);
        if (jM10761 == 9223372036854759646L) {
            C6755.m11869("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM10761 == 4611686018427387903L || jM10761 == -4611686018427387903L) {
            return AbstractC5992.m10759(jM10761);
        }
        if (-4611686018426L > jM10761 || jM10761 >= 4611686018427L) {
            return AbstractC5992.m10759(AbstractC3400.m5649(jM10761));
        }
        long j5 = (jM10761 * 1000000) << 1;
        int i3 = AbstractC5988.f15054;
        return j5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m10754(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f15058) {
            return "Infinity";
        }
        if (j == f15056) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(SignatureVisitor.SUPER);
        }
        if (j < 0) {
            j = m10752(j);
        }
        long jM10755 = m10755(j, DurationUnit.DAYS);
        int iM10755 = m10746(j) ? 0 : (int) (m10755(j, DurationUnit.HOURS) % 24);
        int iM107552 = m10746(j) ? 0 : (int) (m10755(j, DurationUnit.MINUTES) % 60);
        int iM107553 = m10746(j) ? 0 : (int) (m10755(j, DurationUnit.SECONDS) % 60);
        int iM10747 = m10747(j);
        boolean z2 = jM10755 != 0;
        boolean z3 = iM10755 != 0;
        boolean z4 = iM107552 != 0;
        boolean z5 = (iM107553 == 0 && iM10747 == 0) ? false : true;
        if (z2) {
            sb.append(jM10755);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM10755);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM107552);
            sb.append(Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL);
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM107553 != 0 || z2 || z3 || z4) {
                m10750(sb, iM107553, iM10747, 9, "s", false);
            } else if (iM10747 >= 1000000) {
                m10750(sb, iM10747 / 1000000, iM10747 % 1000000, 6, "ms", false);
            } else if (iM10747 >= 1000) {
                m10750(sb, iM10747 / DescriptorProtos$Edition.EDITION_2023_VALUE, iM10747 % DescriptorProtos$Edition.EDITION_2023_VALUE, 3, "us", false);
            } else {
                sb.append(iM10747);
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
    public static final long m10755(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == f15058) {
            return Long.MAX_VALUE;
        }
        if (j == f15056) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        DurationUnit durationUnit2 = (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
        durationUnit2.getClass();
        return durationUnit.getTimeUnit().convert(j2, durationUnit2.getTimeUnit());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m10749(this.f15059, ((C5989) obj).f15059);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5989) {
            return this.f15059 == ((C5989) obj).f15059;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15059);
    }

    public final String toString() {
        return m10754(this.f15059);
    }
}
