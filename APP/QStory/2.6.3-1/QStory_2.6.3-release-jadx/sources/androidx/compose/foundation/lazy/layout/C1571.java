package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0956;
import androidx.collection.C1083;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.p001ui.layout.C2496;
import androidx.compose.p001ui.layout.C2497;
import androidx.compose.p001ui.layout.C2500;
import androidx.compose.p001ui.layout.C2554;
import androidx.compose.p001ui.layout.InterfaceC2553;
import androidx.compose.runtime.C2226;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.AbstractC5990;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p192.AbstractC8570;
import p221.C8727;
import p321.C9452;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 implements InterfaceC1538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2497 f2389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC2553 f2390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8727 f2391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f2392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0955 f2393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long f2395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f2396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f2397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1575 f2398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f2400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2401;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2402;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2403;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1572 f2404;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2405;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f2406;

    public C1571(C1575 c1575, int i, C0955 c0955, InterfaceC7387 interfaceC7387) {
        this.f2398 = c1575;
        this.f2394 = i;
        this.f2393 = c0955;
        this.f2392 = interfaceC7387;
        int i2 = AbstractC5990.f15060;
        this.f2400 = System.nanoTime() - AbstractC5990.f15061;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1538
    public final void cancel() {
        if (this.f2401) {
            return;
        }
        this.f2401 = true;
        m2093();
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f2394 + ", constraints = " + this.f2391 + ", isComposed = " + m2090() + ", isMeasured = " + this.f2402 + ", isCanceled = " + this.f2401 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2089(Object obj, Object obj2, C1546 c1546) {
        C2497 c2497;
        C2497 c24972 = this.f2389;
        int i = 0;
        if (c24972 == null) {
            C1575 c1575 = this.f2398;
            InterfaceC7383 interfaceC7383M2067 = ((C1552) c1575.f2416).m2067(obj, this.f2394, obj2);
            C2496 c2496M3696 = ((C2554) c1575.f2415).m3696();
            if (c2496M3696.f5219.m3803()) {
                c2496M3696.m3629(obj, interfaceC7383M2067, true);
                c2497 = new C2497(c2496M3696, obj, 1);
            } else {
                c2497 = new C2497(c2496M3696, obj, i);
            }
            c24972 = c2497;
            this.f2389 = c24972;
            this.f2406 = obj;
        }
        this.f2397 = false;
        while (!c24972.m3634() && !this.f2397) {
            C1520 c1520 = new C1520(this, i, c1546);
            switch (c24972.f5222) {
                case 0:
                    break;
                default:
                    C2500 c2500M3635 = c24972.m3635();
                    C2226 c2226 = c2500M3635 != null ? c2500M3635.f5226 : null;
                    if (c2226 != null && !c2226.m3094()) {
                        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
                        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
                        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
                        try {
                            c2226.m3092(c1520);
                        } finally {
                        }
                    }
                    break;
            }
        }
        m2094();
        boolean z = this.f2397;
        long j = this.f2399;
        if (z) {
            c1546.f2330 = C1546.m2063(j, c1546.f2330);
        } else {
            c1546.f2331 = C1546.m2063(j, c1546.f2331);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2090() {
        C2497 c2497;
        return this.f2405 || ((c2497 = this.f2389) != null && c2497.m3634());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2091(C0956 c0956) {
        long j;
        int i;
        ?? r10;
        List list;
        InterfaceC2553 interfaceC2553M3623;
        int i2 = this.f2394;
        long j2 = i2;
        AbstractC3889.m7293(j2, "compose:lazy:prefetch:execute:item");
        C1603 c1603 = (C1603) ((C1552) this.f2398.f2416).f2350.invoke();
        if (!this.f2401) {
            int iM2131 = c1603.m2131();
            if (i2 >= 0 && i2 < iM2131) {
                Object objM2130 = c1603.m2130(i2);
                Object obj = this.f2406;
                if (obj != null && !objM2130.equals(obj)) {
                    m2093();
                    return false;
                }
                Object objM2132 = c1603.m2132(i2);
                C0955 c0955 = this.f2393;
                C1546 c1546 = (C1546) c0955.f663;
                if (c0955.f665 != objM2132 || c1546 == null) {
                    C1083 c1083 = (C1083) c0955.f664;
                    Object objM1317 = c1083.m1317(objM2132);
                    Object obj2 = objM1317;
                    if (objM1317 == null) {
                        C1546 c15462 = new C1546();
                        c15462.f2327 = -1;
                        c1083.m1315(objM2132, c15462);
                        obj2 = c15462;
                    }
                    c1546 = (C1546) obj2;
                    c0955.f665 = objM2132;
                    c0955.f663 = c1546;
                }
                m2090();
                long jM965 = c0956.m965();
                this.f2395 = jM965;
                int i3 = AbstractC5990.f15060;
                this.f2400 = System.nanoTime() - AbstractC5990.f15061;
                this.f2399 = 0L;
                AbstractC3889.m7293(jM965, "compose:lazy:prefetch:available_time_nanos");
                if (m2090()) {
                    j = 0;
                } else {
                    j = 0;
                    if (m2095(this.f2395, c1546.f2331 + c1546.f2330)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m2089(objM2130, objM2132, c1546);
                        } finally {
                        }
                    }
                    if (!m2090()) {
                        return true;
                    }
                }
                if (this.f2389 != null) {
                    if (!m2095(this.f2395, c1546.f2329)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        C2497 c2497 = this.f2389;
                        if (c2497 == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (c2497.f5222) {
                            case 0:
                                interfaceC2553M3623 = c2497.f5221.m3623(c2497.f5220);
                                break;
                            default:
                                C2496 c2496 = c2497.f5221;
                                C2500 c2500M3635 = c2497.m3635();
                                if (c2500M3635 != null) {
                                    c2496.m3624(c2500M3635, false);
                                }
                                interfaceC2553M3623 = c2496.m3623(c2497.f5220);
                                break;
                        }
                        this.f2390 = interfaceC2553M3623;
                        this.f2389 = null;
                        this.f2405 = true;
                        Trace.endSection();
                        m2094();
                        c1546.f2329 = C1546.m2063(this.f2399, c1546.f2329);
                    } finally {
                    }
                }
                int i4 = 4;
                if (!this.f2403) {
                    if (this.f2395 <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        InterfaceC2553 interfaceC2553 = this.f2390;
                        if (interfaceC2553 != null) {
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            interfaceC2553.mo3677(new C1564(ref$ObjectRef, i4));
                            List list2 = (List) ref$ObjectRef.element;
                            C1572 c1572 = list2 != null ? new C1572(this, list2) : null;
                            this.f2404 = c1572;
                            this.f2403 = true;
                        } else {
                            AbstractC8570.m13655("Should precompose before resolving nested prefetch states");
                            C5043.m9161();
                        }
                        this.f2404 = c1572;
                        this.f2403 = true;
                    } finally {
                    }
                }
                C1572 c15722 = this.f2404;
                if (c15722 != null) {
                    int i5 = c1546.f2327;
                    boolean z = this.f2396;
                    List[] listArr = c15722.f2411;
                    int i6 = c15722.f2410;
                    List list3 = c15722.f2412;
                    if (i6 < list3.size()) {
                        if (c15722.f2407.f2401) {
                            AbstractC8570.m13654("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((C1537) list3.get(i7)).f2303 = i5;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (c15722.f2410 < list3.size()) {
                                try {
                                    if (listArr[c15722.f2410] != null) {
                                        i = i4;
                                    } else {
                                        if (c0956.m965() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i8 = c15722.f2410;
                                        C1537 c1537 = (C1537) list3.get(i8);
                                        InterfaceC7387 interfaceC7387 = c1537.f2306;
                                        if (interfaceC7387 == null) {
                                            list = EmptyList.INSTANCE;
                                            i = i4;
                                        } else {
                                            i = i4;
                                            C1539 c1539 = new C1539(c1537, c1537.f2303);
                                            interfaceC7387.invoke(c1539);
                                            ArrayList arrayList = c1539.f2308;
                                            c1537.f2301 = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i8] = list;
                                    }
                                    List list4 = listArr[c15722.f2410];
                                    list4.getClass();
                                    while (c15722.f2409 < list4.size()) {
                                        C1571 c1571 = (C1571) list4.get(c15722.f2409);
                                        if (z) {
                                            C1571 c15712 = c1571 != null ? c1571 : null;
                                            if (c15712 != null) {
                                                r10 = 1;
                                                c15712.f2396 = true;
                                            }
                                        } else {
                                            r10 = 1;
                                        }
                                        c15722.f2408 = r10;
                                        if (c1571.m2092(c0956)) {
                                            return r10;
                                        }
                                        c15722.f2409 += r10;
                                    }
                                    c15722.f2409 = 0;
                                    c15722.f2410++;
                                    i4 = i;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                C1572 c15723 = this.f2404;
                if (c15723 != null && c15723.f2408) {
                    m2094();
                    AbstractC3889.m7293(j2, "compose:lazy:prefetch:execute:item");
                    C1572 c15724 = this.f2404;
                    if (c15724 != null) {
                        c15724.f2408 = false;
                    }
                }
                C8727 c8727 = this.f2391;
                if (!this.f2402 && c8727 != null) {
                    if (!m2095(this.f2395, c1546.f2328)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = c8727.f22210;
                        if (this.f2401) {
                            AbstractC8570.m13656("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f2402) {
                            AbstractC8570.m13656("Request was already measured!");
                        }
                        this.f2402 = true;
                        InterfaceC2553 interfaceC25532 = this.f2390;
                        if (interfaceC25532 != null) {
                            int iMo3676 = interfaceC25532.mo3676();
                            for (int i9 = 0; i9 < iMo3676; i9++) {
                                interfaceC25532.mo3675(i9, j3);
                            }
                        } else {
                            AbstractC8570.m13655("performComposition() must be called before performMeasure()");
                            C5043.m9161();
                        }
                        Trace.endSection();
                        m2094();
                        c1546.f2328 = C1546.m2063(this.f2399, c1546.f2328);
                        InterfaceC7387 interfaceC73872 = this.f2392;
                        if (interfaceC73872 != null) {
                            interfaceC73872.invoke(this);
                        }
                    } finally {
                    }
                }
                C1572 c15725 = this.f2404;
                if (this.f2402 && this.f2403 && c15725 != null) {
                    List list5 = c15725.f2412;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < size2; i10++) {
                        iMin = Math.min(iMin, ((C1537) list5.get(i10)).f2302);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i11 = c1546.f2327;
                    c1546.f2327 = i11 == -1 ? iMin : ((i11 * 3) + iMin) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i12 = 0; i12 < size3; i12++) {
                        iMin2 = Math.min(iMin2, ((C1537) list5.get(i12)).f2301);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        c1546.f2328 = j;
                    }
                }
                return false;
            }
        }
        m2093();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2092(C0956 c0956) {
        boolean zM2091;
        if (!this.f2398.f2417) {
            return false;
        }
        if (this.f2396) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM2091 = m2091(c0956);
            } finally {
                Trace.endSection();
            }
        } else {
            zM2091 = m2091(c0956);
        }
        AbstractC3889.m7293(-1L, "compose:lazy:prefetch:execute:item");
        return zM2091;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2093() {
        C2497 c2497 = this.f2389;
        if (c2497 != null) {
            switch (c2497.f5222) {
                case 0:
                    break;
                default:
                    C2500 c2500M3635 = c2497.m3635();
                    if ((c2500M3635 != null ? c2500M3635.f5226 : null) != null) {
                        C2496.m3622(c2497.f5221, c2497.f5220);
                    }
                    break;
            }
        }
        this.f2389 = null;
        InterfaceC2553 interfaceC2553 = this.f2390;
        if (interfaceC2553 != null) {
            interfaceC2553.dispose();
        }
        this.f2390 = null;
        this.f2404 = null;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1538
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2058() {
        this.f2396 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2094() {
        int i = AbstractC5990.f15060;
        long jNanoTime = System.nanoTime() - AbstractC5990.f15061;
        long j = this.f2400;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        durationUnit.getClass();
        long jM10766 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                C9452 c9452 = C5989.f15057;
            } else {
                jM10766 = C5989.m10752(j < 0 ? C5989.f15056 : C5989.f15058);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jM10766 = jNanoTime < 0 ? C5989.f15056 : C5989.f15058;
        } else {
            long j2 = jNanoTime - j;
            if (((~(j2 ^ j)) & (j2 ^ jNanoTime)) < 0) {
                DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                if (durationUnit.compareTo(durationUnit2) < 0) {
                    durationUnit2.getClass();
                    long jConvert = durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
                    long j3 = (jNanoTime / jConvert) - (j / jConvert);
                    long j4 = (jNanoTime % jConvert) - (j % jConvert);
                    C9452 c94522 = C5989.f15057;
                    jM10766 = C5989.m10753(AbstractC5992.m10766(j3, durationUnit2), AbstractC5992.m10766(j4, durationUnit));
                } else {
                    jM10766 = C5989.m10752(j2 < 0 ? C5989.f15056 : C5989.f15058);
                }
            } else {
                jM10766 = AbstractC5992.m10766(j2, durationUnit);
            }
        }
        long j5 = jM10766 >> 1;
        C9452 c94523 = C5989.f15057;
        long j6 = (1 & ((int) jM10766)) == 0 ? j5 : j5 > 9223372036854L ? Long.MAX_VALUE : j5 < -9223372036854L ? Long.MIN_VALUE : j5 * 1000000;
        this.f2399 = j6;
        long j7 = this.f2395 - j6;
        this.f2395 = j7;
        this.f2400 = jNanoTime;
        AbstractC3889.m7293(j7, "compose:lazy:prefetch:available_time_nanos");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m2095(long j, long j2) {
        if (this.f2396) {
            j2 = 0;
        }
        return j > j2;
    }
}
