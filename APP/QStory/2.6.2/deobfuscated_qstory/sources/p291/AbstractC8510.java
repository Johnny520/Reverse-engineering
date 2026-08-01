package p291;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8510 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final boolean f23632;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23633;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23634;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public DateTimeFormatter f23635;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23636;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23637;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public C8484 f23638;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean f23639;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC8510(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.Class r19, java.lang.Class r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22) {
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
            r12.f23634 = r13
            r12.f23637 = r1
            r12.f23639 = r14
            r12.f23636 = r2
            r12.f23632 = r3
            r12.f23633 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.AbstractC8510.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.Class, java.lang.Class, java.lang.reflect.Field, java.lang.reflect.Method):void");
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        if (cls != this.f23626) {
            return abstractC2896.m6031(cls);
        }
        C8547 c8547 = abstractC2896.f9176.f9152;
        C8484 c8484 = this.f23638;
        if (c8484 != null) {
            return c8484;
        }
        c8547.getClass();
        String str = this.f23623;
        if (str == null) {
            C8484 c84842 = C8484.f23527;
            this.f23638 = c84842;
            return c84842;
        }
        C8484 c84843 = new C8484(str, null);
        this.f23638 = c84843;
        return c84843;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14065(AbstractC2896 abstractC2896, long j) {
        String str;
        long j2;
        boolean z;
        AbstractC2896 abstractC28962;
        ZonedDateTime zonedDateTime;
        int year;
        if (abstractC2896.f9169) {
            m14059(abstractC2896);
            abstractC2896.mo5987(j);
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        boolean z2 = this.f23639;
        if (z2) {
            m14059(abstractC2896);
            abstractC2896.mo5918(j / 1000);
            return;
        }
        boolean z3 = this.f23634;
        if (z3 || (abstractC2896.m6032(this.f23620) & JSONWriter$Feature.WriterUtilDateAsMillis.mask) != 0) {
            m14059(abstractC2896);
            abstractC2896.mo5918(j);
            return;
        }
        ZoneId zoneIdM5980 = c2894.m5980();
        String str2 = this.f23623;
        String str3 = str2 != null ? str2 : null;
        boolean z4 = this.f23632;
        boolean z5 = this.f23633;
        if (str3 == null || z4 || z5) {
            long jFloorDiv = Math.floorDiv(j, 1000L);
            long jM5812 = jFloorDiv + ((long) ((zoneIdM5980 == AbstractC2865.f9024 || zoneIdM5980.getRules() == AbstractC2865.f9023) ? AbstractC2865.m5812(jFloorDiv) : zoneIdM5980.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds()));
            long jFloorDiv2 = Math.floorDiv(jM5812, 86400L);
            int iFloorMod = (int) Math.floorMod(jM5812, 86400L);
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
                throw new DateTimeException(AbstractC2442.m4572(j8, "Invalid year "));
            }
            int i5 = (int) j8;
            long j9 = iFloorMod;
            if (j9 < 0 || j9 > 86399) {
                throw new DateTimeException(AbstractC2442.m4572(j9, "Invalid secondOfDay "));
            }
            int i6 = (int) (j9 / 3600);
            long j10 = j9 - ((long) (i6 * 3600));
            int i7 = (int) (j10 / 60);
            int i8 = (int) (j10 - ((long) (i7 * 60)));
            if (i5 >= 0 && i5 <= 9999) {
                if (z4) {
                    m14059(abstractC2896);
                    abstractC2896.mo5936(i5, i3, i4, i6, i7, i8);
                    return;
                }
                if (z5) {
                    m14059(abstractC2896);
                    abstractC2896.mo5932(i5, i3, i4, i6, i7, i8);
                    return;
                }
                int iFloorMod2 = (int) Math.floorMod(j, 1000L);
                if (iFloorMod2 == 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5932(i5, i3, i4, i6, i7, i8);
                    return;
                } else {
                    int totalSeconds = c2894.m5980().getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
                    m14059(abstractC2896);
                    abstractC2896.mo5933(i5, i3, i4, i6, i7, i8, iFloorMod2, totalSeconds, false);
                    return;
                }
            }
        } else {
            z = z2;
            str = str2;
        }
        m14059(abstractC2896);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), zoneIdM5980);
        boolean z6 = this.f23637;
        if (z6) {
            int year2 = zonedDateTimeOfInstant.getYear();
            if (year2 >= 0 && year2 <= 9999) {
                abstractC2896.mo5933(year2, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            } else {
                abstractC28962 = abstractC2896;
                zonedDateTime = zonedDateTimeOfInstant;
            }
        } else {
            zonedDateTime = zonedDateTimeOfInstant;
            abstractC28962 = abstractC2896;
        }
        if (this.f23636 && (year = zonedDateTime.getYear()) >= 0 && year <= 9999) {
            abstractC28962.mo5948(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth());
            return;
        }
        if (this.f23635 == null && str != null && !z3 && !z6 && !z) {
            this.f23635 = DateTimeFormatter.ofPattern(str);
        }
        DateTimeFormatter dateTimeFormatter = this.f23635;
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter == null ? null : dateTimeFormatter;
        if (dateTimeFormatter2 != null) {
            abstractC28962.mo5972(dateTimeFormatter2.format(zonedDateTime));
        } else {
            abstractC28962.mo5956(zonedDateTime);
        }
    }
}
