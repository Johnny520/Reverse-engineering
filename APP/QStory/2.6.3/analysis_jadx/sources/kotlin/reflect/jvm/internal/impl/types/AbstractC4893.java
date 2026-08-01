package kotlin.reflect.jvm.internal.impl.types;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4211;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import kotlin.reflect.jvm.internal.impl.types.checker.C4858;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import lin.xposed.hook.javaplugin.C5554;
import p034.AbstractC6347;
import p046.C6482;
import p046.C6484;
import p046.InterfaceC6481;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p079.C6982;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7228;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p097.InterfaceC7231;
import p098.C7232;
import p098.C7239;
import p098.C7240;
import p101.InterfaceC7254;
import p103.C7273;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4893 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C4874 m9799(InterfaceC6481 interfaceC6481) {
        interfaceC6481.getClass();
        if (interfaceC6481.isEmpty()) {
            C4874.f14175.getClass();
            return C4874.f14176;
        }
        C4875 c4875 = C4874.f14175;
        List listM11928 = AbstractC6347.m11928(new C4913(interfaceC6481));
        c4875.getClass();
        return C4875.m9767(listM11928);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7220 m9800(InterfaceC7220 interfaceC7220, InterfaceC7220 interfaceC72202) {
        AbstractC4896 abstractC4896M9707;
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        if (abstractC4878M9706 == null && ((abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220)) == null || (abstractC4878M9706 = AbstractC4860.m9667(abstractC4896M9707)) == null)) {
            abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M9706.getClass();
        }
        InterfaceC4463 interfaceC4463M9698 = AbstractC4860.m9698(AbstractC4860.m9719(abstractC4878M9706));
        C4858 c4858 = C4858.f14140;
        if (interfaceC4463M9698 != null) {
            return AbstractC4860.m9673(interfaceC7220) ? c4858.m9629(interfaceC72202) : interfaceC72202;
        }
        InterfaceC7230 interfaceC7230 = (InterfaceC7230) AbstractC4344.m8779(AbstractC4860.m9705(interfaceC7220));
        if (AbstractC4897.f14218[AbstractC4860.m9699(interfaceC7230).ordinal()] == 1) {
            c4858.mo9596();
            throw null;
        }
        AbstractC4914 abstractC4914M9694 = AbstractC4860.m9694(c4858, interfaceC7230);
        abstractC4914M9694.getClass();
        InterfaceC7220 interfaceC7220M9800 = m9800(abstractC4914M9694, interfaceC72202);
        interfaceC7220M9800.getClass();
        if (interfaceC7220M9800 instanceof AbstractC4882) {
            c4858.mo9596();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c4858);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC2442.m4575(AbstractC4396.f12975, c4858.getClass(), sb).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static C4919 m9801(List list, AbstractC4916 abstractC4916, InterfaceC4499 interfaceC4499, List list2, boolean[] zArr) throws Exception {
        if (abstractC4916 == null) {
            m9813(6);
            throw null;
        }
        if (interfaceC4499 == null) {
            m9813(7);
            throw null;
        }
        if (list2 == null) {
            m9813(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            InterfaceC4463 interfaceC4463 = (InterfaceC4463) it.next();
            C6982 c6982M12299 = C6982.m12299(interfaceC4499, interfaceC4463.getAnnotations(), interfaceC4463.mo9004(), interfaceC4463.mo9003(), interfaceC4463.getName(), i2, interfaceC4463.mo9000());
            map.put(interfaceC4463.mo9001(), new C4885(c6982M12299.mo9025()));
            map2.put(interfaceC4463, c6982M12299);
            list2.add(c6982M12299);
            i2++;
        }
        C4884 c4884 = new C4884(map, 1);
        C4919 c4919M9855 = C4919.m9855(abstractC4916, c4884);
        C4919 c4919M98552 = C4919.m9855(new C4867(abstractC4916, i), c4884);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC4463 interfaceC44632 = (InterfaceC4463) it2.next();
            C6982 c6982 = (C6982) map2.get(interfaceC44632);
            for (AbstractC4882 abstractC4882 : interfaceC44632.getUpperBounds()) {
                InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
                AbstractC4882 abstractC4882M9862 = (((interfaceC4477Mo9211 instanceof InterfaceC4463) && AbstractC2905.m6305((InterfaceC4463) interfaceC4477Mo9211, null, null)) ? c4919M9855 : c4919M98552).m9862(abstractC4882, Variance.OUT_VARIANCE);
                if (abstractC4882M9862 == null) {
                    return null;
                }
                if (abstractC4882M9862 != abstractC4882 && zArr != null) {
                    zArr[0] = true;
                }
                if (c6982.f18678) {
                    C5925.m11311("Type parameter descriptor is already initialized: ".concat(c6982.m12301()));
                    return null;
                }
                if (!m9829(abstractC4882M9862)) {
                    c6982.f18679.add(abstractC4882M9862);
                }
            }
            if (c6982.f18678) {
                C5925.m11311("Type parameter descriptor is already initialized: ".concat(c6982.m12301()));
                return null;
            }
            c6982.f18678 = true;
        }
        return c4919M9855;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C4919 m9802(List list, AbstractC4916 abstractC4916, InterfaceC4499 interfaceC4499, ArrayList arrayList) throws Exception {
        if (abstractC4916 == null) {
            m9813(1);
            throw null;
        }
        if (interfaceC4499 == null) {
            m9813(2);
            throw null;
        }
        if (arrayList == null) {
            m9813(3);
            throw null;
        }
        C4919 c4919M9801 = m9801(list, abstractC4916, interfaceC4499, arrayList, null);
        if (c4919M9801 != null) {
            return c4919M9801;
        }
        C5925.m11304("Substitution failed");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m9803(InterfaceC7229 interfaceC7229, InterfaceC7220 interfaceC7220, InterfaceC7220 interfaceC72202) {
        if (interfaceC7220 == interfaceC72202) {
            return true;
        }
        InterfaceC7219 interfaceC7219Mo9641 = interfaceC7229.mo9641(interfaceC7220);
        InterfaceC7219 interfaceC7219Mo96412 = interfaceC7229.mo9641(interfaceC72202);
        if (interfaceC7219Mo9641 != null && interfaceC7219Mo96412 != null) {
            return m9804(interfaceC7229, interfaceC7219Mo9641, interfaceC7219Mo96412);
        }
        InterfaceC7221 interfaceC7221Mo9626 = interfaceC7229.mo9626(interfaceC7220);
        InterfaceC7221 interfaceC7221Mo96262 = interfaceC7229.mo9626(interfaceC72202);
        return interfaceC7221Mo9626 != null && interfaceC7221Mo96262 != null && m9804(interfaceC7229, interfaceC7229.mo9594(interfaceC7221Mo9626), interfaceC7229.mo9594(interfaceC7221Mo96262)) && m9804(interfaceC7229, interfaceC7229.mo9593(interfaceC7221Mo9626), interfaceC7229.mo9593(interfaceC7221Mo96262));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m9804(InterfaceC7229 interfaceC7229, InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        if (interfaceC7229.mo9633(interfaceC7219) == interfaceC7229.mo9633(interfaceC72192) && interfaceC7229.mo9607(interfaceC7219) == interfaceC7229.mo9607(interfaceC72192) && interfaceC7229.mo9654(interfaceC7219) == interfaceC7229.mo9654(interfaceC72192) && interfaceC7229.mo9639(interfaceC7229.mo9623(interfaceC7219), interfaceC7229.mo9623(interfaceC72192))) {
            if (interfaceC7229.mo9638(interfaceC7219, interfaceC72192)) {
                return true;
            }
            int iMo9633 = interfaceC7229.mo9633(interfaceC7219);
            for (int i = 0; i < iMo9633; i++) {
                InterfaceC7230 interfaceC7230Mo9660 = interfaceC7229.mo9660(interfaceC7219, i);
                InterfaceC7230 interfaceC7230Mo96602 = interfaceC7229.mo9660(interfaceC72192, i);
                if (interfaceC7229.mo9617(interfaceC7230Mo9660) == interfaceC7229.mo9617(interfaceC7230Mo96602)) {
                    if (!interfaceC7229.mo9617(interfaceC7230Mo9660)) {
                        if (interfaceC7229.mo9643(interfaceC7230Mo9660) == interfaceC7229.mo9643(interfaceC7230Mo96602)) {
                            InterfaceC7220 interfaceC7220Mo9640 = interfaceC7229.mo9640(interfaceC7230Mo9660);
                            interfaceC7220Mo9640.getClass();
                            InterfaceC7220 interfaceC7220Mo96402 = interfaceC7229.mo9640(interfaceC7230Mo96602);
                            interfaceC7220Mo96402.getClass();
                            if (!m9803(interfaceC7229, interfaceC7220Mo9640, interfaceC7220Mo96402)) {
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
    public static final AbstractC4914 m9805(AbstractC4914 abstractC4914, AbstractC4882 abstractC4882) {
        abstractC4914.getClass();
        if (abstractC4914 instanceof InterfaceC4918) {
            return m9805(((InterfaceC4918) abstractC4914).mo9778(), abstractC4882);
        }
        if (abstractC4882 == null || abstractC4882.equals(abstractC4914)) {
            return abstractC4914;
        }
        if (abstractC4914 instanceof AbstractC4878) {
            return new C4887((AbstractC4878) abstractC4914, abstractC4882);
        }
        if (abstractC4914 instanceof AbstractC4896) {
            return new C4901((AbstractC4896) abstractC4914, abstractC4882);
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final AbstractC4878 m9806(AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        abstractC4878.getClass();
        abstractC48782.getClass();
        return m9829(abstractC4878) ? abstractC4878 : new C4895(abstractC4878, abstractC48782);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final AbstractC4878 m9807(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            return ((AbstractC4896) abstractC4914Mo9772).f14217;
        }
        if (abstractC4914Mo9772 instanceof AbstractC4878) {
            return (AbstractC4878) abstractC4914Mo9772;
        }
        C4211.m8611();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC4882 m9808(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        if (abstractC4882 instanceof InterfaceC4918) {
            return ((InterfaceC4918) abstractC4882).mo9777();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC4914 m9809(AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        abstractC4878.getClass();
        abstractC48782.getClass();
        return abstractC4878.equals(abstractC48782) ? abstractC4878 : new C4900(abstractC4878, abstractC48782);
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
    public static final p097.InterfaceC7220 m9810(p097.InterfaceC7220 r10, java.util.HashSet r11) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9810(飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲, java.util.HashSet):飘花落叶言世苏子兰楪哲.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC7228 m9811(InterfaceC7220 interfaceC7220) {
        boolean zM12013;
        AbstractC4914 abstractC4914Mo9772;
        AbstractC4896 abstractC4896M9707;
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        if (abstractC4878M9706 == null && ((abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220)) == null || (abstractC4878M9706 = AbstractC4860.m9667(abstractC4896M9707)) == null)) {
            abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M9706.getClass();
        }
        InterfaceC4463 interfaceC4463M9698 = AbstractC4860.m9698(AbstractC4860.m9719(abstractC4878M9706));
        if (interfaceC4463M9698 != null) {
            return interfaceC4463M9698;
        }
        if (interfaceC7220 instanceof AbstractC4882) {
            zM12013 = AbstractC6530.m12013((AbstractC4882) interfaceC7220);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC7220);
            sb.append(", ");
            C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7220.getClass(), sb));
            zM12013 = false;
        }
        if (zM12013) {
            InterfaceC7230 interfaceC7230 = (InterfaceC7230) AbstractC4344.m8779(AbstractC4860.m9705(interfaceC7220));
            interfaceC7230.getClass();
            if (AbstractC4860.m9674(interfaceC7230)) {
                abstractC4914Mo9772 = null;
            } else {
                if (!(interfaceC7230 instanceof AbstractC4870)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC7230);
                    sb2.append(", ");
                    C5925.m11314(AbstractC2442.m4575(AbstractC4396.f12975, interfaceC7230.getClass(), sb2));
                    return null;
                }
                abstractC4914Mo9772 = ((AbstractC4870) interfaceC7230).mo9741().mo9772();
            }
            if (abstractC4914Mo9772 != null) {
                return m9811(abstractC4914Mo9772);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC4878 m9812(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        AbstractC4878 abstractC4878 = abstractC4914Mo9772 instanceof AbstractC4878 ? (AbstractC4878) abstractC4914Mo9772 : null;
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        C4211.m8592(abstractC4882, "This is should be simple type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9813(int i) {
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
    public static final AbstractC4878 m9814(C4874 c4874, AbstractC6989 abstractC6989, List list) {
        c4874.getClass();
        abstractC6989.getClass();
        list.getClass();
        InterfaceC4873 interfaceC4873Mo9001 = abstractC6989.mo9001();
        interfaceC4873Mo9001.getClass();
        return m9818(list, c4874, interfaceC4873Mo9001, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.C4874 m9815(kotlin.reflect.jvm.internal.impl.types.C4874 r5, p046.InterfaceC6481 r6) {
        /*
            r5.getClass()
            飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲 r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4910.m9841(r5)
            if (r0 != r6) goto La
            return r5
        La:
            org.apache.commons.lang3.builder.飘花落叶言子楪世苏哲兰 r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4910.f14235
            kotlin.reflect.飘花落叶言子世楪苏哲兰[] r1 = kotlin.reflect.jvm.internal.impl.types.AbstractC4910.f14236
            r2 = 0
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14177
            int r0 = r0.f15521
            java.lang.Object r0 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世 r0 = (kotlin.reflect.jvm.internal.impl.types.C4913) r0
            if (r0 == 0) goto L67
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L2a
            goto L58
        L2a:
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14177
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世 r4 = (kotlin.reflect.jvm.internal.impl.types.C4913) r4
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r0)
            if (r4 != 0) goto L35
            r2.add(r3)
            goto L35
        L4c:
            int r0 = r2.size()
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14177
            int r1 = r1.mo12500()
            if (r0 != r1) goto L5a
        L58:
            r0 = r5
            goto L63
        L5a:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰 r0 = kotlin.reflect.jvm.internal.impl.types.C4874.f14175
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r0 = kotlin.reflect.jvm.internal.impl.types.C4875.m9767(r2)
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
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰 r6 = kotlin.reflect.jvm.internal.impl.types.C4874.f14175
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏哲兰世> r1 = kotlin.reflect.jvm.internal.impl.types.C4913.class
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r2 = kotlin.jvm.internal.AbstractC4396.f12975
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r1 = r2.mo8917(r1)
            r6.getClass()
            java.lang.String r1 = r1.mo8885()
            r1.getClass()
            int r6 = r6.m9769(r1)
            飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏哲兰 r1 = r5.f14177
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L9e
        L9d:
            return r5
        L9e:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r5 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏
            java.util.List r6 = p034.AbstractC6347.m11928(r0)
            r5.<init>(r6)
            return r5
        Lae:
            java.util.List r5 = kotlin.collections.AbstractC4344.m8797(r5)
            java.util.ArrayList r5 = kotlin.collections.AbstractC4344.m8794(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏 r5 = kotlin.reflect.jvm.internal.impl.types.C4875.m9767(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9815(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏, 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final AbstractC4878 m9816(C4874 c4874, InterfaceC4873 interfaceC4873, List list, boolean z, InterfaceC7254 interfaceC7254, InterfaceC6558 interfaceC6558) {
        c4874.getClass();
        interfaceC4873.getClass();
        list.getClass();
        interfaceC7254.getClass();
        C4889 c4889 = new C4889(interfaceC4873, list, z, interfaceC7254, interfaceC6558);
        return c4874.isEmpty() ? c4889 : new C4888(c4889, c4874);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final AbstractC4882 m9817(InterfaceC4463 interfaceC4463) throws Exception {
        interfaceC4463.getClass();
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4463.mo9028();
        interfaceC4499Mo9028.getClass();
        int i = 0;
        if (interfaceC4499Mo9028 instanceof InterfaceC4496) {
            List parameters = ((InterfaceC4496) interfaceC4499Mo9028).mo9001().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC4463) it.next()).mo9001());
            }
            List upperBounds = interfaceC4463.getUpperBounds();
            upperBounds.getClass();
            AbstractC6530 abstractC6530M9499 = AbstractC4773.m9499(interfaceC4463);
            AbstractC4882 abstractC4882M9862 = new C4919(new C4884(arrayList, i)).m9862((AbstractC4882) AbstractC4344.m8820(upperBounds), Variance.OUT_VARIANCE);
            return abstractC4882M9862 == null ? abstractC6530M9499.m12033() : abstractC4882M9862;
        }
        if (!(interfaceC4499Mo9028 instanceof InterfaceC4484)) {
            C5925.m11310("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((InterfaceC4484) interfaceC4499Mo9028).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC4463) it2.next()).mo9001());
        }
        List upperBounds2 = interfaceC4463.getUpperBounds();
        upperBounds2.getClass();
        AbstractC6530 abstractC6530M94992 = AbstractC4773.m9499(interfaceC4463);
        AbstractC4882 abstractC4882M98622 = new C4919(new C4884(arrayList2, i)).m9862((AbstractC4882) AbstractC4344.m8820(upperBounds2), Variance.OUT_VARIANCE);
        return abstractC4882M98622 == null ? abstractC6530M94992.m12033() : abstractC4882M98622;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static AbstractC4878 m9818(List list, C4874 c4874, InterfaceC4873 interfaceC4873, boolean z) {
        InterfaceC7254 interfaceC7254M6838;
        AbstractC6989 abstractC6989;
        InterfaceC7254 interfaceC7254Mo12308;
        InterfaceC7254 interfaceC7254;
        InterfaceC7254 interfaceC7254Mo9019;
        c4874.getClass();
        interfaceC4873.getClass();
        list.getClass();
        if (c4874.isEmpty() && list.isEmpty() && !z && interfaceC4873.mo9211() != null) {
            InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873.mo9211();
            interfaceC4477Mo9211.getClass();
            AbstractC4878 abstractC4878Mo9025 = interfaceC4477Mo9211.mo9025();
            abstractC4878Mo9025.getClass();
            return abstractC4878Mo9025;
        }
        InterfaceC4477 interfaceC4477Mo92112 = interfaceC4873.mo9211();
        if (interfaceC4477Mo92112 instanceof InterfaceC4463) {
            interfaceC7254M6838 = ((InterfaceC4463) interfaceC4477Mo92112).mo9025().mo9724();
        } else {
            if (interfaceC4477Mo92112 instanceof AbstractC6989) {
                int i = AbstractC4773.f13909;
                InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(interfaceC4477Mo92112);
                interfaceC4486M12104.getClass();
                AbstractC4773.m9504(interfaceC4486M12104);
                boolean zIsEmpty = list.isEmpty();
                C4849 c4849 = C4849.f14131;
                if (zIsEmpty) {
                    AbstractC6989 abstractC69892 = (AbstractC6989) interfaceC4477Mo92112;
                    abstractC6989 = abstractC69892 instanceof AbstractC6989 ? abstractC69892 : null;
                    if (abstractC6989 == null || (interfaceC7254Mo9019 = abstractC6989.mo9019(c4849)) == null) {
                        interfaceC7254M6838 = abstractC69892.mo9214();
                        interfaceC7254M6838.getClass();
                    } else {
                        interfaceC7254 = interfaceC7254Mo9019;
                    }
                } else {
                    AbstractC6989 abstractC69893 = (AbstractC6989) interfaceC4477Mo92112;
                    AbstractC4916 abstractC4916M9796 = AbstractC4869.f14163.m9796(interfaceC4873, list);
                    abstractC6989 = abstractC69893 instanceof AbstractC6989 ? abstractC69893 : null;
                    if (abstractC6989 == null || (interfaceC7254Mo12308 = abstractC6989.mo12308(abstractC4916M9796, c4849)) == null) {
                        interfaceC7254M6838 = abstractC69893.mo12309(abstractC4916M9796);
                        interfaceC7254M6838.getClass();
                    } else {
                        interfaceC7254 = interfaceC7254Mo12308;
                    }
                }
                return m9816(c4874, interfaceC4873, list, z, interfaceC7254, new C4881(list, c4874, interfaceC4873, z));
            }
            if (interfaceC4477Mo92112 instanceof AbstractC6996) {
                ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((AbstractC6996) interfaceC4477Mo92112).getName().f13705;
                str.getClass();
                interfaceC7254M6838 = C7240.m12472(errorScopeKind, true, str);
            } else {
                if (!(interfaceC4873 instanceof C4883)) {
                    C5554.m10887("Unsupported classifier: ", interfaceC4477Mo92112, " for constructor: ", interfaceC4873);
                    return null;
                }
                interfaceC7254M6838 = AbstractC3065.m6838("member scope for intersection type", ((C4883) interfaceC4873).f14192);
            }
        }
        interfaceC7254 = interfaceC7254M6838;
        return m9816(c4874, interfaceC4873, list, z, interfaceC7254, new C4881(list, c4874, interfaceC4873, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final AbstractC4878 m9819(List list, C4874 c4874, InterfaceC4873 interfaceC4873, InterfaceC7254 interfaceC7254, boolean z) {
        c4874.getClass();
        interfaceC4873.getClass();
        list.getClass();
        interfaceC7254.getClass();
        C4889 c4889 = new C4889(interfaceC4873, list, z, interfaceC7254, new C4881(list, c4874, interfaceC4873, interfaceC7254, z));
        return c4874.isEmpty() ? c4889 : new C4888(c4889, c4874);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final AbstractC4878 m9820(AbstractC4914 abstractC4914) {
        C4883 c4883;
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4914.mo9722();
        C4883 c48832 = interfaceC4873Mo9722 instanceof C4883 ? (C4883) interfaceC4873Mo9722 : null;
        if (c48832 != null) {
            LinkedHashSet<AbstractC4882> linkedHashSet = c48832.f14192;
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC4882 abstractC4882M9827 : linkedHashSet) {
                if (AbstractC4917.m9844(abstractC4882M9827)) {
                    abstractC4882M9827 = m9827(abstractC4882M9827.mo9772(), false);
                    z = true;
                }
                arrayList.add(abstractC4882M9827);
            }
            if (z) {
                AbstractC4882 abstractC4882M98272 = c48832.f14194;
                if (abstractC4882M98272 == null) {
                    abstractC4882M98272 = null;
                } else if (AbstractC4917.m9844(abstractC4882M98272)) {
                    abstractC4882M98272 = m9827(abstractC4882M98272.mo9772(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c4883 = new C4883(linkedHashSet2);
                c4883.f14194 = abstractC4882M98272;
            } else {
                c4883 = null;
            }
            if (c4883 != null) {
                return c4883.m9775();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static AbstractC4882 m9821(AbstractC4882 abstractC4882, List list, InterfaceC6481 interfaceC6481, int i) {
        if ((i & 2) != 0) {
            interfaceC6481 = abstractC4882.getAnnotations();
        }
        abstractC4882.getClass();
        if ((list.isEmpty() || list == abstractC4882.mo9726()) && interfaceC6481 == abstractC4882.getAnnotations()) {
            return abstractC4882;
        }
        C4874 c4874Mo9723 = abstractC4882.mo9723();
        if ((interfaceC6481 instanceof C6484) && ((C6484) interfaceC6481).isEmpty()) {
            interfaceC6481 = C6482.f17768;
        }
        C4874 c4874M9815 = m9815(c4874Mo9723, interfaceC6481);
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            AbstractC4896 abstractC4896 = (AbstractC4896) abstractC4914Mo9772;
            return m9809(m9823(abstractC4896.f14216, list, c4874M9815), m9823(abstractC4896.f14217, list, c4874M9815));
        }
        if (abstractC4914Mo9772 instanceof AbstractC4878) {
            return m9823((AbstractC4878) abstractC4914Mo9772, list, c4874M9815);
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ AbstractC4878 m9822(AbstractC4878 abstractC4878, List list, C4874 c4874, int i) {
        if ((i & 1) != 0) {
            list = abstractC4878.mo9726();
        }
        if ((i & 2) != 0) {
            c4874 = abstractC4878.mo9723();
        }
        return m9823(abstractC4878, list, c4874);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final AbstractC4878 m9823(AbstractC4878 abstractC4878, List list, C4874 c4874) {
        abstractC4878.getClass();
        list.getClass();
        c4874.getClass();
        if (list.isEmpty() && c4874 == abstractC4878.mo9723()) {
            return abstractC4878;
        }
        if (list.isEmpty()) {
            return abstractC4878.mo9770(c4874);
        }
        if (!(abstractC4878 instanceof C7239)) {
            return m9818(list, c4874, abstractC4878.mo9722(), abstractC4878.mo9725());
        }
        C7239 c7239 = (C7239) abstractC4878;
        InterfaceC4873 interfaceC4873 = c7239.f19284;
        C7232 c7232 = c7239.f19285;
        ErrorTypeKind errorTypeKind = c7239.f19280;
        boolean z = c7239.f19282;
        String[] strArr = c7239.f19283;
        return new C7239(interfaceC4873, c7232, errorTypeKind, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC4914 m9824(AbstractC4914 abstractC4914, AbstractC4882 abstractC4882) {
        abstractC4914.getClass();
        abstractC4882.getClass();
        return m9805(abstractC4914, m9808(abstractC4882));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m9825(C4872 c4872, InterfaceC7219 interfaceC7219, AbstractC4893 abstractC4893) {
        C4876 c4876 = C4876.f14181;
        c4872.getClass();
        interfaceC7219.getClass();
        InterfaceC7229 interfaceC7229 = c4872.f14170;
        if ((interfaceC7229.mo9663(interfaceC7219) && !interfaceC7229.mo9607(interfaceC7219)) || interfaceC7229.mo9654(interfaceC7219)) {
            return true;
        }
        c4872.m9763();
        ArrayDeque arrayDeque = c4872.f14174;
        arrayDeque.getClass();
        C7273 c7273 = c4872.f14173;
        c7273.getClass();
        arrayDeque.push(interfaceC7219);
        while (!arrayDeque.isEmpty()) {
            InterfaceC7219 interfaceC72192 = (InterfaceC7219) arrayDeque.pop();
            interfaceC72192.getClass();
            if (c7273.add(interfaceC72192)) {
                AbstractC4893 abstractC48932 = interfaceC7229.mo9607(interfaceC72192) ? c4876 : abstractC4893;
                if (abstractC48932.equals(c4876)) {
                    abstractC48932 = null;
                }
                if (abstractC48932 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC7229.mo9659(interfaceC7229.mo9623(interfaceC72192)).iterator();
                    while (it.hasNext()) {
                        InterfaceC7219 interfaceC7219Mo9597 = abstractC48932.mo9597(c4872, (InterfaceC7220) it.next());
                        if ((interfaceC7229.mo9663(interfaceC7219Mo9597) && !interfaceC7229.mo9607(interfaceC7219Mo9597)) || interfaceC7229.mo9654(interfaceC7219Mo9597)) {
                            c4872.m9765();
                            return true;
                        }
                        arrayDeque.add(interfaceC7219Mo9597);
                    }
                }
            }
        }
        c4872.m9765();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final AbstractC4878 m9826(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4896) {
            return ((AbstractC4896) abstractC4914Mo9772).f14216;
        }
        if (abstractC4914Mo9772 instanceof AbstractC4878) {
            return (AbstractC4878) abstractC4914Mo9772;
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC4914 m9827(AbstractC4914 abstractC4914, boolean z) {
        abstractC4914.getClass();
        C4906 c4906M9789 = C4891.m9789(abstractC4914, z);
        if (c4906M9789 != null) {
            return c4906M9789;
        }
        AbstractC4878 abstractC4878M9820 = m9820(abstractC4914);
        return abstractC4878M9820 != null ? abstractC4878M9820 : abstractC4914.mo9731(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m9828(C4872 c4872, InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
        InterfaceC7229 interfaceC7229 = c4872.f14170;
        if (interfaceC7229.mo9615(interfaceC7219)) {
            return true;
        }
        if (interfaceC7229.mo9607(interfaceC7219)) {
            return false;
        }
        if (c4872.f14171) {
            interfaceC7229.mo9630(interfaceC7219);
        }
        return interfaceC7229.mo9639(interfaceC7229.mo9623(interfaceC7219), interfaceC7231);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m9829(AbstractC4882 abstractC4882) {
        abstractC4882.getClass();
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (abstractC4914Mo9772 instanceof C7239) {
            return true;
        }
        return (abstractC4914Mo9772 instanceof AbstractC4896) && (((AbstractC4896) abstractC4914Mo9772).mo9836() instanceof C7239);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract InterfaceC7219 mo9597(C4872 c4872, InterfaceC7220 interfaceC7220);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract InterfaceC7220 mo9589(InterfaceC7220 interfaceC7220);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract InterfaceC7220 mo9586(InterfaceC7220 interfaceC7220);
}
