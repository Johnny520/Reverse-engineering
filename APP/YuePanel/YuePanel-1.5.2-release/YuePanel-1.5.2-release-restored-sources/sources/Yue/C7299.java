package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7299 implements InterfaceC7298 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21998 = AtomicReferenceFieldUpdater.newUpdater(C7299.class, Object.class, "head");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f21999 = AtomicLongFieldUpdater.newUpdater(C7299.class, "deqIdx");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22000 = AtomicReferenceFieldUpdater.newUpdater(C7299.class, Object.class, "tail");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f22001 = AtomicLongFieldUpdater.newUpdater(C7299.class, "enqIdx");

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22002 = AtomicIntegerFieldUpdater.newUpdater(C7299.class, "_availablePermits");

    @InterfaceC6399
    volatile /* synthetic */ int _availablePermits;

    @InterfaceC6399
    private volatile /* synthetic */ long deqIdx = 0;

    @InterfaceC6399
    private volatile /* synthetic */ long enqIdx = 0;

    @InterfaceC6399
    private volatile /* synthetic */ Object head;

    @InterfaceC6399
    private volatile /* synthetic */ Object tail;

    /* JADX INFO: renamed from: ۥ */
    public final int f2790;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<Throwable, C8107> f2791;

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۤ$ۥ */
    public static final class C1227 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {
        public C1227() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m22801(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m22801(@InterfaceC6399 Throwable th) {
            C7299.this.release();
        }
    }

    public C7299(int i, int i2) {
        this.f2790 = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        C7301 c7301 = new C7301(0L, null, 2);
        this.head = c7301;
        this.tail = c7301;
        this._availablePermits = i - i2;
        this.f2791 = new C1227();
    }

    @Override // Yue.InterfaceC7298
    public void release() {
        while (true) {
            int i = this._availablePermits;
            if (i >= this.f2790) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f2790).toString());
            }
            if (f22002.compareAndSet(this, i, i + 1) && (i >= 0 || m22800())) {
                return;
            }
        }
    }

    @Override // Yue.InterfaceC7298
    /* JADX INFO: renamed from: ۥ */
    public int mo3555() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // Yue.InterfaceC7298
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public Object mo3556(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM22797;
        return (f22002.getAndDecrement(this) <= 0 && (objM22797 = m22797(interfaceC4199)) == C5508.m17142()) ? objM22797 : C8107.f3222;
    }

    @Override // Yue.InterfaceC7298
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo22793() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!f22002.compareAndSet(this, i, i - 1));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Object m22797(InterfaceC4199<? super C8107> interfaceC4199) {
        C3666 c3666M736 = C3668.m736(C5501.m17135(interfaceC4199));
        while (true) {
            if (m22798(c3666M736)) {
                break;
            }
            if (f22002.getAndDecrement(this) > 0) {
                c3666M736.mo10014(C8107.f3222, this.f2791);
                break;
            }
        }
        Object objM10039 = c3666M736.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m22798(InterfaceC3665<? super C8107> interfaceC3665) {
        Object objM3542;
        C7301 c7301 = (C7301) this.tail;
        long andIncrement = f22001.getAndIncrement(this);
        long j = andIncrement / ((long) C7300.f22007);
        loop0: while (true) {
            AbstractC7276 abstractC7276 = c7301;
            while (true) {
                if (abstractC7276.m22732() >= j && !abstractC7276.mo11519()) {
                    objM3542 = C7277.m3542(abstractC7276);
                    break;
                }
                Object objM11517 = abstractC7276.m11517();
                if (objM11517 == C4077.f652) {
                    objM3542 = C7277.m3542(C4077.f652);
                    break;
                }
                AbstractC7276 abstractC7276M22809 = (AbstractC7276) ((AbstractC4078) objM11517);
                if (abstractC7276M22809 == null) {
                    abstractC7276M22809 = C7300.m22809(abstractC7276.m22732() + 1, (C7301) abstractC7276);
                    if (abstractC7276.m11525(abstractC7276M22809)) {
                        if (abstractC7276.mo11519()) {
                            abstractC7276.m11524();
                        }
                    }
                }
                abstractC7276 = abstractC7276M22809;
            }
            if (!C7277.m22741(objM3542)) {
                AbstractC7276 abstractC7276M22739 = C7277.m22739(objM3542);
                while (true) {
                    AbstractC7276 abstractC72762 = (AbstractC7276) this.tail;
                    if (abstractC72762.m22732() >= abstractC7276M22739.m22732()) {
                        break loop0;
                    }
                    if (!abstractC7276M22739.m22735()) {
                        break;
                    }
                    if (C3008.m74(f22000, this, abstractC72762, abstractC7276M22739)) {
                        if (abstractC72762.m22731()) {
                            abstractC72762.m11524();
                        }
                    } else if (abstractC7276M22739.m22731()) {
                        abstractC7276M22739.m11524();
                    }
                }
            } else {
                break;
            }
        }
        C7301 c73012 = (C7301) C7277.m22739(objM3542);
        int i = (int) (andIncrement % ((long) C7300.f22007));
        if (C4079.m1036(c73012.f22012, i, null, interfaceC3665)) {
            interfaceC3665.mo10021(new C3663(c73012, i));
            return true;
        }
        if (!C4079.m1036(c73012.f22012, i, C7300.f2793, C7300.f22004)) {
            return false;
        }
        interfaceC3665.mo10014(C8107.f3222, this.f2791);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m22799(InterfaceC3665<? super C8107> interfaceC3665) {
        Object objMo10019 = interfaceC3665.mo10019(C8107.f3222, null, this.f2791);
        if (objMo10019 == null) {
            return false;
        }
        interfaceC3665.mo10022(objMo10019);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m22800() {
        Object objM3542;
        C7301 c7301 = (C7301) this.head;
        long andIncrement = f21999.getAndIncrement(this);
        long j = andIncrement / ((long) C7300.f22007);
        loop0: while (true) {
            AbstractC7276 abstractC7276 = c7301;
            while (true) {
                if (abstractC7276.m22732() >= j && !abstractC7276.mo11519()) {
                    objM3542 = C7277.m3542(abstractC7276);
                    break;
                }
                Object objM11517 = abstractC7276.m11517();
                if (objM11517 == C4077.f652) {
                    objM3542 = C7277.m3542(C4077.f652);
                    break;
                }
                AbstractC7276 abstractC7276M22809 = (AbstractC7276) ((AbstractC4078) objM11517);
                if (abstractC7276M22809 == null) {
                    abstractC7276M22809 = C7300.m22809(abstractC7276.m22732() + 1, (C7301) abstractC7276);
                    if (abstractC7276.m11525(abstractC7276M22809)) {
                        if (abstractC7276.mo11519()) {
                            abstractC7276.m11524();
                        }
                    }
                }
                abstractC7276 = abstractC7276M22809;
            }
            if (C7277.m22741(objM3542)) {
                break;
            }
            AbstractC7276 abstractC7276M22739 = C7277.m22739(objM3542);
            while (true) {
                AbstractC7276 abstractC72762 = (AbstractC7276) this.head;
                if (abstractC72762.m22732() >= abstractC7276M22739.m22732()) {
                    break loop0;
                }
                if (!abstractC7276M22739.m22735()) {
                    break;
                }
                if (C3008.m74(f21998, this, abstractC72762, abstractC7276M22739)) {
                    if (abstractC72762.m22731()) {
                        abstractC72762.m11524();
                    }
                } else if (abstractC7276M22739.m22731()) {
                    abstractC7276M22739.m11524();
                }
            }
        }
        C7301 c73012 = (C7301) C7277.m22739(objM3542);
        c73012.m1035();
        if (c73012.m22732() > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) C7300.f22007));
        Object andSet = c73012.f22012.getAndSet(i, C7300.f2793);
        if (andSet != null) {
            if (andSet == C7300.f22006) {
                return false;
            }
            return m22799((InterfaceC3665) andSet);
        }
        int i2 = C7300.f2792;
        for (int i3 = 0; i3 < i2; i3++) {
            if (c73012.f22012.get(i) == C7300.f22004) {
                return true;
            }
        }
        return !C4079.m1036(c73012.f22012, i, C7300.f2793, C7300.f22005);
    }
}
