package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Pe */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0666Pe {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: a */
    public final TimeUnit f2131a;

    EnumC0666Pe(TimeUnit timeUnit) {
        this.f2131a = timeUnit;
    }
}
