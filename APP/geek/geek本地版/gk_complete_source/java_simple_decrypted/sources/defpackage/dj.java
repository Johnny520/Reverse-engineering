package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class dj {
    public final SparseArray a;
    public final ej b;
    public final int c;
    public final int d;

    public dj(ej r2, r5 r3) {
        this.a = new SparseArray();
        this.b = r2;
        TypedArray r22 = (TypedArray) r3.b;
        this.c = r22.getResourceId(28, 0);
        this.d = r22.getResourceId(52, 0);
    }
}
