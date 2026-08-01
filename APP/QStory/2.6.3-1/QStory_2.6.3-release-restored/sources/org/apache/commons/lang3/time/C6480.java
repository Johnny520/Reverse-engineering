package org.apache.commons.lang3.time;

import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.AbstractC6523;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Locale f15893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeZone f15895;

    public C6480(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.f15895 = timeZone;
        if (z) {
            this.f15894 = Integer.MIN_VALUE | i;
        } else {
            this.f15894 = i;
        }
        int i2 = AbstractC6523.f15971;
        this.f15893 = locale == null ? Locale.getDefault() : locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6480) {
            C6480 c6480 = (C6480) obj;
            if (this.f15895.equals(c6480.f15895) && this.f15894 == c6480.f15894 && this.f15893.equals(c6480.f15893)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15895.hashCode() + ((this.f15893.hashCode() + (this.f15894 * 31)) * 31);
    }
}
