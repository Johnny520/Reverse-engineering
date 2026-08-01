package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FastDateFormat extends Format {
    private static final AbstractC5663 CACHE = new C5660();
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static void clear() {
        AbstractC5663.f15572.clear();
        CACHE.f15573.clear();
    }

    public static FastDateFormat getDateInstance(int i) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), null, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), Integer.valueOf(i2), null, null);
    }

    public static FastDateFormat getInstance() {
        AbstractC5663 abstractC5663 = CACHE;
        abstractC5663.getClass();
        return (FastDateFormat) abstractC5663.m10990(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public static FastDateFormat getTimeInstance(int i) {
        return (FastDateFormat) CACHE.m10990(null, Integer.valueOf(i), null, null);
    }

    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.applyRules(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    public String getPattern() {
        return this.printer.getPattern();
    }

    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    public Date parse(String str) {
        return this.parser.parse(str);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + "]";
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        return (B) this.printer.format(calendar, b);
    }

    @Deprecated
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }

    public String format(Date date) {
        return this.printer.format(date);
    }

    public <B extends Appendable> B format(Date date, B b) {
        return (B) this.printer.format(date, b);
    }

    public static FastDateFormat getDateInstance(int i, Locale locale) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), null, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale) {
        return (FastDateFormat) CACHE.m10990(null, Integer.valueOf(i), null, locale);
    }

    @Deprecated
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    public String format(long j) {
        return this.printer.format(j);
    }

    public <B extends Appendable> B format(long j, B b) {
        return (B) this.printer.format(j, b);
    }

    @Deprecated
    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return this.printer.format(j, stringBuffer);
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), null, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, Locale locale) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), Integer.valueOf(i2), null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) CACHE.m10990(null, Integer.valueOf(i), timeZone, null);
    }

    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), null, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone) {
        return getDateTimeInstance(i, i2, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.m10990(null, Integer.valueOf(i), timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.m10990(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) CACHE.m10989(str, null, null);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) CACHE.m10989(str, null, locale);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) CACHE.m10989(str, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.m10989(str, timeZone, locale);
    }
}
