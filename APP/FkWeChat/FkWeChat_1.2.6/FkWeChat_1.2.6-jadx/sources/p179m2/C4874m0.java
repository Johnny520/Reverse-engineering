package p179m2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.InterfaceC0625y1;
import ec.AbstractC2140i;
import ec.AbstractC2149k0;
import ec.C2122d1;
import ec.InterfaceC2165o0;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.InterfaceC4705l;
import p185m8.C5096o;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p278t3.AbstractC8101d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m2.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4874m0 extends AbstractC2149k0 {

    /* JADX INFO: renamed from: C */
    public static final c f14550C = new c(null);

    /* JADX INFO: renamed from: D */
    public static final int f14551D = 8;

    /* JADX INFO: renamed from: E */
    public static final InterfaceC4705l f14552E = AbstractC4706m.m18787a(a.f14564r);

    /* JADX INFO: renamed from: F */
    public static final ThreadLocal f14553F = new b();

    /* JADX INFO: renamed from: A */
    public final d f14554A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC0625y1 f14555B;

    /* JADX INFO: renamed from: s */
    public final Choreographer f14556s;

    /* JADX INFO: renamed from: t */
    public final Handler f14557t;

    /* JADX INFO: renamed from: u */
    public final Object f14558u;

    /* JADX INFO: renamed from: v */
    public final C5096o f14559v;

    /* JADX INFO: renamed from: w */
    public List f14560w;

    /* JADX INFO: renamed from: x */
    public List f14561x;

    /* JADX INFO: renamed from: y */
    public boolean f14562y;

    /* JADX INFO: renamed from: z */
    public boolean f14563z;

    /* JADX INFO: renamed from: m2.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final a f14564r = new a();

        /* JADX INFO: renamed from: m2.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10148a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f14565q;

            public C10148a(InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10148a(interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10148a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6325c.m24992g();
                if (this.f14565q == 0) {
                    AbstractC4713t.m18808b(obj);
                    return Choreographer.getInstance();
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5980j invoke() {
            C4874m0 c4874m0 = new C4874m0(AbstractC4879n0.m19520b() ? Choreographer.getInstance() : (Choreographer) AbstractC2140i.m7760e(C2122d1.m7728c(), new C10148a(null)), AbstractC8101d.m31317a(Looper.getMainLooper()), null);
            return c4874m0.mo1651c0(c4874m0.m19495S0());
        }
    }

    /* JADX INFO: renamed from: m2.m0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5980j initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                C4874m0 c4874m0 = new C4874m0(choreographer, AbstractC8101d.m31317a(looperMyLooper), null);
                return c4874m0.mo1651c0(c4874m0.m19495S0());
            }
            C10010p0.m38820a("no Looper on this thread");
            return null;
        }
    }

    /* JADX INFO: renamed from: m2.m0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C4874m0.this.f14557t.removeCallbacks(this);
            C4874m0.this.m19498V0();
            C4874m0.this.m19497U0(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            C4874m0.this.m19498V0();
            Object obj = C4874m0.this.f14558u;
            C4874m0 c4874m0 = C4874m0.this;
            synchronized (obj) {
                try {
                    if (c4874m0.f14560w.isEmpty()) {
                        c4874m0.m19494R0().removeFrameCallback(this);
                        c4874m0.f14563z = false;
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4874m0(Choreographer choreographer, Handler handler) {
        this.f14556s = choreographer;
        this.f14557t = handler;
        this.f14558u = new Object();
        this.f14559v = new C5096o();
        this.f14560w = new ArrayList();
        this.f14561x = new ArrayList();
        this.f14554A = new d();
        this.f14555B = new C4884o0(choreographer, this);
    }

    /* JADX INFO: renamed from: R0 */
    public final Choreographer m19494R0() {
        return this.f14556s;
    }

    /* JADX INFO: renamed from: S0 */
    public final InterfaceC0625y1 m19495S0() {
        return this.f14555B;
    }

    /* JADX INFO: renamed from: T0 */
    public final Runnable m19496T0() {
        Runnable runnable;
        synchronized (this.f14558u) {
            runnable = (Runnable) this.f14559v.m20635x();
        }
        return runnable;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m19497U0(long j10) {
        synchronized (this.f14558u) {
            if (this.f14563z) {
                this.f14563z = false;
                List list = this.f14560w;
                this.f14560w = this.f14561x;
                this.f14561x = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m19498V0() {
        boolean z10;
        do {
            Runnable runnableM19496T0 = m19496T0();
            while (runnableM19496T0 != null) {
                runnableM19496T0.run();
                runnableM19496T0 = m19496T0();
            }
            synchronized (this.f14558u) {
                if (this.f14559v.isEmpty()) {
                    z10 = false;
                    this.f14562y = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m19499W0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f14558u) {
            try {
                this.f14560w.add(frameCallback);
                if (!this.f14563z) {
                    this.f14563z = true;
                    this.f14556s.postFrameCallback(this.f14554A);
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m19500X0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f14558u) {
            this.f14560w.remove(frameCallback);
        }
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        synchronized (this.f14558u) {
            try {
                this.f14559v.addLast(runnable);
                if (!this.f14562y) {
                    this.f14562y = true;
                    this.f14557t.post(this.f14554A);
                    if (!this.f14563z) {
                        this.f14563z = true;
                        this.f14556s.postFrameCallback(this.f14554A);
                    }
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m2.m0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC5980j m19503a() {
            if (AbstractC4879n0.m19520b()) {
                return m19504b();
            }
            InterfaceC5980j interfaceC5980j = (InterfaceC5980j) C4874m0.f14553F.get();
            if (interfaceC5980j != null) {
                return interfaceC5980j;
            }
            C10010p0.m38820a("no AndroidUiDispatcher for this thread");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC5980j m19504b() {
            return (InterfaceC5980j) C4874m0.f14552E.getValue();
        }

        public c() {
        }
    }

    public /* synthetic */ C4874m0(Choreographer choreographer, Handler handler, AbstractC1043k abstractC1043k) {
        this(choreographer, handler);
    }
}
