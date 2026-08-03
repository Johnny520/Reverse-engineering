package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.vendor.gson.stream.C2051c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927m1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public Integer f6817a;

    /* JADX INFO: renamed from: b */
    public List f6818b;

    /* JADX INFO: renamed from: c */
    public HashMap f6819c;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C1927m1.class != r5.getClass()) goto L15;
        C1927m1 r52 = (C1927m1) r5;
        if (AbstractC1856a.m4063i(this.f6817a, r52.f6817a) == false) goto L15;
        if (AbstractC1856a.m4063i(this.f6818b, r52.f6818b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6817a, this.f6818b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r5, ILogger r6) {
        C1901c r52 = (C1901c) r5;
        r52.m4101h();
        C2051c r0 = (C2051c) r52.f6781b;
        if (this.f6817a == null) goto L5;
        r52.m4106p("segment_id");
        r52.m4114y(this.f6817a);
    L5:
        HashMap r1 = this.f6819c;
        if (r1 == null) goto L11;
        Iterator r12 = r1.keySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        String r2 = (String) r12.next();
        AbstractC1861d.m4086a(this.f6819c, r2, r52, r2, r6);
    L11:
        r52.m4102k();
        r0.f7268f = true;
        if (this.f6817a == null) goto L14;
        r0.m4223p();
        r0.m4217d();
        r0.f7263a.append("\n");
    L14:
        List r13 = this.f6818b;
        if (r13 == null) goto L17;
        r52.m4112w(r6, r13);
    L17:
        r0.f7268f = false;
    }
}
