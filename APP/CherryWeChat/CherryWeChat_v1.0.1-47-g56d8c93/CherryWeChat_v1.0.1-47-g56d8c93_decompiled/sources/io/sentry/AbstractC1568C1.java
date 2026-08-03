package io.sentry;

import io.sentry.exception.C1869a;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.C1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1568C1 {

    /* JADX INFO: renamed from: a */
    public C1970t f5604a;

    /* JADX INFO: renamed from: b */
    public final C1953c f5605b;

    /* JADX INFO: renamed from: c */
    public C1968r f5606c;

    /* JADX INFO: renamed from: d */
    public C1964n f5607d;

    /* JADX INFO: renamed from: e */
    public AbstractMap f5608e;

    /* JADX INFO: renamed from: f */
    public String f5609f;

    /* JADX INFO: renamed from: g */
    public String f5610g;

    /* JADX INFO: renamed from: h */
    public String f5611h;

    /* JADX INFO: renamed from: i */
    public C1948E f5612i;

    /* JADX INFO: renamed from: j */
    public transient C1869a f5613j;

    /* JADX INFO: renamed from: k */
    public String f5614k;

    /* JADX INFO: renamed from: l */
    public String f5615l;

    /* JADX INFO: renamed from: m */
    public List f5616m;

    /* JADX INFO: renamed from: n */
    public C1954d f5617n;

    /* JADX INFO: renamed from: o */
    public AbstractMap f5618o;

    public AbstractC1568C1(C1970t c1970t) {
        this.f5605b = new C1953c();
        this.f5604a = c1970t;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m3605a() {
        C1869a c1869a = this.f5613j;
        return c1869a != null ? c1869a.f6705b : c1869a;
    }

    /* JADX INFO: renamed from: b */
    public final void m3606b(String str, String str2) {
        if (this.f5608e == null) {
            this.f5608e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f5608e.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f5608e;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public AbstractC1568C1() {
        this(new C1970t());
    }
}
