package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;
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

    public C1624Q1(EnumC1653Z1 enumC1653Z1, int i, String str, String str2, String str3, String str4, Integer num) {
        this.f5834e = enumC1653Z1;
        this.f5830a = str;
        this.f5835f = i;
        this.f5832c = str2;
        this.f5836g = null;
        this.f5837h = str3;
        this.f5833d = str4;
        this.f5831b = num;
    }

    /* JADX INFO: renamed from: a */
    public final int m3737a() {
        Callable callable = this.f5836g;
        if (callable == null) {
            return this.f5835f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        String str = this.f5830a;
        if (str != null) {
            c1901c.m4106p("content_type");
            c1901c.m4115z(str);
        }
        String str2 = this.f5832c;
        if (str2 != null) {
            c1901c.m4106p("filename");
            c1901c.m4115z(str2);
        }
        c1901c.m4106p("type");
        c1901c.m4112w(iLogger, this.f5834e);
        String str3 = this.f5837h;
        if (str3 != null) {
            c1901c.m4106p("attachment_type");
            c1901c.m4115z(str3);
        }
        String str4 = this.f5833d;
        if (str4 != null) {
            c1901c.m4106p("platform");
            c1901c.m4115z(str4);
        }
        Integer num = this.f5831b;
        if (num != null) {
            c1901c.m4106p("item_count");
            c1901c.m4114y(num);
        }
        c1901c.m4106p("length");
        c1901c.m4111v(m3737a());
        HashMap map = this.f5838i;
        if (map != null) {
            for (String str5 : map.keySet()) {
                AbstractC1861d.m4086a(this.f5838i, str5, c1901c, str5, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1624Q1(EnumC1653Z1 enumC1653Z1, Callable callable, String str, String str2, String str3) {
        this(enumC1653Z1, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public C1624Q1(EnumC1653Z1 enumC1653Z1, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        AbstractC1856a.m4048D("type is required", enumC1653Z1);
        this.f5834e = enumC1653Z1;
        this.f5830a = str;
        this.f5835f = -1;
        this.f5832c = str2;
        this.f5836g = callable;
        this.f5837h = str3;
        this.f5833d = str4;
        this.f5831b = num;
    }
}
