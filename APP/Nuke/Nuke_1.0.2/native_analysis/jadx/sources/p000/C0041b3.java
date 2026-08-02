package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0041b3 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f542h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Collection f543i;

    public /* synthetic */ C0041b3(int i, Collection collection) {
        this.f542h = i;
        this.f543i = collection;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        boolean zContains;
        int i = this.f542h;
        Collection<?> collection = this.f543i;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
