package io.ktor.server.routing;

import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import io.ktor.http.URLDecodeException;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.AbstractC5976;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p252.AbstractC8940;
import p252.C8926;
import p252.C8934;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4974 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4970 f12896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4897 f12900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4977 f12901;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C5001 f12902;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f12903;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f12904;

    public C4974(C4977 c4977, InterfaceC4897 interfaceC4897, ArrayList arrayList) throws BadRequestException {
        interfaceC4897.getClass();
        arrayList.getClass();
        this.f12901 = c4977;
        this.f12900 = interfaceC4897;
        this.f12899 = arrayList;
        this.f12897 = AbstractC5976.m10718(AbstractC3738.m6896(interfaceC4897.mo9018()), '/');
        this.f12903 = new ArrayList(16);
        this.f12902 = AbstractC4992.f12950;
        try {
            List listM9089 = m9089(AbstractC3738.m6896(interfaceC4897.mo9018()));
            this.f12898 = listM9089;
            this.f12896 = arrayList.isEmpty() ? null : new C4970(interfaceC4897, listM9089);
        } catch (URLDecodeException e) {
            throw new BadRequestException("Url decode failed for " + AbstractC3738.m6855(this.f12900.mo9018()), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9088(ContinuationImpl continuationImpl) {
        RoutingResolveContext$resolve$1 routingResolveContext$resolve$1;
        C4974 c4974;
        AbstractC4971 c4972;
        C8926 c8926;
        if (continuationImpl instanceof RoutingResolveContext$resolve$1) {
            routingResolveContext$resolve$1 = (RoutingResolveContext$resolve$1) continuationImpl;
            int i = routingResolveContext$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routingResolveContext$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                routingResolveContext$resolve$1 = new RoutingResolveContext$resolve$1(this, continuationImpl);
            }
        }
        RoutingResolveContext$resolve$1 routingResolveContext$resolve$12 = routingResolveContext$resolve$1;
        Object obj = routingResolveContext$resolve$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routingResolveContext$resolve$12.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            ArrayList arrayList = new ArrayList();
            routingResolveContext$resolve$12.L$0 = this;
            routingResolveContext$resolve$12.label = 1;
            if (m9090(this.f12901, 0, arrayList, -1.7976931348623157E308d, routingResolveContext$resolve$12) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c4974 = this;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4974 = (C4974) routingResolveContext$resolve$12.L$0;
            AbstractC6017.m10769(obj);
        }
        ArrayList arrayList2 = c4974.f12903;
        if (arrayList2.isEmpty()) {
            C4977 c4977 = c4974.f12901;
            C5001 c5001 = c4974.f12902;
            if (c5001 == null || (c8926 = c5001.f12972) == null) {
                c8926 = C8926.f22690;
            }
            c4972 = new C4973(c4977, "No matched subtrees found", c8926);
        } else {
            C8934 c8934 = new C8934(2);
            int size = arrayList2.size() - 1;
            double dMin = Double.MAX_VALUE;
            if (size >= 0) {
                int i3 = 0;
                while (true) {
                    Object obj2 = arrayList2.get(i3);
                    obj2.getClass();
                    C4972 c49722 = (C4972) obj2;
                    c8934.m2985(c49722.f12893);
                    double d = c49722.f12892;
                    if (d == -1.0d) {
                        d = 1.0d;
                    }
                    dMin = Math.min(dMin, d);
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
            c4972 = new C4972(((C4972) AbstractC5176.m9367(arrayList2)).f12891, c8934.build(), dMin);
        }
        C4970 c4970 = c4974.f12896;
        if (c4970 != null) {
            c4970.f12887 = c4972;
        }
        if (c4970 != null) {
            Iterator it = c4974.f12899.iterator();
            while (it.hasNext()) {
                ((InterfaceC7387) it.next()).invoke(c4970);
            }
        }
        return c4972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m9089(String str) {
        if (str.length() == 0 || str.equals("/")) {
            return EmptyList.INSTANCE;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '/') {
                i2++;
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        int i4 = 0;
        while (i < length) {
            int iM10730 = AbstractC5976.m10730(str, '/', i4, 4);
            if (iM10730 == -1) {
                iM10730 = length;
            }
            if (iM10730 != i4) {
                arrayList.add(AbstractC8940.m14137(i4, iM10730, str, 4));
            }
            i4 = iM10730 + 1;
            i = iM10730;
        }
        C5041 c5041 = AbstractC4983.f12921;
        InterfaceC4897 interfaceC4897 = this.f12900;
        interfaceC4897.getClass();
        C5036 attributes = interfaceC4897.getAttributes();
        C5041 c50412 = AbstractC4983.f12921;
        attributes.getClass();
        c50412.getClass();
        if (!attributes.m9147().containsKey(c50412) && str.endsWith("/")) {
            arrayList.add("");
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (r3 == r5) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025e A[PHI: r31 r32
  0x025e: PHI (r31v7 io.ktor.server.routing.飘花落叶言子楪兰世哲苏) = (r31v6 io.ktor.server.routing.飘花落叶言子楪兰世哲苏), (r31v8 io.ktor.server.routing.飘花落叶言子楪兰世哲苏) binds: [B:126:0x025b, B:95:0x01fd] A[DONT_GENERATE, DONT_INLINE]
  0x025e: PHI (r32v7 int) = (r32v6 int), (r32v8 int) binds: [B:126:0x025b, B:95:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02d8 -> B:145:0x02e3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9090(C4986 c4986, int i, ArrayList arrayList, double d, ContinuationImpl continuationImpl) {
        RoutingResolveContext$handleRoute$1 routingResolveContext$handleRoute$1;
        double d2;
        C4973 c4973;
        ArrayList arrayList2;
        double d3;
        AbstractC4992 abstractC4992;
        double dMax;
        C4972 c4972;
        C4986 c49862;
        int i2;
        int iM12460;
        C4986 c49863;
        int i3;
        C4986 c49864;
        AbstractC4992 abstractC49922;
        int i4;
        int i5;
        C5001 c5001;
        C4970 c4970;
        int i6;
        int i7;
        C4970 c49702;
        int i8;
        C4974 c4974 = this;
        C4986 c49865 = c4986;
        int i9 = i;
        if (continuationImpl instanceof RoutingResolveContext$handleRoute$1) {
            routingResolveContext$handleRoute$1 = (RoutingResolveContext$handleRoute$1) continuationImpl;
            int i10 = routingResolveContext$handleRoute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                routingResolveContext$handleRoute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                routingResolveContext$handleRoute$1 = new RoutingResolveContext$handleRoute$1(c4974, continuationImpl);
            }
        }
        Object objMo7234 = routingResolveContext$handleRoute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = routingResolveContext$handleRoute$1.label;
        if (i11 == 0) {
            d2 = 0.0d;
            c4973 = null;
            AbstractC6017.m10769(objMo7234);
            AbstractC3887 abstractC3887 = c49865.f12927;
            routingResolveContext$handleRoute$1.L$0 = c4974;
            routingResolveContext$handleRoute$1.L$1 = c49865;
            arrayList2 = arrayList;
            routingResolveContext$handleRoute$1.L$2 = arrayList2;
            routingResolveContext$handleRoute$1.I$0 = i9;
            d3 = d;
            routingResolveContext$handleRoute$1.D$0 = d3;
            routingResolveContext$handleRoute$1.label = 1;
            objMo7234 = abstractC3887.mo7234(c4974, i9);
        } else if (i11 == 1) {
            d2 = 0.0d;
            c4973 = null;
            double d4 = routingResolveContext$handleRoute$1.D$0;
            i9 = routingResolveContext$handleRoute$1.I$0;
            arrayList2 = (ArrayList) routingResolveContext$handleRoute$1.L$2;
            C4986 c49866 = (C4986) routingResolveContext$handleRoute$1.L$1;
            C4974 c49742 = (C4974) routingResolveContext$handleRoute$1.L$0;
            AbstractC6017.m10769(objMo7234);
            c49865 = c49866;
            c4974 = c49742;
            d3 = d4;
        } else {
            if (i11 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = routingResolveContext$handleRoute$1.I$2;
            int i13 = routingResolveContext$handleRoute$1.I$1;
            double d5 = routingResolveContext$handleRoute$1.D$0;
            int i14 = routingResolveContext$handleRoute$1.I$0;
            C4972 c49722 = (C4972) routingResolveContext$handleRoute$1.L$4;
            d2 = 0.0d;
            AbstractC4992 abstractC49923 = (AbstractC4992) routingResolveContext$handleRoute$1.L$3;
            ArrayList arrayList3 = (ArrayList) routingResolveContext$handleRoute$1.L$2;
            c49864 = (C4986) routingResolveContext$handleRoute$1.L$1;
            C4974 c49743 = (C4974) routingResolveContext$handleRoute$1.L$0;
            AbstractC6017.m10769(objMo7234);
            c4972 = c49722;
            arrayList2 = arrayList3;
            abstractC49922 = abstractC49923;
            i8 = i14;
            int i15 = i12;
            c4974 = c49743;
            double dDoubleValue = ((Number) objMo7234).doubleValue();
            dMax = dDoubleValue <= d2 ? Math.max(d5, dDoubleValue) : d5;
            if (i13 == i15) {
                int i16 = i15;
                i4 = i13 + 1;
                iM12460 = i16;
                i5 = i8;
                C4986 c49867 = (C4986) c49864.f12926.get(i4);
                routingResolveContext$handleRoute$1.L$0 = c4974;
                routingResolveContext$handleRoute$1.L$1 = c49864;
                routingResolveContext$handleRoute$1.L$2 = arrayList2;
                routingResolveContext$handleRoute$1.L$3 = abstractC49922;
                routingResolveContext$handleRoute$1.L$4 = c4972;
                routingResolveContext$handleRoute$1.I$0 = i5;
                routingResolveContext$handleRoute$1.D$0 = dMax;
                routingResolveContext$handleRoute$1.I$1 = i4;
                routingResolveContext$handleRoute$1.I$2 = iM12460;
                routingResolveContext$handleRoute$1.label = 2;
                C4974 c49744 = c4974;
                i8 = i5;
                RoutingResolveContext$handleRoute$1 routingResolveContext$handleRoute$12 = routingResolveContext$handleRoute$1;
                ArrayList arrayList4 = arrayList2;
                double d6 = dMax;
                objMo7234 = c49744.m9090(c49867, i8, arrayList4, d6, routingResolveContext$handleRoute$12);
                if (objMo7234 != coroutineSingletons) {
                    int i17 = i4;
                    i15 = iM12460;
                    i13 = i17;
                    c4974 = c49744;
                    arrayList2 = arrayList4;
                    d5 = d6;
                    routingResolveContext$handleRoute$1 = routingResolveContext$handleRoute$12;
                    double dDoubleValue2 = ((Number) objMo7234).doubleValue();
                    if (dDoubleValue2 <= d2) {
                    }
                    if (i13 == i15) {
                        abstractC4992 = abstractC49922;
                        c49863 = c49864;
                        i3 = i8;
                        AbstractC5176.m9351(arrayList2);
                        c49702 = c4974.f12896;
                        if (c49702 != null) {
                            c49863.getClass();
                            c4972.getClass();
                            ArrayList arrayList5 = c49702.f12889.f4945;
                            if (arrayList5.isEmpty()) {
                                C5043.m9176("Unable to pop an element from empty stack");
                                return null;
                            }
                            C4969 c4969 = (C4969) arrayList5.remove(arrayList5.size() - 1);
                            if (!c4969.f12885.equals(c49863)) {
                                C6755.m11869("end should be called for the same route as begin");
                                return null;
                            }
                            if (c4969.f12884 != i3) {
                                C6755.m11869("end should be called for the same segmentIndex as begin");
                                return null;
                            }
                            c4969.f12883 = c4972;
                            c49702.m9087(c4969);
                        }
                        return new Double(dMax <= d2 ? ((C4993) abstractC4992).f12952 : -1.7976931348623157E308d);
                    }
                }
                return coroutineSingletons;
            }
        }
        abstractC4992 = (AbstractC4992) objMo7234;
        if (abstractC4992 instanceof C5001) {
            C4970 c49703 = c4974.f12896;
            if (c49703 != null) {
                c49703.m9087(new C4969(c49865, i9, new C4973(c49865, "Selector didn't match", ((C5001) abstractC4992).f12972)));
            }
            if (i9 == c4974.f12898.size()) {
                C5001 c50012 = (C5001) abstractC4992;
                C5001 c50013 = c4974.f12902;
                if (c50013 != null && (c50013.f12971 < c50012.f12971 || c4974.f12904 < arrayList2.size())) {
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            double d7 = ((C4972) it.next()).f12892;
                            if (d7 != -1.0d && d7 != 1.0d) {
                                break;
                            }
                        }
                        c4974.f12902 = c50012;
                        c4974.f12904 = arrayList2.size();
                    } else {
                        c4974.f12902 = c50012;
                        c4974.f12904 = arrayList2.size();
                    }
                }
            }
            return new Double(-1.7976931348623157E308d);
        }
        if (!(abstractC4992 instanceof C4993)) {
            C6755.m11870("Check failed.");
            return null;
        }
        C4993 c4993 = (C4993) abstractC4992;
        dMax = c4993.f12952;
        if (dMax != -1.0d && dMax < d3) {
            C4970 c49704 = c4974.f12896;
            if (c49704 != null) {
                c49704.m9087(new C4969(c49865, i9, new C4973(c49865, "Better match was already found", C8926.f22690)));
            }
            return new Double(-1.7976931348623157E308d);
        }
        c4972 = new C4972(c49865, c4993.f12953, dMax);
        ArrayList arrayList6 = c49865.f12926;
        int i18 = i9 + c4993.f12954;
        if (arrayList6.isEmpty() && i18 != c4974.f12898.size()) {
            C4970 c49705 = c4974.f12896;
            if (c49705 != null) {
                c49705.m9087(new C4969(c49865, i18, new C4973(c49865, "Not all segments matched", C8926.f22690)));
            }
            return new Double(-1.7976931348623157E308d);
        }
        C4970 c49706 = c4974.f12896;
        ArrayList arrayList7 = c4974.f12903;
        if (c49706 != null) {
            c49706.f12889.f4945.add(new C4969(c49865, i18, c4973));
        }
        arrayList2.add(c4972);
        if (c49865.f12924.isEmpty() || i18 != c4974.f12898.size()) {
            c49862 = c49865;
            i2 = i18;
            dMax = -1.7976931348623157E308d;
        } else {
            if (arrayList7.isEmpty()) {
                c49862 = c49865;
                i2 = i18;
                c5001 = null;
            } else {
                int i19 = 0;
                int i20 = 0;
                while (i19 < arrayList7.size() && i20 < arrayList2.size()) {
                    c49862 = c49865;
                    i2 = i18;
                    double d8 = ((C4972) arrayList7.get(i19)).f12892;
                    int i21 = i20;
                    double d9 = ((C4972) arrayList2.get(i20)).f12892;
                    if (d8 == -1.0d) {
                        i19++;
                        c49865 = c49862;
                        i18 = i2;
                        i20 = i21;
                    } else {
                        if (d9 != -1.0d) {
                            if (d8 == d9) {
                                i19++;
                            } else {
                                c5001 = null;
                                if (d9 <= d8) {
                                    dMax = -1.7976931348623157E308d;
                                }
                                c4970 = c4974.f12896;
                                if (c4970 != null) {
                                    int size = arrayList2.size();
                                    ArrayList arrayList8 = new ArrayList(size);
                                    for (int i22 = 0; i22 < size; i22++) {
                                        arrayList8.add((C4972) arrayList2.get(i22));
                                    }
                                    c4970.f12886.add(arrayList8);
                                }
                            }
                        }
                        i20 = i21 + 1;
                        c49865 = c49862;
                        i18 = i2;
                    }
                }
                c49862 = c49865;
                i2 = i18;
                if (arrayList7.isEmpty()) {
                    i6 = 0;
                } else {
                    Iterator it2 = arrayList7.iterator();
                    i6 = 0;
                    while (it2.hasNext()) {
                        if (((C4972) it2.next()).f12892 != -1.0d && (i6 = i6 + 1) < 0) {
                            AbstractC7176.m12480();
                            throw null;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    i7 = 0;
                } else {
                    Iterator it3 = arrayList2.iterator();
                    i7 = 0;
                    while (it3.hasNext()) {
                        if (((C4972) it3.next()).f12892 != -1.0d && (i7 = i7 + 1) < 0) {
                            AbstractC7176.m12480();
                            throw null;
                        }
                    }
                }
                c5001 = null;
                if (i7 > i6) {
                }
                c4970 = c4974.f12896;
                if (c4970 != null) {
                }
            }
            arrayList7.clear();
            arrayList7.addAll(arrayList2);
            c4974.f12902 = c5001;
            c4970 = c4974.f12896;
            if (c4970 != null) {
            }
        }
        iM12460 = AbstractC7176.m12460(arrayList6);
        if (iM12460 < 0) {
            c49863 = c49862;
            i3 = i2;
            AbstractC5176.m9351(arrayList2);
            c49702 = c4974.f12896;
            if (c49702 != null) {
            }
            return new Double(dMax <= d2 ? ((C4993) abstractC4992).f12952 : -1.7976931348623157E308d);
        }
        c49864 = c49862;
        abstractC49922 = abstractC4992;
        i4 = 0;
        i5 = i2;
        C4986 c498672 = (C4986) c49864.f12926.get(i4);
        routingResolveContext$handleRoute$1.L$0 = c4974;
        routingResolveContext$handleRoute$1.L$1 = c49864;
        routingResolveContext$handleRoute$1.L$2 = arrayList2;
        routingResolveContext$handleRoute$1.L$3 = abstractC49922;
        routingResolveContext$handleRoute$1.L$4 = c4972;
        routingResolveContext$handleRoute$1.I$0 = i5;
        routingResolveContext$handleRoute$1.D$0 = dMax;
        routingResolveContext$handleRoute$1.I$1 = i4;
        routingResolveContext$handleRoute$1.I$2 = iM12460;
        routingResolveContext$handleRoute$1.label = 2;
        C4974 c497442 = c4974;
        i8 = i5;
        RoutingResolveContext$handleRoute$1 routingResolveContext$handleRoute$122 = routingResolveContext$handleRoute$1;
        ArrayList arrayList42 = arrayList2;
        double d62 = dMax;
        objMo7234 = c497442.m9090(c498672, i8, arrayList42, d62, routingResolveContext$handleRoute$122);
        if (objMo7234 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
