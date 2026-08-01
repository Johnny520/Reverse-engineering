package androidx.compose.runtime;

import android.util.Log;
import androidx.activity.compose.C0849;
import androidx.activity.compose.C0851;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0955;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.runtime.collection.C2057;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.collection.C2060;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2106;
import androidx.compose.runtime.snapshots.C2120;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p138.C8224;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2218 extends AbstractC2207 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2188 f4336;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5192 f4337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f4338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Throwable f4339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6284 f4340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f4341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2175 f4342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2189 f4343;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6099 f4344;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4345;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0955 f4346;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6283 f4347;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4348;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6099 f4349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1083 f4350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0923 f4351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1082 f4352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6276 f4353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1083 f4354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ArrayList f4355;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1082 f4356;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f4357;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f4358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1083 f4359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2059 f4360;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f4361;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C6099 f4335 = AbstractC6154.m10891(C8224.f20392);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicReference f4334 = new AtomicReference(Boolean.FALSE);

    public C2218(InterfaceC5192 interfaceC5192) {
        C2189 c2189 = new C2189(new C2221(this, 0));
        this.f4343 = c2189;
        this.f4342 = new C2175(new C2221(this, 1));
        this.f4341 = new Object();
        this.f4338 = new ArrayList();
        this.f4356 = new C1082();
        this.f4360 = new C2059(0, new C2198[16]);
        this.f4361 = new ArrayList();
        this.f4358 = new ArrayList();
        this.f4359 = new C1083();
        this.f4351 = new C0923(3);
        this.f4350 = new C1083();
        this.f4354 = new C1083();
        this.f4344 = AbstractC6154.m10891(null);
        this.f4349 = AbstractC6154.m10891(Recomposer$State.Inactive);
        this.f4346 = new C0955(5);
        C6283 c6283 = new C6283((InterfaceC6284) interfaceC5192.get(C6285.f15450));
        c6283.mo11118(new C2220(this, 1));
        this.f4347 = c6283;
        this.f4337 = interfaceC5192.plus(c2189).plus(c6283);
        this.f4336 = new C2188(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m3069(ArrayList arrayList, C2218 c2218, C2198 c2198) {
        arrayList.clear();
        synchronized (c2218.f4341) {
            Iterator it = c2218.f4358.iterator();
            if (it.hasNext()) {
                ((AbstractC2140) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m3070(C2106 c2106) {
        try {
            if (c2106.mo2780() instanceof C2120) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c2106.mo2765();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean m3071() {
        boolean zM3078;
        EmptyList emptyList = EmptyList.INSTANCE;
        synchronized (this.f4341) {
            if (this.f4356.m1433()) {
                return m3078();
            }
            List listM3085 = m3085();
            C2057 c2057 = new C2057(this.f4356);
            this.f4356 = new C1082();
            try {
                int size = listM3085.size();
                for (int i = 0; i < size; i++) {
                    ((C2198) listM3085.get(i)).m3013(c2057);
                    if (((Recomposer$State) this.f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4341) {
                    if (m3080() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM3078 = m3078();
                }
                return zM3078;
            } catch (Throwable th) {
                synchronized (this.f4341) {
                    C1082 c1082 = this.f4356;
                    c1082.getClass();
                    Iterator<E> it = c2057.iterator();
                    while (it.hasNext()) {
                        c1082.m1305(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m3072(Throwable th, C2198 c2198) throws Throwable {
        if (!((Boolean) f4334.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f4341) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C2217 c2217 = (C2217) this.f4344.getValue();
                if (c2217 != null) {
                    throw c2217.f4333;
                }
                C6099 c6099 = this.f4344;
                C2217 c22172 = new C2217(th);
                c6099.getClass();
                c6099.m10870(null, c22172);
            }
            throw th;
        }
        synchronized (this.f4341) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4361.clear();
                this.f4360.m2612();
                this.f4356 = new C1082();
                this.f4358.clear();
                this.f4359.m1314();
                this.f4350.m1314();
                C6099 c60992 = this.f4344;
                C2217 c22173 = new C2217(th);
                c60992.getClass();
                c60992.m10870(null, c22173);
                if (c2198 != null) {
                    m3074(c2198);
                }
                if (m3080() != null) {
                    AbstractC2209.m3067("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Object m3073(SuspendLambda suspendLambda) throws Throwable {
        Object objM11029 = AbstractC6231.m11029(this.f4343, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), AbstractC2202.m3052(suspendLambda.getContext()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (objM11029 != coroutineSingletons) {
            objM11029 = c6008;
        }
        return objM11029 == coroutineSingletons ? objM11029 : c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m3074(C2198 c2198) {
        ArrayList arrayList = this.f4355;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4355 = arrayList;
        }
        if (!arrayList.contains(c2198)) {
            arrayList.add(c2198);
        }
        if (this.f4338.remove(c2198)) {
            this.f4357 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m3075(SuspendLambda suspendLambda) {
        Object objM10898 = AbstractC6154.m10898(this.f4349, new Recomposer$join$2(null), suspendLambda);
        return objM10898 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10898 : C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3076() {
        boolean z;
        synchronized (this.f4341) {
            if (this.f4356.m1432() || this.f4360.f3865 != 0 || m3079()) {
                z = true;
            } else if (!m3077()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m3077() {
        return !this.f4348 && (((AtomicInt) ((C2080) this.f4342.f4246).f3963).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m3078() {
        return this.f4360.f3865 != 0 || m3079() || m3077() || this.f4359.m1321();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m3079() {
        return !this.f4348 && (((AtomicInt) this.f4343.f4271.f3963).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6279 m3080() throws DispatchException {
        Recomposer$State recomposer$State;
        C6099 c6099 = this.f4349;
        int iCompareTo = ((Recomposer$State) c6099.getValue()).compareTo(Recomposer$State.ShuttingDown);
        C6099 c60992 = this.f4344;
        ArrayList arrayList = this.f4358;
        ArrayList arrayList2 = this.f4361;
        C2059 c2059 = this.f4360;
        if (iCompareTo > 0) {
            if (c60992.getValue() != null) {
                recomposer$State = Recomposer$State.Inactive;
            } else if (this.f4340 == null) {
                this.f4356 = new C1082();
                c2059.m2612();
                recomposer$State = (m3079() || m3077()) ? Recomposer$State.InactivePendingWork : Recomposer$State.Inactive;
            } else {
                recomposer$State = (c2059.f3865 != 0 || this.f4356.m1432() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m3079() || m3077() || this.f4359.m1321()) ? Recomposer$State.PendingWork : Recomposer$State.Idle;
            }
            c6099.m10872(recomposer$State);
            if (recomposer$State != Recomposer$State.PendingWork) {
                return null;
            }
            C6276 c6276 = this.f4353;
            this.f4353 = null;
            return c6276;
        }
        List listM3085 = m3085();
        int size = listM3085.size();
        for (int i = 0; i < size; i++) {
        }
        this.f4338.clear();
        this.f4357 = EmptyList.INSTANCE;
        this.f4356 = new C1082();
        c2059.m2612();
        arrayList2.clear();
        arrayList.clear();
        this.f4355 = null;
        C6276 c62762 = this.f4353;
        if (c62762 != null) {
            c62762.mo10994(null);
        }
        this.f4353 = null;
        c60992.m10872(null);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2198 m3081(C2198 c2198, C1082 c1082) {
        C2106 c2106Mo2775;
        if (c2198.f4290.f4200 || c2198.f4289 == 3) {
            return null;
        }
        C1082 c10822 = this.f4352;
        if (c10822 == null || !c10822.m1434(c2198)) {
            C2220 c2220 = new C2220(c2198, 0);
            C0849 c0849 = new C0849(c2198, 17, c1082);
            AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
            C2106 c2106 = abstractC2121M2840 instanceof C2106 ? (C2106) abstractC2121M2840 : null;
            if (c2106 == null || (c2106Mo2775 = c2106.mo2775(c2220, c0849)) == null) {
                C6755.m11870("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    AbstractC2121 abstractC2121M2847 = c2106Mo2775.m2847();
                    if (c1082 != null) {
                        try {
                            if (c1082.m1432()) {
                                C0851 c0851 = new C0851(c1082, 6, c2198);
                                C2159 c2159 = c2198.f4290;
                                if (c2159.f4200) {
                                    AbstractC2209.m3067("Preparing a composition while composing is not supported");
                                }
                                c2159.f4200 = true;
                                try {
                                    c0851.invoke();
                                    c2159.f4200 = false;
                                } catch (Throwable th) {
                                    c2159.f4200 = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC2121.m2844(abstractC2121M2847);
                            throw th2;
                        }
                    }
                    boolean zM3016 = c2198.m3016();
                    AbstractC2121.m2844(abstractC2121M2847);
                    if (zM3016) {
                        return c2198;
                    }
                } finally {
                    m3070(c2106Mo2775);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        if (((kotlin.Pair) r11.get(r4)).getSecond() == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015a, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
    
        r12 = (kotlin.Pair) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0174, code lost:
    
        if (r12.getSecond() != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        r12 = (androidx.compose.runtime.AbstractC2140) r12.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0182, code lost:
    
        r4 = r18.f4341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        kotlin.collections.AbstractC5176.m9363(r3, r18.f4358);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0199, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
    
        if (((kotlin.Pair) r12).getSecond() == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ae, code lost:
    
        r11 = r3;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m3082(List list, C1082 c1082) {
        C2106 c2106Mo2775;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ((AbstractC2140) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C2198 c2198 = (C2198) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c2198.f4290.f4200) {
                AbstractC2209.m3067("Check failed");
            }
            C2220 c2220 = new C2220(c2198, i);
            C0849 c0849 = new C0849(c2198, 17, c1082);
            AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
            C2106 c2106 = abstractC2121M2840 instanceof C2106 ? (C2106) abstractC2121M2840 : null;
            if (c2106 == null || (c2106Mo2775 = c2106.mo2775(c2220, c0849)) == null) {
                C6755.m11870("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                AbstractC2121 abstractC2121M2847 = c2106Mo2775.m2847();
                try {
                    synchronized (this.f4341) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i3 = i; i3 < size2; i3++) {
                                AbstractC2140 abstractC2140 = (AbstractC2140) list2.get(i3);
                                C1083 c1083 = this.f4359;
                                abstractC2140.getClass();
                                Object objM2617 = C2060.m2617(c1083);
                                arrayList.add(new Pair(abstractC2140, objM2617));
                            }
                            int size3 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i4);
                                if (pair.getSecond() == null) {
                                    C0923 c0923 = this.f4351;
                                    ((AbstractC2140) pair.getFirst()).getClass();
                                    if (((C1083) c0923.f572).m1313(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i5 = 0; i5 < size4; i5++) {
                                            Pair pair2 = (Pair) arrayList.get(i5);
                                            if (pair2.getSecond() == null) {
                                                C0923 c09232 = this.f4351;
                                                ((AbstractC2140) pair2.getFirst()).getClass();
                                                C1083 c10832 = (C1083) c09232.f572;
                                                if (c10832.m1320()) {
                                                    ((C1083) c09232.f573).m1314();
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i4++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i6)).getSecond() != null) {
                            break;
                        }
                        i6++;
                    }
                    c2198.m3019(arrayList);
                    AbstractC2121.m2844(abstractC2121M2847);
                    m3070(c2106Mo2775);
                    i = 0;
                } catch (Throwable th) {
                    AbstractC2121.m2844(abstractC2121M2847);
                    throw th;
                }
            } catch (Throwable th2) {
                m3070(c2106Mo2775);
                throw th2;
            }
        }
        return AbstractC5176.m9356(map.keySet());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m3083(C2198 c2198) {
        synchronized (this.f4341) {
            ArrayList arrayList = this.f4358;
            if (arrayList.size() > 0) {
                ((AbstractC2140) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m3084() {
        InterfaceC6279 interfaceC6279M3080;
        synchronized (this.f4341) {
            interfaceC6279M3080 = m3080();
            if (((Recomposer$State) this.f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw AbstractC6231.m11050("Recomposer shutdown; frame clock awaiter will never resume", this.f4339);
            }
        }
        if (interfaceC6279M3080 != null) {
            ((C6276) interfaceC6279M3080).resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m3085() {
        List list = this.f4357;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f4338;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.INSTANCE : new ArrayList(arrayList);
        this.f4357 = arrayList2;
        return arrayList2;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2872() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo2873() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo2874() {
        return ((Boolean) f4334.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1133 mo2876(C2198 c2198, InterfaceC2177 interfaceC2177, InterfaceC7383 interfaceC7383) {
        C0955 c0955 = this.f4346;
        try {
            InterfaceC2177 interfaceC21772 = c2198.f4302;
            c2198.f4302 = interfaceC2177;
            try {
                mo2877(c2198, interfaceC7383);
                C1082 c1082 = (C1082) c0955.m953();
                if (c1082 == null) {
                    c1082 = AbstractC1132.f1342;
                    c1082.getClass();
                }
                return c1082;
            } finally {
                c2198.f4302 = interfaceC21772;
            }
        } finally {
            c0955.m922(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2877(C2198 c2198, InterfaceC7383 interfaceC7383) throws Throwable {
        Recomposer$State recomposer$State;
        boolean zContains;
        C2106 c2106Mo2775;
        boolean z = c2198.f4290.f4200;
        synchronized (this.f4341) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.f4349.getValue();
            recomposer$State = Recomposer$State.ShuttingDown;
            zContains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ m3085().contains(c2198) : true;
        }
        try {
            C2220 c2220 = new C2220(c2198, 0);
            C0849 c0849 = new C0849(c2198, 17, null);
            AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
            C2106 c2106 = abstractC2121M2840 instanceof C2106 ? (C2106) abstractC2121M2840 : null;
            if (c2106 == null || (c2106Mo2775 = c2106.mo2775(c2220, c0849)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC2121 abstractC2121M2847 = c2106Mo2775.m2847();
                try {
                    c2198.m3028(interfaceC7383);
                    synchronized (this.f4341) {
                        if (((Recomposer$State) this.f4349.getValue()).compareTo(recomposer$State) > 0 && !m3085().contains(c2198)) {
                            this.f4338.add(c2198);
                            this.f4357 = null;
                        }
                    }
                    if (!z) {
                        AbstractC2115.m2840().mo2769();
                    }
                    try {
                        m3083(c2198);
                        try {
                            c2198.m3007();
                            c2198.m3005();
                            if (z) {
                                return;
                            }
                            AbstractC2115.m2840().mo2769();
                        } catch (Throwable th) {
                            m3072(th, null);
                        }
                    } catch (Throwable th2) {
                        m3072(th2, c2198);
                    }
                } finally {
                    AbstractC2121.m2844(abstractC2121M2847);
                }
            } finally {
                m3070(c2106Mo2775);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f4341) {
                }
            }
            m3072(th3, c2198);
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final InterfaceC2187 mo2879(InterfaceC7372 interfaceC7372) {
        C2175 c2175 = this.f4342;
        C2080 c2080 = (C2080) c2175.f4246;
        C2215 c2215 = new C2215();
        c2215.f4330 = interfaceC7372;
        return c2080.m2712(c2215, (C0851) c2175.f4247);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m3086() {
        synchronized (this.f4341) {
            if (((Recomposer$State) this.f4349.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                this.f4349.m10872(Recomposer$State.ShuttingDown);
            }
        }
        this.f4347.mo10815(null);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2882(C2198 c2198) {
        synchronized (this.f4341) {
            if (this.f4338.remove(c2198)) {
                this.f4357 = null;
            }
            this.f4360.m2615(c2198);
            this.f4361.remove(c2198);
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC1133 mo2883(C2198 c2198, InterfaceC2177 interfaceC2177, AbstractC1133 abstractC1133) {
        C0955 c0955 = this.f4346;
        try {
            m3071();
            c2198.m3013(new C2057(abstractC1133));
            InterfaceC2177 interfaceC21772 = c2198.f4302;
            c2198.f4302 = interfaceC2177;
            try {
                C2198 c2198M3081 = m3081(c2198, null);
                if (c2198M3081 != null) {
                    m3083(c2198);
                    c2198M3081.m3007();
                    c2198M3081.m3005();
                }
                C1082 c1082 = (C1082) c0955.m953();
                if (c1082 == null) {
                    c1082 = AbstractC1132.f1342;
                    c1082.getClass();
                }
                return c1082;
            } finally {
                c2198.f4302 = interfaceC21772;
            }
        } finally {
            c0955.m922(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2141 mo2884(AbstractC2140 abstractC2140) {
        AbstractC2141 abstractC2141;
        synchronized (this.f4341) {
            abstractC2141 = (AbstractC2141) this.f4350.m1318(abstractC2140);
        }
        return abstractC2141;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2885(C2224 c2224) {
        C0955 c0955 = this.f4346;
        C1082 c1082 = (C1082) c0955.m953();
        if (c1082 == null) {
            C1082 c10822 = AbstractC1132.f1342;
            c1082 = new C1082();
            c0955.m922(c1082);
        }
        c1082.m1301(c2224);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo2886(C2198 c2198) {
        synchronized (this.f4341) {
            try {
                C1082 c1082 = this.f4352;
                if (c1082 == null) {
                    C1082 c10822 = AbstractC1132.f1342;
                    c1082 = new C1082();
                    this.f4352 = c1082;
                }
                c1082.m1301(c2198);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC2206 mo2889() {
        return null;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2890() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo2891() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2892(C2198 c2198) {
        InterfaceC6279 interfaceC6279M3080;
        synchronized (this.f4341) {
            if (this.f4360.m2611(c2198)) {
                interfaceC6279M3080 = null;
            } else {
                this.f4360.m2607(c2198);
                interfaceC6279M3080 = m3080();
            }
        }
        if (interfaceC6279M3080 != null) {
            ((C6276) interfaceC6279M3080).resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC5192 mo2894() {
        return this.f4337;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo2887(Set set) {
    }
}
