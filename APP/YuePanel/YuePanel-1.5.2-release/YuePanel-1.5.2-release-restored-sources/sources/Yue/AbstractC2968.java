package Yue;

import Yue.C3732;
import Yue.C5850;
import Yue.C7148;
import Yue.InterfaceC3665;
import Yue.InterfaceC3713;
import Yue.InterfaceC3728;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2968<E> extends AbstractC3009<E> implements InterfaceC3713<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ */
    public static final class C0009<E> implements InterfaceC3728<E> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        @InterfaceC5568
        public final AbstractC2968<E> f19;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public Object f20 = C2978.f4312;

        public C0009(@InterfaceC6399 AbstractC2968<E> abstractC2968) {
            this.f19 = abstractC2968;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: E */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.InterfaceC3728
        public E next() throws Throwable {
            E e = (E) this.f20;
            if (e instanceof C3850) {
                throw C7565.m23687(((C3850) e).m10657());
            }
            C7694 c7694 = C2978.f4312;
            if (e == c7694) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f20 = c7694;
            return e;
        }

        @Override // Yue.InterfaceC3728
        @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @InterfaceC5572(name = "next")
        /* JADX INFO: renamed from: ۥ */
        public /* synthetic */ Object mo37(InterfaceC4199 interfaceC4199) {
            return InterfaceC3728.C0239.m802(this, interfaceC4199);
        }

        @Override // Yue.InterfaceC3728
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public Object mo38(@InterfaceC6399 InterfaceC4199<? super Boolean> interfaceC4199) {
            Object obj = this.f20;
            C7694 c7694 = C2978.f4312;
            if (obj != c7694) {
                return C3590.m636(m5749(obj));
            }
            Object objMo5741 = this.f19.mo5741();
            this.f20 = objMo5741;
            return objMo5741 != c7694 ? C3590.m636(m5749(objMo5741)) : m5750(interfaceC4199);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Object m5748() {
            return this.f20;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m5749(Object obj) throws Throwable {
            if (!(obj instanceof C3850)) {
                return true;
            }
            C3850 c3850 = (C3850) obj;
            if (c3850.f7349 == null) {
                return false;
            }
            throw C7565.m23687(c3850.m10657());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Object m5750(InterfaceC4199<? super Boolean> interfaceC4199) {
            C3666 c3666M736 = C3668.m736(C5501.m17135(interfaceC4199));
            C2970 c2970 = new C2970(this, c3666M736);
            while (true) {
                if (this.f19.m5730(c2970)) {
                    this.f19.m5745(c3666M736, c2970);
                    break;
                }
                Object objMo5741 = this.f19.mo5741();
                m5751(objMo5741);
                if (objMo5741 instanceof C3850) {
                    C3850 c3850 = (C3850) objMo5741;
                    if (c3850.f7349 == null) {
                        C7148.C1189 c1189 = C7148.f21560;
                        c3666M736.resumeWith(C7148.m3438(C3590.m636(false)));
                    } else {
                        C7148.C1189 c11892 = C7148.f21560;
                        c3666M736.resumeWith(C7148.m3438(C7149.m3441(c3850.m10657())));
                    }
                } else if (objMo5741 != C2978.f4312) {
                    Boolean boolM636 = C3590.m636(true);
                    InterfaceC5124<E, C8107> interfaceC5124 = this.f19.f4367;
                    c3666M736.mo10014(boolM636, interfaceC5124 != null ? C6560.m3020(interfaceC5124, objMo5741, c3666M736.getContext()) : null);
                }
            }
            Object objM10039 = c3666M736.m10039();
            if (objM10039 == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            return objM10039;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m5751(@InterfaceC6489 Object obj) {
            this.f20 = obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟ */
    public static class C0010<E> extends AbstractC7041<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC3665<Object> f4292;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC5568
        public final int f4293;

        public C0010(@InterfaceC6399 InterfaceC3665<Object> interfaceC3665, int i) {
            this.f4292 = interfaceC3665;
            this.f4293 = i;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "ReceiveElement@" + C4325.m1289(this) + "[receiveMode=" + this.f4293 + ']';
        }

        @Override // Yue.InterfaceC7046
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C7694 mo5752(E e, @InterfaceC6489 C5850.C5852 c5852) {
            if (this.f4292.mo10019(m5755(e), c5852 != null ? c5852.f14507 : null, mo5756(e)) == null) {
                return null;
            }
            if (c5852 != null) {
                c5852.m18124();
            }
            return C3667.f6491;
        }

        @Override // Yue.InterfaceC7046
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public void mo5753(E e) {
            this.f4292.mo10022(C3667.f6491);
        }

        @Override // Yue.AbstractC7041
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public void mo5754(@InterfaceC6399 C3850<?> c3850) {
            if (this.f4293 != 1) {
                InterfaceC3665<Object> interfaceC3665 = this.f4292;
                C7148.C1189 c1189 = C7148.f21560;
                interfaceC3665.resumeWith(C7148.m3438(C7149.m3441(c3850.m10657())));
            } else {
                InterfaceC3665<Object> interfaceC36652 = this.f4292;
                C3732 c3732M806 = C3732.m806(C3732.f494.m807(c3850.f7349));
                C7148.C1189 c11892 = C7148.f21560;
                interfaceC36652.resumeWith(C7148.m3438(c3732M806));
            }
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public final Object m5755(E e) {
            return this.f4293 == 1 ? C3732.m806(C3732.f494.m10212(e)) : e;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2969<E> extends C0010<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC5124<E, C8107> f4294;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super E, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2969(@InterfaceC6399 InterfaceC3665<Object> interfaceC3665, int i, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124) {
            super(interfaceC3665, i);
            this.f4294 = interfaceC5124;
        }

        @Override // Yue.AbstractC7041
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public InterfaceC5124<Throwable, C8107> mo5756(E e) {
            return C6560.m3020(this.f4294, e, this.f4292.getContext());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C2970<E> extends AbstractC7041<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final C0009<E> f4295;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC3665<Boolean> f4296;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۟ۨ۟<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2970(@InterfaceC6399 C0009<E> c0009, @InterfaceC6399 InterfaceC3665<? super Boolean> interfaceC3665) {
            this.f4295 = c0009;
            this.f4296 = interfaceC3665;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "ReceiveHasNext@" + C4325.m1289(this);
        }

        @Override // Yue.InterfaceC7046
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public C7694 mo5752(E e, @InterfaceC6489 C5850.C5852 c5852) {
            if (this.f4296.mo10019(Boolean.TRUE, c5852 != null ? c5852.f14507 : null, mo5756(e)) == null) {
                return null;
            }
            if (c5852 != null) {
                c5852.m18124();
            }
            return C3667.f6491;
        }

        @Override // Yue.InterfaceC7046
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public void mo5753(E e) {
            this.f4295.m5751(e);
            this.f4296.mo10022(C3667.f6491);
        }

        @Override // Yue.AbstractC7041
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public InterfaceC5124<Throwable, C8107> mo5756(E e) {
            InterfaceC5124<E, C8107> interfaceC5124 = this.f4295.f19.f4367;
            if (interfaceC5124 != null) {
                return C6560.m3020(interfaceC5124, e, this.f4296.getContext());
            }
            return null;
        }

        @Override // Yue.AbstractC7041
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo5754(@InterfaceC6399 C3850<?> c3850) {
            Object objM732 = c3850.f7349 == null ? InterfaceC3665.C0216.m732(this.f4296, Boolean.FALSE, null, 2, null) : this.f4296.mo10018(c3850.m10657());
            if (objM732 != null) {
                this.f4295.m5751(c3850);
                this.f4296.mo10022(objM732);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C2971<R, E> extends AbstractC7041<E> implements InterfaceC4433 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final AbstractC2968<E> f4297;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC7289<R> f4298;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final InterfaceC5138<Object, InterfaceC4199<? super R>, Object> f4299;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC5568
        public final int f4300;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2971(@InterfaceC6399 AbstractC2968<E> abstractC2968, @InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<Object, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, int i) {
            this.f4297 = abstractC2968;
            this.f4298 = interfaceC7289;
            this.f4299 = interfaceC5138;
            this.f4300 = i;
        }

        @Override // Yue.C5850
        @InterfaceC6399
        public String toString() {
            return "ReceiveSelect@" + C4325.m1289(this) + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + this.f4298 + ",receiveMode=" + this.f4300 + ']';
        }

        @Override // Yue.InterfaceC7046
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public C7694 mo5752(E e, @InterfaceC6489 C5850.C5852 c5852) {
            return (C7694) this.f4298.mo22758(c5852);
        }

        @Override // Yue.InterfaceC4433
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public void mo5757() {
            if (mo18079()) {
                this.f4297.m5739();
            }
        }

        @Override // Yue.InterfaceC7046
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public void mo5753(E e) throws Throwable {
            C3672.m10062(this.f4299, this.f4300 == 1 ? C3732.m806(C3732.f494.m10212(e)) : e, this.f4298.mo22762(), mo5756(e));
        }

        @Override // Yue.AbstractC7041
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public InterfaceC5124<Throwable, C8107> mo5756(E e) {
            InterfaceC5124<E, C8107> interfaceC5124 = this.f4297.f4367;
            if (interfaceC5124 != null) {
                return C6560.m3020(interfaceC5124, e, this.f4298.mo22762().getContext());
            }
            return null;
        }

        @Override // Yue.AbstractC7041
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo5754(@InterfaceC6399 C3850<?> c3850) throws Throwable {
            if (this.f4298.mo22760()) {
                int i = this.f4300;
                if (i == 0) {
                    this.f4298.mo22763(c3850.m10657());
                } else {
                    if (i != 1) {
                        return;
                    }
                    C3672.m10063(this.f4299, C3732.m806(C3732.f494.m807(c3850.f7349)), this.f4298.mo22762(), null, 4, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public final class C2972 extends AbstractC3529 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC7041<?> f4301;

        public C2972(@InterfaceC6399 AbstractC7041<?> abstractC7041) {
            this.f4301 = abstractC7041;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            mo5758(th);
            return C8107.f3222;
        }

        @InterfaceC6399
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f4301 + ']';
        }

        @Override // Yue.AbstractC3662
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo5758(@InterfaceC6489 Throwable th) {
            if (this.f4301.mo18079()) {
                AbstractC2968.this.m5739();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C2973<E> extends C5850.C5853<AbstractC7312> {
        public C2973(@InterfaceC6399 C5848 c5848) {
            super(c5848);
        }

        @Override // Yue.C5850.C5853, Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Object mo5759(@InterfaceC6399 C5850 c5850) {
            if (c5850 instanceof C3850) {
                return c5850;
            }
            if (c5850 instanceof AbstractC7312) {
                return null;
            }
            return C2978.f4312;
        }

        @Override // Yue.C5850.AbstractC0882
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Object mo5760(@InterfaceC6399 C5850.C5852 c5852) {
            C7694 c7694Mo5877 = ((AbstractC7312) c5852.f1732).mo5877(c5852);
            if (c7694Mo5877 == null) {
                return C5856.f1735;
            }
            Object obj = C3449.f296;
            if (c7694Mo5877 == obj) {
                return obj;
            }
            return null;
        }

        @Override // Yue.C5850.AbstractC0882
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo5761(@InterfaceC6399 C5850 c5850) {
            ((AbstractC7312) c5850).mo5878();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C2974 extends C5850.AbstractC5851 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2968 f4303;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2974(C5850 c5850, AbstractC2968 abstractC2968) {
            super(c5850);
            this.f4303 = abstractC2968;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo5762(@InterfaceC6399 C5850 c5850) {
            if (this.f4303.mo5735()) {
                return null;
            }
            return C5849.m2518();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C2975 implements InterfaceC7287<E> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2968<E> f4304;

        public C2975(AbstractC2968<E> abstractC2968) {
            this.f4304 = abstractC2968;
        }

        @Override // Yue.InterfaceC7287
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public <R> void mo5764(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
            this.f4304.m5744(interfaceC7289, 0, interfaceC5138);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C2976 implements InterfaceC7287<C3732<? extends E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2968<E> f4305;

        public C2976(AbstractC2968<E> abstractC2968) {
            this.f4305 = abstractC2968;
        }

        @Override // Yue.InterfaceC7287
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public <R> void mo5764(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super C3732<? extends E>, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
            this.f4305.m5744(interfaceC7289, 1, interfaceC5138);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.AbstractChannel", m1273f = "AbstractChannel.kt", m1274i = {}, m1275l = {633}, m1276m = "receiveCatching-JP2dKIU", m1277n = {}, m1278s = {})
    public static final class C2977 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ Object f4306;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2968<E> f4307;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f4308;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2977(AbstractC2968<E> abstractC2968, InterfaceC4199<? super C2977> interfaceC4199) {
            super(interfaceC4199);
            this.f4307 = abstractC2968;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f4306 = obj;
            this.f4308 |= Integer.MIN_VALUE;
            Object objMo5726 = this.f4307.mo5726(this);
            return objMo5726 == C5508.m17142() ? objMo5726 : C3732.m806(objMo5726);
        }
    }

    public AbstractC2968(@InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        super(interfaceC5124);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo5718(null);
    }

    @Override // Yue.InterfaceC7042
    public boolean isEmpty() {
        return m5736();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    public final InterfaceC3728<E> iterator() {
        return new C0009(this);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC6489
    public E poll() {
        return (E) InterfaceC3713.C0232.m10170(this);
    }

    @Override // Yue.InterfaceC7042
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void mo5718(@InterfaceC6489 CancellationException cancellationException) {
        if (mo5720()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(C4325.m1288(this) + " was cancelled");
        }
        mo5717(cancellationException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥ۟ۧۤۢ<? super E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC7042
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Object mo5719(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        Object objMo5741 = mo5741();
        return (objMo5741 == C2978.f4312 || (objMo5741 instanceof C3850)) ? m5743(0, interfaceC4199) : objMo5741;
    }

    @Override // Yue.InterfaceC7042
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean mo5720() {
        return m5850() != null && mo5735();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC7287<E> mo5721() {
        return new C2975(this);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final InterfaceC7287<C3732<E>> mo5722() {
        return new C2976(this);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC7287<E> mo5723() {
        return InterfaceC3713.C0232.m796(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Yue.ۥ۟ۤۢ۟$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Object mo5724() {
        Object objMo5741 = mo5741();
        return objMo5741 == C2978.f4312 ? C3732.f494.m808() : objMo5741 instanceof C3850 ? C3732.f494.m807(((C3850) objMo5741).f7349) : C3732.f494.m10212(objMo5741);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC5890
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Object mo5725(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        return InterfaceC3713.C0232.m10171(this, interfaceC4199);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Yue.ۥ۟ۤۢ۟$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yue.InterfaceC7042
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5726(@InterfaceC6399 InterfaceC4199<? super C3732<? extends E>> interfaceC4199) {
        C2977 c2977;
        if (interfaceC4199 instanceof C2977) {
            c2977 = (C2977) interfaceC4199;
            int i = c2977.f4308;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2977.f4308 = i - Integer.MIN_VALUE;
            } else {
                c2977 = new C2977(this, interfaceC4199);
            }
        }
        Object objM5743 = c2977.f4306;
        Object objM17142 = C5508.m17142();
        int i2 = c2977.f4308;
        if (i2 == 0) {
            C7149.m22422(objM5743);
            Object objMo5741 = mo5741();
            if (objMo5741 != C2978.f4312) {
                return objMo5741 instanceof C3850 ? C3732.f494.m807(((C3850) objMo5741).f7349) : C3732.f494.m10212(objMo5741);
            }
            c2977.f4308 = 1;
            objM5743 = m5743(1, c2977);
            if (objM5743 == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(objM5743);
        }
        return ((C3732) objM5743).m10211();
    }

    @Override // Yue.AbstractC3009
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public InterfaceC7046<E> mo5727() {
        InterfaceC7046<E> interfaceC7046Mo5727 = super.mo5727();
        if (interfaceC7046Mo5727 != null && !(interfaceC7046Mo5727 instanceof C3850)) {
            m5739();
        }
        return interfaceC7046Mo5727;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Throwable;)Z */
    @Override // Yue.InterfaceC7042
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean mo5717(@InterfaceC6489 Throwable th) {
        boolean zMo5860 = mo5860(th);
        mo5737(zMo5860);
        return zMo5860;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final C2973<E> m5729() {
        return new C2973<>(m5852());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m5730(AbstractC7041<? super E> abstractC7041) {
        boolean zMo5731 = mo5731(abstractC7041);
        if (zMo5731) {
            m5740();
        }
        return zMo5731;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public boolean mo5731(@InterfaceC6399 AbstractC7041<? super E> abstractC7041) {
        int iM18114;
        C5850 c5850M18106;
        if (!mo5734()) {
            C5850 c5850M5852 = m5852();
            C2974 c2974 = new C2974(abstractC7041, this);
            do {
                C5850 c5850M181062 = c5850M5852.m18106();
                if (!(!(c5850M181062 instanceof AbstractC7312))) {
                    return false;
                }
                iM18114 = c5850M181062.m18114(abstractC7041, c5850M5852, c2974);
                if (iM18114 != 1) {
                }
            } while (iM18114 != 2);
            return false;
        }
        C5850 c5850M58522 = m5852();
        do {
            c5850M18106 = c5850M58522.m18106();
            if (!(!(c5850M18106 instanceof AbstractC7312))) {
                return false;
            }
        } while (!c5850M18106.m18097(abstractC7041, c5850M58522));
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final <R> boolean m5732(InterfaceC7289<? super R> interfaceC7289, InterfaceC5138<Object, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, int i) {
        C2971 c2971 = new C2971(this, interfaceC7289, interfaceC5138, i);
        boolean zM5730 = m5730(c2971);
        if (zM5730) {
            interfaceC7289.mo22764(c2971);
        }
        return zM5730;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m5733() {
        return m5852().m18105() instanceof InterfaceC7046;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public abstract boolean mo5734();

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public abstract boolean mo5735();

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m5736() {
        return !(m5852().m18105() instanceof AbstractC7312) && mo5735();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void mo5737(boolean z) {
        C3850<?> c3850M5851 = m5851();
        if (c3850M5851 == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objM16921 = C5436.m16921(null, 1, null);
        while (true) {
            C5850 c5850M18106 = c3850M5851.m18106();
            if (c5850M18106 instanceof C5848) {
                mo5738(objM16921, c3850M5851);
                return;
            } else if (c5850M18106.mo18079()) {
                objM16921 = C5436.m16926(objM16921, (AbstractC7312) c5850M18106);
            } else {
                c5850M18106.m18107();
            }
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0014 */
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void mo5738(@InterfaceC6399 Object obj, @InterfaceC6399 C3850<?> c3850) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((AbstractC7312) obj).mo5876(c3850);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((AbstractC7312) arrayList.get(size)).mo5876(c3850);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m5739() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m5740() {
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public Object mo5741() {
        while (true) {
            AbstractC7312 abstractC7312M5873 = m5873();
            if (abstractC7312M5873 == null) {
                return C2978.f4312;
            }
            if (abstractC7312M5873.mo5877(null) != null) {
                abstractC7312M5873.mo5874();
                return abstractC7312M5873.mo5875();
            }
            abstractC7312M5873.mo5878();
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public Object mo5742(@InterfaceC6399 InterfaceC7289<?> interfaceC7289) {
        C2973<E> c2973M5729 = m5729();
        Object objMo22759 = interfaceC7289.mo22759(c2973M5729);
        if (objMo22759 != null) {
            return objMo22759;
        }
        c2973M5729.m18126().mo5874();
        return c2973M5729.m18126().mo5875();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Yue.ۥ۟۟۠ۤ$ۥ۟ */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Yue.ۥ۟۟۠ۤ$ۥ۟ */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Yue.ۥ۟۟۠ۤ$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final <R> Object m5743(int i, InterfaceC4199<? super R> interfaceC4199) {
        C3666 c3666M736 = C3668.m736(C5501.m17135(interfaceC4199));
        C0010 c0010 = this.f4367 == null ? new C0010(c3666M736, i) : new C2969(c3666M736, i, this.f4367);
        while (true) {
            if (m5730(c0010)) {
                m5745(c3666M736, c0010);
                break;
            }
            Object objMo5741 = mo5741();
            if (objMo5741 instanceof C3850) {
                c0010.mo5754((C3850) objMo5741);
                break;
            }
            if (objMo5741 != C2978.f4312) {
                c3666M736.mo10014(c0010.m5755(objMo5741), c0010.mo5756(objMo5741));
                break;
            }
        }
        Object objM10039 = c3666M736.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final <R> void m5744(InterfaceC7289<? super R> interfaceC7289, int i, InterfaceC5138<Object, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
        while (!interfaceC7289.mo22761()) {
            if (!m5736()) {
                Object objMo5742 = mo5742(interfaceC7289);
                if (objMo5742 == C7291.m22775()) {
                    return;
                }
                if (objMo5742 != C2978.f4312 && objMo5742 != C3449.f296) {
                    m5746(interfaceC5138, interfaceC7289, i, objMo5742);
                }
            } else if (m5732(interfaceC7289, interfaceC5138, i)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m5745(InterfaceC3665<?> interfaceC3665, AbstractC7041<?> abstractC7041) {
        interfaceC3665.mo10021(new C2972(abstractC7041));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final <R> void m5746(InterfaceC5138<Object, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, InterfaceC7289<? super R> interfaceC7289, int i, Object obj) throws Throwable {
        boolean z = obj instanceof C3850;
        if (!z) {
            if (i != 1) {
                C8103.m26704(interfaceC5138, obj, interfaceC7289.mo22762());
                return;
            } else {
                C3732.C0242 c0242 = C3732.f494;
                C8103.m26704(interfaceC5138, C3732.m806(z ? c0242.m807(((C3850) obj).f7349) : c0242.m10212(obj)), interfaceC7289.mo22762());
                return;
            }
        }
        if (i == 0) {
            throw C7565.m23687(((C3850) obj).m10657());
        }
        if (i == 1 && interfaceC7289.mo22760()) {
            C8103.m26704(interfaceC5138, C3732.m806(C3732.f494.m807(((C3850) obj).f7349)), interfaceC7289.mo22762());
        }
    }
}
