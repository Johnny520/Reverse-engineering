package be;

import java.util.Set;
import java.util.function.Predicate;
import p302ud.C4305a;

/* JADX INFO: renamed from: be.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0298p implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f862g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Set f863h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0298p(Set set, int i9) {
        this.f862g = i9;
        this.f863h = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f862g) {
            case 0:
                return this.f863h.contains(((C0300r) obj).f866a.f14390l);
            default:
                return !this.f863h.contains((C4305a) obj);
        }
    }
}
