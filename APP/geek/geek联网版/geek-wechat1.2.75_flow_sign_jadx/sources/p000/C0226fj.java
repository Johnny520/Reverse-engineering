package p000;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: renamed from: fj */
/* JADX INFO: loaded from: classes.dex */
public final class C0226fj {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1800a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final C0263gj f1801b;

    /* JADX INFO: renamed from: c */
    public final int f1802c;

    /* JADX INFO: renamed from: d */
    public final int f1803d;

    public C0226fj(C0263gj c0263gj, C0658r5 c0658r5) {
        this.f1801b = c0263gj;
        TypedArray typedArray = (TypedArray) c0658r5.f4064b;
        this.f1802c = typedArray.getResourceId(28, 0);
        this.f1803d = typedArray.getResourceId(52, 0);
    }
}
