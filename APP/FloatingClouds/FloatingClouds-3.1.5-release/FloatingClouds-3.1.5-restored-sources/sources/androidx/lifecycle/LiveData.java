package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.AbstractC1116e;
import java.util.Map;
import p000a.AbstractC0553e7;
import p000a.C0040C1;
import p000a.C0124Gd;
import p000a.C0944z;
import p000a.DialogInterfaceOnCancelListenerC0646j5;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: j */
    public static final Object f4644j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f4645a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0124Gd<Object, LiveData<T>.AbstractC1110b> f4646b = new C0124Gd<>();

    /* JADX INFO: renamed from: c */
    public int f4647c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f4648d;

    /* JADX INFO: renamed from: e */
    public volatile Object f4649e;

    /* JADX INFO: renamed from: f */
    public volatile Object f4650f;

    /* JADX INFO: renamed from: g */
    public int f4651g;

    /* JADX INFO: renamed from: h */
    public boolean f4652h;

    /* JADX INFO: renamed from: i */
    public boolean f4653i;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC1110b implements InterfaceC1118g {
        public LifecycleBoundObserver() {
            throw null;
        }

        @Override // androidx.lifecycle.InterfaceC1118g
        /* JADX INFO: renamed from: a */
        public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1110b
        /* JADX INFO: renamed from: d */
        public final void mo2582d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1110b
        /* JADX INFO: renamed from: e */
        public final boolean mo2583e() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public class C1109a extends LiveData<T>.AbstractC1110b {
        @Override // androidx.lifecycle.LiveData.AbstractC1110b
        /* JADX INFO: renamed from: e */
        public final boolean mo2583e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC1110b {

        /* JADX INFO: renamed from: a */
        public final DialogInterfaceOnCancelListenerC0646j5.d f4654a;

        /* JADX INFO: renamed from: b */
        public boolean f4655b;

        /* JADX INFO: renamed from: c */
        public int f4656c = -1;

        public AbstractC1110b(DialogInterfaceOnCancelListenerC0646j5.d dVar) {
            this.f4654a = dVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m2584c(boolean z) {
            if (z == this.f4655b) {
                return;
            }
            this.f4655b = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f4647c;
            liveData.f4647c = i + i2;
            if (!liveData.f4648d) {
                liveData.f4648d = true;
                while (true) {
                    try {
                        int i3 = liveData.f4647c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.mo436e();
                        } else if (z3) {
                            liveData.mo437f();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.f4648d = false;
                        throw th;
                    }
                }
                liveData.f4648d = false;
            }
            if (this.f4655b) {
                liveData.m2580c(this);
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo2582d() {
        }

        /* JADX INFO: renamed from: e */
        public abstract boolean mo2583e();
    }

    public LiveData() {
        Object obj = f4644j;
        this.f4650f = obj;
        this.f4649e = obj;
        this.f4651g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m2578a(String str) {
        C0040C1.m122g().f157a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(C0944z.m2227g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2579b(LiveData<T>.AbstractC1110b abstractC1110b) {
        if (abstractC1110b.f4655b) {
            if (!abstractC1110b.mo2583e()) {
                abstractC1110b.m2584c(false);
                return;
            }
            int i = abstractC1110b.f4656c;
            int i2 = this.f4651g;
            if (i >= i2) {
                return;
            }
            abstractC1110b.f4656c = i2;
            DialogInterfaceOnCancelListenerC0646j5.d dVar = abstractC1110b.f4654a;
            Object obj = this.f4649e;
            dVar.getClass();
            if (((InterfaceC0935y9) obj) != null) {
                DialogInterfaceOnCancelListenerC0646j5 dialogInterfaceOnCancelListenerC0646j5 = DialogInterfaceOnCancelListenerC0646j5.this;
                if (dialogInterfaceOnCancelListenerC0646j5.f2374c0) {
                    View viewM2525B = dialogInterfaceOnCancelListenerC0646j5.m2525B();
                    if (viewM2525B.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0646j5.f2378g0 != null) {
                        if (AbstractC0553e7.m1330J(3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0646j5.f2378g0);
                        }
                        dialogInterfaceOnCancelListenerC0646j5.f2378g0.setContentView(viewM2525B);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2580c(LiveData<T>.AbstractC1110b abstractC1110b) {
        if (this.f4652h) {
            this.f4653i = true;
            return;
        }
        this.f4652h = true;
        do {
            this.f4653i = false;
            if (abstractC1110b != null) {
                m2579b(abstractC1110b);
                abstractC1110b = null;
            } else {
                C0124Gd<Object, LiveData<T>.AbstractC1110b> c0124Gd = this.f4646b;
                c0124Gd.getClass();
                C0124Gd.d dVar = new C0124Gd.d();
                c0124Gd.f407c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    m2579b((AbstractC1110b) ((Map.Entry) dVar.next()).getValue());
                    if (this.f4653i) {
                        break;
                    }
                }
            }
        } while (this.f4653i);
        this.f4652h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m2581d(DialogInterfaceOnCancelListenerC0646j5.d dVar) {
        LiveData<T>.AbstractC1110b abstractC1110b;
        m2578a("observeForever");
        C1109a c1109a = new C1109a(dVar);
        C0124Gd<Object, LiveData<T>.AbstractC1110b> c0124Gd = this.f4646b;
        C0124Gd.c<Object, LiveData<T>.AbstractC1110b> cVarMo324a = c0124Gd.mo324a(dVar);
        if (cVarMo324a != null) {
            abstractC1110b = cVarMo324a.f410b;
        } else {
            C0124Gd.c<K, V> cVar = new C0124Gd.c<>(dVar, c1109a);
            c0124Gd.f408d++;
            C0124Gd.c<Object, LiveData<T>.AbstractC1110b> cVar2 = c0124Gd.f406b;
            if (cVar2 == 0) {
                c0124Gd.f405a = cVar;
                c0124Gd.f406b = cVar;
            } else {
                cVar2.f411c = cVar;
                cVar.f412d = cVar2;
                c0124Gd.f406b = cVar;
            }
            abstractC1110b = null;
        }
        LiveData<T>.AbstractC1110b abstractC1110b2 = abstractC1110b;
        if (abstractC1110b2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1110b2 != null) {
            return;
        }
        c1109a.m2584c(true);
    }

    /* JADX INFO: renamed from: e */
    public void mo436e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo437f() {
    }
}
