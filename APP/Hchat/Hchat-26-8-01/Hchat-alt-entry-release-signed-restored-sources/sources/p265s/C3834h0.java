package p265s;

import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p201o.AbstractC3026b;

/* JADX INFO: renamed from: s.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3834h0 {

    /* JADX INFO: renamed from: a */
    public final Object f12555a;

    /* JADX INFO: renamed from: b */
    public final C3838j0 f12556b;

    /* JADX INFO: renamed from: d */
    public int f12558d;

    /* JADX INFO: renamed from: e */
    public C3834h0 f12559e;

    /* JADX INFO: renamed from: f */
    public boolean f12560f;

    /* JADX INFO: renamed from: c */
    public int f12557c = -1;

    /* JADX INFO: renamed from: g */
    public final C1845j1 f12561g = AbstractC1874r.m4639u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3834h0(Object obj, C3838j0 c3838j0) {
        this.f12555a = obj;
        this.f12556b = c3838j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3834h0 m8012a() {
        if (this.f12560f) {
            AbstractC3026b.m6430c("Pin should not be called on an already disposed item ");
        }
        if (this.f12558d == 0) {
            this.f12556b.f12573g.add(this);
            C3834h0 c3834h0 = (C3834h0) this.f12561g.getValue();
            if (c3834h0 != null) {
                c3834h0.m8012a();
            } else {
                c3834h0 = null;
            }
            this.f12559e = c3834h0;
        }
        this.f12558d++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8013b() {
        if (this.f12560f) {
            return;
        }
        if (this.f12558d <= 0) {
            AbstractC3026b.m6430c("Release should only be called once");
        }
        int i9 = this.f12558d - 1;
        this.f12558d = i9;
        if (i9 == 0) {
            this.f12556b.f12573g.remove(this);
            C3834h0 c3834h0 = this.f12559e;
            if (c3834h0 != null) {
                c3834h0.m8013b();
            }
            this.f12559e = null;
        }
    }
}
