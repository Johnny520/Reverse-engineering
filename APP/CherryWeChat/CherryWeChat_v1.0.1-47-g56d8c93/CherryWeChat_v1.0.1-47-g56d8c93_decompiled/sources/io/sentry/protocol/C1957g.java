package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.protocol.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1957g implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6929a;

    /* JADX INFO: renamed from: b */
    public String f6930b;

    /* JADX INFO: renamed from: c */
    public String f6931c;

    /* JADX INFO: renamed from: d */
    public C1970t f6932d;

    /* JADX INFO: renamed from: e */
    public C1970t f6933e;

    /* JADX INFO: renamed from: f */
    public String f6934f;

    /* JADX INFO: renamed from: g */
    public AbstractMap f6935g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1957g)) {
            return false;
        }
        C1957g c1957g = (C1957g) obj;
        return AbstractC1856a.m4063i(this.f6929a, c1957g.f6929a) && AbstractC1856a.m4063i(this.f6930b, c1957g.f6930b) && AbstractC1856a.m4063i(this.f6931c, c1957g.f6931c) && AbstractC1856a.m4063i(this.f6932d, c1957g.f6932d) && AbstractC1856a.m4063i(this.f6933e, c1957g.f6933e) && AbstractC1856a.m4063i(this.f6934f, c1957g.f6934f) && AbstractC1856a.m4063i(this.f6935g, c1957g.f6935g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6929a, this.f6930b, this.f6931c, this.f6932d, this.f6933e, this.f6934f, this.f6935g});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("message");
        c1901c.m4115z(this.f6929a);
        if (this.f6930b != null) {
            c1901c.m4106p("contact_email");
            c1901c.m4115z(this.f6930b);
        }
        if (this.f6931c != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6931c);
        }
        if (this.f6932d != null) {
            c1901c.m4106p("associated_event_id");
            this.f6932d.serialize(c1901c, iLogger);
        }
        if (this.f6933e != null) {
            c1901c.m4106p("replay_id");
            this.f6933e.serialize(c1901c, iLogger);
        }
        if (this.f6934f != null) {
            c1901c.m4106p("url");
            c1901c.m4115z(this.f6934f);
        }
        AbstractMap abstractMap = this.f6935g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.f6935g.get(str);
                c1901c.m4106p(str);
                c1901c.m4112w(iLogger, obj);
            }
        }
        c1901c.m4102k();
    }

    public final String toString() {
        return "Feedback{message='" + this.f6929a + "', contactEmail='" + this.f6930b + "', name='" + this.f6931c + "', associatedEventId=" + this.f6932d + ", replayId=" + this.f6933e + ", url='" + this.f6934f + "', unknown=" + this.f6935g + '}';
    }
}
