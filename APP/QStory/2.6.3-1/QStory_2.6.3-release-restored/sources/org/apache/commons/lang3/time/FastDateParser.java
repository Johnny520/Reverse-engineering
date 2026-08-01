package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import bsh.classpath.C3436;
import bsh.classpath.C3438;
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
import java.util.ListIterator;
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
import org.apache.commons.lang3.AbstractC6523;
import org.apache.commons.lang3.AbstractC6533;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FastDateParser implements Serializable {
    private static final long serialVersionUID = 3;
    private final int century;
    private final Locale locale;
    private final String pattern;
    private transient List<C6505> patterns;
    private final int startYear;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = Comparator.reverseOrder();
    private static final ConcurrentMap<Locale, AbstractC6508>[] CACHES = new ConcurrentMap[17];
    private static final AbstractC6508 ABBREVIATED_YEAR_STRATEGY = new C6514(1, 0);
    private static final AbstractC6508 NUMBER_MONTH_STRATEGY = new C6514(2, 1);
    private static final AbstractC6508 LITERAL_YEAR_STRATEGY = new C6503(1);
    private static final AbstractC6508 WEEK_OF_YEAR_STRATEGY = new C6503(3);
    private static final AbstractC6508 WEEK_OF_MONTH_STRATEGY = new C6503(4);
    private static final AbstractC6508 DAY_OF_YEAR_STRATEGY = new C6503(6);
    private static final AbstractC6508 DAY_OF_MONTH_STRATEGY = new C6503(5);
    private static final AbstractC6508 DAY_OF_WEEK_STRATEGY = new C6514(7, 2);
    private static final AbstractC6508 DAY_OF_WEEK_IN_MONTH_STRATEGY = new C6503(8);
    private static final AbstractC6508 HOUR_OF_DAY_STRATEGY = new C6503(11);
    private static final AbstractC6508 HOUR24_OF_DAY_STRATEGY = new C6514(11, 3);
    private static final AbstractC6508 HOUR12_STRATEGY = new C6514(10, 4);
    private static final AbstractC6508 HOUR_STRATEGY = new C6503(10);
    private static final AbstractC6508 MINUTE_STRATEGY = new C6503(12);
    private static final AbstractC6508 SECOND_STRATEGY = new C6503(13);
    private static final AbstractC6508 MILLISECOND_STRATEGY = new C6503(14);

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        Objects.requireNonNull(str, "pattern");
        this.pattern = str;
        Objects.requireNonNull(timeZone, "timeZone");
        this.timeZone = timeZone;
        int i2 = AbstractC6523.f15971;
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
        int i2 = AbstractC6523.f15971;
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
        treeSet.forEach(new C6513(sb, 0));
        return map;
    }

    public static void clear() {
        Stream.of((Object[]) CACHES).filter(new C3436(4)).forEach(new C3438(2));
    }

    private static ConcurrentMap<Locale, AbstractC6508> getCache(int i) {
        ConcurrentMap<Locale, AbstractC6508> concurrentMap;
        ConcurrentMap<Locale, AbstractC6508>[] concurrentMapArr = CACHES;
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

    private AbstractC6508 getLocaleSpecificStrategy(final int i, final Calendar calendar) {
        return getCache(i).computeIfAbsent(this.locale, new Function() { // from class: org.apache.commons.lang3.time.飘花落叶言子楪苏世哲兰
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f15952.lambda$getLocaleSpecificStrategy$2(i, calendar, (Locale) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC6508 getStrategy(char c, int i, Calendar calendar) {
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
                                            return C6504.f15941;
                                        }
                                        if (i == 2) {
                                            return C6504.f15940;
                                        }
                                        if (i == 3) {
                                            return C6504.f15939;
                                        }
                                        C6504 c6504 = C6504.f15941;
                                        C6755.m11869("invalid number of X");
                                        return null;
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return C6504.f15939;
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
        C6505 c6505;
        this.patterns = new ArrayList();
        Objects.requireNonNull(calendar, "definingCalendar");
        int i = 0;
        while (true) {
            if (i >= this.pattern.length()) {
                c6505 = null;
            } else {
                char cCharAt = this.pattern.charAt(i);
                if (AbstractC6533.m11621(cCharAt)) {
                    int i2 = i;
                    do {
                        i2++;
                        if (i2 >= this.pattern.length()) {
                            break;
                        }
                    } while (this.pattern.charAt(i2) == cCharAt);
                    int i3 = i2 - i;
                    C6505 c65052 = new C6505(getStrategy(cCharAt, i3, calendar), i3);
                    i = i2;
                    c6505 = c65052;
                } else {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    while (i < this.pattern.length()) {
                        char cCharAt2 = this.pattern.charAt(i);
                        if (!z && AbstractC6533.m11621(cCharAt2)) {
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
                        C6755.m11869("Unterminated quote");
                        return;
                    } else {
                        String string = sb.toString();
                        c6505 = new C6505(new C6512(string), string.length());
                    }
                }
            }
            if (c6505 == null) {
                return;
            } else {
                this.patterns.add(c6505);
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
    public /* synthetic */ AbstractC6508 lambda$getLocaleSpecificStrategy$2(int i, Calendar calendar, Locale locale) {
        Locale locale2 = this.locale;
        return i == 15 ? new C6498(locale2) : new C6511(i, calendar, locale2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StringBuilder simpleQuote(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '$' || cCharAt == '.' || cCharAt == '?' || cCharAt == '^' || cCharAt == '[' || cCharAt == '\\' || cCharAt == '{' || cCharAt == '|') {
                sb.append('\\');
            } else {
                switch (cCharAt) {
                }
            }
            sb.append(cCharAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
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
    */
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        int i;
        ListIterator<C6505> listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            C6505 next = listIterator.next();
            if (next.f15943.mo11610() && listIterator.hasNext()) {
                AbstractC6508 abstractC6508 = listIterator.next().f15943;
                listIterator.previous();
                if (abstractC6508.mo11610()) {
                    i = next.f15942;
                }
            } else {
                i = 0;
            }
            FastDateParser fastDateParser = this;
            String str2 = str;
            ParsePosition parsePosition2 = parsePosition;
            Calendar calendar2 = calendar;
            if (!next.f15943.mo11609(fastDateParser, calendar2, str2, parsePosition2, i)) {
                return false;
            }
            this = fastDateParser;
            calendar = calendar2;
            str = str2;
            parsePosition = parsePosition2;
        }
        return true;
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
        throw new ParseException(AbstractC0900.m717("Unparseable date: ", str), parsePosition.getErrorIndex());
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }
}
