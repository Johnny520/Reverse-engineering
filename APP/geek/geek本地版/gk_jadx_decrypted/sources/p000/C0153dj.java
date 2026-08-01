package p000;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: renamed from: dj */
/* JADX INFO: loaded from: classes.dex */
public final class C0153dj {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1599a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final C0189ej f1600b;

    /* JADX INFO: renamed from: c */
    public final int f1601c;

    /* JADX INFO: renamed from: d */
    public final int f1602d;

    public C0153dj(C0189ej c0189ej, C0659r5 c0659r5) {
        this.f1600b = c0189ej;
        TypedArray typedArray = (TypedArray) c0659r5.f4209b;
        this.f1601c = typedArray.getResourceId(28, 0);
        this.f1602d = typedArray.getResourceId(52, 0);
    }
}
