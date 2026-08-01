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
import com.alibaba.fastjson2.C2942;
import com.bumptech.glide.load.engine.C3005;
import io.ktor.util.AbstractC4217;
import java.net.InetSocketAddress;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4351;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.km.C4523;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.flow.C5267;
import kotlinx.coroutines.flow.InterfaceC5297;
import p007.AbstractC6133;
import p007.C6148;
import p013.C6229;
import p015.C6234;
import p019.AbstractC6274;
import p019.C6265;
import p034.AbstractC6347;
import p046.InterfaceC6478;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p089.InterfaceC7184;
import p175.AbstractC7739;
import p193.C7821;
import p195.AbstractC7834;
import p205.InterfaceC7896;
import p212.AbstractC7948;
import p212.C7942;
import p236.C8091;
import p236.C8099;
import p236.InterfaceC8102;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1245 implements InterfaceC2063, InterfaceC8102, InterfaceC4643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f3617;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f3618;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f3619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3622;

    public C1245(C2068 c2068, C2031 c2031, List list, InterfaceC7896 interfaceC7896, InterfaceC1996 interfaceC1996) {
        int i;
        int i2;
        List list2;
        int i3;
        List list3;
        int i4;
        C2068 c20682 = c2068;
        C2031 c20312 = c2031;
        final int i5 = 1;
        this.f3622 = 1;
        this.f3620 = c20682;
        this.f3621 = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i6 = 0;
        this.f3618 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1245 f6098;

            {
                this.f6098 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i7 = i6;
                Object obj = null;
                int i8 = 1;
                C1245 c1245 = this.f6098;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1245.f3619;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2154 = ((C2066) obj2).f6126.mo2154();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo21542 = ((C2066) obj3).f6126.mo2154();
                                    if (Float.compare(fMo2154, fMo21542) < 0) {
                                        obj2 = obj3;
                                        fMo2154 = fMo21542;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2066 c2066 = (C2066) obj;
                        return Float.valueOf(c2066 != null ? c2066.f6126.mo2154() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1245.f3619;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13426 = ((C2066) obj4).f6126.f21354.m13426();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM134262 = ((C2066) obj5).f6126.f21354.m13426();
                                    if (Float.compare(fM13426, fM134262) < 0) {
                                        obj4 = obj5;
                                        fM13426 = fM134262;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2066 c20662 = (C2066) obj;
                        return Float.valueOf(c20662 != null ? c20662.f6126.f21354.m13426() : 0.0f);
                }
            }
        });
        this.f3617 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1245 f6098;

            {
                this.f6098 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i7 = i5;
                Object obj = null;
                int i8 = 1;
                C1245 c1245 = this.f6098;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1245.f3619;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2154 = ((C2066) obj2).f6126.mo2154();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo21542 = ((C2066) obj3).f6126.mo2154();
                                    if (Float.compare(fMo2154, fMo21542) < 0) {
                                        obj2 = obj3;
                                        fMo2154 = fMo21542;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2066 c2066 = (C2066) obj;
                        return Float.valueOf(c2066 != null ? c2066.f6126.mo2154() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1245.f3619;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13426 = ((C2066) obj4).f6126.f21354.m13426();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM134262 = ((C2066) obj5).f6126.f21354.m13426();
                                    if (Float.compare(fM13426, fM134262) < 0) {
                                        obj4 = obj5;
                                        fM13426 = fM134262;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2066 c20662 = (C2066) obj;
                        return Float.valueOf(c20662 != null ? c20662.f6126.f21354.m13426() : 0.0f);
                }
            }
        });
        C2064 c2064 = c20312.f5983;
        C2068 c20683 = AbstractC2067.f6127;
        ArrayList arrayList = c20682.f6128;
        String str = c20682.f6129;
        List listM8778 = (arrayList == null || (listM8778 = AbstractC4344.m8778(arrayList, new C2049(i5))) == null) ? EmptyList.INSTANCE : listM8778;
        ArrayList arrayList2 = new ArrayList();
        C4351 c4351 = new C4351();
        int size = listM8778.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C2050 c2050 = (C2050) listM8778.get(i7);
            C2050 c20502 = new C2050(c2050.f6074, (14 & 2) != 0 ? c2050.f6076 : i6, (14 & i5) != 0 ? c2050.f6077 : c2064.m3797((C2064) c2050.f6077), (14 & 4) != 0 ? c2050.f6075 : i6);
            while (true) {
                i3 = c20502.f6076;
                if (i8 >= i3 || c4351.isEmpty()) {
                    break;
                }
                C2050 c20503 = (C2050) c4351.last();
                int i9 = c20503.f6075;
                Object obj = c20503.f6077;
                if (i3 < i9) {
                    arrayList2.add(new C2050(obj, i8, i3));
                    i8 = i3;
                } else {
                    arrayList2.add(new C2050(obj, i8, i9));
                    i8 = c20503.f6075;
                    while (!c4351.isEmpty() && i8 == ((C2050) c4351.last()).f6075) {
                        c4351.removeLast();
                    }
                }
            }
            if (i8 < i3) {
                arrayList2.add(new C2050(c2064, i8, i3));
                i8 = i3;
            }
            C2050 c20504 = (C2050) c4351.m8857();
            Object obj2 = c20502.f6077;
            int i10 = c20502.f6075;
            if (c20504 != null) {
                int i11 = c20504.f6075;
                list3 = listM8778;
                Object obj3 = c20504.f6077;
                int i12 = c20504.f6076;
                if (i12 == i3 && i11 == i10) {
                    c4351.removeLast();
                    c4351.addLast(new C2050(((C2064) obj3).m3797((C2064) obj2), i3, i10));
                    i4 = size;
                } else if (i12 == i11) {
                    i4 = size;
                    arrayList2.add(new C2050(obj3, i12, i11));
                    c4351.removeLast();
                    c4351.addLast(new C2050(obj2, i3, i10));
                } else {
                    i4 = size;
                    if (i11 < i10) {
                        C5925.m11306();
                        throw null;
                    }
                    c4351.addLast(new C2050(((C2064) obj3).m3797((C2064) obj2), i3, i10));
                }
            } else {
                list3 = listM8778;
                i4 = size;
                c4351.addLast(new C2050(obj2, i3, i10));
            }
            i7++;
            listM8778 = list3;
            size = i4;
            i5 = 1;
            i6 = 0;
        }
        while (i8 <= str.length() && !c4351.isEmpty()) {
            C2050 c20505 = (C2050) c4351.last();
            Object obj4 = c20505.f6077;
            int i13 = c20505.f6075;
            arrayList2.add(new C2050(obj4, i8, i13));
            while (!c4351.isEmpty() && i13 == ((C2050) c4351.last()).f6075) {
                c4351.removeLast();
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
            int i15 = c20506.f6076;
            int i16 = c20506.f6075;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listM3803 = AbstractC2067.m3803(c20682, i15, i16, new C2057(1));
            C2068 c20684 = new C2068(strSubstring, listM3803 == null ? EmptyList.INSTANCE : listM3803);
            C2064 c20642 = (C2064) c20506.f6077;
            if (c20642.f6112 == 0) {
                i2 = size2;
                c20642 = new C2064(c20642.f6113, c2064.f6112, c20642.f6111, c20642.f6110, c20642.f6109, c20642.f6108, c20642.f6115, c20642.f6114, c20642.f6116);
            } else {
                i2 = size2;
            }
            C2031 c20313 = new C2031(c20312.f5984, c2064.m3797(c20642));
            List list4 = c20684.f6131;
            List list5 = list4 == null ? EmptyList.INSTANCE : list4;
            List list6 = (List) this.f3621;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                C2050 c20507 = (C2050) list6.get(i17);
                C2064 c20643 = c2064;
                int i18 = c20507.f6076;
                C2031 c20314 = c20313;
                int i19 = c20507.f6075;
                if (AbstractC2067.m3802(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        AbstractC7834.m13198("placeholder can not overlap with paragraph.");
                    }
                    list2 = list6;
                    arrayList4.add(new C2050(c20507.f6077, i18 - i15, i19 - i15));
                } else {
                    list2 = list6;
                }
                i17++;
                c2064 = c20643;
                list6 = list2;
                c20313 = c20314;
            }
            arrayList3.add(new C2066(new C7821(strSubstring, c20313, list5, arrayList4, interfaceC1996, interfaceC7896), i15, i16));
            i14++;
            c20682 = c2068;
            c20312 = c2031;
            size2 = i2;
        }
        this.f3619 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m2150(C1245 c1245, InterfaceC5093 interfaceC5093) {
        c1245.m2161(interfaceC5093, EmptyList.INSTANCE);
    }

    public String toString() {
        switch (this.f3622) {
            case 2:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f3620;
                StringBuilder sb = new StringBuilder("CIOConnectionPoint(uri=");
                sb.append((String) this.f3617);
                sb.append(", method=");
                sb.append((C8099) this.f3619);
                sb.append(", version=");
                sb.append((String) this.f3618);
                sb.append(", localAddress=");
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) this.f3621;
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
                KmVersionRequirementVersionKind kmVersionRequirementVersionKind = (KmVersionRequirementVersionKind) this.f3620;
                if (kmVersionRequirementVersionKind == null) {
                    AbstractC4395.m8908("kind");
                    throw null;
                }
                sb2.append(kmVersionRequirementVersionKind);
                sb2.append(", level=");
                KmVersionRequirementLevel kmVersionRequirementLevel = (KmVersionRequirementLevel) this.f3621;
                if (kmVersionRequirementLevel == null) {
                    AbstractC4395.m8908("level");
                    throw null;
                }
                sb2.append(kmVersionRequirementLevel);
                sb2.append(", version=");
                C4523 c4523 = (C4523) this.f3619;
                if (c4523 == null) {
                    AbstractC4395.m8908("version");
                    throw null;
                }
                sb2.append(c4523);
                sb2.append(", errorCode=");
                sb2.append((Integer) this.f3618);
                sb2.append(", message=");
                return AbstractC0053.m148(sb2, (String) this.f3617, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m2151(String str) {
        str.getClass();
        if (AbstractC5139.m10139(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (AbstractC5139.m10139(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        C6148 c6148 = new C6148(0);
        c6148.m11538(null, str);
        this.f3620 = c6148.m11535();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC1352 m2152(AbstractC1246 abstractC1246, InterfaceC6543 interfaceC6543) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.f3620) {
            Throwable th = (Throwable) this.f3621;
            if (th != null) {
                abstractC1246.mo2169(th);
                return C1353.f3923;
            }
            AtomicInt atomicInt = (AtomicInt) this.f3618;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.element = (i2 >>> 27) & 15;
            ((C0244) this.f3617).m775(abstractC1246);
            if (z && interfaceC6543 != null) {
                try {
                    interfaceC6543.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f3620) {
                        try {
                            if (((Throwable) this.f3621) == null) {
                                this.f3621 = th2;
                                C0244 c0244 = (C0244) this.f3617;
                                Object[] objArr = c0244.f1005;
                                int i4 = c0244.f1004;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((AbstractC1246) objArr[i5]).mo2169(th2);
                                }
                                ((C0244) this.f3617).m779();
                                AtomicInt atomicInt2 = (AtomicInt) this.f3618;
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

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo981(C4691 c4691, C4749 c4749) {
        ((C3005) this.f3620).mo981(c4691, c4749);
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo2153() {
        return ((Number) ((InterfaceC5184) this.f3617).getValue()).floatValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo982() {
        ((C3005) this.f3621).mo982();
        C3005 c3005 = (C3005) this.f3618;
        ((HashMap) c3005.f9537).put((C4691) this.f3617, new C4754((InterfaceC6478) AbstractC4344.m8779((ArrayList) this.f3619)));
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float mo2154() {
        return ((Number) ((InterfaceC5184) this.f3618).getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.InterfaceC2063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo2155() {
        ArrayList arrayList = (ArrayList) this.f3619;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C2066) arrayList.get(i)).f6126.mo2155()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m2156(String str, String str2) {
        str2.getClass();
        C1562 c1562 = (C1562) this.f3618;
        c1562.getClass();
        AbstractC7739.m13058(str);
        AbstractC7739.m13057(str2, str);
        c1562.m2844(str);
        AbstractC7739.m13082(c1562, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7184 m2157(InterfaceC5093 interfaceC5093, Object obj) {
        interfaceC5093.getClass();
        obj.getClass();
        if (interfaceC5093.isInstance(obj)) {
            Map map = (Map) ((Map) this.f3621).get(interfaceC5093);
            InterfaceC7184 interfaceC7184 = map != null ? (InterfaceC7184) map.get(AbstractC4396.f12975.mo8917(obj.getClass())) : null;
            InterfaceC7184 interfaceC71842 = interfaceC7184 instanceof InterfaceC7184 ? interfaceC7184 : null;
            if (interfaceC71842 != null) {
                return interfaceC71842;
            }
            Object obj2 = ((Map) this.f3618).get(interfaceC5093);
            InterfaceC6558 interfaceC6558 = AbstractC4388.m8894(1, obj2) ? (InterfaceC6558) obj2 : null;
            if (interfaceC6558 != null) {
                return (InterfaceC7184) interfaceC6558.invoke(obj);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m2158(String str, AbstractC6133 abstractC6133) {
        str.getClass();
        if (str.length() <= 0) {
            C5925.m11310("method.isEmpty() == true");
            return;
        }
        if (abstractC6133 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C5925.m11314(AbstractC0053.m158("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC4922.m9875(str)) {
            C5925.m11314(AbstractC0053.m158("method ", str, " must not have a request body."));
            return;
        }
        this.f3621 = str;
        this.f3617 = abstractC6133;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m2159(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.f3620).put(str, obj);
        InterfaceC5297 interfaceC5297 = (InterfaceC5297) ((LinkedHashMap) this.f3618).get(str);
        if (interfaceC5297 != null) {
            ((C5267) interfaceC5297).m10313(obj);
        }
        InterfaceC5297 interfaceC52972 = (InterfaceC5297) ((LinkedHashMap) this.f3617).get(str);
        if (interfaceC52972 != null) {
            ((C5267) interfaceC52972).m10313(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int m2160(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f3620).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC4395.m8905(cCharAt, 8192) < 0 || AbstractC4395.m8905(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public InterfaceC4644 mo984(C4691 c4691) {
        return ((C3005) this.f3620).mo984(c4691);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2161(InterfaceC5093 interfaceC5093, List list) {
        list.getClass();
        if (((Map) this.f3620).get(interfaceC5093) == null) {
            return;
        }
        C2942.m6394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int m2162(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f3621;
        int iM11913 = AbstractC6347.m11913(arrayList, Integer.valueOf(i));
        int i2 = iM11913 < 0 ? -(iM11913 + 1) : iM11913 + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int m2163(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f3621).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float m2164(int i, boolean z) {
        Layout layout = (Layout) this.f3620;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float m2165(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f3620;
        if (!z2) {
            return m2164(i, z);
        }
        int iM13432 = AbstractC7948.m13432(layout, i, z2);
        int lineStart = layout.getLineStart(iM13432);
        int lineEnd = layout.getLineEnd(iM13432);
        if (i != lineStart && i != lineEnd) {
            return m2164(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m2164(i, z);
        }
        int iM2162 = m2162(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m2163(iM2162))) == -1;
        int iM2160 = m2160(lineEnd, lineStart);
        int iM2163 = m2163(iM2162);
        int i4 = lineStart - iM2163;
        int i5 = iM2160 - iM2163;
        Bidi bidiM2168 = m2168(iM2162);
        Bidi bidiCreateLineBidi = bidiM2168 != null ? bidiM2168.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM13432) : layout.getLineRight(iM13432);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C7942[] c7942Arr = new C7942[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            c7942Arr[i6] = new C7942(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, c7942Arr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c7942Arr[i8].f21986 == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == c7942Arr[i3].f21984) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iM13432) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(c7942Arr[i3 - 1].f21986) : layout.getPrimaryHorizontal(c7942Arr[i3 + 1].f21986) : layout.getLineRight(iM13432);
        }
        int iM21602 = i > iM2160 ? m2160(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (c7942Arr[i9].f21985 == iM21602) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == c7942Arr[i2].f21984) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iM13432) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(c7942Arr[i2 - 1].f21985) : layout.getPrimaryHorizontal(c7942Arr[i2 + 1].f21985) : layout.getLineRight(iM13432);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo988(C4691 c4691, Object obj) {
        ((C3005) this.f3620).mo988(c4691, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2166(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((C1562) this.f3618).m2840(str, str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo989(C4691 c4691, C4688 c4688, C4691 c46912) {
        ((C3005) this.f3620).mo989(c4691, c4688, c46912);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2167(InterfaceC6558 interfaceC6558) {
        int i;
        synchronized (this.f3620) {
            try {
                C0244 c0244 = (C0244) this.f3617;
                this.f3617 = (C0244) this.f3619;
                this.f3619 = c0244;
                AtomicInt atomicInt = (AtomicInt) this.f3618;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c0244.f1004;
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC6558.invoke(c0244.m881(i3));
                }
                c0244.m779();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC4643 mo991(C4688 c4688, C4691 c4691) {
        return ((C3005) this.f3620).mo991(c4688, c4691);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi m2168(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3620
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f3621
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f3618
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f3617
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
            java.lang.Object r6 = r14.f3619
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
            int r1 = r14.m2163(r15)
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
            java.lang.Object r15 = r14.f3619
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f3619 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.internal.C1245.m2168(int):java.text.Bidi");
    }

    public C1245(Map map) {
        this.f3622 = 9;
        this.f3620 = new LinkedHashMap(map);
        this.f3621 = new LinkedHashMap();
        this.f3618 = new LinkedHashMap();
        this.f3617 = new LinkedHashMap();
        this.f3619 = new C2335(this, 2);
    }

    public C1245(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f3622 = 5;
        this.f3620 = map;
        this.f3621 = map2;
        this.f3618 = map3;
        this.f3617 = map4;
        this.f3619 = map5;
    }

    public C1245(int i) {
        this.f3622 = i;
        switch (i) {
            case 3:
                break;
            case 6:
                this.f3619 = C6229.f17165;
                this.f3621 = "GET";
                this.f3618 = new C1562(6, false);
                break;
            case 8:
                this.f3619 = new Class[0];
                break;
            default:
                this.f3620 = new Object();
                this.f3618 = new AtomicInt(0);
                this.f3617 = new C0244();
                this.f3619 = new C0244();
                break;
        }
    }

    public C1245(Layout layout) {
        this.f3622 = 10;
        this.f3620 = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM10171 = AbstractC5144.m10171(((Layout) this.f3620).getText(), '\n', length, 4);
            length = iM10171 < 0 ? ((Layout) this.f3620).getText().length() : iM10171 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f3620).getText().length());
        this.f3621 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f3618 = arrayList2;
        this.f3617 = new boolean[((ArrayList) this.f3621).size()];
        ((ArrayList) this.f3621).size();
    }

    public /* synthetic */ C1245(boolean z) {
        this.f3622 = 6;
    }

    public C1245(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2, C8099 c8099) {
        this.f3622 = 2;
        str.getClass();
        str2.getClass();
        this.f3620 = inetSocketAddress;
        this.f3621 = inetSocketAddress2;
        this.f3618 = str;
        this.f3617 = str2;
        this.f3619 = c8099;
        C8091 c8091 = C8091.f22320;
        String strM8631 = AbstractC4217.m8631("http");
        if (((C8091) C8091.f22319.get(strM8631)) == null) {
            new C8091(strM8631, 0);
        }
    }

    public C1245(C3005 c3005, C3005 c30052, C4691 c4691, ArrayList arrayList) {
        this.f3622 = 4;
        this.f3621 = c3005;
        this.f3618 = c30052;
        this.f3617 = c4691;
        this.f3619 = arrayList;
        this.f3620 = c3005;
    }

    public C1245(C6234 c6234) {
        this.f3622 = 7;
        c6234.getClass();
        this.f3620 = c6234;
        this.f3617 = AbstractC6274.f17292;
        this.f3619 = C6265.f17254;
    }
}
