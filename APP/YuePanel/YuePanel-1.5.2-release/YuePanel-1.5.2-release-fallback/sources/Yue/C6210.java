package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6210<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f22204;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.util.SparseArray<Yue.C6210.C6211<T>> f22205;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6210.C6211<T> f22206;

    /* JADX INFO: renamed from: Yue.ۥۣۣۢۡ$ۥ, reason: contains not printable characters */
    public static class C6211<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final T[] f22207;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f22208;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f22209;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C6210.C6211<T> f22210;

        public C6211(java.lang.Class<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.f22207 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m23201(int r3) {
                r2 = this;
                int r0 = r2.f22208
                if (r0 > r3) goto Lb
                int r1 = r2.f22209
                int r0 = r0 + r1
                if (r3 >= r0) goto Lb
                r3 = 1
                goto Lc
            Lb:
                r3 = 0
            Lc:
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public T m23202(int r3) {
                r2 = this;
                T[] r0 = r2.f22207
                int r1 = r2.f22208
                int r3 = r3 - r1
                r3 = r0[r3]
                return r3
        }
    }

    public C6210(int r3) {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 10
            r0.<init>(r1)
            r2.f22205 = r0
            r2.f22204 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C6210.C6211<T> m23195(Yue.C6210.C6211<T> r4) {
            r3 = this;
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r3.f22205
            int r1 = r4.f22208
            int r0 = r0.indexOfKey(r1)
            if (r0 >= 0) goto L13
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r3.f22205
            int r1 = r4.f22208
            r0.put(r1, r4)
            r4 = 0
            return r4
        L13:
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r1 = r3.f22205
            java.lang.Object r1 = r1.valueAt(r0)
            Yue.ۥۣۣۢۡ$ۥ r1 = (Yue.C6210.C6211) r1
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r2 = r3.f22205
            r2.setValueAt(r0, r4)
            Yue.ۥۣۣۢۡ$ۥ<T> r0 = r3.f22206
            if (r0 != r1) goto L26
            r3.f22206 = r4
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m23196() {
            r1 = this;
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r1.f22205
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6210.C6211<T> m23197(int r2) {
            r1 = this;
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r1.f22205
            java.lang.Object r2 = r0.valueAt(r2)
            Yue.ۥۣۣۢۡ$ۥ r2 = (Yue.C6210.C6211) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public T m23198(int r3) {
            r2 = this;
            Yue.ۥۣۣۢۡ$ۥ<T> r0 = r2.f22206
            if (r0 == 0) goto La
            boolean r0 = r0.m23201(r3)
            if (r0 != 0) goto L24
        La:
            int r0 = r2.f22204
            int r0 = r3 % r0
            int r0 = r3 - r0
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r1 = r2.f22205
            int r0 = r1.indexOfKey(r0)
            if (r0 >= 0) goto L1a
            r3 = 0
            return r3
        L1a:
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r1 = r2.f22205
            java.lang.Object r0 = r1.valueAt(r0)
            Yue.ۥۣۣۢۡ$ۥ r0 = (Yue.C6210.C6211) r0
            r2.f22206 = r0
        L24:
            Yue.ۥۣۣۢۡ$ۥ<T> r0 = r2.f22206
            java.lang.Object r3 = r0.m23202(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C6210.C6211<T> m23199(int r3) {
            r2 = this;
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r2.f22205
            java.lang.Object r0 = r0.get(r3)
            Yue.ۥۣۣۢۡ$ۥ r0 = (Yue.C6210.C6211) r0
            Yue.ۥۣۣۢۡ$ۥ<T> r1 = r2.f22206
            if (r1 != r0) goto Lf
            r1 = 0
            r2.f22206 = r1
        Lf:
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r1 = r2.f22205
            r1.delete(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m23200() {
            r1 = this;
            android.util.SparseArray<Yue.ۥۣۣۢۡ$ۥ<T>> r0 = r1.f22205
            int r0 = r0.size()
            return r0
    }
}
