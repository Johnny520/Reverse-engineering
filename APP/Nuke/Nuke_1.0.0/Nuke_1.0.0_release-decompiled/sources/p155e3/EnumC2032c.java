package p155e3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2032c {
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


    /* JADX INFO: renamed from: d */
    public final TimeUnit f6773d;

    EnumC2032c(TimeUnit timeUnit) {
        this.f6773d = timeUnit;
    }
}
