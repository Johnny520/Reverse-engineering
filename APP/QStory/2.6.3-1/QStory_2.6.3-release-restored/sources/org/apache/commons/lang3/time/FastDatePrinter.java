package org.apache.commons.lang3.time;

import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.apache.commons.lang3.AbstractC6523;
import org.apache.commons.lang3.AbstractC6531;
import org.apache.commons.lang3.AbstractC6533;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FastDatePrinter implements Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    private static final int MAX_DIGITS = 10;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 1;
    private final Locale locale;
    private transient int maxLengthEstimate;
    private final String pattern;
    private transient InterfaceC6483[] rules;
    private final TimeZone timeZone;
    private static final InterfaceC6483[] EMPTY_RULE_ARRAY = new InterfaceC6483[0];
    private static final ConcurrentMap<C6480, String> timeZoneDisplayCache = new ConcurrentHashMap(7);

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.pattern = str;
        this.timeZone = timeZone;
        int i = AbstractC6523.f15971;
        this.locale = locale == null ? Locale.getDefault() : locale;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendDigits(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendFullDigits(Appendable appendable, int i, int i2) throws IOException {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                appendable.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        appendable.append((char) ((i / DescriptorProtos$Edition.EDITION_2023_VALUE) + 48));
                        i %= DescriptorProtos$Edition.EDITION_2023_VALUE;
                    }
                    if (i >= 100) {
                        appendable.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i >= 10) {
                    appendable.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            appendable.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                appendable.append(cArr[i5]);
            }
        }
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b) {
        for (InterfaceC6483 interfaceC6483 : this.rules) {
            interfaceC6483.mo11601(calendar, b);
        }
        return b;
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.maxLengthEstimate))).toString();
    }

    public static void clear() {
        timeZoneDisplayCache.clear();
    }

    public static String getTimeZoneDisplay(final TimeZone timeZone, final boolean z, final int i, final Locale locale) {
        return timeZoneDisplayCache.computeIfAbsent(new C6480(timeZone, z, i, locale), new Function() { // from class: org.apache.commons.lang3.time.飘花落叶言子楪兰世哲苏
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FastDatePrinter.lambda$getTimeZoneDisplay$0(timeZone, z, i, locale, (C6480) obj);
            }
        });
    }

    private void init() {
        InterfaceC6483[] interfaceC6483Arr = (InterfaceC6483[]) parsePattern().toArray(EMPTY_RULE_ARRAY);
        this.rules = interfaceC6483Arr;
        int length = interfaceC6483Arr.length;
        int iMo11602 = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.maxLengthEstimate = iMo11602;
                return;
            }
            iMo11602 += this.rules[length].mo11602();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getTimeZoneDisplay$0(TimeZone timeZone, boolean z, int i, Locale locale, C6480 c6480) {
        return timeZone.getDisplayName(z, i, locale);
    }

    private Calendar newCalendar() {
        return Calendar.getInstance(this.timeZone, this.locale);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.pattern.equals(fastDatePrinter.pattern) && this.timeZone.equals(fastDatePrinter.timeZone) && this.locale.equals(fastDatePrinter.locale);
    }

    public String format(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        HashMap map = AbstractC6531.f15984;
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    public Locale getLocale() {
        return this.locale;
    }

    public int getMaxLengthEstimate() {
        return this.maxLengthEstimate;
    }

    public String getPattern() {
        return this.pattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((this.locale.hashCode() * 13) + this.timeZone.hashCode()) * 13) + this.pattern.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<InterfaceC6483> parsePattern() {
        int i;
        int i2;
        InterfaceC6483 c6482;
        InterfaceC6483 c6502;
        InterfaceC6483 interfaceC6483SelectNumberRule;
        InterfaceC6483 c65022;
        InterfaceC6483 c6481;
        InterfaceC6483 c65023;
        String[] strArr;
        String[] strArr2;
        InterfaceC6483 interfaceC6483 = C6489.f15906;
        InterfaceC6483 interfaceC64832 = C6489.f15908;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.locale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.pattern.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int[] iArr = {i4};
            String token = parseToken(this.pattern, iArr);
            int i5 = iArr[i3];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i3);
            InterfaceC6483 interfaceC64833 = interfaceC6483;
            if (cCharAt != '\'') {
                if (cCharAt != 'S') {
                    if (cCharAt == 'a') {
                        c6481 = new C6481(amPmStrings, 9);
                    } else if (cCharAt != 'd') {
                        if (cCharAt == 'h') {
                            c6502 = new C6502(selectNumberRule(10, length2), 1);
                            i = 1;
                        } else if (cCharAt == 'k') {
                            c6481 = new C6502(selectNumberRule(11, length2), 2);
                        } else if (cCharAt == 'm') {
                            interfaceC6483SelectNumberRule = selectNumberRule(12, length2);
                        } else if (cCharAt != 's') {
                            if (cCharAt == 'u') {
                                i2 = 0;
                                c65023 = new C6502(selectNumberRule(7, length2), i2);
                            } else if (cCharAt == 'w') {
                                interfaceC6483SelectNumberRule = selectNumberRule(3, length2);
                            } else if (cCharAt == 'y') {
                                InterfaceC6500 interfaceC6500SelectNumberRule = length2 == 2 ? C6489.f15907 : selectNumberRule(1, Math.max(length2, 4));
                                c6481 = interfaceC6500SelectNumberRule;
                                if (cCharAt == 'Y') {
                                    c65022 = new C6502(interfaceC6500SelectNumberRule, 3);
                                }
                                i = 1;
                                c6502 = c65022;
                            } else {
                                if (cCharAt != 'z') {
                                    switch (cCharAt) {
                                        case 'D':
                                            interfaceC6483SelectNumberRule = selectNumberRule(6, length2);
                                            break;
                                        case 'E':
                                            c65022 = new C6481(length2 < 4 ? shortWeekdays : weekdays, 7);
                                            break;
                                        case 'F':
                                            interfaceC6483SelectNumberRule = selectNumberRule(8, length2);
                                            break;
                                        case 'G':
                                            i2 = 0;
                                            c65023 = new C6481(eras, 0);
                                            break;
                                        case 'H':
                                            interfaceC6483SelectNumberRule = selectNumberRule(11, length2);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'K':
                                                    interfaceC6483SelectNumberRule = selectNumberRule(10, length2);
                                                    break;
                                                case 'L':
                                                    if (length2 < 4) {
                                                        int i6 = 2;
                                                        if (length2 != 3) {
                                                            c65022 = length2 != 2 ? interfaceC64833 : interfaceC64832;
                                                        } else {
                                                            Locale locale = this.locale;
                                                            C6492 c6492 = new C6492(Calendar.getInstance(locale), locale);
                                                            Map<String, Integer> displayNames = c6492.f15914.getDisplayNames(2, 32769, c6492.f15913);
                                                            if (displayNames == null) {
                                                                strArr = null;
                                                            } else {
                                                                String[] strArr3 = new String[displayNames.size()];
                                                                displayNames.forEach(new C6493(strArr3, 0));
                                                                strArr = strArr3;
                                                                i6 = 2;
                                                            }
                                                            c6481 = new C6481(strArr, i6);
                                                        }
                                                    } else {
                                                        Locale locale2 = this.locale;
                                                        C6492 c64922 = new C6492(Calendar.getInstance(locale2), locale2);
                                                        int i7 = 2;
                                                        Map<String, Integer> displayNames2 = c64922.f15914.getDisplayNames(2, 32770, c64922.f15913);
                                                        if (displayNames2 == null) {
                                                            strArr2 = null;
                                                        } else {
                                                            String[] strArr4 = new String[displayNames2.size()];
                                                            displayNames2.forEach(new C6493(strArr4, 0));
                                                            strArr2 = strArr4;
                                                            i7 = 2;
                                                        }
                                                        c6481 = new C6481(strArr2, i7);
                                                    }
                                                    break;
                                                case 'M':
                                                    if (length2 >= 4) {
                                                        c6481 = new C6481(months, 2);
                                                        break;
                                                    } else if (length2 == 3) {
                                                        c6481 = new C6481(shortMonths, 2);
                                                        break;
                                                    } else if (length2 == 2) {
                                                    }
                                                    break;
                                                default:
                                                    interfaceC6483SelectNumberRule = C6499.f15931;
                                                    switch (cCharAt) {
                                                        case 'W':
                                                            interfaceC6483SelectNumberRule = selectNumberRule(4, length2);
                                                            break;
                                                        case 'X':
                                                            if (length2 == 1) {
                                                                interfaceC6483SelectNumberRule = C6499.f15933;
                                                            } else if (length2 == 2) {
                                                                interfaceC6483SelectNumberRule = C6499.f15932;
                                                            } else if (length2 != 3) {
                                                                C6755.m11869("invalid number of X");
                                                            }
                                                            break;
                                                        case 'Y':
                                                            break;
                                                        case 'Z':
                                                            if (length2 == 1) {
                                                                interfaceC6483SelectNumberRule = C6490.f15910;
                                                            } else if (length2 != 2) {
                                                                interfaceC6483SelectNumberRule = C6490.f15911;
                                                            }
                                                            i = 1;
                                                            c6502 = interfaceC6483SelectNumberRule;
                                                            break;
                                                        default:
                                                            C6755.m11869("Illegal pattern component: ".concat(token));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    return null;
                                }
                                c65022 = new C6479(length2 >= 4 ? 1 : 0, this.timeZone, this.locale);
                                i = 1;
                                c6502 = c65022;
                            }
                            c6502 = c65023;
                            i = 1;
                        } else {
                            interfaceC6483SelectNumberRule = selectNumberRule(13, length2);
                        }
                        i2 = 0;
                    } else {
                        interfaceC6483SelectNumberRule = selectNumberRule(5, length2);
                    }
                    c65022 = c6481;
                    i = 1;
                    c6502 = c65022;
                    i2 = 0;
                } else {
                    interfaceC6483SelectNumberRule = selectNumberRule(14, length2);
                }
                c65022 = interfaceC6483SelectNumberRule;
                i = 1;
                c6502 = c65022;
                i2 = 0;
            } else {
                i = 1;
                String strSubstring = token.substring(1);
                if (strSubstring.length() == 1) {
                    i2 = 0;
                    c6482 = new C6501(strSubstring.charAt(0));
                } else {
                    i2 = 0;
                    c6482 = new C6482(strSubstring);
                }
                c6502 = c6482;
            }
            arrayList.add(c6502);
            i4 = i5 + i;
            i3 = i2;
            interfaceC6483 = interfaceC64833;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if (AbstractC6533.m11621(cCharAt)) {
            sb.append(cCharAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && AbstractC6533.m11621(cCharAt2)) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i = i3;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    public InterfaceC6500 selectNumberRule(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new C6484(i, i2) : new C6488(i, 0) : new C6488(i, 1);
    }

    public String toString() {
        return "FastDatePrinter[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) applyRules(calendar, stringBuffer);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        if (!calendar.getTimeZone().equals(this.timeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.timeZone);
        }
        return (B) applyRules(calendar, b);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    public String format(Date date) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return applyRulesToString(calendarNewCalendar);
    }

    public <B extends Appendable> B format(Date date, B b) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return (B) applyRules(calendarNewCalendar, b);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return (StringBuffer) applyRules(calendarNewCalendar, stringBuffer);
    }

    public String format(long j) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j);
        return applyRulesToString(calendarNewCalendar);
    }

    public <B extends Appendable> B format(long j, B b) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j);
        return (B) applyRules(calendarNewCalendar, b);
    }

    public StringBuffer format(long j, StringBuffer stringBuffer) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j);
        return (StringBuffer) applyRules(calendarNewCalendar, stringBuffer);
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.maxLengthEstimate))).toString();
    }

    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        HashMap map = AbstractC6531.f15984;
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }
}
