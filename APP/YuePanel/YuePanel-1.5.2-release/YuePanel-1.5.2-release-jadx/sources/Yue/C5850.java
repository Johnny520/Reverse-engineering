package Yue;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public class C5850 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14501 = AtomicReferenceFieldUpdater.newUpdater(C5850.class, Object.class, "_next");

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14502 = AtomicReferenceFieldUpdater.newUpdater(C5850.class, Object.class, "_prev");

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14503 = AtomicReferenceFieldUpdater.newUpdater(C5850.class, Object.class, "_removedRef");

    @InterfaceC6399
    volatile /* synthetic */ Object _next = this;

    @InterfaceC6399
    volatile /* synthetic */ Object _prev = this;

    @InterfaceC6399
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ */
    public static abstract class AbstractC0882 extends AbstractC3446 {
        @Override // Yue.AbstractC3446
        /* JADX INFO: renamed from: ۥ */
        public final void mo520(@InterfaceC6399 AbstractC3450<?> abstractC3450, @InterfaceC6489 Object obj) {
            C5850 c5850Mo18119;
            boolean z = obj == null;
            C5850 c5850Mo18118 = mo18118();
            if (c5850Mo18118 == null || (c5850Mo18119 = mo18119()) == null) {
                return;
            }
            if (C3008.m74(C5850.f14501, c5850Mo18118, abstractC3450, z ? mo18122(c5850Mo18118, c5850Mo18119) : c5850Mo18119) && z) {
                mo18116(c5850Mo18118, c5850Mo18119);
            }
        }

        @Override // Yue.AbstractC3446
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Object mo9104(@InterfaceC6399 AbstractC3450<?> abstractC3450) {
            while (true) {
                C5850 c5850Mo18121 = mo18121(abstractC3450);
                if (c5850Mo18121 == null) {
                    return C3449.f296;
                }
                Object obj = c5850Mo18121._next;
                if (obj == abstractC3450 || abstractC3450.m9123()) {
                    return null;
                }
                if (obj instanceof AbstractC6567) {
                    AbstractC6567 abstractC6567 = (AbstractC6567) obj;
                    if (abstractC3450.m3028(abstractC6567)) {
                        return C3449.f296;
                    }
                    abstractC6567.mo9118(c5850Mo18121);
                } else {
                    Object objMo5759 = mo5759(c5850Mo18121);
                    if (objMo5759 != null) {
                        return objMo5759;
                    }
                    if (mo18120(c5850Mo18121, obj)) {
                        continue;
                    } else {
                        C5852 c5852 = new C5852(c5850Mo18121, (C5850) obj, this);
                        if (C3008.m74(C5850.f14501, c5850Mo18121, obj, c5852)) {
                            try {
                                if (c5852.mo9118(c5850Mo18121) != C5856.f1735) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                C3008.m74(C5850.f14501, c5850Mo18121, c5852, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo5759(@InterfaceC6399 C5850 c5850) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public abstract void mo18116(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public abstract void mo18117(@InterfaceC6399 C5852 c5852);

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public abstract C5850 mo18118();

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public abstract C5850 mo18119();

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public Object mo5760(@InterfaceC6399 C5852 c5852) {
            mo18117(c5852);
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo5761(@InterfaceC6399 C5850 c5850) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean mo18120(@InterfaceC6399 C5850 c5850, @InterfaceC6399 Object obj) {
            return false;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C5850 mo18121(@InterfaceC6399 AbstractC6567 abstractC6567) {
            C5850 c5850Mo18118 = mo18118();
            C5499.m17100(c5850Mo18118);
            return c5850Mo18118;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public abstract Object mo18122(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟ */
    public static class C0883<T extends C5850> extends AbstractC0882 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14504 = AtomicReferenceFieldUpdater.newUpdater(C0883.class, Object.class, "_affectedNode");

        @InterfaceC6399
        private volatile /* synthetic */ Object _affectedNode = null;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850 f1730;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final T f14505;

        public C0883(@InterfaceC6399 C5850 c5850, @InterfaceC6399 T t) {
            this.f1730 = c5850;
            this.f14505 = t;
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo18116(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
            this.f14505.m18103(this.f1730);
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo18117(@InterfaceC6399 C5852 c5852) {
            C3008.m74(f14504, this, null, c5852.f1732);
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public final C5850 mo18118() {
            return (C5850) this._affectedNode;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public final C5850 mo18119() {
            return this.f1730;
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo18120(@InterfaceC6399 C5850 c5850, @InterfaceC6399 Object obj) {
            return obj != this.f1730;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public final C5850 mo18121(@InterfaceC6399 AbstractC6567 abstractC6567) {
            return this.f1730.m18099(abstractC6567);
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public Object mo18122(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
            T t = this.f14505;
            C3008.m74(C5850.f14502, t, t, c5850);
            T t2 = this.f14505;
            C3008.m74(C5850.f14501, t2, t2, this.f1730);
            return this.f14505;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6839
    public static abstract class AbstractC5851 extends AbstractC3450<C5850> {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850 f1731;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public C5850 f14506;

        public AbstractC5851(@InterfaceC6399 C5850 c5850) {
            this.f1731 = c5850;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // Yue.AbstractC3450
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9119(@InterfaceC6399 C5850 c5850, @InterfaceC6489 Object obj) {
            boolean z = obj == null;
            C5850 c58502 = z ? this.f1731 : this.f14506;
            if (c58502 != null && C3008.m74(C5850.f14501, c5850, this, c58502) && z) {
                C5850 c58503 = this.f1731;
                C5850 c58504 = this.f14506;
                C5499.m17100(c58504);
                c58503.m18103(c58504);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5852 extends AbstractC6567 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850 f1732;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850 f1733;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final AbstractC0882 f14507;

        public C5852(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502, @InterfaceC6399 AbstractC0882 abstractC0882) {
            this.f1732 = c5850;
            this.f1733 = c58502;
            this.f14507 = abstractC0882;
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6399
        public String toString() {
            return "PrepareOp(op=" + mo528() + ')';
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public AbstractC3450<?> mo528() {
            return this.f14507.m521();
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Object mo9118(@InterfaceC6489 Object obj) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            }
            C5850 c5850 = (C5850) obj;
            Object objMo5760 = this.f14507.mo5760(this);
            Object obj2 = C5856.f1735;
            if (objMo5760 != obj2) {
                Object objM9120 = objMo5760 != null ? mo528().m9120(objMo5760) : mo528().m9121();
                C3008.m74(C5850.f14501, c5850, this, objM9120 == C3449.f295 ? mo528() : objM9120 == null ? this.f14507.mo18122(c5850, this.f1733) : this.f1733);
                return null;
            }
            C5850 c58502 = this.f1733;
            if (C3008.m74(C5850.f14501, c5850, this, c58502.m18113())) {
                this.f14507.mo5761(c5850);
                c58502.m18099(null);
            }
            return obj2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m18124() {
            this.f14507.mo18117(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C5853<T> extends AbstractC0882 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14508 = AtomicReferenceFieldUpdater.newUpdater(C5853.class, Object.class, "_affectedNode");

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14509 = AtomicReferenceFieldUpdater.newUpdater(C5853.class, Object.class, "_originalNext");

        @InterfaceC6399
        private volatile /* synthetic */ Object _affectedNode = null;

        @InterfaceC6399
        private volatile /* synthetic */ Object _originalNext = null;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850 f1734;

        public C5853(@InterfaceC6399 C5850 c5850) {
            this.f1734 = c5850;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static /* synthetic */ void m18125() {
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo5759(@InterfaceC6399 C5850 c5850) {
            if (c5850 == this.f1734) {
                return C5849.m18085();
            }
            return null;
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public final void mo18116(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
            c58502.m18099(null);
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo18117(@InterfaceC6399 C5852 c5852) {
            C3008.m74(f14508, this, null, c5852.f1732);
            C3008.m74(f14509, this, null, c5852.f1733);
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public final C5850 mo18118() {
            return (C5850) this._affectedNode;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public final C5850 mo18119() {
            return (C5850) this._originalNext;
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public final boolean mo18120(@InterfaceC6399 C5850 c5850, @InterfaceC6399 Object obj) {
            if (!(obj instanceof C7093)) {
                return false;
            }
            ((C7093) obj).f2672.m18108();
            return true;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public final C5850 mo18121(@InterfaceC6399 AbstractC6567 abstractC6567) {
            C5850 c5850 = this.f1734;
            while (true) {
                Object obj = c5850._next;
                if (!(obj instanceof AbstractC6567)) {
                    return (C5850) obj;
                }
                AbstractC6567 abstractC65672 = (AbstractC6567) obj;
                if (abstractC6567.m3028(abstractC65672)) {
                    return null;
                }
                abstractC65672.mo9118(this.f1734);
            }
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public final Object mo18122(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
            return c58502.m18113();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final T m18126() {
            T t = (T) mo18118();
            C5499.m17100(t);
            return t;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C5854 extends AbstractC5851 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<Boolean> f14510;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5854(C5850 c5850, InterfaceC5122<Boolean> interfaceC5122) {
            super(c5850);
            this.f14510 = interfaceC5122;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo5762(@InterfaceC6399 C5850 c5850) {
            if (this.f14510.invoke().booleanValue()) {
                return null;
            }
            return C5849.m2518();
        }
    }

    @InterfaceC6399
    public String toString() {
        return new C6827(this) { // from class: Yue.ۥ۠ۨ۠ۥ.ۥ۟۟۟ۡ
            @Override // Yue.C6827, Yue.InterfaceC5606
            @InterfaceC6489
            public Object get() {
                return C4325.m1288(this.receiver);
            }
        } + '@' + C4325.m1289(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m18093(@InterfaceC6399 C5850 c5850) {
        while (!m18106().m18097(c5850, this)) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final boolean m18094(@InterfaceC6399 C5850 c5850, @InterfaceC6399 InterfaceC5122<Boolean> interfaceC5122) {
        int iM18114;
        C5854 c5854 = new C5854(c5850, interfaceC5122);
        do {
            iM18114 = m18106().m18114(c5850, this, c5854);
            if (iM18114 == 1) {
                return true;
            }
        } while (iM18114 != 2);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final boolean m18095(@InterfaceC6399 C5850 c5850, @InterfaceC6399 InterfaceC5124<? super C5850, Boolean> interfaceC5124) {
        C5850 c5850M18106;
        do {
            c5850M18106 = m18106();
            if (!interfaceC5124.invoke(c5850M18106).booleanValue()) {
                return false;
            }
        } while (!c5850M18106.m18097(c5850, this));
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m18096(@InterfaceC6399 C5850 c5850, @InterfaceC6399 InterfaceC5124<? super C5850, Boolean> interfaceC5124, @InterfaceC6399 InterfaceC5122<Boolean> interfaceC5122) {
        int iM18114;
        C5854 c5854 = new C5854(c5850, interfaceC5122);
        do {
            C5850 c5850M18106 = m18106();
            if (!interfaceC5124.invoke(c5850M18106).booleanValue()) {
                return false;
            }
            iM18114 = c5850M18106.m18114(c5850, this, c5854);
            if (iM18114 == 1) {
                return true;
            }
        } while (iM18114 != 2);
        return false;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m18097(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
        f14502.lazySet(c5850, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14501;
        atomicReferenceFieldUpdater.lazySet(c5850, c58502);
        if (!C3008.m74(atomicReferenceFieldUpdater, this, c58502, c5850)) {
            return false;
        }
        c5850.m18103(c58502);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final boolean m18098(@InterfaceC6399 C5850 c5850) {
        f14502.lazySet(c5850, this);
        f14501.lazySet(c5850, this);
        while (m18104() == this) {
            if (C3008.m74(f14501, this, this, c5850)) {
                c5850.m18103(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (Yue.C3008.m74(Yue.C5850.f14501, r3, r2, ((Yue.C7093) r4).f2672) != false) goto L30;
     */
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5850 m18099(AbstractC6567 abstractC6567) {
        while (true) {
            C5850 c5850 = (C5850) this._prev;
            C5850 c58502 = c5850;
            while (true) {
                C5850 c58503 = null;
                while (true) {
                    Object obj = c58502._next;
                    if (obj == this) {
                        if (c5850 == c58502 || C3008.m74(f14502, this, c5850, c58502)) {
                            return c58502;
                        }
                    } else {
                        if (mo18077()) {
                            return null;
                        }
                        if (obj == abstractC6567) {
                            return c58502;
                        }
                        if (obj instanceof AbstractC6567) {
                            if (abstractC6567 != null && abstractC6567.m3028((AbstractC6567) obj)) {
                                return null;
                            }
                            ((AbstractC6567) obj).mo9118(c58502);
                        } else if (!(obj instanceof C7093)) {
                            c58503 = c58502;
                            c58502 = (C5850) obj;
                        } else {
                            if (c58503 != null) {
                                break;
                            }
                            c58502 = (C5850) c58502._prev;
                        }
                    }
                }
                c58502 = c58503;
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final <T extends C5850> C0883<T> m18100(@InterfaceC6399 T t) {
        return new C0883<>(this, t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final C5853<C5850> m18101() {
        return new C5853<>(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final C5850 m18102(C5850 c5850) {
        while (c5850.mo18077()) {
            c5850 = (C5850) c5850._prev;
        }
        return c5850;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m18103(C5850 c5850) {
        C5850 c58502;
        do {
            c58502 = (C5850) c5850._prev;
            if (m18104() != c5850) {
                return;
            }
        } while (!C3008.m74(f14502, c5850, c58502, this));
        if (mo18077()) {
            c5850.m18099(null);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final Object m18104() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC6567)) {
                return obj;
            }
            ((AbstractC6567) obj).mo9118(this);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final C5850 m18105() {
        return C5849.m18089(m18104());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final C5850 m18106() {
        C5850 c5850M18099 = m18099(null);
        return c5850M18099 == null ? m18102((C5850) this._prev) : c5850M18099;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m18107() {
        ((C7093) m18104()).f2672.m18108();
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final void m18108() {
        C5850 c5850 = this;
        while (true) {
            Object objM18104 = c5850.m18104();
            if (!(objM18104 instanceof C7093)) {
                c5850.m18099(null);
                return;
            }
            c5850 = ((C7093) objM18104).f2672;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public boolean mo18077() {
        return m18104() instanceof C7093;
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final AbstractC5851 m18109(@InterfaceC6399 C5850 c5850, @InterfaceC6399 InterfaceC5122<Boolean> interfaceC5122) {
        return new C5854(c5850, interfaceC5122);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public C5850 mo18078() {
        Object objM18104 = m18104();
        C7093 c7093 = objM18104 instanceof C7093 ? (C7093) objM18104 : null;
        if (c7093 != null) {
            return c7093.f2672;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public boolean mo18079() {
        return m18112() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, Yue.ۥ۠ۨ۠ۥ, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final /* synthetic */ <T> T m18110(InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5850 c5850M18112;
        while (true) {
            C5850 c5850 = (C5850) m18104();
            if (c5850 == this) {
                return null;
            }
            C5499.m17112(3, C4750.f10502);
            if (!(c5850 instanceof Object)) {
                return null;
            }
            if ((interfaceC5124.invoke(c5850).booleanValue() && !c5850.mo18077()) || (c5850M18112 = c5850.m18112()) == null) {
                return c5850;
            }
            c5850M18112.m18108();
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final C5850 m18111() {
        while (true) {
            C5850 c5850 = (C5850) m18104();
            if (c5850 == this) {
                return null;
            }
            if (c5850.mo18079()) {
                return c5850;
            }
            c5850.m18107();
        }
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final C5850 m18112() {
        Object objM18104;
        C5850 c5850;
        do {
            objM18104 = m18104();
            if (objM18104 instanceof C7093) {
                return ((C7093) objM18104).f2672;
            }
            if (objM18104 == this) {
                return (C5850) objM18104;
            }
            c5850 = (C5850) objM18104;
        } while (!C3008.m74(f14501, this, objM18104, c5850.m18113()));
        c5850.m18099(null);
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final C7093 m18113() {
        C7093 c7093 = (C7093) this._removedRef;
        if (c7093 != null) {
            return c7093;
        }
        C7093 c70932 = new C7093(this);
        f14503.lazySet(this, c70932);
        return c70932;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final int m18114(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502, @InterfaceC6399 AbstractC5851 abstractC5851) {
        f14502.lazySet(c5850, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14501;
        atomicReferenceFieldUpdater.lazySet(c5850, c58502);
        abstractC5851.f14506 = c58502;
        if (C3008.m74(atomicReferenceFieldUpdater, this, c58502, abstractC5851)) {
            return abstractC5851.mo9118(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public final void m18115(@InterfaceC6399 C5850 c5850, @InterfaceC6399 C5850 c58502) {
    }
}
