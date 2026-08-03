package p379z7;

import java.util.Iterator;
import p166l7.C2518f;

/* JADX INFO: renamed from: z7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6114j extends C6115k {

    /* JADX INFO: renamed from: k */
    public final C2518f f24667k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6114j(Iterator it, C2518f c2518f) {
        super(it, null);
        this.f24667k = c2518f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6115k, java.util.function.Predicate
    public final boolean test(Object obj) {
        return (obj == null || obj == this.f24667k) ? false : true;
    }
}
