package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.layout.C0657;
import androidx.compose.runtime.internal.AbstractC1254;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p122.C7394;
import p124.AbstractC7414;
import p124.C7410;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f3706 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f3705 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f3704 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC1286 m2221() {
        return (AbstractC1286) AbstractC1280.f3745.m391();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m2222(long j, long[] jArr) {
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
    public static final boolean m2223(C1265 c1265, int i, C7394 c7394) {
        boolean z;
        synchronized (f3704) {
            int i2 = c1265.f3678;
            if (i2 == i) {
                c1265.f3679 = c7394;
                z = true;
                c1265.f3678 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m2224(C1260 c1260, int i, AbstractC7414 abstractC7414, boolean z) {
        boolean z2;
        synchronized (f3706) {
            try {
                int i2 = c1260.f3658;
                if (i2 == i) {
                    c1260.f3659 = abstractC7414;
                    z2 = true;
                    if (z) {
                        c1260.f3657++;
                    }
                    c1260.f3658 = i2 + 1;
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
    public static final void m2225(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2226() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m2227(AbstractC1286 abstractC1286, AbstractC1286 abstractC12862, InterfaceC6557 interfaceC6557) {
        if (abstractC1286 != abstractC12862) {
            abstractC12862.getClass();
            AbstractC1286.m2274(abstractC1286);
            abstractC12862.mo2195();
        } else if (abstractC1286 instanceof C1262) {
            ((C1262) abstractC1286).f3668 = interfaceC6557;
        } else if (abstractC1286 instanceof C1261) {
            ((C1261) abstractC1286).f3662 = interfaceC6557;
        } else {
            C4210.m8602(abstractC1286, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1265 m2228(SnapshotStateSet snapshotStateSet) {
        C1265 c1265 = snapshotStateSet.f3644;
        c1265.getClass();
        return (C1265) AbstractC1280.m2254(c1265, snapshotStateSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1260 m2229(SnapshotStateList snapshotStateList) {
        C1260 c1260 = snapshotStateList.f3643;
        c1260.getClass();
        return (C1260) AbstractC1280.m2254(c1260, snapshotStateList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2230(SnapshotStateList snapshotStateList, InterfaceC6557 interfaceC6557) {
        int i;
        AbstractC7414 abstractC7414;
        Object objInvoke;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (f3706) {
                C1260 c1260 = snapshotStateList.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            C7410 c7410Mo12603 = abstractC7414.mo12603();
            objInvoke = interfaceC6557.invoke(c7410Mo12603);
            AbstractC7414 abstractC7414M12584 = c7410Mo12603.m12584();
            if (AbstractC4394.m8917(abstractC7414M12584, abstractC7414)) {
                break;
            }
            C1260 c12603 = snapshotStateList.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = m2224((C1260) AbstractC1280.m2256(c12603, snapshotStateList, abstractC1286M2270), i, abstractC7414M12584, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, snapshotStateList);
        } while (!zM2224);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Object m2231(C0657 c0657, InterfaceC6542 interfaceC6542) {
        AbstractC1286 c1262;
        AbstractC1286 abstractC1286 = (AbstractC1286) AbstractC1280.f3745.m391();
        if (abstractC1286 instanceof C1262) {
            C1262 c12622 = (C1262) abstractC1286;
            if (c12622.f3665 == AbstractC1254.m2181()) {
                InterfaceC6557 interfaceC6557 = c12622.f3668;
                InterfaceC6557 interfaceC65572 = c12622.f3666;
                try {
                    ((C1262) abstractC1286).f3668 = AbstractC1280.m2267(c0657, interfaceC6557, true);
                    ((C1262) abstractC1286).f3666 = interfaceC65572;
                    return interfaceC6542.invoke();
                } finally {
                    c12622.f3668 = interfaceC6557;
                    c12622.f3666 = interfaceC65572;
                }
            }
        }
        if (abstractC1286 == null || (abstractC1286 instanceof C1271)) {
            c1262 = new C1262(abstractC1286 instanceof C1271 ? (C1271) abstractC1286 : null, c0657, null, true, false);
        } else {
            c1262 = abstractC1286.mo2196(c0657);
        }
        try {
            AbstractC1286 abstractC1286M2277 = c1262.m2277();
            try {
                Object objInvoke = interfaceC6542.invoke();
                AbstractC1286.m2274(abstractC1286M2277);
                c1262.mo2195();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC1286.m2274(abstractC1286M2277);
                throw th;
            }
        } catch (Throwable th2) {
            c1262.mo2195();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m2232(SnapshotStateList snapshotStateList) {
        C1260 c1260 = snapshotStateList.f3643;
        c1260.getClass();
        return ((C1260) AbstractC1280.m2265(c1260)).f3657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC1286 m2233(AbstractC1286 abstractC1286) {
        if (abstractC1286 instanceof C1262) {
            C1262 c1262 = (C1262) abstractC1286;
            if (c1262.f3665 == AbstractC1254.m2181()) {
                c1262.f3668 = null;
                return abstractC1286;
            }
        }
        if (abstractC1286 instanceof C1261) {
            C1261 c1261 = (C1261) abstractC1286;
            if (c1261.f3664 == AbstractC1254.m2181()) {
                c1261.f3662 = null;
                return abstractC1286;
            }
        }
        AbstractC1286 abstractC1286M2266 = AbstractC1280.m2266(abstractC1286, null, false);
        abstractC1286M2266.m2277();
        return abstractC1286M2266;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2234();
}
