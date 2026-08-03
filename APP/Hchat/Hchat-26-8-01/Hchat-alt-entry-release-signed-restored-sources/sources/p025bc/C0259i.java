package p025bc;

import java.util.function.Predicate;
import p023b8.AbstractC0214l;
import p182m7.C2797j;
import p257r7.C3724n;
import p257r7.C3725o;
import p289te.C4148b;
import p302ud.C4309e;

/* JADX INFO: renamed from: bc.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0259i implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f759g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f760h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0259i(String str, int i9) {
        this.f759g = i9;
        this.f760h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f759g) {
            case 0:
                return ((C4309e) obj).f14373m.f10141j.equals(this.f760h);
            case 1:
                C2797j c2797j = (C2797j) obj;
                String str = this.f760h;
                if (str == null) {
                    return c2797j.m6197V().m6164U() == null;
                }
                c2797j.getClass();
                return AbstractC0214l.m892a(str).equals(c2797j.m6197V().m6200c0(false));
            case 2:
                ((C4148b) obj).m8344a();
                return "dex-input".equals(this.f760h);
            default:
                C3725o c3725o = (C3725o) obj;
                C3724n c3724n = c3725o.f12097t;
                if ((c3724n == null ? 0 : c3724n.f12083n) != 0) {
                    return false;
                }
                String str2 = this.f760h;
                return str2 == null ? c3725o.f7659i : str2.equals(c3725o.m7744Y());
        }
    }
}
