package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
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

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C1828b2.class == r3.getClass()) goto L10;
        return false;
    L10:
        return AbstractC1856a.m4063i(this.f6606b, ((C1828b2) r3).f6606b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6606b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4111v(this.f6605a);
        if (this.f6606b == null) goto L6;
        r42.m4106p("address");
        r42.m4115z(this.f6606b);
    L6:
        if (this.f6607c == null) goto L9;
        r42.m4106p("package_name");
        r42.m4115z(this.f6607c);
    L9:
        if (this.f6608d == null) goto L12;
        r42.m4106p("class_name");
        r42.m4115z(this.f6608d);
    L12:
        if (this.f6609e == null) goto L14;
        r42.m4106p("thread_id");
        r42.m4114y(this.f6609e);
    L14:
        ConcurrentHashMap r0 = this.f6610f;
        if (r0 == null) goto L20;
        Iterator r02 = r0.keySet().iterator();
    L18:
        if (r02.hasNext() == false) goto L20;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6610f, r1, r42, r1, r5);
    L20:
        r42.m4102k();
    }
}
