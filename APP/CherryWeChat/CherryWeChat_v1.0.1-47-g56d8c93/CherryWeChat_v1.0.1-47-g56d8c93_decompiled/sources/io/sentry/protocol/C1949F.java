package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.protocol.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1949F implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final String f6857a;

    /* JADX INFO: renamed from: b */
    public final List f6858b;

    /* JADX INFO: renamed from: c */
    public HashMap f6859c;

    public C1949F(String str, List list) {
        this.f6857a = str;
        this.f6858b = list;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        String str = this.f6857a;
        if (str != null) {
            c1901c.m4106p("rendering_system");
            c1901c.m4115z(str);
        }
        List list = this.f6858b;
        if (list != null) {
            c1901c.m4106p("windows");
            c1901c.m4112w(iLogger, list);
        }
        HashMap map = this.f6859c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC1861d.m4086a(this.f6859c, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
