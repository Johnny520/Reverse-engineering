package p045d5;

import ac.C0058k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p005a5.C0016a;
import p020b5.C0184c;
import p020b5.C0187f;
import p020b5.C0189h;
import p020b5.C0190i;
import p021b6.C0198f;
import p061e5.C0826a;
import p164l5.C2481b0;
import p164l5.C2483c0;

/* JADX INFO: renamed from: d5.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699j extends C0694e {

    /* JADX INFO: renamed from: j */
    public final ArrayList f2114j;

    /* JADX INFO: renamed from: k */
    public final int f2115k;

    /* JADX INFO: renamed from: l */
    public final boolean f2116l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0699j(C0190i c0190i, int i9, C2483c0 c2483c0) {
        int iM5880a;
        super(c0190i, i9, c2483c0);
        int iM360k = ((C0058k) c0190i.f483i).m360k(i9);
        this.f2114j = new ArrayList();
        boolean z9 = true;
        if (iM360k >= 0) {
            iM5880a = 0;
            for (C2481b0 c2481b0 : c2483c0.mo5883s()) {
                if (z9) {
                    iM5880a = c2481b0.m5880a();
                    z9 = false;
                }
                this.f2114j.add(new C0696g(((C0189h) c0190i.f482h).m833b(new C0187f((C0016a) ((C0184c) c0190i.f476b).f469a, c2481b0.m5881b() + iM360k, "pswitch_"))));
            }
        } else {
            this.f2116l = true;
            iM5880a = 0;
            for (C2481b0 c2481b02 : c2483c0.mo5883s()) {
                if (z9) {
                    iM5880a = c2481b02.m5880a();
                    z9 = false;
                }
                this.f2114j.add(new C0697h(c2481b02.m5881b()));
            }
        }
        this.f2115k = iM5880a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p045d5.C0694e, p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        if (this.f2116l) {
            c0826a = ((C0184c) this.f2109h.f476b).m820q(c0826a);
        }
        c0826a.write(".packed-switch ");
        int i9 = this.f2115k;
        c0826a.mo2076g(new C0198f(i9));
        c0826a.m2081w();
        c0826a.write(10);
        Iterator it = this.f2114j.iterator();
        while (it.hasNext()) {
            ((AbstractC0698i) it.next()).mo1872a(c0826a);
            m1864f(c0826a, i9);
            c0826a.write(10);
            i9++;
        }
        c0826a.m2080u();
        c0826a.write(".end packed-switch");
        return true;
    }
}
