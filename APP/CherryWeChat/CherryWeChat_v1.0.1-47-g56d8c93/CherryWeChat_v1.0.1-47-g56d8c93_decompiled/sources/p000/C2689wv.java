package p000;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: wv */
/* JADX INFO: loaded from: classes.dex */
public final class C2689wv {

    /* JADX INFO: renamed from: a */
    public SparseArray f9256a;

    /* JADX INFO: renamed from: b */
    public int f9257b;

    /* JADX INFO: renamed from: c */
    public Set f9258c;

    /* JADX INFO: renamed from: a */
    public final C2646vv m5265a(int i) {
        SparseArray sparseArray = this.f9256a;
        C2646vv c2646vv = (C2646vv) sparseArray.get(i);
        if (c2646vv != null) {
            return c2646vv;
        }
        C2646vv c2646vv2 = new C2646vv();
        sparseArray.put(i, c2646vv2);
        return c2646vv2;
    }
}
