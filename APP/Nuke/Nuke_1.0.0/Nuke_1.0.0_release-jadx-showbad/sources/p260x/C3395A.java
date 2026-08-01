package p260x;

import p095T.AbstractC1385s;
import p095T.C1366i0;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: x.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3395A {

    /* JADX INFO: renamed from: a */
    public final Object f10619a;

    /* JADX INFO: renamed from: b */
    public final C3396B f10620b;

    /* JADX INFO: renamed from: d */
    public int f10622d;

    /* JADX INFO: renamed from: e */
    public C3395A f10623e;

    /* JADX INFO: renamed from: f */
    public boolean f10624f;

    /* JADX INFO: renamed from: c */
    public int f10621c = -1;

    /* JADX INFO: renamed from: g */
    public final C1366i0 f10625g = AbstractC1385s.m2629s(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3395A(Object obj, C3396B c3396b) {
        this.f10619a = obj;
        this.f10620b = c3396b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3395A m5671a() {
        if (this.f10624f) {
            AbstractC3204b.m5477c("Pin should not be called on an already disposed item ");
        }
        if (this.f10622d == 0) {
            this.f10620b.f10626d.add(this);
            C3395A c3395a = (C3395A) this.f10625g.getValue();
            if (c3395a != null) {
                c3395a.m5671a();
            } else {
                c3395a = null;
            }
            this.f10623e = c3395a;
        }
        this.f10622d++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5672b() {
        if (this.f10624f) {
            return;
        }
        if (this.f10622d <= 0) {
            AbstractC3204b.m5477c("Release should only be called once");
        }
        int i5 = this.f10622d - 1;
        this.f10622d = i5;
        if (i5 == 0) {
            this.f10620b.f10626d.remove(this);
            C3395A c3395a = this.f10623e;
            if (c3395a != null) {
                c3395a.m5672b();
            }
            this.f10623e = null;
        }
    }
}
