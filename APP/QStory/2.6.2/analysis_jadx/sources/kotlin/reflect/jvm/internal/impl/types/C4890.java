package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4210;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.checker.C4857;
import kotlin.reflect.jvm.internal.impl.types.checker.C4863;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p046.C6484;
import p046.InterfaceC6477;
import p046.InterfaceC6480;
import p079.AbstractC6995;
import p079.C6981;
import p079.C6996;
import p096.C7217;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7225;
import p097.InterfaceC7228;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p098.C7239;
import p101.C7254;
import p103.C7272;
import p103.C7273;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4890 f14207 = new C4890();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static List m9788(C4871 c4871, InterfaceC7228 interfaceC7228, InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
        int i;
        List listM9789 = m9789(c4871, interfaceC7228, interfaceC7218, interfaceC7230);
        if (listM9789.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM9789) {
                InterfaceC7218 interfaceC72182 = (InterfaceC7218) obj;
                interfaceC72182.getClass();
                InterfaceC7225 interfaceC7225Mo9642 = interfaceC7228.mo9642(interfaceC72182);
                int iMo9633 = interfaceC7228.mo9633(interfaceC7225Mo9642);
                while (true) {
                    if (i >= iMo9633) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC7229 interfaceC7229Mo9660 = interfaceC7228.mo9660(interfaceC7225Mo9642, i);
                    interfaceC7229Mo9660.getClass();
                    InterfaceC7219 interfaceC7219Mo9650 = interfaceC7228.mo9650(interfaceC7229Mo9660);
                    i = (interfaceC7219Mo9650 != null ? interfaceC7228.mo9636(interfaceC7219Mo9650) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listM9789;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m9789(C4871 c4871, InterfaceC7228 interfaceC7228, InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
        AbstractC4892 abstractC4892Mo9656;
        C4875 c4875 = C4875.f14177;
        interfaceC7228.getClass();
        interfaceC7228.mo9651(interfaceC7218, interfaceC7230);
        if (!interfaceC7228.mo9619(interfaceC7230) && interfaceC7228.mo9673(interfaceC7218)) {
            return EmptyList.INSTANCE;
        }
        if (interfaceC7228.mo9662(interfaceC7230)) {
            if (!interfaceC7228.mo9646(interfaceC7228.mo9632(interfaceC7218), interfaceC7230)) {
                return EmptyList.INSTANCE;
            }
            InterfaceC7218 interfaceC7218Mo9637 = interfaceC7228.mo9637(interfaceC7218, CaptureStatus.FOR_SUBTYPING);
            if (interfaceC7218Mo9637 != null) {
                interfaceC7218 = interfaceC7218Mo9637;
            }
            return AbstractC8189.m13660(interfaceC7218);
        }
        C7273 c7273 = new C7273();
        c4871.m9769();
        InterfaceC7228 interfaceC72282 = c4871.f14166;
        ArrayDeque arrayDeque = c4871.f14170;
        arrayDeque.getClass();
        C7272 c7272 = c4871.f14169;
        c7272.getClass();
        arrayDeque.push(interfaceC7218);
        while (!arrayDeque.isEmpty()) {
            InterfaceC7218 interfaceC72182 = (InterfaceC7218) arrayDeque.pop();
            interfaceC72182.getClass();
            if (c7272.add(interfaceC72182)) {
                InterfaceC7218 interfaceC7218Mo96372 = interfaceC7228.mo9637(interfaceC72182, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC7218Mo96372 == null) {
                    interfaceC7218Mo96372 = interfaceC72182;
                }
                if (interfaceC7228.mo9646(interfaceC7228.mo9632(interfaceC7218Mo96372), interfaceC7230)) {
                    c7273.add(interfaceC7218Mo96372);
                    abstractC4892Mo9656 = c4875;
                } else {
                    abstractC4892Mo9656 = interfaceC7228.mo9640(interfaceC7218Mo96372) == 0 ? C4875.f14178 : interfaceC72282.mo9656(interfaceC7218Mo96372);
                }
                if (abstractC4892Mo9656.equals(c4875)) {
                    abstractC4892Mo9656 = null;
                }
                if (abstractC4892Mo9656 != null) {
                    Iterator it = interfaceC72282.mo9669(interfaceC72282.mo9632(interfaceC72182)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC4892Mo9656.mo9607(c4871, (InterfaceC7219) it.next()));
                    }
                }
            }
        }
        c4871.m9771();
        return c7273;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m9790(InterfaceC7228 interfaceC7228, C4871 c4871, InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182, boolean z) {
        interfaceC7228.getClass();
        Collection<InterfaceC7219> collectionMo9672 = interfaceC7228.mo9672(interfaceC7218);
        if ((collectionMo9672 instanceof Collection) && collectionMo9672.isEmpty()) {
            return false;
        }
        for (InterfaceC7219 interfaceC7219 : collectionMo9672) {
            interfaceC7219.getClass();
            if (AbstractC4394.m8917(interfaceC7228.mo9612(interfaceC7219), interfaceC7228.mo9632(interfaceC72182))) {
                return true;
            }
            if (z && m9792(f14207, c4871, interfaceC72182, interfaceC7219)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9791(InterfaceC7228 interfaceC7228, InterfaceC7218 interfaceC7218) {
        interfaceC7228.getClass();
        if (!interfaceC7228.mo9631(interfaceC7218)) {
            if (!(interfaceC7218 instanceof InterfaceC7222)) {
                return false;
            }
            InterfaceC7223 interfaceC7223Mo9653 = interfaceC7228.mo9653((InterfaceC7222) interfaceC7218);
            interfaceC7223Mo9653.getClass();
            InterfaceC7229 interfaceC7229Mo9667 = interfaceC7228.mo9667(interfaceC7223Mo9653);
            interfaceC7229Mo9667.getClass();
            InterfaceC7219 interfaceC7219Mo9650 = interfaceC7228.mo9650(interfaceC7229Mo9667);
            if (interfaceC7219Mo9650 == null || !interfaceC7228.mo9631(interfaceC7228.mo9622(interfaceC7219Mo9650))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m9792(C4890 c4890, C4871 c4871, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        interfaceC7219.getClass();
        interfaceC72192.getClass();
        if (interfaceC7219 == interfaceC72192) {
            return true;
        }
        if (!c4871.m9770(interfaceC7219, interfaceC72192)) {
            return false;
        }
        return f14207.m9799(c4871, c4871.f14166, interfaceC7219, interfaceC72192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m9793(C4871 c4871, InterfaceC7228 interfaceC7228, InterfaceC7225 interfaceC7225, InterfaceC7218 interfaceC7218) {
        boolean zM9796;
        interfaceC7228.getClass();
        interfaceC7225.getClass();
        InterfaceC7230 interfaceC7230Mo9632 = interfaceC7228.mo9632(interfaceC7218);
        int iMo9633 = interfaceC7228.mo9633(interfaceC7225);
        interfaceC7230Mo9632.getClass();
        int iMo9630 = interfaceC7228.mo9630(interfaceC7230Mo9632);
        if (iMo9633 == iMo9630 && iMo9633 == interfaceC7228.mo9640(interfaceC7218)) {
            for (int i = 0; i < iMo9630; i++) {
                InterfaceC7229 interfaceC7229Mo9670 = interfaceC7228.mo9670(interfaceC7218, i);
                interfaceC7229Mo9670.getClass();
                InterfaceC7219 interfaceC7219Mo9650 = interfaceC7228.mo9650(interfaceC7229Mo9670);
                if (interfaceC7219Mo9650 != null) {
                    InterfaceC7229 interfaceC7229Mo9660 = interfaceC7228.mo9660(interfaceC7225, i);
                    interfaceC7229Mo9660.getClass();
                    interfaceC7228.mo9657(interfaceC7229Mo9660);
                    TypeVariance typeVariance = TypeVariance.INV;
                    InterfaceC7219 interfaceC7219Mo96502 = interfaceC7228.mo9650(interfaceC7229Mo9660);
                    interfaceC7219Mo96502.getClass();
                    TypeVariance typeVarianceMo9668 = interfaceC7228.mo9668(interfaceC7228.mo9663(interfaceC7230Mo9632, i));
                    TypeVariance typeVarianceMo9657 = interfaceC7228.mo9657(interfaceC7229Mo9670);
                    typeVarianceMo9668.getClass();
                    typeVarianceMo9657.getClass();
                    if (typeVarianceMo9668 == typeVariance) {
                        typeVarianceMo9668 = typeVarianceMo9657;
                    } else if (typeVarianceMo9657 != typeVariance && typeVarianceMo9668 != typeVarianceMo9657) {
                        typeVarianceMo9668 = null;
                    }
                    if (typeVarianceMo9668 == null) {
                        return c4871.f14168;
                    }
                    if (typeVarianceMo9668 == typeVariance) {
                        m9794(interfaceC7228, interfaceC7219Mo96502, interfaceC7219Mo9650);
                        m9794(interfaceC7228, interfaceC7219Mo9650, interfaceC7219Mo96502);
                    }
                    int i2 = c4871.f14163;
                    if (i2 > 100) {
                        C4210.m8602(interfaceC7219Mo96502, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    c4871.f14163 = i2 + 1;
                    int i3 = AbstractC4891.f14209[typeVarianceMo9668.ordinal()];
                    if (i3 != 1) {
                        C4890 c4890 = f14207;
                        if (i3 == 2) {
                            zM9796 = m9792(c4890, c4871, interfaceC7219Mo96502, interfaceC7219Mo9650);
                        } else {
                            if (i3 != 3) {
                                C4210.m8621();
                                return false;
                            }
                            zM9796 = m9792(c4890, c4871, interfaceC7219Mo9650, interfaceC7219Mo96502);
                        }
                    } else {
                        zM9796 = m9796(c4871, interfaceC7219Mo96502, interfaceC7219Mo9650);
                    }
                    c4871.f14163--;
                    if (!zM9796) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m9794(InterfaceC7228 interfaceC7228, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        interfaceC7228.getClass();
        InterfaceC7218 interfaceC7218Mo9652 = interfaceC7228.mo9652(interfaceC7219);
        if (interfaceC7218Mo9652 instanceof InterfaceC7222) {
            InterfaceC7222 interfaceC7222 = (InterfaceC7222) interfaceC7218Mo9652;
            if (interfaceC7228.mo9618(interfaceC7222)) {
                return;
            }
            InterfaceC7223 interfaceC7223Mo9653 = interfaceC7228.mo9653(interfaceC7222);
            interfaceC7223Mo9653.getClass();
            InterfaceC7229 interfaceC7229Mo9667 = interfaceC7228.mo9667(interfaceC7223Mo9653);
            interfaceC7229Mo9667.getClass();
            if (interfaceC7228.mo9627(interfaceC7229Mo9667) && interfaceC7228.mo9645(interfaceC7222) == CaptureStatus.FOR_SUBTYPING) {
                interfaceC7228.mo9612(interfaceC72192);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C4905 m9795(AbstractC4913 abstractC4913, boolean z) {
        boolean zM9850;
        abstractC4913.getClass();
        if (abstractC4913 instanceof C4905) {
            return (C4905) abstractC4913;
        }
        abstractC4913.mo9732();
        if ((abstractC4913.mo9732().mo9221() instanceof InterfaceC4462) || (abstractC4913 instanceof C4863)) {
            InterfaceC4476 interfaceC4476Mo9221 = abstractC4913.mo9732().mo9221();
            C6981 c6981 = interfaceC4476Mo9221 instanceof C6981 ? (C6981) interfaceC4476Mo9221 : null;
            zM9850 = true;
            if (c6981 == null || c6981.f18683) {
                zM9850 = (z && (abstractC4913.mo9732().mo9221() instanceof InterfaceC4462)) ? AbstractC4916.m9850(abstractC4913) : true ^ AbstractC4892.m9831(C4857.f14136.m9638(), AbstractC4892.m9832(abstractC4913), C4875.f14178);
            }
        } else {
            zM9850 = false;
        }
        if (!zM9850) {
            return null;
        }
        if (abstractC4913 instanceof AbstractC4895) {
            AbstractC4895 abstractC4895 = (AbstractC4895) abstractC4913;
            AbstractC4394.m8917(abstractC4895.f14212.mo9732(), abstractC4895.f14213.mo9732());
        }
        return new C4905(AbstractC4892.m9832(abstractC4913).mo9741(false), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m9796(C4871 c4871, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        AbstractC4892 abstractC4892 = c4871.f14165;
        AbstractC4892 abstractC48922 = c4871.f14164;
        interfaceC7219.getClass();
        interfaceC72192.getClass();
        InterfaceC7228 interfaceC7228 = c4871.f14166;
        if (interfaceC7219 == interfaceC72192) {
            return true;
        }
        if (m9798(interfaceC7228, interfaceC7219) && m9798(interfaceC7228, interfaceC72192)) {
            InterfaceC7219 interfaceC7219Mo9599 = abstractC4892.mo9599(abstractC48922.mo9596(interfaceC7219));
            InterfaceC7219 interfaceC7219Mo95992 = abstractC4892.mo9599(abstractC48922.mo9596(interfaceC72192));
            InterfaceC7218 interfaceC7218Mo9615 = interfaceC7228.mo9615(interfaceC7219Mo9599);
            if (!interfaceC7228.mo9646(interfaceC7228.mo9612(interfaceC7219Mo9599), interfaceC7228.mo9612(interfaceC7219Mo95992))) {
                return false;
            }
            if (interfaceC7228.mo9640(interfaceC7218Mo9615) == 0) {
                return interfaceC7228.mo9629(interfaceC7219Mo9599) || interfaceC7228.mo9629(interfaceC7219Mo95992) || interfaceC7228.mo9617(interfaceC7218Mo9615) == interfaceC7228.mo9617(interfaceC7228.mo9615(interfaceC7219Mo95992));
            }
        }
        C4890 c4890 = f14207;
        return m9792(c4890, c4871, interfaceC7219, interfaceC72192) && m9792(c4890, c4871, interfaceC72192, interfaceC7219);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r7 = r6.mo9612(r7);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r6.mo9663(r7, r2);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p097.InterfaceC7227 m9797(p097.InterfaceC7228 r6, p097.InterfaceC7219 r7, p097.InterfaceC7218 r8) {
        /*
            r6.getClass()
            int r0 = r6.mo9640(r7)
            r1 = 0
            r2 = r1
        L9:
            r3 = 0
            if (r2 >= r0) goto L66
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲世兰 r4 = r6.mo9670(r7, r2)
            r4.getClass()
            boolean r5 = r6.mo9627(r4)
            if (r5 != 0) goto L1a
            r3 = r4
        L1a:
            if (r3 == 0) goto L63
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲 r3 = r6.mo9650(r3)
            if (r3 == 0) goto L63
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏 r4 = r6.mo9615(r3)
            boolean r4 = r6.mo9643(r4)
            if (r4 == 0) goto L38
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏 r4 = r6.mo9615(r8)
            boolean r4 = r6.mo9643(r4)
            if (r4 == 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = r1
        L39:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L57
            if (r4 == 0) goto L50
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r4 = r6.mo9612(r3)
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r5 = r6.mo9612(r8)
            boolean r4 = kotlin.jvm.internal.AbstractC4394.m8917(r4, r5)
            if (r4 == 0) goto L50
            goto L57
        L50:
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲 r3 = m9797(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L57:
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏哲兰世 r7 = r6.mo9612(r7)
            r7.getClass()
            飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲 r6 = r6.mo9663(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L9
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4890.m9797(飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰哲苏):飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰世哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m9798(InterfaceC7228 interfaceC7228, InterfaceC7219 interfaceC7219) {
        interfaceC7228.getClass();
        interfaceC7219.getClass();
        InterfaceC7230 interfaceC7230Mo9612 = interfaceC7228.mo9612(interfaceC7219);
        interfaceC7230Mo9612.getClass();
        if (!interfaceC7228.mo9665(interfaceC7230Mo9612)) {
            return false;
        }
        interfaceC7228.mo9620(interfaceC7219);
        return (interfaceC7228.mo9647(interfaceC7219) || interfaceC7228.mo9614(interfaceC7219) || interfaceC7228.mo9644(interfaceC7219)) ? false : true;
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
    
        r4 = (p097.InterfaceC7218) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x047d, code lost:
    
        if (r9 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0480, code lost:
    
        r4.getClass();
        r9 = m9793(r18, r19, r19.mo9642(r4), r3);
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
    public boolean m9799(kotlin.reflect.jvm.internal.impl.types.C4871 r18, p097.InterfaceC7228 r19, p097.InterfaceC7219 r20, p097.InterfaceC7219 r21) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4890.m9799(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰楪苏, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, 飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m9800(InterfaceC6480 interfaceC6480, InterfaceC6480 interfaceC64802) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC6480.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC6477) it.next()).mo9188());
        }
        Iterator it2 = interfaceC64802.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC6477) it2.next()).mo9188());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC4877 m9801(AbstractC4877 abstractC4877, C0325 c0325, int i) {
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4877.mo9732();
        List listMo9736 = abstractC4877.mo9736();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo9736, 10));
        int i2 = 0;
        for (Object obj : listMo9736) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            AbstractC4869 abstractC4869 = (AbstractC4869) obj;
            AbstractC4869 abstractC4869M9804 = m9804(abstractC4869, c0325, (InterfaceC4462) interfaceC4872Mo9732.getParameters().get(i2), i + 1);
            if (!abstractC4869M9804.mo9750()) {
                abstractC4869M9804 = new C4884(AbstractC4916.m9855(abstractC4869M9804.mo9751(), abstractC4869.mo9751().mo9735()), abstractC4869M9804.mo9752());
            }
            arrayList.add(abstractC4869M9804);
            i2 = i3;
        }
        return AbstractC4892.m9828(abstractC4877, arrayList, null, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC4915 m9802(InterfaceC4872 interfaceC4872, List list) {
        interfaceC4872.getClass();
        list.getClass();
        List parameters = interfaceC4872.getParameters();
        parameters.getClass();
        InterfaceC4462 interfaceC4462 = (InterfaceC4462) AbstractC4343.m8810(parameters);
        if (interfaceC4462 != null) {
            int i = 1;
            if (interfaceC4462.mo9009()) {
                List parameters2 = interfaceC4872.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC4462) it.next()).mo9011());
                }
                return new C4883(AbstractC4338.m8783(AbstractC4343.m8797(arrayList, list)), i);
            }
        }
        return new C4897((InterfaceC4462[]) parameters.toArray(new InterfaceC4462[0]), (AbstractC4869[]) list.toArray(new AbstractC4869[0]), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC4877 m9803(C0325 c0325, C4873 c4873, boolean z, int i, boolean z2) {
        C4873 c4873M9773;
        Variance variance = Variance.INVARIANT;
        AbstractC6995 abstractC6995 = (AbstractC6995) c0325.f1096;
        AbstractC4869 abstractC4869M9804 = m9804(new C4884(abstractC6995.mo9532(), variance), c0325, null, i);
        AbstractC4881 abstractC4881Mo9751 = abstractC4869M9804.mo9751();
        abstractC4881Mo9751.getClass();
        AbstractC4877 abstractC4877M9818 = AbstractC4892.m9818(abstractC4881Mo9751);
        if (AbstractC4892.m9835(abstractC4877M9818)) {
            return abstractC4877M9818;
        }
        abstractC4869M9804.mo9752();
        m9800(abstractC4877M9818.getAnnotations(), AbstractC4909.m9847(c4873));
        if (!AbstractC4892.m9835(abstractC4877M9818)) {
            if (AbstractC4892.m9835(abstractC4877M9818)) {
                c4873M9773 = abstractC4877M9818.mo9733();
            } else {
                C4873 c4873Mo9733 = abstractC4877M9818.mo9733();
                C4874 c4874 = C4873.f14171;
                c4873Mo9733.getClass();
                if (c4873.isEmpty() && c4873Mo9733.isEmpty()) {
                    c4873M9773 = c4873;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = c4874.f14174.values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C4912 c4912 = (C4912) c4873.f14173.get(iIntValue);
                        C4912 c49122 = (C4912) c4873Mo9733.f14173.get(iIntValue);
                        if (c4912 != null) {
                            if (c49122 != null) {
                                InterfaceC6480 c6484 = c4912.f14237;
                                InterfaceC6480 interfaceC6480 = c49122.f14237;
                                c6484.getClass();
                                interfaceC6480.getClass();
                                if (c6484.isEmpty()) {
                                    c6484 = interfaceC6480;
                                } else if (!interfaceC6480.isEmpty()) {
                                    c6484 = new C6484(1, AbstractC4346.m8850(new InterfaceC6480[]{c6484, interfaceC6480}));
                                }
                                c4912 = new C4912(c6484);
                            }
                            c49122 = c4912;
                        } else if (c49122 == null) {
                            c49122 = null;
                        } else if (c4912 != null) {
                            InterfaceC6480 c64842 = c49122.f14237;
                            InterfaceC6480 interfaceC64802 = c4912.f14237;
                            c64842.getClass();
                            interfaceC64802.getClass();
                            if (c64842.isEmpty()) {
                                c64842 = interfaceC64802;
                            } else if (!interfaceC64802.isEmpty()) {
                                c64842 = new C6484(1, AbstractC4346.m8850(new InterfaceC6480[]{c64842, interfaceC64802}));
                            }
                            c49122 = new C4912(c64842);
                        }
                        if (c49122 != null) {
                            arrayList.add(c49122);
                        }
                    }
                    c4873M9773 = C4874.m9773(arrayList);
                }
            }
            abstractC4877M9818 = AbstractC4892.m9828(abstractC4877M9818, null, c4873M9773, 1);
        }
        AbstractC4877 abstractC4877M9859 = AbstractC4916.m9859(abstractC4877M9818, z);
        if (!z2) {
            return abstractC4877M9859;
        }
        C6996 c6996 = abstractC6995.f18756;
        c6996.getClass();
        return AbstractC4892.m9812(abstractC4877M9859, AbstractC4892.m9825((List) c0325.f1094, c4873, c6996, C7254.f19341, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC4869 m9804(AbstractC4869 abstractC4869, C0325 c0325, InterfaceC4462 interfaceC4462, int i) {
        Variance varianceMo9013;
        Variance variance;
        Variance variance2;
        AbstractC6995 abstractC6995 = (AbstractC6995) c0325.f1096;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + abstractC6995.getName());
        }
        if (abstractC4869.mo9750()) {
            interfaceC4462.getClass();
            return AbstractC4916.m9860(interfaceC4462);
        }
        AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
        abstractC4881Mo9751.getClass();
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4881Mo9751.mo9732();
        interfaceC4872Mo9732.getClass();
        InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872Mo9732.mo9221();
        AbstractC4869 abstractC48692 = interfaceC4476Mo9221 instanceof InterfaceC4462 ? (AbstractC4869) ((Map) c0325.f1093).get(interfaceC4476Mo9221) : null;
        int i2 = 0;
        if (abstractC48692 == null) {
            AbstractC4877 abstractC4877M9818 = AbstractC4892.m9818(abstractC4869.mo9751().mo9778());
            if (!AbstractC4892.m9835(abstractC4877M9818) && AbstractC4916.m9852(abstractC4877M9818, C7217.f19271, null)) {
                InterfaceC4872 interfaceC4872Mo97322 = abstractC4877M9818.mo9732();
                InterfaceC4476 interfaceC4476Mo92212 = interfaceC4872Mo97322.mo9221();
                interfaceC4872Mo97322.getParameters().size();
                abstractC4877M9818.mo9736().size();
                if (!(interfaceC4476Mo92212 instanceof InterfaceC4462)) {
                    if (!(interfaceC4476Mo92212 instanceof AbstractC6995)) {
                        AbstractC4877 abstractC4877M9801 = m9801(abstractC4877M9818, c0325, i);
                        C4918.m9862(abstractC4877M9801);
                        for (Object obj : abstractC4877M9801.mo9736()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC8189.m13662();
                                throw null;
                            }
                            AbstractC4869 abstractC48693 = (AbstractC4869) obj;
                            if (!abstractC48693.mo9750()) {
                                AbstractC4881 abstractC4881Mo97512 = abstractC48693.mo9751();
                                abstractC4881Mo97512.getClass();
                                if (!AbstractC4916.m9852(abstractC4881Mo97512, C7217.f19270, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new C4884(abstractC4877M9801, abstractC4869.mo9752());
                    }
                    AbstractC6995 abstractC69952 = (AbstractC6995) interfaceC4476Mo92212;
                    if (c0325.m961(abstractC69952)) {
                        Variance variance3 = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String str = abstractC69952.getName().f13701;
                        str.getClass();
                        return new C4884(C7239.m12443(errorTypeKind, str), variance3);
                    }
                    List listMo9736 = abstractC4877M9818.mo9736();
                    ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo9736, 10));
                    for (Object obj2 : listMo9736) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC8189.m13662();
                            throw null;
                        }
                        arrayList.add(m9804((AbstractC4869) obj2, c0325, (InterfaceC4462) interfaceC4872Mo97322.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = abstractC69952.f18756.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC4462) it.next()).mo9012());
                    }
                    return new C4884(AbstractC4892.m9812(m9803(new C0325(c0325, abstractC69952, arrayList, AbstractC4338.m8783(AbstractC4343.m8797(arrayList2, arrayList)), 14), abstractC4877M9818.mo9733(), abstractC4877M9818.mo9735(), i + 1, false), m9801(abstractC4877M9818, c0325, i)), abstractC4869.mo9752());
                }
            }
            return abstractC4869;
        }
        if (abstractC48692.mo9750()) {
            interfaceC4462.getClass();
            return AbstractC4916.m9860(interfaceC4462);
        }
        AbstractC4913 abstractC4913Mo9778 = abstractC48692.mo9751().mo9778();
        Variance varianceMo9752 = abstractC48692.mo9752();
        varianceMo9752.getClass();
        Variance varianceMo97522 = abstractC4869.mo9752();
        varianceMo97522.getClass();
        if (varianceMo97522 != varianceMo9752 && varianceMo97522 != (variance2 = Variance.INVARIANT) && varianceMo9752 == variance2) {
            varianceMo9752 = varianceMo97522;
        }
        if (interfaceC4462 == null || (varianceMo9013 = interfaceC4462.mo9013()) == null) {
            varianceMo9013 = Variance.INVARIANT;
        }
        if (varianceMo9013 != varianceMo9752 && varianceMo9013 != (variance = Variance.INVARIANT) && varianceMo9752 == variance) {
            varianceMo9752 = variance;
        }
        m9800(abstractC4881Mo9751.getAnnotations(), abstractC4913Mo9778.getAnnotations());
        AbstractC4877 abstractC4877M9859 = AbstractC4916.m9859(AbstractC4892.m9818(abstractC4913Mo9778), abstractC4881Mo9751.mo9735());
        C4873 c4873Mo9733 = abstractC4881Mo9751.mo9733();
        if (!AbstractC4892.m9835(abstractC4877M9859)) {
            if (AbstractC4892.m9835(abstractC4877M9859)) {
                c4873Mo9733 = abstractC4877M9859.mo9733();
            } else {
                C4873 c4873Mo97332 = abstractC4877M9859.mo9733();
                c4873Mo9733.getClass();
                C4874 c4874 = C4873.f14171;
                c4873Mo97332.getClass();
                if (!c4873Mo9733.isEmpty() || !c4873Mo97332.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = c4874.f14174.values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        C4912 c4912 = (C4912) c4873Mo9733.f14173.get(iIntValue);
                        C4912 c49122 = (C4912) c4873Mo97332.f14173.get(iIntValue);
                        if (c4912 != null) {
                            if (c49122 != null) {
                                InterfaceC6480 c6484 = c4912.f14237;
                                InterfaceC6480 interfaceC6480 = c49122.f14237;
                                c6484.getClass();
                                interfaceC6480.getClass();
                                if (c6484.isEmpty()) {
                                    c6484 = interfaceC6480;
                                } else if (!interfaceC6480.isEmpty()) {
                                    c6484 = new C6484(1, AbstractC4346.m8850(new InterfaceC6480[]{c6484, interfaceC6480}));
                                }
                                c4912 = new C4912(c6484);
                            }
                            c49122 = c4912;
                        } else if (c49122 == null) {
                            c49122 = null;
                        } else if (c4912 != null) {
                            InterfaceC6480 c64842 = c49122.f14237;
                            InterfaceC6480 interfaceC64802 = c4912.f14237;
                            c64842.getClass();
                            interfaceC64802.getClass();
                            if (c64842.isEmpty()) {
                                c64842 = interfaceC64802;
                            } else if (!interfaceC64802.isEmpty()) {
                                c64842 = new C6484(1, AbstractC4346.m8850(new InterfaceC6480[]{c64842, interfaceC64802}));
                            }
                            c49122 = new C4912(c64842);
                        }
                        if (c49122 != null) {
                            arrayList3.add(c49122);
                        }
                    }
                    c4873Mo9733 = C4874.m9773(arrayList3);
                }
            }
            abstractC4877M9859 = AbstractC4892.m9828(abstractC4877M9859, null, c4873Mo9733, 1);
        }
        return new C4884(abstractC4877M9859, varianceMo9752);
    }
}
