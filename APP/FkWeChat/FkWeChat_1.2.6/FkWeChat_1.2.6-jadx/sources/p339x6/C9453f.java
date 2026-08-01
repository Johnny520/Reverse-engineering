package p339x6;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1043k;
import p193n3.AbstractC5489b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: x6.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9453f {

    /* JADX INFO: renamed from: a */
    public final int f32129a;

    /* JADX INFO: renamed from: b */
    public final int f32130b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceArray f32131c;
    private volatile /* synthetic */ Object nextRef = null;
    private volatile /* synthetic */ long stateRef = 0;

    /* JADX INFO: renamed from: d */
    public static final b f32125d = new b(null);

    /* JADX INFO: renamed from: g */
    public static final Object f32128g = new a();

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32126e = AtomicReferenceFieldUpdater.newUpdater(C9453f.class, Object.class, "nextRef");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f32127f = AtomicLongFieldUpdater.newUpdater(C9453f.class, "stateRef");

    /* JADX INFO: renamed from: x6.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public String toString() {
            return "REMOVE_FROZEN";
        }
    }

    /* JADX INFO: renamed from: x6.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f32132a;

        public c(int i10) {
            this.f32132a = i10;
        }
    }

    public C9453f(int i10) {
        this.f32129a = i10;
        int i11 = i10 - 1;
        this.f32130b = i11;
        this.f32131c = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            C10010p0.m38820a("Check failed.");
            throw null;
        }
        if ((i10 & i11) == 0) {
            return;
        }
        C10010p0.m38820a("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m36831a(Object obj) {
        long j10;
        int i10;
        obj.getClass();
        do {
            j10 = this.stateRef;
            if ((3458764513820540928L & j10) != 0) {
                return f32125d.m36845e(j10);
            }
            i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f32130b;
            if (((i10 + 2) & i11) == (((int) (1073741823 & j10)) & i11)) {
                return 1;
            }
        } while (!f32127f.compareAndSet(this, j10, f32125d.m36847g(j10, (i10 + 1) & 1073741823)));
        this.f32131c.set(this.f32130b & i10, obj);
        C9453f c9453fM36835e = this;
        while ((c9453fM36835e.stateRef & FieldInfo.DISABLE_JSONB) != 0 && (c9453fM36835e = c9453fM36835e.m36838h().m36835e(i10, obj)) != null) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final C9453f m36832b(long j10) {
        C9453f c9453f = new C9453f(this.f32129a * 2);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f32130b;
            if ((i10 & i12) == (i11 & i12)) {
                c9453f.stateRef = f32125d.m36848h(j10, FieldInfo.DISABLE_JSONB);
                return c9453f;
            }
            AtomicReferenceArray atomicReferenceArray = c9453f.f32131c;
            int i13 = c9453f.f32130b & i10;
            Object cVar = this.f32131c.get(i12 & i10);
            if (cVar == null) {
                cVar = new c(i10);
            }
            atomicReferenceArray.set(i13, cVar);
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C9453f m36833c(long j10) {
        while (true) {
            C9453f c9453f = (C9453f) this.nextRef;
            if (c9453f != null) {
                return c9453f;
            }
            AbstractC5489b.m22334a(f32126e, this, null, m36832b(j10));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36834d() {
        long j10;
        do {
            j10 = this.stateRef;
            if ((j10 & FieldInfo.BACKR_REFERENCE) != 0) {
                return true;
            }
            if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
                return false;
            }
        } while (!f32127f.compareAndSet(this, j10, j10 | FieldInfo.BACKR_REFERENCE));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C9453f m36835e(int i10, Object obj) {
        Object obj2 = this.f32131c.get(this.f32130b & i10);
        if (!(obj2 instanceof c) || ((c) obj2).f32132a != i10) {
            return null;
        }
        this.f32131c.set(i10 & this.f32130b, obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m36836f() {
        long j10 = this.stateRef;
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: g */
    public final long m36837g() {
        long j10;
        long j11;
        do {
            j10 = this.stateRef;
            if ((j10 & FieldInfo.DISABLE_JSONB) != 0) {
                return j10;
            }
            j11 = j10 | FieldInfo.DISABLE_JSONB;
        } while (!f32127f.compareAndSet(this, j10, j11));
        return j11;
    }

    /* JADX INFO: renamed from: h */
    public final C9453f m36838h() {
        return m36833c(m36837g());
    }

    /* JADX INFO: renamed from: i */
    public final Object m36839i() {
        Object obj;
        long j10 = this.stateRef;
        if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
            return f32128g;
        }
        int i10 = (int) (1073741823 & j10);
        int i11 = this.f32130b;
        if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i10 & i11) || (obj = this.f32131c.get(i11 & i10)) == null || (obj instanceof c)) {
            return null;
        }
        int i12 = (i10 + 1) & 1073741823;
        if (f32127f.compareAndSet(this, j10, f32125d.m36846f(j10, i12))) {
            this.f32131c.set(this.f32130b & i10, null);
            return obj;
        }
        C9453f c9453fM36840j = this;
        do {
            c9453fM36840j = c9453fM36840j.m36840j(i10, i12);
        } while (c9453fM36840j != null);
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public final C9453f m36840j(int i10, int i11) {
        long j10;
        int i12;
        do {
            j10 = this.stateRef;
            i12 = (int) (1073741823 & j10);
            if (i12 != i10) {
                C10010p0.m38820a("This queue can have only one consumer");
                return null;
            }
            if ((FieldInfo.DISABLE_JSONB & j10) != 0) {
                return m36838h();
            }
        } while (!f32127f.compareAndSet(this, j10, f32125d.m36846f(j10, i11)));
        this.f32131c.set(this.f32130b & i12, null);
        return null;
    }

    /* JADX INFO: renamed from: x6.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public final int m36845e(long j10) {
            return (j10 & FieldInfo.BACKR_REFERENCE) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: f */
        public final long m36846f(long j10, int i10) {
            return m36848h(j10, 1073741823L) | ((long) i10);
        }

        /* JADX INFO: renamed from: g */
        public final long m36847g(long j10, int i10) {
            return m36848h(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        /* JADX INFO: renamed from: h */
        public final long m36848h(long j10, long j11) {
            return j10 & (~j11);
        }

        public b() {
        }
    }
}
