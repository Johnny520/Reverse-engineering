package p151k6;

import java.io.IOException;
import java.util.Iterator;
import p012ah.C0086a;
import p077f8.AbstractC1089i;
import p105h6.AbstractC1622n;
import p165l6.AbstractC2512c;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315s extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final C2319u f7636a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2315s(C2319u c2319u) {
        this.f7636a = c2319u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        if (obj == null) {
            c3066a.m6508l();
            return;
        }
        c3066a.m6502c();
        try {
            Iterator it = this.f7636a.f7641a.iterator();
            while (it.hasNext()) {
                ((C2313r) it.next()).m5530a(c3066a, obj);
            }
            c3066a.m6505h();
        } catch (IllegalAccessException e6) {
            AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
            C0086a.m457p("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }
}
