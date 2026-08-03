package Yue;

import Yue.C5850;
import Yue.C7148;
import Yue.InterfaceC5542;
import Yue.InterfaceC7281;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public final class C7282<R> extends C5848 implements InterfaceC7281<R>, InterfaceC7289<R>, InterfaceC4199<R>, InterfaceC4246 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21964 = AtomicReferenceFieldUpdater.newUpdater(C7282.class, Object.class, "_state");

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21965 = AtomicReferenceFieldUpdater.newUpdater(C7282.class, Object.class, "_result");

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<R> f21966;

    @InterfaceC6399
    volatile /* synthetic */ Object _state = C7291.m22777();

    @InterfaceC6399
    private volatile /* synthetic */ Object _result = C7291.f21975;

    @InterfaceC6399
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ */
    public static final class C1222 extends AbstractC3450<Object> {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        @InterfaceC5568
        public final C7282<?> f2783;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final AbstractC3446 f21967;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f21968 = C7291.f21977.m3573();

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۨ۟۟.ۥ۟():Yue.ۥۡۨۡۨ */
        public C1222(@InterfaceC6399 C7282<?> c7282, @InterfaceC6399 AbstractC3446 abstractC3446) {
            this.f2783 = c7282;
            this.f21967 = abstractC3446;
            abstractC3446.m9105(this);
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6399
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo9122() + ')';
        }

        @Override // Yue.AbstractC3450
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo9119(@InterfaceC6489 Object obj, @InterfaceC6489 Object obj2) {
            m22771(obj2);
            this.f21967.mo520(this, obj2);
        }

        @Override // Yue.AbstractC3450
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public long mo9122() {
            return this.f21968;
        }

        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public Object mo5762(@InterfaceC6489 Object obj) {
            Object objM22772;
            if (obj == null && (objM22772 = m22772()) != null) {
                return objM22772;
            }
            try {
                return this.f21967.mo9104(this);
            } catch (Throwable th) {
                if (obj == null) {
                    m22773();
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m22771(Object obj) {
            boolean z = obj == null;
            if (C3008.m74(C7282.f21964, this.f2783, this, z ? null : C7291.m22777()) && z) {
                this.f2783.m22765();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final Object m22772() {
            C7282<?> c7282 = this.f2783;
            while (true) {
                Object obj = c7282._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof AbstractC6567) {
                    ((AbstractC6567) obj).mo9118(this.f2783);
                } else {
                    if (obj != C7291.m22777()) {
                        return C7291.m22775();
                    }
                    if (C3008.m74(C7282.f21964, this.f2783, C7291.m22777(), this)) {
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m22773() {
            C3008.m74(C7282.f21964, this.f2783, this, C7291.m22777());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟ */
    public static final class C1223 extends C5850 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC4433 f21969;

        public C1223(@InterfaceC6399 InterfaceC4433 interfaceC4433) {
            this.f21969 = interfaceC4433;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7283 extends AbstractC6567 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        @InterfaceC5568
        public final C5850.C5852 f2784;

        public C7283(@InterfaceC6399 C5850.C5852 c5852) {
            this.f2784 = c5852;
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public AbstractC3450<?> mo528() {
            return this.f2784.mo528();
        }

        @Override // Yue.AbstractC6567
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Object mo9118(@InterfaceC6489 Object obj) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            }
            C7282 c7282 = (C7282) obj;
            this.f2784.m18124();
            Object objM9120 = this.f2784.mo528().m9120(null);
            C3008.m74(C7282.f21964, c7282, this, objM9120 == null ? this.f2784.f14507 : C7291.m22777());
            return objM9120;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C7284 extends AbstractC5544 {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C7284() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            mo9329(th);
            return C8107.f3222;
        }

        @Override // Yue.AbstractC4052
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo9329(@InterfaceC6489 Throwable th) {
            if (C7282.this.mo22760()) {
                C7282.this.mo22763(m17241().mo17161());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class RunnableC7285 implements Runnable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124 f21972;

        public RunnableC7285(InterfaceC5124 interfaceC5124) {
            this.f21972 = interfaceC5124;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (C7282.this.mo22760()) {
                C3672.m10061(this.f21972, C7282.this.mo22762());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7282(@InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        this.f21966 = interfaceC4199;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    private final void m22756() {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) getContext().get(InterfaceC5542.f13507);
        if (interfaceC5542 == null) {
            return;
        }
        InterfaceC4433 interfaceC4433M17169 = InterfaceC5542.C0790.m17169(interfaceC5542, true, false, new C7284(), 2, null);
        m22770(interfaceC4433M17169);
        if (mo22761()) {
            interfaceC4433M17169.mo5757();
        }
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<R> interfaceC4199 = this.f21966;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return this.f21966.getContext();
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        while (true) {
            Object obj2 = this._result;
            if (obj2 == C7291.f21975) {
                if (C3008.m74(f21965, this, C7291.f21975, C4056.m11487(obj, null, 1, null))) {
                    return;
                }
            } else {
                if (obj2 != C5508.m17142()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C3008.m74(f21965, this, C5508.m17142(), C7291.f21976)) {
                    if (!C7148.m22407(obj)) {
                        this.f21966.resumeWith(obj);
                        return;
                    }
                    InterfaceC4199<R> interfaceC4199 = this.f21966;
                    Throwable thM22403 = C7148.m22403(obj);
                    C5499.m17100(thM22403);
                    C7148.C1189 c1189 = C7148.f21560;
                    interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(thM22403)));
                    return;
                }
            }
        }
    }

    @Override // Yue.C5850
    @InterfaceC6399
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        m22765();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return Yue.C3667.f6491;
     */
    @Override // Yue.InterfaceC7289
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22758(@InterfaceC6489 C5850.C5852 c5852) {
        while (true) {
            Object obj = this._state;
            if (obj == C7291.m22777()) {
                if (c5852 != null) {
                    C7283 c7283 = new C7283(c5852);
                    if (C3008.m74(f21964, this, C7291.m22777(), c7283)) {
                        Object objMo9118 = c7283.mo9118(this);
                        if (objMo9118 != null) {
                            return objMo9118;
                        }
                    }
                } else if (C3008.m74(f21964, this, C7291.m22777(), null)) {
                    break;
                }
            } else {
                if (!(obj instanceof AbstractC6567)) {
                    if (c5852 != null && obj == c5852.f14507) {
                        return C3667.f6491;
                    }
                    return null;
                }
                if (c5852 != null) {
                    AbstractC3450<?> abstractC3450Mo528 = c5852.mo528();
                    if ((abstractC3450Mo528 instanceof C1222) && ((C1222) abstractC3450Mo528).f2783 == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (abstractC3450Mo528.m3028((AbstractC6567) obj)) {
                        return C3449.f296;
                    }
                }
                ((AbstractC6567) obj).mo9118(this);
            }
        }
    }

    @Override // Yue.InterfaceC7289
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Object mo22759(@InterfaceC6399 AbstractC3446 abstractC3446) {
        return new C1222(this, abstractC3446).mo9118(null);
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo22751(@InterfaceC6399 InterfaceC7286 interfaceC7286, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
        interfaceC7286.mo17250(this, interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Q, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public <Q> void mo22752(@InterfaceC6399 InterfaceC7287<? extends Q> interfaceC7287, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        interfaceC7287.mo5764(this, interfaceC5138);
    }

    @Override // Yue.InterfaceC7289
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean mo22760() {
        Object objMo22758 = mo22758(null);
        if (objMo22758 == C3667.f6491) {
            return true;
        }
        if (objMo22758 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + objMo22758).toString());
    }

    @Override // Yue.InterfaceC7289
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean mo22761() {
        while (true) {
            Object obj = this._state;
            if (obj == C7291.m22777()) {
                return false;
            }
            if (!(obj instanceof AbstractC6567)) {
                return true;
            }
            ((AbstractC6567) obj).mo9118(this);
        }
    }

    @Override // Yue.InterfaceC7289
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public InterfaceC4199<R> mo22762() {
        return this;
    }

    @Override // Yue.InterfaceC7289
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void mo22763(@InterfaceC6399 Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == C7291.f21975) {
                if (C3008.m74(f21965, this, C7291.f21975, new C4050(th, false, 2, null))) {
                    return;
                }
            } else {
                if (obj != C5508.m17142()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C3008.m74(f21965, this, C5508.m17142(), C7291.f21976)) {
                    InterfaceC4199 interfaceC4199M17135 = C5501.m17135(this.f21966);
                    C7148.C1189 c1189 = C7148.f21560;
                    interfaceC4199M17135.resumeWith(C7148.m3438(C7149.m3441(th)));
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: P */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Q, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public <P, Q> void mo22753(@InterfaceC6399 InterfaceC7288<? super P, ? extends Q> interfaceC7288, P p, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        interfaceC7288.mo5880(this, p, interfaceC5138);
    }

    @Override // Yue.InterfaceC7289
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void mo22764(@InterfaceC6399 InterfaceC4433 interfaceC4433) {
        C1223 c1223 = new C1223(interfaceC4433);
        if (!mo22761()) {
            m18093(c1223);
            if (!mo22761()) {
                return;
            }
        }
        interfaceC4433.mo5757();
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo22754(long j, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
        if (j > 0) {
            mo22764(C4365.m12620(getContext()).mo12587(j, new RunnableC7285(interfaceC5124), getContext()));
        } else if (mo22760()) {
            C8103.m26703(interfaceC5124, mo22762());
        }
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public <P, Q> void mo22755(@InterfaceC6399 InterfaceC7288<? super P, ? extends Q> interfaceC7288, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        InterfaceC7281.C1221.m3545(this, interfaceC7288, interfaceC5138);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public final void m22765() {
        InterfaceC4433 interfaceC4433M22767 = m22767();
        if (interfaceC4433M22767 != null) {
            interfaceC4433M22767.mo5757();
        }
        for (C5850 c5850M18105 = (C5850) m18104(); !C5499.m17094(c5850M18105, this); c5850M18105 = c5850M18105.m18105()) {
            if (c5850M18105 instanceof C1223) {
                ((C1223) c5850M18105).f21969.mo5757();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final void m22766(InterfaceC5122<? extends Object> interfaceC5122, InterfaceC5122<C8107> interfaceC51222) {
        while (true) {
            Object obj = this._result;
            if (obj == C7291.f21975) {
                if (C3008.m74(f21965, this, C7291.f21975, interfaceC5122.invoke())) {
                    return;
                }
            } else {
                if (obj != C5508.m17142()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C3008.m74(f21965, this, C5508.m17142(), C7291.f21976)) {
                    interfaceC51222.invoke();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final InterfaceC4433 m22767() {
        return (InterfaceC4433) this._parentHandle;
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final Object m22768() throws Throwable {
        if (!mo22761()) {
            m22756();
        }
        Object obj = this._result;
        if (obj == C7291.f21975) {
            if (C3008.m74(f21965, this, C7291.f21975, C5508.m17142())) {
                return C5508.m17142();
            }
            obj = this._result;
        }
        if (obj == C7291.f21976) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof C4050) {
            throw ((C4050) obj).f637;
        }
        return obj;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m22769(@InterfaceC6399 Throwable th) throws Throwable {
        if (mo22760()) {
            C7148.C1189 c1189 = C7148.f21560;
            resumeWith(C7148.m3438(C7149.m3441(th)));
        } else {
            if (th instanceof CancellationException) {
                return;
            }
            Object objM22768 = m22768();
            if ((objM22768 instanceof C4050) && ((C4050) objM22768).f637 == th) {
                return;
            }
            C4236.m1201(getContext(), th);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m22770(InterfaceC4433 interfaceC4433) {
        this._parentHandle = interfaceC4433;
    }
}
