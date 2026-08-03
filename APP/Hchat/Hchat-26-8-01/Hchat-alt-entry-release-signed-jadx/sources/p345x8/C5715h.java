package p345x8;

import ca.C0512c;
import java.util.ArrayList;
import java.util.function.Predicate;
import p302ud.C4305a;

/* JADX INFO: renamed from: x8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5715h implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23249g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f23250h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5715h(Object obj, int i9) {
        this.f23249g = i9;
        this.f23250h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f23249g) {
            case 0:
                return ((Boolean) ((C0512c) this.f23250h).invoke(obj)).booleanValue();
            default:
                ((ArrayList) this.f23250h).add((C4305a) obj);
                return false;
        }
    }
}
