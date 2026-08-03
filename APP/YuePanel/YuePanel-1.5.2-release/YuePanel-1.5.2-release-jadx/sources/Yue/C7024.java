package Yue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class C7024 implements InterfaceC3645 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C6504 f21169;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7101 f21170;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f21171;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7030 f21172;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4712 f21173;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7025 f21174;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final AtomicBoolean f21175;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6489
    public Object f21176;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6489
    public C4744 f21177;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C7026 f21178;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f21179;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C4742 f21180;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f21181;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f21182;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f21183;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public volatile boolean f21184;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile C4742 f21185;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile C7026 f21186;

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ */
    @InterfaceC7507({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class RunnableC1140 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3649 f21187;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public volatile AtomicInteger f21188;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7024 f21189;

        public RunnableC1140(@InterfaceC6399 C7024 c7024, InterfaceC3649 interfaceC3649) {
            C5499.m17103(interfaceC3649, "responseCallback");
            this.f21189 = c7024;
            this.f21187 = interfaceC3649;
            this.f21188 = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            C4421 c4421M20640;
            String str = "OkHttp " + this.f21189.m21834();
            C7024 c7024 = this.f21189;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c7024.f21174.m9089();
                try {
                    try {
                        z = true;
                        try {
                            this.f21187.mo717(c7024, c7024.m21830());
                            c4421M20640 = c7024.m21823().m20640();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                C6668.f2226.m21321().m21315("Callback failure for " + c7024.m21841(), 4, e);
                            } else {
                                this.f21187.mo716(c7024, e);
                            }
                            c4421M20640 = c7024.m21823().m20640();
                        } catch (Throwable th2) {
                            th = th2;
                            c7024.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                C4741.m1656(iOException, th);
                                this.f21187.mo716(c7024, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c7024.m21823().m20640().m12857(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                c4421M20640.m12857(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m3320(@InterfaceC6399 ExecutorService executorService) {
            C5499.m17103(executorService, "executorService");
            C4421 c4421M20640 = this.f21189.m21823().m20640();
            if (C8158.f24182 && Thread.holdsLock(c4421M20640)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c4421M20640);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f21189.m21833(interruptedIOException);
                    this.f21187.mo716(this.f21189, interruptedIOException);
                    this.f21189.m21823().m20640().m12857(this);
                }
            } catch (Throwable th) {
                this.f21189.m21823().m20640().m12857(this);
                throw th;
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C7024 m3321() {
            return this.f21189;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AtomicInteger m21842() {
            return this.f21188;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String m21843() {
            return this.f21189.m21829().m22160().m16772();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C7101 m21844() {
            return this.f21189.m21829();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m21845(@InterfaceC6399 RunnableC1140 runnableC1140) {
            C5499.m17103(runnableC1140, "other");
            this.f21188 = runnableC1140.f21188;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ۟ */
    public static final class C1141 extends WeakReference<C7024> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public final Object f2633;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1141(@InterfaceC6399 C7024 c7024, @InterfaceC6489 Object obj) {
            super(c7024);
            C5499.m17103(c7024, "referent");
            this.f2633 = obj;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final Object m3322() {
            return this.f2633;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7025 extends C3443 {
        public C7025() {
        }

        @Override // Yue.C3443
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public void mo9095() {
            C7024.this.cancel();
        }
    }

    public C7024(@InterfaceC6399 C6504 c6504, @InterfaceC6399 C7101 c7101, boolean z) {
        C5499.m17103(c6504, "client");
        C5499.m17103(c7101, "originalRequest");
        this.f21169 = c6504;
        this.f21170 = c7101;
        this.f21171 = z;
        this.f21172 = c6504.m20637().m11697();
        this.f21173 = c6504.m20642().mo1626(this);
        C7025 c7025 = new C7025();
        c7025.mo15622(c6504.m20633(), TimeUnit.MILLISECONDS);
        this.f21174 = c7025;
        this.f21175 = new AtomicBoolean();
        this.f21183 = true;
    }

    @Override // Yue.InterfaceC3645
    public void cancel() {
        if (this.f21184) {
            return;
        }
        this.f21184 = true;
        C4742 c4742 = this.f21185;
        if (c4742 != null) {
            c4742.m1659();
        }
        C7026 c7026 = this.f21186;
        if (c7026 != null) {
            c7026.m21848();
        }
        this.f21173.mo14053(this);
    }

    @Override // Yue.InterfaceC3645
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C7101 mo712() {
        return this.f21170;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21816(@InterfaceC6399 C7026 c7026) {
        C5499.m17103(c7026, C5368.f13116);
        if (!C8158.f24182 || Thread.holdsLock(c7026)) {
            if (this.f21178 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f21178 = c7026;
            c7026.m21858().add(new C1141(this, this.f21176));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7026);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final <E extends IOException> E m21817(E e) {
        Socket socketM21835;
        boolean z = C8158.f24182;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        C7026 c7026 = this.f21178;
        if (c7026 != null) {
            if (z && Thread.holdsLock(c7026)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7026);
            }
            synchronized (c7026) {
                socketM21835 = m21835();
            }
            if (this.f21178 == null) {
                if (socketM21835 != null) {
                    C8158.m26846(socketM21835);
                }
                this.f21173.mo14058(this, c7026);
            } else if (socketM21835 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        E e2 = (E) m21840(e);
        if (e != null) {
            AbstractC4712 abstractC4712 = this.f21173;
            C5499.m17100(e2);
            abstractC4712.mo14051(this, e2);
        } else {
            this.f21173.mo14050(this);
        }
        return e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m21818() {
        this.f21176 = C6668.f2226.m21321().mo6576("response.body().close()");
        this.f21173.mo14052(this);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۨ()LYue/ۥۣ۟ۦۣ; */
    @Override // Yue.InterfaceC3645
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C7024 mo9976() {
        return new C7024(this.f21169, this.f21170, this.f21171);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C3175 m21820(C5385 c5385) {
        SSLSocketFactory sSLSocketFactoryM20659;
        HostnameVerifier hostnameVerifierM20646;
        C3686 c3686M20635;
        if (c5385.m16773()) {
            sSLSocketFactoryM20659 = this.f21169.m20659();
            hostnameVerifierM20646 = this.f21169.m20646();
            c3686M20635 = this.f21169.m20635();
        } else {
            sSLSocketFactoryM20659 = null;
            hostnameVerifierM20646 = null;
            c3686M20635 = null;
        }
        return new C3175(c5385.m16772(), c5385.m16779(), this.f21169.m20641(), this.f21169.m20658(), sSLSocketFactoryM20659, hostnameVerifierM20646, c3686M20635, this.f21169.m20654(), this.f21169.m20653(), this.f21169.m20652(), this.f21169.m20638(), this.f21169.m20655());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m21821(@InterfaceC6399 C7101 c7101, boolean z) {
        C5499.m17103(c7101, "request");
        if (this.f21180 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f21182)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f21181)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C8107 c8107 = C8107.f3222;
        }
        if (z) {
            this.f21177 = new C4744(this.f21172, m21820(c7101.m22160()), this, this.f21173);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m21822(boolean z) {
        C4742 c4742;
        synchronized (this) {
            if (!this.f21183) {
                throw new IllegalStateException("released".toString());
            }
            C8107 c8107 = C8107.f3222;
        }
        if (z && (c4742 = this.f21185) != null) {
            c4742.m14272();
        }
        this.f21180 = null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C6504 m21823() {
        return this.f21169;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C7026 m21824() {
        return this.f21178;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C7026 m21825() {
        return this.f21186;
    }

    @Override // Yue.InterfaceC3645
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public C7141 mo9973() {
        if (!this.f21175.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f21174.m9089();
        m21818();
        try {
            this.f21169.m20640().m12853(this);
            return m21830();
        } finally {
            this.f21169.m20640().m12858(this);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final AbstractC4712 m21826() {
        return this.f21173;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m21827() {
        return this.f21171;
    }

    @Override // Yue.InterfaceC3645
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo9974() {
        return this.f21175.get();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final C4742 m21828() {
        return this.f21180;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C7101 m21829() {
        return this.f21170;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7141 m21830() throws Throwable {
        ArrayList arrayList = new ArrayList();
        C3885.m10772(arrayList, this.f21169.m20647());
        arrayList.add(new C7158(this.f21169));
        arrayList.add(new C3591(this.f21169.m20639()));
        arrayList.add(new C3642(this.f21169.m20632()));
        arrayList.add(C4102.f670);
        if (!this.f21171) {
            C3885.m10772(arrayList, this.f21169.m20649());
        }
        arrayList.add(new C3646(this.f21171));
        boolean z = false;
        try {
            C7141 c7141Mo17083 = new C7031(this, arrayList, 0, null, this.f21170, this.f21169.m20636(), this.f21169.m20656(), this.f21169.m20661()).mo17083(this.f21170);
            if (mo9975()) {
                C8158.m26844(c7141Mo17083);
                throw new IOException("Canceled");
            }
            m21833(null);
            return c7141Mo17083;
        } catch (IOException e) {
            try {
                IOException iOExceptionM21833 = m21833(e);
                C5499.m17101(iOExceptionM21833, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM21833;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    m21833(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C4742 m21831(@InterfaceC6399 C7031 c7031) throws IOException {
        C5499.m17103(c7031, "chain");
        synchronized (this) {
            if (!this.f21183) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f21182)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f21181)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C8107 c8107 = C8107.f3222;
        }
        C4744 c4744 = this.f21177;
        C5499.m17100(c4744);
        C4742 c4742 = new C4742(this, this.f21173, c4744, c4744.m1662(this.f21169, c7031));
        this.f21180 = c4742;
        this.f21185 = c4742;
        synchronized (this) {
            this.f21181 = true;
            this.f21182 = true;
        }
        if (this.f21184) {
            throw new IOException("Canceled");
        }
        return c4742;
    }

    @Override // Yue.InterfaceC3645
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo9975() {
        return this.f21184;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final <E extends IOException> E m21832(@InterfaceC6399 C4742 c4742, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        C5499.m17103(c4742, "exchange");
        if (!C5499.m17094(c4742, this.f21185)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.f21181) {
                        if (z2 || !this.f21182) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.f21181 = false;
                    }
                    if (z2) {
                        this.f21182 = false;
                    }
                    boolean z5 = this.f21181;
                    boolean z6 = (z5 || this.f21182) ? false : true;
                    if (!z5 && !this.f21182 && !this.f21183) {
                        z3 = true;
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            C8107 c8107 = C8107.f3222;
        }
        if (z3) {
            this.f21185 = null;
            C7026 c7026 = this.f21178;
            if (c7026 != null) {
                c7026.m21863();
            }
        }
        return z4 ? (E) m21817(e) : e;
    }

    @Override // Yue.InterfaceC3645
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo9977(@InterfaceC6399 InterfaceC3649 interfaceC3649) {
        C5499.m17103(interfaceC3649, "responseCallback");
        if (!this.f21175.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m21818();
        this.f21169.m20640().m12852(new RunnableC1140(this, interfaceC3649));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final IOException m21833(@InterfaceC6489 IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.f21183) {
                    this.f21183 = false;
                    if (!this.f21181 && !this.f21182) {
                        z = true;
                    }
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? m21817(iOException) : iOException;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final String m21834() {
        return this.f21170.m22160().m16787();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Socket m21835() {
        C7026 c7026 = this.f21178;
        C5499.m17100(c7026);
        if (C8158.f24182 && !Thread.holdsLock(c7026)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7026);
        }
        List<Reference<C7024>> listM21858 = c7026.m21858();
        Iterator<Reference<C7024>> it = listM21858.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (C5499.m17094(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listM21858.remove(i);
        this.f21178 = null;
        if (listM21858.isEmpty()) {
            c7026.m21872(System.nanoTime());
            if (this.f21172.m21878(c7026)) {
                return c7026.mo11696();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final boolean m21836() {
        C4744 c4744 = this.f21177;
        C5499.m17100(c4744);
        return c4744.m14304();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m21837(@InterfaceC6489 C7026 c7026) {
        this.f21186 = c7026;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥۢۡۤۧ; */
    @Override // Yue.InterfaceC3645
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3443 mo711() {
        return this.f21174;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m21839() {
        if (!(!this.f21179)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f21179 = true;
        this.f21174.m9090();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final <E extends IOException> E m21840(E e) {
        if (this.f21179 || !this.f21174.m9090()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final String m21841() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo9975() ? "canceled " : "");
        sb.append(this.f21171 ? "web socket" : C6411.f16272);
        sb.append(" to ");
        sb.append(m21834());
        return sb.toString();
    }
}
