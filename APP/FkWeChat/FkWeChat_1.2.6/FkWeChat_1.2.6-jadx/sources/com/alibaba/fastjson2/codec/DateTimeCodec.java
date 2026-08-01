package com.alibaba.fastjson2.codec;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeCodec {
    DateTimeFormatter dateFormatter;
    public final String format;
    protected final boolean formatHasDay;
    protected final boolean formatHasHour;
    public final boolean formatISO8601;
    public final boolean formatMillis;
    public final boolean formatUnixTime;
    public final Locale locale;
    protected final boolean useSimpleDateFormat;
    public final boolean useSimpleFormatter;
    protected final boolean yyyyMMdd10;
    protected final boolean yyyyMMdd8;
    protected final boolean yyyyMMddhhmm16;
    protected final boolean yyyyMMddhhmmss14;
    protected final boolean yyyyMMddhhmmss19;

    public DateTimeCodec(String str, Locale locale) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        str = str != null ? str.replace("aa", "a") : str;
        this.format = str;
        this.locale = locale;
        this.yyyyMMddhhmmss14 = "yyyyMMddHHmmss".equals(str);
        this.yyyyMMddhhmmss19 = "yyyy-MM-dd HH:mm:ss".equals(str);
        this.yyyyMMddhhmm16 = "yyyy-MM-dd HH:mm".equals(str);
        this.yyyyMMdd10 = "yyyy-MM-dd".equals(str);
        this.yyyyMMdd8 = "yyyyMMdd".equals(str);
        this.useSimpleDateFormat = "yyyy-MM-dd'T'HH:mm:ssXXX".equals(str);
        boolean z14 = false;
        if (str != null) {
            z11 = true;
            switch (str) {
                case "millis":
                    z10 = false;
                    z12 = false;
                    break;
                case "unixtime":
                    z10 = false;
                    z12 = false;
                    z13 = false;
                    z14 = true;
                    z11 = z13;
                    break;
                case "iso8601":
                    z12 = false;
                    z13 = false;
                    z10 = true;
                    z11 = z13;
                    break;
                default:
                    boolean z15 = str.indexOf(100) != -1;
                    if (str.indexOf(72) == -1 && str.indexOf(Opcodes.IMUL) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) {
                        z11 = false;
                    }
                    z12 = z15;
                    z13 = z11;
                    z10 = false;
                    z11 = false;
                    break;
            }
            this.formatUnixTime = z14;
            this.formatMillis = z11;
            this.formatISO8601 = z10;
            this.formatHasDay = z12;
            this.formatHasHour = z13;
            this.useSimpleFormatter = "yyyyMMddHHmmssSSSZ".equals(str);
        }
        z10 = false;
        z11 = false;
        z12 = false;
        z13 = z12;
        this.formatUnixTime = z14;
        this.formatMillis = z11;
        this.formatISO8601 = z10;
        this.formatHasDay = z12;
        this.formatHasHour = z13;
        this.useSimpleFormatter = "yyyyMMddHHmmssSSSZ".equals(str);
    }

    public DateTimeFormatter getDateFormatter(Locale locale) {
        Locale locale2;
        if (this.format == null || this.formatMillis || this.formatISO8601 || this.formatUnixTime) {
            return null;
        }
        if (this.dateFormatter != null && ((this.locale == null && (locale == null || locale == Locale.getDefault())) || ((locale2 = this.locale) != null && locale2.equals(locale)))) {
            return this.dateFormatter;
        }
        if (locale != null) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(this.format, locale);
            this.dateFormatter = dateTimeFormatterOfPattern;
            return dateTimeFormatterOfPattern;
        }
        Locale locale3 = this.locale;
        String str = this.format;
        if (locale3 == null) {
            DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(str);
            this.dateFormatter = dateTimeFormatterOfPattern2;
            return dateTimeFormatterOfPattern2;
        }
        DateTimeFormatter dateTimeFormatterOfPattern3 = DateTimeFormatter.ofPattern(str, locale3);
        this.dateFormatter = dateTimeFormatterOfPattern3;
        return dateTimeFormatterOfPattern3;
    }

    public DateTimeFormatter getDateFormatter() {
        String str;
        if (this.dateFormatter == null && (str = this.format) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
            Locale locale = this.locale;
            if (locale == null) {
                this.dateFormatter = DateTimeFormatter.ofPattern(str);
            } else {
                this.dateFormatter = DateTimeFormatter.ofPattern(str, locale);
            }
        }
        return this.dateFormatter;
    }

    public DateTimeCodec(String str) {
        this(str, null);
    }
}
