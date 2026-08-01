package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class GmtTimeZone extends TimeZone {
    private static final int HOURS_PER_DAY = 24;
    private static final int MILLISECONDS_PER_MINUTE = 60000;
    private static final int MINUTES_PER_HOUR = 60;
    static final long serialVersionUID = 1;
    private final int offset;
    private final String zoneId;

    public GmtTimeZone(boolean z, int i, int i2) {
        if (i >= 24) {
            C5553.m10812(i, " hours out of range");
            throw null;
        }
        if (i2 >= 60) {
            C5553.m10812(i2, " minutes out of range");
            throw null;
        }
        int iM4561 = AbstractC2442.m4561(i, 60, i2, MILLISECONDS_PER_MINUTE);
        this.offset = z ? -iM4561 : iM4561;
        StringBuilder sb = new StringBuilder(9);
        sb.append("GMT");
        sb.append(z ? SignatureVisitor.SUPER : SignatureVisitor.EXTENDS);
        StringBuilder sbTwoDigits = twoDigits(sb, i);
        sbTwoDigits.append(':');
        this.zoneId = twoDigits(sbTwoDigits, i2).toString();
    }

    private static StringBuilder twoDigits(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        return sb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmtTimeZone)) {
            return false;
        }
        GmtTimeZone gmtTimeZone = (GmtTimeZone) obj;
        return this.offset == gmtTimeZone.offset && Objects.equals(this.zoneId, gmtTimeZone.zoneId);
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.zoneId;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.offset;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.offset), this.zoneId);
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[GmtTimeZone id=\"");
        sb.append(this.zoneId);
        sb.append("\",offset=");
        return AbstractC0053.m154(sb, this.offset, ']');
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
