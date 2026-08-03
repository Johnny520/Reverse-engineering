package Yue;

import Yue.C5850;
import Yue.C7060;
import Yue.InterfaceC4225;
import Yue.InterfaceC5542;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4372(level = EnumC0393.f8971, message = "This is internal API and may be removed in the future releases")
public class C5557 implements InterfaceC5542, InterfaceC3816, InterfaceC6611, InterfaceC7286 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13535 = AtomicReferenceFieldUpdater.newUpdater(C5557.class, Object.class, "_state");

    @InterfaceC6399
    private volatile /* synthetic */ Object _parentHandle;

    @InterfaceC6399
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟$ۥ */
    public static final class C0795<T> extends C3666<T> {

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5557 f13536;

        public C0795(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6399 C5557 c5557) {
            super(interfaceC4199, 1);
            this.f13536 = c5557;
        }

        @Override // Yue.C3666
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
        public Throwable mo10038(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
            Throwable thM17305;
            Object objM17273 = this.f13536.m17273();
            return (!(objM17273 instanceof C5558) || (thM17305 = ((C5558) objM17273).m17305()) == null) ? objM17273 instanceof C4050 ? ((C4050) objM17273).f637 : interfaceC5542.mo17161() : thM17305;
        }

        @Override // Yue.C3666
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public String mo10045() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟$ۥ۟ */
    public static final class C0796 extends AbstractC5556 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        public final C5557 f13537;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC6399
        public final C5558 f13538;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public final C3815 f13539;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        @InterfaceC6489
        public final Object f13540;

        public C0796(@InterfaceC6399 C5557 c5557, @InterfaceC6399 C5558 c5558, @InterfaceC6399 C3815 c3815, @InterfaceC6489 Object obj) {
            this.f13537 = c5557;
            this.f13538 = c5558;
            this.f13539 = c3815;
            this.f13540 = obj;
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
            this.f13537.m17260(this.f13538, this.f13539, this.f13540);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C5558 implements InterfaceC5424 {

        @InterfaceC6399
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @InterfaceC6399
        private volatile /* synthetic */ int _isCompleting;

        @InterfaceC6399
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C6384 f13541;

        public C5558(@InterfaceC6399 C6384 c6384, boolean z, @InterfaceC6489 Throwable th) {
            this.f13541 = c6384;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @InterfaceC6399
        public String toString() {
            return "Finishing[cancelling=" + m17306() + ", completing=" + m17307() + ", rootCause=" + m17305() + ", exceptions=" + m17304() + ", list=" + mo13920() + ']';
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m2292(@InterfaceC6399 Throwable th) {
            Throwable thM17305 = m17305();
            if (thM17305 == null) {
                m17312(th);
                return;
            }
            if (th == thM17305) {
                return;
            }
            Object objM17304 = m17304();
            if (objM17304 == null) {
                m17311(th);
                return;
            }
            if (objM17304 instanceof Throwable) {
                if (th == objM17304) {
                    return;
                }
                ArrayList<Throwable> arrayListM2293 = m2293();
                arrayListM2293.add(objM17304);
                arrayListM2293.add(th);
                m17311(arrayListM2293);
                return;
            }
            if (objM17304 instanceof ArrayList) {
                ((ArrayList) objM17304).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM17304).toString());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final ArrayList<Throwable> m2293() {
            return new ArrayList<>(4);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Object m17304() {
            return this._exceptionsHolder;
        }

        @Override // Yue.InterfaceC5424
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo13919() {
            return m17305() == null;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Throwable m17305() {
            return (Throwable) this._rootCause;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m17306() {
            return m17305() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m17307() {
            return this._isCompleting;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠ۦ۠۠.ۥ۟۟۟۟():Yue.ۥۢ۠ۦۢ */
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m17308() {
            return m17304() == C5561.f13554;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final List<Throwable> m17309(@InterfaceC6489 Throwable th) {
            ArrayList<Throwable> arrayListM2293;
            Object objM17304 = m17304();
            if (objM17304 == null) {
                arrayListM2293 = m2293();
            } else if (objM17304 instanceof Throwable) {
                ArrayList<Throwable> arrayListM22932 = m2293();
                arrayListM22932.add(objM17304);
                arrayListM2293 = arrayListM22932;
            } else {
                if (!(objM17304 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM17304).toString());
                }
                arrayListM2293 = (ArrayList) objM17304;
            }
            Throwable thM17305 = m17305();
            if (thM17305 != null) {
                arrayListM2293.add(0, thM17305);
            }
            if (th != null && !C5499.m17094(th, thM17305)) {
                arrayListM2293.add(th);
            }
            m17311(C5561.f13554);
            return arrayListM2293;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m17310(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m17311(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m17312(@InterfaceC6489 Throwable th) {
            this._rootCause = th;
        }

        @Override // Yue.InterfaceC5424
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public C6384 mo13920() {
            return this.f13541;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5559 extends C5850.AbstractC5851 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C5557 f13542;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f13543;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5559(C5850 c5850, C5557 c5557, Object obj) {
            super(c5850);
            this.f13542 = c5557;
            this.f13543 = obj;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3450
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Object mo5762(@InterfaceC6399 C5850 c5850) {
            if (this.f13542.m17273() == this.f13543) {
                return null;
            }
            return C5849.m2518();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.JobSupport$children$1", m1273f = "JobSupport.kt", m1274i = {1, 1, 1}, m1275l = {952, 954}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "this_$iv", "cur$iv"}, m1278s = {"L$0", "L$1", "L$2"})
    public static final class C5560 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super InterfaceC5542>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f13544;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f13545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f13546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f13547;

        public C5560(InterfaceC4199<? super C5560> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C5560 c5560 = C5557.this.new C5560(interfaceC4199);
            c5560.f13547 = obj;
            return c5560;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:27:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C6384 c6384Mo13920;
            AbstractC7328 abstractC7328;
            C5848 c5848;
            C5850 c5850M18105;
            Object objM17142 = C5508.m17142();
            int i = this.f13546;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73282 = (AbstractC7328) this.f13547;
                Object objM17273 = C5557.this.m17273();
                if (objM17273 instanceof C3815) {
                    InterfaceC3816 interfaceC3816 = ((C3815) objM17273).f7084;
                    this.f13546 = 1;
                    if (abstractC73282.mo3574(interfaceC3816, this) == objM17142) {
                        return objM17142;
                    }
                } else if ((objM17273 instanceof InterfaceC5424) && (c6384Mo13920 = ((InterfaceC5424) objM17273).mo13920()) != null) {
                    abstractC7328 = abstractC73282;
                    c5848 = c6384Mo13920;
                    c5850M18105 = (C5850) c6384Mo13920.m18104();
                    if (!C5499.m17094(c5850M18105, c5848)) {
                    }
                }
            } else if (i == 1) {
                C7149.m22422(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5850M18105 = (C5850) this.f13545;
                c5848 = (C5848) this.f13544;
                abstractC7328 = (AbstractC7328) this.f13547;
                C7149.m22422(obj);
                c5850M18105 = c5850M18105.m18105();
                if (!C5499.m17094(c5850M18105, c5848)) {
                    if (c5850M18105 instanceof C3815) {
                        InterfaceC3816 interfaceC38162 = ((C3815) c5850M18105).f7084;
                        this.f13547 = abstractC7328;
                        this.f13544 = c5848;
                        this.f13545 = c5850M18105;
                        this.f13546 = 2;
                        if (abstractC7328.mo3574(interfaceC38162, this) == objM17142) {
                            return objM17142;
                        }
                    }
                    c5850M18105 = c5850M18105.m18105();
                    if (!C5499.m17094(c5850M18105, c5848)) {
                    }
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super InterfaceC5542> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C5560) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    public C5557(boolean z) {
        this._state = z ? C5561.f13556 : C5561.f13555;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ C5543 m17247(C5557 c5557, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = c5557.mo5774();
        }
        return new C5543(str, th, c5557);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static /* synthetic */ CancellationException m17248(C5557 c5557, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return c5557.m17297(th, str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠ۦ۟ۡ.ۥ.ۥ(Yue.ۥ۠ۦ۟ۡ):void */
    @Override // Yue.InterfaceC5542, Yue.InterfaceC7042
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo6939(null);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        return (R) InterfaceC5542.C0790.m17167(this, r, interfaceC5138);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        return (E) InterfaceC5542.C0790.m17168(this, interfaceC4228);
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357
    @InterfaceC6399
    public final InterfaceC4225.InterfaceC4228<?> getKey() {
        return InterfaceC5542.f13507;
    }

    @Override // Yue.InterfaceC5542
    public final boolean isCancelled() {
        Object objM17273 = m17273();
        return (objM17273 instanceof C4050) || ((objM17273 instanceof C5558) && ((C5558) objM17273).m17306());
    }

    @Override // Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        return InterfaceC5542.C0790.m17170(this, interfaceC4228);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return InterfaceC5542.C0790.m17171(this, interfaceC4225);
    }

    @Override // Yue.InterfaceC5542
    public final boolean start() {
        int iM17295;
        do {
            iM17295 = m17295(m17273());
            if (iM17295 == 0) {
                return false;
            }
        } while (iM17295 != 1);
        return true;
    }

    @InterfaceC6399
    public String toString() {
        return m17298() + '@' + C4325.m1289(this);
    }

    @Override // Yue.InterfaceC5542, Yue.InterfaceC3592
    @InterfaceC4372(level = EnumC0393.f8972, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* synthetic */ boolean mo6938(Throwable th) throws Throwable {
        Throwable c5543;
        if (th == null || (c5543 = m17248(this, th, null, 1, null)) == null) {
            c5543 = new C5543(mo5774(), null, this);
        }
        mo9588(c5543);
        return true;
    }

    @Override // Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo5773() {
        Object objM17273 = m17273();
        return (objM17273 instanceof InterfaceC5424) && ((InterfaceC5424) objM17273).mo13919();
    }

    @Override // Yue.InterfaceC5542, Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo6939(@InterfaceC6489 CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C5543(mo5774(), null, this);
        }
        mo9588(cancellationException);
    }

    @Override // Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public final boolean mo17157() {
        return !(m17273() instanceof InterfaceC5424);
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public InterfaceC5542 mo17158(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        return InterfaceC5542.C0790.m17172(this, interfaceC5542);
    }

    @Override // Yue.InterfaceC3816
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public final void mo10519(@InterfaceC6399 InterfaceC6611 interfaceC6611) throws Throwable {
        m17256(interfaceC6611);
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public final InterfaceC7326<InterfaceC5542> mo17159() {
        return C7330.m3577(new C5560(null));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Throwable m17249() {
        Object objM17273 = m17273();
        if (!(objM17273 instanceof InterfaceC5424)) {
            return m17268(objM17273);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public final InterfaceC4433 mo17160(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return mo17162(false, true, interfaceC5124);
    }

    @Override // Yue.InterfaceC7286
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final <R> void mo17250(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
        Object objM17273;
        do {
            objM17273 = m17273();
            if (interfaceC7289.mo22761()) {
                return;
            }
            if (!(objM17273 instanceof InterfaceC5424)) {
                if (interfaceC7289.mo22760()) {
                    C8103.m26703(interfaceC5124, interfaceC7289.mo22762());
                    return;
                }
                return;
            }
        } while (m17295(objM17273) != 0);
        interfaceC7289.mo22764(mo17160(new C7290(interfaceC7289, interfaceC5124)));
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public final CancellationException mo17161() {
        Object objM17273 = m17273();
        if (!(objM17273 instanceof C5558)) {
            if (objM17273 instanceof InterfaceC5424) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM17273 instanceof C4050) {
                return m17248(this, ((C4050) objM17273).f637, null, 1, null);
            }
            return new C5543(C4325.m1288(this) + " has completed normally", null, this);
        }
        Throwable thM17305 = ((C5558) objM17273).m17305();
        if (thM17305 != null) {
            CancellationException cancellationExceptionM17297 = m17297(thM17305, C4325.m1288(this) + " is cancelling");
            if (cancellationExceptionM17297 != null) {
                return cancellationExceptionM17297;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final boolean m17251(Object obj, C6384 c6384, AbstractC5556 abstractC5556) {
        int iM18114;
        C5559 c5559 = new C5559(abstractC5556, this, obj);
        do {
            iM18114 = c6384.m18106().m18114(abstractC5556, c6384, c5559);
            if (iM18114 == 1) {
                return true;
            }
        } while (iM18114 != 2);
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m17252(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C4741.m1656(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo9504(@InterfaceC6489 Object obj) {
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final Object m17253(@InterfaceC6399 InterfaceC4199<Object> interfaceC4199) throws Throwable {
        Object objM17273;
        do {
            objM17273 = m17273();
            if (!(objM17273 instanceof InterfaceC5424)) {
                if (objM17273 instanceof C4050) {
                    throw ((C4050) objM17273).f637;
                }
                return C5561.m17327(objM17273);
            }
        } while (m17295(objM17273) < 0);
        return m17254(interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final Object m17254(InterfaceC4199<Object> interfaceC4199) {
        C0795 c0795 = new C0795(C5501.m17135(interfaceC4199), this);
        c0795.mo10020();
        C3668.m735(c0795, mo17160(new C7153(c0795)));
        Object objM10039 = c0795.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final boolean m17255(@InterfaceC6489 Throwable th) {
        return m17256(th);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final boolean m17256(@InterfaceC6489 Object obj) throws Throwable {
        Object objM17280 = C5561.f1564;
        if (mo11469() && (objM17280 = m17257(obj)) == C5561.f1565) {
            return true;
        }
        if (objM17280 == C5561.f1564) {
            objM17280 = m17280(obj);
        }
        if (objM17280 == C5561.f1564 || objM17280 == C5561.f1565) {
            return true;
        }
        if (objM17280 == C5561.f13550) {
            return false;
        }
        mo9504(objM17280);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo9588(@InterfaceC6399 Throwable th) throws Throwable {
        m17256(th);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final Object m17257(Object obj) {
        Object objM17301;
        do {
            Object objM17273 = m17273();
            if (!(objM17273 instanceof InterfaceC5424) || ((objM17273 instanceof C5558) && ((C5558) objM17273).m17307())) {
                return C5561.f1564;
            }
            objM17301 = m17301(objM17273, new C4050(m17261(obj), false, 2, null));
        } while (objM17301 == C5561.f13549);
        return objM17301;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m17258(Throwable th) {
        if (mo9505()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC3814 interfaceC3814M17272 = m17272();
        return (interfaceC3814M17272 == null || interfaceC3814M17272 == C6389.f16164) ? z : interfaceC3814M17272.mo10518(th) || z;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public String mo5774() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public boolean mo15146(@InterfaceC6399 Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m17256(th) && mo17173();
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public final InterfaceC4433 mo17162(boolean z, boolean z2, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        AbstractC5556 abstractC5556M17283 = m17283(interfaceC5124, z);
        while (true) {
            Object objM17273 = m17273();
            if (objM17273 instanceof C4628) {
                C4628 c4628 = (C4628) objM17273;
                if (!c4628.mo13919()) {
                    m17289(c4628);
                } else if (C3008.m74(f13535, this, objM17273, abstractC5556M17283)) {
                    return abstractC5556M17283;
                }
            } else {
                if (!(objM17273 instanceof InterfaceC5424)) {
                    if (z2) {
                        C4050 c4050 = objM17273 instanceof C4050 ? (C4050) objM17273 : null;
                        interfaceC5124.invoke(c4050 != null ? c4050.f637 : null);
                    }
                    return C6389.f16164;
                }
                C6384 c6384Mo13920 = ((InterfaceC5424) objM17273).mo13920();
                if (c6384Mo13920 != null) {
                    InterfaceC4433 interfaceC4433 = C6389.f16164;
                    if (z && (objM17273 instanceof C5558)) {
                        synchronized (objM17273) {
                            try {
                                thM17305 = ((C5558) objM17273).m17305();
                                if (thM17305 == null || ((interfaceC5124 instanceof C3815) && !((C5558) objM17273).m17307())) {
                                    if (m17251(objM17273, c6384Mo13920, abstractC5556M17283)) {
                                        if (thM17305 == null) {
                                            return abstractC5556M17283;
                                        }
                                        interfaceC4433 = abstractC5556M17283;
                                    }
                                }
                                C8107 c8107 = C8107.f3222;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thM17305 != null) {
                        if (z2) {
                            interfaceC5124.invoke(thM17305);
                        }
                        return interfaceC4433;
                    }
                    if (m17251(objM17273, c6384Mo13920, abstractC5556M17283)) {
                        return abstractC5556M17283;
                    }
                } else {
                    if (objM17273 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    m17290((AbstractC5556) objM17273);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final void m17259(InterfaceC5424 interfaceC5424, Object obj) throws Throwable {
        InterfaceC3814 interfaceC3814M17272 = m17272();
        if (interfaceC3814M17272 != null) {
            interfaceC3814M17272.mo5757();
            m17294(C6389.f16164);
        }
        C4050 c4050 = obj instanceof C4050 ? (C4050) obj : null;
        Throwable th = c4050 != null ? c4050.f637 : null;
        if (!(interfaceC5424 instanceof AbstractC5556)) {
            C6384 c6384Mo13920 = interfaceC5424.mo13920();
            if (c6384Mo13920 != null) {
                m17286(c6384Mo13920, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC5556) interfaceC5424).mo9329(th);
        } catch (Throwable th2) {
            mo5775(new C4053("Exception in completion handler " + interfaceC5424 + " for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final void m17260(C5558 c5558, C3815 c3815, Object obj) {
        C3815 c3815M17284 = m17284(c3815);
        if (c3815M17284 == null || !m17303(c5558, c3815M17284, obj)) {
            mo9504(m17263(c5558, obj));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final Throwable m17261(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C5543(mo5774(), null, this) : th;
        }
        if (obj != null) {
            return ((InterfaceC6611) obj).mo17270();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final C5543 m17262(@InterfaceC6489 String str, @InterfaceC6489 Throwable th) {
        if (str == null) {
            str = mo5774();
        }
        return new C5543(str, th, this);
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public final Object mo17163(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        if (m17277()) {
            Object objM17278 = m17278(interfaceC4199);
            return objM17278 == C5508.m17142() ? objM17278 : C8107.f3222;
        }
        C5553.m17211(interfaceC4199.getContext());
        return C8107.f3222;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public final InterfaceC7286 mo17164() {
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final Object m17263(C5558 c5558, Object obj) throws Throwable {
        boolean zM17306;
        Throwable thM17269;
        C4050 c4050 = obj instanceof C4050 ? (C4050) obj : null;
        Throwable th = c4050 != null ? c4050.f637 : null;
        synchronized (c5558) {
            zM17306 = c5558.m17306();
            List<Throwable> listM17309 = c5558.m17309(th);
            thM17269 = m17269(c5558, listM17309);
            if (thM17269 != null) {
                m17252(thM17269, listM17309);
            }
        }
        if (thM17269 != null && thM17269 != th) {
            obj = new C4050(thM17269, false, 2, null);
        }
        if (thM17269 != null && (m17258(thM17269) || mo6417(thM17269))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((C4050) obj).m1003();
        }
        if (!zM17306) {
            mo6418(thM17269);
        }
        mo5777(obj);
        C3008.m74(f13535, this, c5558, C5561.m17319(obj));
        m17259(c5558, obj);
        return obj;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public final InterfaceC3814 mo17165(@InterfaceC6399 InterfaceC3816 interfaceC3816) {
        return (InterfaceC3814) InterfaceC5542.C0790.m17169(this, true, false, new C3815(interfaceC3816), 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final C3815 m17264(InterfaceC5424 interfaceC5424) {
        C3815 c3815 = interfaceC5424 instanceof C3815 ? (C3815) interfaceC5424 : null;
        if (c3815 != null) {
            return c3815;
        }
        C6384 c6384Mo13920 = interfaceC5424.mo13920();
        if (c6384Mo13920 != null) {
            return m17284(c6384Mo13920);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final Object m17265() throws Throwable {
        Object objM17273 = m17273();
        if (!(!(objM17273 instanceof InterfaceC5424))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objM17273 instanceof C4050) {
            throw ((C4050) objM17273).f637;
        }
        return C5561.m17327(objM17273);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public final Throwable m17266() {
        Object objM17273 = m17273();
        if (objM17273 instanceof C5558) {
            Throwable thM17305 = ((C5558) objM17273).m17305();
            if (thM17305 != null) {
                return thM17305;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objM17273 instanceof InterfaceC5424)) {
            if (objM17273 instanceof C4050) {
                return ((C4050) objM17273).f637;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final boolean m17267() {
        Object objM17273 = m17273();
        return (objM17273 instanceof C4050) && ((C4050) objM17273).m1002();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public final Throwable m17268(Object obj) {
        C4050 c4050 = obj instanceof C4050 ? (C4050) obj : null;
        if (c4050 != null) {
            return c4050.f637;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final Throwable m17269(C5558 c5558, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (c5558.m17306()) {
                return new C5543(mo5774(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof C7828) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C7828)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // Yue.InterfaceC6611
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public CancellationException mo17270() {
        Throwable thM17305;
        Object objM17273 = m17273();
        if (objM17273 instanceof C5558) {
            thM17305 = ((C5558) objM17273).m17305();
        } else if (objM17273 instanceof C4050) {
            thM17305 = ((C4050) objM17273).f637;
        } else {
            if (objM17273 instanceof InterfaceC5424) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM17273).toString());
            }
            thM17305 = null;
        }
        CancellationException cancellationException = thM17305 instanceof CancellationException ? (CancellationException) thM17305 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C5543("Parent job is " + m17296(objM17273), thM17305, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public boolean mo17173() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    public boolean mo11469() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final C6384 m17271(InterfaceC5424 interfaceC5424) {
        C6384 c6384Mo13920 = interfaceC5424.mo13920();
        if (c6384Mo13920 != null) {
            return c6384Mo13920;
        }
        if (interfaceC5424 instanceof C4628) {
            return new C6384();
        }
        if (interfaceC5424 instanceof AbstractC5556) {
            m17290((AbstractC5556) interfaceC5424);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC5424).toString());
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final InterfaceC3814 m17272() {
        return (InterfaceC3814) this._parentHandle;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public final Object m17273() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC6567)) {
                return obj;
            }
            ((AbstractC6567) obj).mo9118(this);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public boolean mo6417(@InterfaceC6399 Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
    public void mo5775(@InterfaceC6399 Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final void m17274(@InterfaceC6489 InterfaceC5542 interfaceC5542) {
        if (interfaceC5542 == null) {
            m17294(C6389.f16164);
            return;
        }
        interfaceC5542.start();
        InterfaceC3814 interfaceC3814Mo17165 = interfaceC5542.mo17165(this);
        m17294(interfaceC3814Mo17165);
        if (mo17157()) {
            interfaceC3814Mo17165.mo5757();
            m17294(C6389.f16164);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final boolean m17275(InterfaceC5424 interfaceC5424) {
        return (interfaceC5424 instanceof C5558) && ((C5558) interfaceC5424).m17306();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public final boolean m17276() {
        return m17273() instanceof C4050;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public boolean mo9505() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final boolean m17277() {
        Object objM17273;
        do {
            objM17273 = m17273();
            if (!(objM17273 instanceof InterfaceC5424)) {
                return false;
            }
        } while (m17295(objM17273) < 0);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Object m17278(InterfaceC4199<? super C8107> interfaceC4199) {
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        C3668.m735(c3666, mo17160(new C7154(c3666)));
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final Void m17279(InterfaceC5124<Object, C8107> interfaceC5124) {
        while (true) {
            interfaceC5124.invoke(m17273());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final Object m17280(Object obj) throws Throwable {
        Throwable thM17261 = null;
        while (true) {
            Object objM17273 = m17273();
            if (objM17273 instanceof C5558) {
                synchronized (objM17273) {
                    if (((C5558) objM17273).m17308()) {
                        return C5561.f13550;
                    }
                    boolean zM17306 = ((C5558) objM17273).m17306();
                    if (obj != null || !zM17306) {
                        if (thM17261 == null) {
                            thM17261 = m17261(obj);
                        }
                        ((C5558) objM17273).m2292(thM17261);
                    }
                    Throwable thM17305 = zM17306 ^ true ? ((C5558) objM17273).m17305() : null;
                    if (thM17305 != null) {
                        m17285(((C5558) objM17273).mo13920(), thM17305);
                    }
                    return C5561.f1564;
                }
            }
            if (!(objM17273 instanceof InterfaceC5424)) {
                return C5561.f13550;
            }
            if (thM17261 == null) {
                thM17261 = m17261(obj);
            }
            InterfaceC5424 interfaceC5424 = (InterfaceC5424) objM17273;
            if (!interfaceC5424.mo13919()) {
                Object objM17301 = m17301(objM17273, new C4050(thM17261, false, 2, null));
                if (objM17301 == C5561.f1564) {
                    throw new IllegalStateException(("Cannot happen in " + objM17273).toString());
                }
                if (objM17301 != C5561.f13549) {
                    return objM17301;
                }
            } else if (m17300(interfaceC5424, thM17261)) {
                return C5561.f1564;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m17281(@InterfaceC6489 Object obj) {
        Object objM17301;
        do {
            objM17301 = m17301(m17273(), obj);
            if (objM17301 == C5561.f1564) {
                return false;
            }
            if (objM17301 == C5561.f1565) {
                return true;
            }
        } while (objM17301 == C5561.f13549);
        mo9504(objM17301);
        return true;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final Object m17282(@InterfaceC6489 Object obj) {
        Object objM17301;
        do {
            objM17301 = m17301(m17273(), obj);
            if (objM17301 == C5561.f1564) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m17268(obj));
            }
        } while (objM17301 == C5561.f13549);
        return objM17301;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final AbstractC5556 m17283(InterfaceC5124<? super Throwable, C8107> interfaceC5124, boolean z) {
        AbstractC5556 c5516;
        if (z) {
            c5516 = interfaceC5124 instanceof AbstractC5544 ? (AbstractC5544) interfaceC5124 : null;
            if (c5516 == null) {
                c5516 = new C5515(interfaceC5124);
            }
        } else {
            c5516 = interfaceC5124 instanceof AbstractC5556 ? (AbstractC5556) interfaceC5124 : null;
            if (c5516 == null) {
                c5516 = new C5516(interfaceC5124);
            }
        }
        c5516.m17242(this);
        return c5516;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ */
    public String mo5776() {
        return C4325.m1288(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public final C3815 m17284(C5850 c5850) {
        while (c5850.mo18077()) {
            c5850 = c5850.m18106();
        }
        while (true) {
            c5850 = c5850.m18105();
            if (!c5850.mo18077()) {
                if (c5850 instanceof C3815) {
                    return (C3815) c5850;
                }
                if (c5850 instanceof C6384) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public final void m17285(C6384 c6384, Throwable th) throws Throwable {
        mo6418(th);
        C4053 c4053 = null;
        for (C5850 c5850M18105 = (C5850) c6384.m18104(); !C5499.m17094(c5850M18105, c6384); c5850M18105 = c5850M18105.m18105()) {
            if (c5850M18105 instanceof AbstractC5544) {
                AbstractC5556 abstractC5556 = (AbstractC5556) c5850M18105;
                try {
                    abstractC5556.mo9329(th);
                } catch (Throwable th2) {
                    if (c4053 != null) {
                        C4741.m1656(c4053, th2);
                    } else {
                        c4053 = new C4053("Exception in completion handler " + abstractC5556 + " for " + this, th2);
                        C8107 c8107 = C8107.f3222;
                    }
                }
            }
        }
        if (c4053 != null) {
            mo5775(c4053);
        }
        m17258(th);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final void m17286(C6384 c6384, Throwable th) throws Throwable {
        C4053 c4053 = null;
        for (C5850 c5850M18105 = (C5850) c6384.m18104(); !C5499.m17094(c5850M18105, c6384); c5850M18105 = c5850M18105.m18105()) {
            if (c5850M18105 instanceof AbstractC5556) {
                AbstractC5556 abstractC5556 = (AbstractC5556) c5850M18105;
                try {
                    abstractC5556.mo9329(th);
                } catch (Throwable th2) {
                    if (c4053 != null) {
                        C4741.m1656(c4053, th2);
                    } else {
                        c4053 = new C4053("Exception in completion handler " + abstractC5556 + " for " + this, th2);
                        C8107 c8107 = C8107.f3222;
                    }
                }
            }
        }
        if (c4053 != null) {
            mo5775(c4053);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final /* synthetic */ <T extends AbstractC5556> void m17287(C6384 c6384, Throwable th) throws Throwable {
        C4053 c4053 = null;
        for (C5850 c5850M18105 = (C5850) c6384.m18104(); !C5499.m17094(c5850M18105, c6384); c5850M18105 = c5850M18105.m18105()) {
            C5499.m17112(3, C4750.f10502);
            if (c5850M18105 instanceof C5850) {
                AbstractC5556 abstractC5556 = (AbstractC5556) c5850M18105;
                try {
                    abstractC5556.mo9329(th);
                } catch (Throwable th2) {
                    if (c4053 != null) {
                        C4741.m1656(c4053, th2);
                    } else {
                        c4053 = new C4053("Exception in completion handler " + abstractC5556 + " for " + this, th2);
                        C8107 c8107 = C8107.f3222;
                    }
                }
            }
        }
        if (c4053 != null) {
            mo5775(c4053);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠ */
    public void mo6418(@InterfaceC6489 Throwable th) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ */
    public void mo5777(@InterfaceC6489 Object obj) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void mo17288() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m17289(C4628 c4628) {
        C6384 c6384 = new C6384();
        Object c5423 = c6384;
        if (!c4628.mo13919()) {
            c5423 = new C5423(c6384);
        }
        C3008.m74(f13535, this, c4628, c5423);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public final void m17290(AbstractC5556 abstractC5556) {
        abstractC5556.m18098(new C6384());
        C3008.m74(f13535, this, abstractC5556, abstractC5556.m18105());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public final <T, R> void m17291(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        Object objM17273;
        do {
            objM17273 = m17273();
            if (interfaceC7289.mo22761()) {
                return;
            }
            if (!(objM17273 instanceof InterfaceC5424)) {
                if (interfaceC7289.mo22760()) {
                    if (objM17273 instanceof C4050) {
                        interfaceC7289.mo22763(((C4050) objM17273).f637);
                        return;
                    } else {
                        C8103.m26704(interfaceC5138, C5561.m17327(objM17273), interfaceC7289.mo22762());
                        return;
                    }
                }
                return;
            }
        } while (m17295(objM17273) != 0);
        interfaceC7289.mo22764(mo17160(new C7280(interfaceC7289, interfaceC5138)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final void m17292(@InterfaceC6399 AbstractC5556 abstractC5556) {
        Object objM17273;
        do {
            objM17273 = m17273();
            if (!(objM17273 instanceof AbstractC5556)) {
                if (!(objM17273 instanceof InterfaceC5424) || ((InterfaceC5424) objM17273).mo13920() == null) {
                    return;
                }
                abstractC5556.mo18079();
                return;
            }
            if (objM17273 != abstractC5556) {
                return;
            }
        } while (!C3008.m74(f13535, this, objM17273, C5561.f13556));
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۣ۟ۨۥ.ۥ۟۟۟۠(Yue.ۥۣ۠ۢۢ, java.lang.Object, Yue.ۥ۟ۧۤۢ, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):void */
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public final <T, R> void m17293(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) throws Throwable {
        Object objM17273 = m17273();
        if (objM17273 instanceof C4050) {
            interfaceC7289.mo22763(((C4050) objM17273).f637);
        } else {
            C3672.m10063(interfaceC5138, C5561.m17327(objM17273), interfaceC7289.mo22762(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final void m17294(@InterfaceC6489 InterfaceC3814 interfaceC3814) {
        this._parentHandle = interfaceC3814;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final int m17295(Object obj) {
        if (obj instanceof C4628) {
            if (((C4628) obj).mo13919()) {
                return 0;
            }
            if (!C3008.m74(f13535, this, obj, C5561.f13556)) {
                return -1;
            }
            mo17288();
            return 1;
        }
        if (!(obj instanceof C5423)) {
            return 0;
        }
        if (!C3008.m74(f13535, this, obj, ((C5423) obj).mo13920())) {
            return -1;
        }
        mo17288();
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public final String m17296(Object obj) {
        if (!(obj instanceof C5558)) {
            return obj instanceof InterfaceC5424 ? ((InterfaceC5424) obj).mo13919() ? "Active" : "New" : obj instanceof C4050 ? "Cancelled" : "Completed";
        }
        C5558 c5558 = (C5558) obj;
        return c5558.m17306() ? "Cancelling" : c5558.m17307() ? "Completing" : "Active";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public final CancellationException m17297(@InterfaceC6399 Throwable th, @InterfaceC6489 String str) {
        CancellationException c5543 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c5543 == null) {
            if (str == null) {
                str = mo5774();
            }
            c5543 = new C5543(str, th, this);
        }
        return c5543;
    }

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final String m17298() {
        return mo5776() + C6193.f1884 + m17296(m17273()) + C6193.f1885;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final boolean m17299(InterfaceC5424 interfaceC5424, Object obj) throws Throwable {
        if (!C3008.m74(f13535, this, interfaceC5424, C5561.m17319(obj))) {
            return false;
        }
        mo6418(null);
        mo5777(obj);
        m17259(interfaceC5424, obj);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public final boolean m17300(InterfaceC5424 interfaceC5424, Throwable th) throws Throwable {
        C6384 c6384M17271 = m17271(interfaceC5424);
        if (c6384M17271 == null) {
            return false;
        }
        if (!C3008.m74(f13535, this, interfaceC5424, new C5558(c6384M17271, false, th))) {
            return false;
        }
        m17285(c6384M17271, th);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public final Object m17301(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC5424) ? C5561.f1564 : ((!(obj instanceof C4628) && !(obj instanceof AbstractC5556)) || (obj instanceof C3815) || (obj2 instanceof C4050)) ? m17302((InterfaceC5424) obj, obj2) : m17299((InterfaceC5424) obj, obj2) ? obj2 : C5561.f13549;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Yue.ۥ۠ۦ۠۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public final Object m17302(InterfaceC5424 interfaceC5424, Object obj) throws Throwable {
        C6384 c6384M17271 = m17271(interfaceC5424);
        if (c6384M17271 == null) {
            return C5561.f13549;
        }
        C5558 c5558 = interfaceC5424 instanceof C5558 ? (C5558) interfaceC5424 : null;
        if (c5558 == null) {
            c5558 = new C5558(c6384M17271, false, null);
        }
        C7060.C7066 c7066 = new C7060.C7066();
        synchronized (c5558) {
            if (c5558.m17307()) {
                return C5561.f1564;
            }
            c5558.m17310(true);
            if (c5558 != interfaceC5424 && !C3008.m74(f13535, this, interfaceC5424, c5558)) {
                return C5561.f13549;
            }
            boolean zM17306 = c5558.m17306();
            C4050 c4050 = obj instanceof C4050 ? (C4050) obj : null;
            if (c4050 != null) {
                c5558.m2292(c4050.f637);
            }
            ?? M17305 = true ^ zM17306 ? c5558.m17305() : 0;
            c7066.f21353 = M17305;
            C8107 c8107 = C8107.f3222;
            if (M17305 != 0) {
                m17285(c6384M17271, M17305);
            }
            C3815 c3815M17264 = m17264(interfaceC5424);
            return (c3815M17264 == null || !m17303(c5558, c3815M17264, obj)) ? m17263(c5558, obj) : C5561.f1565;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final boolean m17303(C5558 c5558, C3815 c3815, Object obj) {
        while (InterfaceC5542.C0790.m17169(c3815.f7084, false, false, new C0796(this, c5558, c3815, obj), 1, null) == C6389.f16164) {
            c3815 = m17284(c3815);
            if (c3815 == null) {
                return false;
            }
        }
        return true;
    }
}
