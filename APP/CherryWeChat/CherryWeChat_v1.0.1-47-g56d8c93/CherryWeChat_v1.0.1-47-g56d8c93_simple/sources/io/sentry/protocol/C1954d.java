package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C2046v2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
    public static C1954d m4153a(C1954d r4, C2046v2 r5) {
        ArrayList r0 = new ArrayList();
        if (r5.getProguardUuid() == null) goto L5;
        DebugImage r1 = new DebugImage();
        r1.setType(DebugImage.PROGUARD);
        r1.setUuid(r5.getProguardUuid());
        r0.add(r1);
    L5:
        Iterator<String> r52 = r5.getBundleIds().iterator();
    L7:
        if (r52.hasNext() == false) goto L10;
        String r12 = r52.next();
        DebugImage r2 = new DebugImage();
        r2.setType(DebugImage.JVM);
        r2.setDebugId(r12);
        r0.add(r2);
        goto L7
    L10:
        if (r0.isEmpty() == true) goto L19;
        if (r4 != null) goto L13;
        r4 = new C1954d();
    L13:
        List r53 = r4.f6892b;
        if (r53 != null) goto L17;
        r4.f6892b = new ArrayList(r0);
        return r4;
    L17:
        r53.addAll(r0);
        return r4;
    L19:
        return null;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6891a == null) goto L6;
        r42.m4106p("sdk_info");
        r42.m4112w(r5, this.f6891a);
    L6:
        if (this.f6892b == null) goto L8;
        r42.m4106p("images");
        r42.m4112w(r5, this.f6892b);
    L8:
        HashMap r0 = this.f6893c;
        if (r0 == null) goto L14;
        Iterator r02 = r0.keySet().iterator();
    L12:
        if (r02.hasNext() == false) goto L14;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6893c, r1, r42, r1, r5);
    L14:
        r42.m4102k();
    }
}
