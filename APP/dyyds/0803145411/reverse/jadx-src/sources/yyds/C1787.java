package yyds;

import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᛸᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1787 implements InterfaceC0248 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2392 f9026 = new C2392(new String[]{"seconds", "nanos"}, 2);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2392 f9027 = new C2392(new String[]{"seconds", "nanos"}, 3);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2392 f9030 = new C2392(new String[]{"year", "month", "day"}, 4);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2392 f9032 = new C2392(new String[]{"hour", "minute", "second", "nano"}, 5);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2392 f9025 = new C2392(new String[]{"month", "day"}, 6);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2392 f9031 = new C2392(new String[]{"years", "months", "days"}, 7);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C2392 f9028 = new C2392(new String[]{"year"}, 0);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C2392 f9023 = new C2392(new String[]{"year", "month"}, 1);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C0727 f9024 = new C1788().m4828();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1789 f9029 = new C1789();

    /* JADX INFO: renamed from: yyds.ᛸᛶᛲ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class C1788 extends AbstractC2720 {
        @Override // yyds.AbstractC2720
        /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
        public final Object mo484(C1942 c1942) throws IOException {
            c1942.m3769();
            String strM3745 = null;
            Integer numValueOf = null;
            while (c1942.m3744() != 4) {
                String strM3741 = c1942.m3741();
                if (strM3741.equals("totalSeconds")) {
                    numValueOf = Integer.valueOf(c1942.m3771());
                } else if (strM3741.equals(Name.MARK)) {
                    strM3745 = c1942.m3745();
                } else {
                    c1942.m3754();
                }
            }
            c1942.m3768();
            if (strM3745 != null) {
                return ZoneId.of(strM3745);
            }
            if (numValueOf != null) {
                return ZoneOffset.ofTotalSeconds(numValueOf.intValue());
            }
            throw new C1600("Missing id or totalSeconds field; at path ".concat(c1942.m3749(true)));
        }

        @Override // yyds.AbstractC2720
        /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
        public final void mo485(C1405 c1405, Object obj) throws IOException {
            ZoneId zoneId = (ZoneId) obj;
            if (zoneId instanceof ZoneOffset) {
                c1405.m2858();
                c1405.m2856("totalSeconds");
                c1405.m2861(((ZoneOffset) zoneId).getTotalSeconds());
                c1405.m2865();
                return;
            }
            c1405.m2858();
            c1405.m2856(Name.MARK);
            c1405.m2852(zoneId.getId());
            c1405.m2865();
        }
    }

    /* JADX INFO: renamed from: yyds.ᛸᛶᛲ$ᛵᛸᛸᛷ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class C1789 implements InterfaceC0652 {
        @Override // yyds.InterfaceC0652
        /* JADX INFO: renamed from: ᛲᲈᲁ */
        public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
            Class cls = c2805.f13682;
            if (!cls.getName().startsWith("java.time.")) {
                return null;
            }
            if (cls == Duration.class) {
                return C1787.f9026;
            }
            if (cls == Instant.class) {
                return C1787.f9027;
            }
            if (cls == LocalDate.class) {
                return C1787.f9030;
            }
            if (cls == LocalTime.class) {
                return C1787.f9032;
            }
            if (cls == LocalDateTime.class) {
                return C1787.m3572(c0114);
            }
            if (cls == MonthDay.class) {
                return C1787.f9025;
            }
            if (cls == OffsetDateTime.class) {
                return new C1546(C1787.m3572(c0114), c0114.m519(ZoneOffset.class), 1).m4828();
            }
            if (cls == OffsetTime.class) {
                C2392 c2392 = C1787.f9026;
                return new C0148(c0114.m519(LocalTime.class), c0114.m519(ZoneOffset.class), 1).m4828();
            }
            if (cls == Period.class) {
                return C1787.f9031;
            }
            if (cls == Year.class) {
                return C1787.f9028;
            }
            if (cls == YearMonth.class) {
                return C1787.f9023;
            }
            if (cls == ZoneId.class || cls == ZoneOffset.class) {
                return C1787.f9024;
            }
            if (cls == ZonedDateTime.class) {
                return new C1627(C1787.m3572(c0114), c0114.m519(ZoneOffset.class), c0114.m519(ZoneId.class), 0).m4828();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0727 m3572(C0114 c0114) {
        return new C0148(c0114.m519(LocalDate.class), c0114.m519(LocalTime.class), 0).m4828();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m3573(Serializable serializable, String str, C1942 c1942) {
        if (serializable != null) {
            return;
        }
        StringBuilder sbM3998 = AbstractC2104.m3998("Missing ", str, " field; at path ");
        sbM3998.append(c1942.m3749(true));
        throw new C1600(sbM3998.toString());
    }
}
