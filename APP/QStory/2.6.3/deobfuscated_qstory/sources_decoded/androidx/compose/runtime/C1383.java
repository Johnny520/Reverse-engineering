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
import kotlin.C5176;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5267;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p122.C7395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383 extends AbstractC1372 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1353 f3991;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC4360 f3992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f3993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Throwable f3994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5452 f3995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1340 f3997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1354 f3998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5267 f3999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0108 f4001;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5451 f4002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4003;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5267 f4004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0236 f4005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0076 f4006;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0235 f4007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5444 f4008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0236 f4009;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ArrayList f4010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0235 f4011;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f4012;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f4013;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0236 f4014;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1224 f4015;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f4016;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5267 f3990 = AbstractC5322.m10332(C7395.f20047);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicReference f3989 = new AtomicReference(Boolean.FALSE);

    public C1383(InterfaceC4360 interfaceC4360) {
        C1354 c1354 = new C1354(new C1386(this, 0));
        this.f3998 = c1354;
        this.f3997 = new C1340(new C1386(this, 1));
        this.f3996 = new Object();
        this.f3993 = new ArrayList();
        this.f4011 = new C0235();
        this.f4015 = new C1224(0, new C1363[16]);
        this.f4016 = new ArrayList();
        this.f4013 = new ArrayList();
        this.f4014 = new C0236();
        this.f4006 = new C0076(3);
        this.f4005 = new C0236();
        this.f4009 = new C0236();
        this.f3999 = AbstractC5322.m10332(null);
        this.f4004 = AbstractC5322.m10332(Recomposer$State.Inactive);
        this.f4001 = new C0108(5);
        C5451 c5451 = new C5451((InterfaceC5452) interfaceC4360.get(C5453.f15105));
        c5451.mo10559(new C1385(this, 1));
        this.f4002 = c5451;
        this.f3992 = interfaceC4360.plus(c1354).plus(c5451);
        this.f3991 = new C1353(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m2509(ArrayList arrayList, C1383 c1383, C1363 c1363) {
        arrayList.clear();
        synchronized (c1383.f3996) {
            Iterator it = c1383.f4013.iterator();
            if (it.hasNext()) {
                ((AbstractC1305) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m2510(C1271 c1271) {
        try {
            if (c1271.mo2220() instanceof C1285) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c1271.mo2205();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean m2511() {
        boolean zM2518;
        EmptyList emptyList = EmptyList.INSTANCE;
        synchronized (this.f3996) {
            if (this.f4011.m873()) {
                return m2518();
            }
            List listM2525 = m2525();
            C1222 c1222 = new C1222(this.f4011);
            this.f4011 = new C0235();
            try {
                int size = listM2525.size();
                for (int i = 0; i < size; i++) {
                    ((C1363) listM2525.get(i)).m2453(c1222);
                    if (((Recomposer$State) this.f4004.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f3996) {
                    if (m2520() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM2518 = m2518();
                }
                return zM2518;
            } catch (Throwable th) {
                synchronized (this.f3996) {
                    C0235 c0235 = this.f4011;
                    c0235.getClass();
                    Iterator<E> it = c1222.iterator();
                    while (it.hasNext()) {
                        c0235.m745(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m2512(Throwable th, C1363 c1363) throws Throwable {
        if (!((Boolean) f3989.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f3996) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C1382 c1382 = (C1382) this.f3999.getValue();
                if (c1382 != null) {
                    throw c1382.f3988;
                }
                C5267 c5267 = this.f3999;
                C1382 c13822 = new C1382(th);
                c5267.getClass();
                c5267.m10311(null, c13822);
            }
            throw th;
        }
        synchronized (this.f3996) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4016.clear();
                this.f4015.m2052();
                this.f4011 = new C0235();
                this.f4013.clear();
                this.f4014.m754();
                this.f4005.m754();
                C5267 c52672 = this.f3999;
                C1382 c13823 = new C1382(th);
                c52672.getClass();
                c52672.m10311(null, c13823);
                if (c1363 != null) {
                    m2514(c1363);
                }
                if (m2520() != null) {
                    AbstractC1374.m2507("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Object m2513(SuspendLambda suspendLambda) throws Throwable {
        Object objM10470 = AbstractC5399.m10470(this.f3998, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), AbstractC1367.m2492(suspendLambda.getContext()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5176 c5176 = C5176.f14739;
        if (objM10470 != coroutineSingletons) {
            objM10470 = c5176;
        }
        return objM10470 == coroutineSingletons ? objM10470 : c5176;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2514(C1363 c1363) {
        ArrayList arrayList = this.f4010;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4010 = arrayList;
        }
        if (!arrayList.contains(c1363)) {
            arrayList.add(c1363);
        }
        if (this.f3993.remove(c1363)) {
            this.f4012 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2515(SuspendLambda suspendLambda) {
        Object objM10339 = AbstractC5322.m10339(this.f4004, new Recomposer$join$2(null), suspendLambda);
        return objM10339 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10339 : C5176.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2516() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3996
            monitor-enter(r0)
            androidx.collection.飘花落叶言子世兰楪哲苏 r1 = r2.f4011     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.m872()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = r2.f4015     // Catch: java.lang.Throwable -> L21
            int r1 = r1.f3520     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.m2519()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.m2517()     // Catch: java.lang.Throwable -> L21
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1383.m2516():boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m2517() {
        return !this.f4003 && (((AtomicInt) ((C1245) this.f3997.f3901).f3618).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m2518() {
        return this.f4015.f3520 != 0 || m2519() || m2517() || this.f4014.m761();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m2519() {
        return !this.f4003 && (((AtomicInt) this.f3998.f3926.f3618).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5447 m2520() throws DispatchException {
        Recomposer$State recomposer$State;
        C5267 c5267 = this.f4004;
        int iCompareTo = ((Recomposer$State) c5267.getValue()).compareTo(Recomposer$State.ShuttingDown);
        C5267 c52672 = this.f3999;
        ArrayList arrayList = this.f4013;
        ArrayList arrayList2 = this.f4016;
        C1224 c1224 = this.f4015;
        if (iCompareTo > 0) {
            if (c52672.getValue() != null) {
                recomposer$State = Recomposer$State.Inactive;
            } else if (this.f3995 == null) {
                this.f4011 = new C0235();
                c1224.m2052();
                recomposer$State = (m2519() || m2517()) ? Recomposer$State.InactivePendingWork : Recomposer$State.Inactive;
            } else {
                recomposer$State = (c1224.f3520 != 0 || this.f4011.m872() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m2519() || m2517() || this.f4014.m761()) ? Recomposer$State.PendingWork : Recomposer$State.Idle;
            }
            c5267.m10313(recomposer$State);
            if (recomposer$State != Recomposer$State.PendingWork) {
                return null;
            }
            C5444 c5444 = this.f4008;
            this.f4008 = null;
            return c5444;
        }
        List listM2525 = m2525();
        int size = listM2525.size();
        for (int i = 0; i < size; i++) {
        }
        this.f3993.clear();
        this.f4012 = EmptyList.INSTANCE;
        this.f4011 = new C0235();
        c1224.m2052();
        arrayList2.clear();
        arrayList.clear();
        this.f4010 = null;
        C5444 c54442 = this.f4008;
        if (c54442 != null) {
            c54442.mo10435(null);
        }
        this.f4008 = null;
        c52672.m10313(null);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1363 m2521(C1363 c1363, C0235 c0235) {
        C1271 c1271Mo2215;
        if (c1363.f3945.f3855 || c1363.f3944 == 3) {
            return null;
        }
        C0235 c02352 = this.f4007;
        if (c02352 == null || !c02352.m874(c1363)) {
            C1385 c1385 = new C1385(c1363, 0);
            C0002 c0002 = new C0002(c1363, 17, c0235);
            AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
            C1271 c1271 = abstractC1286M2280 instanceof C1271 ? (C1271) abstractC1286M2280 : null;
            if (c1271 == null || (c1271Mo2215 = c1271.mo2215(c1385, c0002)) == null) {
                C5925.m11311("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    AbstractC1286 abstractC1286M2287 = c1271Mo2215.m2287();
                    if (c0235 != null) {
                        try {
                            if (c0235.m872()) {
                                C0004 c0004 = new C0004(c0235, 6, c1363);
                                C1324 c1324 = c1363.f3945;
                                if (c1324.f3855) {
                                    AbstractC1374.m2507("Preparing a composition while composing is not supported");
                                }
                                c1324.f3855 = true;
                                try {
                                    c0004.invoke();
                                    c1324.f3855 = false;
                                } catch (Throwable th) {
                                    c1324.f3855 = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC1286.m2284(abstractC1286M2287);
                            throw th2;
                        }
                    }
                    boolean zM2456 = c1363.m2456();
                    AbstractC1286.m2284(abstractC1286M2287);
                    if (zM2456) {
                        return c1363;
                    }
                } finally {
                    m2510(c1271Mo2215);
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
    
        r4 = r18.f3996;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        kotlin.collections.AbstractC4344.m8804(r3, r18.f4013);
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
    public final java.util.List m2522(java.util.List r19, androidx.collection.C0235 r20) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1383.m2522(java.util.List, androidx.collection.飘花落叶言子世兰楪哲苏):java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m2523(C1363 c1363) {
        synchronized (this.f3996) {
            ArrayList arrayList = this.f4013;
            if (arrayList.size() > 0) {
                ((AbstractC1305) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m2524() {
        InterfaceC5447 interfaceC5447M2520;
        synchronized (this.f3996) {
            interfaceC5447M2520 = m2520();
            if (((Recomposer$State) this.f4004.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw AbstractC5399.m10491("Recomposer shutdown; frame clock awaiter will never resume", this.f3994);
            }
        }
        if (interfaceC5447M2520 != null) {
            ((C5444) interfaceC5447M2520).resumeWith(Result.m8745constructorimpl(C5176.f14739));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m2525() {
        List list = this.f4012;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f3993;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.INSTANCE : new ArrayList(arrayList);
        this.f4012 = arrayList2;
        return arrayList2;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2312() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo2313() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo2314() {
        return ((Boolean) f3989.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC0286 mo2316(C1363 c1363, InterfaceC1342 interfaceC1342, InterfaceC6554 interfaceC6554) {
        C0108 c0108 = this.f4001;
        try {
            InterfaceC1342 interfaceC13422 = c1363.f3957;
            c1363.f3957 = interfaceC1342;
            try {
                mo2317(c1363, interfaceC6554);
                C0235 c0235 = (C0235) c0108.m393();
                if (c0235 == null) {
                    c0235 = AbstractC0285.f997;
                    c0235.getClass();
                }
                return c0235;
            } finally {
                c1363.f3957 = interfaceC13422;
            }
        } finally {
            c0108.m362(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2317(C1363 c1363, InterfaceC6554 interfaceC6554) throws Throwable {
        Recomposer$State recomposer$State;
        boolean zContains;
        C1271 c1271Mo2215;
        boolean z = c1363.f3945.f3855;
        synchronized (this.f3996) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.f4004.getValue();
            recomposer$State = Recomposer$State.ShuttingDown;
            zContains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ m2525().contains(c1363) : true;
        }
        try {
            C1385 c1385 = new C1385(c1363, 0);
            C0002 c0002 = new C0002(c1363, 17, null);
            AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
            C1271 c1271 = abstractC1286M2280 instanceof C1271 ? (C1271) abstractC1286M2280 : null;
            if (c1271 == null || (c1271Mo2215 = c1271.mo2215(c1385, c0002)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC1286 abstractC1286M2287 = c1271Mo2215.m2287();
                try {
                    c1363.m2468(interfaceC6554);
                    synchronized (this.f3996) {
                        if (((Recomposer$State) this.f4004.getValue()).compareTo(recomposer$State) > 0 && !m2525().contains(c1363)) {
                            this.f3993.add(c1363);
                            this.f4012 = null;
                        }
                    }
                    if (!z) {
                        AbstractC1280.m2280().mo2209();
                    }
                    try {
                        m2523(c1363);
                        try {
                            c1363.m2447();
                            c1363.m2445();
                            if (z) {
                                return;
                            }
                            AbstractC1280.m2280().mo2209();
                        } catch (Throwable th) {
                            m2512(th, null);
                        }
                    } catch (Throwable th2) {
                        m2512(th2, c1363);
                    }
                } finally {
                    AbstractC1286.m2284(abstractC1286M2287);
                }
            } finally {
                m2510(c1271Mo2215);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.f3996) {
                }
            }
            m2512(th3, c1363);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final InterfaceC1352 mo2319(InterfaceC6543 interfaceC6543) {
        C1340 c1340 = this.f3997;
        C1245 c1245 = (C1245) c1340.f3901;
        C1380 c1380 = new C1380();
        c1380.f3985 = interfaceC6543;
        return c1245.m2152(c1380, (C0004) c1340.f3902);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2526() {
        synchronized (this.f3996) {
            if (((Recomposer$State) this.f4004.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                this.f4004.m10313(Recomposer$State.ShuttingDown);
            }
        }
        this.f4002.mo10256(null);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2322(C1363 c1363) {
        synchronized (this.f3996) {
            if (this.f3993.remove(c1363)) {
                this.f4012 = null;
            }
            this.f4015.m2055(c1363);
            this.f4016.remove(c1363);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC0286 mo2323(C1363 c1363, InterfaceC1342 interfaceC1342, AbstractC0286 abstractC0286) {
        C0108 c0108 = this.f4001;
        try {
            m2511();
            c1363.m2453(new C1222(abstractC0286));
            InterfaceC1342 interfaceC13422 = c1363.f3957;
            c1363.f3957 = interfaceC1342;
            try {
                C1363 c1363M2521 = m2521(c1363, null);
                if (c1363M2521 != null) {
                    m2523(c1363);
                    c1363M2521.m2447();
                    c1363M2521.m2445();
                }
                C0235 c0235 = (C0235) c0108.m393();
                if (c0235 == null) {
                    c0235 = AbstractC0285.f997;
                    c0235.getClass();
                }
                return c0235;
            } finally {
                c1363.f3957 = interfaceC13422;
            }
        } finally {
            c0108.m362(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC1306 mo2324(AbstractC1305 abstractC1305) {
        AbstractC1306 abstractC1306;
        synchronized (this.f3996) {
            abstractC1306 = (AbstractC1306) this.f4005.m758(abstractC1305);
        }
        return abstractC1306;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2325(C1389 c1389) {
        C0108 c0108 = this.f4001;
        C0235 c0235 = (C0235) c0108.m393();
        if (c0235 == null) {
            C0235 c02352 = AbstractC0285.f997;
            c0235 = new C0235();
            c0108.m362(c0235);
        }
        c0235.m741(c1389);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo2326(C1363 c1363) {
        synchronized (this.f3996) {
            try {
                C0235 c0235 = this.f4007;
                if (c0235 == null) {
                    C0235 c02352 = AbstractC0285.f997;
                    c0235 = new C0235();
                    this.f4007 = c0235;
                }
                c0235.m741(c1363);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1371 mo2329() {
        return null;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2330() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo2331() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2332(C1363 c1363) {
        InterfaceC5447 interfaceC5447M2520;
        synchronized (this.f3996) {
            if (this.f4015.m2051(c1363)) {
                interfaceC5447M2520 = null;
            } else {
                this.f4015.m2047(c1363);
                interfaceC5447M2520 = m2520();
            }
        }
        if (interfaceC5447M2520 != null) {
            ((C5444) interfaceC5447M2520).resumeWith(Result.m8745constructorimpl(C5176.f14739));
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC4360 mo2334() {
        return this.f3992;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo2327(Set set) {
    }
}
