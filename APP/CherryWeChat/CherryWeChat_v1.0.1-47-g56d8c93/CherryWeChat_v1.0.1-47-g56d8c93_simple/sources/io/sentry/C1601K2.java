package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2032d;
import java.util.Objects;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1601K2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: b */
    public static final C1601K2 f5780b = null;

    /* JADX INFO: renamed from: a */
    public final C2032d f5781a;

    static {
        f5780b = new C1601K2("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    }

    public C1601K2(String r4) {
        Objects.requireNonNull(r4, "value is required");
        this.f5781a = new C2032d(new C1597J2(r4, 0));
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C1601K2.class == r3.getClass()) goto L10;
        return false;
    L10:
        return ((String) this.f5781a.m4175a()).equals(((C1601K2) r3).f5781a.m4175a());
    }

    public final int hashCode() {
        return ((String) this.f5781a.m4175a()).hashCode();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r1, ILogger r2) {
        C1901c r12 = (C1901c) r1;
        r12.m4115z((String) this.f5781a.m4175a());
    }

    public final String toString() {
        return (String) this.f5781a.m4175a();
    }

    public C1601K2() {
        this.f5781a = new C2032d(new C2438r1(22));
    }
}
