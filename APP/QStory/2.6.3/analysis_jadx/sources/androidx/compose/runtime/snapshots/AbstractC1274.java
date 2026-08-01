package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.layout.C0657;
import androidx.compose.runtime.internal.AbstractC1254;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p122.C7395;
import p124.AbstractC7415;
import p124.C7411;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f3707 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f3706 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f3705 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC1286 m2231() {
        return (AbstractC1286) AbstractC1280.f3746.m393();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m2232(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m2233(C1265 c1265, int i, C7395 c7395) {
        boolean z;
        synchronized (f3705) {
            int i2 = c1265.f3679;
            if (i2 == i) {
                c1265.f3680 = c7395;
                z = true;
                c1265.f3679 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m2234(C1260 c1260, int i, AbstractC7415 abstractC7415, boolean z) {
        boolean z2;
        synchronized (f3707) {
            try {
                int i2 = c1260.f3659;
                if (i2 == i) {
                    c1260.f3660 = abstractC7415;
                    z2 = true;
                    if (z) {
                        c1260.f3658++;
                    }
                    c1260.f3659 = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2235(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2236() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m2237(AbstractC1286 abstractC1286, AbstractC1286 abstractC12862, InterfaceC6558 interfaceC6558) {
        if (abstractC1286 != abstractC12862) {
            abstractC12862.getClass();
            AbstractC1286.m2284(abstractC1286);
            abstractC12862.mo2205();
        } else if (abstractC1286 instanceof C1262) {
            ((C1262) abstractC1286).f3669 = interfaceC6558;
        } else if (abstractC1286 instanceof C1261) {
            ((C1261) abstractC1286).f3663 = interfaceC6558;
        } else {
            C4211.m8592(abstractC1286, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1265 m2238(SnapshotStateSet snapshotStateSet) {
        C1265 c1265 = snapshotStateSet.f3645;
        c1265.getClass();
        return (C1265) AbstractC1280.m2264(c1265, snapshotStateSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1260 m2239(SnapshotStateList snapshotStateList) {
        C1260 c1260 = snapshotStateList.f3644;
        c1260.getClass();
        return (C1260) AbstractC1280.m2264(c1260, snapshotStateList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2240(SnapshotStateList snapshotStateList, InterfaceC6558 interfaceC6558) {
        int i;
        AbstractC7415 abstractC7415;
        Object objInvoke;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (f3707) {
                C1260 c1260 = snapshotStateList.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            C7411 c7411Mo12630 = abstractC7415.mo12630();
            objInvoke = interfaceC6558.invoke(c7411Mo12630);
            AbstractC7415 abstractC7415M12610 = c7411Mo12630.m12610();
            if (AbstractC4395.m8907(abstractC7415M12610, abstractC7415)) {
                break;
            }
            C1260 c12603 = snapshotStateList.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = m2234((C1260) AbstractC1280.m2266(c12603, snapshotStateList, abstractC1286M2280), i, abstractC7415M12610, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, snapshotStateList);
        } while (!zM2234);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Object m2241(C0657 c0657, InterfaceC6543 interfaceC6543) {
        AbstractC1286 c1262;
        AbstractC1286 abstractC1286 = (AbstractC1286) AbstractC1280.f3746.m393();
        if (abstractC1286 instanceof C1262) {
            C1262 c12622 = (C1262) abstractC1286;
            if (c12622.f3666 == AbstractC1254.m2191()) {
                InterfaceC6558 interfaceC6558 = c12622.f3669;
                InterfaceC6558 interfaceC65582 = c12622.f3667;
                try {
                    ((C1262) abstractC1286).f3669 = AbstractC1280.m2277(c0657, interfaceC6558, true);
                    ((C1262) abstractC1286).f3667 = interfaceC65582;
                    return interfaceC6543.invoke();
                } finally {
                    c12622.f3669 = interfaceC6558;
                    c12622.f3667 = interfaceC65582;
                }
            }
        }
        if (abstractC1286 == null || (abstractC1286 instanceof C1271)) {
            c1262 = new C1262(abstractC1286 instanceof C1271 ? (C1271) abstractC1286 : null, c0657, null, true, false);
        } else {
            c1262 = abstractC1286.mo2206(c0657);
        }
        try {
            AbstractC1286 abstractC1286M2287 = c1262.m2287();
            try {
                Object objInvoke = interfaceC6543.invoke();
                AbstractC1286.m2284(abstractC1286M2287);
                c1262.mo2205();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC1286.m2284(abstractC1286M2287);
                throw th;
            }
        } catch (Throwable th2) {
            c1262.mo2205();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m2242(SnapshotStateList snapshotStateList) {
        C1260 c1260 = snapshotStateList.f3644;
        c1260.getClass();
        return ((C1260) AbstractC1280.m2275(c1260)).f3658;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC1286 m2243(AbstractC1286 abstractC1286) {
        if (abstractC1286 instanceof C1262) {
            C1262 c1262 = (C1262) abstractC1286;
            if (c1262.f3666 == AbstractC1254.m2191()) {
                c1262.f3669 = null;
                return abstractC1286;
            }
        }
        if (abstractC1286 instanceof C1261) {
            C1261 c1261 = (C1261) abstractC1286;
            if (c1261.f3665 == AbstractC1254.m2191()) {
                c1261.f3663 = null;
                return abstractC1286;
            }
        }
        AbstractC1286 abstractC1286M2276 = AbstractC1280.m2276(abstractC1286, null, false);
        abstractC1286M2276.m2287();
        return abstractC1286M2276;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2244();
}
