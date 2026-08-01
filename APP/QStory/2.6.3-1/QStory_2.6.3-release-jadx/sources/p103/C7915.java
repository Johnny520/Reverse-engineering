package p103;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5039;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.time.AbstractC5992;
import kotlin.time.C5985;
import kotlin.time.C5991;
import kotlin.time.C5995;
import kotlin.time.Instant;
import kotlin.time.InterfaceC5996;
import p025.AbstractC7012;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7915 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7915 f19347 = new C7915();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f19346 = new C7954("kotlin.time.Instant", C8021.f19529);

    /* JADX WARN: Removed duplicated region for block: B:194:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0486  */
    @Override // p105.InterfaceC8013
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        int i;
        InterfaceC5996 interfaceC5996M10756;
        int i2;
        int iM12133;
        int i3;
        char cCharAt;
        char cCharAt2;
        C5985 c5985 = Instant.Companion;
        String strMo11221 = interfaceC8016.mo11221();
        c5985.getClass();
        strMo11221.getClass();
        if (strMo11221.length() == 0) {
            interfaceC5996M10756 = new C5991("An empty string is not a valid Instant", strMo11221);
        } else {
            char cCharAt3 = strMo11221.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i4 = i;
            while (i4 < strMo11221.length() && '0' <= (cCharAt2 = strMo11221.charAt(i4)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo11221.charAt(i4) - '0');
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 10) {
                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected at most 10 digits for the year number, got " + i5 + " digits");
            } else if (i5 == 10 && AbstractC5227.m9464(strMo11221.charAt(i), 50) >= 0) {
                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected at most 9 digits for the year number or year 1000000000, got " + i5 + " digits");
            } else if (i5 < 4) {
                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "The year number must be padded to 4 digits, got " + i5 + " digits");
            } else if (cCharAt3 == '+' && i5 == 4) {
                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i5 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i6 = i4 + 16;
                if (strMo11221.length() >= i6) {
                    C5991 c5991M10756 = AbstractC5992.m10756(strMo11221, "'-'", i4, new C5039(7));
                    if (c5991M10756 != null) {
                        interfaceC5996M10756 = c5991M10756;
                        break;
                    }
                    interfaceC5996M10756 = AbstractC5992.m10756(strMo11221, "'-'", i4 + 3, new C5039(8));
                    if (interfaceC5996M10756 == null && (interfaceC5996M10756 = AbstractC5992.m10756(strMo11221, "'T' or 't'", i4 + 6, new C5039(9))) == null && (interfaceC5996M10756 = AbstractC5992.m10756(strMo11221, "':'", i4 + 9, new C5039(10))) == null && (interfaceC5996M10756 = AbstractC5992.m10756(strMo11221, "':'", i4 + 12, new C5039(11))) == null) {
                        for (int i7 = 0; i7 < 10; i7++) {
                            c5991M10756 = AbstractC5992.m10756(strMo11221, "an ASCII digit", AbstractC5992.f15066[i7] + i4, new C5039(12));
                            if (c5991M10756 != null) {
                                interfaceC5996M10756 = c5991M10756;
                                break;
                            }
                        }
                        int iM10762 = AbstractC5992.m10762(i4 + 1, strMo11221);
                        int iM107622 = AbstractC5992.m10762(i4 + 4, strMo11221);
                        int iM107623 = AbstractC5992.m10762(i4 + 7, strMo11221);
                        int iM107624 = AbstractC5992.m10762(i4 + 10, strMo11221);
                        int iM107625 = AbstractC5992.m10762(i4 + 13, strMo11221);
                        int i8 = i4 + 15;
                        if (strMo11221.charAt(i8) == '.') {
                            i8 = i6;
                            int iCharAt2 = 0;
                            while (i8 < strMo11221.length() && '0' <= (cCharAt = strMo11221.charAt(i8)) && cCharAt < ':') {
                                iCharAt2 = (iCharAt2 * 10) + (strMo11221.charAt(i8) - '0');
                                i8++;
                            }
                            int i9 = i8 - i6;
                            if (1 > i9 || i9 >= 10) {
                                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "1..9 digits are supported for the fraction of the second, got " + i9 + " digits");
                            } else {
                                i2 = iCharAt2 * AbstractC5992.f15067[9 - i9];
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i8 >= strMo11221.length()) {
                            interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "The UTC offset at the end of the string is missing");
                        } else {
                            char cCharAt4 = strMo11221.charAt(i8);
                            if (cCharAt4 == '+' || cCharAt4 == '-') {
                                int length = strMo11221.length() - i8;
                                if (length > 9) {
                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "The UTC offset string \"" + AbstractC5992.m10764(16, strMo11221.subSequence(i8, strMo11221.length()).toString()) + "\" is too long");
                                } else if (length % 3 != 0) {
                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Invalid UTC offset string \"" + strMo11221.subSequence(i8, strMo11221.length()).toString() + '\"');
                                } else {
                                    int i10 = 0;
                                    for (int i11 = 2; i10 < i11; i11 = 2) {
                                        int i12 = i8 + AbstractC5992.f15065[i10];
                                        if (i12 >= strMo11221.length()) {
                                            break;
                                        }
                                        if (strMo11221.charAt(i12) != ':') {
                                            StringBuilder sbM710 = AbstractC0900.m710(i12, "Expected ':' at index ", ", got '");
                                            sbM710.append(strMo11221.charAt(i12));
                                            sbM710.append('\'');
                                            interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, sbM710.toString());
                                            break;
                                        }
                                        i10++;
                                    }
                                    int i13 = 0;
                                    while (i13 < 6 && (i3 = AbstractC5992.f15064[i13] + i8) < strMo11221.length()) {
                                        char cCharAt5 = strMo11221.charAt(i3);
                                        int i14 = i13;
                                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                            StringBuilder sbM7102 = AbstractC0900.m710(i3, "Expected an ASCII digit at index ", ", got '");
                                            sbM7102.append(strMo11221.charAt(i3));
                                            sbM7102.append('\'');
                                            interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, sbM7102.toString());
                                            break;
                                        }
                                        i13 = i14 + 1;
                                    }
                                    int iM107626 = AbstractC5992.m10762(i8 + 1, strMo11221);
                                    int iM107627 = length > 3 ? AbstractC5992.m10762(i8 + 4, strMo11221) : 0;
                                    int iM107628 = length > 6 ? AbstractC5992.m10762(i8 + 7, strMo11221) : 0;
                                    if (iM107627 > 59) {
                                        interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected offset-minute-of-hour in 0..59, got " + iM107627);
                                    } else if (iM107628 > 59) {
                                        interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected offset-second-of-minute in 0..59, got " + iM107628);
                                    } else if (iM107626 <= 17 || (iM107626 == 18 && iM107627 == 0 && iM107628 == 0)) {
                                        iM12133 = AbstractC7012.m12133(iM107627, 60, iM107626 * 3600, iM107628) * (cCharAt4 == '-' ? -1 : 1);
                                        if (1 <= iM10762 || iM10762 >= 13) {
                                            interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected a month number in 1..12, got " + iM10762);
                                        } else if (1 > iM107622) {
                                            StringBuilder sbM709 = AbstractC0900.m709(iM10762, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                            sbM709.append(iM107622);
                                            interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, sbM709.toString());
                                        } else {
                                            int i15 = iCharAt & 3;
                                            if (iM107622 <= (iM10762 != 2 ? (iM10762 == 4 || iM10762 == 6 || iM10762 == 9 || iM10762 == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                if (iM107623 > 23) {
                                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected hour in 0..23, got " + iM107623);
                                                } else if (iM107624 > 59) {
                                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected minute-of-hour in 0..59, got " + iM107624);
                                                } else if (iM107625 > 59) {
                                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected second-of-minute in 0..59, got " + iM107625);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iM10762 * 367) - 362) / 12)) + ((long) (iM107622 - 1));
                                                    if (iM10762 > 2) {
                                                        j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    interfaceC5996M10756 = new C5995((((j3 - 719528) * 86400) + ((long) AbstractC7012.m12133(iM107624, 60, iM107623 * 3600, iM107625))) - ((long) iM12133), i2);
                                                }
                                            }
                                        }
                                    } else {
                                        interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected an offset in -18:00..+18:00, got " + strMo11221.subSequence(i8, strMo11221.length()).toString());
                                    }
                                }
                            } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                int i16 = i8 + 1;
                                if (strMo11221.length() == i16) {
                                    iM12133 = 0;
                                    if (1 <= iM10762) {
                                        interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected a month number in 1..12, got " + iM10762);
                                    }
                                } else {
                                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Extra text after the instant at position " + i16);
                                }
                            } else {
                                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "Expected the UTC offset at position " + i8 + ", got '" + cCharAt4 + '\'');
                            }
                        }
                    }
                } else {
                    interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "The input string is too short");
                }
            } else {
                interfaceC5996M10756 = AbstractC5992.m10763(strMo11221, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return interfaceC5996M10756.toInstant();
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19346;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        Instant instant = (Instant) obj;
        instant.getClass();
        interfaceC8015.mo11208(instant.toString());
    }
}
