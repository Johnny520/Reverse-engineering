package p255r4;

import bsh.C0353j;
import java.util.Collection;
import java.util.TreeMap;
import p136j8.C2104o;
import p311v4.AbstractC4454e;

/* JADX INFO: renamed from: r4.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3678j0 extends AbstractC3668e0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f11946f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3678j0(C3689p c3689p) {
        super("method_ids", c3689p, 4);
        this.f11946f = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: c */
    public final Collection mo7652c() {
        return this.f11946f.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m7671l(AbstractC4454e abstractC4454e) {
        if (abstractC4454e == null) {
            C0353j.m1305c("ref == null");
            return 0;
        }
        m7698f();
        C3676i0 c3676i0 = (C3676i0) this.f11946f.get(abstractC4454e);
        if (c3676i0 != null) {
            return c3676i0.m7709e();
        }
        C2104o.m5294t("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final synchronized void m7672m(AbstractC4454e abstractC4454e) {
        if (abstractC4454e == null) {
            throw new NullPointerException("method == null");
        }
        m7699g();
        if (((C3676i0) this.f11946f.get(abstractC4454e)) == null) {
            this.f11946f.put(abstractC4454e, new C3676i0(abstractC4454e));
        }
    }
}
