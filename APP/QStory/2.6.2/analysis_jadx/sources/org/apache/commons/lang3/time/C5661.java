package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Locale f15568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f15569;

    static {
        new C5661(Calendar.getInstance(), Locale.getDefault());
    }

    public C5661(Calendar calendar, Locale locale) {
        Objects.requireNonNull(calendar, "calendar");
        this.f15569 = calendar;
        Objects.requireNonNull(locale, "locale");
        this.f15568 = locale;
    }
}
