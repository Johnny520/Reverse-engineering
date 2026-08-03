package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1578F {

    /* JADX INFO: renamed from: a */
    public final String f5689a;

    /* JADX INFO: renamed from: b */
    public final Pattern f5690b;

    public C1578F(String r4) {
        this.f5689a = r4;
        Pattern r42 = Pattern.compile(r4);     // Catch: Throwable -> L5
    L6:
        this.f5690b = r42;
        return;
    L5:
        AbstractC2066z1.m4233b().mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", new Object[]{r4});
        r42 = null;
        goto L6
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (C1578F.class == r3.getClass()) goto L7;
        return false;
    L7:
        return Objects.equals(this.f5689a, ((C1578F) r3).f5689a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f5689a});
    }
}
