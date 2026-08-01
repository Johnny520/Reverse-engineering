package p275t0;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4717x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: t0.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7955f0 extends AbstractC7951e0 {

    /* JADX INFO: renamed from: e */
    public static final a f26514e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f26515f = 8;

    /* JADX INFO: renamed from: g */
    public static final ZoneId f26516g = ZoneId.of("UTC");

    /* JADX INFO: renamed from: c */
    public final int f26517c;

    /* JADX INFO: renamed from: d */
    public final List f26518d;

    /* JADX INFO: renamed from: t0.f0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ InterfaceC7197a f26519a = AbstractC7198b.m28437a(DayOfWeek.values());
    }

    public C7955f0(Locale locale) {
        super(locale);
        this.f26517c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        InterfaceC7197a interfaceC7197a = b.f26519a;
        ArrayList arrayList = new ArrayList(interfaceC7197a.size());
        int size = interfaceC7197a.size();
        for (int i10 = 0; i10 < size; i10++) {
            DayOfWeek dayOfWeek = (DayOfWeek) interfaceC7197a.get(i10);
            arrayList.add(AbstractC4717x.m18815a(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.f26518d = arrayList;
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: a */
    public String mo30691a(long j10, String str, Locale locale) {
        return f26514e.m30711b(j10, str, locale, m30695e());
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: b */
    public C7947d0 mo30692b(long j10) {
        LocalDate localDate = Instant.ofEpochMilli(j10).atZone(f26516g).toLocalDate();
        return new C7947d0(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: c */
    public C7991p0 mo30693c(Locale locale) {
        return AbstractC7959g0.m30718a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: d */
    public int mo30694d() {
        return this.f26517c;
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: g */
    public C7967i0 mo30697g(int i10, int i11) {
        return m30708o(LocalDate.of(i10, i11, 1));
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: h */
    public C7967i0 mo30698h(long j10) {
        return m30708o(Instant.ofEpochMilli(j10).atZone(f26516g).withDayOfMonth(1).toLocalDate());
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: i */
    public C7967i0 mo30699i(C7947d0 c7947d0) {
        return m30708o(LocalDate.of(c7947d0.m30678h(), c7947d0.m30676c(), 1));
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: j */
    public C7947d0 mo30700j() {
        LocalDate localDateNow = LocalDate.now();
        return new C7947d0(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f26516g).toInstant().toEpochMilli());
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: k */
    public List mo30701k() {
        return this.f26518d;
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: l */
    public C7947d0 mo30702l(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, f26514e.m30712c(str2, locale, m30695e()));
            return new C7947d0(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f26516g).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // p275t0.AbstractC7951e0
    /* JADX INFO: renamed from: m */
    public C7967i0 mo30703m(C7967i0 c7967i0, int i10) {
        return i10 <= 0 ? c7967i0 : m30708o(m30709p(c7967i0).plusMonths(i10));
    }

    /* JADX INFO: renamed from: o */
    public final C7967i0 m30708o(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - mo30694d();
        if (value < 0) {
            value += 7;
        }
        return new C7967i0(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f26516g).toInstant().toEpochMilli());
    }

    /* JADX INFO: renamed from: p */
    public final LocalDate m30709p(C7967i0 c7967i0) {
        return Instant.ofEpochMilli(c7967i0.m30737d()).atZone(f26516g).toLocalDate();
    }

    public String toString() {
        return "CalendarModel";
    }

    /* JADX INFO: renamed from: t0.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m30711b(long j10, String str, Locale locale, Map map) {
            return Instant.ofEpochMilli(j10).atZone(m30713d()).toLocalDate().format(m30712c(str, locale, map));
        }

        /* JADX INFO: renamed from: c */
        public final DateTimeFormatter m30712c(String str, Locale locale, Map map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            objWithDecimalStyle.getClass();
            return (DateTimeFormatter) objWithDecimalStyle;
        }

        /* JADX INFO: renamed from: d */
        public final ZoneId m30713d() {
            return C7955f0.f26516g;
        }

        public a() {
        }
    }
}
