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
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6553;
import p126.C7422;
import p126.C7440;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 implements InterfaceC1371 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f3943;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1324 f3944;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f3945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0236 f3946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C0236 f3947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C7440 f3948;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C7440 f3949;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0236 f3950;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1251 f3951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0113 f3952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f3953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1363 f3954;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1391 f3955;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1342 f3956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0237 f3957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0235 f3959;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0235 f3960;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1233 f3961;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0236 f3962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1778 f3963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1372 f3965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReference f3964 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f3958 = new Object();

    public C1363(AbstractC1372 abstractC1372, C1778 c1778) {
        this.f3965 = abstractC1372;
        this.f3963 = c1778;
        C0237 c0237 = new C0237(new C0235());
        this.f3957 = c0237;
        C1233 c1233 = new C1233();
        if (abstractC1372.mo2304()) {
            c1233.f3538 = new C0246();
        }
        if (abstractC1372.mo2302()) {
            c1233.m2054();
        }
        this.f3961 = c1233;
        this.f3962 = AbstractC3054.m6614();
        this.f3959 = new C0235();
        this.f3960 = new C0235();
        this.f3950 = AbstractC3054.m6614();
        C7440 c7440 = new C7440();
        this.f3949 = c7440;
        C7440 c74402 = new C7440();
        this.f3948 = c74402;
        this.f3947 = AbstractC3054.m6614();
        this.f3946 = AbstractC3054.m6614();
        C0113 c0113 = new C0113(abstractC1372, 17);
        this.f3952 = c0113;
        this.f3951 = new C1251();
        C1324 c1324 = new C1324(c1778, abstractC1372, AbstractC1238.m2128(c1233), c0237, c7440, c74402, c0113, this);
        abstractC1372.mo2318(c1324);
        this.f3944 = c1324;
    }

    @Override // androidx.compose.runtime.InterfaceC1371
    public final void dispose() {
        synchronized (this.f3958) {
            try {
                if (this.f3944.f3854) {
                    AbstractC1392.m2527("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f3943 != 3) {
                    this.f3943 = 3;
                    C7440 c7440 = this.f3944.f3840;
                    if (c7440 != null) {
                        m2436(c7440);
                    }
                    int i = 1;
                    boolean z = this.f3961.f3543 == 0;
                    if (!z || !this.f3957.f996.m872()) {
                        C1251 c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            if (!z) {
                                C1233 c1233 = this.f3961;
                                C1251 c12512 = this.f3951;
                                C1235 c1235M2053 = c1233.m2053();
                                try {
                                    c1235M2053.m2115(c1235M2053.f3569, new C1381(c12512, i));
                                    c1235M2053.m2099();
                                    c1235M2053.m2104(true);
                                    this.f3963.m3317();
                                    this.f3963.mo2427();
                                    c1251.m2170();
                                } catch (Throwable th) {
                                    c1235M2053.m2104(false);
                                    throw th;
                                }
                            }
                            c1251.m2171();
                            c1251.m2172();
                        } catch (Throwable th2) {
                            c1251.m2172();
                            throw th2;
                        }
                    }
                    C1324 c1324 = this.f3944;
                    c1324.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1324.f3860.mo2311(c1324);
                        c1324.f3855.clear();
                        c1324.f3863.clear();
                        c1324.f3857.f20157.m12626();
                        c1324.f3867 = null;
                        c1324.f3861.m3317();
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
        this.f3965.mo2312(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m2433(InterfaceC6553 interfaceC6553) {
        boolean zM2457 = m2457();
        m2452();
        AbstractC1372 abstractC1372 = this.f3965;
        if (!zM2457) {
            abstractC1372.mo2307(this, interfaceC6553);
            return;
        }
        C1324 c1324 = this.f3944;
        c1324.f3848 = 0;
        c1324.f3849 = true;
        abstractC1372.mo2307(this, interfaceC6553);
        c1324.m2357();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2434(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3958
            monitor-enter(r0)
            r14.m2441(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r14.f3950     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m756(r15)     // Catch: java.lang.Throwable -> L4f
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
            r14.m2441(r10)     // Catch: java.lang.Throwable -> L4f
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
            r14.m2441(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2434(java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2435() {
        synchronized (this.f3958) {
            try {
                C7440 c7440 = this.f3948;
                c7440.getClass();
                if (!c7440.f20157.m12625()) {
                    m2436(this.f3948);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3957.f996.m872()) {
                        C1251 c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            c1251.m2171();
                            c1251.m2172();
                        } catch (Throwable th2) {
                            c1251.m2172();
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
    public final void m2436(p126.C7440 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2436(飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏哲兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2437() {
        synchronized (this.f3958) {
            try {
                m2436(this.f3949);
                m2447();
            } catch (Throwable th) {
                try {
                    if (!this.f3957.f996.m872()) {
                        C1251 c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            c1251.m2171();
                            c1251.m2172();
                        } catch (Throwable th2) {
                            c1251.m2172();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m2440();
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
    public final void m2438(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2438(java.util.Set, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2439(Object obj, boolean z) {
        Object objM756 = this.f3962.m756(obj);
        if (objM756 == null) {
            return;
        }
        boolean z2 = objM756 instanceof C0235;
        C0235 c0235 = this.f3959;
        C0235 c02352 = this.f3960;
        C0236 c0236 = this.f3947;
        if (!z2) {
            C1389 c1389 = (C1389) objM756;
            if (AbstractC3054.m6587(c0236, obj, c1389) || c1389.m2519(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (c1389.f4037 == null || z) {
                c0235.m740(c1389);
                return;
            } else {
                c02352.m740(c1389);
                return;
            }
        }
        C0235 c02353 = (C0235) objM756;
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
                        if (!AbstractC3054.m6587(c0236, obj, c13892) && c13892.m2519(obj) != InvalidationResult.IGNORED) {
                            if (c13892.f4037 == null || z) {
                                c0235.m740(c13892);
                            } else {
                                c02352.m740(c13892);
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
    public final void m2440() {
        this.f3964.set(null);
        this.f3949.f20157.m12626();
        this.f3948.f20157.m12626();
        C0237 c0237 = this.f3957;
        if (c0237.f996.m872()) {
            return;
        }
        C1251 c1251 = this.f3951;
        try {
            c1251.m2173(c0237, this.f3944.m2342());
            c1251.m2171();
        } finally {
            c1251.m2172();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2441(Object obj) {
        Object objM756 = this.f3962.m756(obj);
        if (objM756 == null) {
            return;
        }
        boolean z = objM756 instanceof C0235;
        C0236 c0236 = this.f3947;
        if (!z) {
            C1389 c1389 = (C1389) objM756;
            if (c1389.m2519(obj) == InvalidationResult.IMMINENT) {
                AbstractC3054.m6598(c0236, obj, c1389);
                return;
            }
            return;
        }
        C0235 c0235 = (C0235) objM756;
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
                        if (c13892.m2519(obj) == InvalidationResult.IMMINENT) {
                            AbstractC3054.m6598(c0236, obj, c13892);
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
    public final androidx.compose.runtime.InvalidationResult m2442(androidx.compose.runtime.C1389 r20, androidx.compose.runtime.composer.gapbuffer.C1230 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2442(androidx.compose.runtime.飘花落叶言子苏哲兰世楪, androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2443(C1222 c1222) {
        Object obj;
        while (true) {
            Object obj2 = this.f3964.get();
            if (obj2 == null || obj2.equals(AbstractC1367.f3972)) {
                obj = c1222;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c1222};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C0276.m844(this.f3964, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c1222;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f3964;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f3958) {
                    m2447();
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
    public final void m2444(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2444(java.lang.Object):void");
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
    public final boolean m2445(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.C1222
            androidx.collection.飘花落叶言子世兰楪苏哲 r3 = r0.f3950
            androidx.collection.飘花落叶言子世兰楪苏哲 r0 = r0.f3962
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            androidx.compose.runtime.collection.飘花落叶言子楪世哲兰苏 r1 = (androidx.compose.runtime.collection.C1222) r1
            androidx.collection.飘花落叶言子苏世楪哲兰 r1 = r1.f3517
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
            boolean r14 = r0.m751(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.m751(r13)
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
            boolean r6 = r0.m751(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.m751(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1363.m2445(java.util.Set):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m2446() {
        synchronized (this.f3958) {
            C1391 c1391 = this.f3955;
            boolean z = false;
            if (c1391 != null && (c1391.f4045.get() != PausedCompositionState.Recomposing || c1391.f4049 != AbstractC1254.m2181())) {
                AtomicReference atomicReference = c1391.f4045;
                PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                ((C0247) c1391.f4048.f3902).m794(9);
                return false;
            }
            m2448();
            try {
                C0236 c0236 = this.f3946;
                this.f3946 = AbstractC3054.m6614();
                try {
                    C1324 c1324 = this.f3944;
                    InterfaceC1342 interfaceC1342 = this.f3956;
                    C7422 c7422 = c1324.f3857.f20157;
                    if (!c7422.m12625()) {
                        AbstractC1374.m2497("Expected applyChanges() to have been called");
                    }
                    if (c0236.f877 > 0 || !c1324.f3863.isEmpty()) {
                        c1324.f3839 = interfaceC1342;
                        try {
                            c1324.m2362(c0236, null);
                            c1324.f3839 = null;
                            z = !c7422.m12625();
                        } catch (Throwable th) {
                            c1324.f3839 = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m2447();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f3946 = c0236;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f3957.f996.m872()) {
                        C1251 c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            c1251.m2171();
                            c1251.m2172();
                        } catch (Throwable th4) {
                            c1251.m2172();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m2440();
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2447() {
        AtomicReference atomicReference = this.f3964;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC4394.m8917(andSet, AbstractC1367.f3972)) {
            return;
        }
        if (andSet instanceof Set) {
            m2438((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m2438(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f3955 == null) {
                AbstractC1374.m2497("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC1374.m2496("corrupt pendingModifications drain: " + atomicReference);
            C4210.m8612();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2448() {
        Object obj = AbstractC1367.f3972;
        AtomicReference atomicReference = this.f3964;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1374.m2496("pending composition has not been applied");
                C4210.m8612();
                return;
            }
            if (andSet instanceof Set) {
                m2438((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1374.m2496("corrupt pendingModifications drain: " + atomicReference);
                C4210.m8612();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m2438(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2449(ArrayList arrayList) {
        C0237 c0237 = this.f3957;
        C1324 c1324 = this.f3944;
        if (arrayList.size() > 0) {
            ((AbstractC1305) ((Pair) arrayList.get(0)).getFirst()).getClass();
            AbstractC1374.m2497("Check failed");
        }
        try {
            c1324.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c1324.m2340(arrayList);
                    c1324.m2372();
                } catch (Throwable th) {
                    c1324.m2355();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!c0237.f996.m872()) {
                    C1251 c1251 = this.f3951;
                    try {
                        c1251.m2173(c0237, c1324.m2342());
                        c1251.m2171();
                        c1251.m2172();
                    } catch (Throwable th3) {
                        c1251.m2172();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2440();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InvalidationResult m2450(C1389 c1389, Object obj) {
        C1363 c1363;
        int i = c1389.f4035;
        if ((i & 2) != 0) {
            c1389.f4035 = i | 4;
        }
        C1230 c1230 = c1389.f4034;
        if (c1230 == null || !c1230.m2051()) {
            return InvalidationResult.IGNORED;
        }
        C1233 c1233 = this.f3961;
        c1233.getClass();
        C1230 c12302 = c1389.f4034;
        if (c12302 != null && c1233.m2057(AbstractC3065.m6840(c12302))) {
            if (c1389.f4033 == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult invalidationResultM2442 = m2442(c1389, c1230, obj);
            if (invalidationResultM2442 != InvalidationResult.IGNORED) {
                this.f3952.m442();
            }
            return invalidationResultM2442;
        }
        synchronized (this.f3958) {
            c1363 = this.f3954;
        }
        if (c1363 != null) {
            C1324 c1324 = c1363.f3944;
            if (c1324.f3854 && c1324.m2384(c1389, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2451() {
        EmptySet emptySet = EmptySet.INSTANCE;
        AtomicReference atomicReference = this.f3964;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (AbstractC4394.m8917(andSet, AbstractC1367.f3972) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m2438((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1374.m2496("corrupt pendingModifications drain: " + atomicReference);
            C4210.m8612();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m2438(set, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m2452() {
        int i = this.f3943;
        if (i != 0) {
            AbstractC1392.m2527(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f3955 == null) {
            return;
        }
        AbstractC1392.m2527("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2453() {
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
        boolean zM872;
        int i4;
        int i5;
        C0236 c0236 = this.f3950;
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
                            C0236 c02362 = this.f3962;
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
                                                    if (!c02362.m751((C1362) objArr[i15])) {
                                                        c0235.m741(i15);
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
                                zM872 = c0235.m872();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zM872 = !c02362.m751((C1362) obj2);
                            }
                            if (zM872) {
                                c0236.m758(i10);
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
        C0235 c02352 = this.f3960;
        if (!c02352.m871()) {
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
                        if (((C1389) objArr2[i20]).f4037 == null) {
                            c02352.m741(i20);
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
    public final void m2454() {
        C1251 c1251;
        synchronized (this.f3958) {
            try {
                this.f3944.f3867 = null;
                if (!this.f3957.f996.m872()) {
                    c1251 = this.f3951;
                    try {
                        c1251.m2173(this.f3957, this.f3944.m2342());
                        c1251.m2171();
                        c1251.m2172();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f3957.f996.m872()) {
                        c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            c1251.m2171();
                            c1251.m2172();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m2440();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1391 m2455(boolean z, InterfaceC6553 interfaceC6553) {
        if (this.f3955 != null) {
            AbstractC1392.m2527("A pausable composition is in progress");
        }
        C1391 c1391 = new C1391(this, this.f3965, this.f3944, this.f3957, interfaceC6553, z, this.f3963, this.f3958);
        this.f3955 = c1391;
        return c1391;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2456() {
        synchronized (this.f3958) {
            try {
                if (this.f3955 != null) {
                    AbstractC1392.m2527("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f3961.f3543 == 0;
                if (!z || !this.f3957.f996.m872()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C1251 c1251 = this.f3951;
                        try {
                            c1251.m2173(this.f3957, this.f3944.m2342());
                            if (!z) {
                                C1233 c1233 = this.f3961;
                                C1251 c12512 = this.f3951;
                                C1235 c1235M2053 = c1233.m2053();
                                try {
                                    c1235M2053.m2115(c1235M2053.f3569, new C1060(c12512, 5, c1235M2053));
                                    c1235M2053.m2104(true);
                                    this.f3963.mo2427();
                                    c1251.m2170();
                                } catch (Throwable th) {
                                    c1235M2053.m2104(false);
                                    throw th;
                                }
                            }
                            c1251.m2171();
                            c1251.m2172();
                        } catch (Throwable th2) {
                            c1251.m2172();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f3962.m753();
                this.f3950.m753();
                this.f3946.m753();
                this.f3949.f20157.m12626();
                this.f3948.f20157.m12626();
                C1324 c1324 = this.f3944;
                c1324.f3855.clear();
                c1324.f3863.clear();
                c1324.f3857.f20157.m12626();
                c1324.f3867 = null;
                this.f3943 = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m2457() {
        boolean z;
        synchronized (this.f3958) {
            z = true;
            if (this.f3943 != 1) {
                z = false;
            }
            if (z) {
                this.f3943 = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2458(InterfaceC6553 interfaceC6553) {
        try {
            synchronized (this.f3958) {
                m2448();
                C0236 c0236 = this.f3946;
                this.f3946 = AbstractC3054.m6614();
                try {
                    C1324 c1324 = this.f3944;
                    InterfaceC1342 interfaceC1342 = this.f3956;
                    if (!c1324.f3857.f20157.m12625()) {
                        AbstractC1374.m2497("Expected applyChanges() to have been called");
                    }
                    c1324.f3839 = interfaceC1342;
                    try {
                        c1324.m2362(c0236, interfaceC6553);
                    } finally {
                        c1324.f3839 = null;
                    }
                } catch (Throwable th) {
                    this.f3946 = c0236;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f3957.f996.m872()) {
                    C1251 c1251 = this.f3951;
                    try {
                        c1251.m2173(this.f3957, this.f3944.m2342());
                        c1251.m2171();
                        c1251.m2172();
                    } catch (Throwable th3) {
                        c1251.m2172();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2440();
                throw th4;
            }
        }
    }
}
