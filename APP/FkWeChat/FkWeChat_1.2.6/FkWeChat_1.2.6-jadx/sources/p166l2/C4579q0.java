package p166l2;

import java.util.List;
import p024b9.AbstractC1061t;
import p166l2.C4554j0;
import p166l2.C4594v0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l2.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4579q0 {

    /* JADX INFO: renamed from: a */
    public final C4554j0 f13457a;

    /* JADX INFO: renamed from: b */
    public final C4575p f13458b;

    /* JADX INFO: renamed from: c */
    public final List f13459c;

    public C4579q0(C4554j0 c4554j0, C4575p c4575p, List list) {
        this.f13457a = c4554j0;
        this.f13458b = c4575p;
        this.f13459c = list;
    }

    /* JADX INFO: renamed from: e */
    public static final void m18154e(C4579q0 c4579q0, StringBuilder sb2, C4554j0 c4554j0, int i10) {
        String strM18159f = c4579q0.m18159f(c4554j0);
        if (strM18159f.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strM18159f);
            sb2.append('\n');
            i10++;
        }
        List listM17880P = c4554j0.m17880P();
        int size = listM17880P.size();
        for (int i12 = 0; i12 < size; i12++) {
            m18154e(c4579q0, sb2, (C4554j0) listM17880P.get(i12), i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18155a() {
        if (m18157c(this.f13457a)) {
            return;
        }
        System.out.println((Object) m18158d());
        C10010p0.m38820a("Inconsistency found!");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18156b(C4554j0 c4554j0) {
        Object obj;
        C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
        Object obj2 = null;
        C4554j0.e eVarM17937i0 = c4554j0M17848B0 != null ? c4554j0M17848B0.m17937i0() : null;
        if (c4554j0.mo13086t() || (c4554j0.m17851C0() != Integer.MAX_VALUE && c4554j0M17848B0 != null && c4554j0M17848B0.mo13086t())) {
            if (c4554j0.m17952p0()) {
                List list = this.f13459c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    C4594v0.a aVar = (C4594v0.a) obj;
                    if (AbstractC1061t.m3842c(aVar.m18355a(), c4554j0) && !aVar.m18357c()) {
                        break;
                    }
                    i10++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (c4554j0.mo13085p()) {
                return true;
            }
            if (c4554j0.m17952p0()) {
                return this.f13458b.m18135e(c4554j0) || c4554j0.m17937i0() == C4554j0.e.f13388r || (c4554j0M17848B0 != null && c4554j0M17848B0.m17952p0()) || ((c4554j0M17848B0 != null && c4554j0M17848B0.m17941k0()) || eVarM17937i0 == C4554j0.e.f13387q);
            }
            if (c4554j0.m17934h0()) {
                if (!this.f13458b.m18135e(c4554j0) && c4554j0M17848B0 != null && !c4554j0M17848B0.m17952p0() && !c4554j0M17848B0.m17934h0() && eVarM17937i0 != C4554j0.e.f13387q && eVarM17937i0 != C4554j0.e.f13389s) {
                    List list2 = this.f13459c;
                    int size2 = list2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            if (c4554j0.m17937i0() == C4554j0.e.f13387q || c4554j0.m17937i0() == C4554j0.e.f13389s) {
                                break;
                            }
                            return false;
                        }
                        if (AbstractC1061t.m3842c(((C4594v0.a) list2.get(i11)).m18355a(), c4554j0)) {
                            break;
                        }
                        i11++;
                    }
                }
                return true;
            }
        }
        if (AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE)) {
            if (c4554j0.m17941k0()) {
                List list3 = this.f13459c;
                int size3 = list3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    Object obj3 = list3.get(i12);
                    C4594v0.a aVar2 = (C4594v0.a) obj3;
                    if (AbstractC1061t.m3842c(aVar2.m18355a(), c4554j0) && aVar2.m18357c()) {
                        obj2 = obj3;
                        break;
                    }
                    i12++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (c4554j0.m17941k0()) {
                return this.f13458b.m18136f(c4554j0, true) || (c4554j0M17848B0 != null && c4554j0M17848B0.m17941k0()) || eVarM17937i0 == C4554j0.e.f13388r || (c4554j0M17848B0 != null && c4554j0M17848B0.m17952p0() && AbstractC1061t.m3842c(c4554j0.m17946m0(), c4554j0));
            }
            if (c4554j0.m17939j0() && !this.f13458b.m18136f(c4554j0, true) && c4554j0M17848B0 != null && !c4554j0M17848B0.m17941k0() && !c4554j0M17848B0.m17939j0() && eVarM17937i0 != C4554j0.e.f13388r && eVarM17937i0 != C4554j0.e.f13390t && (!c4554j0M17848B0.m17934h0() || !AbstractC1061t.m3842c(c4554j0.m17946m0(), c4554j0))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18157c(C4554j0 c4554j0) {
        if (!m18156b(c4554j0)) {
            return false;
        }
        List listM17880P = c4554j0.m17880P();
        int size = listM17880P.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m18157c((C4554j0) listM17880P.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final String m18158d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:\n");
        m18154e(this, sb2, this.f13457a, 0);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m18159f(C4554j0 c4554j0) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4554j0);
        sb2.append("[" + c4554j0.m17937i0() + ']');
        if (!c4554j0.mo13086t()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + c4554j0.m17957r0() + ']');
        if (!m18156b(c4554j0)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }
}
