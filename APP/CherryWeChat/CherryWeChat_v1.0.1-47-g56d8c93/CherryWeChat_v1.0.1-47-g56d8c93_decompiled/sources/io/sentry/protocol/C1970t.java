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
    public static final C1970t f7011b = new C1970t("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a */
    public final C2032d f7012a;

    public C1970t() {
        this.f7012a = new C2032d(new C1676T(4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1970t.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f7012a.m4175a()).equals(((C1970t) obj).f7012a.m4175a());
    }

    public final int hashCode() {
        return ((String) this.f7012a.m4175a()).hashCode();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(toString());
    }

    public final String toString() {
        return (String) this.f7012a.m4175a();
    }

    public C1970t(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.f7012a = new C2032d(new C1597J2(this, str2));
        } else {
            this.f7012a = new C2032d(new C1597J2(str2, 0));
        }
    }
}
