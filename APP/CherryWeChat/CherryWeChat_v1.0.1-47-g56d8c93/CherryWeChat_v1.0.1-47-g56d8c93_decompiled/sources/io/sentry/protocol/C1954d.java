package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C2046v2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.protocol.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1954d implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public C1967q f6891a;

    /* JADX INFO: renamed from: b */
    public List f6892b;

    /* JADX INFO: renamed from: c */
    public HashMap f6893c;

    /* JADX INFO: renamed from: a */
    public static C1954d m4153a(C1954d c1954d, C2046v2 c2046v2) {
        ArrayList arrayList = new ArrayList();
        if (c2046v2.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c2046v2.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c2046v2.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c1954d == null) {
            c1954d = new C1954d();
        }
        List list = c1954d.f6892b;
        if (list == null) {
            c1954d.f6892b = new ArrayList(arrayList);
            return c1954d;
        }
        list.addAll(arrayList);
        return c1954d;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6891a != null) {
            c1901c.m4106p("sdk_info");
            c1901c.m4112w(iLogger, this.f6891a);
        }
        if (this.f6892b != null) {
            c1901c.m4106p("images");
            c1901c.m4112w(iLogger, this.f6892b);
        }
        HashMap map = this.f6893c;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6893c, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
