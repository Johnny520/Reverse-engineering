package p049;

import androidx.appcompat.app.C0108;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4779;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p045.C6467;
import p045.C6472;
import p046.C6476;
import p046.C6482;
import p046.InterfaceC6481;
import p066.AbstractC6870;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p079.C6988;
import p079.C6990;
import p079.C6991;
import p080.C7024;
import p080.InterfaceC7021;
import p080.InterfaceC7023;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6530 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4691 f17920 = C4691.m9333("<built-ins module>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4845 f17921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4837 f17922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4847 f17923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6988 f17924;

    public AbstractC6530(C4845 c4845) {
        this.f17921 = c4845;
        c4845.m9580(new C6520(this, 0));
        int i = 1;
        this.f17923 = new C4847(c4845, new C6520(this, i));
        this.f17922 = c4845.m9579(new C6476(this, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m12008(AbstractC4882 abstractC4882, C4686 c4686) {
        if (abstractC4882 == null) {
            m12020(105);
            throw null;
        }
        if (c4686 != null) {
            return !abstractC4882.mo9725() && m12011(abstractC4882, c4686);
        }
        m12020(106);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m12009(InterfaceC4484 interfaceC4484) {
        if (interfaceC4484.mo9002().getAnnotations().mo9518(AbstractC6527.f17893)) {
            return true;
        }
        if (!(interfaceC4484 instanceof InterfaceC4473)) {
            return false;
        }
        InterfaceC4473 interfaceC4473 = (InterfaceC4473) interfaceC4484;
        boolean zMo8995 = interfaceC4473.mo8995();
        C6991 getter = interfaceC4473.getGetter();
        C6990 setter = interfaceC4473.getSetter();
        if (getter == null || !m12009(getter)) {
            return false;
        }
        if (zMo8995) {
            return setter != null && m12009(setter);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m12010(AbstractC4882 abstractC4882, C4686 c4686) {
        if (c4686 != null) {
            return m12011(abstractC4882, c4686) && !abstractC4882.mo9725();
        }
        m12020(135);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m12011(AbstractC4882 abstractC4882, C4686 c4686) {
        if (abstractC4882 == null) {
            m12020(97);
            throw null;
        }
        if (c4686 != null) {
            return m12015(abstractC4882.mo9722(), c4686);
        }
        m12020(98);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m12012(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 != null) {
            return AbstractC6870.m12113(interfaceC4499, C4778.class, false) != null;
        }
        m12020(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m12013(AbstractC4882 abstractC4882) {
        if (abstractC4882 != null) {
            return m12011(abstractC4882, AbstractC6527.f17899);
        }
        m12020(88);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m12014(InterfaceC4477 interfaceC4477) {
        if (interfaceC4477 == null) {
            m12020(10);
            throw null;
        }
        for (InterfaceC4499 interfaceC4499Mo9028 = interfaceC4477; interfaceC4499Mo9028 != null; interfaceC4499Mo9028 = interfaceC4499Mo9028.mo9028()) {
            if (interfaceC4499Mo9028 instanceof InterfaceC4466) {
                C4687 c4687 = ((AbstractC6986) ((InterfaceC4466) interfaceC4499Mo9028)).f18687;
                C4691 c4691 = AbstractC6526.f17852;
                c4687.getClass();
                c4691.getClass();
                return c4687.f13696.m9317(c4691);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m12015(InterfaceC4873 interfaceC4873, C4686 c4686) {
        if (interfaceC4873 == null) {
            m12020(101);
            throw null;
        }
        if (c4686 != null) {
            InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873.mo9211();
            return (interfaceC4477Mo9211 instanceof AbstractC6989) && m12019((AbstractC6989) interfaceC4477Mo9211, c4686);
        }
        m12020(102);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m12016(AbstractC4882 abstractC4882) {
        return m12008(abstractC4882, AbstractC6527.f17880);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m12017(AbstractC4882 abstractC4882) {
        if (abstractC4882.mo9725()) {
            return false;
        }
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        return (interfaceC4477Mo9211 instanceof AbstractC6989) && m12021((AbstractC6989) interfaceC4477Mo9211) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m12018(AbstractC4882 abstractC4882) {
        if (abstractC4882 != null) {
            return m12011(abstractC4882, AbstractC6527.f17884) && !AbstractC4917.m9844(abstractC4882);
        }
        m12020(136);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12019(AbstractC6989 abstractC6989, C4686 c4686) {
        if (abstractC6989 == null) {
            m12020(103);
            throw null;
        }
        if (c4686 != null) {
            return abstractC6989.getName().equals(c4686.m9318()) && c4686.equals(AbstractC6870.m12101(abstractC6989));
        }
        m12020(104);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12020(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049.AbstractC6530.m12020(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static PrimitiveType m12021(AbstractC6989 abstractC6989) {
        if (AbstractC6527.f17907.contains(abstractC6989.getName())) {
            return (PrimitiveType) AbstractC6527.f17905.get(AbstractC6870.m12101(abstractC6989));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m12022(AbstractC4882 abstractC4882) {
        if (abstractC4882 != null) {
            return m12011(abstractC4882, AbstractC6527.f17885);
        }
        m12020(139);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static PrimitiveType m12023(InterfaceC4477 interfaceC4477) {
        if (interfaceC4477 == null) {
            m12020(77);
            throw null;
        }
        if (AbstractC6527.f17906.contains(interfaceC4477.getName())) {
            return (PrimitiveType) AbstractC6527.f17904.get(AbstractC6870.m12101(interfaceC4477));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4882 m12024(AbstractC4882 abstractC4882) {
        if (abstractC4882 == null) {
            m12020(68);
            throw null;
        }
        AbstractC4882 abstractC4882M12035 = m12035(abstractC4882);
        if (abstractC4882M12035 != null) {
            return abstractC4882M12035;
        }
        C7547.m12774(abstractC4882, "not array: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4878 m12025() {
        AbstractC4878 abstractC4878Mo9025 = m12036("Any").mo9025();
        if (abstractC4878Mo9025 != null) {
            return abstractC4878Mo9025;
        }
        m12020(51);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC7023 mo8968() {
        return C7024.f18862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12026(boolean z) {
        C4691 c4691 = f17920;
        c4691.getClass();
        C4845 c4845 = this.f17921;
        C6988 c6988 = new C6988(c4691, c4845, this, 48);
        this.f17924 = c6988;
        InterfaceC6523.f17832.getClass();
        c6988.f18700 = ((C4779) ((InterfaceC6523) C6524.f17833.getValue())).m9510(c4845, this.f17924, mo8969(), mo8948(), mo8968(), z);
        C6988 c69882 = this.f17924;
        c69882.getClass();
        List listM8846 = AbstractC4347.m8846(new C6988[]{c69882});
        listM8846.getClass();
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        c69882.f18703 = new C0108(listM8846, emptySet, EmptyList.INSTANCE, emptySet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4878 m12027(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m12020(54);
            throw null;
        }
        AbstractC4878 abstractC4878Mo9025 = m12036(primitiveType.getTypeName().m9335()).mo9025();
        if (abstractC4878Mo9025 != null) {
            return abstractC4878Mo9025;
        }
        m12020(55);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC4878 m12028() {
        AbstractC4878 abstractC4878Mo9025 = m12036("Unit").mo9025();
        if (abstractC4878Mo9025 != null) {
            return abstractC4878Mo9025;
        }
        m12020(65);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC4878 m12029() {
        AbstractC4878 abstractC4878Mo9025 = m12036("String").mo9025();
        if (abstractC4878Mo9025 != null) {
            return abstractC4878Mo9025;
        }
        m12020(66);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6989 m12030(int i) {
        AbstractC6989 abstractC6989M12039 = m12039(AbstractC6526.f17838.m9321(C4691.m9330(C6472.f17754.f17756 + i)));
        if (abstractC6989M12039 != null) {
            return abstractC6989M12039;
        }
        m12020(18);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC4878 m12031() {
        AbstractC4878 abstractC4878Mo9025 = m12036("Nothing").mo9025();
        if (abstractC4878Mo9025 != null) {
            return abstractC4878Mo9025;
        }
        m12020(49);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Iterable mo8969() {
        List listSingletonList = Collections.singletonList(new C6467(this.f17921, m12037()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m12020(5);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 m12032(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m12020(73);
            throw null;
        }
        AbstractC4878 abstractC4878 = (AbstractC4878) ((C6531) this.f17923.invoke()).f17926.get(primitiveType);
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        m12020(74);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC4878 m12033() {
        AbstractC4878 abstractC4878Mo9728 = m12025().mo9731(true);
        if (abstractC4878Mo9728 != null) {
            return abstractC4878Mo9728;
        }
        m12020(52);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC7021 mo8948() {
        return C7024.f18860;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4878 m12034(AbstractC4882 abstractC4882, Variance variance) {
        if (variance == null) {
            m12020(82);
            throw null;
        }
        if (abstractC4882 != null) {
            return m12038(variance, abstractC4882, C6482.f17768);
        }
        m12020(83);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4882 m12035(kotlin.reflect.jvm.internal.impl.types.AbstractC4882 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L90
            boolean r1 = m12013(r4)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r3 = r4.mo9726()
            int r3 = r3.size()
            r1 = 1
            if (r3 == r1) goto L17
            goto L8f
        L17:
            java.util.List r3 = r4.mo9726()
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪 r3 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4870) r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r3.mo9741()
            return r3
        L26:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r4 = kotlin.reflect.jvm.internal.impl.types.AbstractC4917.m9850(r4, r2)
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏哲世兰 r3 = r3.f17923
            java.lang.Object r3 = r3.invoke()
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世哲兰 r3 = (p049.C6531) r3
            java.util.HashMap r3 = r3.f17925
            java.lang.Object r3 = r3.get(r4)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4882) r3
            if (r3 == 0) goto L3d
            return r3
        L3d:
            int r3 = p066.AbstractC6870.f18312
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r3 = r4.mo9722()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r3 = r3.mo9211()
            if (r3 != 0) goto L4b
            r3 = r0
            goto L4f
        L4b:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r3 = p066.AbstractC6870.m12103(r3)
        L4f:
            if (r3 == 0) goto L8f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r4 = r4.mo9722()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r4 = r4.mo9211()
            if (r4 != 0) goto L5d
        L5b:
            r3 = r0
            goto L8c
        L5d:
            java.util.Set r1 = p049.AbstractC6529.f17919
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = r4.getName()
            r1.getClass()
            java.util.LinkedHashSet r2 = p049.AbstractC6529.f17916
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L6f
            goto L5b
        L6f:
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲 r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773.m9498(r4)
            if (r4 != 0) goto L76
            goto L5b
        L76:
            java.util.HashMap r1 = p049.AbstractC6529.f17918
            java.lang.Object r4 = r1.get(r4)
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲 r4 = (kotlin.reflect.jvm.internal.impl.name.C4688) r4
            if (r4 != 0) goto L81
            goto L5b
        L81:
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r3 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491.m9077(r3, r4)
            if (r3 != 0) goto L88
            goto L5b
        L88:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r3 = r3.mo9025()
        L8c:
            if (r3 == 0) goto L8f
            return r3
        L8f:
            return r0
        L90:
            r3 = 70
            m12020(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049.AbstractC6530.m12035(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AbstractC6989 m12036(String str) {
        if (str != null) {
            return (AbstractC6989) this.f17922.invoke(C4691.m9330(str));
        }
        m12020(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6988 m12037() {
        this.f17924.getClass();
        C6988 c6988 = this.f17924;
        if (c6988 != null) {
            return c6988;
        }
        m12020(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC4878 m12038(Variance variance, AbstractC4882 abstractC4882, InterfaceC6481 interfaceC6481) {
        if (variance == null) {
            m12020(78);
            throw null;
        }
        if (abstractC4882 != null) {
            return AbstractC4893.m9814(AbstractC4893.m9799(interfaceC6481), m12036("Array"), Collections.singletonList(new C4885(abstractC4882, variance)));
        }
        m12020(79);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC6989 m12039(C4687 c4687) {
        if (c4687 == null) {
            m12020(12);
            throw null;
        }
        AbstractC6989 abstractC6989M9080 = AbstractC4491.m9080(m12037(), c4687, NoLookupLocation.FROM_BUILTINS);
        if (abstractC6989M9080 != null) {
            return abstractC6989M9080;
        }
        m12020(13);
        throw null;
    }
}
