package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Zy */
/* JADX INFO: loaded from: classes.dex */
public final class C1115Zy extends AbstractC0671Pj implements InterfaceC0035As {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3516h = AtomicReferenceFieldUpdater.newUpdater(C1115Zy.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: g */
    public int f3517g;

    public C1115Zy(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX INFO: renamed from: D */
    public final void m2031D(Object obj) {
        int i;
        if (obj == null) {
            obj = AbstractC0671Pj.f2141d;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3516h;
            if (AbstractC0585Nj.m1134a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f3517g;
            if ((i2 & 1) != 0) {
                this.f3517g = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f3517g = i3;
            while (true) {
                synchronized (this) {
                    i = this.f3517g;
                    if (i == i3) {
                        this.f3517g = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
