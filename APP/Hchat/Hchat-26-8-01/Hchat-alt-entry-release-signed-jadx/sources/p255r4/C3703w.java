package p255r4;

import bsh.C0353j;
import java.util.Collection;
import java.util.TreeMap;
import p136j8.C2104o;
import p311v4.C4464m;

/* JADX INFO: renamed from: r4.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3703w extends AbstractC3668e0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f12037f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3703w(C3689p c3689p) {
        super("field_ids", c3689p, 4);
        this.f12037f = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: c */
    public final Collection mo7652c() {
        return this.f12037f.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m7707l(C4464m c4464m) {
        if (c4464m == null) {
            C0353j.m1305c("ref == null");
            return 0;
        }
        m7698f();
        C3701v c3701v = (C3701v) this.f12037f.get(c4464m);
        if (c3701v != null) {
            return c3701v.m7709e();
        }
        C2104o.m5294t("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final synchronized C3701v m7708m(C4464m c4464m) {
        C3701v c3701v;
        if (c4464m == null) {
            throw new NullPointerException("field == null");
        }
        m7699g();
        c3701v = (C3701v) this.f12037f.get(c4464m);
        if (c3701v == null) {
            c3701v = new C3701v(c4464m);
            this.f12037f.put(c4464m, c3701v);
        }
        return c3701v;
    }
}
