package bsh.classpath;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.schema.C3644;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.google.protobuf.DescriptorProtos$Edition;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.bytebuddy.dynamic.ClassFileLocator;
import org.apache.commons.p014io.comparator.CompositeFileComparator;
import org.apache.commons.p014io.file.StandardDeleteOption;
import p273.C9041;
import p305.AbstractC9244;
import p307.AbstractC9323;
import p377.InterfaceC9750;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3436 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8140;

    public /* synthetic */ C3436(int i) {
        this.f8140 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a5, code lost:
    
        r2 = 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02e3, code lost:
    
        r2 = 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x038f, code lost:
    
        if (com.alibaba.fastjson2.util.AbstractC3700.m6459(r0) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x03da, code lost:
    
        if (p305.AbstractC9244.m14552(r0) == false) goto L289;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0306 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d6  */
    @Override // java.util.function.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean test(Object obj) {
        boolean z;
        boolean z2;
        boolean zM14552;
        char cCharAt;
        int i;
        int i2;
        switch (this.f8140) {
            case 0:
                return ((String) obj).toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION);
            case 1:
                return Objects.nonNull((AbstractC9323) obj);
            case 2:
                return CompositeFileComparator.lambda$compare$2((Integer) obj);
            case 3:
                throw AbstractC0900.m719(obj);
            case 4:
                return Objects.nonNull((ConcurrentMap) obj);
            case 5:
                return Objects.isNull((C9041) obj);
            case 6:
                String str = (String) obj;
                if (str != null && !str.endsWith(".")) {
                    Matcher matcher = C3644.f9091.matcher(str);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if (strGroup.length() <= 64 && C3644.f9089.matcher(strGroup).matches()) {
                            String strGroup2 = matcher.group(2);
                            Matcher matcher2 = C3644.f9090.matcher(strGroup2);
                            if (!matcher2.matches()) {
                                z = true;
                                if (strGroup2 != null) {
                                    String strM14551 = AbstractC9244.m14551(strGroup2);
                                    if (strM14551.length() <= 253) {
                                        Matcher matcher3 = AbstractC9244.f23661.matcher(strM14551);
                                        if (matcher3.matches()) {
                                            int iGroupCount = matcher3.groupCount();
                                            String[] strArr = new String[iGroupCount];
                                            int i3 = 0;
                                            while (i3 < iGroupCount) {
                                                int i4 = i3 + 1;
                                                strArr[i3] = matcher3.group(i4);
                                                i3 = i4;
                                            }
                                            z2 = false;
                                            zM14552 = AbstractC9244.m14552(strArr[0]);
                                        } else {
                                            z2 = false;
                                            zM14552 = false;
                                        }
                                    }
                                    if (!zM14552) {
                                    }
                                } else {
                                    Pattern pattern = AbstractC9244.f23661;
                                }
                                zM14552 = false;
                                z2 = false;
                                if (!zM14552) {
                                }
                                break;
                            } else {
                                z = true;
                                String strGroup3 = matcher2.group(1);
                                if (!AbstractC3700.m6458(0, strGroup3)) {
                                }
                                break;
                            }
                            return z;
                        }
                    } else {
                        z2 = false;
                    }
                }
                return z2;
            case 7:
                return AbstractC3700.m6458(0, (String) obj);
            case 8:
                return AbstractC3700.m6459((String) obj);
            case 9:
                String str2 = (String) obj;
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        new URI(str2);
                        return true;
                    } catch (URISyntaxException unused) {
                    }
                }
                return false;
            case 10:
                String str3 = (String) obj;
                ZoneId zoneId = AbstractC3699.f9372;
                if (str3 != null && !str3.isEmpty()) {
                    if (str3.length() == 19 && str3.charAt(4) == '-' && str3.charAt(7) == '-' && (((cCharAt = str3.charAt(10)) == ' ' || cCharAt == 'T') && str3.charAt(13) == ':' && str3.charAt(16) == ':')) {
                        char cCharAt2 = str3.charAt(0);
                        char cCharAt3 = str3.charAt(1);
                        char cCharAt4 = str3.charAt(2);
                        char cCharAt5 = str3.charAt(3);
                        char cCharAt6 = str3.charAt(5);
                        char cCharAt7 = str3.charAt(6);
                        char cCharAt8 = str3.charAt(8);
                        char cCharAt9 = str3.charAt(9);
                        char cCharAt10 = str3.charAt(11);
                        char cCharAt11 = str3.charAt(12);
                        char cCharAt12 = str3.charAt(14);
                        char cCharAt13 = str3.charAt(15);
                        char cCharAt14 = str3.charAt(17);
                        char cCharAt15 = str3.charAt(18);
                        if (cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt3 >= '0' && cCharAt3 <= '9' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9' && cCharAt6 >= '0' && cCharAt6 <= '9' && cCharAt7 >= '0' && cCharAt7 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9' && cCharAt9 >= '0' && cCharAt9 <= '9' && cCharAt10 >= '0' && cCharAt10 <= '9' && cCharAt11 >= '0' && cCharAt11 <= '9' && cCharAt12 >= '0' && cCharAt12 <= '9' && cCharAt13 >= '0' && cCharAt13 <= '9' && cCharAt14 >= '0' && cCharAt14 <= '9' && cCharAt15 >= '0' && cCharAt15 <= '9') {
                            int iM703 = (cCharAt5 - '0') + AbstractC0900.m703(cCharAt4, 48, 10, AbstractC0900.m703(cCharAt3, 48, 100, (cCharAt2 - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                            int i5 = (cCharAt7 - '0') + ((cCharAt6 - '0') * 10);
                            int i6 = (cCharAt9 - '0') + ((cCharAt8 - '0') * 10);
                            int i7 = (cCharAt11 - '0') + ((cCharAt10 - '0') * 10);
                            int i8 = (cCharAt13 - '0') + ((cCharAt12 - '0') * 10);
                            int i9 = (cCharAt15 - '0') + ((cCharAt14 - '0') * 10);
                            if (i5 <= 12) {
                                if (i6 > 28) {
                                    if (i5 != 2) {
                                        i = (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31;
                                    } else {
                                        int i10 = (iM703 & 15) == 0 ? 28 : 28;
                                        i = i10;
                                    }
                                    if (i6 <= i) {
                                    }
                                }
                                if (i7 <= 24 && i8 <= 60 && i9 <= 61) {
                                }
                            }
                        }
                    } else {
                        try {
                            if (AbstractC3699.m6455(str3, AbstractC3699.f9372) != 0) {
                                return true;
                            }
                        } catch (JSONException | DateTimeException unused2) {
                        }
                    }
                }
                return false;
            case 11:
                String str4 = (String) obj;
                ZoneId zoneId2 = AbstractC3699.f9372;
                if (str4 != null && !str4.isEmpty()) {
                    if (str4.length() == 10 && str4.charAt(4) == '-' && str4.charAt(7) == '-') {
                        char cCharAt16 = str4.charAt(0);
                        char cCharAt17 = str4.charAt(1);
                        char cCharAt18 = str4.charAt(2);
                        char cCharAt19 = str4.charAt(3);
                        char cCharAt20 = str4.charAt(5);
                        char cCharAt21 = str4.charAt(6);
                        char cCharAt22 = str4.charAt(8);
                        char cCharAt23 = str4.charAt(9);
                        int iM7032 = (cCharAt19 - '0') + AbstractC0900.m703(cCharAt18, 48, 10, AbstractC0900.m703(cCharAt17, 48, 100, (cCharAt16 - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                        int i11 = (cCharAt21 - '0') + ((cCharAt20 - '0') * 10);
                        int i12 = (cCharAt23 - '0') + ((cCharAt22 - '0') * 10);
                        if (i11 <= 12) {
                            if (i12 <= 28) {
                                return true;
                            }
                            if (i11 != 2) {
                                i2 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
                            } else {
                                int i13 = (iM7032 & 15) == 0 ? 28 : 28;
                                i2 = i13;
                            }
                            if (i12 <= i2) {
                                return true;
                            }
                        }
                    } else if (str4.length() >= 9 && str4.length() <= 40) {
                        try {
                            if (AbstractC3699.m6433(str4) != null) {
                                return true;
                            }
                        } catch (JSONException | DateTimeException unused3) {
                        }
                    }
                }
                return false;
            case 12:
                String str5 = (String) obj;
                ZoneId zoneId3 = AbstractC3699.f9372;
                if (str5 != null && !str5.isEmpty()) {
                    if (str5.length() == 8 && str5.charAt(2) == ':' && str5.charAt(5) == ':') {
                        char cCharAt24 = str5.charAt(0);
                        char cCharAt25 = str5.charAt(1);
                        char cCharAt26 = str5.charAt(3);
                        char cCharAt27 = str5.charAt(4);
                        char cCharAt28 = str5.charAt(6);
                        char cCharAt29 = str5.charAt(7);
                        if (cCharAt24 >= '0' && cCharAt24 <= '2' && cCharAt25 >= '0' && cCharAt25 <= '9' && cCharAt26 >= '0' && cCharAt26 <= '6' && cCharAt27 >= '0' && cCharAt27 <= '9' && cCharAt28 >= '0' && cCharAt28 <= '6' && cCharAt29 >= '0' && cCharAt29 <= '9') {
                            if ((cCharAt25 - '0') + ((cCharAt24 - '0') * 10) <= 24) {
                                if ((cCharAt27 - '0') + ((cCharAt26 - '0') * 10) <= 60) {
                                    if ((cCharAt29 - '0') + ((cCharAt28 - '0') * 10) <= 61) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        try {
                            LocalTime.parse(str5);
                            return true;
                        } catch (DateTimeParseException unused4) {
                        }
                    }
                }
                return false;
            case 13:
                String str6 = (String) obj;
                if (str6 != null && !str6.isEmpty()) {
                    try {
                        Duration.parse(str6);
                        return true;
                    } catch (DateTimeParseException unused5) {
                    }
                }
                return false;
            case 14:
                String str7 = (String) obj;
                Class cls = AbstractC3700.f9396;
                if (str7 != null) {
                    if (str7.length() == 32) {
                        for (int i14 = 0; i14 < 32; i14++) {
                            char cCharAt30 = str7.charAt(i14);
                            if ((cCharAt30 >= '0' && cCharAt30 <= '9') || ((cCharAt30 >= 'A' && cCharAt30 <= 'F') || (cCharAt30 >= 'a' && cCharAt30 <= 'f'))) {
                            }
                        }
                        return true;
                    }
                    if (str7.length() == 36) {
                        int i15 = 0;
                        for (int i16 = 36; i15 < i16; i16 = 36) {
                            char cCharAt31 = str7.charAt(i15);
                            if (i15 == 8 || i15 == 13 || i15 == 18 || i15 == 23) {
                                if (cCharAt31 == '-') {
                                    i15++;
                                }
                            } else if ((cCharAt31 >= '0' && cCharAt31 <= '9') || ((cCharAt31 >= 'A' && cCharAt31 <= 'F') || (cCharAt31 >= 'a' && cCharAt31 <= 'f'))) {
                                i15++;
                            }
                        }
                        return true;
                    }
                }
                return false;
            default:
                return StandardDeleteOption.lambda$overrideReadOnly$0((InterfaceC9750) obj);
        }
    }
}
