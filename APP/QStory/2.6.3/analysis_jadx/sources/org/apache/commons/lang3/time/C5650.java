package org.apache.commons.lang3.time;

import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.AbstractC5693;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Locale f15548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeZone f15550;

    public C5650(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.f15550 = timeZone;
        if (z) {
            this.f15549 = Integer.MIN_VALUE | i;
        } else {
            this.f15549 = i;
        }
        int i2 = AbstractC5693.f15626;
        this.f15548 = locale == null ? Locale.getDefault() : locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5650) {
            C5650 c5650 = (C5650) obj;
            if (this.f15550.equals(c5650.f15550) && this.f15549 == c5650.f15549 && this.f15548.equals(c5650.f15548)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15550.hashCode() + ((this.f15548.hashCode() + (this.f15549 * 31)) * 31);
    }
}
