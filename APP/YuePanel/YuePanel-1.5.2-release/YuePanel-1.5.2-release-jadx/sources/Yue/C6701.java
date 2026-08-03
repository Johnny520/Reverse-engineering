package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6701 {

    /* JADX INFO: renamed from: ۥ */
    public static final boolean f2251 = false;

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۟$ۥ */
    public interface InterfaceC1065<T> {
        T acquire();

        boolean release(T t);

        /* JADX INFO: renamed from: ۥ */
        void mo3182(T[] tArr, int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۟$ۥ۟ */
    public static class C1066<T> implements InterfaceC1065<T> {

        /* JADX INFO: renamed from: ۥ */
        public final Object[] f2252;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2253;

        public C1066(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f2252 = new Object[i];
        }

        @Override // Yue.C6701.InterfaceC1065
        public T acquire() {
            int i = this.f2253;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f2252;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2253 = i - 1;
            return t;
        }

        @Override // Yue.C6701.InterfaceC1065
        public boolean release(T t) {
            int i = this.f2253;
            Object[] objArr = this.f2252;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2253 = i + 1;
            return true;
        }

        @Override // Yue.C6701.InterfaceC1065
        /* JADX INFO: renamed from: ۥ */
        public void mo3182(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f2253;
                Object[] objArr = this.f2252;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f2253 = i3 + 1;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m3183(T t) {
            for (int i = 0; i < this.f2253; i++) {
                if (this.f2252[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }
}
