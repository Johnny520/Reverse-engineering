package io.sentry.protocol;

import io.sentry.C1597J2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.android.core.C1676T;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2032d;

/* JADX INFO: renamed from: io.sentry.protocol.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1970t implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: b */
    public static final C1970t f7011b = null;

    /* JADX INFO: renamed from: a */
    public final C2032d f7012a;

    static {
        f7011b = new C1970t("00000000-0000-0000-0000-000000000000".replace("-", ""));
    }

    public C1970t() {
        this.f7012a = new C2032d(new C1676T(4));
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C1970t.class == r3.getClass()) goto L10;
        return false;
    L10:
        return ((String) this.f7012a.m4175a()).equals(((C1970t) r3).f7012a.m4175a());
    }

    public final int hashCode() {
        return ((String) this.f7012a.m4175a()).hashCode();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r1, ILogger r2) {
        C1901c r12 = (C1901c) r1;
        r12.m4115z(toString());
    }

    public final String toString() {
        return (String) this.f7012a.m4175a();
    }

    public C1970t(String r5) {
        if (r5.equals("0000-0000") == false) goto L5;
        String r0 = "00000000-0000-0000-0000-000000000000";
    L7:
        if (r0.length() == 32) goto L14;
        if (r0.length() == 36) goto L14;
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(r5));
    L14:
        if (r0.length() != 36) goto L17;
        this.f7012a = new C2032d(new C1597J2(this, r0));
        return;
    L17:
        this.f7012a = new C2032d(new C1597J2(r0, 0));
        return;
    L5:
        r0 = r5;
        goto L7
    }
}
