package Yue;

import Yue.InterfaceC5542;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public class C3666<T> extends AbstractC4419<T> implements InterfaceC3665<T>, InterfaceC4246 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6485 = AtomicIntegerFieldUpdater.newUpdater(C3666.class, "_decision");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6486 = AtomicReferenceFieldUpdater.newUpdater(C3666.class, Object.class, "_state");

    @InterfaceC6399
    private volatile /* synthetic */ int _decision;

    @InterfaceC6399
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<T> f6487;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f6488;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4433 f6489;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3666(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, int i) {
        super(i);
        this.f6487 = interfaceC4199;
        this.f6488 = interfaceC4199.getContext();
        this._decision = 0;
        this._state = C3088.f4608;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    private final boolean m10023() {
        return C4420.m12847(this.f9148) && ((C4416) this.f6487).m12829();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۣ۟ۨ۠ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10024(C3666 c3666, Object obj, int i, InterfaceC5124 interfaceC5124, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            interfaceC5124 = null;
        }
        c3666.m10049(obj, i, interfaceC5124);
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<T> interfaceC4199 = this.f6487;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return this.f6488;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.InterfaceC3665
    public boolean isCancelled() {
        return m10040() instanceof C3675;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        m10024(this, C4056.m1010(obj, this), this.f9148, null, 4, null);
    }

    @InterfaceC6399
    public String toString() {
        return mo10045() + '(' + C4325.m12514(this.f6487) + "){" + m10041() + "}@" + C4325.m1289(this);
    }

    @Override // Yue.AbstractC4419
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo733(@InterfaceC6489 Object obj, @InterfaceC6399 Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC6397) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C4050) {
                return;
            }
            if (obj2 instanceof C4048) {
                C4048 c4048 = (C4048) obj2;
                if (!(!c4048.m11481())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C3008.m74(f6486, this, obj2, C4048.m11476(c4048, null, null, null, null, th, 15, null))) {
                    c4048.m11482(this, th);
                    return;
                }
            } else if (C3008.m74(f6486, this, obj2, new C4048(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo10011(@InterfaceC6489 Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC6397)) {
                return false;
            }
            z = obj instanceof AbstractC3661;
        } while (!C3008.m74(f6486, this, obj, new C3675(this, th, z)));
        AbstractC3661 abstractC3661 = z ? (AbstractC3661) obj : null;
        if (abstractC3661 != null) {
            m10030(abstractC3661, th);
        }
        m10036();
        m10037(this.f9148);
        return true;
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo10012() {
        return m10040() instanceof InterfaceC6397;
    }

    @Override // Yue.AbstractC4419
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final InterfaceC4199<T> mo10025() {
        return this.f6487;
    }

    @Override // Yue.AbstractC4419
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Throwable mo10026(@InterfaceC6489 Object obj) {
        Throwable thMo10026 = super.mo10026(obj);
        if (thMo10026 != null) {
            return thMo10026;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.AbstractC4419
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public <T> T mo10027(@InterfaceC6489 Object obj) {
        return obj instanceof C4048 ? (T) ((C4048) obj).f634 : obj;
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo10013() {
        return !(m10040() instanceof InterfaceC6397);
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo10014(T t, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        m10049(t, this.f9148, interfaceC5124);
    }

    @Override // Yue.InterfaceC3665
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public Object mo10015(T t, @InterfaceC6489 Object obj) {
        return m10052(t, obj, null);
    }

    @Override // Yue.AbstractC4419
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Object mo10028() {
        return m10040();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Void m10029(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m10030(@InterfaceC6399 AbstractC3661 abstractC3661, @InterfaceC6489 Throwable th) {
        try {
            abstractC3661.mo5758(th);
        } catch (Throwable th2) {
            C4236.m1201(getContext(), new C4053("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m10031(InterfaceC5124<? super Throwable, C8107> interfaceC5124, Throwable th) {
        try {
            interfaceC5124.invoke(th);
        } catch (Throwable th2) {
            C4236.m1201(getContext(), new C4053("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m10032(InterfaceC5122<C8107> interfaceC5122) {
        try {
            interfaceC5122.invoke();
        } catch (Throwable th) {
            C4236.m1201(getContext(), new C4053("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo10016(@InterfaceC6399 AbstractC4232 abstractC4232, T t) {
        InterfaceC4199<T> interfaceC4199 = this.f6487;
        C4416 c4416 = interfaceC4199 instanceof C4416 ? (C4416) interfaceC4199 : null;
        m10024(this, t, (c4416 != null ? c4416.f9143 : null) == abstractC4232 ? 4 : this.f9148, null, 4, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m10033(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6399 Throwable th) {
        try {
            interfaceC5124.invoke(th);
        } catch (Throwable th2) {
            C4236.m1201(getContext(), new C4053("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo10017(@InterfaceC6399 AbstractC4232 abstractC4232, @InterfaceC6399 Throwable th) {
        InterfaceC4199<T> interfaceC4199 = this.f6487;
        C4416 c4416 = interfaceC4199 instanceof C4416 ? (C4416) interfaceC4199 : null;
        m10024(this, new C4050(th, false, 2, null), (c4416 != null ? c4416.f9143 : null) == abstractC4232 ? 4 : this.f9148, null, 4, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m10034(Throwable th) {
        if (m10023()) {
            return ((C4416) this.f6487).m12830(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m10035() {
        InterfaceC4433 interfaceC4433 = this.f6489;
        if (interfaceC4433 == null) {
            return;
        }
        interfaceC4433.mo5757();
        this.f6489 = C6389.f16164;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m10036() {
        if (m10023()) {
            return;
        }
        m10035();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m10037(int i) {
        if (m10051()) {
            return;
        }
        C4420.m1367(this, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Throwable mo10038(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        return interfaceC5542.mo17161();
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final Object m10039() {
        InterfaceC5542 interfaceC5542;
        boolean zM10023 = m10023();
        if (m10053()) {
            if (this.f6489 == null) {
                m10042();
            }
            if (zM10023) {
                m10047();
            }
            return C5508.m17142();
        }
        if (zM10023) {
            m10047();
        }
        Object objM10040 = m10040();
        if (objM10040 instanceof C4050) {
            throw ((C4050) objM10040).f637;
        }
        if (!C4420.m12846(this.f9148) || (interfaceC5542 = (InterfaceC5542) getContext().get(InterfaceC5542.f13507)) == null || interfaceC5542.mo5773()) {
            return mo10027(objM10040);
        }
        CancellationException cancellationExceptionMo17161 = interfaceC5542.mo17161();
        mo733(objM10040, cancellationExceptionMo17161);
        throw cancellationExceptionMo17161;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Object m10040() {
        return this._state;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final String m10041() {
        Object objM10040 = m10040();
        return objM10040 instanceof InterfaceC6397 ? "Active" : objM10040 instanceof C3675 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final InterfaceC4433 m10042() {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) getContext().get(InterfaceC5542.f13507);
        if (interfaceC5542 == null) {
            return null;
        }
        InterfaceC4433 interfaceC4433M17169 = InterfaceC5542.C0790.m17169(interfaceC5542, true, false, new C3813(this), 2, null);
        this.f6489 = interfaceC4433M17169;
        return interfaceC4433M17169;
    }

    @Override // Yue.InterfaceC3665
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public Object mo10018(@InterfaceC6399 Throwable th) {
        return m10052(new C4050(th, false, 2, null), null, null);
    }

    @Override // Yue.InterfaceC3665
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Object mo10019(T t, @InterfaceC6489 Object obj, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return m10052(t, obj, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final AbstractC3661 m10043(InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return interfaceC5124 instanceof AbstractC3661 ? (AbstractC3661) interfaceC5124 : new C5514(interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m10044(InterfaceC5124<? super Throwable, C8107> interfaceC5124, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC5124 + ", already has " + obj).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public String mo10045() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m10046(@InterfaceC6399 Throwable th) {
        if (m10034(th)) {
            return;
        }
        mo10011(th);
        m10036();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m10047() {
        Throwable thM12835;
        InterfaceC4199<T> interfaceC4199 = this.f6487;
        C4416 c4416 = interfaceC4199 instanceof C4416 ? (C4416) interfaceC4199 : null;
        if (c4416 == null || (thM12835 = c4416.m12835(this)) == null) {
            return;
        }
        m10035();
        mo10011(thM12835);
    }

    @InterfaceC5572(name = "resetStateReusable")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m10048() {
        Object obj = this._state;
        if ((obj instanceof C4048) && ((C4048) obj).f8118 != null) {
            m10035();
            return false;
        }
        this._decision = 0;
        this._state = C3088.f4608;
        return true;
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public void mo10020() {
        InterfaceC4433 interfaceC4433M10042 = m10042();
        if (interfaceC4433M10042 != null && mo10013()) {
            interfaceC4433M10042.mo5757();
            this.f6489 = C6389.f16164;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m10049(Object obj, int i, InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof InterfaceC6397)) {
                if (obj2 instanceof C3675) {
                    C3675 c3675 = (C3675) obj2;
                    if (c3675.m10069()) {
                        if (interfaceC5124 != null) {
                            m10033(interfaceC5124, c3675.f637);
                            return;
                        }
                        return;
                    }
                }
                m10029(obj);
                throw new C5667();
            }
        } while (!C3008.m74(f6486, this, obj2, m10050((InterfaceC6397) obj2, obj, i, interfaceC5124, null)));
        m10036();
        m10037(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final Object m10050(InterfaceC6397 interfaceC6397, Object obj, int i, InterfaceC5124<? super Throwable, C8107> interfaceC5124, Object obj2) {
        if (obj instanceof C4050) {
            return obj;
        }
        if (!C4420.m12846(i) && obj2 == null) {
            return obj;
        }
        if (interfaceC5124 != null || (((interfaceC6397 instanceof AbstractC3661) && !(interfaceC6397 instanceof AbstractC3529)) || obj2 != null)) {
            return new C4048(obj, interfaceC6397 instanceof AbstractC3661 ? (AbstractC3661) interfaceC6397 : null, interfaceC5124, obj2, null, 16, null);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m10051() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f6485.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final C7694 m10052(Object obj, Object obj2, InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof InterfaceC6397)) {
                if ((obj3 instanceof C4048) && obj2 != null && ((C4048) obj3).f8118 == obj2) {
                    return C3667.f6491;
                }
                return null;
            }
        } while (!C3008.m74(f6486, this, obj3, m10050((InterfaceC6397) obj3, obj, this.f9148, interfaceC5124, obj2)));
        m10036();
        return C3667.f6491;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final boolean m10053() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f6485.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo10021(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        AbstractC3661 abstractC3661M10043 = m10043(interfaceC5124);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C3088) {
                if (C3008.m74(f6486, this, obj, abstractC3661M10043)) {
                    return;
                }
            } else if (obj instanceof AbstractC3661) {
                m10044(interfaceC5124, obj);
            } else {
                if (obj instanceof C4050) {
                    C4050 c4050 = (C4050) obj;
                    if (!c4050.m1003()) {
                        m10044(interfaceC5124, obj);
                    }
                    if (obj instanceof C3675) {
                        if (!(obj instanceof C4050)) {
                            c4050 = null;
                        }
                        m10031(interfaceC5124, c4050 != null ? c4050.f637 : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof C4048) {
                    C4048 c4048 = (C4048) obj;
                    if (c4048.f635 != null) {
                        m10044(interfaceC5124, obj);
                    }
                    if (abstractC3661M10043 instanceof AbstractC3529) {
                        return;
                    }
                    if (c4048.m11481()) {
                        m10031(interfaceC5124, c4048.f8119);
                        return;
                    } else {
                        if (C3008.m74(f6486, this, obj, C4048.m11476(c4048, null, abstractC3661M10043, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (abstractC3661M10043 instanceof AbstractC3529) {
                        return;
                    }
                    if (C3008.m74(f6486, this, obj, new C4048(obj, abstractC3661M10043, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // Yue.InterfaceC3665
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public void mo10022(@InterfaceC6399 Object obj) {
        m10037(this.f9148);
    }
}
