package p265s;

import ac.C0058k;
import java.util.Comparator;
import p251r.C3632q;

/* JADX INFO: renamed from: s.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3867y implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12676g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0058k f12677h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3867y(C0058k c0058k, int i9) {
        this.f12676g = i9;
        this.f12677h = c0058k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12676g) {
            case 0:
                Object obj3 = ((C3632q) obj).f11763k;
                C0058k c0058k = this.f12677h;
                return Integer.valueOf(c0058k.m364o(obj3)).compareTo(Integer.valueOf(c0058k.m364o(((C3632q) obj2).f11763k)));
            case 1:
                Object obj4 = ((C3632q) obj).f11763k;
                C0058k c0058k2 = this.f12677h;
                return Integer.valueOf(c0058k2.m364o(obj4)).compareTo(Integer.valueOf(c0058k2.m364o(((C3632q) obj2).f11763k)));
            case 2:
                Object obj5 = ((C3632q) obj2).f11763k;
                C0058k c0058k3 = this.f12677h;
                return Integer.valueOf(c0058k3.m364o(obj5)).compareTo(Integer.valueOf(c0058k3.m364o(((C3632q) obj).f11763k)));
            default:
                Object obj6 = ((C3632q) obj2).f11763k;
                C0058k c0058k4 = this.f12677h;
                return Integer.valueOf(c0058k4.m364o(obj6)).compareTo(Integer.valueOf(c0058k4.m364o(((C3632q) obj).f11763k)));
        }
    }
}
