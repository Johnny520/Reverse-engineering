package kotlin.reflect.jvm.internal.impl.types;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3897;
import io.ktor.util.C5043;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.C5315;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import kotlin.reflect.jvm.internal.impl.types.checker.C5690;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import lin.xposed.hook.javaplugin.C6385;
import org.apache.commons.lang3.builder.C6469;
import p050.AbstractC7176;
import p062.C7311;
import p062.C7313;
import p062.InterfaceC7310;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p082.AbstractC7708;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.C7811;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8056;
import p113.InterfaceC8057;
import p113.InterfaceC8058;
import p113.InterfaceC8059;
import p113.InterfaceC8060;
import p114.C8061;
import p114.C8068;
import p114.C8069;
import p117.InterfaceC8083;
import p119.C8102;
import p120.AbstractC8112;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5725 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C5706 m10358(InterfaceC7310 interfaceC7310) {
        interfaceC7310.getClass();
        if (interfaceC7310.isEmpty()) {
            C5706.f14520.getClass();
            return C5706.f14521;
        }
        C5707 c5707 = C5706.f14520;
        List listM12487 = AbstractC7176.m12487(new C5745(interfaceC7310));
        c5707.getClass();
        return C5707.m10326(listM12487);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC8049 m10359(InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        AbstractC5728 abstractC5728M10266;
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        if (abstractC5710M10265 == null && ((abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049)) == null || (abstractC5710M10265 = AbstractC5692.m10226(abstractC5728M10266)) == null)) {
            abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M10265.getClass();
        }
        InterfaceC5295 interfaceC5295M10257 = AbstractC5692.m10257(AbstractC5692.m10278(abstractC5710M10265));
        C5690 c5690 = C5690.f14485;
        if (interfaceC5295M10257 != null) {
            return AbstractC5692.m10232(interfaceC8049) ? c5690.m10188(interfaceC80492) : interfaceC80492;
        }
        InterfaceC8059 interfaceC8059 = (InterfaceC8059) AbstractC5176.m9338(AbstractC5692.m10264(interfaceC8049));
        if (AbstractC5729.f14563[AbstractC5692.m10258(interfaceC8059).ordinal()] == 1) {
            c5690.mo10155();
            throw null;
        }
        AbstractC5746 abstractC5746M10253 = AbstractC5692.m10253(c5690, interfaceC8059);
        abstractC5746M10253.getClass();
        InterfaceC8049 interfaceC8049M10359 = m10359(abstractC5746M10253, interfaceC80492);
        interfaceC8049M10359.getClass();
        if (interfaceC8049M10359 instanceof AbstractC5714) {
            c5690.mo10155();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c5690);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC3275.m5135(AbstractC5228.f13320, c5690.getClass(), sb).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static C5751 m10360(List list, AbstractC5748 abstractC5748, InterfaceC5331 interfaceC5331, List list2, boolean[] zArr) throws Exception {
        if (abstractC5748 == null) {
            m10372(6);
            throw null;
        }
        if (interfaceC5331 == null) {
            m10372(7);
            throw null;
        }
        if (list2 == null) {
            m10372(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) it.next();
            C7811 c7811M12858 = C7811.m12858(interfaceC5331, interfaceC5295.getAnnotations(), interfaceC5295.mo9563(), interfaceC5295.mo9562(), interfaceC5295.getName(), i2, interfaceC5295.mo9559());
            map.put(interfaceC5295.mo9560(), new C5717(c7811M12858.mo9584()));
            map2.put(interfaceC5295, c7811M12858);
            list2.add(c7811M12858);
            i2++;
        }
        C5716 c5716 = new C5716(map, 1);
        C5751 c5751M10414 = C5751.m10414(abstractC5748, c5716);
        C5751 c5751M104142 = C5751.m10414(new C5699(abstractC5748, i), c5716);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC5295 interfaceC52952 = (InterfaceC5295) it2.next();
            C7811 c7811 = (C7811) map2.get(interfaceC52952);
            for (AbstractC5714 abstractC5714 : interfaceC52952.getUpperBounds()) {
                InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
                AbstractC5714 abstractC5714M10421 = (((interfaceC5309Mo9770 instanceof InterfaceC5295) && AbstractC3738.m6865((InterfaceC5295) interfaceC5309Mo9770, null, null)) ? c5751M10414 : c5751M104142).m10421(abstractC5714, Variance.OUT_VARIANCE);
                if (abstractC5714M10421 == null) {
                    return null;
                }
                if (abstractC5714M10421 != abstractC5714 && zArr != null) {
                    zArr[0] = true;
                }
                if (c7811.f19023) {
                    C6755.m11870("Type parameter descriptor is already initialized: ".concat(c7811.m12860()));
                    return null;
                }
                if (!m10388(abstractC5714M10421)) {
                    c7811.f19024.add(abstractC5714M10421);
                }
            }
            if (c7811.f19023) {
                C6755.m11870("Type parameter descriptor is already initialized: ".concat(c7811.m12860()));
                return null;
            }
            c7811.f19023 = true;
        }
        return c5751M10414;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C5751 m10361(List list, AbstractC5748 abstractC5748, InterfaceC5331 interfaceC5331, ArrayList arrayList) throws Exception {
        if (abstractC5748 == null) {
            m10372(1);
            throw null;
        }
        if (interfaceC5331 == null) {
            m10372(2);
            throw null;
        }
        if (arrayList == null) {
            m10372(3);
            throw null;
        }
        C5751 c5751M10360 = m10360(list, abstractC5748, interfaceC5331, arrayList, null);
        if (c5751M10360 != null) {
            return c5751M10360;
        }
        C6755.m11863("Substitution failed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m10362(InterfaceC8058 interfaceC8058, InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        if (interfaceC8049 == interfaceC80492) {
            return true;
        }
        InterfaceC8048 interfaceC8048Mo10200 = interfaceC8058.mo10200(interfaceC8049);
        InterfaceC8048 interfaceC8048Mo102002 = interfaceC8058.mo10200(interfaceC80492);
        if (interfaceC8048Mo10200 != null && interfaceC8048Mo102002 != null) {
            return m10363(interfaceC8058, interfaceC8048Mo10200, interfaceC8048Mo102002);
        }
        InterfaceC8050 interfaceC8050Mo10185 = interfaceC8058.mo10185(interfaceC8049);
        InterfaceC8050 interfaceC8050Mo101852 = interfaceC8058.mo10185(interfaceC80492);
        return interfaceC8050Mo10185 != null && interfaceC8050Mo101852 != null && m10363(interfaceC8058, interfaceC8058.mo10153(interfaceC8050Mo10185), interfaceC8058.mo10153(interfaceC8050Mo101852)) && m10363(interfaceC8058, interfaceC8058.mo10152(interfaceC8050Mo10185), interfaceC8058.mo10152(interfaceC8050Mo101852));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m10363(InterfaceC8058 interfaceC8058, InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        if (interfaceC8058.mo10192(interfaceC8048) == interfaceC8058.mo10192(interfaceC80482) && interfaceC8058.mo10166(interfaceC8048) == interfaceC8058.mo10166(interfaceC80482) && interfaceC8058.mo10213(interfaceC8048) == interfaceC8058.mo10213(interfaceC80482) && interfaceC8058.mo10198(interfaceC8058.mo10182(interfaceC8048), interfaceC8058.mo10182(interfaceC80482))) {
            if (interfaceC8058.mo10197(interfaceC8048, interfaceC80482)) {
                return true;
            }
            int iMo10192 = interfaceC8058.mo10192(interfaceC8048);
            for (int i = 0; i < iMo10192; i++) {
                InterfaceC8059 interfaceC8059Mo10219 = interfaceC8058.mo10219(interfaceC8048, i);
                InterfaceC8059 interfaceC8059Mo102192 = interfaceC8058.mo10219(interfaceC80482, i);
                if (interfaceC8058.mo10176(interfaceC8059Mo10219) == interfaceC8058.mo10176(interfaceC8059Mo102192)) {
                    if (!interfaceC8058.mo10176(interfaceC8059Mo10219)) {
                        if (interfaceC8058.mo10202(interfaceC8059Mo10219) == interfaceC8058.mo10202(interfaceC8059Mo102192)) {
                            InterfaceC8049 interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059Mo10219);
                            interfaceC8049Mo10199.getClass();
                            InterfaceC8049 interfaceC8049Mo101992 = interfaceC8058.mo10199(interfaceC8059Mo102192);
                            interfaceC8049Mo101992.getClass();
                            if (!m10362(interfaceC8058, interfaceC8049Mo10199, interfaceC8049Mo101992)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final AbstractC5746 m10364(AbstractC5746 abstractC5746, AbstractC5714 abstractC5714) {
        abstractC5746.getClass();
        if (abstractC5746 instanceof InterfaceC5750) {
            return m10364(((InterfaceC5750) abstractC5746).mo10337(), abstractC5714);
        }
        if (abstractC5714 == null || abstractC5714.equals(abstractC5746)) {
            return abstractC5746;
        }
        if (abstractC5746 instanceof AbstractC5710) {
            return new C5719((AbstractC5710) abstractC5746, abstractC5714);
        }
        if (abstractC5746 instanceof AbstractC5728) {
            return new C5733((AbstractC5728) abstractC5746, abstractC5714);
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final AbstractC5710 m10365(AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        abstractC5710.getClass();
        abstractC57102.getClass();
        return m10388(abstractC5710) ? abstractC5710 : new C5727(abstractC5710, abstractC57102);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final AbstractC5710 m10366(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            return ((AbstractC5728) abstractC5746Mo10331).f14562;
        }
        if (abstractC5746Mo10331 instanceof AbstractC5710) {
            return (AbstractC5710) abstractC5746Mo10331;
        }
        C5043.m9170();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC5714 m10367(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        if (abstractC5714 instanceof InterfaceC5750) {
            return ((InterfaceC5750) abstractC5714).mo10336();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC5746 m10368(AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        abstractC5710.getClass();
        abstractC57102.getClass();
        return abstractC5710.equals(abstractC57102) ? abstractC5710 : new C5732(abstractC5710, abstractC57102);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC8049 m10369(InterfaceC8049 interfaceC8049, HashSet hashSet) {
        AbstractC5710 abstractC5710;
        InterfaceC8049 interfaceC8049M10274;
        InterfaceC8049 interfaceC8049M10369;
        InterfaceC5705 interfaceC5705Mo9560;
        C5690 c5690 = C5690.f14485;
        InterfaceC8060 interfaceC8060Mo10161 = c5690.mo10161(interfaceC8049);
        if (hashSet.add(interfaceC8060Mo10161)) {
            InterfaceC5295 interfaceC5295M10257 = AbstractC5692.m10257(interfaceC8060Mo10161);
            int i = 1;
            int i2 = 0;
            if (interfaceC5295M10257 != null) {
                InterfaceC8049 interfaceC8049M10254 = AbstractC5692.m10254(interfaceC5295M10257);
                InterfaceC8049 interfaceC8049M103692 = m10369(interfaceC8049M10254, hashSet);
                if (interfaceC8049M103692 != null) {
                    if (!AbstractC5692.m10245(c5690.mo10161(interfaceC8049M10254)) && (!(interfaceC8049M10254 instanceof InterfaceC8056) || !AbstractC5692.m10231((InterfaceC8056) interfaceC8049M10254))) {
                        i = 0;
                    }
                    return ((interfaceC8049M103692 instanceof InterfaceC8056) && AbstractC5692.m10231((InterfaceC8056) interfaceC8049M103692) && AbstractC5692.m10232(interfaceC8049) && i != 0) ? c5690.m10188(interfaceC8049M10254) : (AbstractC5692.m10232(interfaceC8049M103692) || !AbstractC5692.m10242(interfaceC8049)) ? interfaceC8049M103692 : c5690.m10188(interfaceC8049M103692);
                }
            } else {
                if (!AbstractC5692.m10245(interfaceC8060Mo10161)) {
                    return interfaceC8049;
                }
                List<InterfaceC8057> listM10262 = AbstractC5692.m10262(c5690.mo10161(interfaceC8049));
                List listM10264 = AbstractC5692.m10264(interfaceC8049);
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM10264, 10));
                for (Object obj : listM10264) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC7176.m12479();
                        throw null;
                    }
                    AbstractC5714 abstractC5714M10253 = AbstractC5692.m10253(c5690, (InterfaceC8059) obj);
                    if (abstractC5714M10253 == null) {
                        abstractC5714M10253 = AbstractC5692.m10254((InterfaceC8057) listM10262.get(i2));
                    }
                    arrayList.add(abstractC5714M10253);
                    i2 = i3;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listM10262, 10));
                for (InterfaceC8057 interfaceC8057 : listM10262) {
                    interfaceC8057.getClass();
                    if (interfaceC8057 instanceof InterfaceC5295) {
                        interfaceC5705Mo9560 = ((InterfaceC5295) interfaceC8057).mo9560();
                        interfaceC5705Mo9560.getClass();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(interfaceC8057);
                        sb.append(", ");
                        C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8057.getClass(), sb));
                        interfaceC5705Mo9560 = null;
                    }
                    arrayList2.add(interfaceC5705Mo9560);
                }
                Map mapM9330 = AbstractC5171.m9330(AbstractC5176.m9380(arrayList2, arrayList));
                ArrayList arrayList3 = new ArrayList(mapM9330.size());
                for (Map.Entry entry : mapM9330.entrySet()) {
                    InterfaceC8060 interfaceC8060 = (InterfaceC8060) entry.getKey();
                    InterfaceC8049 interfaceC80492 = (InterfaceC8049) entry.getValue();
                    interfaceC8060.getClass();
                    interfaceC80492.getClass();
                    arrayList3.add(new Pair((InterfaceC5705) interfaceC8060, new C5717((AbstractC5714) interfaceC80492)));
                }
                C5751 c5751 = new C5751(new C5716(AbstractC5171.m9330(arrayList3), i));
                interfaceC8049.getClass();
                if (interfaceC8049 instanceof AbstractC5714) {
                    int i4 = AbstractC7708.f18668;
                    InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) interfaceC8049).mo10281().mo9770();
                    AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
                    if (abstractC7818 != null) {
                        int i5 = AbstractC5605.f14254;
                        AbstractC5291 abstractC5291Mo9579 = abstractC7818.mo9579();
                        C5315 c5315 = abstractC5291Mo9579 instanceof C5315 ? (C5315) abstractC5291Mo9579 : null;
                        abstractC5710 = c5315 != null ? (AbstractC5710) c5315.f13456 : null;
                        if (abstractC5710 != null) {
                            interfaceC8049M10274 = null;
                        } else {
                            InterfaceC8057 interfaceC8057M10370 = m10370(abstractC5710);
                            interfaceC8049M10274 = interfaceC8057M10370 == null ? AbstractC5692.m10274(c5751, abstractC5710) : m10359(abstractC5710, AbstractC5692.m10274(c5751, AbstractC5692.m10254(interfaceC8057M10370)));
                        }
                        if (interfaceC8049M10274 != null && (interfaceC8049M10369 = m10369(interfaceC8049M10274, hashSet)) != null) {
                            return AbstractC5692.m10232(interfaceC8049) ? interfaceC8049M10369 : AbstractC5692.m10232(interfaceC8049M10369) ? interfaceC8049 : ((interfaceC8049M10369 instanceof InterfaceC8056) && AbstractC5692.m10231((InterfaceC8056) interfaceC8049M10369)) ? interfaceC8049 : c5690.m10188(interfaceC8049M10369);
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC8049);
                    sb2.append(", ");
                    C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb2));
                }
                if (abstractC5710 != null) {
                }
                if (interfaceC8049M10274 != null) {
                    if (AbstractC5692.m10232(interfaceC8049)) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC8057 m10370(InterfaceC8049 interfaceC8049) {
        boolean zM12572;
        AbstractC5746 abstractC5746Mo10331;
        AbstractC5728 abstractC5728M10266;
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        if (abstractC5710M10265 == null && ((abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049)) == null || (abstractC5710M10265 = AbstractC5692.m10226(abstractC5728M10266)) == null)) {
            abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M10265.getClass();
        }
        InterfaceC5295 interfaceC5295M10257 = AbstractC5692.m10257(AbstractC5692.m10278(abstractC5710M10265));
        if (interfaceC5295M10257 != null) {
            return interfaceC5295M10257;
        }
        if (interfaceC8049 instanceof AbstractC5714) {
            zM12572 = AbstractC7359.m12572((AbstractC5714) interfaceC8049);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC8049);
            sb.append(", ");
            C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8049.getClass(), sb));
            zM12572 = false;
        }
        if (zM12572) {
            InterfaceC8059 interfaceC8059 = (InterfaceC8059) AbstractC5176.m9338(AbstractC5692.m10264(interfaceC8049));
            interfaceC8059.getClass();
            if (AbstractC5692.m10233(interfaceC8059)) {
                abstractC5746Mo10331 = null;
            } else {
                if (!(interfaceC8059 instanceof AbstractC5702)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC8059);
                    sb2.append(", ");
                    C6755.m11873(AbstractC3275.m5135(AbstractC5228.f13320, interfaceC8059.getClass(), sb2));
                    return null;
                }
                abstractC5746Mo10331 = ((AbstractC5702) interfaceC8059).mo10300().mo10331();
            }
            if (abstractC5746Mo10331 != null) {
                return m10370(abstractC5746Mo10331);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC5710 m10371(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        AbstractC5710 abstractC5710 = abstractC5746Mo10331 instanceof AbstractC5710 ? (AbstractC5710) abstractC5746Mo10331 : null;
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        C5043.m9151(abstractC5714, "This is should be simple type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10372(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final AbstractC5710 m10373(C5706 c5706, AbstractC7818 abstractC7818, List list) {
        c5706.getClass();
        abstractC7818.getClass();
        list.getClass();
        InterfaceC5705 interfaceC5705Mo9560 = abstractC7818.mo9560();
        interfaceC5705Mo9560.getClass();
        return m10377(list, c5706, interfaceC5705Mo9560, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C5706 m10374(C5706 c5706, InterfaceC7310 interfaceC7310) {
        C5706 c5706M10326;
        c5706.getClass();
        if (AbstractC5742.m10400(c5706) == interfaceC7310) {
            return c5706;
        }
        C6469 c6469 = AbstractC5742.f14580;
        InterfaceC5920 interfaceC5920 = AbstractC5742.f14581[0];
        c6469.getClass();
        interfaceC5920.getClass();
        C5745 c5745 = (C5745) c5706.f14522.get(c6469.f15866);
        if (c5745 != null) {
            if (c5706.isEmpty()) {
                c5706M10326 = c5706;
                if (c5706M10326 != null) {
                    c5706 = c5706M10326;
                }
            } else {
                AbstractC8112 abstractC8112 = c5706.f14522;
                ArrayList arrayList = new ArrayList();
                for (Object obj : abstractC8112) {
                    if (!AbstractC5227.m9466((C5745) obj, c5745)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != c5706.f14522.mo13059()) {
                    C5706.f14520.getClass();
                    c5706M10326 = C5707.m10326(arrayList);
                }
                if (c5706M10326 != null) {
                }
            }
        }
        if (interfaceC7310.iterator().hasNext() || !interfaceC7310.isEmpty()) {
            C5745 c57452 = new C5745(interfaceC7310);
            C5707 c5707 = C5706.f14520;
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C5745.class);
            c5707.getClass();
            String strMo9444 = interfaceC5925Mo9476.mo9444();
            strMo9444.getClass();
            if (c5706.f14522.get(c5707.m10328(strMo9444)) == null) {
                return c5706.isEmpty() ? new C5706(AbstractC7176.m12487(c57452)) : C5707.m10326(AbstractC5176.m9353(AbstractC5176.m9356(c5706), c57452));
            }
        }
        return c5706;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC5710 m10375(C5706 c5706, InterfaceC5705 interfaceC5705, List list, boolean z, InterfaceC8083 interfaceC8083, InterfaceC7387 interfaceC7387) {
        c5706.getClass();
        interfaceC5705.getClass();
        list.getClass();
        interfaceC8083.getClass();
        C5721 c5721 = new C5721(interfaceC5705, list, z, interfaceC8083, interfaceC7387);
        return c5706.isEmpty() ? c5721 : new C5720(c5721, c5706);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final AbstractC5714 m10376(InterfaceC5295 interfaceC5295) throws Exception {
        interfaceC5295.getClass();
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5295.mo9587();
        interfaceC5331Mo9587.getClass();
        int i = 0;
        if (interfaceC5331Mo9587 instanceof InterfaceC5328) {
            List parameters = ((InterfaceC5328) interfaceC5331Mo9587).mo9560().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5295) it.next()).mo9560());
            }
            List upperBounds = interfaceC5295.getUpperBounds();
            upperBounds.getClass();
            AbstractC7359 abstractC7359M10058 = AbstractC5605.m10058(interfaceC5295);
            AbstractC5714 abstractC5714M10421 = new C5751(new C5716(arrayList, i)).m10421((AbstractC5714) AbstractC5176.m9379(upperBounds), Variance.OUT_VARIANCE);
            return abstractC5714M10421 == null ? abstractC7359M10058.m12592() : abstractC5714M10421;
        }
        if (!(interfaceC5331Mo9587 instanceof InterfaceC5316)) {
            C6755.m11869("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((InterfaceC5316) interfaceC5331Mo9587).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC5295) it2.next()).mo9560());
        }
        List upperBounds2 = interfaceC5295.getUpperBounds();
        upperBounds2.getClass();
        AbstractC7359 abstractC7359M100582 = AbstractC5605.m10058(interfaceC5295);
        AbstractC5714 abstractC5714M104212 = new C5751(new C5716(arrayList2, i)).m10421((AbstractC5714) AbstractC5176.m9379(upperBounds2), Variance.OUT_VARIANCE);
        return abstractC5714M104212 == null ? abstractC7359M100582.m12592() : abstractC5714M104212;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static AbstractC5710 m10377(List list, C5706 c5706, InterfaceC5705 interfaceC5705, boolean z) {
        InterfaceC8083 interfaceC8083M7398;
        AbstractC7818 abstractC7818;
        InterfaceC8083 interfaceC8083Mo12867;
        InterfaceC8083 interfaceC8083;
        InterfaceC8083 interfaceC8083Mo9578;
        c5706.getClass();
        interfaceC5705.getClass();
        list.getClass();
        if (c5706.isEmpty() && list.isEmpty() && !z && interfaceC5705.mo9770() != null) {
            InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705.mo9770();
            interfaceC5309Mo9770.getClass();
            AbstractC5710 abstractC5710Mo9584 = interfaceC5309Mo9770.mo9584();
            abstractC5710Mo9584.getClass();
            return abstractC5710Mo9584;
        }
        InterfaceC5309 interfaceC5309Mo97702 = interfaceC5705.mo9770();
        if (interfaceC5309Mo97702 instanceof InterfaceC5295) {
            interfaceC8083M7398 = ((InterfaceC5295) interfaceC5309Mo97702).mo9584().mo10283();
        } else {
            if (interfaceC5309Mo97702 instanceof AbstractC7818) {
                int i = AbstractC5605.f14254;
                InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(interfaceC5309Mo97702);
                interfaceC5318M12663.getClass();
                AbstractC5605.m10063(interfaceC5318M12663);
                boolean zIsEmpty = list.isEmpty();
                C5681 c5681 = C5681.f14476;
                if (zIsEmpty) {
                    AbstractC7818 abstractC78182 = (AbstractC7818) interfaceC5309Mo97702;
                    abstractC7818 = abstractC78182 instanceof AbstractC7818 ? abstractC78182 : null;
                    if (abstractC7818 == null || (interfaceC8083Mo9578 = abstractC7818.mo9578(c5681)) == null) {
                        interfaceC8083M7398 = abstractC78182.mo9773();
                        interfaceC8083M7398.getClass();
                    } else {
                        interfaceC8083 = interfaceC8083Mo9578;
                    }
                } else {
                    AbstractC7818 abstractC78183 = (AbstractC7818) interfaceC5309Mo97702;
                    AbstractC5748 abstractC5748M10355 = AbstractC5701.f14508.m10355(interfaceC5705, list);
                    abstractC7818 = abstractC78183 instanceof AbstractC7818 ? abstractC78183 : null;
                    if (abstractC7818 == null || (interfaceC8083Mo12867 = abstractC7818.mo12867(abstractC5748M10355, c5681)) == null) {
                        interfaceC8083M7398 = abstractC78183.mo12868(abstractC5748M10355);
                        interfaceC8083M7398.getClass();
                    } else {
                        interfaceC8083 = interfaceC8083Mo12867;
                    }
                }
                return m10375(c5706, interfaceC5705, list, z, interfaceC8083, new C5713(list, c5706, interfaceC5705, z));
            }
            if (interfaceC5309Mo97702 instanceof AbstractC7825) {
                ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((AbstractC7825) interfaceC5309Mo97702).getName().f14050;
                str.getClass();
                interfaceC8083M7398 = C8069.m13031(errorScopeKind, true, str);
            } else {
                if (!(interfaceC5705 instanceof C5715)) {
                    C6385.m11446("Unsupported classifier: ", interfaceC5309Mo97702, " for constructor: ", interfaceC5705);
                    return null;
                }
                interfaceC8083M7398 = AbstractC3897.m7398("member scope for intersection type", ((C5715) interfaceC5705).f14537);
            }
        }
        interfaceC8083 = interfaceC8083M7398;
        return m10375(c5706, interfaceC5705, list, z, interfaceC8083, new C5713(list, c5706, interfaceC5705, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC5710 m10378(List list, C5706 c5706, InterfaceC5705 interfaceC5705, InterfaceC8083 interfaceC8083, boolean z) {
        c5706.getClass();
        interfaceC5705.getClass();
        list.getClass();
        interfaceC8083.getClass();
        C5721 c5721 = new C5721(interfaceC5705, list, z, interfaceC8083, new C5713(list, c5706, interfaceC5705, interfaceC8083, z));
        return c5706.isEmpty() ? c5721 : new C5720(c5721, c5706);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final AbstractC5710 m10379(AbstractC5746 abstractC5746) {
        C5715 c5715;
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5746.mo10281();
        C5715 c57152 = interfaceC5705Mo10281 instanceof C5715 ? (C5715) interfaceC5705Mo10281 : null;
        if (c57152 != null) {
            LinkedHashSet<AbstractC5714> linkedHashSet = c57152.f14537;
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC5714 abstractC5714M10386 : linkedHashSet) {
                if (AbstractC5749.m10403(abstractC5714M10386)) {
                    abstractC5714M10386 = m10386(abstractC5714M10386.mo10331(), false);
                    z = true;
                }
                arrayList.add(abstractC5714M10386);
            }
            if (z) {
                AbstractC5714 abstractC5714M103862 = c57152.f14539;
                if (abstractC5714M103862 == null) {
                    abstractC5714M103862 = null;
                } else if (AbstractC5749.m10403(abstractC5714M103862)) {
                    abstractC5714M103862 = m10386(abstractC5714M103862.mo10331(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c5715 = new C5715(linkedHashSet2);
                c5715.f14539 = abstractC5714M103862;
            } else {
                c5715 = null;
            }
            if (c5715 != null) {
                return c5715.m10334();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static AbstractC5714 m10380(AbstractC5714 abstractC5714, List list, InterfaceC7310 interfaceC7310, int i) {
        if ((i & 2) != 0) {
            interfaceC7310 = abstractC5714.getAnnotations();
        }
        abstractC5714.getClass();
        if ((list.isEmpty() || list == abstractC5714.mo10285()) && interfaceC7310 == abstractC5714.getAnnotations()) {
            return abstractC5714;
        }
        C5706 c5706Mo10282 = abstractC5714.mo10282();
        if ((interfaceC7310 instanceof C7313) && ((C7313) interfaceC7310).isEmpty()) {
            interfaceC7310 = C7311.f18113;
        }
        C5706 c5706M10374 = m10374(c5706Mo10282, interfaceC7310);
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5746Mo10331;
            return m10368(m10382(abstractC5728.f14561, list, c5706M10374), m10382(abstractC5728.f14562, list, c5706M10374));
        }
        if (abstractC5746Mo10331 instanceof AbstractC5710) {
            return m10382((AbstractC5710) abstractC5746Mo10331, list, c5706M10374);
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ AbstractC5710 m10381(AbstractC5710 abstractC5710, List list, C5706 c5706, int i) {
        if ((i & 1) != 0) {
            list = abstractC5710.mo10285();
        }
        if ((i & 2) != 0) {
            c5706 = abstractC5710.mo10282();
        }
        return m10382(abstractC5710, list, c5706);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC5710 m10382(AbstractC5710 abstractC5710, List list, C5706 c5706) {
        abstractC5710.getClass();
        list.getClass();
        c5706.getClass();
        if (list.isEmpty() && c5706 == abstractC5710.mo10282()) {
            return abstractC5710;
        }
        if (list.isEmpty()) {
            return abstractC5710.mo10329(c5706);
        }
        if (!(abstractC5710 instanceof C8068)) {
            return m10377(list, c5706, abstractC5710.mo10281(), abstractC5710.mo10284());
        }
        C8068 c8068 = (C8068) abstractC5710;
        InterfaceC5705 interfaceC5705 = c8068.f19629;
        C8061 c8061 = c8068.f19630;
        ErrorTypeKind errorTypeKind = c8068.f19625;
        boolean z = c8068.f19627;
        String[] strArr = c8068.f19628;
        return new C8068(interfaceC5705, c8061, errorTypeKind, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC5746 m10383(AbstractC5746 abstractC5746, AbstractC5714 abstractC5714) {
        abstractC5746.getClass();
        abstractC5714.getClass();
        return m10364(abstractC5746, m10367(abstractC5714));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m10384(C5704 c5704, InterfaceC8048 interfaceC8048, AbstractC5725 abstractC5725) {
        C5708 c5708 = C5708.f14526;
        c5704.getClass();
        interfaceC8048.getClass();
        InterfaceC8058 interfaceC8058 = c5704.f14515;
        if ((interfaceC8058.mo10222(interfaceC8048) && !interfaceC8058.mo10166(interfaceC8048)) || interfaceC8058.mo10213(interfaceC8048)) {
            return true;
        }
        c5704.m10322();
        ArrayDeque arrayDeque = c5704.f14519;
        arrayDeque.getClass();
        C8102 c8102 = c5704.f14518;
        c8102.getClass();
        arrayDeque.push(interfaceC8048);
        while (!arrayDeque.isEmpty()) {
            InterfaceC8048 interfaceC80482 = (InterfaceC8048) arrayDeque.pop();
            interfaceC80482.getClass();
            if (c8102.add(interfaceC80482)) {
                AbstractC5725 abstractC57252 = interfaceC8058.mo10166(interfaceC80482) ? c5708 : abstractC5725;
                if (abstractC57252.equals(c5708)) {
                    abstractC57252 = null;
                }
                if (abstractC57252 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC8058.mo10218(interfaceC8058.mo10182(interfaceC80482)).iterator();
                    while (it.hasNext()) {
                        InterfaceC8048 interfaceC8048Mo10156 = abstractC57252.mo10156(c5704, (InterfaceC8049) it.next());
                        if ((interfaceC8058.mo10222(interfaceC8048Mo10156) && !interfaceC8058.mo10166(interfaceC8048Mo10156)) || interfaceC8058.mo10213(interfaceC8048Mo10156)) {
                            c5704.m10324();
                            return true;
                        }
                        arrayDeque.add(interfaceC8048Mo10156);
                    }
                }
            }
        }
        c5704.m10324();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC5710 m10385(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            return ((AbstractC5728) abstractC5746Mo10331).f14561;
        }
        if (abstractC5746Mo10331 instanceof AbstractC5710) {
            return (AbstractC5710) abstractC5746Mo10331;
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC5746 m10386(AbstractC5746 abstractC5746, boolean z) {
        abstractC5746.getClass();
        C5738 c5738M10348 = C5723.m10348(abstractC5746, z);
        if (c5738M10348 != null) {
            return c5738M10348;
        }
        AbstractC5710 abstractC5710M10379 = m10379(abstractC5746);
        return abstractC5710M10379 != null ? abstractC5710M10379 : abstractC5746.mo10290(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m10387(C5704 c5704, InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
        InterfaceC8058 interfaceC8058 = c5704.f14515;
        if (interfaceC8058.mo10174(interfaceC8048)) {
            return true;
        }
        if (interfaceC8058.mo10166(interfaceC8048)) {
            return false;
        }
        if (c5704.f14516) {
            interfaceC8058.mo10189(interfaceC8048);
        }
        return interfaceC8058.mo10198(interfaceC8058.mo10182(interfaceC8048), interfaceC8060);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10388(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof C8068) {
            return true;
        }
        return (abstractC5746Mo10331 instanceof AbstractC5728) && (((AbstractC5728) abstractC5746Mo10331).mo10395() instanceof C8068);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract InterfaceC8048 mo10156(C5704 c5704, InterfaceC8049 interfaceC8049);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract InterfaceC8049 mo10148(InterfaceC8049 interfaceC8049);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract InterfaceC8049 mo10145(InterfaceC8049 interfaceC8049);
}
