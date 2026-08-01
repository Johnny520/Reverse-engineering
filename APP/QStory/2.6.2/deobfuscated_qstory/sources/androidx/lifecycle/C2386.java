package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0053;
import androidx.activity.C0020;
import io.ktor.util.C4210;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5266;
import p007.AbstractC6136;
import p183.C7764;
import p183.C7766;
import p191.C7804;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386 extends AbstractC2402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final WeakReference f7017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Lifecycle$State f7018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7766 f7019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f7020;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f7021;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7022;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5266 f7023;

    public C2386(InterfaceC2388 interfaceC2388, boolean z) {
        new AtomicReference(null);
        this.f7020 = z;
        this.f7019 = new C7766();
        Lifecycle$State lifecycle$State = Lifecycle$State.INITIALIZED;
        this.f7018 = lifecycle$State;
        this.f7021 = new ArrayList();
        this.f7017 = new WeakReference(interfaceC2388);
        this.f7023 = AbstractC5321.m10328(lifecycle$State);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4488(Lifecycle$State lifecycle$State) {
        if (this.f7018 == lifecycle$State) {
            return;
        }
        InterfaceC2388 interfaceC2388 = (InterfaceC2388) this.f7017.get();
        Lifecycle$State lifecycle$State2 = this.f7018;
        lifecycle$State2.getClass();
        lifecycle$State.getClass();
        if (lifecycle$State2 == Lifecycle$State.INITIALIZED && lifecycle$State == Lifecycle$State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle$State.CREATED + "' to be moved to '" + lifecycle$State + "' in component " + interfaceC2388).toString());
        }
        Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
        if (lifecycle$State2 == lifecycle$State3 && lifecycle$State2 != lifecycle$State) {
            throw new IllegalStateException(("State is '" + lifecycle$State3 + "' and cannot be moved to `" + lifecycle$State + "` in component " + interfaceC2388).toString());
        }
        this.f7018 = lifecycle$State;
        if (this.f7015 || this.f7016 != 0) {
            this.f7022 = true;
            return;
        }
        this.f7015 = true;
        m4494();
        this.f7015 = false;
        if (this.f7018 == lifecycle$State3) {
            this.f7019 = new C7766();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4489(Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        m4490("handleLifecycleEvent");
        m4488(lifecycle$Event.getTargetState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4490(String str) {
        if (this.f7020) {
            C7804.m13141().f21278.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C5919.m11251(AbstractC0053.m156("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Lifecycle$State m4491(InterfaceC2389 interfaceC2389) {
        HashMap map = this.f7019.f21068;
        C7764 c7764 = map.containsKey(interfaceC2389) ? ((C7764) map.get(interfaceC2389)).f21061 : null;
        Lifecycle$State lifecycle$State = c7764 != null ? ((C2387) c7764.f21062).f7025 : null;
        ArrayList arrayList = this.f7021;
        Lifecycle$State lifecycle$State2 = arrayList.isEmpty() ? null : (Lifecycle$State) AbstractC6136.m11555(1, arrayList);
        Lifecycle$State lifecycle$State3 = this.f7018;
        lifecycle$State3.getClass();
        if (lifecycle$State == null || lifecycle$State.compareTo(lifecycle$State3) >= 0) {
            lifecycle$State = lifecycle$State3;
        }
        return (lifecycle$State2 == null || lifecycle$State2.compareTo(lifecycle$State) >= 0) ? lifecycle$State : lifecycle$State2;
    }

    @Override // androidx.lifecycle.AbstractC2402
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4492(InterfaceC2389 interfaceC2389) {
        interfaceC2389.getClass();
        m4490("removeObserver");
        this.f7019.mo13087(interfaceC2389);
    }

    @Override // androidx.lifecycle.AbstractC2402
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4493(InterfaceC2389 interfaceC2389) {
        InterfaceC2380 c0020;
        InterfaceC2388 interfaceC2388;
        interfaceC2389.getClass();
        m4490("addObserver");
        Lifecycle$State lifecycle$State = this.f7018;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
        if (lifecycle$State != lifecycle$State2) {
            lifecycle$State2 = Lifecycle$State.INITIALIZED;
        }
        lifecycle$State2.getClass();
        C2387 c2387 = new C2387();
        HashMap map = AbstractC2385.f7014;
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
            if (AbstractC2385.m4486(cls) == 2) {
                Object obj2 = AbstractC2385.f7013.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC2385.m4487((Constructor) list.get(0), interfaceC2389);
                    throw null;
                }
                int size = list.size();
                InterfaceC2408[] interfaceC2408Arr = new InterfaceC2408[size];
                if (size > 0) {
                    AbstractC2385.m4487((Constructor) list.get(0), interfaceC2389);
                    throw null;
                }
                c0020 = new C2391(interfaceC2408Arr, i);
            } else {
                c0020 = new C0020(interfaceC2389);
            }
        }
        c2387.f7024 = c0020;
        c2387.f7025 = lifecycle$State2;
        C7766 c7766 = this.f7019;
        C7764 c7764Mo13088 = c7766.mo13088(interfaceC2389);
        if (c7764Mo13088 != null) {
            obj = c7764Mo13088.f21062;
        } else {
            HashMap map2 = c7766.f21068;
            C7764 c7764 = new C7764(interfaceC2389, c2387);
            c7766.f21054++;
            C7764 c77642 = c7766.f21055;
            if (c77642 == null) {
                c7766.f21057 = c7764;
                c7766.f21055 = c7764;
            } else {
                c77642.f21063 = c7764;
                c7764.f21061 = c77642;
                c7766.f21055 = c7764;
            }
            map2.put(interfaceC2389, c7764);
        }
        if (((C2387) obj) == null && (interfaceC2388 = (InterfaceC2388) this.f7017.get()) != null) {
            i = (this.f7016 != 0 || this.f7015) ? 1 : 0;
            Lifecycle$State lifecycle$StateM4491 = m4491(interfaceC2389);
            this.f7016++;
            while (c2387.f7025.compareTo(lifecycle$StateM4491) < 0 && this.f7019.f21068.containsKey(interfaceC2389)) {
                Lifecycle$State lifecycle$State3 = c2387.f7025;
                ArrayList arrayList = this.f7021;
                arrayList.add(lifecycle$State3);
                C2397 c2397 = Lifecycle$Event.Companion;
                Lifecycle$State lifecycle$State4 = c2387.f7025;
                c2397.getClass();
                Lifecycle$Event lifecycle$EventM4501 = C2397.m4501(lifecycle$State4);
                if (lifecycle$EventM4501 == null) {
                    C4210.m8615(c2387.f7025, "no event up from ");
                    return;
                } else {
                    c2387.m4496(interfaceC2388, lifecycle$EventM4501);
                    arrayList.remove(arrayList.size() - 1);
                    lifecycle$StateM4491 = m4491(interfaceC2389);
                }
            }
            if (i == 0) {
                m4494();
            }
            this.f7016--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f7022 = false;
        r8.f7023.m10309(r8.f7018);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4494() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2386.m4494():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4495(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        m4490("setCurrentState");
        m4488(lifecycle$State);
    }
}
