package kotlin.time;

import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C4210;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p052.InterfaceC6557;
import p305.C8631;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int[] f14722 = {1, 10, 100, DescriptorProtos$Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int[] f14721 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f14720 = {3, 6};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f14719 = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5158 m10193(String str, String str2, int i, InterfaceC6557 interfaceC6557) {
        char cCharAt = str.charAt(i);
        if (((Boolean) interfaceC6557.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m10200(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x029e, code lost:
    
        top.suzhelan.qstory.hook.item.C5919.m11249("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02a1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r5 == r26.length()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        if (r2 == '+') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0118, code lost:
    
        if (r2 == '-') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0120, code lost:
    
        if (r5 == (r23 + r2)) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m10194(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.AbstractC5159.m10194(java.lang.String):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10195(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m10196(long j) {
        long j2 = (j << 1) + 1;
        C5156.f14712.getClass();
        int i = AbstractC5155.f14709;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m10197(long j, DurationUnit durationUnit) {
        long j2;
        durationUnit.getClass();
        int i = AbstractC5153.f14707[durationUnit.ordinal()];
        if (i == 1) {
            j2 = 86400000;
        } else if (i == 2) {
            j2 = 3600000;
        } else if (i == 3) {
            j2 = 60000;
        } else if (i == 4) {
            j2 = 1000;
        } else {
            if (i != 5) {
                C4210.m8602(durationUnit, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m10198(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC6087.m11417(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m10199(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5158 m10200(String str, String str2) {
        StringBuilder sbM11553 = AbstractC6136.m11553(str2, " when parsing an Instant from \"");
        sbM11553.append(m10201(64, str));
        sbM11553.append('\"');
        return new C5158(sbM11553.toString(), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m10201(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m10202(int i, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (durationUnit.compareTo(DurationUnit.SECONDS) > 0) {
            return m10203(i, durationUnit);
        }
        long j = i;
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
        C8631 c8631 = C5156.f14712;
        long j2 = jConvert << 1;
        int i2 = AbstractC5155.f14709;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long m10203(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit.getTimeUnit().convert(4611686018426999999L, durationUnit2.getTimeUnit());
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
            C8631 c8631 = C5156.f14712;
            long j2 = jConvert2 << 1;
            int i = AbstractC5155.f14709;
            return j2;
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit3) < 0) {
            durationUnit3.getClass();
            return m10196(AbstractC6087.m11417(durationUnit3.getTimeUnit().convert(j, durationUnit.getTimeUnit())));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m10196(m10197(Math.abs(j), durationUnit) * jSignum);
    }
}
