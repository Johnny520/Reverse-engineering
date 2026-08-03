package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C1650Y1;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.protocol.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1968r implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6999a;

    /* JADX INFO: renamed from: b */
    public String f7000b;

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArraySet f7001c;

    /* JADX INFO: renamed from: d */
    public CopyOnWriteArraySet f7002d;

    /* JADX INFO: renamed from: e */
    public HashMap f7003e;

    public C1968r(String str, String str2) {
        this.f6999a = str;
        this.f7000b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1968r.class == obj.getClass()) {
            C1968r c1968r = (C1968r) obj;
            if (this.f6999a.equals(c1968r.f6999a) && this.f7000b.equals(c1968r.f7000b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6999a, this.f7000b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("name");
        c1901c.m4115z(this.f6999a);
        c1901c.m4106p("version");
        c1901c.m4115z(this.f7000b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f7001c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = C1650Y1.m3790d().f5898b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f7002d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = C1650Y1.m3790d().f5897a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            c1901c.m4106p("packages");
            c1901c.m4112w(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            c1901c.m4106p("integrations");
            c1901c.m4112w(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.f7003e;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7003e, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
