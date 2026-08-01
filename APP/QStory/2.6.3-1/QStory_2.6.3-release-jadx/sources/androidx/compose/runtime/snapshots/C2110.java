package androidx.compose.runtime.snapshots;

import androidx.collection.C1099;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.layout.C1481;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.C2148;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.AbstractC2089;
import io.ktor.util.C5043;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5220;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f4056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f4058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2102 f4059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2113 f4061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReference f4057 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1481 f4055 = new C1481(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1905 f4054 = new C1905(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2059 f4053 = new C2059(0, new C2113[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f4060 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4062 = -1;

    public C2110(InterfaceC7387 interfaceC7387) {
        this.f4058 = interfaceC7387;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2805() {
        C1481 c1481 = this.f4055;
        AbstractC2115.m2819(AbstractC2115.f4092);
        synchronized (AbstractC2115.f4090) {
            AbstractC2115.f4093 = AbstractC5176.m9353(AbstractC2115.f4093, c1481);
        }
        this.f4059 = new C2102(c1481);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2806(Object obj, InterfaceC7387 interfaceC7387, InterfaceC7372 interfaceC7372) {
        C2059 c2059;
        Object obj2;
        C2113 c2113;
        boolean z;
        C2113 c21132;
        long j;
        long j2;
        C2113 c21133;
        AbstractC2121 c2097;
        long j3;
        C1099 c1099;
        int i;
        long j4;
        C1099 c10992;
        long jM2751 = AbstractC2089.m2751();
        synchronized (this.f4060) {
            c2059 = this.f4053;
            Object[] objArr = c2059.f3866;
            int i2 = c2059.f3865;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((C2113) obj2).f4077 == interfaceC7387) {
                    break;
                } else {
                    i3++;
                }
            }
            c2113 = (C2113) obj2;
            z = true;
            if (c2113 == null) {
                interfaceC7387.getClass();
                AbstractC5220.m9447(1, interfaceC7387);
                c2113 = new C2113(interfaceC7387);
                c2059.m2607(c2113);
            }
            c21132 = this.f4061;
            j = this.f4062;
        }
        Object obj3 = c2059;
        if (j != -1) {
            obj3 = c2059;
            if (j != jM2751) {
                AbstractC2227.m3098("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jM2751 + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.f4060) {
                try {
                    this.f4061 = c2113;
                    this.f4062 = jM2751;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            C1905 c1905 = this.f4054;
            Object obj4 = c2113.f4076;
            C1099 c10993 = c2113.f4075;
            int i4 = c2113.f4074;
            c2113.f4076 = obj;
            c2113.f4075 = (C1099) c2113.f4072.m1317(obj);
            if (c2113.f4074 == -1) {
                c2113.f4074 = Long.hashCode(AbstractC2115.m2840().mo2770());
            }
            C2148 c2148 = c2113.f4083;
            C2059 c2059M3055 = AbstractC2202.m3055();
            try {
                c2059M3055.m2607(c2148);
                if (c1905 == null) {
                    interfaceC7372.invoke();
                    c21133 = c2113;
                } else {
                    AbstractC2121 abstractC2121 = (AbstractC2121) AbstractC2115.f4091.m953();
                    if (abstractC2121 instanceof C2097) {
                        c21133 = c2113;
                        if (((C2097) abstractC2121).f4011 == AbstractC2089.m2751()) {
                            InterfaceC7387 interfaceC73872 = ((C2097) abstractC2121).f4014;
                            InterfaceC7387 interfaceC73873 = ((C2097) abstractC2121).f4012;
                            try {
                                ((C2097) abstractC2121).f4014 = AbstractC2115.m2837(c1905, interfaceC73872, true);
                                ((C2097) abstractC2121).f4012 = interfaceC73873;
                                interfaceC7372.invoke();
                                ((C2097) abstractC2121).f4014 = interfaceC73872;
                                ((C2097) abstractC2121).f4012 = interfaceC73873;
                            } catch (Throwable th2) {
                                ((C2097) abstractC2121).f4014 = interfaceC73872;
                                ((C2097) abstractC2121).f4012 = interfaceC73873;
                                throw th2;
                            }
                        }
                    } else {
                        c21133 = c2113;
                    }
                    if (abstractC2121 == null || (abstractC2121 instanceof C2106)) {
                        c2097 = new C2097(abstractC2121 instanceof C2106 ? (C2106) abstractC2121 : null, c1905, null, true, false);
                    } else {
                        c2097 = abstractC2121.mo2766(c1905);
                    }
                    try {
                        AbstractC2121 abstractC2121M2847 = c2097.m2847();
                        try {
                            interfaceC7372.invoke();
                            AbstractC2121.m2844(abstractC2121M2847);
                            c2097.mo2765();
                        } catch (Throwable th3) {
                            try {
                                AbstractC2121.m2844(abstractC2121M2847);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    c2097.mo2765();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c2059M3055.m2613(c2059M3055.f3865 - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                c2059M3055.m2613(c2059M3055.f3865 - 1);
                C2113 c21134 = c21133;
                Object obj5 = c21134.f4076;
                obj5.getClass();
                int i5 = c21134.f4074;
                C1099 c10994 = c21134.f4075;
                if (c10994 != null) {
                    try {
                        long[] jArr = c10994.f1263;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                C1099 c10995 = c10994;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            c10992 = c10995;
                                            Object obj6 = c10992.f1262[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = c10992.f1261[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    c21134.m2814(obj5, obj6);
                                                }
                                                if (z3) {
                                                    c10992.m1362(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.f4060) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            c10992 = c10995;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        c10995 = c10992;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    c1099 = c10995;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    c1099 = c10995;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                c10994 = c1099;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.f4060) {
                            this.f4061 = c21132;
                            this.f4062 = j2;
                        }
                        throw th;
                    }
                }
                c21134.f4076 = obj4;
                c21134.f4075 = c10993;
                c21134.f4074 = i4;
                synchronized (this.f4060) {
                    this.f4061 = c21132;
                    this.f4062 = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                c2059M3055.m2613(c2059M3055.f3865 - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2807() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f4060) {
            z = this.f4056;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f4057;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC2209.m3066("Unexpected notification");
                        C5043.m9161();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f4060) {
                C2059 c2059 = this.f4053;
                Object[] objArr = c2059.f3866;
                int i = c2059.f3865;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((C2113) objArr[i2]).m2816(set) || z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2808() {
        synchronized (this.f4060) {
            C2059 c2059 = this.f4053;
            Object[] objArr = c2059.f3866;
            int i = c2059.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                C2113 c2113 = (C2113) objArr[i2];
                c2113.f4073.m1314();
                c2113.f4072.m1314();
                c2113.f4082.m1314();
                c2113.f4078.clear();
            }
        }
    }
}
