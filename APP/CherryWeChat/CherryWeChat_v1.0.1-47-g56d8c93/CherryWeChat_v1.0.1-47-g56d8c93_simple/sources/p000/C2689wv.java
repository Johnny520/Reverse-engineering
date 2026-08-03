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
    public final C2646vv m5265a(int r3) {
        SparseArray r0 = this.f9256a;
        C2646vv r1 = (C2646vv) r0.get(r3);
        if (r1 != null) goto L6;
        C2646vv r12 = new C2646vv();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }
}
