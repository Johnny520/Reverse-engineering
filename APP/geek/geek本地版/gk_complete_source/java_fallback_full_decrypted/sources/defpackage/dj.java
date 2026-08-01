package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj {
    public final android.util.SparseArray a;
    public final defpackage.ej b;
    public final int c;
    public final int d;

    public dj(defpackage.ej r2, defpackage.r5 r3) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.a = r0
            r1.b = r2
            java.lang.Object r2 = r3.b
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r3 = 28
            r0 = 0
            int r3 = r2.getResourceId(r3, r0)
            r1.c = r3
            r3 = 52
            int r2 = r2.getResourceId(r3, r0)
            r1.d = r2
            return
    }
}
