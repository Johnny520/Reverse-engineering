package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1828b2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public int f6605a;

    /* JADX INFO: renamed from: b */
    public String f6606b;

    /* JADX INFO: renamed from: c */
    public String f6607c;

    /* JADX INFO: renamed from: d */
    public String f6608d;

    /* JADX INFO: renamed from: e */
    public Long f6609e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6610f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1828b2.class != obj.getClass()) {
            return false;
        }
        return AbstractC1856a.m4063i(this.f6606b, ((C1828b2) obj).f6606b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6606b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("type");
        c1901c.m4111v(this.f6605a);
        if (this.f6606b != null) {
            c1901c.m4106p("address");
            c1901c.m4115z(this.f6606b);
        }
        if (this.f6607c != null) {
            c1901c.m4106p("package_name");
            c1901c.m4115z(this.f6607c);
        }
        if (this.f6608d != null) {
            c1901c.m4106p("class_name");
            c1901c.m4115z(this.f6608d);
        }
        if (this.f6609e != null) {
            c1901c.m4106p("thread_id");
            c1901c.m4114y(this.f6609e);
        }
        ConcurrentHashMap concurrentHashMap = this.f6610f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6610f, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
