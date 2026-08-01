package p291;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8502 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final boolean f23623;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23624;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23625;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DateTimeFormatter f23626;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23627;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23628;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C8476 f23629;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean f23630;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC8502(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.Class r19, java.lang.Class r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22) {
        /*
            r12 = this;
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            r13 = 0
            if (r5 == 0) goto L87
            int r14 = r5.hashCode()
            r1 = 1
            r2 = -1
            switch(r14) {
                case -1074095546: goto L58;
                case -288020395: goto L4d;
                case -276306848: goto L42;
                case 1333195168: goto L37;
                case 1349114208: goto L2c;
                case 2095190916: goto L21;
                default: goto L20;
            }
        L20:
            goto L62
        L21:
            java.lang.String r14 = "iso8601"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L2a
            goto L62
        L2a:
            r2 = 5
            goto L62
        L2c:
            java.lang.String r14 = "yyyyMMddHHmmss"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L35
            goto L62
        L35:
            r2 = 4
            goto L62
        L37:
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L40
            goto L62
        L40:
            r2 = 3
            goto L62
        L42:
            java.lang.String r14 = "yyyyMMdd"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L4b
            goto L62
        L4b:
            r2 = 2
            goto L62
        L4d:
            java.lang.String r14 = "unixtime"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L56
            goto L62
        L56:
            r2 = r1
            goto L62
        L58:
            java.lang.String r14 = "millis"
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L61
            goto L62
        L61:
            r2 = r13
        L62:
            switch(r2) {
                case 0: goto L81;
                case 1: goto L7c;
                case 2: goto L77;
                case 3: goto L71;
                case 4: goto L6b;
                case 5: goto L66;
                default: goto L65;
            }
        L65:
            goto L87
        L66:
            r14 = r13
            r2 = r14
        L68:
            r3 = r2
            r4 = r3
            goto L8b
        L6b:
            r14 = r13
            r2 = r14
            r4 = r2
            r3 = r1
        L6f:
            r1 = r4
            goto L8b
        L71:
            r14 = r13
            r2 = r14
            r3 = r2
            r4 = r1
            r1 = r3
            goto L8b
        L77:
            r14 = r13
            r3 = r14
            r4 = r3
            r2 = r1
            goto L6f
        L7c:
            r2 = r13
            r3 = r2
            r4 = r3
            r14 = r1
            goto L6f
        L81:
            r14 = r13
            r2 = r14
            r3 = r2
            r4 = r3
            r13 = r1
            goto L6f
        L87:
            r14 = r13
            r1 = r14
            r2 = r1
            goto L68
        L8b:
            r12.f23625 = r13
            r12.f23628 = r1
            r12.f23630 = r14
            r12.f23627 = r2
            r12.f23623 = r3
            r12.f23624 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.AbstractC8502.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.Class, java.lang.Class, java.lang.reflect.Field, java.lang.reflect.Method):void");
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        if (cls != this.f23617) {
            return abstractC2897.m6077(cls);
        }
        C8539 c8539 = abstractC2897.f9178.f9154;
        C8476 c8476 = this.f23629;
        if (c8476 != null) {
            return c8476;
        }
        c8539.getClass();
        String str = this.f23614;
        if (str == null) {
            C8476 c84762 = C8476.f23518;
            this.f23629 = c84762;
            return c84762;
        }
        C8476 c84763 = new C8476(str, null);
        this.f23629 = c84763;
        return c84763;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14084(AbstractC2897 abstractC2897, long j) {
        String str;
        long j2;
        boolean z;
        AbstractC2897 abstractC28972;
        ZonedDateTime zonedDateTime;
        int year;
        if (abstractC2897.f9171) {
            m14078(abstractC2897);
            abstractC2897.mo6032(j);
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        boolean z2 = this.f23630;
        if (z2) {
            m14078(abstractC2897);
            abstractC2897.mo5963(j / 1000);
            return;
        }
        boolean z3 = this.f23625;
        if (z3 || (abstractC2897.m6078(this.f23611) & JSONWriter$Feature.WriterUtilDateAsMillis.mask) != 0) {
            m14078(abstractC2897);
            abstractC2897.mo5963(j);
            return;
        }
        ZoneId zoneIdM6025 = c2895.m6025();
        String str2 = this.f23614;
        String str3 = str2 != null ? str2 : null;
        boolean z4 = this.f23623;
        boolean z5 = this.f23624;
        if (str3 == null || z4 || z5) {
            long jFloorDiv = Math.floorDiv(j, 1000L);
            long jM5857 = jFloorDiv + ((long) ((zoneIdM6025 == AbstractC2866.f9026 || zoneIdM6025.getRules() == AbstractC2866.f9025) ? AbstractC2866.m5857(jFloorDiv) : zoneIdM6025.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds()));
            long jFloorDiv2 = Math.floorDiv(jM5857, 86400L);
            int iFloorMod = (int) Math.floorMod(jM5857, 86400L);
            long j3 = jFloorDiv2 + 719468;
            if (j3 < 0) {
                str = str2;
                long j4 = ((jFloorDiv2 + 719469) / 146097) - 1;
                j2 = j4 * 400;
                j3 += (-j4) * 146097;
            } else {
                str = str2;
                j2 = 0;
            }
            long j5 = ((j3 * 400) + 591) / 146097;
            long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
            if (j6 < 0) {
                j5--;
                j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
            }
            long j7 = j5 + j2;
            int i = (int) j6;
            int i2 = ((i * 5) + 2) / 153;
            int i3 = ((i2 + 2) % 12) + 1;
            int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
            z = z2;
            long j8 = j7 + ((long) (i2 / 10));
            if (j8 < -999999999 || j8 > 999999999) {
                throw new DateTimeException(AbstractC2442.m4583(j8, "Invalid year "));
            }
            int i5 = (int) j8;
            long j9 = iFloorMod;
            if (j9 < 0 || j9 > 86399) {
                throw new DateTimeException(AbstractC2442.m4583(j9, "Invalid secondOfDay "));
            }
            int i6 = (int) (j9 / 3600);
            long j10 = j9 - ((long) (i6 * 3600));
            int i7 = (int) (j10 / 60);
            int i8 = (int) (j10 - ((long) (i7 * 60)));
            if (i5 >= 0 && i5 <= 9999) {
                if (z4) {
                    m14078(abstractC2897);
                    abstractC2897.mo5981(i5, i3, i4, i6, i7, i8);
                    return;
                }
                if (z5) {
                    m14078(abstractC2897);
                    abstractC2897.mo5977(i5, i3, i4, i6, i7, i8);
                    return;
                }
                int iFloorMod2 = (int) Math.floorMod(j, 1000L);
                if (iFloorMod2 == 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo5977(i5, i3, i4, i6, i7, i8);
                    return;
                } else {
                    int totalSeconds = c2895.m6025().getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
                    m14078(abstractC2897);
                    abstractC2897.mo5978(i5, i3, i4, i6, i7, i8, iFloorMod2, totalSeconds, false);
                    return;
                }
            }
        } else {
            z = z2;
            str = str2;
        }
        m14078(abstractC2897);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), zoneIdM6025);
        boolean z6 = this.f23628;
        if (z6) {
            int year2 = zonedDateTimeOfInstant.getYear();
            if (year2 >= 0 && year2 <= 9999) {
                abstractC2897.mo5978(year2, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            } else {
                abstractC28972 = abstractC2897;
                zonedDateTime = zonedDateTimeOfInstant;
            }
        } else {
            zonedDateTime = zonedDateTimeOfInstant;
            abstractC28972 = abstractC2897;
        }
        if (this.f23627 && (year = zonedDateTime.getYear()) >= 0 && year <= 9999) {
            abstractC28972.mo5993(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth());
            return;
        }
        if (this.f23626 == null && str != null && !z3 && !z6 && !z) {
            this.f23626 = DateTimeFormatter.ofPattern(str);
        }
        DateTimeFormatter dateTimeFormatter = this.f23626;
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter == null ? null : dateTimeFormatter;
        if (dateTimeFormatter2 != null) {
            abstractC28972.mo6017(dateTimeFormatter2.format(zonedDateTime));
        } else {
            abstractC28972.mo6001(zonedDateTime);
        }
    }
}
