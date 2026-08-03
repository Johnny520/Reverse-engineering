package Yue;

import Yue.C5850;
import Yue.C7148;
import Yue.InterfaceC7317;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3009<E> implements InterfaceC7317<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4366 = AtomicReferenceFieldUpdater.newUpdater(AbstractC3009.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final InterfaceC5124<E, C8107> f4367;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5848 f4368 = new C5848();

    @InterfaceC6399
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ */
    public static final class C0025<E> extends AbstractC7312 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC5568
        public final E f4369;

        public C0025(E e) {
            this.f4369 = e;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "SendBuffered@" + C4325.m1289(this) + '(' + this.f4369 + ')';
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo5874() {
        }

        @Override // Yue.AbstractC7312
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public Object mo5875() {
            return this.f4369;
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public void mo5876(@InterfaceC6399 C3850<?> c3850) {
        }

        @Override // Yue.AbstractC7312
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public C7694 mo5877(@InterfaceC6489 C5850.C5852 c5852) {
            C7694 c7694 = C3667.f6491;
            if (c5852 != null) {
                c5852.m18124();
            }
            return c7694;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟ */
    public static class C0026<E> extends C5850.C0883<C0025<? extends E>> {
        public C0026(@InterfaceC6399 C5848 c5848, E e) {
            super(c5848, new C0025(e));
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo5759(@InterfaceC6399 C5850 c5850) {
            if (c5850 instanceof C3850) {
                return c5850;
            }
            if (c5850 instanceof InterfaceC7046) {
                return C2978.f4311;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3010<E, R> extends AbstractC7312 implements InterfaceC4433 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final E f4370;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final AbstractC3009<E> f4371;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC7289<R> f4372;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC5138<InterfaceC7317<? super E>, InterfaceC4199<? super R>, Object> f4373;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۡۨ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۨۡ۠<? super E>, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3010(E e, @InterfaceC6399 AbstractC3009<E> abstractC3009, @InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
            this.f4370 = e;
            this.f4371 = abstractC3009;
            this.f4372 = interfaceC7289;
            this.f4373 = interfaceC5138;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "SendSelect@" + C4325.m1289(this) + '(' + mo5875() + ")[" + this.f4371 + ", " + this.f4372 + ']';
        }

        @Override // Yue.InterfaceC4433
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public void mo5757() {
            if (mo18079()) {
                mo5878();
            }
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo5874() throws Throwable {
            C3672.m10063(this.f4373, this.f4371, this.f4372.mo22762(), null, 4, null);
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public E mo5875() {
            return this.f4370;
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo5876(@InterfaceC6399 C3850<?> c3850) {
            if (this.f4372.mo22760()) {
                this.f4372.mo22763(c3850.m10658());
            }
        }

        @Override // Yue.AbstractC7312
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
        public C7694 mo5877(@InterfaceC6489 C5850.C5852 c5852) {
            return (C7694) this.f4372.mo22758(c5852);
        }

        @Override // Yue.AbstractC7312
        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public void mo5878() {
            InterfaceC5124<E, C8107> interfaceC5124 = this.f4371.f4367;
            if (interfaceC5124 != null) {
                C6560.m3021(interfaceC5124, mo5875(), this.f4372.mo22762().getContext());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3011<E> extends C5850.C5853<InterfaceC7046<? super E>> {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC5568
        public final E f4374;

        public C3011(E e, @InterfaceC6399 C5848 c5848) {
            super(c5848);
            this.f4374 = e;
        }

        @Override // Yue.C5850.C5853, Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo5759(@InterfaceC6399 C5850 c5850) {
            if (c5850 instanceof C3850) {
                return c5850;
            }
            if (c5850 instanceof InterfaceC7046) {
                return null;
            }
            return C2978.f4311;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public Object mo5760(@InterfaceC6399 C5850.C5852 c5852) {
            C7694 c7694Mo5752 = ((InterfaceC7046) c5852.f1732).mo5752(this.f4374, c5852);
            if (c7694Mo5752 == null) {
                return C5856.f1735;
            }
            Object obj = C3449.f296;
            if (c7694Mo5752 == obj) {
                return obj;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C3012 extends C5850.AbstractC5851 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3009 f4375;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3012(C5850 c5850, AbstractC3009 abstractC3009) {
            super(c5850);
            this.f4375 = abstractC3009;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo5762(@InterfaceC6399 C5850 c5850) {
            if (this.f4375.mo5862()) {
                return null;
            }
            return C5849.m2518();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3013 implements InterfaceC7288<E, InterfaceC7317<? super E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3009<E> f4376;

        public C3013(AbstractC3009<E> abstractC3009) {
            this.f4376 = abstractC3009;
        }

        @Override // Yue.InterfaceC7288
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public <R> void mo5880(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, E e, @InterfaceC6399 InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
            this.f4376.m5870(interfaceC7289, e, interfaceC5138);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super E, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3009(@InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        this.f4367 = interfaceC5124;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // Yue.InterfaceC7317
    public boolean offer(E e) {
        C8100 c8100M20875;
        try {
            return InterfaceC7317.C1231.m22855(this, e);
        } catch (Throwable th) {
            InterfaceC5124<E, C8107> interfaceC5124 = this.f4367;
            if (interfaceC5124 == null || (c8100M20875 = C6560.m20875(interfaceC5124, e, null, 2, null)) == null) {
                throw th;
            }
            C4741.m1656(c8100M20875, th);
            throw c8100M20875;
        }
    }

    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + '@' + C4325.m1289(this) + C6193.f1884 + m5853() + C6193.f1885 + mo5849();
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM5872;
        return (mo5865(e) != C2978.f4310 && (objM5872 = m5872(e, interfaceC4199)) == C5508.m17142()) ? objM5872 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m5845() {
        C5848 c5848 = this.f4368;
        int i = 0;
        for (C5850 c5850M18105 = (C5850) c5848.m18104(); !C5499.m17094(c5850M18105, c5848); c5850M18105 = c5850M18105.m18105()) {
            if (c5850M18105 instanceof C5850) {
                i++;
            }
        }
        return i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C5850.C0883<?> m5846(E e) {
        return new C0026(this.f4368, e);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C3011<E> m5847(E e) {
        return new C3011<>(e, this.f4368);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Object mo5848(@InterfaceC6399 AbstractC7312 abstractC7312) {
        int iM18114;
        C5850 c5850M18106;
        if (mo5861()) {
            C5850 c5850 = this.f4368;
            do {
                c5850M18106 = c5850.m18106();
                if (c5850M18106 instanceof InterfaceC7046) {
                    return c5850M18106;
                }
            } while (!c5850M18106.m18097(abstractC7312, c5850));
            return null;
        }
        C5850 c58502 = this.f4368;
        C3012 c3012 = new C3012(abstractC7312, this);
        do {
            C5850 c5850M181062 = c58502.m18106();
            if (c5850M181062 instanceof InterfaceC7046) {
                return c5850M181062;
            }
            iM18114 = c5850M181062.m18114(abstractC7312, c58502, c3012);
            if (iM18114 == 1) {
                return null;
            }
        } while (iM18114 != 2);
        return C2978.f4313;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public String mo5849() {
        return "";
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final C3850<?> m5850() {
        C5850 c5850M18105 = this.f4368.m18105();
        C3850<?> c3850 = c5850M18105 instanceof C3850 ? (C3850) c5850M18105 : null;
        if (c3850 == null) {
            return null;
        }
        m5854(c3850);
        return c3850;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C3850<?> m5851() {
        C5850 c5850M18106 = this.f4368.m18106();
        C3850<?> c3850 = c5850M18106 instanceof C3850 ? (C3850) c5850M18106 : null;
        if (c3850 == null) {
            return null;
        }
        m5854(c3850);
        return c3850;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final C5848 m5852() {
        return this.f4368;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final String m5853() {
        String string;
        C5850 c5850M18105 = this.f4368.m18105();
        if (c5850M18105 == this.f4368) {
            return "EmptyQueue";
        }
        if (c5850M18105 instanceof C3850) {
            string = c5850M18105.toString();
        } else if (c5850M18105 instanceof AbstractC7041) {
            string = "ReceiveQueued";
        } else if (c5850M18105 instanceof AbstractC7312) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + c5850M18105;
        }
        C5850 c5850M18106 = this.f4368.m18106();
        if (c5850M18106 == c5850M18105) {
            return string;
        }
        String str = string + ",queueSize=" + m5845();
        if (!(c5850M18106 instanceof C3850)) {
            return str;
        }
        return str + ",closedForSend=" + c5850M18106;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m5854(C3850<?> c3850) {
        Object objM16921 = C5436.m16921(null, 1, null);
        while (true) {
            C5850 c5850M18106 = c3850.m18106();
            AbstractC7041 abstractC7041 = c5850M18106 instanceof AbstractC7041 ? (AbstractC7041) c5850M18106 : null;
            if (abstractC7041 == null) {
                break;
            } else if (abstractC7041.mo18079()) {
                objM16921 = C5436.m16926(objM16921, abstractC7041);
            } else {
                abstractC7041.m18107();
            }
        }
        if (objM16921 != null) {
            if (objM16921 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM16921;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((AbstractC7041) arrayList.get(size)).mo5754(c3850);
                }
            } else {
                ((AbstractC7041) objM16921).mo5754(c3850);
            }
        }
        m5869(c3850);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Throwable m5855(C3850<?> c3850) {
        m5854(c3850);
        return c3850.m10658();
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final InterfaceC7288<E, InterfaceC7317<E>> mo5856() {
        return new C3013(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Throwable m5857(E e, C3850<?> c3850) {
        C8100 c8100M20875;
        m5854(c3850);
        InterfaceC5124<E, C8107> interfaceC5124 = this.f4367;
        if (interfaceC5124 == null || (c8100M20875 = C6560.m20875(interfaceC5124, e, null, 2, null)) == null) {
            return c3850.m10658();
        }
        C4741.m1656(c8100M20875, c3850.m10658());
        throw c8100M20875;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m5858(InterfaceC4199<?> interfaceC4199, E e, C3850<?> c3850) {
        C8100 c8100M20875;
        m5854(c3850);
        Throwable thM10658 = c3850.m10658();
        InterfaceC5124<E, C8107> interfaceC5124 = this.f4367;
        if (interfaceC5124 == null || (c8100M20875 = C6560.m20875(interfaceC5124, e, null, 2, null)) == null) {
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(thM10658)));
        } else {
            C4741.m1656(c8100M20875, thM10658);
            C7148.C1189 c11892 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(c8100M20875)));
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m5859(Throwable th) {
        C7694 c7694;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c7694 = C2978.f4314) || !C3008.m74(f4366, this, obj, c7694)) {
            return;
        }
        ((InterfaceC5124) C8012.m25265(obj, 1)).invoke(th);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean mo6938(@InterfaceC6489 Throwable th) {
        boolean z;
        C3850<?> c3850 = new C3850<>(th);
        C5850 c5850 = this.f4368;
        while (true) {
            C5850 c5850M18106 = c5850.m18106();
            z = true;
            if (!(!(c5850M18106 instanceof C3850))) {
                z = false;
                break;
            }
            if (c5850M18106.m18097(c3850, c5850)) {
                break;
            }
        }
        if (!z) {
            c3850 = (C3850) this.f4368.m18106();
        }
        m5854(c3850);
        if (z) {
            m5859(th);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract boolean mo5861();

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract boolean mo5862();

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final Object mo5863(E e) {
        Object objMo5865 = mo5865(e);
        if (objMo5865 == C2978.f4310) {
            return C3732.f494.m10212(C8107.f3222);
        }
        if (objMo5865 == C2978.f4311) {
            C3850<?> c3850M5851 = m5851();
            return c3850M5851 == null ? C3732.f494.m808() : C3732.f494.m807(m5855(c3850M5851));
        }
        if (objMo5865 instanceof C3850) {
            return C3732.f494.m807(m5855((C3850) objMo5865));
        }
        throw new IllegalStateException(("trySend returned " + objMo5865).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m5864() {
        return !(this.f4368.m18105() instanceof InterfaceC7046) && mo5862();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Object mo5865(E e) {
        InterfaceC7046<E> interfaceC7046Mo5727;
        do {
            interfaceC7046Mo5727 = mo5727();
            if (interfaceC7046Mo5727 == null) {
                return C2978.f4311;
            }
        } while (interfaceC7046Mo5727.mo5752(e, null) == null);
        interfaceC7046Mo5727.mo5753(e);
        return interfaceC7046Mo5727.mo10654();
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void mo5866(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4366;
        if (C3008.m74(atomicReferenceFieldUpdater, this, null, interfaceC5124)) {
            C3850<?> c3850M5851 = m5851();
            if (c3850M5851 == null || !C3008.m74(atomicReferenceFieldUpdater, this, interfaceC5124, C2978.f4314)) {
                return;
            }
            interfaceC5124.invoke(c3850M5851.f7349);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == C2978.f4314) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final boolean mo5867() {
        return m5851() != null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Object mo5868(E e, @InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        C3011<E> c3011M5847 = m5847(e);
        Object objMo22759 = interfaceC7289.mo22759(c3011M5847);
        if (objMo22759 != null) {
            return objMo22759;
        }
        InterfaceC7046<? super E> interfaceC7046M18126 = c3011M5847.m18126();
        interfaceC7046M18126.mo5753(e);
        return interfaceC7046M18126.mo10654();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m5869(@InterfaceC6399 C5850 c5850) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final <R> void m5870(InterfaceC7289<? super R> interfaceC7289, E e, InterfaceC5138<? super InterfaceC7317<? super E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
        while (!interfaceC7289.mo22761()) {
            if (m5864()) {
                C3010 c3010 = new C3010(e, this, interfaceC7289, interfaceC5138);
                Object objMo5848 = mo5848(c3010);
                if (objMo5848 == null) {
                    interfaceC7289.mo22764(c3010);
                    return;
                }
                if (objMo5848 instanceof C3850) {
                    throw C7565.m23687(m5857(e, (C3850) objMo5848));
                }
                if (objMo5848 != C2978.f4313 && !(objMo5848 instanceof AbstractC7041)) {
                    throw new IllegalStateException(("enqueueSend returned " + objMo5848 + ' ').toString());
                }
            }
            Object objMo5868 = mo5868(e, interfaceC7289);
            if (objMo5868 == C7291.m22775()) {
                return;
            }
            if (objMo5868 != C2978.f4311 && objMo5868 != C3449.f296) {
                if (objMo5868 == C2978.f4310) {
                    C8103.m26704(interfaceC5138, this, interfaceC7289.mo22762());
                    return;
                } else {
                    if (objMo5868 instanceof C3850) {
                        throw C7565.m23687(m5857(e, (C3850) objMo5868));
                    }
                    throw new IllegalStateException(("offerSelectInternal returned " + objMo5868).toString());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Yue.ۥ۠ۨ۠ۥ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final InterfaceC7046<?> m5871(E e) {
        C5850 c5850M18106;
        C5848 c5848 = this.f4368;
        C0025 c0025 = new C0025(e);
        do {
            c5850M18106 = c5848.m18106();
            if (c5850M18106 instanceof InterfaceC7046) {
                return (InterfaceC7046) c5850M18106;
            }
        } while (!c5850M18106.m18097(c0025, c5848));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5872(E e, InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo5865;
        C3666 c3666M736 = C3668.m736(C5501.m17135(interfaceC4199));
        while (true) {
            if (m5864()) {
                AbstractC7312 c7318 = this.f4367 == null ? new C7318(e, c3666M736) : new C7319(e, c3666M736, this.f4367);
                Object objMo5848 = mo5848(c7318);
                if (objMo5848 == null) {
                    C3668.m10054(c3666M736, c7318);
                    break;
                }
                if (objMo5848 instanceof C3850) {
                    m5858(c3666M736, e, (C3850) objMo5848);
                    break;
                }
                if (objMo5848 != C2978.f4313 && !(objMo5848 instanceof AbstractC7041)) {
                    throw new IllegalStateException(("enqueueSend returned " + objMo5848).toString());
                }
                objMo5865 = mo5865(e);
                if (objMo5865 != C2978.f4310) {
                }
            } else {
                objMo5865 = mo5865(e);
                if (objMo5865 != C2978.f4310) {
                    C7148.C1189 c1189 = C7148.f21560;
                    c3666M736.resumeWith(C7148.m3438(C8107.f3222));
                    break;
                }
                if (objMo5865 != C2978.f4311) {
                    if (!(objMo5865 instanceof C3850)) {
                        throw new IllegalStateException(("offerInternal returned " + objMo5865).toString());
                    }
                    m5858(c3666M736, e, (C3850) objMo5865);
                }
            }
        }
        Object objM10039 = c3666M736.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0026 */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Yue.ۥ۠ۨ۠ۥ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC7046<E> mo5727() {
        ?? r1;
        C5850 c5850M18112;
        C5848 c5848 = this.f4368;
        while (true) {
            r1 = (C5850) c5848.m18104();
            if (r1 == c5848 || !(r1 instanceof InterfaceC7046)) {
                break;
            }
            if (((((InterfaceC7046) r1) instanceof C3850) && !r1.mo18077()) || (c5850M18112 = r1.m18112()) == null) {
                break;
            }
            c5850M18112.m18108();
        }
        return (InterfaceC7046) r1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = null;
     */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC7312 m5873() {
        C5850 c5850;
        C5850 c5850M18112;
        C5848 c5848 = this.f4368;
        while (true) {
            c5850 = (C5850) c5848.m18104();
            if (c5850 == c5848 || !(c5850 instanceof AbstractC7312)) {
                break;
            }
            if (((((AbstractC7312) c5850) instanceof C3850) && !c5850.mo18077()) || (c5850M18112 = c5850.m18112()) == null) {
                break;
            }
            c5850M18112.m18108();
        }
        return (AbstractC7312) c5850;
    }
}
