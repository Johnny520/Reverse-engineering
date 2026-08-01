package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.animation.core.C1171;
import io.ktor.util.C5043;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.checker.C5690;
import kotlin.reflect.jvm.internal.impl.types.checker.C5696;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p050.AbstractC7176;
import p062.C7314;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p095.AbstractC7825;
import p095.C7811;
import p095.C7826;
import p112.C8047;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8052;
import p113.InterfaceC8053;
import p113.InterfaceC8055;
import p113.InterfaceC8057;
import p113.InterfaceC8058;
import p113.InterfaceC8059;
import p113.InterfaceC8060;
import p114.C8069;
import p117.C8084;
import p119.C8102;
import p119.C8103;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5723 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5723 f14556 = new C5723();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static List m10341(C5704 c5704, InterfaceC8058 interfaceC8058, InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
        int i;
        List listM10342 = m10342(c5704, interfaceC8058, interfaceC8048, interfaceC8060);
        if (listM10342.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM10342) {
                InterfaceC8048 interfaceC80482 = (InterfaceC8048) obj;
                interfaceC80482.getClass();
                InterfaceC8055 interfaceC8055Mo10191 = interfaceC8058.mo10191(interfaceC80482);
                int iMo10183 = interfaceC8058.mo10183(interfaceC8055Mo10191);
                while (true) {
                    if (i >= iMo10183) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC8059 interfaceC8059Mo10208 = interfaceC8058.mo10208(interfaceC8055Mo10191, i);
                    interfaceC8059Mo10208.getClass();
                    InterfaceC8049 interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059Mo10208);
                    i = (interfaceC8049Mo10199 != null ? interfaceC8058.mo10185(interfaceC8049Mo10199) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listM10342;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m10342(C5704 c5704, InterfaceC8058 interfaceC8058, InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
        AbstractC5725 abstractC5725Mo10204;
        C5708 c5708 = C5708.f14526;
        interfaceC8058.getClass();
        interfaceC8058.mo10196(interfaceC8048, interfaceC8060);
        if (!interfaceC8058.mo10178(interfaceC8060) && interfaceC8058.mo10222(interfaceC8048)) {
            return EmptyList.INSTANCE;
        }
        if (interfaceC8058.mo10211(interfaceC8060)) {
            if (!interfaceC8058.mo10198(interfaceC8058.mo10182(interfaceC8048), interfaceC8060)) {
                return EmptyList.INSTANCE;
            }
            InterfaceC8048 interfaceC8048Mo10186 = interfaceC8058.mo10186(interfaceC8048, CaptureStatus.FOR_SUBTYPING);
            if (interfaceC8048Mo10186 != null) {
                interfaceC8048 = interfaceC8048Mo10186;
            }
            return AbstractC7176.m12487(interfaceC8048);
        }
        C8103 c8103 = new C8103();
        c5704.m10322();
        InterfaceC8058 interfaceC80582 = c5704.f14515;
        ArrayDeque arrayDeque = c5704.f14519;
        arrayDeque.getClass();
        C8102 c8102 = c5704.f14518;
        c8102.getClass();
        arrayDeque.push(interfaceC8048);
        while (!arrayDeque.isEmpty()) {
            InterfaceC8048 interfaceC80482 = (InterfaceC8048) arrayDeque.pop();
            interfaceC80482.getClass();
            if (c8102.add(interfaceC80482)) {
                InterfaceC8048 interfaceC8048Mo101862 = interfaceC8058.mo10186(interfaceC80482, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC8048Mo101862 == null) {
                    interfaceC8048Mo101862 = interfaceC80482;
                }
                if (interfaceC8058.mo10198(interfaceC8058.mo10182(interfaceC8048Mo101862), interfaceC8060)) {
                    c8103.add(interfaceC8048Mo101862);
                    abstractC5725Mo10204 = c5708;
                } else {
                    abstractC5725Mo10204 = interfaceC8058.mo10192(interfaceC8048Mo101862) == 0 ? C5708.f14527 : interfaceC80582.mo10204(interfaceC8048Mo101862);
                }
                if (abstractC5725Mo10204.equals(c5708)) {
                    abstractC5725Mo10204 = null;
                }
                if (abstractC5725Mo10204 != null) {
                    Iterator it = interfaceC80582.mo10218(interfaceC80582.mo10182(interfaceC80482)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC5725Mo10204.mo10156(c5704, (InterfaceC8049) it.next()));
                    }
                }
            }
        }
        c5704.m10324();
        return c8103;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m10343(InterfaceC8058 interfaceC8058, C5704 c5704, InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482, boolean z) {
        interfaceC8058.getClass();
        Collection<InterfaceC8049> collectionMo10221 = interfaceC8058.mo10221(interfaceC8048);
        if ((collectionMo10221 instanceof Collection) && collectionMo10221.isEmpty()) {
            return false;
        }
        for (InterfaceC8049 interfaceC8049 : collectionMo10221) {
            interfaceC8049.getClass();
            if (AbstractC5227.m9466(interfaceC8058.mo10161(interfaceC8049), interfaceC8058.mo10182(interfaceC80482))) {
                return true;
            }
            if (z && m10345(f14556, c5704, interfaceC80482, interfaceC8049)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m10344(InterfaceC8058 interfaceC8058, InterfaceC8048 interfaceC8048) {
        interfaceC8058.getClass();
        if (!interfaceC8058.mo10181(interfaceC8048)) {
            if (!(interfaceC8048 instanceof InterfaceC8052)) {
                return false;
            }
            InterfaceC8053 interfaceC8053Mo10201 = interfaceC8058.mo10201((InterfaceC8052) interfaceC8048);
            interfaceC8053Mo10201.getClass();
            InterfaceC8059 interfaceC8059Mo10216 = interfaceC8058.mo10216(interfaceC8053Mo10201);
            interfaceC8059Mo10216.getClass();
            InterfaceC8049 interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059Mo10216);
            if (interfaceC8049Mo10199 == null || !interfaceC8058.mo10181(interfaceC8058.mo10170(interfaceC8049Mo10199))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m10345(C5723 c5723, C5704 c5704, InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        interfaceC8049.getClass();
        interfaceC80492.getClass();
        if (interfaceC8049 == interfaceC80492) {
            return true;
        }
        if (!c5704.m10323(interfaceC8049, interfaceC80492)) {
            return false;
        }
        return f14556.m10352(c5704, c5704.f14515, interfaceC8049, interfaceC80492);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m10346(C5704 c5704, InterfaceC8058 interfaceC8058, InterfaceC8055 interfaceC8055, InterfaceC8048 interfaceC8048) {
        boolean zM10349;
        interfaceC8058.getClass();
        interfaceC8055.getClass();
        InterfaceC8060 interfaceC8060Mo10182 = interfaceC8058.mo10182(interfaceC8048);
        int iMo10183 = interfaceC8058.mo10183(interfaceC8055);
        interfaceC8060Mo10182.getClass();
        int iMo10180 = interfaceC8058.mo10180(interfaceC8060Mo10182);
        if (iMo10183 == iMo10180 && iMo10183 == interfaceC8058.mo10192(interfaceC8048)) {
            for (int i = 0; i < iMo10180; i++) {
                InterfaceC8059 interfaceC8059Mo10219 = interfaceC8058.mo10219(interfaceC8048, i);
                interfaceC8059Mo10219.getClass();
                InterfaceC8049 interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059Mo10219);
                if (interfaceC8049Mo10199 != null) {
                    InterfaceC8059 interfaceC8059Mo10208 = interfaceC8058.mo10208(interfaceC8055, i);
                    interfaceC8059Mo10208.getClass();
                    interfaceC8058.mo10202(interfaceC8059Mo10208);
                    TypeVariance typeVariance = TypeVariance.INV;
                    InterfaceC8049 interfaceC8049Mo101992 = interfaceC8058.mo10199(interfaceC8059Mo10208);
                    interfaceC8049Mo101992.getClass();
                    TypeVariance typeVarianceMo10217 = interfaceC8058.mo10217(interfaceC8058.mo10212(interfaceC8060Mo10182, i));
                    TypeVariance typeVarianceMo10202 = interfaceC8058.mo10202(interfaceC8059Mo10219);
                    typeVarianceMo10217.getClass();
                    typeVarianceMo10202.getClass();
                    if (typeVarianceMo10217 == typeVariance) {
                        typeVarianceMo10217 = typeVarianceMo10202;
                    } else if (typeVarianceMo10202 != typeVariance && typeVarianceMo10217 != typeVarianceMo10202) {
                        typeVarianceMo10217 = null;
                    }
                    if (typeVarianceMo10217 == null) {
                        return c5704.f14517;
                    }
                    if (typeVarianceMo10217 == typeVariance) {
                        m10347(interfaceC8058, interfaceC8049Mo101992, interfaceC8049Mo10199);
                        m10347(interfaceC8058, interfaceC8049Mo10199, interfaceC8049Mo101992);
                    }
                    int i2 = c5704.f14512;
                    if (i2 > 100) {
                        C5043.m9151(interfaceC8049Mo101992, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    c5704.f14512 = i2 + 1;
                    int i3 = AbstractC5724.f14558[typeVarianceMo10217.ordinal()];
                    if (i3 != 1) {
                        C5723 c5723 = f14556;
                        if (i3 == 2) {
                            zM10349 = m10345(c5723, c5704, interfaceC8049Mo101992, interfaceC8049Mo10199);
                        } else {
                            if (i3 != 3) {
                                C5043.m9170();
                                return false;
                            }
                            zM10349 = m10345(c5723, c5704, interfaceC8049Mo10199, interfaceC8049Mo101992);
                        }
                    } else {
                        zM10349 = m10349(c5704, interfaceC8049Mo101992, interfaceC8049Mo10199);
                    }
                    c5704.f14512--;
                    if (!zM10349) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m10347(InterfaceC8058 interfaceC8058, InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        interfaceC8058.getClass();
        InterfaceC8048 interfaceC8048Mo10200 = interfaceC8058.mo10200(interfaceC8049);
        if (interfaceC8048Mo10200 instanceof InterfaceC8052) {
            InterfaceC8052 interfaceC8052 = (InterfaceC8052) interfaceC8048Mo10200;
            if (interfaceC8058.mo10167(interfaceC8052)) {
                return;
            }
            InterfaceC8053 interfaceC8053Mo10201 = interfaceC8058.mo10201(interfaceC8052);
            interfaceC8053Mo10201.getClass();
            InterfaceC8059 interfaceC8059Mo10216 = interfaceC8058.mo10216(interfaceC8053Mo10201);
            interfaceC8059Mo10216.getClass();
            if (interfaceC8058.mo10176(interfaceC8059Mo10216) && interfaceC8058.mo10190(interfaceC8052) == CaptureStatus.FOR_SUBTYPING) {
                interfaceC8058.mo10161(interfaceC80492);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C5738 m10348(AbstractC5746 abstractC5746, boolean z) {
        boolean zM10403;
        abstractC5746.getClass();
        if (abstractC5746 instanceof C5738) {
            return (C5738) abstractC5746;
        }
        abstractC5746.mo10281();
        if ((abstractC5746.mo10281().mo9770() instanceof InterfaceC5295) || (abstractC5746 instanceof C5696)) {
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5746.mo10281().mo9770();
            C7811 c7811 = interfaceC5309Mo9770 instanceof C7811 ? (C7811) interfaceC5309Mo9770 : null;
            zM10403 = true;
            if (c7811 == null || c7811.f19023) {
                zM10403 = (z && (abstractC5746.mo10281().mo9770() instanceof InterfaceC5295)) ? AbstractC5749.m10403(abstractC5746) : true ^ AbstractC5725.m10384(C5690.f14485.m10187(), AbstractC5725.m10385(abstractC5746), C5708.f14527);
            }
        } else {
            zM10403 = false;
        }
        if (!zM10403) {
            return null;
        }
        if (abstractC5746 instanceof AbstractC5728) {
            AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5746;
            AbstractC5227.m9466(abstractC5728.f14561.mo10281(), abstractC5728.f14562.mo10281());
        }
        return new C5738(AbstractC5725.m10385(abstractC5746).mo10290(false), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m10349(C5704 c5704, InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        AbstractC5725 abstractC5725 = c5704.f14514;
        AbstractC5725 abstractC57252 = c5704.f14513;
        interfaceC8049.getClass();
        interfaceC80492.getClass();
        InterfaceC8058 interfaceC8058 = c5704.f14515;
        if (interfaceC8049 == interfaceC80492) {
            return true;
        }
        if (m10351(interfaceC8058, interfaceC8049) && m10351(interfaceC8058, interfaceC80492)) {
            InterfaceC8049 interfaceC8049Mo10148 = abstractC5725.mo10148(abstractC57252.mo10145(interfaceC8049));
            InterfaceC8049 interfaceC8049Mo101482 = abstractC5725.mo10148(abstractC57252.mo10145(interfaceC80492));
            InterfaceC8048 interfaceC8048Mo10164 = interfaceC8058.mo10164(interfaceC8049Mo10148);
            if (!interfaceC8058.mo10198(interfaceC8058.mo10161(interfaceC8049Mo10148), interfaceC8058.mo10161(interfaceC8049Mo101482))) {
                return false;
            }
            if (interfaceC8058.mo10192(interfaceC8048Mo10164) == 0) {
                return interfaceC8058.mo10179(interfaceC8049Mo10148) || interfaceC8058.mo10179(interfaceC8049Mo101482) || interfaceC8058.mo10166(interfaceC8048Mo10164) == interfaceC8058.mo10166(interfaceC8058.mo10164(interfaceC8049Mo101482));
            }
        }
        C5723 c5723 = f14556;
        return m10345(c5723, c5704, interfaceC8049, interfaceC80492) && m10345(c5723, c5704, interfaceC80492, interfaceC8049);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r7 = r6.mo10161(r7);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r6.mo10212(r7, r2);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC8057 m10350(InterfaceC8058 interfaceC8058, InterfaceC8049 interfaceC8049, InterfaceC8048 interfaceC8048) {
        InterfaceC8049 interfaceC8049Mo10199;
        interfaceC8058.getClass();
        int iMo10192 = interfaceC8058.mo10192(interfaceC8049);
        int i = 0;
        while (true) {
            if (i >= iMo10192) {
                return null;
            }
            InterfaceC8059 interfaceC8059Mo10219 = interfaceC8058.mo10219(interfaceC8049, i);
            interfaceC8059Mo10219.getClass();
            InterfaceC8059 interfaceC8059 = interfaceC8058.mo10176(interfaceC8059Mo10219) ? null : interfaceC8059Mo10219;
            if (interfaceC8059 != null && (interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059)) != null) {
                boolean z = interfaceC8058.mo10172(interfaceC8058.mo10164(interfaceC8049Mo10199)) && interfaceC8058.mo10172(interfaceC8058.mo10164(interfaceC8048));
                if (interfaceC8049Mo10199.equals(interfaceC8048) || (z && AbstractC5227.m9466(interfaceC8058.mo10161(interfaceC8049Mo10199), interfaceC8058.mo10161(interfaceC8048)))) {
                    break;
                }
                InterfaceC8057 interfaceC8057M10350 = m10350(interfaceC8058, interfaceC8049Mo10199, interfaceC8048);
                if (interfaceC8057M10350 != null) {
                    return interfaceC8057M10350;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m10351(InterfaceC8058 interfaceC8058, InterfaceC8049 interfaceC8049) {
        interfaceC8058.getClass();
        interfaceC8049.getClass();
        InterfaceC8060 interfaceC8060Mo10161 = interfaceC8058.mo10161(interfaceC8049);
        interfaceC8060Mo10161.getClass();
        if (!interfaceC8058.mo10214(interfaceC8060Mo10161)) {
            return false;
        }
        interfaceC8058.mo10168(interfaceC8049);
        return (interfaceC8058.mo10194(interfaceC8049) || interfaceC8058.mo10163(interfaceC8049) || interfaceC8058.mo10193(interfaceC8049)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0468, code lost:
    
        if (r0 == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x046b, code lost:
    
        r0 = r9.iterator();
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0475, code lost:
    
        if (r0.hasNext() == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0477, code lost:
    
        r4 = (p113.InterfaceC8048) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x047d, code lost:
    
        if (r9 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0480, code lost:
    
        r4.getClass();
        r9 = m10346(r18, r19, r19.mo10191(r4), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x048d, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:?, code lost:
    
        return r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a6 A[EDGE_INSN: B:336:0x02a6->B:171:0x02a6 BREAK  A[LOOP:11: B:162:0x0284->B:337:0x0284]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m10352(C5704 c5704, InterfaceC8058 interfaceC8058, InterfaceC8049 interfaceC8049, InterfaceC8049 interfaceC80492) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z;
        List<InterfaceC8048> listM10342;
        C5708 c5708;
        int size;
        boolean z2;
        boolean zM10346;
        InterfaceC8049 interfaceC8049Mo10199;
        InterfaceC8060 interfaceC8060Mo10182;
        InterfaceC8057 interfaceC8057M10350;
        boolean z3;
        interfaceC8049.getClass();
        AbstractC5725 abstractC5725 = c5704.f14513;
        InterfaceC8049 interfaceC8049Mo10145 = abstractC5725.mo10145(interfaceC8049);
        AbstractC5725 abstractC57252 = c5704.f14514;
        InterfaceC8049 interfaceC8049Mo10148 = abstractC57252.mo10148(interfaceC8049Mo10145);
        interfaceC80492.getClass();
        InterfaceC8049 interfaceC8049Mo101482 = abstractC57252.mo10148(abstractC5725.mo10145(interfaceC80492));
        interfaceC8058.getClass();
        interfaceC8049Mo10148.getClass();
        InterfaceC8048 interfaceC8048Mo10164 = interfaceC8058.mo10164(interfaceC8049Mo10148);
        interfaceC8049Mo101482.getClass();
        InterfaceC8048 interfaceC8048Mo10170 = interfaceC8058.mo10170(interfaceC8049Mo101482);
        boolean z4 = true;
        boolean z5 = false;
        if (!interfaceC8058.mo10207(interfaceC8048Mo10164) && !interfaceC8058.mo10207(interfaceC8048Mo10170)) {
            interfaceC8058.mo10195(interfaceC8048Mo10164);
            interfaceC8058.mo10189(interfaceC8048Mo10164);
            interfaceC8058.mo10189(interfaceC8048Mo10170);
            InterfaceC8052 interfaceC8052Mo10169 = interfaceC8058.mo10169(interfaceC8048Mo10170);
            InterfaceC8049 interfaceC8049Mo10209 = interfaceC8052Mo10169 != null ? interfaceC8058.mo10209(interfaceC8052Mo10169) : null;
            if (interfaceC8052Mo10169 == null || interfaceC8049Mo10209 == null) {
                interfaceC8060Mo10182 = interfaceC8058.mo10182(interfaceC8048Mo10170);
                interfaceC8060Mo10182.getClass();
                if (interfaceC8058.mo10184(interfaceC8060Mo10182)) {
                    InterfaceC8060 interfaceC8060Mo101822 = interfaceC8058.mo10182(interfaceC8048Mo10164);
                    if (!(interfaceC8048Mo10164 instanceof InterfaceC8052)) {
                        interfaceC8060Mo101822.getClass();
                        if (interfaceC8058.mo10184(interfaceC8060Mo101822)) {
                            Collection collectionMo10218 = interfaceC8058.mo10218(interfaceC8060Mo101822);
                            if ((collectionMo10218 instanceof Collection) && collectionMo10218.isEmpty()) {
                                interfaceC8057M10350 = m10350(interfaceC8058, interfaceC8048Mo10170, interfaceC8048Mo10164);
                                if (interfaceC8057M10350 != null) {
                                }
                            } else {
                                Iterator it = collectionMo10218.iterator();
                                while (it.hasNext()) {
                                    if (!(((InterfaceC8049) it.next()) instanceof InterfaceC8052)) {
                                        break;
                                    }
                                }
                                interfaceC8057M10350 = m10350(interfaceC8058, interfaceC8048Mo10170, interfaceC8048Mo10164);
                                if (interfaceC8057M10350 != null || !interfaceC8058.mo10210(interfaceC8057M10350, interfaceC8058.mo10182(interfaceC8048Mo10170))) {
                                    break;
                                }
                                boolValueOf = Boolean.TRUE;
                            }
                        }
                        boolValueOf = null;
                    }
                } else {
                    interfaceC8058.mo10166(interfaceC8048Mo10170);
                    Collection collectionMo102182 = interfaceC8058.mo10218(interfaceC8060Mo10182);
                    if ((collectionMo102182 instanceof Collection) && collectionMo102182.isEmpty()) {
                        z3 = true;
                        boolValueOf = Boolean.valueOf(z3);
                    } else {
                        Iterator it2 = collectionMo102182.iterator();
                        while (it2.hasNext()) {
                            if (!m10345(f14556, c5704, interfaceC8048Mo10164, (InterfaceC8049) it2.next())) {
                                z3 = false;
                                break;
                            }
                        }
                        z3 = true;
                        boolValueOf = Boolean.valueOf(z3);
                    }
                }
            } else {
                if (interfaceC8058.mo10166(interfaceC8048Mo10170)) {
                    interfaceC8049Mo10209 = interfaceC8058.mo10175(interfaceC8049Mo10209);
                } else if (interfaceC8058.mo10213(interfaceC8048Mo10170)) {
                    interfaceC8049Mo10209 = interfaceC8058.mo10177(interfaceC8049Mo10209);
                }
                int i = AbstractC5724.f14557[TypeCheckerState$LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C5043.m9170();
                            return false;
                        }
                    } else if (m10345(this, c5704, interfaceC8048Mo10164, interfaceC8049Mo10209)) {
                        boolValueOf = Boolean.TRUE;
                    }
                    interfaceC8060Mo10182 = interfaceC8058.mo10182(interfaceC8048Mo10170);
                    interfaceC8060Mo10182.getClass();
                    if (interfaceC8058.mo10184(interfaceC8060Mo10182)) {
                    }
                } else {
                    boolValueOf = Boolean.valueOf(m10345(this, c5704, interfaceC8048Mo10164, interfaceC8049Mo10209));
                }
            }
        } else if (c5704.f14517) {
            boolValueOf = Boolean.TRUE;
        } else if (!interfaceC8058.mo10166(interfaceC8048Mo10164) || interfaceC8058.mo10166(interfaceC8048Mo10170)) {
            if (!interfaceC8058.mo10207(interfaceC8048Mo10164)) {
                interfaceC8048Mo10164 = interfaceC8058.mo10154(interfaceC8048Mo10164);
            }
            if (!interfaceC8058.mo10207(interfaceC8048Mo10170)) {
                interfaceC8048Mo10170 = interfaceC8058.mo10154(interfaceC8048Mo10170);
            }
            interfaceC8048Mo10164.getClass();
            interfaceC8048Mo10170.getClass();
            boolValueOf = Boolean.valueOf(AbstractC5725.m10362(interfaceC8058, interfaceC8048Mo10164, interfaceC8048Mo10170));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        InterfaceC8048 interfaceC8048Mo101642 = interfaceC8058.mo10164(interfaceC8049Mo10148);
        InterfaceC8048 interfaceC8048Mo101702 = interfaceC8058.mo10170(interfaceC8049Mo101482);
        C5708 c57082 = C5708.f14526;
        C5708 c57083 = C5708.f14527;
        InterfaceC8058 interfaceC80582 = c5704.f14515;
        if (!interfaceC80582.mo10166(interfaceC8048Mo101702) && !interfaceC80582.mo10163(interfaceC8048Mo101642) && !interfaceC80582.mo10213(interfaceC8048Mo101642) && ((!(interfaceC8048Mo101642 instanceof InterfaceC8052) || !interfaceC80582.mo10215((InterfaceC8052) interfaceC8048Mo101642)) && !AbstractC5725.m10384(c5704, interfaceC8048Mo101642, c57083))) {
            if (interfaceC80582.mo10213(interfaceC8048Mo101702) || AbstractC5725.m10384(c5704, interfaceC8048Mo101702, C5708.f14525) || interfaceC80582.mo10222(interfaceC8048Mo101642)) {
                return false;
            }
            InterfaceC8060 interfaceC8060Mo101823 = interfaceC80582.mo10182(interfaceC8048Mo101702);
            interfaceC8060Mo101823.getClass();
            if (!AbstractC5725.m10387(c5704, interfaceC8048Mo101642, interfaceC8060Mo101823)) {
                c5704.m10322();
                ArrayDeque arrayDeque = c5704.f14519;
                arrayDeque.getClass();
                C8102 c8102 = c5704.f14518;
                c8102.getClass();
                arrayDeque.push(interfaceC8048Mo101642);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC8048 interfaceC8048 = (InterfaceC8048) arrayDeque.pop();
                    interfaceC8048.getClass();
                    if (c8102.add(interfaceC8048)) {
                        C5708 c57084 = interfaceC80582.mo10166(interfaceC8048) ? c57082 : c57083;
                        if (c57084.equals(c57082)) {
                            c57084 = null;
                        }
                        if (c57084 == null) {
                            continue;
                        } else {
                            Iterator it3 = interfaceC80582.mo10218(interfaceC80582.mo10182(interfaceC8048)).iterator();
                            while (it3.hasNext()) {
                                InterfaceC8048 interfaceC8048Mo10156 = c57084.mo10156(c5704, (InterfaceC8049) it3.next());
                                if (AbstractC5725.m10387(c5704, interfaceC8048Mo10156, interfaceC8060Mo101823)) {
                                    c5704.m10324();
                                } else {
                                    arrayDeque.add(interfaceC8048Mo10156);
                                }
                            }
                        }
                    }
                }
                c5704.m10324();
                return false;
            }
        }
        if (interfaceC8058.mo10181(interfaceC8048Mo101642) || interfaceC8058.mo10181(interfaceC8048Mo101702)) {
            if (m10344(interfaceC8058, interfaceC8048Mo101642) && m10344(interfaceC8058, interfaceC8048Mo101702)) {
                bool = Boolean.TRUE;
            } else if (interfaceC8058.mo10181(interfaceC8048Mo101642)) {
                bool = m10343(interfaceC8058, c5704, interfaceC8048Mo101642, interfaceC8048Mo101702, false) ? Boolean.TRUE : null;
            } else if (interfaceC8058.mo10181(interfaceC8048Mo101702)) {
                InterfaceC8060 interfaceC8060Mo101824 = interfaceC8058.mo10182(interfaceC8048Mo101642);
                if (interfaceC8060Mo101824 instanceof C5715) {
                    Collection<InterfaceC8049> collectionMo102183 = interfaceC8058.mo10218(interfaceC8060Mo101824);
                    if (!(collectionMo102183 instanceof Collection) || !collectionMo102183.isEmpty()) {
                        for (InterfaceC8049 interfaceC80493 : collectionMo102183) {
                            interfaceC80493.getClass();
                            InterfaceC8048 interfaceC8048Mo10200 = interfaceC8058.mo10200(interfaceC80493);
                            if (interfaceC8048Mo10200 != null && interfaceC8058.mo10181(interfaceC8048Mo10200)) {
                                break;
                            }
                        }
                        if (!m10343(interfaceC8058, c5704, interfaceC8048Mo101702, interfaceC8048Mo101642, true)) {
                            bool = Boolean.TRUE;
                        }
                    } else if (!m10343(interfaceC8058, c5704, interfaceC8048Mo101702, interfaceC8048Mo101642, true)) {
                    }
                }
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC8060 interfaceC8060Mo101825 = interfaceC8058.mo10182(interfaceC8048Mo101702);
        if (interfaceC8058.mo10198(interfaceC8058.mo10182(interfaceC8048Mo101642), interfaceC8060Mo101825)) {
            interfaceC8060Mo101825.getClass();
            if (interfaceC8058.mo10180(interfaceC8060Mo101825) != 0) {
                InterfaceC8060 interfaceC8060Mo101826 = interfaceC8058.mo10182(interfaceC8048Mo101702);
                interfaceC8060Mo101826.getClass();
                if (!interfaceC8058.mo10206(interfaceC8060Mo101826)) {
                    interfaceC8060Mo101825.getClass();
                    if (interfaceC80582.mo10222(interfaceC8048Mo101642)) {
                        listM10342 = m10341(c5704, interfaceC80582, interfaceC8048Mo101642, interfaceC8060Mo101825);
                    } else {
                        if (interfaceC80582.mo10178(interfaceC8060Mo101825) || interfaceC80582.mo10162(interfaceC8060Mo101825)) {
                            C8103<InterfaceC8048> c8103 = new C8103();
                            c5704.m10322();
                            ArrayDeque arrayDeque2 = c5704.f14519;
                            arrayDeque2.getClass();
                            C8102 c81022 = c5704.f14518;
                            c81022.getClass();
                            arrayDeque2.push(interfaceC8048Mo101642);
                            while (!arrayDeque2.isEmpty()) {
                                InterfaceC8048 interfaceC80482 = (InterfaceC8048) arrayDeque2.pop();
                                interfaceC80482.getClass();
                                if (c81022.add(interfaceC80482)) {
                                    if (interfaceC80582.mo10222(interfaceC80482)) {
                                        c8103.add(interfaceC80482);
                                        c5708 = c57082;
                                    } else {
                                        c5708 = c57083;
                                    }
                                    if (c5708.equals(c57082)) {
                                        c5708 = null;
                                    }
                                    if (c5708 != null) {
                                        Iterator it4 = interfaceC80582.mo10218(interfaceC80582.mo10182(interfaceC80482)).iterator();
                                        while (it4.hasNext()) {
                                            arrayDeque2.add(c5708.mo10156(c5704, (InterfaceC8049) it4.next()));
                                            z5 = z5;
                                        }
                                    }
                                }
                            }
                            z = z5;
                            c5704.m10324();
                            ArrayList arrayList = new ArrayList();
                            for (InterfaceC8048 interfaceC80483 : c8103) {
                                interfaceC80483.getClass();
                                AbstractC5176.m9363(m10341(c5704, interfaceC80582, interfaceC80483, interfaceC8060Mo101825), arrayList);
                            }
                            listM10342 = arrayList;
                            listM10342.size();
                            ArrayList<InterfaceC8048> arrayList2 = new ArrayList(AbstractC5177.m9381(listM10342, 10));
                            for (InterfaceC8048 interfaceC80484 : listM10342) {
                                interfaceC80484.getClass();
                                InterfaceC8049 interfaceC8049Mo101483 = c5704.f14514.mo10148(interfaceC80484);
                                interfaceC8049Mo101483.getClass();
                                InterfaceC8048 interfaceC8048Mo102002 = interfaceC8058.mo10200(interfaceC8049Mo101483);
                                if (interfaceC8048Mo102002 != null) {
                                    interfaceC80484 = interfaceC8048Mo102002;
                                }
                                arrayList2.add(interfaceC80484);
                            }
                            size = arrayList2.size();
                            if (size != 0) {
                                InterfaceC8060 interfaceC8060Mo101827 = interfaceC8058.mo10182(interfaceC8048Mo101642);
                                interfaceC8060Mo101827.getClass();
                                if (interfaceC8058.mo10178(interfaceC8060Mo101827)) {
                                    return interfaceC8058.mo10165(interfaceC8060Mo101827);
                                }
                                InterfaceC8060 interfaceC8060Mo101828 = interfaceC8058.mo10182(interfaceC8048Mo101642);
                                interfaceC8060Mo101828.getClass();
                                if (interfaceC8058.mo10165(interfaceC8060Mo101828)) {
                                    return true;
                                }
                                c5704.m10322();
                                ArrayDeque arrayDeque3 = c5704.f14519;
                                arrayDeque3.getClass();
                                C8102 c81023 = c5704.f14518;
                                c81023.getClass();
                                arrayDeque3.push(interfaceC8048Mo101642);
                                while (!arrayDeque3.isEmpty()) {
                                    InterfaceC8048 interfaceC80485 = (InterfaceC8048) arrayDeque3.pop();
                                    interfaceC80485.getClass();
                                    if (c81023.add(interfaceC80485)) {
                                        C5708 c57085 = interfaceC8058.mo10222(interfaceC80485) ? c57082 : c57083;
                                        if (c57085.equals(c57082)) {
                                            c57085 = null;
                                        }
                                        if (c57085 == null) {
                                            continue;
                                        } else {
                                            Iterator it5 = interfaceC80582.mo10218(interfaceC80582.mo10182(interfaceC80485)).iterator();
                                            while (it5.hasNext()) {
                                                InterfaceC8048 interfaceC8048Mo101562 = c57085.mo10156(c5704, (InterfaceC8049) it5.next());
                                                interfaceC8048Mo101562.getClass();
                                                InterfaceC8060 interfaceC8060Mo101829 = interfaceC8058.mo10182(interfaceC8048Mo101562);
                                                interfaceC8060Mo101829.getClass();
                                                if (interfaceC8058.mo10165(interfaceC8060Mo101829)) {
                                                    c5704.m10324();
                                                    return true;
                                                }
                                                arrayDeque3.add(interfaceC8048Mo101562);
                                            }
                                        }
                                    }
                                }
                                c5704.m10324();
                                return z;
                            }
                            if (size == 1) {
                                InterfaceC8048 interfaceC80486 = (InterfaceC8048) AbstractC5176.m9378(arrayList2);
                                interfaceC80486.getClass();
                                return m10346(c5704, interfaceC8058, interfaceC8058.mo10191(interfaceC80486), interfaceC8048Mo101702);
                            }
                            ArgumentList argumentList = new ArgumentList(interfaceC8058.mo10180(interfaceC8060Mo101825));
                            int iMo10180 = interfaceC8058.mo10180(interfaceC8060Mo101825);
                            ?? r6 = z;
                            loop3: while (true) {
                                if (r6 >= iMo10180) {
                                    z2 = z4;
                                    zM10346 = m10346(c5704, interfaceC8058, argumentList, interfaceC8048Mo101702);
                                    break;
                                }
                                if (interfaceC8058.mo10217(interfaceC8058.mo10212(interfaceC8060Mo101825, r6)) != TypeVariance.OUT) {
                                    zM10346 = z;
                                    z2 = z4;
                                    break;
                                }
                                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
                                for (InterfaceC8048 interfaceC80487 : arrayList2) {
                                    interfaceC80487.getClass();
                                    InterfaceC8059 interfaceC8059Mo10203 = interfaceC8058.mo10203(interfaceC80487, r6);
                                    if (interfaceC8059Mo10203 == null) {
                                        break loop3;
                                    }
                                    boolean z6 = z4;
                                    if (interfaceC8058.mo10202(interfaceC8059Mo10203) != TypeVariance.INV) {
                                        interfaceC8059Mo10203 = null;
                                    }
                                    if (interfaceC8059Mo10203 == null || (interfaceC8049Mo10199 = interfaceC8058.mo10199(interfaceC8059Mo10203)) == null) {
                                        break loop3;
                                    }
                                    arrayList3.add(interfaceC8049Mo10199);
                                    z4 = z6;
                                }
                                boolean z7 = z4;
                                InterfaceC8049 interfaceC8049Mo10220 = interfaceC8058.mo10220(arrayList3);
                                interfaceC8049Mo10220.getClass();
                                argumentList.add(interfaceC8058.mo10173(interfaceC8049Mo10220));
                                z4 = z7;
                                r6++;
                            }
                            throw new IllegalStateException(("Incorrect type: " + interfaceC80487 + ", subType: " + interfaceC8048Mo101642 + ", superType: " + interfaceC8048Mo101702).toString());
                        }
                        listM10342 = m10342(c5704, interfaceC80582, interfaceC8048Mo101642, interfaceC8060Mo101825);
                    }
                    z = false;
                    listM10342.size();
                    ArrayList<InterfaceC8048> arrayList22 = new ArrayList(AbstractC5177.m9381(listM10342, 10));
                    while (r11.hasNext()) {
                    }
                    size = arrayList22.size();
                    if (size != 0) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10353(InterfaceC7310 interfaceC7310, InterfaceC7310 interfaceC73102) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC7310.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC7307) it.next()).mo9737());
        }
        Iterator it2 = interfaceC73102.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC7307) it2.next()).mo9737());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC5710 m10354(AbstractC5710 abstractC5710, C1171 c1171, int i) {
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5710.mo10281();
        List listMo10285 = abstractC5710.mo10285();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo10285, 10));
        int i2 = 0;
        for (Object obj : listMo10285) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            AbstractC5702 abstractC5702 = (AbstractC5702) obj;
            AbstractC5702 abstractC5702M10357 = m10357(abstractC5702, c1171, (InterfaceC5295) interfaceC5705Mo10281.getParameters().get(i2), i + 1);
            if (!abstractC5702M10357.mo10299()) {
                abstractC5702M10357 = new C5717(AbstractC5749.m10408(abstractC5702M10357.mo10300(), abstractC5702.mo10300().mo10284()), abstractC5702M10357.mo10301());
            }
            arrayList.add(abstractC5702M10357);
            i2 = i3;
        }
        return AbstractC5725.m10381(abstractC5710, arrayList, null, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC5748 m10355(InterfaceC5705 interfaceC5705, List list) {
        interfaceC5705.getClass();
        list.getClass();
        List parameters = interfaceC5705.getParameters();
        parameters.getClass();
        InterfaceC5295 interfaceC5295 = (InterfaceC5295) AbstractC5176.m9371(parameters);
        if (interfaceC5295 != null) {
            int i = 1;
            if (interfaceC5295.mo9558()) {
                List parameters2 = interfaceC5705.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC5295) it.next()).mo9560());
                }
                return new C5716(AbstractC5171.m9330(AbstractC5176.m9380(arrayList, list)), i);
            }
        }
        return new C5730((InterfaceC5295[]) parameters.toArray(new InterfaceC5295[0]), (AbstractC5702[]) list.toArray(new AbstractC5702[0]), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC5710 m10356(C1171 c1171, C5706 c5706, boolean z, int i, boolean z2) {
        C5706 c5706M10326;
        Variance variance = Variance.INVARIANT;
        AbstractC7825 abstractC7825 = (AbstractC7825) c1171.f1441;
        AbstractC5702 abstractC5702M10357 = m10357(new C5717(abstractC7825.mo10081(), variance), c1171, null, i);
        AbstractC5714 abstractC5714Mo10300 = abstractC5702M10357.mo10300();
        abstractC5714Mo10300.getClass();
        AbstractC5710 abstractC5710M10371 = AbstractC5725.m10371(abstractC5714Mo10300);
        if (AbstractC5725.m10388(abstractC5710M10371)) {
            return abstractC5710M10371;
        }
        abstractC5702M10357.mo10301();
        m10353(abstractC5710M10371.getAnnotations(), AbstractC5742.m10400(c5706));
        if (!AbstractC5725.m10388(abstractC5710M10371)) {
            if (AbstractC5725.m10388(abstractC5710M10371)) {
                c5706M10326 = abstractC5710M10371.mo10282();
            } else {
                C5706 c5706Mo10282 = abstractC5710M10371.mo10282();
                C5707 c5707 = C5706.f14520;
                c5706Mo10282.getClass();
                if (c5706.isEmpty() && c5706Mo10282.isEmpty()) {
                    c5706M10326 = c5706;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = c5707.f14523.values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C5745 c5745 = (C5745) c5706.f14522.get(iIntValue);
                        C5745 c57452 = (C5745) c5706Mo10282.f14522.get(iIntValue);
                        if (c5745 != null) {
                            if (c57452 != null) {
                                InterfaceC7310 c7314 = c5745.f14586;
                                InterfaceC7310 interfaceC7310 = c57452.f14586;
                                c7314.getClass();
                                interfaceC7310.getClass();
                                if (c7314.isEmpty()) {
                                    c7314 = interfaceC7310;
                                } else if (!interfaceC7310.isEmpty()) {
                                    c7314 = new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{c7314, interfaceC7310}));
                                }
                                c5745 = new C5745(c7314);
                            }
                            c57452 = c5745;
                        } else if (c57452 == null) {
                            c57452 = null;
                        } else if (c5745 != null) {
                            InterfaceC7310 c73142 = c57452.f14586;
                            InterfaceC7310 interfaceC73102 = c5745.f14586;
                            c73142.getClass();
                            interfaceC73102.getClass();
                            if (c73142.isEmpty()) {
                                c73142 = interfaceC73102;
                            } else if (!interfaceC73102.isEmpty()) {
                                c73142 = new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{c73142, interfaceC73102}));
                            }
                            c57452 = new C5745(c73142);
                        }
                        if (c57452 != null) {
                            arrayList.add(c57452);
                        }
                    }
                    c5706M10326 = C5707.m10326(arrayList);
                }
            }
            abstractC5710M10371 = AbstractC5725.m10381(abstractC5710M10371, null, c5706M10326, 1);
        }
        AbstractC5710 abstractC5710M10412 = AbstractC5749.m10412(abstractC5710M10371, z);
        if (!z2) {
            return abstractC5710M10412;
        }
        C7826 c7826 = abstractC7825.f19096;
        c7826.getClass();
        return AbstractC5725.m10365(abstractC5710M10412, AbstractC5725.m10378((List) c1171.f1439, c5706, c7826, C8084.f19681, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC5702 m10357(AbstractC5702 abstractC5702, C1171 c1171, InterfaceC5295 interfaceC5295, int i) {
        Variance varianceMo9562;
        Variance variance;
        Variance variance2;
        AbstractC7825 abstractC7825 = (AbstractC7825) c1171.f1441;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + abstractC7825.getName());
        }
        if (abstractC5702.mo10299()) {
            interfaceC5295.getClass();
            return AbstractC5749.m10413(interfaceC5295);
        }
        AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
        abstractC5714Mo10300.getClass();
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5714Mo10300.mo10281();
        interfaceC5705Mo10281.getClass();
        InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705Mo10281.mo9770();
        AbstractC5702 abstractC57022 = interfaceC5309Mo9770 instanceof InterfaceC5295 ? (AbstractC5702) ((Map) c1171.f1438).get(interfaceC5309Mo9770) : null;
        int i2 = 0;
        if (abstractC57022 == null) {
            AbstractC5710 abstractC5710M10371 = AbstractC5725.m10371(abstractC5702.mo10300().mo10331());
            if (!AbstractC5725.m10388(abstractC5710M10371) && AbstractC5749.m10405(abstractC5710M10371, C8047.f19611, null)) {
                InterfaceC5705 interfaceC5705Mo102812 = abstractC5710M10371.mo10281();
                InterfaceC5309 interfaceC5309Mo97702 = interfaceC5705Mo102812.mo9770();
                interfaceC5705Mo102812.getParameters().size();
                abstractC5710M10371.mo10285().size();
                if (!(interfaceC5309Mo97702 instanceof InterfaceC5295)) {
                    if (!(interfaceC5309Mo97702 instanceof AbstractC7825)) {
                        AbstractC5710 abstractC5710M10354 = m10354(abstractC5710M10371, c1171, i);
                        C5751.m10415(abstractC5710M10354);
                        for (Object obj : abstractC5710M10354.mo10285()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC7176.m12479();
                                throw null;
                            }
                            AbstractC5702 abstractC57023 = (AbstractC5702) obj;
                            if (!abstractC57023.mo10299()) {
                                AbstractC5714 abstractC5714Mo103002 = abstractC57023.mo10300();
                                abstractC5714Mo103002.getClass();
                                if (!AbstractC5749.m10405(abstractC5714Mo103002, C8047.f19610, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new C5717(abstractC5710M10354, abstractC5702.mo10301());
                    }
                    AbstractC7825 abstractC78252 = (AbstractC7825) interfaceC5309Mo97702;
                    if (c1171.m1522(abstractC78252)) {
                        Variance variance3 = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String str = abstractC78252.getName().f14050;
                        str.getClass();
                        return new C5717(C8069.m13029(errorTypeKind, str), variance3);
                    }
                    List listMo10285 = abstractC5710M10371.mo10285();
                    ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo10285, 10));
                    for (Object obj2 : listMo10285) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC7176.m12479();
                            throw null;
                        }
                        arrayList.add(m10357((AbstractC5702) obj2, c1171, (InterfaceC5295) interfaceC5705Mo102812.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = abstractC78252.f19096.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC5295) it.next()).mo9561());
                    }
                    return new C5717(AbstractC5725.m10365(m10356(new C1171(c1171, abstractC78252, arrayList, AbstractC5171.m9330(AbstractC5176.m9380(arrayList2, arrayList)), 14), abstractC5710M10371.mo10282(), abstractC5710M10371.mo10284(), i + 1, false), m10354(abstractC5710M10371, c1171, i)), abstractC5702.mo10301());
                }
            }
            return abstractC5702;
        }
        if (abstractC57022.mo10299()) {
            interfaceC5295.getClass();
            return AbstractC5749.m10413(interfaceC5295);
        }
        AbstractC5746 abstractC5746Mo10331 = abstractC57022.mo10300().mo10331();
        Variance varianceMo10301 = abstractC57022.mo10301();
        varianceMo10301.getClass();
        Variance varianceMo103012 = abstractC5702.mo10301();
        varianceMo103012.getClass();
        if (varianceMo103012 != varianceMo10301 && varianceMo103012 != (variance2 = Variance.INVARIANT) && varianceMo10301 == variance2) {
            varianceMo10301 = varianceMo103012;
        }
        if (interfaceC5295 == null || (varianceMo9562 = interfaceC5295.mo9562()) == null) {
            varianceMo9562 = Variance.INVARIANT;
        }
        if (varianceMo9562 != varianceMo10301 && varianceMo9562 != (variance = Variance.INVARIANT) && varianceMo10301 == variance) {
            varianceMo10301 = variance;
        }
        m10353(abstractC5714Mo10300.getAnnotations(), abstractC5746Mo10331.getAnnotations());
        AbstractC5710 abstractC5710M10412 = AbstractC5749.m10412(AbstractC5725.m10371(abstractC5746Mo10331), abstractC5714Mo10300.mo10284());
        C5706 c5706Mo10282 = abstractC5714Mo10300.mo10282();
        if (!AbstractC5725.m10388(abstractC5710M10412)) {
            if (AbstractC5725.m10388(abstractC5710M10412)) {
                c5706Mo10282 = abstractC5710M10412.mo10282();
            } else {
                C5706 c5706Mo102822 = abstractC5710M10412.mo10282();
                c5706Mo10282.getClass();
                C5707 c5707 = C5706.f14520;
                c5706Mo102822.getClass();
                if (!c5706Mo10282.isEmpty() || !c5706Mo102822.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = c5707.f14523.values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        C5745 c5745 = (C5745) c5706Mo10282.f14522.get(iIntValue);
                        C5745 c57452 = (C5745) c5706Mo102822.f14522.get(iIntValue);
                        if (c5745 != null) {
                            if (c57452 != null) {
                                InterfaceC7310 c7314 = c5745.f14586;
                                InterfaceC7310 interfaceC7310 = c57452.f14586;
                                c7314.getClass();
                                interfaceC7310.getClass();
                                if (c7314.isEmpty()) {
                                    c7314 = interfaceC7310;
                                } else if (!interfaceC7310.isEmpty()) {
                                    c7314 = new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{c7314, interfaceC7310}));
                                }
                                c5745 = new C5745(c7314);
                            }
                            c57452 = c5745;
                        } else if (c57452 == null) {
                            c57452 = null;
                        } else if (c5745 != null) {
                            InterfaceC7310 c73142 = c57452.f14586;
                            InterfaceC7310 interfaceC73102 = c5745.f14586;
                            c73142.getClass();
                            interfaceC73102.getClass();
                            if (c73142.isEmpty()) {
                                c73142 = interfaceC73102;
                            } else if (!interfaceC73102.isEmpty()) {
                                c73142 = new C7314(1, AbstractC5179.m9405(new InterfaceC7310[]{c73142, interfaceC73102}));
                            }
                            c57452 = new C5745(c73142);
                        }
                        if (c57452 != null) {
                            arrayList3.add(c57452);
                        }
                    }
                    c5706Mo10282 = C5707.m10326(arrayList3);
                }
            }
            abstractC5710M10412 = AbstractC5725.m10381(abstractC5710M10412, null, c5706Mo10282, 1);
        }
        return new C5717(abstractC5710M10412, varianceMo10301);
    }
}
