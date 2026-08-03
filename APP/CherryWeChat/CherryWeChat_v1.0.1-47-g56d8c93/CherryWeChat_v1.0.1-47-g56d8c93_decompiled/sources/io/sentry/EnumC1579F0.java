package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.F0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1579F0 implements InterfaceC1583G0 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    @Override // io.sentry.InterfaceC1583G0
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
