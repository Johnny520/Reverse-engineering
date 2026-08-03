package p108ha;

import java.util.WeakHashMap;
import java.util.function.Supplier;
import ke.C2402k;

/* JADX INFO: renamed from: ha.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1656p implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5447a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f5447a) {
            case 0:
                return new WeakHashMap();
            case 1:
                String[] strArr = C1649j0.f5411f;
                return Boolean.FALSE;
            case 2:
                return new C2402k(0);
            case 3:
                return new C2402k(1);
            default:
                return 0;
        }
    }
}
