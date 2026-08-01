package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import bsh.classpath.C2602;
import bsh.classpath.C2604;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.AbstractC5692;
import org.apache.commons.lang3.AbstractC5702;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FastDateParser implements Serializable {
    private static final long serialVersionUID = 3;
    private final int century;
    private final Locale locale;
    private final String pattern;
    private transient List<C5674> patterns;
    private final int startYear;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = Comparator.reverseOrder();
    private static final ConcurrentMap<Locale, AbstractC5677>[] CACHES = new ConcurrentMap[17];
    private static final AbstractC5677 ABBREVIATED_YEAR_STRATEGY = new C5683(1, 0);
    private static final AbstractC5677 NUMBER_MONTH_STRATEGY = new C5683(2, 1);
    private static final AbstractC5677 LITERAL_YEAR_STRATEGY = new C5672(1);
    private static final AbstractC5677 WEEK_OF_YEAR_STRATEGY = new C5672(3);
    private static final AbstractC5677 WEEK_OF_MONTH_STRATEGY = new C5672(4);
    private static final AbstractC5677 DAY_OF_YEAR_STRATEGY = new C5672(6);
    private static final AbstractC5677 DAY_OF_MONTH_STRATEGY = new C5672(5);
    private static final AbstractC5677 DAY_OF_WEEK_STRATEGY = new C5683(7, 2);
    private static final AbstractC5677 DAY_OF_WEEK_IN_MONTH_STRATEGY = new C5672(8);
    private static final AbstractC5677 HOUR_OF_DAY_STRATEGY = new C5672(11);
    private static final AbstractC5677 HOUR24_OF_DAY_STRATEGY = new C5683(11, 3);
    private static final AbstractC5677 HOUR12_STRATEGY = new C5683(10, 4);
    private static final AbstractC5677 HOUR_STRATEGY = new C5672(10);
    private static final AbstractC5677 MINUTE_STRATEGY = new C5672(12);
    private static final AbstractC5677 SECOND_STRATEGY = new C5672(13);
    private static final AbstractC5677 MILLISECOND_STRATEGY = new C5672(14);

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        Objects.requireNonNull(str, "pattern");
        this.pattern = str;
        Objects.requireNonNull(timeZone, "timeZone");
        this.timeZone = timeZone;
        int i2 = AbstractC5692.f15626;
        locale = locale == null ? Locale.getDefault() : locale;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i3 = (i / 100) * 100;
        this.century = i3;
        this.startYear = i - i3;
        init(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int adjustYear(int i) {
        int i2 = this.century + i;
        return i >= this.startYear ? i2 : i2 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> appendDisplayNames(Calendar calendar, final Locale locale, int i, StringBuilder sb) {
        Objects.requireNonNull(calendar, "calendar");
        final HashMap map = new HashMap();
        int i2 = AbstractC5692.f15626;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, locale);
        final TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        displayNames.forEach(new BiConsumer() { // from class: org.apache.commons.lang3.time.飘花落叶言子楪苏世兰哲
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FastDateParser.lambda$appendDisplayNames$0(locale, treeSet, map, (String) obj, (Integer) obj2);
            }
        });
        treeSet.forEach(new C5682(sb, 0));
        return map;
    }

    public static void clear() {
        Stream.of((Object[]) CACHES).filter(new C2602(4)).forEach(new C2604(2));
    }

    private static ConcurrentMap<Locale, AbstractC5677> getCache(int i) {
        ConcurrentMap<Locale, AbstractC5677> concurrentMap;
        ConcurrentMap<Locale, AbstractC5677>[] concurrentMapArr = CACHES;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i] == null) {
                    concurrentMapArr[i] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private AbstractC5677 getLocaleSpecificStrategy(final int i, final Calendar calendar) {
        return getCache(i).computeIfAbsent(this.locale, new Function() { // from class: org.apache.commons.lang3.time.飘花落叶言子楪苏世哲兰
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f15607.lambda$getLocaleSpecificStrategy$2(i, calendar, (Locale) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5677 getStrategy(char c, int i, Calendar calendar) {
        if (c == 'S') {
            return MILLISECOND_STRATEGY;
        }
        if (c == 'a') {
            return getLocaleSpecificStrategy(9, calendar);
        }
        if (c == 'd') {
            return DAY_OF_MONTH_STRATEGY;
        }
        if (c == 'h') {
            return HOUR12_STRATEGY;
        }
        if (c == 'k') {
            return HOUR24_OF_DAY_STRATEGY;
        }
        if (c == 'm') {
            return MINUTE_STRATEGY;
        }
        if (c == 's') {
            return SECOND_STRATEGY;
        }
        if (c == 'u') {
            return DAY_OF_WEEK_STRATEGY;
        }
        if (c == 'w') {
            return WEEK_OF_YEAR_STRATEGY;
        }
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return DAY_OF_YEAR_STRATEGY;
                    case 'E':
                        return getLocaleSpecificStrategy(7, calendar);
                    case 'F':
                        return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                    case 'G':
                        return getLocaleSpecificStrategy(0, calendar);
                    case 'H':
                        return HOUR_OF_DAY_STRATEGY;
                    default:
                        switch (c) {
                            case 'K':
                                return HOUR_STRATEGY;
                            case 'L':
                            case 'M':
                                return i >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            default:
                                switch (c) {
                                    case 'W':
                                        return WEEK_OF_MONTH_STRATEGY;
                                    case 'X':
                                        if (i == 1) {
                                            return C5673.f15596;
                                        }
                                        if (i == 2) {
                                            return C5673.f15595;
                                        }
                                        if (i == 3) {
                                            return C5673.f15594;
                                        }
                                        C5673 c5673 = C5673.f15596;
                                        C5919.m11249("invalid number of X");
                                        return null;
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return C5673.f15594;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c + "' not supported");
                                }
                                break;
                        }
                        break;
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        }
        return i > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
    }

    private void init(Calendar calendar) {
        C5674 c5674;
        this.patterns = new ArrayList();
        Objects.requireNonNull(calendar, "definingCalendar");
        int i = 0;
        while (true) {
            if (i >= this.pattern.length()) {
                c5674 = null;
            } else {
                char cCharAt = this.pattern.charAt(i);
                if (AbstractC5702.m11005(cCharAt)) {
                    int i2 = i;
                    do {
                        i2++;
                        if (i2 >= this.pattern.length()) {
                            break;
                        }
                    } while (this.pattern.charAt(i2) == cCharAt);
                    int i3 = i2 - i;
                    C5674 c56742 = new C5674(getStrategy(cCharAt, i3, calendar), i3);
                    i = i2;
                    c5674 = c56742;
                } else {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    while (i < this.pattern.length()) {
                        char cCharAt2 = this.pattern.charAt(i);
                        if (!z && AbstractC5702.m11005(cCharAt2)) {
                            break;
                        }
                        if (cCharAt2 != '\'' || ((i = i + 1) != this.pattern.length() && this.pattern.charAt(i) == '\'')) {
                            i++;
                            sb.append(cCharAt2);
                        } else {
                            z = !z;
                        }
                    }
                    if (z) {
                        C5919.m11249("Unterminated quote");
                        return;
                    } else {
                        String string = sb.toString();
                        c5674 = new C5674(new C5681(string), string.length());
                    }
                }
            }
            if (c5674 == null) {
                return;
            } else {
                this.patterns.add(c5674);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$appendDisplayNames$0(Locale locale, TreeSet treeSet, Map map, String str, Integer num) {
        String lowerCase = str.toLowerCase(locale);
        if (treeSet.add(lowerCase)) {
            map.put(lowerCase, num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$appendDisplayNames$1(StringBuilder sb, String str) {
        simpleQuote(sb, str).append('|');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5677 lambda$getLocaleSpecificStrategy$2(int i, Calendar calendar, Locale locale) {
        Locale locale2 = this.locale;
        return i == 15 ? new C5667(locale2) : new C5680(i, calendar, locale2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder simpleQuote(java.lang.StringBuilder r6, java.lang.String r7) {
        /*
            r0 = 0
        L1:
            int r1 = r7.length()
            r2 = 63
            r3 = 46
            if (r0 >= r1) goto L38
            char r1 = r7.charAt(r0)
            r4 = 36
            r5 = 92
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2f
            r2 = 94
            if (r1 == r2) goto L2f
            r2 = 91
            if (r1 == r2) goto L2f
            if (r1 == r5) goto L2f
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L2f
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 40: goto L2f;
                case 41: goto L2f;
                case 42: goto L2f;
                case 43: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L32
        L2f:
            r6.append(r5)
        L32:
            r6.append(r1)
            int r0 = r0 + 1
            goto L1
        L38:
            int r7 = r6.length()
            int r7 = r7 + (-1)
            char r7 = r6.charAt(r7)
            if (r7 != r3) goto L47
            r6.append(r2)
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDateParser.simpleQuote(java.lang.StringBuilder, java.lang.String):java.lang.StringBuilder");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
    }

    public Locale getLocale() {
        return this.locale;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean parse(java.lang.String r11, java.text.ParsePosition r12, java.util.Calendar r13) {
        /*
            r10 = this;
            java.util.List<org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏> r0 = r10.patterns
            java.util.ListIterator r0 = r0.listIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏 r1 = (org.apache.commons.lang3.time.C5674) r1
            org.apache.commons.lang3.time.飘花落叶言子楪哲苏兰世 r2 = r1.f15598
            boolean r2 = r2.mo10994()
            r3 = 0
            if (r2 == 0) goto L37
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L22
            goto L37
        L22:
            java.lang.Object r2 = r0.next()
            org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏 r2 = (org.apache.commons.lang3.time.C5674) r2
            org.apache.commons.lang3.time.飘花落叶言子楪哲苏兰世 r2 = r2.f15598
            r0.previous()
            boolean r2 = r2.mo10994()
            if (r2 == 0) goto L37
            int r2 = r1.f15597
            r9 = r2
            goto L38
        L37:
            r9 = r3
        L38:
            org.apache.commons.lang3.time.飘花落叶言子楪哲苏兰世 r4 = r1.f15598
            r5 = r10
            r7 = r11
            r8 = r12
            r6 = r13
            boolean r10 = r4.mo10993(r5, r6, r7, r8, r9)
            if (r10 != 0) goto L45
            return r3
        L45:
            r10 = r5
            r13 = r6
            r11 = r7
            r12 = r8
            goto L6
        L4a:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String, java.text.ParsePosition, java.util.Calendar):boolean");
    }

    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + ", " + this.locale + ", " + this.timeZone.getID() + "]";
    }

    public String toStringAll() {
        return "FastDateParser [pattern=" + this.pattern + ", timeZone=" + this.timeZone + ", locale=" + this.locale + ", century=" + this.century + ", startYear=" + this.startYear + ", patterns=" + this.patterns + "]";
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        if (parse(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = parse(str, parsePosition);
        if (date != null) {
            return date;
        }
        if (this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
        }
        throw new ParseException(AbstractC0053.m152("Unparseable date: ", str), parsePosition.getErrorIndex());
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }
}
