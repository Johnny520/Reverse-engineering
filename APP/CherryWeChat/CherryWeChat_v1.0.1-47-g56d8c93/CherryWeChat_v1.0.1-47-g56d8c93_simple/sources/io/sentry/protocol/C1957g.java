package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;

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

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C1957g) == false) goto L32;
        C1957g r32 = (C1957g) r3;
        if (AbstractC1856a.m4063i(this.f6929a, r32.f6929a) == true) goto L10;
        return false;
    L10:
        if (AbstractC1856a.m4063i(this.f6930b, r32.f6930b) == true) goto L12;
        return false;
    L12:
        if (AbstractC1856a.m4063i(this.f6931c, r32.f6931c) == true) goto L14;
        return false;
    L14:
        if (AbstractC1856a.m4063i(this.f6932d, r32.f6932d) == true) goto L16;
        return false;
    L16:
        if (AbstractC1856a.m4063i(this.f6933e, r32.f6933e) == true) goto L18;
        return false;
    L18:
        if (AbstractC1856a.m4063i(this.f6934f, r32.f6934f) == true) goto L20;
        return false;
    L20:
        if (AbstractC1856a.m4063i(this.f6935g, r32.f6935g) == false) goto L31;
        return true;
    L31:
        return false;
    L32:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6929a, this.f6930b, this.f6931c, this.f6932d, this.f6933e, this.f6934f, this.f6935g});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("message");
        r42.m4115z(this.f6929a);
        if (this.f6930b == null) goto L6;
        r42.m4106p("contact_email");
        r42.m4115z(this.f6930b);
    L6:
        if (this.f6931c == null) goto L9;
        r42.m4106p("name");
        r42.m4115z(this.f6931c);
    L9:
        if (this.f6932d == null) goto L12;
        r42.m4106p("associated_event_id");
        this.f6932d.serialize(r42, r5);
    L12:
        if (this.f6933e == null) goto L15;
        r42.m4106p("replay_id");
        this.f6933e.serialize(r42, r5);
    L15:
        if (this.f6934f == null) goto L17;
        r42.m4106p("url");
        r42.m4115z(this.f6934f);
    L17:
        AbstractMap r0 = this.f6935g;
        if (r0 == null) goto L23;
        Iterator r02 = r0.keySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L23;
        String r1 = (String) r02.next();
        Object r2 = this.f6935g.get(r1);
        r42.m4106p(r1);
        r42.m4112w(r5, r2);
    L23:
        r42.m4102k();
    }

    public final String toString() {
        return "Feedback{message='" + this.f6929a + "', contactEmail='" + this.f6930b + "', name='" + this.f6931c + "', associatedEventId=" + this.f6932d + ", replayId=" + this.f6933e + ", url='" + this.f6934f + "', unknown=" + this.f6935g + '}';
    }
}
