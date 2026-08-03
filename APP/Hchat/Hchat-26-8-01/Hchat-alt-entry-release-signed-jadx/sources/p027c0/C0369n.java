package p027c0;

import p011ab.C0041a;
import p014b.C0126e;
import p040d0.InterfaceC0647d;
import p057e1.C0808c;
import p100h0.C1551t0;
import p100h0.C1555v0;
import p100h0.C1557w0;
import p117i0.AbstractC1874r;
import p117i0.C1892x;
import p249qg.C3560e1;
import p308v1.InterfaceC4428t;
import p339x1.AbstractC5615j;
import p339x1.InterfaceC5609h;
import p372z.C6055c;

/* JADX INFO: renamed from: c0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0369n extends AbstractC5615j implements InterfaceC5609h, InterfaceC0647d {

    /* JADX INFO: renamed from: A */
    public C3560e1 f1034A;

    /* JADX INFO: renamed from: B */
    public final C1892x f1035B = AbstractC1874r.m4634p(new C0041a(this, 8));

    /* JADX INFO: renamed from: C */
    public C0808c f1036C = C0808c.f2415e;

    /* JADX INFO: renamed from: w */
    public C0126e f1037w;

    /* JADX INFO: renamed from: x */
    public C1555v0 f1038x;

    /* JADX INFO: renamed from: y */
    public C1557w0 f1039y;

    /* JADX INFO: renamed from: z */
    public C1551t0 f1040z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0369n(C0126e c0126e, C1555v0 c1555v0, C1557w0 c1557w0, C1551t0 c1551t0) {
        this.f1037w = c0126e;
        this.f1038x = c1555v0;
        this.f1039y = c1557w0;
        this.f1040z = c1551t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: E0 */
    public final long mo1315E0(InterfaceC4428t interfaceC4428t) {
        return mo1317w0(interfaceC4428t).m2048d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        C0126e c0126e = this.f1037w;
        c0126e.f333i = EnumC0370o.f1043i;
        c0126e.f332h = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C0126e c0126e = this.f1037w;
        c0126e.f333i = EnumC0370o.f1042h;
        c0126e.f332h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: j0 */
    public final C6055c mo1316j0() {
        return (C6055c) this.f1035B.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: w0 */
    public final C0808c mo1317w0(InterfaceC4428t interfaceC4428t) {
        if (!this.f23801t) {
            return this.f1036C;
        }
        C0808c c0808c = (C0808c) this.f1040z.invoke(interfaceC4428t);
        if (c0808c == null) {
            return this.f1036C;
        }
        this.f1036C = c0808c;
        return c0808c;
    }
}
