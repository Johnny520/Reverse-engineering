package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4817 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean f15281 = false;

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC4818<T> {
        T acquire();

        boolean release(T r1);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo19099(T[] r1, int r2);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۟$ۥ۟, reason: contains not printable characters */
    public static class C4819<T> implements Yue.C4817.InterfaceC4818<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.Object[] f15282;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f15283;

        public C4819(int r2) {
                r1 = this;
                r1.<init>()
                if (r2 <= 0) goto La
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.f15282 = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The max pool size must be > 0"
                r2.<init>(r0)
                throw r2
        }

        @Override // Yue.C4817.InterfaceC4818
        public T acquire() {
                r5 = this;
                int r0 = r5.f15283
                r1 = 0
                if (r0 <= 0) goto L12
                int r2 = r0 + (-1)
                java.lang.Object[] r3 = r5.f15282
                r4 = r3[r2]
                r3[r2] = r1
                int r0 = r0 + (-1)
                r5.f15283 = r0
                return r4
            L12:
                return r1
        }

        @Override // Yue.C4817.InterfaceC4818
        public boolean release(T r4) {
                r3 = this;
                int r0 = r3.f15283
                java.lang.Object[] r1 = r3.f15282
                int r2 = r1.length
                if (r0 >= r2) goto Le
                r1[r0] = r4
                r4 = 1
                int r0 = r0 + r4
                r3.f15283 = r0
                return r4
            Le:
                r4 = 0
                return r4
        }

        @Override // Yue.C4817.InterfaceC4818
        /* JADX INFO: renamed from: ۥ */
        public void mo19099(T[] r6, int r7) {
                r5 = this;
                int r0 = r6.length
                if (r7 <= r0) goto L4
                int r7 = r6.length
            L4:
                r0 = 0
            L5:
                if (r0 >= r7) goto L19
                r1 = r6[r0]
                int r2 = r5.f15283
                java.lang.Object[] r3 = r5.f15282
                int r4 = r3.length
                if (r2 >= r4) goto L16
                r3[r2] = r1
                int r2 = r2 + 1
                r5.f15283 = r2
            L16:
                int r0 = r0 + 1
                goto L5
            L19:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m19100(T r4) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r3.f15283
                if (r1 >= r2) goto L11
                java.lang.Object[] r2 = r3.f15282
                r2 = r2[r1]
                if (r2 != r4) goto Le
                r4 = 1
                return r4
            Le:
                int r1 = r1 + 1
                goto L2
            L11:
                return r0
        }
    }

    public C4817() {
            r0 = this;
            r0.<init>()
            return
    }
}
