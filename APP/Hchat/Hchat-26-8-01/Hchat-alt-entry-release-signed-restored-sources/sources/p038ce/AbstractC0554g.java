package p038ce;

import ae.C0075f;
import ae.C0077h;
import java.util.Iterator;
import mh.AbstractC2846d;
import p302ud.C4305a;

/* JADX INFO: renamed from: ce.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0554g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1738a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(AbstractC0554g.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1557a(C0077h c0077h, C4305a c4305a, C4305a c4305a2) {
        Iterator it = c0077h.f244h.iterator();
        while (it.hasNext()) {
            C4305a c4305a3 = ((C0075f) it.next()).f234c;
            C0560m.m1567j(c4305a, c4305a3);
            if (c4305a2 != null) {
                C0560m.m1567j(c4305a2, c4305a3);
            }
        }
        C0077h c0077h2 = c0077h.f246j;
        if (c0077h2 != null) {
            m1557a(c0077h2, c4305a, c4305a2);
        }
    }
}
