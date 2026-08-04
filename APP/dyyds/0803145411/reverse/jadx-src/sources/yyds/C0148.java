package yyds;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

/* JADX INFO: renamed from: yyds.ᛱᛶᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0148 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f925;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f926;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f927;

    public /* synthetic */ C0148(AbstractC2720 abstractC2720, AbstractC2720 abstractC27202, int i) {
        this.f925 = i;
        this.f926 = abstractC2720;
        this.f927 = abstractC27202;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        int i = this.f925;
        AbstractC2720 abstractC2720 = this.f927;
        AbstractC2720 abstractC27202 = this.f926;
        LocalDate localDate = null;
        LocalTime localTime = null;
        switch (i) {
            case 0:
                c1942.m3769();
                LocalTime localTime2 = null;
                while (c1942.m3744() != 4) {
                    String strM3741 = c1942.m3741();
                    if (strM3741.equals("date")) {
                        localDate = (LocalDate) abstractC27202.mo484(c1942);
                    } else if (strM3741.equals("time")) {
                        localTime2 = (LocalTime) abstractC2720.mo484(c1942);
                    } else {
                        c1942.m3754();
                    }
                }
                c1942.m3768();
                C1787.m3573(localDate, "date", c1942);
                C1787.m3573(localTime2, "time", c1942);
                return LocalDateTime.of(localDate, localTime2);
            default:
                c1942.m3769();
                ZoneOffset zoneOffset = null;
                while (c1942.m3744() != 4) {
                    String strM37412 = c1942.m3741();
                    if (strM37412.equals("offset")) {
                        zoneOffset = (ZoneOffset) abstractC2720.mo484(c1942);
                    } else if (strM37412.equals("time")) {
                        localTime = (LocalTime) abstractC27202.mo484(c1942);
                    } else {
                        c1942.m3754();
                    }
                }
                c1942.m3768();
                C1787.m3573(localTime, "time", c1942);
                C1787.m3573(zoneOffset, "offset", c1942);
                return OffsetTime.of(localTime, zoneOffset);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        int i = this.f925;
        AbstractC2720 abstractC2720 = this.f927;
        AbstractC2720 abstractC27202 = this.f926;
        switch (i) {
            case 0:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                c1405.m2858();
                c1405.m2856("date");
                abstractC27202.mo485(c1405, localDateTime.toLocalDate());
                c1405.m2856("time");
                abstractC2720.mo485(c1405, localDateTime.toLocalTime());
                c1405.m2865();
                break;
            default:
                OffsetTime offsetTime = (OffsetTime) obj;
                c1405.m2858();
                c1405.m2856("time");
                abstractC27202.mo485(c1405, offsetTime.toLocalTime());
                c1405.m2856("offset");
                abstractC2720.mo485(c1405, offsetTime.getOffset());
                c1405.m2865();
                break;
        }
    }
}
