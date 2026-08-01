package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Locale f15568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f15569;

    static {
        new C5662(Calendar.getInstance(), Locale.getDefault());
    }

    public C5662(Calendar calendar, Locale locale) {
        Objects.requireNonNull(calendar, "calendar");
        this.f15569 = calendar;
        Objects.requireNonNull(locale, "locale");
        this.f15568 = locale;
    }
}
