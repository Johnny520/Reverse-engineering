package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0053;
import androidx.activity.C0020;
import io.ktor.util.C4211;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5267;
import p009.AbstractC6183;
import p183.C7765;
import p183.C7767;
import p191.C7805;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386 extends AbstractC2402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final WeakReference f7018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Lifecycle$State f7019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7767 f7020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f7021;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f7022;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7023;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5267 f7024;

    public C2386(InterfaceC2388 interfaceC2388, boolean z) {
        new AtomicReference(null);
        this.f7021 = z;
        this.f7020 = new C7767();
        Lifecycle$State lifecycle$State = Lifecycle$State.INITIALIZED;
        this.f7019 = lifecycle$State;
        this.f7022 = new ArrayList();
        this.f7018 = new WeakReference(interfaceC2388);
        this.f7024 = AbstractC5322.m10332(lifecycle$State);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4498(Lifecycle$State lifecycle$State) {
        if (this.f7019 == lifecycle$State) {
            return;
        }
        InterfaceC2388 interfaceC2388 = (InterfaceC2388) this.f7018.get();
        Lifecycle$State lifecycle$State2 = this.f7019;
        lifecycle$State2.getClass();
        lifecycle$State.getClass();
        if (lifecycle$State2 == Lifecycle$State.INITIALIZED && lifecycle$State == Lifecycle$State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle$State.CREATED + "' to be moved to '" + lifecycle$State + "' in component " + interfaceC2388).toString());
        }
        Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
        if (lifecycle$State2 == lifecycle$State3 && lifecycle$State2 != lifecycle$State) {
            throw new IllegalStateException(("State is '" + lifecycle$State3 + "' and cannot be moved to `" + lifecycle$State + "` in component " + interfaceC2388).toString());
        }
        this.f7019 = lifecycle$State;
        if (this.f7016 || this.f7017 != 0) {
            this.f7023 = true;
            return;
        }
        this.f7016 = true;
        m4504();
        this.f7016 = false;
        if (this.f7019 == lifecycle$State3) {
            this.f7020 = new C7767();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4499(Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        m4500("handleLifecycleEvent");
        m4498(lifecycle$Event.getTargetState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4500(String str) {
        if (this.f7021) {
            C7805.m13169().f21275.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C5925.m11312(AbstractC0053.m158("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Lifecycle$State m4501(InterfaceC2389 interfaceC2389) {
        HashMap map = this.f7020.f21065;
        C7765 c7765 = map.containsKey(interfaceC2389) ? ((C7765) map.get(interfaceC2389)).f21058 : null;
        Lifecycle$State lifecycle$State = c7765 != null ? ((C2387) c7765.f21059).f7026 : null;
        ArrayList arrayList = this.f7022;
        Lifecycle$State lifecycle$State2 = arrayList.isEmpty() ? null : (Lifecycle$State) AbstractC6183.m11586(1, arrayList);
        Lifecycle$State lifecycle$State3 = this.f7019;
        lifecycle$State3.getClass();
        if (lifecycle$State == null || lifecycle$State.compareTo(lifecycle$State3) >= 0) {
            lifecycle$State = lifecycle$State3;
        }
        return (lifecycle$State2 == null || lifecycle$State2.compareTo(lifecycle$State) >= 0) ? lifecycle$State : lifecycle$State2;
    }

    @Override // androidx.lifecycle.AbstractC2402
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4502(InterfaceC2389 interfaceC2389) {
        interfaceC2389.getClass();
        m4500("removeObserver");
        this.f7020.mo13115(interfaceC2389);
    }

    @Override // androidx.lifecycle.AbstractC2402
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4503(InterfaceC2389 interfaceC2389) {
        InterfaceC2380 c0020;
        InterfaceC2388 interfaceC2388;
        interfaceC2389.getClass();
        m4500("addObserver");
        Lifecycle$State lifecycle$State = this.f7019;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
        if (lifecycle$State != lifecycle$State2) {
            lifecycle$State2 = Lifecycle$State.INITIALIZED;
        }
        lifecycle$State2.getClass();
        C2387 c2387 = new C2387();
        HashMap map = AbstractC2385.f7015;
        boolean z = interfaceC2389 instanceof InterfaceC2380;
        boolean z2 = interfaceC2389 instanceof InterfaceC2409;
        Object obj = null;
        if (z && z2) {
            c0020 = new C0020((InterfaceC2409) interfaceC2389, (InterfaceC2380) interfaceC2389);
        } else if (z2) {
            c0020 = new C0020((InterfaceC2409) interfaceC2389, (InterfaceC2380) null);
        } else if (z) {
            c0020 = (InterfaceC2380) interfaceC2389;
        } else {
            Class<?> cls = interfaceC2389.getClass();
            if (AbstractC2385.m4496(cls) == 2) {
                Object obj2 = AbstractC2385.f7014.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC2385.m4497((Constructor) list.get(0), interfaceC2389);
                    throw null;
                }
                int size = list.size();
                InterfaceC2408[] interfaceC2408Arr = new InterfaceC2408[size];
                if (size > 0) {
                    AbstractC2385.m4497((Constructor) list.get(0), interfaceC2389);
                    throw null;
                }
                c0020 = new C2391(interfaceC2408Arr, i);
            } else {
                c0020 = new C0020(interfaceC2389);
            }
        }
        c2387.f7025 = c0020;
        c2387.f7026 = lifecycle$State2;
        C7767 c7767 = this.f7020;
        C7765 c7765Mo13116 = c7767.mo13116(interfaceC2389);
        if (c7765Mo13116 != null) {
            obj = c7765Mo13116.f21059;
        } else {
            HashMap map2 = c7767.f21065;
            C7765 c7765 = new C7765(interfaceC2389, c2387);
            c7767.f21051++;
            C7765 c77652 = c7767.f21052;
            if (c77652 == null) {
                c7767.f21054 = c7765;
                c7767.f21052 = c7765;
            } else {
                c77652.f21060 = c7765;
                c7765.f21058 = c77652;
                c7767.f21052 = c7765;
            }
            map2.put(interfaceC2389, c7765);
        }
        if (((C2387) obj) == null && (interfaceC2388 = (InterfaceC2388) this.f7018.get()) != null) {
            i = (this.f7017 != 0 || this.f7016) ? 1 : 0;
            Lifecycle$State lifecycle$StateM4501 = m4501(interfaceC2389);
            this.f7017++;
            while (c2387.f7026.compareTo(lifecycle$StateM4501) < 0 && this.f7020.f21065.containsKey(interfaceC2389)) {
                Lifecycle$State lifecycle$State3 = c2387.f7026;
                ArrayList arrayList = this.f7022;
                arrayList.add(lifecycle$State3);
                C2397 c2397 = Lifecycle$Event.Companion;
                Lifecycle$State lifecycle$State4 = c2387.f7026;
                c2397.getClass();
                Lifecycle$Event lifecycle$EventM4511 = C2397.m4511(lifecycle$State4);
                if (lifecycle$EventM4511 == null) {
                    C4211.m8605(c2387.f7026, "no event up from ");
                    return;
                } else {
                    c2387.m4506(interfaceC2388, lifecycle$EventM4511);
                    arrayList.remove(arrayList.size() - 1);
                    lifecycle$StateM4501 = m4501(interfaceC2389);
                }
            }
            if (i == 0) {
                m4504();
            }
            this.f7017--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f7023 = false;
        r8.f7024.m10313(r8.f7019);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4504() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2386.m4504():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4505(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        m4500("setCurrentState");
        m4498(lifecycle$State);
    }
}
