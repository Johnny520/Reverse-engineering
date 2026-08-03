package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.protocol.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1950G implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6860a;

    /* JADX INFO: renamed from: b */
    public String f6861b;

    /* JADX INFO: renamed from: c */
    public String f6862c;

    /* JADX INFO: renamed from: d */
    public String f6863d;

    /* JADX INFO: renamed from: e */
    public Double f6864e;

    /* JADX INFO: renamed from: f */
    public Double f6865f;

    /* JADX INFO: renamed from: g */
    public Double f6866g;

    /* JADX INFO: renamed from: h */
    public Double f6867h;

    /* JADX INFO: renamed from: i */
    public String f6868i;

    /* JADX INFO: renamed from: j */
    public Double f6869j;

    /* JADX INFO: renamed from: k */
    public List f6870k;

    /* JADX INFO: renamed from: l */
    public HashMap f6871l;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6860a != null) {
            c1901c.m4106p("rendering_system");
            c1901c.m4115z(this.f6860a);
        }
        if (this.f6861b != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.f6861b);
        }
        if (this.f6862c != null) {
            c1901c.m4106p("identifier");
            c1901c.m4115z(this.f6862c);
        }
        if (this.f6863d != null) {
            c1901c.m4106p("tag");
            c1901c.m4115z(this.f6863d);
        }
        if (this.f6864e != null) {
            c1901c.m4106p("width");
            c1901c.m4114y(this.f6864e);
        }
        if (this.f6865f != null) {
            c1901c.m4106p("height");
            c1901c.m4114y(this.f6865f);
        }
        if (this.f6866g != null) {
            c1901c.m4106p("x");
            c1901c.m4114y(this.f6866g);
        }
        if (this.f6867h != null) {
            c1901c.m4106p("y");
            c1901c.m4114y(this.f6867h);
        }
        if (this.f6868i != null) {
            c1901c.m4106p("visibility");
            c1901c.m4115z(this.f6868i);
        }
        if (this.f6869j != null) {
            c1901c.m4106p("alpha");
            c1901c.m4114y(this.f6869j);
        }
        List list = this.f6870k;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("children");
            c1901c.m4112w(iLogger, this.f6870k);
        }
        HashMap map = this.f6871l;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6871l, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
