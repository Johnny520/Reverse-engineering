package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0900;
import androidx.activity.C0867;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import p025.AbstractC7012;
import p199.C8593;
import p199.C8594;
import p199.C8595;
import p199.C8596;
import p207.C8634;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3219 extends AbstractC3235 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final WeakReference f7363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Lifecycle$State f7364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8596 f7365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f7366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f7367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7368;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6099 f7369;

    public C3219(InterfaceC3221 interfaceC3221, boolean z) {
        new AtomicReference(null);
        this.f7366 = z;
        this.f7365 = new C8596();
        Lifecycle$State lifecycle$State = Lifecycle$State.INITIALIZED;
        this.f7364 = lifecycle$State;
        this.f7367 = new ArrayList();
        this.f7363 = new WeakReference(interfaceC3221);
        this.f7369 = AbstractC6154.m10891(lifecycle$State);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5058(Lifecycle$State lifecycle$State) {
        if (this.f7364 == lifecycle$State) {
            return;
        }
        InterfaceC3221 interfaceC3221 = (InterfaceC3221) this.f7363.get();
        Lifecycle$State lifecycle$State2 = this.f7364;
        lifecycle$State2.getClass();
        lifecycle$State.getClass();
        if (lifecycle$State2 == Lifecycle$State.INITIALIZED && lifecycle$State == Lifecycle$State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle$State.CREATED + "' to be moved to '" + lifecycle$State + "' in component " + interfaceC3221).toString());
        }
        Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
        if (lifecycle$State2 == lifecycle$State3 && lifecycle$State2 != lifecycle$State) {
            throw new IllegalStateException(("State is '" + lifecycle$State3 + "' and cannot be moved to `" + lifecycle$State + "` in component " + interfaceC3221).toString());
        }
        this.f7364 = lifecycle$State;
        if (this.f7361 || this.f7362 != 0) {
            this.f7368 = true;
            return;
        }
        this.f7361 = true;
        m5064();
        this.f7361 = false;
        if (this.f7364 == lifecycle$State3) {
            this.f7365 = new C8596();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5059(Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        m5060("handleLifecycleEvent");
        m5058(lifecycle$Event.getTargetState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5060(String str) {
        if (this.f7366) {
            C8634.m13728().f21620.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C6755.m11871(AbstractC0900.m718("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Lifecycle$State m5061(InterfaceC3222 interfaceC3222) {
        HashMap map = this.f7365.f21410;
        C8594 c8594 = map.containsKey(interfaceC3222) ? ((C8594) map.get(interfaceC3222)).f21403 : null;
        Lifecycle$State lifecycle$State = c8594 != null ? ((C3220) c8594.f21404).f7371 : null;
        ArrayList arrayList = this.f7367;
        Lifecycle$State lifecycle$State2 = arrayList.isEmpty() ? null : (Lifecycle$State) AbstractC7012.m12145(1, arrayList);
        Lifecycle$State lifecycle$State3 = this.f7364;
        lifecycle$State3.getClass();
        if (lifecycle$State == null || lifecycle$State.compareTo(lifecycle$State3) >= 0) {
            lifecycle$State = lifecycle$State3;
        }
        return (lifecycle$State2 == null || lifecycle$State2.compareTo(lifecycle$State) >= 0) ? lifecycle$State : lifecycle$State2;
    }

    @Override // androidx.lifecycle.AbstractC3235
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5062(InterfaceC3222 interfaceC3222) {
        interfaceC3222.getClass();
        m5060("removeObserver");
        this.f7365.mo13674(interfaceC3222);
    }

    @Override // androidx.lifecycle.AbstractC3235
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5063(InterfaceC3222 interfaceC3222) {
        InterfaceC3213 c0867;
        InterfaceC3221 interfaceC3221;
        interfaceC3222.getClass();
        m5060("addObserver");
        Lifecycle$State lifecycle$State = this.f7364;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
        if (lifecycle$State != lifecycle$State2) {
            lifecycle$State2 = Lifecycle$State.INITIALIZED;
        }
        lifecycle$State2.getClass();
        C3220 c3220 = new C3220();
        HashMap map = AbstractC3218.f7360;
        boolean z = interfaceC3222 instanceof InterfaceC3213;
        boolean z2 = interfaceC3222 instanceof InterfaceC3242;
        Object obj = null;
        if (z && z2) {
            c0867 = new C0867((InterfaceC3242) interfaceC3222, (InterfaceC3213) interfaceC3222);
        } else if (z2) {
            c0867 = new C0867((InterfaceC3242) interfaceC3222, (InterfaceC3213) null);
        } else if (z) {
            c0867 = (InterfaceC3213) interfaceC3222;
        } else {
            Class<?> cls = interfaceC3222.getClass();
            if (AbstractC3218.m5056(cls) == 2) {
                Object obj2 = AbstractC3218.f7359.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC3218.m5057((Constructor) list.get(0), interfaceC3222);
                    throw null;
                }
                int size = list.size();
                InterfaceC3241[] interfaceC3241Arr = new InterfaceC3241[size];
                if (size > 0) {
                    AbstractC3218.m5057((Constructor) list.get(0), interfaceC3222);
                    throw null;
                }
                c0867 = new C3224(interfaceC3241Arr, i);
            } else {
                c0867 = new C0867(interfaceC3222);
            }
        }
        c3220.f7370 = c0867;
        c3220.f7371 = lifecycle$State2;
        C8596 c8596 = this.f7365;
        C8594 c8594Mo13675 = c8596.mo13675(interfaceC3222);
        if (c8594Mo13675 != null) {
            obj = c8594Mo13675.f21404;
        } else {
            HashMap map2 = c8596.f21410;
            C8594 c8594 = new C8594(interfaceC3222, c3220);
            c8596.f21396++;
            C8594 c85942 = c8596.f21397;
            if (c85942 == null) {
                c8596.f21399 = c8594;
                c8596.f21397 = c8594;
            } else {
                c85942.f21405 = c8594;
                c8594.f21403 = c85942;
                c8596.f21397 = c8594;
            }
            map2.put(interfaceC3222, c8594);
        }
        if (((C3220) obj) == null && (interfaceC3221 = (InterfaceC3221) this.f7363.get()) != null) {
            i = (this.f7362 != 0 || this.f7361) ? 1 : 0;
            Lifecycle$State lifecycle$StateM5061 = m5061(interfaceC3222);
            this.f7362++;
            while (c3220.f7371.compareTo(lifecycle$StateM5061) < 0 && this.f7365.f21410.containsKey(interfaceC3222)) {
                Lifecycle$State lifecycle$State3 = c3220.f7371;
                ArrayList arrayList = this.f7367;
                arrayList.add(lifecycle$State3);
                C3230 c3230 = Lifecycle$Event.Companion;
                Lifecycle$State lifecycle$State4 = c3220.f7371;
                c3230.getClass();
                Lifecycle$Event lifecycle$EventM5071 = C3230.m5071(lifecycle$State4);
                if (lifecycle$EventM5071 == null) {
                    C5043.m9164(c3220.f7371, "no event up from ");
                    return;
                } else {
                    c3220.m5066(interfaceC3221, lifecycle$EventM5071);
                    arrayList.remove(arrayList.size() - 1);
                    lifecycle$StateM5061 = m5061(interfaceC3222);
                }
            }
            if (i == 0) {
                m5064();
            }
            this.f7362--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f7368 = false;
        r8.f7369.m10872(r8.f7364);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5064() {
        InterfaceC3221 interfaceC3221 = (InterfaceC3221) this.f7363.get();
        if (interfaceC3221 == null) {
            C6755.m11870("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C8596 c8596 = this.f7365;
            if (c8596.f21396 != 0) {
                C8594 c8594 = c8596.f21399;
                c8594.getClass();
                Lifecycle$State lifecycle$State = ((C3220) c8594.f21404).f7371;
                C8594 c85942 = this.f7365.f21397;
                c85942.getClass();
                Lifecycle$State lifecycle$State2 = ((C3220) c85942.f21404).f7371;
                if (lifecycle$State == lifecycle$State2 && this.f7364 == lifecycle$State2) {
                    break;
                }
                this.f7368 = false;
                Lifecycle$State lifecycle$State3 = this.f7364;
                C8594 c85943 = this.f7365.f21399;
                c85943.getClass();
                int iCompareTo = lifecycle$State3.compareTo(((C3220) c85943.f21404).f7371);
                ArrayList arrayList = this.f7367;
                if (iCompareTo < 0) {
                    C8596 c85962 = this.f7365;
                    C8595 c8595 = new C8595(c85962.f21397, c85962.f21399, 1);
                    c85962.f21398.put(c8595, Boolean.FALSE);
                    while (c8595.hasNext() && !this.f7368) {
                        Map.Entry entry = (Map.Entry) c8595.next();
                        entry.getClass();
                        InterfaceC3222 interfaceC3222 = (InterfaceC3222) entry.getKey();
                        C3220 c3220 = (C3220) entry.getValue();
                        while (c3220.f7371.compareTo(this.f7364) > 0 && !this.f7368 && this.f7365.f21410.containsKey(interfaceC3222)) {
                            C3230 c3230 = Lifecycle$Event.Companion;
                            Lifecycle$State lifecycle$State4 = c3220.f7371;
                            c3230.getClass();
                            Lifecycle$Event lifecycle$EventM5072 = C3230.m5072(lifecycle$State4);
                            if (lifecycle$EventM5072 == null) {
                                C5043.m9164(c3220.f7371, "no event down from ");
                                return;
                            } else {
                                arrayList.add(lifecycle$EventM5072.getTargetState());
                                c3220.m5066(interfaceC3221, lifecycle$EventM5072);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                C8594 c85944 = this.f7365.f21397;
                if (!this.f7368 && c85944 != null && this.f7364.compareTo(((C3220) c85944.f21404).f7371) > 0) {
                    C8596 c85963 = this.f7365;
                    c85963.getClass();
                    C8593 c8593 = new C8593(c85963);
                    c85963.f21398.put(c8593, Boolean.FALSE);
                    while (c8593.hasNext() && !this.f7368) {
                        Map.Entry entry2 = (Map.Entry) c8593.next();
                        InterfaceC3222 interfaceC32222 = (InterfaceC3222) entry2.getKey();
                        C3220 c32202 = (C3220) entry2.getValue();
                        while (c32202.f7371.compareTo(this.f7364) < 0 && !this.f7368 && this.f7365.f21410.containsKey(interfaceC32222)) {
                            arrayList.add(c32202.f7371);
                            C3230 c32302 = Lifecycle$Event.Companion;
                            Lifecycle$State lifecycle$State5 = c32202.f7371;
                            c32302.getClass();
                            Lifecycle$Event lifecycle$EventM5071 = C3230.m5071(lifecycle$State5);
                            if (lifecycle$EventM5071 == null) {
                                C5043.m9164(c32202.f7371, "no event up from ");
                                return;
                            } else {
                                c32202.m5066(interfaceC3221, lifecycle$EventM5071);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5065(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        m5060("setCurrentState");
        m5058(lifecycle$State);
    }
}
