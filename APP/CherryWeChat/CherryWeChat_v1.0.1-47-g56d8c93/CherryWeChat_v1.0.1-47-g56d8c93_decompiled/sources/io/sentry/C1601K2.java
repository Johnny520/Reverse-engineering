package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2032d;
import java.util.Objects;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1601K2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: b */
    public static final C1601K2 f5780b = new C1601K2("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a */
    public final C2032d f5781a;

    public C1601K2(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f5781a = new C2032d(new C1597J2(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1601K2.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f5781a.m4175a()).equals(((C1601K2) obj).f5781a.m4175a());
    }

    public final int hashCode() {
        return ((String) this.f5781a.m4175a()).hashCode();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z((String) this.f5781a.m4175a());
    }

    public final String toString() {
        return (String) this.f5781a.m4175a();
    }

    public C1601K2() {
        this.f5781a = new C2032d(new C2438r1(22));
    }
}
