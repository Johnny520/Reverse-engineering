package kotlin.time;

import androidx.window.area.AbstractC3400;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C5043;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5992 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int[] f15067 = {1, 10, 100, DescriptorProtos$Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int[] f15066 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f15065 = {3, 6};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f15064 = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5991 m10756(String str, String str2, int i, InterfaceC7387 interfaceC7387) {
        char cCharAt = str.charAt(i);
        if (((Boolean) interfaceC7387.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m10763(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x029e, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11869("");
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
    */
    public static long m10757(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int iMin;
        int i7;
        double d;
        long jM12616;
        char cCharAt;
        int i8;
        int i9;
        char cCharAt2;
        if (str.length() == 0) {
            C6755.m11869("The string is empty");
            return 0L;
        }
        char cCharAt3 = str.charAt(0);
        int i10 = 1;
        char c = SignatureVisitor.SUPER;
        char c2 = SignatureVisitor.EXTENDS;
        if (cCharAt3 != '+') {
            i2 = cCharAt3 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C6755.m11869("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C6755.m11869("");
            return 0L;
        }
        int i11 = i2 + 1;
        if (i11 == str.length()) {
            C6755.m11869("");
            return 0L;
        }
        int i12 = 0;
        DurationUnit durationUnit = null;
        long jM10760 = 0;
        long j2 = 0;
        while (i11 < str.length()) {
            char cCharAt4 = str.charAt(i11);
            if (cCharAt4 != 'T') {
                C5994 c5994 = C5994.f15068;
                int i13 = i10;
                char cCharAt5 = str.charAt(i11);
                if (cCharAt5 == c2) {
                    i3 = i11 + 1;
                } else {
                    if (cCharAt5 == c) {
                        i3 = i11 + 1;
                        i4 = -1;
                        while (i3 < str.length() && str.charAt(i3) == '0') {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 >= str.length()) {
                                char cCharAt6 = str.charAt(i3);
                                i5 = i11;
                                if ('0' <= cCharAt6 && cCharAt6 < ':') {
                                    i8 = cCharAt6 - '0';
                                    i9 = i;
                                    long j3 = c5994.f15070;
                                    if (j <= j3 && (j != j3 || i8 <= c5994.f15069)) {
                                        j = (j << 3) + (j << i13) + ((long) i8);
                                        i3++;
                                        i11 = i5;
                                        c5994 = c5994;
                                        i = i9;
                                    }
                                }
                            } else {
                                i5 = i11;
                            }
                        }
                        int i14 = i9;
                        while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
                            i3++;
                        }
                        if (i3 != str.length()) {
                            if (i3 != i5 + ((cCharAt4 == '+' || cCharAt4 == '-') ? i13 : 0)) {
                                j = 4611686018427387903L;
                                long j4 = j;
                                if (str.charAt(i3) == '.') {
                                    int i15 = i3 + 1;
                                    int iMin2 = Math.min(i3 + 7, str.length());
                                    int i16 = 0;
                                    for (int i17 = i15; i17 < iMin2; i17++) {
                                        char cCharAt7 = str.charAt(i17);
                                        if ('0' > cCharAt7 || cCharAt7 >= ':') {
                                            for (i6 = 0; i6 < 6 - (i17 - i15); i6++) {
                                                i16 = (i16 << 1) + (i16 << 3);
                                            }
                                            iMin = Math.min(i17 + 9, str.length());
                                            i3 = i17;
                                            int i18 = 0;
                                            while (i3 < iMin) {
                                                char cCharAt8 = str.charAt(i3);
                                                int i19 = iMin;
                                                if ('0' > cCharAt8 || cCharAt8 >= ':') {
                                                    for (i7 = 0; i7 < 9 - (i3 - i17); i7++) {
                                                        i18 = (i18 << 1) + (i18 << 3);
                                                    }
                                                    while (i3 < str.length() && '0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') {
                                                        i3++;
                                                    }
                                                    if (i3 == i15 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                        C6755.m11869("");
                                                        return 0L;
                                                    }
                                                    long j5 = (((long) i16) * 1000000000) + ((long) i18);
                                                    long j6 = i4;
                                                    DurationUnit durationUnit2 = DurationUnit.SECONDS;
                                                    double d2 = j5;
                                                    switch (AbstractC5987.f15053[durationUnit2.ordinal()]) {
                                                        case 1:
                                                            d = 1.0E-12d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 2:
                                                            d = 1.0E-15d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 3:
                                                            d = 1.0E-9d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 4:
                                                            d = 1.0E-6d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 5:
                                                            d = 6.0E-5d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 6:
                                                            d = 0.0036d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        case 7:
                                                            d = 0.0864d;
                                                            jM12616 = AbstractC7390.m12616(d2 * d);
                                                            break;
                                                        default:
                                                            C5043.m9151(durationUnit2, "Unknown unit: ");
                                                            jM12616 = 0;
                                                            break;
                                                    }
                                                    j2 = jM12616 * j6;
                                                } else {
                                                    i18 = (cCharAt8 - '0') + (i18 << 3) + (i18 << 1);
                                                    i3++;
                                                    iMin = i19;
                                                }
                                            }
                                            while (i7 < 9 - (i3 - i17)) {
                                            }
                                            while (i3 < str.length()) {
                                                i3++;
                                            }
                                            if (i3 == i15) {
                                            }
                                            C6755.m11869("");
                                            return 0L;
                                        }
                                        i16 = (cCharAt7 - '0') + (i16 << 3) + (i16 << 1);
                                    }
                                    while (i6 < 6 - (i17 - i15)) {
                                    }
                                    iMin = Math.min(i17 + 9, str.length());
                                    i3 = i17;
                                    int i182 = 0;
                                    while (i3 < iMin) {
                                    }
                                    while (i7 < 9 - (i3 - i17)) {
                                    }
                                    while (i3 < str.length()) {
                                    }
                                    if (i3 == i15) {
                                    }
                                    C6755.m11869("");
                                    return 0L;
                                }
                                char cCharAt9 = str.charAt(i3);
                                DurationUnit durationUnit3 = cCharAt9 != 'D' ? cCharAt9 != 'H' ? cCharAt9 != 'M' ? cCharAt9 != 'S' ? null : DurationUnit.SECONDS : DurationUnit.MINUTES : DurationUnit.HOURS : DurationUnit.DAYS;
                                if (durationUnit3 == null) {
                                    throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                }
                                if (durationUnit != null && durationUnit.compareTo(durationUnit3) <= 0) {
                                    C6755.m11869("Unexpected order of duration components");
                                    return 0L;
                                }
                                if (durationUnit3 == DurationUnit.DAYS) {
                                    if (i12 != 0) {
                                        C6755.m11869("");
                                        return 0L;
                                    }
                                    jM10760 = m10760(j4, durationUnit3) * ((long) i4);
                                } else {
                                    if (i12 == 0) {
                                        C6755.m11869("");
                                        return 0L;
                                    }
                                    long jM10761 = m10761(jM10760, m10760(j4, durationUnit3) * ((long) i4));
                                    if (jM10761 == 9223372036854759646L) {
                                        C6755.m11869("");
                                        return 0L;
                                    }
                                    jM10760 = jM10761;
                                }
                                i11 = i3 + 1;
                                durationUnit = durationUnit3;
                                i10 = i13;
                                i = i14;
                                c = SignatureVisitor.SUPER;
                                c2 = SignatureVisitor.EXTENDS;
                            }
                        }
                        C6755.m11869("");
                        return 0L;
                    }
                    i3 = i11;
                }
                i4 = i13;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 >= str.length()) {
                    }
                    j = (j << 3) + (j << i13) + ((long) i8);
                    i3++;
                    i11 = i5;
                    c5994 = c5994;
                    i = i9;
                }
                int i142 = i9;
                while (i3 < str.length()) {
                    i3++;
                }
                if (i3 != str.length()) {
                }
                C6755.m11869("");
                return 0L;
            }
            if (i12 != 0 || (i11 = i11 + 1) == str.length()) {
                C6755.m11869("");
                return 0L;
            }
            i12 = i10;
        }
        int i20 = i;
        long jM10753 = C5989.m10753(m10766(jM10760, DurationUnit.MILLISECONDS), m10766(j2, DurationUnit.NANOSECONDS));
        return (i20 == 0 || jM10753 == C5989.f15055) ? jM10753 : C5989.m10752(jM10753);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10758(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m10759(long j) {
        long j2 = (j << 1) + 1;
        C5989.f15057.getClass();
        int i = AbstractC5988.f15054;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m10760(long j, DurationUnit durationUnit) {
        long j2;
        durationUnit.getClass();
        int i = AbstractC5986.f15052[durationUnit.ordinal()];
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
                C5043.m9151(durationUnit, "Wrong unit for millisMultiplier: ");
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
    public static final long m10761(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC3400.m5649(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m10762(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5991 m10763(String str, String str2) {
        StringBuilder sbM12143 = AbstractC7012.m12143(str2, " when parsing an Instant from \"");
        sbM12143.append(m10764(64, str));
        sbM12143.append('\"');
        return new C5991(sbM12143.toString(), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m10764(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m10765(int i, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (durationUnit.compareTo(DurationUnit.SECONDS) > 0) {
            return m10766(i, durationUnit);
        }
        long j = i;
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
        C9452 c9452 = C5989.f15057;
        long j2 = jConvert << 1;
        int i2 = AbstractC5988.f15054;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long m10766(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit.getTimeUnit().convert(4611686018426999999L, durationUnit2.getTimeUnit());
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
            C9452 c9452 = C5989.f15057;
            long j2 = jConvert2 << 1;
            int i = AbstractC5988.f15054;
            return j2;
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit3) < 0) {
            durationUnit3.getClass();
            return m10759(AbstractC3400.m5649(durationUnit3.getTimeUnit().convert(j, durationUnit.getTimeUnit())));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m10759(m10760(Math.abs(j), durationUnit) * jSignum);
    }
}
