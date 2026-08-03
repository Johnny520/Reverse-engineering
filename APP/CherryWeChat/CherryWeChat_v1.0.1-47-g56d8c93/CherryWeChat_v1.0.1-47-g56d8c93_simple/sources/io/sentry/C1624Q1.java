package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624Q1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final String f5830a;

    /* JADX INFO: renamed from: b */
    public final Integer f5831b;

    /* JADX INFO: renamed from: c */
    public final String f5832c;

    /* JADX INFO: renamed from: d */
    public final String f5833d;

    /* JADX INFO: renamed from: e */
    public final EnumC1653Z1 f5834e;

    /* JADX INFO: renamed from: f */
    public final int f5835f;

    /* JADX INFO: renamed from: g */
    public final Callable f5836g;

    /* JADX INFO: renamed from: h */
    public final String f5837h;

    /* JADX INFO: renamed from: i */
    public HashMap f5838i;

    public C1624Q1(EnumC1653Z1 r1, int r2, String r3, String r4, String r5, String r6, Integer r7) {
        this.f5834e = r1;
        this.f5830a = r3;
        this.f5835f = r2;
        this.f5832c = r4;
        this.f5836g = null;
        this.f5837h = r5;
        this.f5833d = r6;
        this.f5831b = r7;
    }

    /* JADX INFO: renamed from: a */
    public final int m3737a() {
        Callable r0 = this.f5836g;
        if (r0 == null) goto L9;
        return ((Integer) r0.call()).intValue();
    L6:
        return -1;
    L9:
        return this.f5835f;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        String r0 = this.f5830a;
        if (r0 == null) goto L5;
        r42.m4106p("content_type");
        r42.m4115z(r0);
    L5:
        String r02 = this.f5832c;
        if (r02 == null) goto L8;
        r42.m4106p("filename");
        r42.m4115z(r02);
    L8:
        r42.m4106p("type");
        r42.m4112w(r5, this.f5834e);
        String r03 = this.f5837h;
        if (r03 == null) goto L11;
        r42.m4106p("attachment_type");
        r42.m4115z(r03);
    L11:
        String r04 = this.f5833d;
        if (r04 == null) goto L14;
        r42.m4106p("platform");
        r42.m4115z(r04);
    L14:
        Integer r05 = this.f5831b;
        if (r05 == null) goto L17;
        r42.m4106p("item_count");
        r42.m4114y(r05);
    L17:
        r42.m4106p("length");
        r42.m4111v(m3737a());
        HashMap r06 = this.f5838i;
        if (r06 == null) goto L23;
        Iterator r07 = r06.keySet().iterator();
    L21:
        if (r07.hasNext() == false) goto L23;
        String r1 = (String) r07.next();
        AbstractC1861d.m4086a(this.f5838i, r1, r42, r1, r5);
    L23:
        r42.m4102k();
    }

    public C1624Q1(EnumC1653Z1 r9, Callable r10, String r11, String r12, String r13) {
        this(r9, r10, r11, r12, r13, null, null);
    }

    public C1624Q1(EnumC1653Z1 r2, Callable r3, String r4, String r5, String r6, String r7, Integer r8) {
        AbstractC1856a.m4048D("type is required", r2);
        this.f5834e = r2;
        this.f5830a = r4;
        this.f5835f = -1;
        this.f5832c = r5;
        this.f5836g = r3;
        this.f5837h = r6;
        this.f5833d = r7;
        this.f5831b = r8;
    }
}
