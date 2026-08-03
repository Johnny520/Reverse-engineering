package p151k6;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p105h6.AbstractC1622n;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2282c extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7583a = 1;

    /* JADX INFO: renamed from: b */
    public final C2327y f7584b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2282c(C2285d c2285d, C2327y c2327y, C2327y c2327y2) {
        this.f7584b = c2327y2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        switch (this.f7583a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c3066a.m6508l();
                } else {
                    c3066a.m6501b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        this.f7584b.mo4127b(c3066a, it.next());
                    }
                    c3066a.m6504g();
                }
                break;
            default:
                Map map = (Map) obj;
                if (map == null) {
                    c3066a.m6508l();
                } else {
                    c3066a.m6502c();
                    for (Map.Entry entry : map.entrySet()) {
                        c3066a.m6506i(String.valueOf(entry.getKey()));
                        this.f7584b.mo4127b(c3066a, entry.getValue());
                    }
                    c3066a.m6505h();
                }
                break;
        }
    }

    public C2282c(C2327y c2327y) {
        this.f7584b = c2327y;
    }
}
