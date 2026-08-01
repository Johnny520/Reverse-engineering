package androidx.compose.runtime.internal;

import android.text.Layout;
import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.collection.C1091;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.p001ui.text.AbstractC2901;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2883;
import androidx.compose.p001ui.text.C2884;
import androidx.compose.p001ui.text.C2891;
import androidx.compose.p001ui.text.C2898;
import androidx.compose.p001ui.text.C2900;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.InterfaceC2897;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2187;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3168;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.load.engine.C3837;
import io.ktor.util.AbstractC5049;
import java.net.InetSocketAddress;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5183;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5355;
import kotlin.reflect.jvm.internal.impl.p009km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.p009km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.InterfaceC6129;
import p023.AbstractC6962;
import p023.C6977;
import p029.C7058;
import p031.C7063;
import p035.AbstractC7103;
import p035.C7094;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p105.InterfaceC8013;
import p191.AbstractC8568;
import p209.C8650;
import p211.AbstractC8663;
import p221.InterfaceC8725;
import p228.AbstractC8777;
import p228.C8771;
import p252.C8920;
import p252.C8928;
import p252.InterfaceC8931;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2080 implements InterfaceC2897, InterfaceC8931, InterfaceC5475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f3962;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f3963;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f3964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3967;

    public C2080(C2902 c2902, C2865 c2865, List list, InterfaceC8725 interfaceC8725, InterfaceC2830 interfaceC2830) {
        int i;
        int i2;
        List list2;
        int i3;
        List list3;
        int i4;
        C2902 c29022 = c2902;
        C2865 c28652 = c2865;
        final int i5 = 1;
        this.f3967 = 1;
        this.f3965 = c29022;
        this.f3966 = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i6 = 0;
        this.f3963 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C2080 f6443;

            {
                this.f6443 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i7 = i6;
                Object obj = null;
                int i8 = 1;
                C2080 c2080 = this.f6443;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c2080.f3964;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2714 = ((C2900) obj2).f6471.mo2714();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo27142 = ((C2900) obj3).f6471.mo2714();
                                    if (Float.compare(fMo2714, fMo27142) < 0) {
                                        obj2 = obj3;
                                        fMo2714 = fMo27142;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2900 c2900 = (C2900) obj;
                        return Float.valueOf(c2900 != null ? c2900.f6471.mo2714() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c2080.f3964;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13985 = ((C2900) obj4).f6471.f21699.m13985();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM139852 = ((C2900) obj5).f6471.f21699.m13985();
                                    if (Float.compare(fM13985, fM139852) < 0) {
                                        obj4 = obj5;
                                        fM13985 = fM139852;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2900 c29002 = (C2900) obj;
                        return Float.valueOf(c29002 != null ? c29002.f6471.f21699.m13985() : 0.0f);
                }
            }
        });
        this.f3962 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: androidx.compose.ui.text.飘花落叶言子楪哲世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C2080 f6443;

            {
                this.f6443 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i7 = i5;
                Object obj = null;
                int i8 = 1;
                C2080 c2080 = this.f6443;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c2080.f3964;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2714 = ((C2900) obj2).f6471.mo2714();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i8);
                                    float fMo27142 = ((C2900) obj3).f6471.mo2714();
                                    if (Float.compare(fMo2714, fMo27142) < 0) {
                                        obj2 = obj3;
                                        fMo2714 = fMo27142;
                                    }
                                    if (i8 != size) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C2900 c2900 = (C2900) obj;
                        return Float.valueOf(c2900 != null ? c2900.f6471.mo2714() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c2080.f3964;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM13985 = ((C2900) obj4).f6471.f21699.m13985();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i8);
                                    float fM139852 = ((C2900) obj5).f6471.f21699.m13985();
                                    if (Float.compare(fM13985, fM139852) < 0) {
                                        obj4 = obj5;
                                        fM13985 = fM139852;
                                    }
                                    if (i8 != size2) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C2900 c29002 = (C2900) obj;
                        return Float.valueOf(c29002 != null ? c29002.f6471.f21699.m13985() : 0.0f);
                }
            }
        });
        C2898 c2898 = c28652.f6328;
        C2902 c29023 = AbstractC2901.f6472;
        ArrayList arrayList = c29022.f6473;
        String str = c29022.f6474;
        List listM9337 = (arrayList == null || (listM9337 = AbstractC5176.m9337(arrayList, new C2883(i5))) == null) ? EmptyList.INSTANCE : listM9337;
        ArrayList arrayList2 = new ArrayList();
        C5183 c5183 = new C5183();
        int size = listM9337.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C2884 c2884 = (C2884) listM9337.get(i7);
            C2884 c28842 = new C2884(c2884.f6419, (14 & 2) != 0 ? c2884.f6421 : i6, (14 & i5) != 0 ? c2884.f6422 : c2898.m4357((C2898) c2884.f6422), (14 & 4) != 0 ? c2884.f6420 : i6);
            while (true) {
                i3 = c28842.f6421;
                if (i8 >= i3 || c5183.isEmpty()) {
                    break;
                }
                C2884 c28843 = (C2884) c5183.last();
                int i9 = c28843.f6420;
                Object obj = c28843.f6422;
                if (i3 < i9) {
                    arrayList2.add(new C2884(obj, i8, i3));
                    i8 = i3;
                } else {
                    arrayList2.add(new C2884(obj, i8, i9));
                    i8 = c28843.f6420;
                    while (!c5183.isEmpty() && i8 == ((C2884) c5183.last()).f6420) {
                        c5183.removeLast();
                    }
                }
            }
            if (i8 < i3) {
                arrayList2.add(new C2884(c2898, i8, i3));
                i8 = i3;
            }
            C2884 c28844 = (C2884) c5183.m9416();
            Object obj2 = c28842.f6422;
            int i10 = c28842.f6420;
            if (c28844 != null) {
                int i11 = c28844.f6420;
                list3 = listM9337;
                Object obj3 = c28844.f6422;
                int i12 = c28844.f6421;
                if (i12 == i3 && i11 == i10) {
                    c5183.removeLast();
                    c5183.addLast(new C2884(((C2898) obj3).m4357((C2898) obj2), i3, i10));
                    i4 = size;
                } else if (i12 == i11) {
                    i4 = size;
                    arrayList2.add(new C2884(obj3, i12, i11));
                    c5183.removeLast();
                    c5183.addLast(new C2884(obj2, i3, i10));
                } else {
                    i4 = size;
                    if (i11 < i10) {
                        C6755.m11865();
                        throw null;
                    }
                    c5183.addLast(new C2884(((C2898) obj3).m4357((C2898) obj2), i3, i10));
                }
            } else {
                list3 = listM9337;
                i4 = size;
                c5183.addLast(new C2884(obj2, i3, i10));
            }
            i7++;
            listM9337 = list3;
            size = i4;
            i5 = 1;
            i6 = 0;
        }
        while (i8 <= str.length() && !c5183.isEmpty()) {
            C2884 c28845 = (C2884) c5183.last();
            Object obj4 = c28845.f6422;
            int i13 = c28845.f6420;
            arrayList2.add(new C2884(obj4, i8, i13));
            while (!c5183.isEmpty() && i13 == ((C2884) c5183.last()).f6420) {
                c5183.removeLast();
            }
            i8 = i13;
        }
        if (i8 < str.length()) {
            arrayList2.add(new C2884(c2898, i8, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C2884(c2898, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            C2884 c28846 = (C2884) arrayList2.get(i14);
            int i15 = c28846.f6421;
            int i16 = c28846.f6420;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listM4363 = AbstractC2901.m4363(c29022, i15, i16, new C2891(1));
            C2902 c29024 = new C2902(strSubstring, listM4363 == null ? EmptyList.INSTANCE : listM4363);
            C2898 c28982 = (C2898) c28846.f6422;
            if (c28982.f6457 == 0) {
                i2 = size2;
                c28982 = new C2898(c28982.f6458, c2898.f6457, c28982.f6456, c28982.f6455, c28982.f6454, c28982.f6453, c28982.f6460, c28982.f6459, c28982.f6461);
            } else {
                i2 = size2;
            }
            C2865 c28653 = new C2865(c28652.f6329, c2898.m4357(c28982));
            List list4 = c29024.f6476;
            List list5 = list4 == null ? EmptyList.INSTANCE : list4;
            List list6 = (List) this.f3966;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                C2884 c28847 = (C2884) list6.get(i17);
                C2898 c28983 = c2898;
                int i18 = c28847.f6421;
                C2865 c28654 = c28653;
                int i19 = c28847.f6420;
                if (AbstractC2901.m4362(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        AbstractC8663.m13757("placeholder can not overlap with paragraph.");
                    }
                    list2 = list6;
                    arrayList4.add(new C2884(c28847.f6422, i18 - i15, i19 - i15));
                } else {
                    list2 = list6;
                }
                i17++;
                c2898 = c28983;
                list6 = list2;
                c28653 = c28654;
            }
            arrayList3.add(new C2900(new C8650(strSubstring, c28653, list5, arrayList4, interfaceC2830, interfaceC8725), i15, i16));
            i14++;
            c29022 = c2902;
            c28652 = c2865;
            size2 = i2;
        }
        this.f3964 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m2710(C2080 c2080, InterfaceC5925 interfaceC5925) {
        c2080.m2721(interfaceC5925, EmptyList.INSTANCE);
    }

    public String toString() {
        switch (this.f3967) {
            case 2:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f3965;
                StringBuilder sb = new StringBuilder("CIOConnectionPoint(uri=");
                sb.append((String) this.f3962);
                sb.append(", method=");
                sb.append((C8928) this.f3964);
                sb.append(", version=");
                sb.append((String) this.f3963);
                sb.append(", localAddress=");
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) this.f3966;
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
                KmVersionRequirementVersionKind kmVersionRequirementVersionKind = (KmVersionRequirementVersionKind) this.f3965;
                if (kmVersionRequirementVersionKind == null) {
                    AbstractC5227.m9467("kind");
                    throw null;
                }
                sb2.append(kmVersionRequirementVersionKind);
                sb2.append(", level=");
                KmVersionRequirementLevel kmVersionRequirementLevel = (KmVersionRequirementLevel) this.f3966;
                if (kmVersionRequirementLevel == null) {
                    AbstractC5227.m9467("level");
                    throw null;
                }
                sb2.append(kmVersionRequirementLevel);
                sb2.append(", version=");
                C5355 c5355 = (C5355) this.f3964;
                if (c5355 == null) {
                    AbstractC5227.m9467("version");
                    throw null;
                }
                sb2.append(c5355);
                sb2.append(", errorCode=");
                sb2.append((Integer) this.f3963);
                sb2.append(", message=");
                return AbstractC0900.m708(sb2, (String) this.f3962, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m2711(String str) {
        str.getClass();
        if (AbstractC5971.m10698(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (AbstractC5971.m10698(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        C6977 c6977 = new C6977(0);
        c6977.m12097(null, str);
        this.f3965 = c6977.m12094();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC2187 m2712(AbstractC2081 abstractC2081, InterfaceC7372 interfaceC7372) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.f3965) {
            Throwable th = (Throwable) this.f3966;
            if (th != null) {
                abstractC2081.mo2729(th);
                return C2188.f4268;
            }
            AtomicInt atomicInt = (AtomicInt) this.f3963;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.element = (i2 >>> 27) & 15;
            ((C1091) this.f3962).m1335(abstractC2081);
            if (z && interfaceC7372 != null) {
                try {
                    interfaceC7372.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f3965) {
                        try {
                            if (((Throwable) this.f3966) == null) {
                                this.f3966 = th2;
                                C1091 c1091 = (C1091) this.f3962;
                                Object[] objArr = c1091.f1350;
                                int i4 = c1091.f1349;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((AbstractC2081) objArr[i5]).mo2729(th2);
                                }
                                ((C1091) this.f3962).m1339();
                                AtomicInt atomicInt2 = (AtomicInt) this.f3963;
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
            return new C0923(new C1596(abstractC2081, this, ref$IntRef, 3));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo1541(C5523 c5523, C5581 c5581) {
        ((C3837) this.f3965).mo1541(c5523, c5581);
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo2713() {
        return ((Number) ((InterfaceC6016) this.f3962).getValue()).floatValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1542() {
        ((C3837) this.f3966).mo1542();
        C3837 c3837 = (C3837) this.f3963;
        ((HashMap) c3837.f9882).put((C5523) this.f3962, new C5586((InterfaceC7307) AbstractC5176.m9338((ArrayList) this.f3964)));
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float mo2714() {
        return ((Number) ((InterfaceC6016) this.f3963).getValue()).floatValue();
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo2715() {
        ArrayList arrayList = (ArrayList) this.f3964;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C2900) arrayList.get(i)).f6471.mo2715()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m2716(String str, String str2) {
        str2.getClass();
        C2397 c2397 = (C2397) this.f3963;
        c2397.getClass();
        AbstractC8568.m13617(str);
        AbstractC8568.m13616(str2, str);
        c2397.m3404(str);
        AbstractC8568.m13641(c2397, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC8013 m2717(InterfaceC5925 interfaceC5925, Object obj) {
        interfaceC5925.getClass();
        obj.getClass();
        if (interfaceC5925.isInstance(obj)) {
            Map map = (Map) ((Map) this.f3966).get(interfaceC5925);
            InterfaceC8013 interfaceC8013 = map != null ? (InterfaceC8013) map.get(AbstractC5228.f13320.mo9476(obj.getClass())) : null;
            InterfaceC8013 interfaceC80132 = interfaceC8013 instanceof InterfaceC8013 ? interfaceC8013 : null;
            if (interfaceC80132 != null) {
                return interfaceC80132;
            }
            Object obj2 = ((Map) this.f3963).get(interfaceC5925);
            InterfaceC7387 interfaceC7387 = AbstractC5220.m9453(1, obj2) ? (InterfaceC7387) obj2 : null;
            if (interfaceC7387 != null) {
                return (InterfaceC8013) interfaceC7387.invoke(obj);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m2718(String str, AbstractC6962 abstractC6962) {
        str.getClass();
        if (str.length() <= 0) {
            C6755.m11869("method.isEmpty() == true");
            return;
        }
        if (abstractC6962 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C6755.m11873(AbstractC0900.m718("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC5754.m10434(str)) {
            C6755.m11873(AbstractC0900.m718("method ", str, " must not have a request body."));
            return;
        }
        this.f3966 = str;
        this.f3962 = abstractC6962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m2719(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.f3965).put(str, obj);
        InterfaceC6129 interfaceC6129 = (InterfaceC6129) ((LinkedHashMap) this.f3963).get(str);
        if (interfaceC6129 != null) {
            ((C6099) interfaceC6129).m10872(obj);
        }
        InterfaceC6129 interfaceC61292 = (InterfaceC6129) ((LinkedHashMap) this.f3962).get(str);
        if (interfaceC61292 != null) {
            ((C6099) interfaceC61292).m10872(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int m2720(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f3965).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC5227.m9464(cCharAt, 8192) < 0 || AbstractC5227.m9464(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public InterfaceC5476 mo1544(C5523 c5523) {
        return ((C3837) this.f3965).mo1544(c5523);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2721(InterfaceC5925 interfaceC5925, List list) {
        list.getClass();
        if (((Map) this.f3965).get(interfaceC5925) == null) {
            return;
        }
        C3775.m6954();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int m2722(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f3966;
        int iM12472 = AbstractC7176.m12472(arrayList, Integer.valueOf(i));
        int i2 = iM12472 < 0 ? -(iM12472 + 1) : iM12472 + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int m2723(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f3966).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float m2724(int i, boolean z) {
        Layout layout = (Layout) this.f3965;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float m2725(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f3965;
        if (!z2) {
            return m2724(i, z);
        }
        int iM13991 = AbstractC8777.m13991(layout, i, z2);
        int lineStart = layout.getLineStart(iM13991);
        int lineEnd = layout.getLineEnd(iM13991);
        if (i != lineStart && i != lineEnd) {
            return m2724(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m2724(i, z);
        }
        int iM2722 = m2722(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m2723(iM2722))) == -1;
        int iM2720 = m2720(lineEnd, lineStart);
        int iM2723 = m2723(iM2722);
        int i4 = lineStart - iM2723;
        int i5 = iM2720 - iM2723;
        Bidi bidiM2728 = m2728(iM2722);
        Bidi bidiCreateLineBidi = bidiM2728 != null ? bidiM2728.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM13991) : layout.getLineRight(iM13991);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C8771[] c8771Arr = new C8771[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            c8771Arr[i6] = new C8771(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, c8771Arr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c8771Arr[i8].f22331 == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == c8771Arr[i3].f22329) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iM13991) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(c8771Arr[i3 - 1].f22331) : layout.getPrimaryHorizontal(c8771Arr[i3 + 1].f22331) : layout.getLineRight(iM13991);
        }
        int iM27202 = i > iM2720 ? m2720(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (c8771Arr[i9].f22330 == iM27202) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == c8771Arr[i2].f22329) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iM13991) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(c8771Arr[i2 - 1].f22330) : layout.getPrimaryHorizontal(c8771Arr[i2 + 1].f22330) : layout.getLineRight(iM13991);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo1548(C5523 c5523, Object obj) {
        ((C3837) this.f3965).mo1548(c5523, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2726(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((C2397) this.f3963).m3400(str, str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo1549(C5523 c5523, C5520 c5520, C5523 c55232) {
        ((C3837) this.f3965).mo1549(c5523, c5520, c55232);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2727(InterfaceC7387 interfaceC7387) {
        int i;
        synchronized (this.f3965) {
            try {
                C1091 c1091 = (C1091) this.f3962;
                this.f3962 = (C1091) this.f3964;
                this.f3964 = c1091;
                AtomicInt atomicInt = (AtomicInt) this.f3963;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c1091.f1349;
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC7387.invoke(c1091.m1441(i3));
                }
                c1091.m1339();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC5475 mo1551(C5520 c5520, C5523 c5523) {
        return ((C3837) this.f3965).mo1551(c5520, c5523);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi m2728(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f3965;
        ArrayList arrayList = (ArrayList) this.f3966;
        ArrayList arrayList2 = (ArrayList) this.f3963;
        boolean[] zArr = (boolean[]) this.f3962;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f3964;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m2723(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f3964;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f3964 = cArr2;
        return bidi;
    }

    public C2080(Map map) {
        this.f3967 = 9;
        this.f3965 = new LinkedHashMap(map);
        this.f3966 = new LinkedHashMap();
        this.f3963 = new LinkedHashMap();
        this.f3962 = new LinkedHashMap();
        this.f3964 = new C3168(this, 2);
    }

    public C2080(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f3967 = 5;
        this.f3965 = map;
        this.f3966 = map2;
        this.f3963 = map3;
        this.f3962 = map4;
        this.f3964 = map5;
    }

    public C2080(int i) {
        this.f3967 = i;
        switch (i) {
            case 3:
                break;
            case 6:
                this.f3964 = C7058.f17510;
                this.f3966 = "GET";
                this.f3963 = new C2397(6, false);
                break;
            case 8:
                this.f3964 = new Class[0];
                break;
            default:
                this.f3965 = new Object();
                this.f3963 = new AtomicInt(0);
                this.f3962 = new C1091();
                this.f3964 = new C1091();
                break;
        }
    }

    public C2080(Layout layout) {
        this.f3967 = 10;
        this.f3965 = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM10730 = AbstractC5976.m10730(((Layout) this.f3965).getText(), '\n', length, 4);
            length = iM10730 < 0 ? ((Layout) this.f3965).getText().length() : iM10730 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f3965).getText().length());
        this.f3966 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f3963 = arrayList2;
        this.f3962 = new boolean[((ArrayList) this.f3966).size()];
        ((ArrayList) this.f3966).size();
    }

    public /* synthetic */ C2080(boolean z) {
        this.f3967 = 6;
    }

    public C2080(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2, C8928 c8928) {
        this.f3967 = 2;
        str.getClass();
        str2.getClass();
        this.f3965 = inetSocketAddress;
        this.f3966 = inetSocketAddress2;
        this.f3963 = str;
        this.f3962 = str2;
        this.f3964 = c8928;
        C8920 c8920 = C8920.f22665;
        String strM9190 = AbstractC5049.m9190("http");
        if (((C8920) C8920.f22664.get(strM9190)) == null) {
            new C8920(strM9190, 0);
        }
    }

    public C2080(C3837 c3837, C3837 c38372, C5523 c5523, ArrayList arrayList) {
        this.f3967 = 4;
        this.f3966 = c3837;
        this.f3963 = c38372;
        this.f3962 = c5523;
        this.f3964 = arrayList;
        this.f3965 = c3837;
    }

    public C2080(C7063 c7063) {
        this.f3967 = 7;
        c7063.getClass();
        this.f3965 = c7063;
        this.f3962 = AbstractC7103.f17637;
        this.f3964 = C7094.f17599;
    }
}
