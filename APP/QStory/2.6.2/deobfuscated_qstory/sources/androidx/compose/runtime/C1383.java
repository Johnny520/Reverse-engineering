package androidx.compose.runtime;

import android.util.Log;
import androidx.activity.compose.C0002;
import androidx.activity.compose.C0004;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0108;
import androidx.collection.AbstractC0285;
import androidx.collection.AbstractC0286;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.runtime.collection.C1222;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1271;
import androidx.compose.runtime.snapshots.C1285;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C5175;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5266;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p122.C7394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383 extends AbstractC1372 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1353 f3990;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC4359 f3991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f3992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Throwable f3993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5451 f3994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1340 f3996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1354 f3997;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5266 f3998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f3999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0108 f4000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5450 f4001;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5266 f4003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0236 f4004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0076 f4005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0235 f4006;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5443 f4007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0236 f4008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ArrayList f4009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0235 f4010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f4011;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f4012;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0236 f4013;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1224 f4014;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f4015;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5266 f3989 = AbstractC5321.m10328(C7394.f20052);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicReference f3988 = new AtomicReference(Boolean.FALSE);

    public C1383(InterfaceC4359 interfaceC4359) {
        C1354 c1354 = new C1354(new C1386(this, 0));
        this.f3997 = c1354;
        this.f3996 = new C1340(new C1386(this, 1));
        this.f3995 = new Object();
        this.f3992 = new ArrayList();
        this.f4010 = new C0235();
        this.f4014 = new C1224(0, new C1363[16]);
        this.f4015 = new ArrayList();
        this.f4012 = new ArrayList();
        this.f4013 = new C0236();
        this.f4005 = new C0076(3);
        this.f4004 = new C0236();
        this.f4008 = new C0236();
        this.f3998 = AbstractC5321.m10328(null);
        this.f4003 = AbstractC5321.m10328(Recomposer$State.Inactive);
        this.f4000 = new C0108(5);
        C5450 c5450 = new C5450((InterfaceC5451) interfaceC4359.get(C5452.f15105));
        c5450.mo10554(new C1385(this, 1));
        this.f4001 = c5450;
        this.f3991 = interfaceC4359.plus(c1354).plus(c5450);
        this.f3990 = new C1353(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m2499(ArrayList arrayList, C1383 c1383, C1363 c1363) {
        arrayList.clear();
        synchronized (c1383.f3995) {
            Iterator it = c1383.f4012.iterator();
            if (it.hasNext()) {
                ((AbstractC1305) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m2500(C1271 c1271) {
        try {
            if (c1271.mo2210() instanceof C1285) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c1271.mo2195();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean m2501() {
        boolean zM2508;
        EmptyList emptyList = EmptyList.INSTANCE;
        synchronized (this.f3995) {
            if (this.f4010.m872()) {
                return m2508();
            }
            List listM2515 = m2515();
            C1222 c1222 = new C1222(this.f4010);
            this.f4010 = new C0235();
            try {
                int size = listM2515.size();
                for (int i = 0; i < size; i++) {
                    ((C1363) listM2515.get(i)).m2443(c1222);
                    if (((Recomposer$State) this.f4003.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f3995) {
                    if (m2510() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM2508 = m2508();
                }
                return zM2508;
            } catch (Throwable th) {
                synchronized (this.f3995) {
                    C0235 c0235 = this.f4010;
                    c0235.getClass();
                    Iterator<E> it = c1222.iterator();
                    while (it.hasNext()) {
                        c0235.m744(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m2502(Throwable th, C1363 c1363) throws Throwable {
        if (!((Boolean) f3988.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f3995) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C1382 c1382 = (C1382) this.f3998.getValue();
                if (c1382 != null) {
                    throw c1382.f3987;
                }
                C5266 c5266 = this.f3998;
                C1382 c13822 = new C1382(th);
                c5266.getClass();
                c5266.m10307(null, c13822);
            }
            throw th;
        }
        synchronized (this.f3995) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4015.clear();
                this.f4014.m2042();
                this.f4010 = new C0235();
                this.f4012.clear();
                this.f4013.m753();
                this.f4004.m753();
                C5266 c52662 = this.f3998;
                C1382 c13823 = new C1382(th);
                c52662.getClass();
                c52662.m10307(null, c13823);
                if (c1363 != null) {
                    m2504(c1363);
                }
                if (m2510() != null) {
                    AbstractC1374.m2497("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Object m2503(SuspendLambda suspendLambda) throws Throwable {
        Object objM10466 = AbstractC5398.m10466(this.f3997, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), AbstractC1367.m2482(suspendLambda.getContext()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5175 c5175 = C5175.f14739;
        if (objM10466 != coroutineSingletons) {
            objM10466 = c5175;
        }
        return objM10466 == coroutineSingletons ? objM10466 : c5175;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2504(C1363 c1363) {
        ArrayList arrayList = this.f4009;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4009 = arrayList;
        }
        if (!arrayList.contains(c1363)) {
            arrayList.add(c1363);
        }
        if (this.f3992.remove(c1363)) {
            this.f4011 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2505(SuspendLambda suspendLambda) {
        Object objM10335 = AbstractC5321.m10335(this.f4003, new Recomposer$join$2(null), suspendLambda);
        return objM10335 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10335 : C5175.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2506() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3995
            monitor-enter(r0)
            androidx.collection.飘花落叶言子世兰楪哲苏 r1 = r2.f4010     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.m871()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = r2.f4014     // Catch: java.lang.Throwable -> L21
            int r1 = r1.f3519     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.m2509()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.m2507()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r2 = 0
            goto L24
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
        L24:
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1383.m2506():boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m2507() {
        return !this.f4002 && (((AtomicInt) ((C1245) this.f3996.f3900).f3617).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m2508() {
        return this.f4014.f3519 != 0 || m2509() || m2507() || this.f4013.m760();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m2509() {
        return !this.f4002 && (((AtomicInt) this.f3997.f3925.f3617).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5446 m2510() throws DispatchException {
        Recomposer$State recomposer$State;
        C5266 c5266 = this.f4003;
        int iCompareTo = ((Recomposer$State) c5266.getValue()).compareTo(Recomposer$State.ShuttingDown);
        C5266 c52662 = this.f3998;
        ArrayList arrayList = this.f4012;
        ArrayList arrayList2 = this.f4015;
        C1224 c1224 = this.f4014;
        if (iCompareTo > 0) {
            if (c52662.getValue() != null) {
                recomposer$State = Recomposer$State.Inactive;
            } else if (this.f3994 == null) {
                this.f4010 = new C0235();
                c1224.m2042();
                recomposer$State = (m2509() || m2507()) ? Recomposer$State.InactivePendingWork : Recomposer$State.Inactive;
            } else {
                recomposer$State = (c1224.f3519 != 0 || this.f4010.m871() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m2509() || m2507() || this.f4013.m760()) ? Recomposer$State.PendingWork : Recomposer$State.Idle;
            }
            c5266.m10309(recomposer$State);
            if (recomposer$State != Recomposer$State.PendingWork) {
                return null;
            }
            C5443 c5443 = this.f4007;
            this.f4007 = null;
            return c5443;
        }
        List listM2515 = m2515();
        int size = listM2515.size();
        for (int i = 0; i < size; i++) {
        }
        this.f3992.clear();
        this.f4011 = EmptyList.INSTANCE;
        this.f4010 = new C0235();
        c1224.m2042();
        arrayList2.clear();
        arrayList.clear();
        this.f4009 = null;
        C5443 c54432 = this.f4007;
        if (c54432 != null) {
            c54432.mo10431(null);
        }
        this.f4007 = null;
        c52662.m10309(null);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1363 m2511(C1363 c1363, C0235 c0235) {
        C1271 c1271Mo2205;
        if (c1363.f3944.f3854 || c1363.f3943 == 3) {
            return null;
        }
        C0235 c02352 = this.f4006;
        if (c02352 == null || !c02352.m873(c1363)) {
            C1385 c1385 = new C1385(c1363, 0);
            C0002 c0002 = new C0002(c1363, 17, c0235);
            AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
            C1271 c1271 = abstractC1286M2270 instanceof C1271 ? (C1271) abstractC1286M2270 : null;
            if (c1271 == null || (c1271Mo2205 = c1271.mo2205(c1385, c0002)) == null) {
                C5919.m11250("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    AbstractC1286 abstractC1286M2277 = c1271Mo2205.m2277();
                    if (c0235 != null) {
                        try {
                            if (c0235.m871()) {
                                C0004 c0004 = new C0004(c0235, 6, c1363);
                                C1324 c1324 = c1363.f3944;
                                if (c1324.f3854) {
                                    AbstractC1374.m2497("Preparing a composition while composing is not supported");
                                }
                                c1324.f3854 = true;
                                try {
                                    c0004.invoke();
                                    c1324.f3854 = false;
                                } catch (Throwable th) {
                                    c1324.f3854 = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC1286.m2274(abstractC1286M2277);
                            throw th2;
                        }
                    }
                    boolean zM2446 = c1363.m2446();
                    AbstractC1286.m2274(abstractC1286M2277);
                    if (zM2446) {
                        return c1363;
                    }
                } finally {
                    m2500(c1271Mo2205);
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
    
        r12 = (androidx.compose.runtime.AbstractC1305) r12.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0182, code lost:
    
        r4 = r18.f3995;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        kotlin.collections.AbstractC4343.m8794(r3, r18.f4012);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m2512(java.util.List r19, androidx.collection.C0235 r20) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1383.m2512(java.util.List, androidx.collection.飘花落叶言子世兰楪哲苏):java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m2513(C1363 c1363) {
        synchronized (this.f3995) {
            ArrayList arrayList = this.f4012;
            if (arrayList.size() > 0) {
                ((AbstractC1305) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m2514() {
        InterfaceC5446 interfaceC5446M2510;
        synchronized (this.f3995) {
            interfaceC5446M2510 = m2510();
            if (((Recomposer$State) this.f4003.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw AbstractC5398.m10487("Recomposer shutdown; frame clock awaiter will never resume", this.f3993);
            }
        }
        if (interfaceC5446M2510 != null) {
            ((C5443) interfaceC5446M2510).resumeWith(Result.m8755constructorimpl(C5175.f14739));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m2515() {
        List list = this.f4011;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f3992;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.INSTANCE : new ArrayList(arrayList);
        this.f4011 = arrayList2;
        return arrayList2;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2302() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo2303() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo2304() {
        return ((Boolean) f3988.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC0286 mo2306(C1363 c1363, InterfaceC1342 interfaceC1342, InterfaceC6553 interfaceC6553) {
        C0108 c0108 = this.f4000;
        try {
            InterfaceC1342 interfaceC13422 = c1363.f3956;
            c1363.f3956 = interfaceC1342;
            try {
                mo2307(c1363, interfaceC6553);
                C0235 c0235 = (C0235) c0108.m391();
                if (c0235 == null) {
                    c0235 = AbstractC0285.f997;
                    c0235.getClass();
                }
                return c0235;
            } finally {
                c1363.f3956 = interfaceC13422;
            }
        } finally {
            c0108.m361(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2307(C1363 c1363, InterfaceC6553 interfaceC6553) throws Throwable {
        Recomposer$State recomposer$State;
        boolean zContains;
        C1271 c1271Mo2205;
        boolean z = c1363.f3944.f3854;
        synchronized (this.f3995) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.f4003.getValue();
            recomposer$State = Recomposer$State.ShuttingDown;
            zContains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ m2515().contains(c1363) : true;
        }
        try {
            C1385 c1385 = new C1385(c1363, 0);
            C0002 c0002 = new C0002(c1363, 17, null);
            AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
            C1271 c1271 = abstractC1286M2270 instanceof C1271 ? (C1271) abstractC1286M2270 : null;
            if (c1271 == null || (c1271Mo2205 = c1271.mo2205(c1385, c0002)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1286 abstractC1286M2277 = c1271Mo2205.m2277();
                try {
                    c1363.m2458(interfaceC6553);
                    synchronized (this.f3995) {
                        if (((Recomposer$State) this.f4003.getValue()).compareTo(recomposer$State) > 0 && !m2515().contains(c1363)) {
                            this.f3992.add(c1363);
                            this.f4011 = null;
                        }
                    }
                    if (!z) {
                        AbstractC1280.m2270().mo2199();
                    }
                    try {
                        m2513(c1363);
                        try {
                            c1363.m2437();
                            c1363.m2435();
                            if (z) {
                                return;
                            }
                            AbstractC1280.m2270().mo2199();
                        } catch (Throwable th) {
                            m2502(th, null);
                        }
                    } catch (Throwable th2) {
                        m2502(th2, c1363);
                    }
                } finally {
                    AbstractC1286.m2274(abstractC1286M2277);
                }
            } finally {
                m2500(c1271Mo2205);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f3995) {
                }
            }
            m2502(th3, c1363);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final InterfaceC1352 mo2309(InterfaceC6542 interfaceC6542) {
        C1340 c1340 = this.f3996;
        C1245 c1245 = (C1245) c1340.f3900;
        C1380 c1380 = new C1380();
        c1380.f3984 = interfaceC6542;
        return c1245.m2142(c1380, (C0004) c1340.f3901);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2516() {
        synchronized (this.f3995) {
            if (((Recomposer$State) this.f4003.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                this.f4003.m10309(Recomposer$State.ShuttingDown);
            }
        }
        this.f4001.mo10252(null);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2312(C1363 c1363) {
        synchronized (this.f3995) {
            if (this.f3992.remove(c1363)) {
                this.f4011 = null;
            }
            this.f4014.m2045(c1363);
            this.f4015.remove(c1363);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC0286 mo2313(C1363 c1363, InterfaceC1342 interfaceC1342, AbstractC0286 abstractC0286) {
        C0108 c0108 = this.f4000;
        try {
            m2501();
            c1363.m2443(new C1222(abstractC0286));
            InterfaceC1342 interfaceC13422 = c1363.f3956;
            c1363.f3956 = interfaceC1342;
            try {
                C1363 c1363M2511 = m2511(c1363, null);
                if (c1363M2511 != null) {
                    m2513(c1363);
                    c1363M2511.m2437();
                    c1363M2511.m2435();
                }
                C0235 c0235 = (C0235) c0108.m391();
                if (c0235 == null) {
                    c0235 = AbstractC0285.f997;
                    c0235.getClass();
                }
                return c0235;
            } finally {
                c1363.f3956 = interfaceC13422;
            }
        } finally {
            c0108.m361(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC1306 mo2314(AbstractC1305 abstractC1305) {
        AbstractC1306 abstractC1306;
        synchronized (this.f3995) {
            abstractC1306 = (AbstractC1306) this.f4004.m757(abstractC1305);
        }
        return abstractC1306;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2315(C1389 c1389) {
        C0108 c0108 = this.f4000;
        C0235 c0235 = (C0235) c0108.m391();
        if (c0235 == null) {
            C0235 c02352 = AbstractC0285.f997;
            c0235 = new C0235();
            c0108.m361(c0235);
        }
        c0235.m740(c1389);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo2316(C1363 c1363) {
        synchronized (this.f3995) {
            try {
                C0235 c0235 = this.f4006;
                if (c0235 == null) {
                    C0235 c02352 = AbstractC0285.f997;
                    c0235 = new C0235();
                    this.f4006 = c0235;
                }
                c0235.m740(c1363);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1371 mo2319() {
        return null;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2320() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo2321() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2322(C1363 c1363) {
        InterfaceC5446 interfaceC5446M2510;
        synchronized (this.f3995) {
            if (this.f4014.m2041(c1363)) {
                interfaceC5446M2510 = null;
            } else {
                this.f4014.m2037(c1363);
                interfaceC5446M2510 = m2510();
            }
        }
        if (interfaceC5446M2510 != null) {
            ((C5443) interfaceC5446M2510).resumeWith(Result.m8755constructorimpl(C5175.f14739));
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC4359 mo2324() {
        return this.f3991;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo2317(Set set) {
    }
}
