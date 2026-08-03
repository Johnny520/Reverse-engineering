package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6311 implements InterfaceC6310, InterfaceC7288<Object, InterfaceC6310> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15897 = AtomicReferenceFieldUpdater.newUpdater(C6311.class, Object.class, "_state");

    @InterfaceC6399
    volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ */
    public final class C0961 extends AbstractC6314 {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3665<C8107> f15898;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C6312 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C6311 f15900;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0961 f15901;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6312(C6311 c6311, C0961 c0961) {
                super(1);
                this.f15900 = c6311;
                this.f15901 = c0961;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // Yue.InterfaceC5124
            public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
                m19626(th);
                return C8107.f3222;
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final void m19626(@InterfaceC6399 Throwable th) {
                this.f15900.mo19616(this.f15901.f15908);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۟ۨ۟<? super Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0961(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
            super(obj);
            this.f15898 = interfaceC3665;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "LockCont[" + this.f15908 + ", " + this.f15898 + "] for " + C6311.this;
        }

        @Override // Yue.C6311.AbstractC6314
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo19624() {
            this.f15898.mo10022(C3667.f6491);
        }

        @Override // Yue.C6311.AbstractC6314
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public boolean mo19625() {
            return m19628() && this.f15898.mo10019(C8107.f3222, null, new C6312(C6311.this, this)) != null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟ */
    public final class C0962<R> extends AbstractC6314 {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC7289<R> f15902;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC5138<InterfaceC6310, InterfaceC4199<? super R>, Object> f15903;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C6313 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C6311 f15905;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0962<R> f15906;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6313(C6311 c6311, C0962<R> c0962) {
                super(1);
                this.f15905 = c6311;
                this.f15906 = c0962;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // Yue.InterfaceC5124
            public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
                m19627(th);
                return C8107.f3222;
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final void m19627(@InterfaceC6399 Throwable th) {
                this.f15905.mo19616(this.f15906.f15908);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۡۨ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۡۧۧ, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0962(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super InterfaceC6310, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
            super(obj);
            this.f15902 = interfaceC7289;
            this.f15903 = interfaceC5138;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "LockSelect[" + this.f15908 + ", " + this.f15902 + "] for " + C6311.this;
        }

        @Override // Yue.C6311.AbstractC6314
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo19624() throws Throwable {
            C3672.m10062(this.f15903, C6311.this, this.f15902.mo22762(), new C6313(C6311.this, this));
        }

        @Override // Yue.C6311.AbstractC6314
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public boolean mo19625() {
            return m19628() && this.f15902.mo22760();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟, reason: contains not printable characters */
    public abstract class AbstractC6314 extends C5850 implements InterfaceC4433 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f15907 = AtomicIntegerFieldUpdater.newUpdater(AbstractC6314.class, "isTaken");

        @InterfaceC6399
        private volatile /* synthetic */ int isTaken = 0;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public final Object f15908;

        public AbstractC6314(@InterfaceC6489 Object obj) {
            this.f15908 = obj;
        }

        @Override // Yue.InterfaceC4433
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public final void mo5757() {
            mo18079();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public abstract void mo19624();

        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public final boolean m19628() {
            return f15907.compareAndSet(this, 0, 1);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public abstract boolean mo19625();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C6315 extends C5848 {

        @InterfaceC6399
        @InterfaceC5568
        public volatile Object owner;

        public C6315(@InterfaceC6399 Object obj) {
            this.owner = obj;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C6316 extends AbstractC3446 {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C6311 f1992;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public final Object f15910;

        /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ */
        public final class C0963 extends AbstractC6567 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public final AbstractC3450<?> f1993;

            public C0963(@InterfaceC6399 AbstractC3450<?> abstractC3450) {
                this.f1993 = abstractC3450;
            }

            @Override // Yue.AbstractC6567
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public AbstractC3450<?> mo528() {
                return this.f1993;
            }

            @Override // Yue.AbstractC6567
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟ */
            public Object mo9118(@InterfaceC6489 Object obj) {
                Object objMo528 = mo528().m9123() ? C6319.f15916 : mo528();
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                }
                C3008.m74(C6311.f15897, (C6311) obj, this, objMo528);
                return null;
            }
        }

        public C6316(@InterfaceC6399 C6311 c6311, @InterfaceC6489 Object obj) {
            this.f1992 = c6311;
            this.f15910 = obj;
        }

        @Override // Yue.AbstractC3446
        /* JADX INFO: renamed from: ۥ */
        public void mo520(@InterfaceC6399 AbstractC3450<?> abstractC3450, @InterfaceC6489 Object obj) {
            C4627 c4627;
            if (obj != null) {
                c4627 = C6319.f15916;
            } else {
                Object obj2 = this.f15910;
                c4627 = obj2 == null ? C6319.f15915 : new C4627(obj2);
            }
            C3008.m74(C6311.f15897, this.f1992, abstractC3450, c4627);
        }

        @Override // Yue.AbstractC3446
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Object mo9104(@InterfaceC6399 AbstractC3450<?> abstractC3450) {
            C0963 c0963 = new C0963(abstractC3450);
            return !C3008.m74(C6311.f15897, this.f1992, C6319.f15916, c0963) ? C6319.f1996 : c0963.mo9118(this.f1992);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C6317 extends AbstractC3450<C6311> {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C6315 f1995;

        public C6317(@InterfaceC6399 C6315 c6315) {
            this.f1995 = c6315;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // Yue.AbstractC3450
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9119(@InterfaceC6399 C6311 c6311, @InterfaceC6489 Object obj) {
            C3008.m74(C6311.f15897, c6311, this, obj == null ? C6319.f15916 : this.f1995);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo5762(@InterfaceC6399 C6311 c6311) {
            if (this.f1995.m18081()) {
                return null;
            }
            return C6319.f1997;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C6318 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Object f15912;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6318(Object obj) {
            super(1);
            this.f15912 = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m19631(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m19631(@InterfaceC6399 Throwable th) {
            C6311.this.mo19616(this.f15912);
        }
    }

    public C6311(boolean z) {
        this._state = z ? C6319.f15915 : C6319.f15916;
    }

    @InterfaceC6399
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C4627) {
                return "Mutex[" + ((C4627) obj).f1025 + ']';
            }
            if (!(obj instanceof AbstractC6567)) {
                if (!(obj instanceof C6315)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((C6315) obj).owner + ']';
            }
            ((AbstractC6567) obj).mo9118(this);
        }
    }

    @Override // Yue.InterfaceC6310
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo2777(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM19623;
        return (!mo2778(obj) && (objM19623 = m19623(obj, interfaceC4199)) == C5508.m17142()) ? objM19623 : C8107.f3222;
    }

    @Override // Yue.InterfaceC6310
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo2778(@InterfaceC6489 Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C4627) {
                if (((C4627) obj2).f1025 != C6319.f15914) {
                    return false;
                }
                if (C3008.m74(f15897, this, obj2, obj == null ? C6319.f15915 : new C4627(obj))) {
                    return true;
                }
            } else {
                if (obj2 instanceof C6315) {
                    if (((C6315) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof AbstractC6567)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((AbstractC6567) obj2).mo9118(this);
            }
        }
    }

    @Override // Yue.InterfaceC6310
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo19615() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C4627) {
                return ((C4627) obj).f1025 != C6319.f15914;
            }
            if (obj instanceof C6315) {
                return true;
            }
            if (!(obj instanceof AbstractC6567)) {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
            ((AbstractC6567) obj).mo9118(this);
        }
    }

    @Override // Yue.InterfaceC6310
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo19616(@InterfaceC6489 Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C4627) {
                if (obj != null) {
                    C4627 c4627 = (C4627) obj2;
                    if (c4627.f1025 != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + c4627.f1025 + " but expected " + obj).toString());
                    }
                } else if (((C4627) obj2).f1025 == C6319.f15914) {
                    throw new IllegalStateException("Mutex is not locked".toString());
                }
                if (C3008.m74(f15897, this, obj2, C6319.f15916)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC6567) {
                ((AbstractC6567) obj2).mo9118(this);
            } else {
                if (!(obj2 instanceof C6315)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    C6315 c6315 = (C6315) obj2;
                    if (c6315.owner != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + c6315.owner + " but expected " + obj).toString());
                    }
                }
                C6315 c63152 = (C6315) obj2;
                C5850 c5850M18111 = c63152.m18111();
                if (c5850M18111 == null) {
                    C6317 c6317 = new C6317(c63152);
                    if (C3008.m74(f15897, this, obj2, c6317) && c6317.mo9118(this) == null) {
                        return;
                    }
                } else {
                    AbstractC6314 abstractC6314 = (AbstractC6314) c5850M18111;
                    if (abstractC6314.mo19625()) {
                        Object obj3 = abstractC6314.f15908;
                        if (obj3 == null) {
                            obj3 = C6319.f15913;
                        }
                        c63152.owner = obj3;
                        abstractC6314.mo19624();
                        return;
                    }
                }
            }
        }
    }

    @Override // Yue.InterfaceC6310
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo19617(@InterfaceC6399 Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof C4627) {
            if (((C4627) obj2).f1025 == obj) {
                return true;
            }
        } else if ((obj2 instanceof C6315) && ((C6315) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    @Override // Yue.InterfaceC6310
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public InterfaceC7288<Object, InterfaceC6310> mo19618() {
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m19622() {
        Object obj = this._state;
        return (obj instanceof C6315) && ((C6315) obj).m18081();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        Yue.C3668.m10054(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r7 = r0.m10039();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r7 != Yue.C5508.m17142()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        Yue.C4324.m12513(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7 != Yue.C5508.m17142()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        return Yue.C8107.f3222;
     */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19623(Object obj, InterfaceC4199<? super C8107> interfaceC4199) {
        C3666 c3666M736 = C3668.m736(C5501.m17135(interfaceC4199));
        C0961 c0961 = new C0961(obj, c3666M736);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C4627) {
                C4627 c4627 = (C4627) obj2;
                if (c4627.f1025 != C6319.f15914) {
                    C3008.m74(f15897, this, obj2, new C6315(c4627.f1025));
                } else {
                    if (C3008.m74(f15897, this, obj2, obj == null ? C6319.f15915 : new C4627(obj))) {
                        c3666M736.mo10014(C8107.f3222, new C6318(obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C6315) {
                C6315 c6315 = (C6315) obj2;
                if (c6315.owner == obj) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                c6315.m18093(c0961);
                if (this._state == obj2 || !c0961.m19628()) {
                    break;
                }
                c0961 = new C0961(obj, c3666M736);
            } else {
                if (!(obj2 instanceof AbstractC6567)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((AbstractC6567) obj2).mo9118(this);
            }
        }
    }

    @Override // Yue.InterfaceC7288
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public <R> void mo5880(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5138<? super InterfaceC6310, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        while (!interfaceC7289.mo22761()) {
            Object obj2 = this._state;
            if (obj2 instanceof C4627) {
                C4627 c4627 = (C4627) obj2;
                if (c4627.f1025 != C6319.f15914) {
                    C3008.m74(f15897, this, obj2, new C6315(c4627.f1025));
                } else {
                    Object objMo22759 = interfaceC7289.mo22759(new C6316(this, obj));
                    if (objMo22759 == null) {
                        C8103.m26704(interfaceC5138, this, interfaceC7289.mo22762());
                        return;
                    }
                    if (objMo22759 == C7291.m22775()) {
                        return;
                    }
                    if (objMo22759 != C6319.f1996 && objMo22759 != C3449.f296) {
                        throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + objMo22759).toString());
                    }
                }
            } else if (obj2 instanceof C6315) {
                C6315 c6315 = (C6315) obj2;
                if (c6315.owner == obj) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                C0962 c0962 = new C0962(obj, interfaceC7289, interfaceC5138);
                c6315.m18093(c0962);
                if (this._state == obj2 || !c0962.m19628()) {
                    interfaceC7289.mo22764(c0962);
                    return;
                }
            } else {
                if (!(obj2 instanceof AbstractC6567)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((AbstractC6567) obj2).mo9118(this);
            }
        }
    }
}
