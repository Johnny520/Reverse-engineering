package p170le;

import be.AbstractC0269a;
import java.util.HashSet;
import java.util.function.Predicate;
import p302ud.C4305a;
import p302ud.C4325u;

/* JADX INFO: renamed from: le.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2556d implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8288g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ HashSet f8289h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2556d(HashSet hashSet, int i9) {
        this.f8288g = i9;
        this.f8289h = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f8288g) {
            case 0:
                return this.f8289h.contains((C4305a) obj);
            default:
                AbstractC0269a abstractC0269a = (AbstractC0269a) obj;
                if (!this.f8289h.contains(abstractC0269a.mo1051e())) {
                    return false;
                }
                C4325u.f14434v.mo6270x(abstractC0269a.mo1051e(), "Disable pass: {}");
                return true;
        }
    }
}
