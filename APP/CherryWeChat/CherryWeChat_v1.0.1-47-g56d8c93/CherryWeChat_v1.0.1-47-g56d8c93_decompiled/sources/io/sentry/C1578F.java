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

    public C1578F(String str) {
        Pattern patternCompile;
        this.f5689a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            AbstractC2066z1.m4233b().mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f5690b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C1578F.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5689a, ((C1578F) obj).f5689a);
    }

    public final int hashCode() {
        return Objects.hash(this.f5689a);
    }
}
