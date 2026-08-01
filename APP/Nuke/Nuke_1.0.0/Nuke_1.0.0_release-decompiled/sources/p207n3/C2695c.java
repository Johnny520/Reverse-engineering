package p207n3;

import com.bumptech.glide.AbstractC1923e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p121Y1.C1753n;
import p160f3.AbstractC2162v;
import p160f3.C2135g;

/* JADX INFO: renamed from: n3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2695c extends C2699g implements InterfaceC2693a {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8598g = AtomicReferenceFieldUpdater.newUpdater(C2695c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = AbstractC2696d.f8599a;

    /* JADX INFO: renamed from: c */
    public final boolean m4690c() {
        return Math.max(C2699g.f8606f.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m4691d(AbstractC1178c abstractC1178c) {
        boolean zM4692e = m4692e();
        C0891q c0891q = C0891q.f2780a;
        if (!zM4692e) {
            C2135g c2135gM3989k = AbstractC2162v.m3989k(AbstractC1923e.m3448G(abstractC1178c));
            try {
                m4694a(new C2694b(this, c2135gM3989k));
                Object objM3967r = c2135gM3989k.m3967r();
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM3967r != enumC1152a) {
                    objM3967r = c0891q;
                }
                if (objM3967r == enumC1152a) {
                    return objM3967r;
                }
            } catch (Throwable th) {
                c2135gM3989k.m3957B();
                throw th;
            }
        }
        return c0891q;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4692e() {
        int i5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2699g.f8606f;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 > 1) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1));
            } else {
                if (i6 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 - 1)) {
                    f8598g.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4693f(Object obj) {
        while (m4690c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8598g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1753n c1753n = AbstractC2696d.f8599a;
            if (obj2 != c1753n) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1753n)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m4695b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC2162v.m3987i(this) + "[isLocked=" + m4690c() + ",owner=" + f8598g.get(this) + ']';
    }
}
