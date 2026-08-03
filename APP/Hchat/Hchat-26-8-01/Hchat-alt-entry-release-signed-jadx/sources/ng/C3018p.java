package ng;

import gg.C1406b;
import java.util.Iterator;
import java.util.List;
import p114hg.InterfaceC1711a;
import p116i.C1746e0;
import p218og.C3138b;
import p218og.C3139c;

/* JADX INFO: renamed from: ng.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3018p implements Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9814g;

    /* JADX INFO: renamed from: h */
    public final Object f9815h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3018p(Object obj, int i9) {
        this.f9814g = i9;
        this.f9815h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9814g) {
            case 0:
                return new C3138b((C3139c) this.f9815h);
            case 1:
                return new C1406b((Object[]) this.f9815h);
            default:
                return new C3006d(((List) ((C1746e0) this.f9815h).f5839h).iterator());
        }
    }
}
