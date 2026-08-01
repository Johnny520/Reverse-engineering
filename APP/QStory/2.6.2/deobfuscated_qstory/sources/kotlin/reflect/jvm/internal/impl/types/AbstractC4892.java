package kotlin.reflect.jvm.internal.impl.types;

import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4210;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4859;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import kotlin.reflect.jvm.internal.impl.types.checker.C4857;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import lin.xposed.hook.javaplugin.C5553;
import p046.C6481;
import p046.C6483;
import p046.InterfaceC6480;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.C6981;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p098.C7231;
import p098.C7238;
import p098.C7239;
import p101.InterfaceC7253;
import p103.C7272;
import p175.AbstractC7738;
import p253.AbstractC8189;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4892 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C4873 m9805(InterfaceC6480 interfaceC6480) {
        interfaceC6480.getClass();
        if (interfaceC6480.isEmpty()) {
            C4873.f14171.getClass();
            return C4873.f14172;
        }
        C4874 c4874 = C4873.f14171;
        List listM13660 = AbstractC8189.m13660(new C4912(interfaceC6480));
        c4874.getClass();
        return C4874.m9773(listM13660);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7219 m9806(InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        AbstractC4895 abstractC4895M9717;
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        if (abstractC4877M9716 == null && ((abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219)) == null || (abstractC4877M9716 = AbstractC4859.m9677(abstractC4895M9717)) == null)) {
            abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M9716.getClass();
        }
        InterfaceC4462 interfaceC4462M9708 = AbstractC4859.m9708(AbstractC4859.m9729(abstractC4877M9716));
        C4857 c4857 = C4857.f14136;
        if (interfaceC4462M9708 != null) {
            return AbstractC4859.m9683(interfaceC7219) ? c4857.m9639(interfaceC72192) : interfaceC72192;
        }
        InterfaceC7229 interfaceC7229 = (InterfaceC7229) AbstractC4343.m8818(AbstractC4859.m9715(interfaceC7219));
        if (AbstractC4896.f14214[AbstractC4859.m9709(interfaceC7229).ordinal()] == 1) {
            c4857.mo9606();
            throw null;
        }
        AbstractC4913 abstractC4913M9704 = AbstractC4859.m9704(c4857, interfaceC7229);
        abstractC4913M9704.getClass();
        InterfaceC7219 interfaceC7219M9806 = m9806(abstractC4913M9704, interfaceC72192);
        interfaceC7219M9806.getClass();
        if (interfaceC7219M9806 instanceof AbstractC4881) {
            c4857.mo9606();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c4857);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC2442.m4555(AbstractC4395.f12971, c4857.getClass(), sb).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static C4918 m9807(List list, AbstractC4915 abstractC4915, InterfaceC4498 interfaceC4498, List list2, boolean[] zArr) throws Exception {
        if (abstractC4915 == null) {
            m9819(6);
            throw null;
        }
        if (interfaceC4498 == null) {
            m9819(7);
            throw null;
        }
        if (list2 == null) {
            m9819(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            InterfaceC4462 interfaceC4462 = (InterfaceC4462) it.next();
            C6981 c6981M12272 = C6981.m12272(interfaceC4498, interfaceC4462.getAnnotations(), interfaceC4462.mo9014(), interfaceC4462.mo9013(), interfaceC4462.getName(), i2, interfaceC4462.mo9010());
            map.put(interfaceC4462.mo9011(), new C4884(c6981M12272.mo9035()));
            map2.put(interfaceC4462, c6981M12272);
            list2.add(c6981M12272);
            i2++;
        }
        C4883 c4883 = new C4883(map, 1);
        C4918 c4918M9861 = C4918.m9861(abstractC4915, c4883);
        C4918 c4918M98612 = C4918.m9861(new C4866(abstractC4915, i), c4883);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC4462 interfaceC44622 = (InterfaceC4462) it2.next();
            C6981 c6981 = (C6981) map2.get(interfaceC44622);
            for (AbstractC4881 abstractC4881 : interfaceC44622.getUpperBounds()) {
                InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
                AbstractC4881 abstractC4881M9868 = (((interfaceC4476Mo9221 instanceof InterfaceC4462) && AbstractC7738.m13030((InterfaceC4462) interfaceC4476Mo9221, null, null)) ? c4918M9861 : c4918M98612).m9868(abstractC4881, Variance.OUT_VARIANCE);
                if (abstractC4881M9868 == null) {
                    return null;
                }
                if (abstractC4881M9868 != abstractC4881 && zArr != null) {
                    zArr[0] = true;
                }
                if (c6981.f18683) {
                    C5919.m11250("Type parameter descriptor is already initialized: ".concat(c6981.m12274()));
                    return null;
                }
                if (!m9835(abstractC4881M9868)) {
                    c6981.f18684.add(abstractC4881M9868);
                }
            }
            if (c6981.f18683) {
                C5919.m11250("Type parameter descriptor is already initialized: ".concat(c6981.m12274()));
                return null;
            }
            c6981.f18683 = true;
        }
        return c4918M9861;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C4918 m9808(List list, AbstractC4915 abstractC4915, InterfaceC4498 interfaceC4498, ArrayList arrayList) throws Exception {
        if (abstractC4915 == null) {
            m9819(1);
            throw null;
        }
        if (interfaceC4498 == null) {
            m9819(2);
            throw null;
        }
        if (arrayList == null) {
            m9819(3);
            throw null;
        }
        C4918 c4918M9807 = m9807(list, abstractC4915, interfaceC4498, arrayList, null);
        if (c4918M9807 != null) {
            return c4918M9807;
        }
        C5919.m11243("Substitution failed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m9809(InterfaceC7228 interfaceC7228, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        if (interfaceC7219 == interfaceC72192) {
            return true;
        }
        InterfaceC7218 interfaceC7218Mo9652 = interfaceC7228.mo9652(interfaceC7219);
        InterfaceC7218 interfaceC7218Mo96522 = interfaceC7228.mo9652(interfaceC72192);
        if (interfaceC7218Mo9652 != null && interfaceC7218Mo96522 != null) {
            return m9810(interfaceC7228, interfaceC7218Mo9652, interfaceC7218Mo96522);
        }
        InterfaceC7220 interfaceC7220Mo9636 = interfaceC7228.mo9636(interfaceC7219);
        InterfaceC7220 interfaceC7220Mo96362 = interfaceC7228.mo9636(interfaceC72192);
        return interfaceC7220Mo9636 != null && interfaceC7220Mo96362 != null && m9810(interfaceC7228, interfaceC7228.mo9604(interfaceC7220Mo9636), interfaceC7228.mo9604(interfaceC7220Mo96362)) && m9810(interfaceC7228, interfaceC7228.mo9603(interfaceC7220Mo9636), interfaceC7228.mo9603(interfaceC7220Mo96362));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m9810(InterfaceC7228 interfaceC7228, InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        if (interfaceC7228.mo9640(interfaceC7218) == interfaceC7228.mo9640(interfaceC72182) && interfaceC7228.mo9617(interfaceC7218) == interfaceC7228.mo9617(interfaceC72182) && interfaceC7228.mo9664(interfaceC7218) == interfaceC7228.mo9664(interfaceC72182) && interfaceC7228.mo9646(interfaceC7228.mo9632(interfaceC7218), interfaceC7228.mo9632(interfaceC72182))) {
            if (interfaceC7228.mo9648(interfaceC7218, interfaceC72182)) {
                return true;
            }
            int iMo9640 = interfaceC7228.mo9640(interfaceC7218);
            for (int i = 0; i < iMo9640; i++) {
                InterfaceC7229 interfaceC7229Mo9670 = interfaceC7228.mo9670(interfaceC7218, i);
                InterfaceC7229 interfaceC7229Mo96702 = interfaceC7228.mo9670(interfaceC72182, i);
                if (interfaceC7228.mo9627(interfaceC7229Mo9670) == interfaceC7228.mo9627(interfaceC7229Mo96702)) {
                    if (!interfaceC7228.mo9627(interfaceC7229Mo9670)) {
                        if (interfaceC7228.mo9657(interfaceC7229Mo9670) == interfaceC7228.mo9657(interfaceC7229Mo96702)) {
                            InterfaceC7219 interfaceC7219Mo9650 = interfaceC7228.mo9650(interfaceC7229Mo9670);
                            interfaceC7219Mo9650.getClass();
                            InterfaceC7219 interfaceC7219Mo96502 = interfaceC7228.mo9650(interfaceC7229Mo96702);
                            interfaceC7219Mo96502.getClass();
                            if (!m9809(interfaceC7228, interfaceC7219Mo9650, interfaceC7219Mo96502)) {
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
    public static final AbstractC4913 m9811(AbstractC4913 abstractC4913, AbstractC4881 abstractC4881) {
        abstractC4913.getClass();
        if (abstractC4913 instanceof InterfaceC4917) {
            return m9811(((InterfaceC4917) abstractC4913).mo9784(), abstractC4881);
        }
        if (abstractC4881 == null || abstractC4881.equals(abstractC4913)) {
            return abstractC4913;
        }
        if (abstractC4913 instanceof AbstractC4877) {
            return new C4886((AbstractC4877) abstractC4913, abstractC4881);
        }
        if (abstractC4913 instanceof AbstractC4895) {
            return new C4900((AbstractC4895) abstractC4913, abstractC4881);
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final AbstractC4877 m9812(AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        abstractC4877.getClass();
        abstractC48772.getClass();
        return m9835(abstractC4877) ? abstractC4877 : new C4894(abstractC4877, abstractC48772);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final AbstractC4877 m9813(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            return ((AbstractC4895) abstractC4913Mo9778).f14213;
        }
        if (abstractC4913Mo9778 instanceof AbstractC4877) {
            return (AbstractC4877) abstractC4913Mo9778;
        }
        C4210.m8621();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC4881 m9814(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        if (abstractC4881 instanceof InterfaceC4917) {
            return ((InterfaceC4917) abstractC4881).mo9783();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC4913 m9815(AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        abstractC4877.getClass();
        abstractC48772.getClass();
        return abstractC4877.equals(abstractC48772) ? abstractC4877 : new C4899(abstractC4877, abstractC48772);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p097.InterfaceC7219 m9816(p097.InterfaceC7219 r10, java.util.HashSet r11) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9816(飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, java.util.HashSet):飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC7227 m9817(InterfaceC7219 interfaceC7219) {
        boolean zM11970;
        AbstractC4913 abstractC4913Mo9778;
        AbstractC4895 abstractC4895M9717;
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        if (abstractC4877M9716 == null && ((abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219)) == null || (abstractC4877M9716 = AbstractC4859.m9677(abstractC4895M9717)) == null)) {
            abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M9716.getClass();
        }
        InterfaceC4462 interfaceC4462M9708 = AbstractC4859.m9708(AbstractC4859.m9729(abstractC4877M9716));
        if (interfaceC4462M9708 != null) {
            return interfaceC4462M9708;
        }
        if (interfaceC7219 instanceof AbstractC4881) {
            zM11970 = AbstractC6529.m11970((AbstractC4881) interfaceC7219);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7219);
            sb.append(", ");
            C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7219.getClass(), sb));
            zM11970 = false;
        }
        if (zM11970) {
            InterfaceC7229 interfaceC7229 = (InterfaceC7229) AbstractC4343.m8818(AbstractC4859.m9715(interfaceC7219));
            interfaceC7229.getClass();
            if (AbstractC4859.m9684(interfaceC7229)) {
                abstractC4913Mo9778 = null;
            } else {
                if (!(interfaceC7229 instanceof AbstractC4869)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC7229);
                    sb2.append(", ");
                    C5919.m11253(AbstractC2442.m4555(AbstractC4395.f12971, interfaceC7229.getClass(), sb2));
                    return null;
                }
                abstractC4913Mo9778 = ((AbstractC4869) interfaceC7229).mo9751().mo9778();
            }
            if (abstractC4913Mo9778 != null) {
                return m9817(abstractC4913Mo9778);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC4877 m9818(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        AbstractC4877 abstractC4877 = abstractC4913Mo9778 instanceof AbstractC4877 ? (AbstractC4877) abstractC4913Mo9778 : null;
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        C4210.m8602(abstractC4881, "This is should be simple type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9819(int i) {
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
    public static final AbstractC4877 m9820(C4873 c4873, AbstractC6988 abstractC6988, List list) {
        c4873.getClass();
        abstractC6988.getClass();
        list.getClass();
        InterfaceC4872 interfaceC4872Mo9011 = abstractC6988.mo9011();
        interfaceC4872Mo9011.getClass();
        return m9824(list, c4873, interfaceC4872Mo9011, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.C4873 m9821(kotlin.reflect.jvm.internal.impl.types.C4873 r5, p046.InterfaceC6480 r6) {
        /*
            r5.getClass()
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲 r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4909.m9847(r5)
            if (r0 != r6) goto La
            return r5
        La:
            org.apache.commons.lang3.builder.飘花落叶言子楪世苏哲兰 r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4909.f14231
            kotlin.reflect.飘花落叶言子世楪苏哲兰[] r1 = kotlin.reflect.jvm.internal.impl.types.AbstractC4909.f14232
            r2 = 0
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14173
            int r0 = r0.f15521
            java.lang.Object r0 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世 r0 = (kotlin.reflect.jvm.internal.impl.types.C4912) r0
            if (r0 == 0) goto L67
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L2a
            goto L58
        L2a:
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14173
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世 r4 = (kotlin.reflect.jvm.internal.impl.types.C4912) r4
            boolean r4 = kotlin.jvm.internal.AbstractC4394.m8917(r4, r0)
            if (r4 != 0) goto L35
            r2.add(r3)
            goto L35
        L4c:
            int r0 = r2.size()
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14173
            int r1 = r1.mo12473()
            if (r0 != r1) goto L5a
        L58:
            r0 = r5
            goto L63
        L5a:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰 r0 = kotlin.reflect.jvm.internal.impl.types.C4873.f14171
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r0 = kotlin.reflect.jvm.internal.impl.types.C4874.m9773(r2)
        L63:
            if (r0 != 0) goto L66
            goto L67
        L66:
            r5 = r0
        L67:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L78
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L78
            goto L9d
        L78:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世 r0 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世
            r0.<init>(r6)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰 r6 = kotlin.reflect.jvm.internal.impl.types.C4873.f14171
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世> r1 = kotlin.reflect.jvm.internal.impl.types.C4912.class
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r2 = kotlin.jvm.internal.AbstractC4395.f12971
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r1 = r2.mo8927(r1)
            r6.getClass()
            java.lang.String r1 = r1.mo8895()
            r1.getClass()
            int r6 = r6.m9775(r1)
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14173
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L9e
        L9d:
            return r5
        L9e:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r5 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏
            java.util.List r6 = p253.AbstractC8189.m13660(r0)
            r5.<init>(r6)
            return r5
        Lae:
            java.util.List r5 = kotlin.collections.AbstractC4343.m8804(r5)
            java.util.ArrayList r5 = kotlin.collections.AbstractC4343.m8821(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r5 = kotlin.reflect.jvm.internal.impl.types.C4874.m9773(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9821(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏, 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC4877 m9822(C4873 c4873, InterfaceC4872 interfaceC4872, List list, boolean z, InterfaceC7253 interfaceC7253, InterfaceC6557 interfaceC6557) {
        c4873.getClass();
        interfaceC4872.getClass();
        list.getClass();
        interfaceC7253.getClass();
        C4888 c4888 = new C4888(interfaceC4872, list, z, interfaceC7253, interfaceC6557);
        return c4873.isEmpty() ? c4888 : new C4887(c4888, c4873);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final AbstractC4881 m9823(InterfaceC4462 interfaceC4462) throws Exception {
        interfaceC4462.getClass();
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4462.mo9038();
        interfaceC4498Mo9038.getClass();
        int i = 0;
        if (interfaceC4498Mo9038 instanceof InterfaceC4495) {
            List parameters = ((InterfaceC4495) interfaceC4498Mo9038).mo9011().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC4462) it.next()).mo9011());
            }
            List upperBounds = interfaceC4462.getUpperBounds();
            upperBounds.getClass();
            AbstractC6529 abstractC6529M9509 = AbstractC4772.m9509(interfaceC4462);
            AbstractC4881 abstractC4881M9868 = new C4918(new C4883(arrayList, i)).m9868((AbstractC4881) AbstractC4343.m8827(upperBounds), Variance.OUT_VARIANCE);
            return abstractC4881M9868 == null ? abstractC6529M9509.m11990() : abstractC4881M9868;
        }
        if (!(interfaceC4498Mo9038 instanceof InterfaceC4483)) {
            C5919.m11249("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((InterfaceC4483) interfaceC4498Mo9038).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC4462) it2.next()).mo9011());
        }
        List upperBounds2 = interfaceC4462.getUpperBounds();
        upperBounds2.getClass();
        AbstractC6529 abstractC6529M95092 = AbstractC4772.m9509(interfaceC4462);
        AbstractC4881 abstractC4881M98682 = new C4918(new C4883(arrayList2, i)).m9868((AbstractC4881) AbstractC4343.m8827(upperBounds2), Variance.OUT_VARIANCE);
        return abstractC4881M98682 == null ? abstractC6529M95092.m11990() : abstractC4881M98682;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static AbstractC4877 m9824(List list, C4873 c4873, InterfaceC4872 interfaceC4872, boolean z) {
        InterfaceC7253 interfaceC7253M14364;
        AbstractC6988 abstractC6988;
        InterfaceC7253 interfaceC7253Mo12281;
        InterfaceC7253 interfaceC7253;
        InterfaceC7253 interfaceC7253Mo9029;
        c4873.getClass();
        interfaceC4872.getClass();
        list.getClass();
        if (c4873.isEmpty() && list.isEmpty() && !z && interfaceC4872.mo9221() != null) {
            InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872.mo9221();
            interfaceC4476Mo9221.getClass();
            AbstractC4877 abstractC4877Mo9035 = interfaceC4476Mo9221.mo9035();
            abstractC4877Mo9035.getClass();
            return abstractC4877Mo9035;
        }
        InterfaceC4476 interfaceC4476Mo92212 = interfaceC4872.mo9221();
        if (interfaceC4476Mo92212 instanceof InterfaceC4462) {
            interfaceC7253M14364 = ((InterfaceC4462) interfaceC4476Mo92212).mo9035().mo9734();
        } else {
            if (interfaceC4476Mo92212 instanceof AbstractC6988) {
                int i = AbstractC4772.f13905;
                InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(interfaceC4476Mo92212);
                interfaceC4485M12076.getClass();
                AbstractC4772.m9514(interfaceC4485M12076);
                boolean zIsEmpty = list.isEmpty();
                C4848 c4848 = C4848.f14127;
                if (zIsEmpty) {
                    AbstractC6988 abstractC69882 = (AbstractC6988) interfaceC4476Mo92212;
                    abstractC6988 = abstractC69882 instanceof AbstractC6988 ? abstractC69882 : null;
                    if (abstractC6988 == null || (interfaceC7253Mo9029 = abstractC6988.mo9029(c4848)) == null) {
                        interfaceC7253M14364 = abstractC69882.mo9224();
                        interfaceC7253M14364.getClass();
                    } else {
                        interfaceC7253 = interfaceC7253Mo9029;
                    }
                } else {
                    AbstractC6988 abstractC69883 = (AbstractC6988) interfaceC4476Mo92212;
                    AbstractC4915 abstractC4915M9802 = AbstractC4868.f14159.m9802(interfaceC4872, list);
                    abstractC6988 = abstractC69883 instanceof AbstractC6988 ? abstractC69883 : null;
                    if (abstractC6988 == null || (interfaceC7253Mo12281 = abstractC6988.mo12281(abstractC4915M9802, c4848)) == null) {
                        interfaceC7253M14364 = abstractC69883.mo12282(abstractC4915M9802);
                        interfaceC7253M14364.getClass();
                    } else {
                        interfaceC7253 = interfaceC7253Mo12281;
                    }
                }
                return m9822(c4873, interfaceC4872, list, z, interfaceC7253, new C4880(list, c4873, interfaceC4872, z));
            }
            if (interfaceC4476Mo92212 instanceof AbstractC6995) {
                ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((AbstractC6995) interfaceC4476Mo92212).getName().f13701;
                str.getClass();
                interfaceC7253M14364 = C7239.m12445(errorScopeKind, true, str);
            } else {
                if (!(interfaceC4872 instanceof C4882)) {
                    C5553.m10830("Unsupported classifier: ", interfaceC4476Mo92212, " for constructor: ", interfaceC4872);
                    return null;
                }
                interfaceC7253M14364 = C8675.m14364("member scope for intersection type", ((C4882) interfaceC4872).f14188);
            }
        }
        interfaceC7253 = interfaceC7253M14364;
        return m9822(c4873, interfaceC4872, list, z, interfaceC7253, new C4880(list, c4873, interfaceC4872, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC4877 m9825(List list, C4873 c4873, InterfaceC4872 interfaceC4872, InterfaceC7253 interfaceC7253, boolean z) {
        c4873.getClass();
        interfaceC4872.getClass();
        list.getClass();
        interfaceC7253.getClass();
        C4888 c4888 = new C4888(interfaceC4872, list, z, interfaceC7253, new C4880(list, c4873, interfaceC4872, interfaceC7253, z));
        return c4873.isEmpty() ? c4888 : new C4887(c4888, c4873);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final AbstractC4877 m9826(AbstractC4913 abstractC4913) {
        C4882 c4882;
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4913.mo9732();
        C4882 c48822 = interfaceC4872Mo9732 instanceof C4882 ? (C4882) interfaceC4872Mo9732 : null;
        if (c48822 != null) {
            LinkedHashSet<AbstractC4881> linkedHashSet = c48822.f14188;
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC4881 abstractC4881M9833 : linkedHashSet) {
                if (AbstractC4916.m9850(abstractC4881M9833)) {
                    abstractC4881M9833 = m9833(abstractC4881M9833.mo9778(), false);
                    z = true;
                }
                arrayList.add(abstractC4881M9833);
            }
            if (z) {
                AbstractC4881 abstractC4881M98332 = c48822.f14190;
                if (abstractC4881M98332 == null) {
                    abstractC4881M98332 = null;
                } else if (AbstractC4916.m9850(abstractC4881M98332)) {
                    abstractC4881M98332 = m9833(abstractC4881M98332.mo9778(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c4882 = new C4882(linkedHashSet2);
                c4882.f14190 = abstractC4881M98332;
            } else {
                c4882 = null;
            }
            if (c4882 != null) {
                return c4882.m9781();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static AbstractC4881 m9827(AbstractC4881 abstractC4881, List list, InterfaceC6480 interfaceC6480, int i) {
        if ((i & 2) != 0) {
            interfaceC6480 = abstractC4881.getAnnotations();
        }
        abstractC4881.getClass();
        if ((list.isEmpty() || list == abstractC4881.mo9736()) && interfaceC6480 == abstractC4881.getAnnotations()) {
            return abstractC4881;
        }
        C4873 c4873Mo9733 = abstractC4881.mo9733();
        if ((interfaceC6480 instanceof C6483) && ((C6483) interfaceC6480).isEmpty()) {
            interfaceC6480 = C6481.f17772;
        }
        C4873 c4873M9821 = m9821(c4873Mo9733, interfaceC6480);
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            AbstractC4895 abstractC4895 = (AbstractC4895) abstractC4913Mo9778;
            return m9815(m9829(abstractC4895.f14212, list, c4873M9821), m9829(abstractC4895.f14213, list, c4873M9821));
        }
        if (abstractC4913Mo9778 instanceof AbstractC4877) {
            return m9829((AbstractC4877) abstractC4913Mo9778, list, c4873M9821);
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ AbstractC4877 m9828(AbstractC4877 abstractC4877, List list, C4873 c4873, int i) {
        if ((i & 1) != 0) {
            list = abstractC4877.mo9736();
        }
        if ((i & 2) != 0) {
            c4873 = abstractC4877.mo9733();
        }
        return m9829(abstractC4877, list, c4873);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC4877 m9829(AbstractC4877 abstractC4877, List list, C4873 c4873) {
        abstractC4877.getClass();
        list.getClass();
        c4873.getClass();
        if (list.isEmpty() && c4873 == abstractC4877.mo9733()) {
            return abstractC4877;
        }
        if (list.isEmpty()) {
            return abstractC4877.mo9776(c4873);
        }
        if (!(abstractC4877 instanceof C7238)) {
            return m9824(list, c4873, abstractC4877.mo9732(), abstractC4877.mo9735());
        }
        C7238 c7238 = (C7238) abstractC4877;
        InterfaceC4872 interfaceC4872 = c7238.f19289;
        C7231 c7231 = c7238.f19290;
        ErrorTypeKind errorTypeKind = c7238.f19285;
        boolean z = c7238.f19287;
        String[] strArr = c7238.f19288;
        return new C7238(interfaceC4872, c7231, errorTypeKind, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC4913 m9830(AbstractC4913 abstractC4913, AbstractC4881 abstractC4881) {
        abstractC4913.getClass();
        abstractC4881.getClass();
        return m9811(abstractC4913, m9814(abstractC4881));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m9831(C4871 c4871, InterfaceC7218 interfaceC7218, AbstractC4892 abstractC4892) {
        C4875 c4875 = C4875.f14177;
        c4871.getClass();
        interfaceC7218.getClass();
        InterfaceC7228 interfaceC7228 = c4871.f14166;
        if ((interfaceC7228.mo9673(interfaceC7218) && !interfaceC7228.mo9617(interfaceC7218)) || interfaceC7228.mo9664(interfaceC7218)) {
            return true;
        }
        c4871.m9769();
        ArrayDeque arrayDeque = c4871.f14170;
        arrayDeque.getClass();
        C7272 c7272 = c4871.f14169;
        c7272.getClass();
        arrayDeque.push(interfaceC7218);
        while (!arrayDeque.isEmpty()) {
            InterfaceC7218 interfaceC72182 = (InterfaceC7218) arrayDeque.pop();
            interfaceC72182.getClass();
            if (c7272.add(interfaceC72182)) {
                AbstractC4892 abstractC48922 = interfaceC7228.mo9617(interfaceC72182) ? c4875 : abstractC4892;
                if (abstractC48922.equals(c4875)) {
                    abstractC48922 = null;
                }
                if (abstractC48922 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC7228.mo9669(interfaceC7228.mo9632(interfaceC72182)).iterator();
                    while (it.hasNext()) {
                        InterfaceC7218 interfaceC7218Mo9607 = abstractC48922.mo9607(c4871, (InterfaceC7219) it.next());
                        if ((interfaceC7228.mo9673(interfaceC7218Mo9607) && !interfaceC7228.mo9617(interfaceC7218Mo9607)) || interfaceC7228.mo9664(interfaceC7218Mo9607)) {
                            c4871.m9771();
                            return true;
                        }
                        arrayDeque.add(interfaceC7218Mo9607);
                    }
                }
            }
        }
        c4871.m9771();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC4877 m9832(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4895) {
            return ((AbstractC4895) abstractC4913Mo9778).f14212;
        }
        if (abstractC4913Mo9778 instanceof AbstractC4877) {
            return (AbstractC4877) abstractC4913Mo9778;
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC4913 m9833(AbstractC4913 abstractC4913, boolean z) {
        abstractC4913.getClass();
        C4905 c4905M9795 = C4890.m9795(abstractC4913, z);
        if (c4905M9795 != null) {
            return c4905M9795;
        }
        AbstractC4877 abstractC4877M9826 = m9826(abstractC4913);
        return abstractC4877M9826 != null ? abstractC4877M9826 : abstractC4913.mo9741(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m9834(C4871 c4871, InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
        InterfaceC7228 interfaceC7228 = c4871.f14166;
        if (interfaceC7228.mo9625(interfaceC7218)) {
            return true;
        }
        if (interfaceC7228.mo9617(interfaceC7218)) {
            return false;
        }
        if (c4871.f14167) {
            interfaceC7228.mo9649(interfaceC7218);
        }
        return interfaceC7228.mo9646(interfaceC7228.mo9632(interfaceC7218), interfaceC7230);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m9835(AbstractC4881 abstractC4881) {
        abstractC4881.getClass();
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (abstractC4913Mo9778 instanceof C7238) {
            return true;
        }
        return (abstractC4913Mo9778 instanceof AbstractC4895) && (((AbstractC4895) abstractC4913Mo9778).mo9842() instanceof C7238);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract InterfaceC7218 mo9607(C4871 c4871, InterfaceC7219 interfaceC7219);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract InterfaceC7219 mo9599(InterfaceC7219 interfaceC7219);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract InterfaceC7219 mo9596(InterfaceC7219 interfaceC7219);
}
