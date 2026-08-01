package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.app.C0113;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.collection.C0237;
import androidx.collection.C0246;
import androidx.collection.C0247;
import androidx.collection.C0276;
import androidx.compose.foundation.C1060;
import androidx.compose.runtime.collection.C1222;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1233;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.node.C1778;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6554;
import p126.C7423;
import p126.C7441;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 implements InterfaceC1371 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f3944;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1324 f3945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f3946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0236 f3947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C0236 f3948;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C7441 f3949;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C7441 f3950;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0236 f3951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1251 f3952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0113 f3953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f3954;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1363 f3955;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1391 f3956;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1342 f3957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0237 f3958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0235 f3960;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0235 f3961;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1233 f3962;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0236 f3963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1778 f3964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1372 f3966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReference f3965 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f3959 = new Object();

    public C1363(AbstractC1372 abstractC1372, C1778 c1778) {
        this.f3966 = abstractC1372;
        this.f3964 = c1778;
        C0237 c0237 = new C0237(new C0235());
        this.f3958 = c0237;
        C1233 c1233 = new C1233();
        if (abstractC1372.mo2314()) {
            c1233.f3539 = new C0246();
        }
        if (abstractC1372.mo2312()) {
            c1233.m2064();
        }
        this.f3962 = c1233;
        this.f3963 = AbstractC3055.m6663();
        this.f3960 = new C0235();
        this.f3961 = new C0235();
        this.f3951 = AbstractC3055.m6663();
        C7441 c7441 = new C7441();
        this.f3950 = c7441;
        C7441 c74412 = new C7441();
        this.f3949 = c74412;
        this.f3948 = AbstractC3055.m6663();
        this.f3947 = AbstractC3055.m6663();
        C0113 c0113 = new C0113(abstractC1372, 17);
        this.f3953 = c0113;
        this.f3952 = new C1251();
        C1324 c1324 = new C1324(c1778, abstractC1372, AbstractC1238.m2138(c1233), c0237, c7441, c74412, c0113, this);
        abstractC1372.mo2328(c1324);
        this.f3945 = c1324;
    }

    @Override // androidx.compose.runtime.InterfaceC1371
    public final void dispose() {
        synchronized (this.f3959) {
            try {
                if (this.f3945.f3855) {
                    AbstractC1392.m2537("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f3944 != 3) {
                    this.f3944 = 3;
                    C7441 c7441 = this.f3945.f3841;
                    if (c7441 != null) {
                        m2446(c7441);
                    }
                    int i = 1;
                    boolean z = this.f3962.f3544 == 0;
                    if (!z || !this.f3958.f996.m873()) {
                        C1251 c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            if (!z) {
                                C1233 c1233 = this.f3962;
                                C1251 c12512 = this.f3952;
                                C1235 c1235M2063 = c1233.m2063();
                                try {
                                    c1235M2063.m2125(c1235M2063.f3570, new C1381(c12512, i));
                                    c1235M2063.m2109();
                                    c1235M2063.m2114(true);
                                    this.f3964.m3327();
                                    this.f3964.mo2437();
                                    c1251.m2180();
                                } catch (Throwable th) {
                                    c1235M2063.m2114(false);
                                    throw th;
                                }
                            }
                            c1251.m2181();
                            c1251.m2182();
                        } catch (Throwable th2) {
                            c1251.m2182();
                            throw th2;
                        }
                    }
                    C1324 c1324 = this.f3945;
                    c1324.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1324.f3861.mo2321(c1324);
                        c1324.f3856.clear();
                        c1324.f3864.clear();
                        c1324.f3858.f20152.m12651();
                        c1324.f3868 = null;
                        c1324.f3862.m3327();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f3966.mo2322(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m2443(InterfaceC6554 interfaceC6554) {
        boolean zM2467 = m2467();
        m2462();
        AbstractC1372 abstractC1372 = this.f3966;
        if (!zM2467) {
            abstractC1372.mo2317(this, interfaceC6554);
            return;
        }
        C1324 c1324 = this.f3945;
        c1324.f3849 = 0;
        c1324.f3850 = true;
        abstractC1372.mo2317(this, interfaceC6554);
        c1324.m2367();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2444(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3959
            monitor-enter(r0)
            r14.m2451(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r14.f3951     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m757(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.C0235     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.飘花落叶言子世兰楪哲苏 r15 = (androidx.collection.C0235) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f1000     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f1001     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.飘花落叶言子楪兰苏哲世 r10 = (androidx.compose.runtime.C1362) r10     // Catch: java.lang.Throwable -> L4f
            r14.m2451(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.飘花落叶言子楪兰苏哲世 r15 = (androidx.compose.runtime.C1362) r15     // Catch: java.lang.Throwable -> L4f
            r14.m2451(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2444(java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2445() {
        synchronized (this.f3959) {
            try {
                C7441 c7441 = this.f3949;
                c7441.getClass();
                if (!c7441.f20152.m12653()) {
                    m2446(this.f3949);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3958.f996.m873()) {
                        C1251 c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            c1251.m2181();
                            c1251.m2182();
                        } catch (Throwable th2) {
                            c1251.m2182();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2446(p126.C7441 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2446(飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏哲兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2447() {
        synchronized (this.f3959) {
            try {
                m2446(this.f3950);
                m2457();
            } catch (Throwable th) {
                try {
                    if (!this.f3958.f996.m873()) {
                        C1251 c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            c1251.m2181();
                            c1251.m2182();
                        } catch (Throwable th2) {
                            c1251.m2182();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m2450();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2448(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2448(java.util.Set, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2449(Object obj, boolean z) {
        Object objM757 = this.f3963.m757(obj);
        if (objM757 == null) {
            return;
        }
        boolean z2 = objM757 instanceof C0235;
        C0235 c0235 = this.f3960;
        C0235 c02352 = this.f3961;
        C0236 c0236 = this.f3948;
        if (!z2) {
            C1389 c1389 = (C1389) objM757;
            if (AbstractC3055.m6642(c0236, obj, c1389) || c1389.m2529(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (c1389.f4038 == null || z) {
                c0235.m741(c1389);
                return;
            } else {
                c02352.m741(c1389);
                return;
            }
        }
        C0235 c02353 = (C0235) objM757;
        Object[] objArr = c02353.f1000;
        long[] jArr = c02353.f1001;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C1389 c13892 = (C1389) objArr[(i << 3) + i3];
                        if (!AbstractC3055.m6642(c0236, obj, c13892) && c13892.m2529(obj) != InvalidationResult.IGNORED) {
                            if (c13892.f4038 == null || z) {
                                c0235.m741(c13892);
                            } else {
                                c02352.m741(c13892);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2450() {
        this.f3965.set(null);
        this.f3950.f20152.m12651();
        this.f3949.f20152.m12651();
        C0237 c0237 = this.f3958;
        if (c0237.f996.m873()) {
            return;
        }
        C1251 c1251 = this.f3952;
        try {
            c1251.m2183(c0237, this.f3945.m2352());
            c1251.m2181();
        } finally {
            c1251.m2182();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2451(Object obj) {
        Object objM757 = this.f3963.m757(obj);
        if (objM757 == null) {
            return;
        }
        boolean z = objM757 instanceof C0235;
        C0236 c0236 = this.f3948;
        if (!z) {
            C1389 c1389 = (C1389) objM757;
            if (c1389.m2529(obj) == InvalidationResult.IMMINENT) {
                AbstractC3055.m6648(c0236, obj, c1389);
                return;
            }
            return;
        }
        C0235 c0235 = (C0235) objM757;
        Object[] objArr = c0235.f1000;
        long[] jArr = c0235.f1001;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C1389 c13892 = (C1389) objArr[(i << 3) + i3];
                        if (c13892.m2529(obj) == InvalidationResult.IMMINENT) {
                            AbstractC3055.m6648(c0236, obj, c13892);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.InvalidationResult m2452(androidx.compose.runtime.C1389 r20, androidx.compose.runtime.composer.gapbuffer.C1230 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2452(androidx.compose.runtime.飘花落叶言子苏哲兰世楪, androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2453(C1222 c1222) {
        Object obj;
        while (true) {
            Object obj2 = this.f3965.get();
            if (obj2 == null || obj2.equals(AbstractC1367.f3973)) {
                obj = c1222;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c1222};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C0276.m845(this.f3965, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c1222;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f3965;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f3959) {
                    m2457();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2454(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2454(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2455(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.C1222
            androidx.collection.飘花落叶言子世兰楪苏哲 r3 = r0.f3951
            androidx.collection.飘花落叶言子世兰楪苏哲 r0 = r0.f3963
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏 r1 = (androidx.compose.runtime.collection.C1222) r1
            androidx.collection.飘花落叶言子苏世楪哲兰 r1 = r1.f3518
            java.lang.Object[] r2 = r1.f1000
            long[] r1 = r1.f1001
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.m752(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.m752(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.m752(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.m752(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2455(java.util.Set):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m2456() {
        synchronized (this.f3959) {
            C1391 c1391 = this.f3956;
            boolean z = false;
            if (c1391 != null && (c1391.f4046.get() != PausedCompositionState.Recomposing || c1391.f4050 != AbstractC1254.m2191())) {
                AtomicReference atomicReference = c1391.f4046;
                PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                ((C0247) c1391.f4049.f3903).m795(9);
                return false;
            }
            m2458();
            try {
                C0236 c0236 = this.f3947;
                this.f3947 = AbstractC3055.m6663();
                try {
                    C1324 c1324 = this.f3945;
                    InterfaceC1342 interfaceC1342 = this.f3957;
                    C7423 c7423 = c1324.f3858.f20152;
                    if (!c7423.m12653()) {
                        AbstractC1374.m2507("Expected applyChanges() to have been called");
                    }
                    if (c0236.f877 > 0 || !c1324.f3864.isEmpty()) {
                        c1324.f3840 = interfaceC1342;
                        try {
                            c1324.m2372(c0236, null);
                            c1324.f3840 = null;
                            z = !c7423.m12653();
                        } catch (Throwable th) {
                            c1324.f3840 = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m2457();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f3947 = c0236;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f3958.f996.m873()) {
                        C1251 c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            c1251.m2181();
                            c1251.m2182();
                        } catch (Throwable th4) {
                            c1251.m2182();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m2450();
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2457() {
        AtomicReference atomicReference = this.f3965;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC4395.m8907(andSet, AbstractC1367.f3973)) {
            return;
        }
        if (andSet instanceof Set) {
            m2448((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m2448(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f3956 == null) {
                AbstractC1374.m2507("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC1374.m2506("corrupt pendingModifications drain: " + atomicReference);
            C4211.m8602();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2458() {
        Object obj = AbstractC1367.f3973;
        AtomicReference atomicReference = this.f3965;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1374.m2506("pending composition has not been applied");
                C4211.m8602();
                return;
            }
            if (andSet instanceof Set) {
                m2448((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1374.m2506("corrupt pendingModifications drain: " + atomicReference);
                C4211.m8602();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m2448(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2459(ArrayList arrayList) {
        C0237 c0237 = this.f3958;
        C1324 c1324 = this.f3945;
        if (arrayList.size() > 0) {
            ((AbstractC1305) ((Pair) arrayList.get(0)).getFirst()).getClass();
            AbstractC1374.m2507("Check failed");
        }
        try {
            c1324.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c1324.m2350(arrayList);
                    c1324.m2382();
                } catch (Throwable th) {
                    c1324.m2365();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!c0237.f996.m873()) {
                    C1251 c1251 = this.f3952;
                    try {
                        c1251.m2183(c0237, c1324.m2352());
                        c1251.m2181();
                        c1251.m2182();
                    } catch (Throwable th3) {
                        c1251.m2182();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2450();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InvalidationResult m2460(C1389 c1389, Object obj) {
        C1363 c1363;
        int i = c1389.f4036;
        if ((i & 2) != 0) {
            c1389.f4036 = i | 4;
        }
        C1230 c1230 = c1389.f4035;
        if (c1230 == null || !c1230.m2061()) {
            return InvalidationResult.IGNORED;
        }
        C1233 c1233 = this.f3962;
        c1233.getClass();
        C1230 c12302 = c1389.f4035;
        if (c12302 != null && c1233.m2067(AbstractC3066.m6851(c12302))) {
            if (c1389.f4034 == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult invalidationResultM2452 = m2452(c1389, c1230, obj);
            if (invalidationResultM2452 != InvalidationResult.IGNORED) {
                this.f3953.m445();
            }
            return invalidationResultM2452;
        }
        synchronized (this.f3959) {
            c1363 = this.f3955;
        }
        if (c1363 != null) {
            C1324 c1324 = c1363.f3945;
            if (c1324.f3855 && c1324.m2394(c1389, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2461() {
        EmptySet emptySet = EmptySet.INSTANCE;
        AtomicReference atomicReference = this.f3965;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (AbstractC4395.m8907(andSet, AbstractC1367.f3973) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m2448((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1374.m2506("corrupt pendingModifications drain: " + atomicReference);
            C4211.m8602();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m2448(set, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m2462() {
        int i = this.f3944;
        if (i != 0) {
            AbstractC1392.m2537(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f3956 == null) {
            return;
        }
        AbstractC1392.m2537("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2463() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM873;
        int i4;
        int i5;
        C0236 c0236 = this.f3951;
        long[] jArr3 = c0236.f881;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = c0236.f880[i10];
                            Object obj2 = c0236.f879[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof C0235;
                            j5 = j8;
                            C0236 c02362 = this.f3963;
                            if (z) {
                                C0235 c0235 = (C0235) obj2;
                                Object[] objArr = c0235.f1000;
                                long[] jArr4 = c0235.f1001;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!c02362.m752((C1362) objArr[i15])) {
                                                        c0235.m742(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM873 = c0235.m873();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zM873 = !c02362.m752((C1362) obj2);
                            }
                            if (zM873) {
                                c0236.m759(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        C0235 c02352 = this.f3961;
        if (!c02352.m872()) {
            return;
        }
        Object[] objArr2 = c02352.f1000;
        long[] jArr5 = c02352.f1001;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((C1389) objArr2[i20]).f4038 == null) {
                            c02352.m742(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2464() {
        C1251 c1251;
        synchronized (this.f3959) {
            try {
                this.f3945.f3868 = null;
                if (!this.f3958.f996.m873()) {
                    c1251 = this.f3952;
                    try {
                        c1251.m2183(this.f3958, this.f3945.m2352());
                        c1251.m2181();
                        c1251.m2182();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3958.f996.m873()) {
                        c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            c1251.m2181();
                            c1251.m2182();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m2450();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1391 m2465(boolean z, InterfaceC6554 interfaceC6554) {
        if (this.f3956 != null) {
            AbstractC1392.m2537("A pausable composition is in progress");
        }
        C1391 c1391 = new C1391(this, this.f3966, this.f3945, this.f3958, interfaceC6554, z, this.f3964, this.f3959);
        this.f3956 = c1391;
        return c1391;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2466() {
        synchronized (this.f3959) {
            try {
                if (this.f3956 != null) {
                    AbstractC1392.m2537("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f3962.f3544 == 0;
                if (!z || !this.f3958.f996.m873()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C1251 c1251 = this.f3952;
                        try {
                            c1251.m2183(this.f3958, this.f3945.m2352());
                            if (!z) {
                                C1233 c1233 = this.f3962;
                                C1251 c12512 = this.f3952;
                                C1235 c1235M2063 = c1233.m2063();
                                try {
                                    c1235M2063.m2125(c1235M2063.f3570, new C1060(c12512, 5, c1235M2063));
                                    c1235M2063.m2114(true);
                                    this.f3964.mo2437();
                                    c1251.m2180();
                                } catch (Throwable th) {
                                    c1235M2063.m2114(false);
                                    throw th;
                                }
                            }
                            c1251.m2181();
                            c1251.m2182();
                        } catch (Throwable th2) {
                            c1251.m2182();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f3963.m754();
                this.f3951.m754();
                this.f3947.m754();
                this.f3950.f20152.m12651();
                this.f3949.f20152.m12651();
                C1324 c1324 = this.f3945;
                c1324.f3856.clear();
                c1324.f3864.clear();
                c1324.f3858.f20152.m12651();
                c1324.f3868 = null;
                this.f3944 = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m2467() {
        boolean z;
        synchronized (this.f3959) {
            z = true;
            if (this.f3944 != 1) {
                z = false;
            }
            if (z) {
                this.f3944 = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2468(InterfaceC6554 interfaceC6554) {
        try {
            synchronized (this.f3959) {
                m2458();
                C0236 c0236 = this.f3947;
                this.f3947 = AbstractC3055.m6663();
                try {
                    C1324 c1324 = this.f3945;
                    InterfaceC1342 interfaceC1342 = this.f3957;
                    if (!c1324.f3858.f20152.m12653()) {
                        AbstractC1374.m2507("Expected applyChanges() to have been called");
                    }
                    c1324.f3840 = interfaceC1342;
                    try {
                        c1324.m2372(c0236, interfaceC6554);
                    } finally {
                        c1324.f3840 = null;
                    }
                } catch (Throwable th) {
                    this.f3947 = c0236;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f3958.f996.m873()) {
                    C1251 c1251 = this.f3952;
                    try {
                        c1251.m2183(this.f3958, this.f3945.m2352());
                        c1251.m2181();
                        c1251.m2182();
                    } catch (Throwable th3) {
                        c1251.m2182();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2450();
                throw th4;
            }
        }
    }
}
