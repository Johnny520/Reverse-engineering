package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4211;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.checker.C4858;
import kotlin.reflect.jvm.internal.impl.types.checker.C4864;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p034.AbstractC6347;
import p046.C6485;
import p046.InterfaceC6478;
import p046.InterfaceC6481;
import p079.AbstractC6996;
import p079.C6982;
import p079.C6997;
import p096.C7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7223;
import p097.InterfaceC7224;
import p097.InterfaceC7226;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p097.InterfaceC7231;
import p098.C7240;
import p101.C7255;
import p103.C7273;
import p103.C7274;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4891 f14211 = new C4891();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static List m9782(C4872 c4872, InterfaceC7229 interfaceC7229, InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
        int i;
        List listM9783 = m9783(c4872, interfaceC7229, interfaceC7219, interfaceC7231);
        if (listM9783.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM9783) {
                InterfaceC7219 interfaceC72192 = (InterfaceC7219) obj;
                interfaceC72192.getClass();
                InterfaceC7226 interfaceC7226Mo9632 = interfaceC7229.mo9632(interfaceC72192);
                int iMo9624 = interfaceC7229.mo9624(interfaceC7226Mo9632);
                while (true) {
                    if (i >= iMo9624) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC7230 interfaceC7230Mo9649 = interfaceC7229.mo9649(interfaceC7226Mo9632, i);
                    interfaceC7230Mo9649.getClass();
                    InterfaceC7220 interfaceC7220Mo9640 = interfaceC7229.mo9640(interfaceC7230Mo9649);
                    i = (interfaceC7220Mo9640 != null ? interfaceC7229.mo9626(interfaceC7220Mo9640) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listM9783;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m9783(C4872 c4872, InterfaceC7229 interfaceC7229, InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
        AbstractC4893 abstractC4893Mo9645;
        C4876 c4876 = C4876.f14181;
        interfaceC7229.getClass();
        interfaceC7229.mo9637(interfaceC7219, interfaceC7231);
        if (!interfaceC7229.mo9619(interfaceC7231) && interfaceC7229.mo9663(interfaceC7219)) {
            return EmptyList.INSTANCE;
        }
        if (interfaceC7229.mo9652(interfaceC7231)) {
            if (!interfaceC7229.mo9639(interfaceC7229.mo9623(interfaceC7219), interfaceC7231)) {
                return EmptyList.INSTANCE;
            }
            InterfaceC7219 interfaceC7219Mo9627 = interfaceC7229.mo9627(interfaceC7219, CaptureStatus.FOR_SUBTYPING);
            if (interfaceC7219Mo9627 != null) {
                interfaceC7219 = interfaceC7219Mo9627;
            }
            return AbstractC6347.m11928(interfaceC7219);
        }
        C7274 c7274 = new C7274();
        c4872.m9763();
        InterfaceC7229 interfaceC72292 = c4872.f14170;
        ArrayDeque arrayDeque = c4872.f14174;
        arrayDeque.getClass();
        C7273 c7273 = c4872.f14173;
        c7273.getClass();
        arrayDeque.push(interfaceC7219);
        while (!arrayDeque.isEmpty()) {
            InterfaceC7219 interfaceC72192 = (InterfaceC7219) arrayDeque.pop();
            interfaceC72192.getClass();
            if (c7273.add(interfaceC72192)) {
                InterfaceC7219 interfaceC7219Mo96272 = interfaceC7229.mo9627(interfaceC72192, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC7219Mo96272 == null) {
                    interfaceC7219Mo96272 = interfaceC72192;
                }
                if (interfaceC7229.mo9639(interfaceC7229.mo9623(interfaceC7219Mo96272), interfaceC7231)) {
                    c7274.add(interfaceC7219Mo96272);
                    abstractC4893Mo9645 = c4876;
                } else {
                    abstractC4893Mo9645 = interfaceC7229.mo9633(interfaceC7219Mo96272) == 0 ? C4876.f14182 : interfaceC72292.mo9645(interfaceC7219Mo96272);
                }
                if (abstractC4893Mo9645.equals(c4876)) {
                    abstractC4893Mo9645 = null;
                }
                if (abstractC4893Mo9645 != null) {
                    Iterator it = interfaceC72292.mo9659(interfaceC72292.mo9623(interfaceC72192)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC4893Mo9645.mo9597(c4872, (InterfaceC7220) it.next()));
                    }
                }
            }
        }
        c4872.m9765();
        return c7274;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m9784(InterfaceC7229 interfaceC7229, C4872 c4872, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192, boolean z) {
        interfaceC7229.getClass();
        Collection<InterfaceC7220> collectionMo9662 = interfaceC7229.mo9662(interfaceC7219);
        if ((collectionMo9662 instanceof Collection) && collectionMo9662.isEmpty()) {
            return false;
        }
        for (InterfaceC7220 interfaceC7220 : collectionMo9662) {
            interfaceC7220.getClass();
            if (AbstractC4395.m8907(interfaceC7229.mo9602(interfaceC7220), interfaceC7229.mo9623(interfaceC72192))) {
                return true;
            }
            if (z && m9786(f14211, c4872, interfaceC72192, interfaceC7220)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9785(InterfaceC7229 interfaceC7229, InterfaceC7219 interfaceC7219) {
        interfaceC7229.getClass();
        if (!interfaceC7229.mo9622(interfaceC7219)) {
            if (!(interfaceC7219 instanceof InterfaceC7223)) {
                return false;
            }
            InterfaceC7224 interfaceC7224Mo9642 = interfaceC7229.mo9642((InterfaceC7223) interfaceC7219);
            interfaceC7224Mo9642.getClass();
            InterfaceC7230 interfaceC7230Mo9657 = interfaceC7229.mo9657(interfaceC7224Mo9642);
            interfaceC7230Mo9657.getClass();
            InterfaceC7220 interfaceC7220Mo9640 = interfaceC7229.mo9640(interfaceC7230Mo9657);
            if (interfaceC7220Mo9640 == null || !interfaceC7229.mo9622(interfaceC7229.mo9611(interfaceC7220Mo9640))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m9786(C4891 c4891, C4872 c4872, InterfaceC7220 interfaceC7220, InterfaceC7220 interfaceC72202) {
        interfaceC7220.getClass();
        interfaceC72202.getClass();
        if (interfaceC7220 == interfaceC72202) {
            return true;
        }
        if (!c4872.m9764(interfaceC7220, interfaceC72202)) {
            return false;
        }
        return f14211.m9793(c4872, c4872.f14170, interfaceC7220, interfaceC72202);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m9787(C4872 c4872, InterfaceC7229 interfaceC7229, InterfaceC7226 interfaceC7226, InterfaceC7219 interfaceC7219) {
        boolean zM9790;
        interfaceC7229.getClass();
        interfaceC7226.getClass();
        InterfaceC7231 interfaceC7231Mo9623 = interfaceC7229.mo9623(interfaceC7219);
        int iMo9624 = interfaceC7229.mo9624(interfaceC7226);
        interfaceC7231Mo9623.getClass();
        int iMo9621 = interfaceC7229.mo9621(interfaceC7231Mo9623);
        if (iMo9624 == iMo9621 && iMo9624 == interfaceC7229.mo9633(interfaceC7219)) {
            for (int i = 0; i < iMo9621; i++) {
                InterfaceC7230 interfaceC7230Mo9660 = interfaceC7229.mo9660(interfaceC7219, i);
                interfaceC7230Mo9660.getClass();
                InterfaceC7220 interfaceC7220Mo9640 = interfaceC7229.mo9640(interfaceC7230Mo9660);
                if (interfaceC7220Mo9640 != null) {
                    InterfaceC7230 interfaceC7230Mo9649 = interfaceC7229.mo9649(interfaceC7226, i);
                    interfaceC7230Mo9649.getClass();
                    interfaceC7229.mo9643(interfaceC7230Mo9649);
                    TypeVariance typeVariance = TypeVariance.INV;
                    InterfaceC7220 interfaceC7220Mo96402 = interfaceC7229.mo9640(interfaceC7230Mo9649);
                    interfaceC7220Mo96402.getClass();
                    TypeVariance typeVarianceMo9658 = interfaceC7229.mo9658(interfaceC7229.mo9653(interfaceC7231Mo9623, i));
                    TypeVariance typeVarianceMo9643 = interfaceC7229.mo9643(interfaceC7230Mo9660);
                    typeVarianceMo9658.getClass();
                    typeVarianceMo9643.getClass();
                    if (typeVarianceMo9658 == typeVariance) {
                        typeVarianceMo9658 = typeVarianceMo9643;
                    } else if (typeVarianceMo9643 != typeVariance && typeVarianceMo9658 != typeVarianceMo9643) {
                        typeVarianceMo9658 = null;
                    }
                    if (typeVarianceMo9658 == null) {
                        return c4872.f14172;
                    }
                    if (typeVarianceMo9658 == typeVariance) {
                        m9788(interfaceC7229, interfaceC7220Mo96402, interfaceC7220Mo9640);
                        m9788(interfaceC7229, interfaceC7220Mo9640, interfaceC7220Mo96402);
                    }
                    int i2 = c4872.f14167;
                    if (i2 > 100) {
                        C4211.m8592(interfaceC7220Mo96402, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    c4872.f14167 = i2 + 1;
                    int i3 = AbstractC4892.f14213[typeVarianceMo9658.ordinal()];
                    if (i3 != 1) {
                        C4891 c4891 = f14211;
                        if (i3 == 2) {
                            zM9790 = m9786(c4891, c4872, interfaceC7220Mo96402, interfaceC7220Mo9640);
                        } else {
                            if (i3 != 3) {
                                C4211.m8611();
                                return false;
                            }
                            zM9790 = m9786(c4891, c4872, interfaceC7220Mo9640, interfaceC7220Mo96402);
                        }
                    } else {
                        zM9790 = m9790(c4872, interfaceC7220Mo96402, interfaceC7220Mo9640);
                    }
                    c4872.f14167--;
                    if (!zM9790) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m9788(InterfaceC7229 interfaceC7229, InterfaceC7220 interfaceC7220, InterfaceC7220 interfaceC72202) {
        interfaceC7229.getClass();
        InterfaceC7219 interfaceC7219Mo9641 = interfaceC7229.mo9641(interfaceC7220);
        if (interfaceC7219Mo9641 instanceof InterfaceC7223) {
            InterfaceC7223 interfaceC7223 = (InterfaceC7223) interfaceC7219Mo9641;
            if (interfaceC7229.mo9608(interfaceC7223)) {
                return;
            }
            InterfaceC7224 interfaceC7224Mo9642 = interfaceC7229.mo9642(interfaceC7223);
            interfaceC7224Mo9642.getClass();
            InterfaceC7230 interfaceC7230Mo9657 = interfaceC7229.mo9657(interfaceC7224Mo9642);
            interfaceC7230Mo9657.getClass();
            if (interfaceC7229.mo9617(interfaceC7230Mo9657) && interfaceC7229.mo9631(interfaceC7223) == CaptureStatus.FOR_SUBTYPING) {
                interfaceC7229.mo9602(interfaceC72202);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C4906 m9789(AbstractC4914 abstractC4914, boolean z) {
        boolean zM9844;
        abstractC4914.getClass();
        if (abstractC4914 instanceof C4906) {
            return (C4906) abstractC4914;
        }
        abstractC4914.mo9722();
        if ((abstractC4914.mo9722().mo9211() instanceof InterfaceC4463) || (abstractC4914 instanceof C4864)) {
            InterfaceC4477 interfaceC4477Mo9211 = abstractC4914.mo9722().mo9211();
            C6982 c6982 = interfaceC4477Mo9211 instanceof C6982 ? (C6982) interfaceC4477Mo9211 : null;
            zM9844 = true;
            if (c6982 == null || c6982.f18678) {
                zM9844 = (z && (abstractC4914.mo9722().mo9211() instanceof InterfaceC4463)) ? AbstractC4917.m9844(abstractC4914) : true ^ AbstractC4893.m9825(C4858.f14140.m9628(), AbstractC4893.m9826(abstractC4914), C4876.f14182);
            }
        } else {
            zM9844 = false;
        }
        if (!zM9844) {
            return null;
        }
        if (abstractC4914 instanceof AbstractC4896) {
            AbstractC4896 abstractC4896 = (AbstractC4896) abstractC4914;
            AbstractC4395.m8907(abstractC4896.f14216.mo9722(), abstractC4896.f14217.mo9722());
        }
        return new C4906(AbstractC4893.m9826(abstractC4914).mo9731(false), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m9790(C4872 c4872, InterfaceC7220 interfaceC7220, InterfaceC7220 interfaceC72202) {
        AbstractC4893 abstractC4893 = c4872.f14169;
        AbstractC4893 abstractC48932 = c4872.f14168;
        interfaceC7220.getClass();
        interfaceC72202.getClass();
        InterfaceC7229 interfaceC7229 = c4872.f14170;
        if (interfaceC7220 == interfaceC72202) {
            return true;
        }
        if (m9792(interfaceC7229, interfaceC7220) && m9792(interfaceC7229, interfaceC72202)) {
            InterfaceC7220 interfaceC7220Mo9589 = abstractC4893.mo9589(abstractC48932.mo9586(interfaceC7220));
            InterfaceC7220 interfaceC7220Mo95892 = abstractC4893.mo9589(abstractC48932.mo9586(interfaceC72202));
            InterfaceC7219 interfaceC7219Mo9605 = interfaceC7229.mo9605(interfaceC7220Mo9589);
            if (!interfaceC7229.mo9639(interfaceC7229.mo9602(interfaceC7220Mo9589), interfaceC7229.mo9602(interfaceC7220Mo95892))) {
                return false;
            }
            if (interfaceC7229.mo9633(interfaceC7219Mo9605) == 0) {
                return interfaceC7229.mo9620(interfaceC7220Mo9589) || interfaceC7229.mo9620(interfaceC7220Mo95892) || interfaceC7229.mo9607(interfaceC7219Mo9605) == interfaceC7229.mo9607(interfaceC7229.mo9605(interfaceC7220Mo95892));
            }
        }
        C4891 c4891 = f14211;
        return m9786(c4891, c4872, interfaceC7220, interfaceC72202) && m9786(c4891, c4872, interfaceC72202, interfaceC7220);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r7 = r6.mo9602(r7);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r6.mo9653(r7, r2);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p097.InterfaceC7228 m9791(p097.InterfaceC7229 r6, p097.InterfaceC7220 r7, p097.InterfaceC7219 r8) {
        /*
            r6.getClass()
            int r0 = r6.mo9633(r7)
            r1 = 0
            r2 = r1
        L9:
            r3 = 0
            if (r2 >= r0) goto L66
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲世兰 r4 = r6.mo9660(r7, r2)
            r4.getClass()
            boolean r5 = r6.mo9617(r4)
            if (r5 != 0) goto L1a
            r3 = r4
        L1a:
            if (r3 == 0) goto L63
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲 r3 = r6.mo9640(r3)
            if (r3 == 0) goto L63
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏 r4 = r6.mo9605(r3)
            boolean r4 = r6.mo9613(r4)
            if (r4 == 0) goto L38
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏 r4 = r6.mo9605(r8)
            boolean r4 = r6.mo9613(r4)
            if (r4 == 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = r1
        L39:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L57
            if (r4 == 0) goto L50
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r4 = r6.mo9602(r3)
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r5 = r6.mo9602(r8)
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r5)
            if (r4 == 0) goto L50
            goto L57
        L50:
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲 r3 = m9791(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L57:
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r7 = r6.mo9602(r7)
            r7.getClass()
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲 r6 = r6.mo9653(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L9
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4891.m9791(飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏):飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m9792(InterfaceC7229 interfaceC7229, InterfaceC7220 interfaceC7220) {
        interfaceC7229.getClass();
        interfaceC7220.getClass();
        InterfaceC7231 interfaceC7231Mo9602 = interfaceC7229.mo9602(interfaceC7220);
        interfaceC7231Mo9602.getClass();
        if (!interfaceC7229.mo9655(interfaceC7231Mo9602)) {
            return false;
        }
        interfaceC7229.mo9609(interfaceC7220);
        return (interfaceC7229.mo9635(interfaceC7220) || interfaceC7229.mo9604(interfaceC7220) || interfaceC7229.mo9634(interfaceC7220)) ? false : true;
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
    
        r4 = (p097.InterfaceC7219) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x047d, code lost:
    
        if (r9 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0480, code lost:
    
        r4.getClass();
        r9 = m9787(r18, r19, r19.mo9632(r4), r3);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m9793(kotlin.reflect.jvm.internal.impl.types.C4872 r18, p097.InterfaceC7229 r19, p097.InterfaceC7220 r20, p097.InterfaceC7220 r21) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4891.m9793(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰楪苏, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m9794(InterfaceC6481 interfaceC6481, InterfaceC6481 interfaceC64812) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC6481.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC6478) it.next()).mo9178());
        }
        Iterator it2 = interfaceC64812.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC6478) it2.next()).mo9178());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC4878 m9795(AbstractC4878 abstractC4878, C0325 c0325, int i) {
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4878.mo9722();
        List listMo9726 = abstractC4878.mo9726();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo9726, 10));
        int i2 = 0;
        for (Object obj : listMo9726) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            AbstractC4870 abstractC4870 = (AbstractC4870) obj;
            AbstractC4870 abstractC4870M9798 = m9798(abstractC4870, c0325, (InterfaceC4463) interfaceC4873Mo9722.getParameters().get(i2), i + 1);
            if (!abstractC4870M9798.mo9740()) {
                abstractC4870M9798 = new C4885(AbstractC4917.m9849(abstractC4870M9798.mo9741(), abstractC4870.mo9741().mo9725()), abstractC4870M9798.mo9742());
            }
            arrayList.add(abstractC4870M9798);
            i2 = i3;
        }
        return AbstractC4893.m9822(abstractC4878, arrayList, null, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC4916 m9796(InterfaceC4873 interfaceC4873, List list) {
        interfaceC4873.getClass();
        list.getClass();
        List parameters = interfaceC4873.getParameters();
        parameters.getClass();
        InterfaceC4463 interfaceC4463 = (InterfaceC4463) AbstractC4344.m8812(parameters);
        if (interfaceC4463 != null) {
            int i = 1;
            if (interfaceC4463.mo8999()) {
                List parameters2 = interfaceC4873.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC4463) it.next()).mo9001());
                }
                return new C4884(AbstractC4339.m8771(AbstractC4344.m8821(arrayList, list)), i);
            }
        }
        return new C4898((InterfaceC4463[]) parameters.toArray(new InterfaceC4463[0]), (AbstractC4870[]) list.toArray(new AbstractC4870[0]), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC4878 m9797(C0325 c0325, C4874 c4874, boolean z, int i, boolean z2) {
        C4874 c4874M9767;
        Variance variance = Variance.INVARIANT;
        AbstractC6996 abstractC6996 = (AbstractC6996) c0325.f1096;
        AbstractC4870 abstractC4870M9798 = m9798(new C4885(abstractC6996.mo9522(), variance), c0325, null, i);
        AbstractC4882 abstractC4882Mo9741 = abstractC4870M9798.mo9741();
        abstractC4882Mo9741.getClass();
        AbstractC4878 abstractC4878M9812 = AbstractC4893.m9812(abstractC4882Mo9741);
        if (AbstractC4893.m9829(abstractC4878M9812)) {
            return abstractC4878M9812;
        }
        abstractC4870M9798.mo9742();
        m9794(abstractC4878M9812.getAnnotations(), AbstractC4910.m9841(c4874));
        if (!AbstractC4893.m9829(abstractC4878M9812)) {
            if (AbstractC4893.m9829(abstractC4878M9812)) {
                c4874M9767 = abstractC4878M9812.mo9723();
            } else {
                C4874 c4874Mo9723 = abstractC4878M9812.mo9723();
                C4875 c4875 = C4874.f14175;
                c4874Mo9723.getClass();
                if (c4874.isEmpty() && c4874Mo9723.isEmpty()) {
                    c4874M9767 = c4874;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = c4875.f14178.values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C4913 c4913 = (C4913) c4874.f14177.get(iIntValue);
                        C4913 c49132 = (C4913) c4874Mo9723.f14177.get(iIntValue);
                        if (c4913 != null) {
                            if (c49132 != null) {
                                InterfaceC6481 c6485 = c4913.f14241;
                                InterfaceC6481 interfaceC6481 = c49132.f14241;
                                c6485.getClass();
                                interfaceC6481.getClass();
                                if (c6485.isEmpty()) {
                                    c6485 = interfaceC6481;
                                } else if (!interfaceC6481.isEmpty()) {
                                    c6485 = new C6485(1, AbstractC4347.m8846(new InterfaceC6481[]{c6485, interfaceC6481}));
                                }
                                c4913 = new C4913(c6485);
                            }
                            c49132 = c4913;
                        } else if (c49132 == null) {
                            c49132 = null;
                        } else if (c4913 != null) {
                            InterfaceC6481 c64852 = c49132.f14241;
                            InterfaceC6481 interfaceC64812 = c4913.f14241;
                            c64852.getClass();
                            interfaceC64812.getClass();
                            if (c64852.isEmpty()) {
                                c64852 = interfaceC64812;
                            } else if (!interfaceC64812.isEmpty()) {
                                c64852 = new C6485(1, AbstractC4347.m8846(new InterfaceC6481[]{c64852, interfaceC64812}));
                            }
                            c49132 = new C4913(c64852);
                        }
                        if (c49132 != null) {
                            arrayList.add(c49132);
                        }
                    }
                    c4874M9767 = C4875.m9767(arrayList);
                }
            }
            abstractC4878M9812 = AbstractC4893.m9822(abstractC4878M9812, null, c4874M9767, 1);
        }
        AbstractC4878 abstractC4878M9853 = AbstractC4917.m9853(abstractC4878M9812, z);
        if (!z2) {
            return abstractC4878M9853;
        }
        C6997 c6997 = abstractC6996.f18751;
        c6997.getClass();
        return AbstractC4893.m9806(abstractC4878M9853, AbstractC4893.m9819((List) c0325.f1094, c4874, c6997, C7255.f19336, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC4870 m9798(AbstractC4870 abstractC4870, C0325 c0325, InterfaceC4463 interfaceC4463, int i) {
        Variance varianceMo9003;
        Variance variance;
        Variance variance2;
        AbstractC6996 abstractC6996 = (AbstractC6996) c0325.f1096;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + abstractC6996.getName());
        }
        if (abstractC4870.mo9740()) {
            interfaceC4463.getClass();
            return AbstractC4917.m9854(interfaceC4463);
        }
        AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9741();
        abstractC4882Mo9741.getClass();
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4882Mo9741.mo9722();
        interfaceC4873Mo9722.getClass();
        InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873Mo9722.mo9211();
        AbstractC4870 abstractC48702 = interfaceC4477Mo9211 instanceof InterfaceC4463 ? (AbstractC4870) ((Map) c0325.f1093).get(interfaceC4477Mo9211) : null;
        int i2 = 0;
        if (abstractC48702 == null) {
            AbstractC4878 abstractC4878M9812 = AbstractC4893.m9812(abstractC4870.mo9741().mo9772());
            if (!AbstractC4893.m9829(abstractC4878M9812) && AbstractC4917.m9846(abstractC4878M9812, C7218.f19266, null)) {
                InterfaceC4873 interfaceC4873Mo97222 = abstractC4878M9812.mo9722();
                InterfaceC4477 interfaceC4477Mo92112 = interfaceC4873Mo97222.mo9211();
                interfaceC4873Mo97222.getParameters().size();
                abstractC4878M9812.mo9726().size();
                if (!(interfaceC4477Mo92112 instanceof InterfaceC4463)) {
                    if (!(interfaceC4477Mo92112 instanceof AbstractC6996)) {
                        AbstractC4878 abstractC4878M9795 = m9795(abstractC4878M9812, c0325, i);
                        C4919.m9856(abstractC4878M9795);
                        for (Object obj : abstractC4878M9795.mo9726()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC6347.m11920();
                                throw null;
                            }
                            AbstractC4870 abstractC48703 = (AbstractC4870) obj;
                            if (!abstractC48703.mo9740()) {
                                AbstractC4882 abstractC4882Mo97412 = abstractC48703.mo9741();
                                abstractC4882Mo97412.getClass();
                                if (!AbstractC4917.m9846(abstractC4882Mo97412, C7218.f19265, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new C4885(abstractC4878M9795, abstractC4870.mo9742());
                    }
                    AbstractC6996 abstractC69962 = (AbstractC6996) interfaceC4477Mo92112;
                    if (c0325.m962(abstractC69962)) {
                        Variance variance3 = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String str = abstractC69962.getName().f13705;
                        str.getClass();
                        return new C4885(C7240.m12470(errorTypeKind, str), variance3);
                    }
                    List listMo9726 = abstractC4878M9812.mo9726();
                    ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo9726, 10));
                    for (Object obj2 : listMo9726) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC6347.m11920();
                            throw null;
                        }
                        arrayList.add(m9798((AbstractC4870) obj2, c0325, (InterfaceC4463) interfaceC4873Mo97222.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = abstractC69962.f18751.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC4463) it.next()).mo9002());
                    }
                    return new C4885(AbstractC4893.m9806(m9797(new C0325(c0325, abstractC69962, arrayList, AbstractC4339.m8771(AbstractC4344.m8821(arrayList2, arrayList)), 14), abstractC4878M9812.mo9723(), abstractC4878M9812.mo9725(), i + 1, false), m9795(abstractC4878M9812, c0325, i)), abstractC4870.mo9742());
                }
            }
            return abstractC4870;
        }
        if (abstractC48702.mo9740()) {
            interfaceC4463.getClass();
            return AbstractC4917.m9854(interfaceC4463);
        }
        AbstractC4914 abstractC4914Mo9772 = abstractC48702.mo9741().mo9772();
        Variance varianceMo9742 = abstractC48702.mo9742();
        varianceMo9742.getClass();
        Variance varianceMo97422 = abstractC4870.mo9742();
        varianceMo97422.getClass();
        if (varianceMo97422 != varianceMo9742 && varianceMo97422 != (variance2 = Variance.INVARIANT) && varianceMo9742 == variance2) {
            varianceMo9742 = varianceMo97422;
        }
        if (interfaceC4463 == null || (varianceMo9003 = interfaceC4463.mo9003()) == null) {
            varianceMo9003 = Variance.INVARIANT;
        }
        if (varianceMo9003 != varianceMo9742 && varianceMo9003 != (variance = Variance.INVARIANT) && varianceMo9742 == variance) {
            varianceMo9742 = variance;
        }
        m9794(abstractC4882Mo9741.getAnnotations(), abstractC4914Mo9772.getAnnotations());
        AbstractC4878 abstractC4878M9853 = AbstractC4917.m9853(AbstractC4893.m9812(abstractC4914Mo9772), abstractC4882Mo9741.mo9725());
        C4874 c4874Mo9723 = abstractC4882Mo9741.mo9723();
        if (!AbstractC4893.m9829(abstractC4878M9853)) {
            if (AbstractC4893.m9829(abstractC4878M9853)) {
                c4874Mo9723 = abstractC4878M9853.mo9723();
            } else {
                C4874 c4874Mo97232 = abstractC4878M9853.mo9723();
                c4874Mo9723.getClass();
                C4875 c4875 = C4874.f14175;
                c4874Mo97232.getClass();
                if (!c4874Mo9723.isEmpty() || !c4874Mo97232.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = c4875.f14178.values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        C4913 c4913 = (C4913) c4874Mo9723.f14177.get(iIntValue);
                        C4913 c49132 = (C4913) c4874Mo97232.f14177.get(iIntValue);
                        if (c4913 != null) {
                            if (c49132 != null) {
                                InterfaceC6481 c6485 = c4913.f14241;
                                InterfaceC6481 interfaceC6481 = c49132.f14241;
                                c6485.getClass();
                                interfaceC6481.getClass();
                                if (c6485.isEmpty()) {
                                    c6485 = interfaceC6481;
                                } else if (!interfaceC6481.isEmpty()) {
                                    c6485 = new C6485(1, AbstractC4347.m8846(new InterfaceC6481[]{c6485, interfaceC6481}));
                                }
                                c4913 = new C4913(c6485);
                            }
                            c49132 = c4913;
                        } else if (c49132 == null) {
                            c49132 = null;
                        } else if (c4913 != null) {
                            InterfaceC6481 c64852 = c49132.f14241;
                            InterfaceC6481 interfaceC64812 = c4913.f14241;
                            c64852.getClass();
                            interfaceC64812.getClass();
                            if (c64852.isEmpty()) {
                                c64852 = interfaceC64812;
                            } else if (!interfaceC64812.isEmpty()) {
                                c64852 = new C6485(1, AbstractC4347.m8846(new InterfaceC6481[]{c64852, interfaceC64812}));
                            }
                            c49132 = new C4913(c64852);
                        }
                        if (c49132 != null) {
                            arrayList3.add(c49132);
                        }
                    }
                    c4874Mo9723 = C4875.m9767(arrayList3);
                }
            }
            abstractC4878M9853 = AbstractC4893.m9822(abstractC4878M9853, null, c4874Mo9723, 1);
        }
        return new C4885(abstractC4878M9853, varianceMo9742);
    }
}
