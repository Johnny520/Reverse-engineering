package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.layout.C1498;
import androidx.compose.runtime.internal.AbstractC2089;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p138.C8224;
import p140.AbstractC8244;
import p140.C8240;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f4052 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object f4051 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f4050 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC2121 m2791() {
        return (AbstractC2121) AbstractC2115.f4091.m953();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m2792(long j, long[] jArr) {
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
    public static final boolean m2793(C2100 c2100, int i, C8224 c8224) {
        boolean z;
        synchronized (f4050) {
            int i2 = c2100.f4024;
            if (i2 == i) {
                c2100.f4025 = c8224;
                z = true;
                c2100.f4024 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m2794(C2095 c2095, int i, AbstractC8244 abstractC8244, boolean z) {
        boolean z2;
        synchronized (f4052) {
            try {
                int i2 = c2095.f4004;
                if (i2 == i) {
                    c2095.f4005 = abstractC8244;
                    z2 = true;
                    if (z) {
                        c2095.f4003++;
                    }
                    c2095.f4004 = i2 + 1;
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
    public static final void m2795(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m2796() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m2797(AbstractC2121 abstractC2121, AbstractC2121 abstractC21212, InterfaceC7387 interfaceC7387) {
        if (abstractC2121 != abstractC21212) {
            abstractC21212.getClass();
            AbstractC2121.m2844(abstractC2121);
            abstractC21212.mo2765();
        } else if (abstractC2121 instanceof C2097) {
            ((C2097) abstractC2121).f4014 = interfaceC7387;
        } else if (abstractC2121 instanceof C2096) {
            ((C2096) abstractC2121).f4008 = interfaceC7387;
        } else {
            C5043.m9151(abstractC2121, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2100 m2798(SnapshotStateSet snapshotStateSet) {
        C2100 c2100 = snapshotStateSet.f3990;
        c2100.getClass();
        return (C2100) AbstractC2115.m2824(c2100, snapshotStateSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2095 m2799(SnapshotStateList snapshotStateList) {
        C2095 c2095 = snapshotStateList.f3989;
        c2095.getClass();
        return (C2095) AbstractC2115.m2824(c2095, snapshotStateList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2800(SnapshotStateList snapshotStateList, InterfaceC7387 interfaceC7387) {
        int i;
        AbstractC8244 abstractC8244;
        Object objInvoke;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (f4052) {
                C2095 c2095 = snapshotStateList.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            C8240 c8240Mo13189 = abstractC8244.mo13189();
            objInvoke = interfaceC7387.invoke(c8240Mo13189);
            AbstractC8244 abstractC8244M13169 = c8240Mo13189.m13169();
            if (AbstractC5227.m9466(abstractC8244M13169, abstractC8244)) {
                break;
            }
            C2095 c20953 = snapshotStateList.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = m2794((C2095) AbstractC2115.m2826(c20953, snapshotStateList, abstractC2121M2840), i, abstractC8244M13169, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, snapshotStateList);
        } while (!zM2794);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Object m2801(C1498 c1498, InterfaceC7372 interfaceC7372) {
        AbstractC2121 c2097;
        AbstractC2121 abstractC2121 = (AbstractC2121) AbstractC2115.f4091.m953();
        if (abstractC2121 instanceof C2097) {
            C2097 c20972 = (C2097) abstractC2121;
            if (c20972.f4011 == AbstractC2089.m2751()) {
                InterfaceC7387 interfaceC7387 = c20972.f4014;
                InterfaceC7387 interfaceC73872 = c20972.f4012;
                try {
                    ((C2097) abstractC2121).f4014 = AbstractC2115.m2837(c1498, interfaceC7387, true);
                    ((C2097) abstractC2121).f4012 = interfaceC73872;
                    return interfaceC7372.invoke();
                } finally {
                    c20972.f4014 = interfaceC7387;
                    c20972.f4012 = interfaceC73872;
                }
            }
        }
        if (abstractC2121 == null || (abstractC2121 instanceof C2106)) {
            c2097 = new C2097(abstractC2121 instanceof C2106 ? (C2106) abstractC2121 : null, c1498, null, true, false);
        } else {
            c2097 = abstractC2121.mo2766(c1498);
        }
        try {
            AbstractC2121 abstractC2121M2847 = c2097.m2847();
            try {
                Object objInvoke = interfaceC7372.invoke();
                AbstractC2121.m2844(abstractC2121M2847);
                c2097.mo2765();
                return objInvoke;
            } catch (Throwable th) {
                AbstractC2121.m2844(abstractC2121M2847);
                throw th;
            }
        } catch (Throwable th2) {
            c2097.mo2765();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m2802(SnapshotStateList snapshotStateList) {
        C2095 c2095 = snapshotStateList.f3989;
        c2095.getClass();
        return ((C2095) AbstractC2115.m2835(c2095)).f4003;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC2121 m2803(AbstractC2121 abstractC2121) {
        if (abstractC2121 instanceof C2097) {
            C2097 c2097 = (C2097) abstractC2121;
            if (c2097.f4011 == AbstractC2089.m2751()) {
                c2097.f4014 = null;
                return abstractC2121;
            }
        }
        if (abstractC2121 instanceof C2096) {
            C2096 c2096 = (C2096) abstractC2121;
            if (c2096.f4010 == AbstractC2089.m2751()) {
                c2096.f4008 = null;
                return abstractC2121;
            }
        }
        AbstractC2121 abstractC2121M2836 = AbstractC2115.m2836(abstractC2121, null, false);
        abstractC2121M2836.m2847();
        return abstractC2121M2836;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2804();
}
