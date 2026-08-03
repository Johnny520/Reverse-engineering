package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6702 {

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ */
    public interface InterfaceC1067<T> {
        @InterfaceC6489
        T acquire();

        boolean release(@InterfaceC6399 T t);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ۟ */
    @InterfaceC7507({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C1068<T> implements InterfaceC1067<T> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final Object[] f2254;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2255;

        public C1068(@InterfaceC5459(from = 1) int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.f2254 = new Object[i];
        }

        @Override // Yue.C6702.InterfaceC1067
        @InterfaceC6489
        public T acquire() {
            int i = this.f2255;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.f2254[i2];
            C5499.m17101(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.f2254[i2] = null;
            this.f2255--;
            return t;
        }

        @Override // Yue.C6702.InterfaceC1067
        public boolean release(@InterfaceC6399 T t) {
            C5499.m17103(t, "instance");
            if (!(!m3184(t))) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i = this.f2255;
            Object[] objArr = this.f2254;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2255 = i + 1;
            return true;
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m3184(T t) {
            int i = this.f2255;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f2254[i2] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C6703<T> extends C1068<T> {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final Object f17268;

        public C6703(int i) {
            super(i);
            this.f17268 = new Object();
        }

        @Override // Yue.C6702.C1068, Yue.C6702.InterfaceC1067
        @InterfaceC6489
        public T acquire() {
            T t;
            synchronized (this.f17268) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // Yue.C6702.C1068, Yue.C6702.InterfaceC1067
        public boolean release(@InterfaceC6399 T t) {
            boolean zRelease;
            C5499.m17103(t, "instance");
            synchronized (this.f17268) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }
}
