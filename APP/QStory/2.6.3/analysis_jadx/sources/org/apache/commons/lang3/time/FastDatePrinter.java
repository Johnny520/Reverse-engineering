package org.apache.commons.lang3.time;

import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.apache.commons.lang3.AbstractC5693;
import org.apache.commons.lang3.AbstractC5701;
import org.apache.commons.lang3.AbstractC5703;

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
    private transient InterfaceC5653[] rules;
    private final TimeZone timeZone;
    private static final InterfaceC5653[] EMPTY_RULE_ARRAY = new InterfaceC5653[0];
    private static final ConcurrentMap<C5650, String> timeZoneDisplayCache = new ConcurrentHashMap(7);

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.pattern = str;
        this.timeZone = timeZone;
        int i = AbstractC5693.f15626;
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
        for (InterfaceC5653 interfaceC5653 : this.rules) {
            interfaceC5653.mo11042(calendar, b);
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
        return timeZoneDisplayCache.computeIfAbsent(new C5650(timeZone, z, i, locale), new Function() { // from class: org.apache.commons.lang3.time.飘花落叶言子楪兰世哲苏
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FastDatePrinter.lambda$getTimeZoneDisplay$0(timeZone, z, i, locale, (C5650) obj);
            }
        });
    }

    private void init() {
        InterfaceC5653[] interfaceC5653Arr = (InterfaceC5653[]) parsePattern().toArray(EMPTY_RULE_ARRAY);
        this.rules = interfaceC5653Arr;
        int length = interfaceC5653Arr.length;
        int iMo11043 = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.maxLengthEstimate = iMo11043;
                return;
            }
            iMo11043 += this.rules[length].mo11043();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getTimeZoneDisplay$0(TimeZone timeZone, boolean z, int i, Locale locale, C5650 c5650) {
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
        HashMap map = AbstractC5701.f15639;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<org.apache.commons.lang3.time.InterfaceC5653> parsePattern() {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDatePrinter.parsePattern():java.util.List");
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if (AbstractC5703.m11062(cCharAt)) {
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
                    if (!z && AbstractC5703.m11062(cCharAt2)) {
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

    public InterfaceC5670 selectNumberRule(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new C5654(i, i2) : new C5658(i, 0) : new C5658(i, 1);
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
        HashMap map = AbstractC5701.f15639;
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }
}
