package androidx.compose.runtime.internal;

import android.text.Layout;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.collection.C0244;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1352;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.compose.ui.text.AbstractC2067;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2049;
import androidx.compose.ui.text.C2050;
import androidx.compose.ui.text.C2057;
import androidx.compose.ui.text.C2064;
import androidx.compose.ui.text.C2066;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.InterfaceC2063;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.fragment.app.C2335;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.load.engine.C3004;
import io.ktor.util.AbstractC4216;
import java.net.InetSocketAddress;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4350;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.impl.km.C4522;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.InterfaceC5296;
import p012.C6164;
import p015.AbstractC6206;
import p015.C6221;
import p017.C6237;
import p022.AbstractC6278;
import p022.C6269;
import p046.InterfaceC6477;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p089.InterfaceC7183;
import p193.C7820;
import p195.AbstractC7833;
import p205.InterfaceC7895;
import p212.AbstractC7947;
import p212.C7941;
import p236.C8090;
import p236.C8098;
import p236.InterfaceC8101;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1245 implements InterfaceC2063, InterfaceC8101, InterfaceC4642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f3616;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f3617;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f3618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3621;

    public C1245(C2068 c2068, C2031 c2031, List list, InterfaceC7895 interfaceC7895, InterfaceC1996 interfaceC1996) {
        int i;
        int i2;
        List list2;
        int i3;
        List list3;
        int i4;
        C2068 c20682 = c2068;
        C2031 c20312 = c2031;
        final int i5 = 1;
        this.f3621 = 1;
        this.f3619 = c20682;
        this.f3620 = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i6 = 0;
        this.f3617 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1245 f6097;

            {
                this.f6097 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i7 = i6;
                Object obj = null;
                int i8 = 1;
                C1245 c1245 = this.f6097;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1245.f3618;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2144 = ((C2066) obj2).f6125.mo2144();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo21442 = ((C2066) obj3).f6125.mo2144();
                                    if (Float.compare(fMo2144, fMo21442) < 0) {
                                        obj2 = obj3;
                                        fMo2144 = fMo21442;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2066 c2066 = (C2066) obj;
                        return Float.valueOf(c2066 != null ? c2066.f6125.mo2144() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1245.f3618;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13398 = ((C2066) obj4).f6125.f21357.m13398();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM133982 = ((C2066) obj5).f6125.f21357.m13398();
                                    if (Float.compare(fM13398, fM133982) < 0) {
                                        obj4 = obj5;
                                        fM13398 = fM133982;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2066 c20662 = (C2066) obj;
                        return Float.valueOf(c20662 != null ? c20662.f6125.f21357.m13398() : 0.0f);
                }
            }
        });
        this.f3616 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1245 f6097;

            {
                this.f6097 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i7 = i5;
                Object obj = null;
                int i8 = 1;
                C1245 c1245 = this.f6097;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1245.f3618;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2144 = ((C2066) obj2).f6125.mo2144();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo21442 = ((C2066) obj3).f6125.mo2144();
                                    if (Float.compare(fMo2144, fMo21442) < 0) {
                                        obj2 = obj3;
                                        fMo2144 = fMo21442;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2066 c2066 = (C2066) obj;
                        return Float.valueOf(c2066 != null ? c2066.f6125.mo2144() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1245.f3618;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13398 = ((C2066) obj4).f6125.f21357.m13398();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM133982 = ((C2066) obj5).f6125.f21357.m13398();
                                    if (Float.compare(fM13398, fM133982) < 0) {
                                        obj4 = obj5;
                                        fM13398 = fM133982;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2066 c20662 = (C2066) obj;
                        return Float.valueOf(c20662 != null ? c20662.f6125.f21357.m13398() : 0.0f);
                }
            }
        });
        C2064 c2064 = c20312.f5982;
        C2068 c20683 = AbstractC2067.f6126;
        ArrayList arrayList = c20682.f6127;
        String str = c20682.f6128;
        List listM8817 = (arrayList == null || (listM8817 = AbstractC4343.m8817(arrayList, new C2049(i5))) == null) ? EmptyList.INSTANCE : listM8817;
        ArrayList arrayList2 = new ArrayList();
        C4350 c4350 = new C4350();
        int size = listM8817.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C2050 c2050 = (C2050) listM8817.get(i7);
            C2050 c20502 = new C2050(c2050.f6073, (14 & 2) != 0 ? c2050.f6075 : i6, (14 & i5) != 0 ? c2050.f6076 : c2064.m3787((C2064) c2050.f6076), (14 & 4) != 0 ? c2050.f6074 : i6);
            while (true) {
                i3 = c20502.f6075;
                if (i8 >= i3 || c4350.isEmpty()) {
                    break;
                }
                C2050 c20503 = (C2050) c4350.last();
                int i9 = c20503.f6074;
                Object obj = c20503.f6076;
                if (i3 < i9) {
                    arrayList2.add(new C2050(obj, i8, i3));
                    i8 = i3;
                } else {
                    arrayList2.add(new C2050(obj, i8, i9));
                    i8 = c20503.f6074;
                    while (!c4350.isEmpty() && i8 == ((C2050) c4350.last()).f6074) {
                        c4350.removeLast();
                    }
                }
            }
            if (i8 < i3) {
                arrayList2.add(new C2050(c2064, i8, i3));
                i8 = i3;
            }
            C2050 c20504 = (C2050) c4350.m8867();
            Object obj2 = c20502.f6076;
            int i10 = c20502.f6074;
            if (c20504 != null) {
                int i11 = c20504.f6074;
                list3 = listM8817;
                Object obj3 = c20504.f6076;
                int i12 = c20504.f6075;
                if (i12 == i3 && i11 == i10) {
                    c4350.removeLast();
                    c4350.addLast(new C2050(((C2064) obj3).m3787((C2064) obj2), i3, i10));
                    i4 = size;
                } else if (i12 == i11) {
                    i4 = size;
                    arrayList2.add(new C2050(obj3, i12, i11));
                    c4350.removeLast();
                    c4350.addLast(new C2050(obj2, i3, i10));
                } else {
                    i4 = size;
                    if (i11 < i10) {
                        C5919.m11245();
                        throw null;
                    }
                    c4350.addLast(new C2050(((C2064) obj3).m3787((C2064) obj2), i3, i10));
                }
            } else {
                list3 = listM8817;
                i4 = size;
                c4350.addLast(new C2050(obj2, i3, i10));
            }
            i7++;
            listM8817 = list3;
            size = i4;
            i5 = 1;
            i6 = 0;
        }
        while (i8 <= str.length() && !c4350.isEmpty()) {
            C2050 c20505 = (C2050) c4350.last();
            Object obj4 = c20505.f6076;
            int i13 = c20505.f6074;
            arrayList2.add(new C2050(obj4, i8, i13));
            while (!c4350.isEmpty() && i13 == ((C2050) c4350.last()).f6074) {
                c4350.removeLast();
            }
            i8 = i13;
        }
        if (i8 < str.length()) {
            arrayList2.add(new C2050(c2064, i8, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C2050(c2064, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            C2050 c20506 = (C2050) arrayList2.get(i14);
            int i15 = c20506.f6075;
            int i16 = c20506.f6074;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listM3793 = AbstractC2067.m3793(c20682, i15, i16, new C2057(1));
            C2068 c20684 = new C2068(strSubstring, listM3793 == null ? EmptyList.INSTANCE : listM3793);
            C2064 c20642 = (C2064) c20506.f6076;
            if (c20642.f6111 == 0) {
                i2 = size2;
                c20642 = new C2064(c20642.f6112, c2064.f6111, c20642.f6110, c20642.f6109, c20642.f6108, c20642.f6107, c20642.f6114, c20642.f6113, c20642.f6115);
            } else {
                i2 = size2;
            }
            C2031 c20313 = new C2031(c20312.f5983, c2064.m3787(c20642));
            List list4 = c20684.f6130;
            List list5 = list4 == null ? EmptyList.INSTANCE : list4;
            List list6 = (List) this.f3620;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                C2050 c20507 = (C2050) list6.get(i17);
                C2064 c20643 = c2064;
                int i18 = c20507.f6075;
                C2031 c20314 = c20313;
                int i19 = c20507.f6074;
                if (AbstractC2067.m3792(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        AbstractC7833.m13170("placeholder can not overlap with paragraph.");
                    }
                    list2 = list6;
                    arrayList4.add(new C2050(c20507.f6076, i18 - i15, i19 - i15));
                } else {
                    list2 = list6;
                }
                i17++;
                c2064 = c20643;
                list6 = list2;
                c20313 = c20314;
            }
            arrayList3.add(new C2066(new C7820(strSubstring, c20313, list5, arrayList4, interfaceC1996, interfaceC7895), i15, i16));
            i14++;
            c20682 = c2068;
            c20312 = c2031;
            size2 = i2;
        }
        this.f3618 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m2140(C1245 c1245, InterfaceC5092 interfaceC5092) {
        c1245.m2151(interfaceC5092, EmptyList.INSTANCE);
    }

    public String toString() {
        switch (this.f3621) {
            case 2:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f3619;
                StringBuilder sb = new StringBuilder("CIOConnectionPoint(uri=");
                sb.append((String) this.f3616);
                sb.append(", method=");
                sb.append((C8098) this.f3618);
                sb.append(", version=");
                sb.append((String) this.f3617);
                sb.append(", localAddress=");
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) this.f3620;
                String hostString = inetSocketAddress2.getHostString();
                if (hostString == null) {
                    hostString = "";
                }
                sb.append(hostString);
                sb.append(", localPort=");
                sb.append(inetSocketAddress2.getPort());
                sb.append(", remoteAddress=");
                String hostString2 = inetSocketAddress.getHostString();
                sb.append(hostString2 != null ? hostString2 : "");
                sb.append(", remotePort=");
                sb.append(inetSocketAddress.getPort());
                sb.append(')');
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder("KmVersionRequirement(kind=");
                KmVersionRequirementVersionKind kmVersionRequirementVersionKind = (KmVersionRequirementVersionKind) this.f3619;
                if (kmVersionRequirementVersionKind == null) {
                    AbstractC4394.m8918("kind");
                    throw null;
                }
                sb2.append(kmVersionRequirementVersionKind);
                sb2.append(", level=");
                KmVersionRequirementLevel kmVersionRequirementLevel = (KmVersionRequirementLevel) this.f3620;
                if (kmVersionRequirementLevel == null) {
                    AbstractC4394.m8918("level");
                    throw null;
                }
                sb2.append(kmVersionRequirementLevel);
                sb2.append(", version=");
                C4522 c4522 = (C4522) this.f3618;
                if (c4522 == null) {
                    AbstractC4394.m8918("version");
                    throw null;
                }
                sb2.append(c4522);
                sb2.append(", errorCode=");
                sb2.append((Integer) this.f3617);
                sb2.append(", message=");
                return AbstractC0053.m155(sb2, (String) this.f3616, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m2141(String str) {
        str.getClass();
        if (AbstractC5138.m10125(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (AbstractC5138.m10125(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        C6221 c6221 = new C6221(0);
        c6221.m11667(null, str);
        this.f3619 = c6221.m11664();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC1352 m2142(AbstractC1246 abstractC1246, InterfaceC6542 interfaceC6542) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.f3619) {
            Throwable th = (Throwable) this.f3620;
            if (th != null) {
                abstractC1246.mo2159(th);
                return C1353.f3922;
            }
            AtomicInt atomicInt = (AtomicInt) this.f3617;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.element = (i2 >>> 27) & 15;
            ((C0244) this.f3616).m774(abstractC1246);
            if (z && interfaceC6542 != null) {
                try {
                    interfaceC6542.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f3619) {
                        try {
                            if (((Throwable) this.f3620) == null) {
                                this.f3620 = th2;
                                C0244 c0244 = (C0244) this.f3616;
                                Object[] objArr = c0244.f1005;
                                int i4 = c0244.f1004;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((AbstractC1246) objArr[i5]).mo2159(th2);
                                }
                                ((C0244) this.f3616).m778();
                                AtomicInt atomicInt2 = (AtomicInt) this.f3617;
                                do {
                                    i3 = atomicInt2.get();
                                } while (!atomicInt2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new C0076(new C0755(abstractC1246, this, ref$IntRef, 3));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo979(C4690 c4690, C4748 c4748) {
        ((C3004) this.f3619).mo979(c4690, c4748);
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo2143() {
        return ((Number) ((InterfaceC5183) this.f3616).getValue()).floatValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo980() {
        ((C3004) this.f3620).mo980();
        C3004 c3004 = (C3004) this.f3617;
        ((HashMap) c3004.f9535).put((C4690) this.f3616, new C4753((InterfaceC6477) AbstractC4343.m8818((ArrayList) this.f3618)));
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float mo2144() {
        return ((Number) ((InterfaceC5183) this.f3617).getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo2145() {
        ArrayList arrayList = (ArrayList) this.f3618;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C2066) arrayList.get(i)).f6125.mo2145()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m2146(String str, String str2) {
        str2.getClass();
        C1562 c1562 = (C1562) this.f3617;
        c1562.getClass();
        AbstractC3065.m6819(str);
        AbstractC3065.m6818(str2, str);
        c1562.m2834(str);
        AbstractC3065.m6839(c1562, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7183 m2147(InterfaceC5092 interfaceC5092, Object obj) {
        interfaceC5092.getClass();
        obj.getClass();
        if (interfaceC5092.isInstance(obj)) {
            Map map = (Map) ((Map) this.f3620).get(interfaceC5092);
            InterfaceC7183 interfaceC7183 = map != null ? (InterfaceC7183) map.get(AbstractC4395.f12971.mo8927(obj.getClass())) : null;
            InterfaceC7183 interfaceC71832 = interfaceC7183 instanceof InterfaceC7183 ? interfaceC7183 : null;
            if (interfaceC71832 != null) {
                return interfaceC71832;
            }
            Object obj2 = ((Map) this.f3617).get(interfaceC5092);
            InterfaceC6557 interfaceC6557 = AbstractC4387.m8904(1, obj2) ? (InterfaceC6557) obj2 : null;
            if (interfaceC6557 != null) {
                return (InterfaceC7183) interfaceC6557.invoke(obj);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m2148(String str, AbstractC6206 abstractC6206) {
        str.getClass();
        if (str.length() <= 0) {
            C5919.m11249("method.isEmpty() == true");
            return;
        }
        if (abstractC6206 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C5919.m11253(AbstractC0053.m156("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC3064.m6786(str)) {
            C5919.m11253(AbstractC0053.m156("method ", str, " must not have a request body."));
            return;
        }
        this.f3620 = str;
        this.f3616 = abstractC6206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m2149(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.f3619).put(str, obj);
        InterfaceC5296 interfaceC5296 = (InterfaceC5296) ((LinkedHashMap) this.f3617).get(str);
        if (interfaceC5296 != null) {
            ((C5266) interfaceC5296).m10309(obj);
        }
        InterfaceC5296 interfaceC52962 = (InterfaceC5296) ((LinkedHashMap) this.f3616).get(str);
        if (interfaceC52962 != null) {
            ((C5266) interfaceC52962).m10309(obj);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public InterfaceC4643 mo983(C4690 c4690) {
        return ((C3004) this.f3619).mo983(c4690);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int m2150(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f3619).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC4394.m8915(cCharAt, 8192) < 0 || AbstractC4394.m8915(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2151(InterfaceC5092 interfaceC5092, List list) {
        list.getClass();
        if (((Map) this.f3619).get(interfaceC5092) == null) {
            return;
        }
        C2941.m6336();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int m2152(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f3620;
        int iM13669 = AbstractC8189.m13669(arrayList, Integer.valueOf(i));
        int i2 = iM13669 < 0 ? -(iM13669 + 1) : iM13669 + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int m2153(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f3620).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float m2154(int i, boolean z) {
        Layout layout = (Layout) this.f3619;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float m2155(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f3619;
        if (!z2) {
            return m2154(i, z);
        }
        int iM13404 = AbstractC7947.m13404(layout, i, z2);
        int lineStart = layout.getLineStart(iM13404);
        int lineEnd = layout.getLineEnd(iM13404);
        if (i != lineStart && i != lineEnd) {
            return m2154(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m2154(i, z);
        }
        int iM2152 = m2152(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m2153(iM2152))) == -1;
        int iM2150 = m2150(lineEnd, lineStart);
        int iM2153 = m2153(iM2152);
        int i4 = lineStart - iM2153;
        int i5 = iM2150 - iM2153;
        Bidi bidiM2157 = m2157(iM2152);
        Bidi bidiCreateLineBidi = bidiM2157 != null ? bidiM2157.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM13404) : layout.getLineRight(iM13404);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C7941[] c7941Arr = new C7941[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            c7941Arr[i6] = new C7941(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, c7941Arr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c7941Arr[i8].f21989 == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == c7941Arr[i3].f21987) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iM13404) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(c7941Arr[i3 - 1].f21989) : layout.getPrimaryHorizontal(c7941Arr[i3 + 1].f21989) : layout.getLineRight(iM13404);
        }
        int iM21502 = i > iM2150 ? m2150(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (c7941Arr[i9].f21988 == iM21502) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == c7941Arr[i2].f21987) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iM13404) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(c7941Arr[i2 - 1].f21988) : layout.getPrimaryHorizontal(c7941Arr[i2 + 1].f21988) : layout.getLineRight(iM13404);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo987(C4690 c4690, Object obj) {
        ((C3004) this.f3619).mo987(c4690, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2156(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((C1562) this.f3617).m2830(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi m2157(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3619
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f3620
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f3617
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f3616
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f3618
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.m2153(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f3618
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f3618 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.internal.C1245.m2157(int):java.text.Bidi");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2158(InterfaceC6557 interfaceC6557) {
        int i;
        synchronized (this.f3619) {
            try {
                C0244 c0244 = (C0244) this.f3616;
                this.f3616 = (C0244) this.f3618;
                this.f3618 = c0244;
                AtomicInt atomicInt = (AtomicInt) this.f3617;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c0244.f1004;
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC6557.invoke(c0244.m880(i3));
                }
                c0244.m778();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC4642 mo989(C4687 c4687, C4690 c4690) {
        return ((C3004) this.f3619).mo989(c4687, c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo990(C4690 c4690, C4687 c4687, C4690 c46902) {
        ((C3004) this.f3619).mo990(c4690, c4687, c46902);
    }

    public C1245(Map map) {
        this.f3621 = 9;
        this.f3619 = new LinkedHashMap(map);
        this.f3620 = new LinkedHashMap();
        this.f3617 = new LinkedHashMap();
        this.f3616 = new LinkedHashMap();
        this.f3618 = new C2335(this, 2);
    }

    public C1245(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f3621 = 5;
        this.f3619 = map;
        this.f3620 = map2;
        this.f3617 = map3;
        this.f3616 = map4;
        this.f3618 = map5;
    }

    public C1245(int i) {
        this.f3621 = i;
        switch (i) {
            case 3:
                break;
            case 6:
                this.f3618 = C6237.f17188;
                this.f3620 = "GET";
                this.f3617 = new C1562(6, false);
                break;
            case 8:
                this.f3618 = new Class[0];
                break;
            default:
                this.f3619 = new Object();
                this.f3617 = new AtomicInt(0);
                this.f3616 = new C0244();
                this.f3618 = new C0244();
                break;
        }
    }

    public C1245(Layout layout) {
        this.f3621 = 10;
        this.f3619 = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM10151 = AbstractC5143.m10151(((Layout) this.f3619).getText(), '\n', length, 4);
            length = iM10151 < 0 ? ((Layout) this.f3619).getText().length() : iM10151 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f3619).getText().length());
        this.f3620 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f3617 = arrayList2;
        this.f3616 = new boolean[((ArrayList) this.f3620).size()];
        ((ArrayList) this.f3620).size();
    }

    public /* synthetic */ C1245(boolean z) {
        this.f3621 = 6;
    }

    public C1245(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2, C8098 c8098) {
        this.f3621 = 2;
        str.getClass();
        str2.getClass();
        this.f3619 = inetSocketAddress;
        this.f3620 = inetSocketAddress2;
        this.f3617 = str;
        this.f3616 = str2;
        this.f3618 = c8098;
        C8090 c8090 = C8090.f22322;
        String strM8641 = AbstractC4216.m8641("http");
        if (((C8090) C8090.f22321.get(strM8641)) == null) {
            new C8090(strM8641, 0);
        }
    }

    public C1245(C3004 c3004, C3004 c30042, C4690 c4690, ArrayList arrayList) {
        this.f3621 = 4;
        this.f3620 = c3004;
        this.f3617 = c30042;
        this.f3616 = c4690;
        this.f3618 = arrayList;
        this.f3619 = c3004;
    }

    public C1245(C6164 c6164) {
        this.f3621 = 7;
        c6164.getClass();
        this.f3619 = c6164;
        this.f3616 = AbstractC6278.f17310;
        this.f3618 = C6269.f17272;
    }
}
