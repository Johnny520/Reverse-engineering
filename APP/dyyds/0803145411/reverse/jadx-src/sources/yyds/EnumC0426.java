package yyds;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛲᛸᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0426 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTES(TimeUnit.MINUTES),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS(TimeUnit.HOURS),
    /* JADX INFO: Fake field, exist only in values array */
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final TimeUnit f2176;

    EnumC0426(TimeUnit timeUnit) {
        this.f2176 = timeUnit;
    }
}
