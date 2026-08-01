package p049;

import androidx.appcompat.app.C0108;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p045.C6466;
import p045.C6471;
import p046.C6475;
import p046.C6481;
import p046.InterfaceC6480;
import p066.AbstractC6869;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p079.C6987;
import p079.C6989;
import p079.C6990;
import p080.C7023;
import p080.InterfaceC7020;
import p080.InterfaceC7022;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4690 f17924 = C4690.m9343("<built-ins module>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4844 f17925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4836 f17926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4846 f17927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6987 f17928;

    public AbstractC6529(C4844 c4844) {
        this.f17925 = c4844;
        c4844.m9590(new C6519(this, 0));
        int i = 1;
        this.f17927 = new C4846(c4844, new C6519(this, i));
        this.f17926 = c4844.m9589(new C6475(this, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m11965(AbstractC4881 abstractC4881, C4685 c4685) {
        if (abstractC4881 == null) {
            m11977(105);
            throw null;
        }
        if (c4685 != null) {
            return !abstractC4881.mo9735() && m11968(abstractC4881, c4685);
        }
        m11977(106);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m11966(InterfaceC4483 interfaceC4483) {
        if (interfaceC4483.mo9012().getAnnotations().mo9528(AbstractC6526.f17897)) {
            return true;
        }
        if (!(interfaceC4483 instanceof InterfaceC4472)) {
            return false;
        }
        InterfaceC4472 interfaceC4472 = (InterfaceC4472) interfaceC4483;
        boolean zMo9005 = interfaceC4472.mo9005();
        C6990 getter = interfaceC4472.getGetter();
        C6989 setter = interfaceC4472.getSetter();
        if (getter == null || !m11966(getter)) {
            return false;
        }
        if (zMo9005) {
            return setter != null && m11966(setter);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m11967(AbstractC4881 abstractC4881, C4685 c4685) {
        if (c4685 != null) {
            return m11968(abstractC4881, c4685) && !abstractC4881.mo9735();
        }
        m11977(135);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m11968(AbstractC4881 abstractC4881, C4685 c4685) {
        if (abstractC4881 == null) {
            m11977(97);
            throw null;
        }
        if (c4685 != null) {
            return m11972(abstractC4881.mo9732(), c4685);
        }
        m11977(98);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m11969(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 != null) {
            return AbstractC6869.m12085(interfaceC4498, C4777.class, false) != null;
        }
        m11977(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m11970(AbstractC4881 abstractC4881) {
        if (abstractC4881 != null) {
            return m11968(abstractC4881, AbstractC6526.f17903);
        }
        m11977(88);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m11971(InterfaceC4476 interfaceC4476) {
        if (interfaceC4476 == null) {
            m11977(10);
            throw null;
        }
        for (InterfaceC4498 interfaceC4498Mo9038 = interfaceC4476; interfaceC4498Mo9038 != null; interfaceC4498Mo9038 = interfaceC4498Mo9038.mo9038()) {
            if (interfaceC4498Mo9038 instanceof InterfaceC4465) {
                C4686 c4686 = ((AbstractC6985) ((InterfaceC4465) interfaceC4498Mo9038)).f18692;
                C4690 c4690 = AbstractC6525.f17856;
                c4686.getClass();
                c4690.getClass();
                return c4686.f13692.m9327(c4690);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m11972(InterfaceC4872 interfaceC4872, C4685 c4685) {
        if (interfaceC4872 == null) {
            m11977(101);
            throw null;
        }
        if (c4685 != null) {
            InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872.mo9221();
            return (interfaceC4476Mo9221 instanceof AbstractC6988) && m11976((AbstractC6988) interfaceC4476Mo9221, c4685);
        }
        m11977(102);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m11973(AbstractC4881 abstractC4881) {
        return m11965(abstractC4881, AbstractC6526.f17884);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m11974(AbstractC4881 abstractC4881) {
        if (abstractC4881.mo9735()) {
            return false;
        }
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        return (interfaceC4476Mo9221 instanceof AbstractC6988) && m11978((AbstractC6988) interfaceC4476Mo9221) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m11975(AbstractC4881 abstractC4881) {
        if (abstractC4881 != null) {
            return m11968(abstractC4881, AbstractC6526.f17888) && !AbstractC4916.m9850(abstractC4881);
        }
        m11977(136);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m11976(AbstractC6988 abstractC6988, C4685 c4685) {
        if (abstractC6988 == null) {
            m11977(103);
            throw null;
        }
        if (c4685 != null) {
            return abstractC6988.getName().equals(c4685.m9328()) && c4685.equals(AbstractC6869.m12073(abstractC6988));
        }
        m11977(104);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m11977(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049.AbstractC6529.m11977(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static PrimitiveType m11978(AbstractC6988 abstractC6988) {
        if (AbstractC6526.f17911.contains(abstractC6988.getName())) {
            return (PrimitiveType) AbstractC6526.f17909.get(AbstractC6869.m12073(abstractC6988));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m11979(AbstractC4881 abstractC4881) {
        if (abstractC4881 != null) {
            return m11968(abstractC4881, AbstractC6526.f17889);
        }
        m11977(139);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static PrimitiveType m11980(InterfaceC4476 interfaceC4476) {
        if (interfaceC4476 == null) {
            m11977(77);
            throw null;
        }
        if (AbstractC6526.f17910.contains(interfaceC4476.getName())) {
            return (PrimitiveType) AbstractC6526.f17908.get(AbstractC6869.m12073(interfaceC4476));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4881 m11981(AbstractC4881 abstractC4881) {
        if (abstractC4881 == null) {
            m11977(68);
            throw null;
        }
        AbstractC4881 abstractC4881M11992 = m11992(abstractC4881);
        if (abstractC4881M11992 != null) {
            return abstractC4881M11992;
        }
        C7546.m12745(abstractC4881, "not array: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4877 m11982() {
        AbstractC4877 abstractC4877Mo9035 = m11993("Any").mo9035();
        if (abstractC4877Mo9035 != null) {
            return abstractC4877Mo9035;
        }
        m11977(51);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC7022 mo8978() {
        return C7023.f18867;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11983(boolean z) {
        C4690 c4690 = f17924;
        c4690.getClass();
        C4844 c4844 = this.f17925;
        C6987 c6987 = new C6987(c4690, c4844, this, 48);
        this.f17928 = c6987;
        InterfaceC6522.f17836.getClass();
        c6987.f18705 = ((C4778) ((InterfaceC6522) C6523.f17837.getValue())).m9520(c4844, this.f17928, mo8979(), mo8958(), mo8978(), z);
        C6987 c69872 = this.f17928;
        c69872.getClass();
        List listM8850 = AbstractC4346.m8850(new C6987[]{c69872});
        listM8850.getClass();
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        c69872.f18708 = new C0108(listM8850, emptySet, EmptyList.INSTANCE, emptySet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4877 m11984(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m11977(54);
            throw null;
        }
        AbstractC4877 abstractC4877Mo9035 = m11993(primitiveType.getTypeName().m9345()).mo9035();
        if (abstractC4877Mo9035 != null) {
            return abstractC4877Mo9035;
        }
        m11977(55);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC4877 m11985() {
        AbstractC4877 abstractC4877Mo9035 = m11993("Unit").mo9035();
        if (abstractC4877Mo9035 != null) {
            return abstractC4877Mo9035;
        }
        m11977(65);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC4877 m11986() {
        AbstractC4877 abstractC4877Mo9035 = m11993("String").mo9035();
        if (abstractC4877Mo9035 != null) {
            return abstractC4877Mo9035;
        }
        m11977(66);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6988 m11987(int i) {
        AbstractC6988 abstractC6988M11996 = m11996(AbstractC6525.f17842.m9331(C4690.m9340(C6471.f17758.f17760 + i)));
        if (abstractC6988M11996 != null) {
            return abstractC6988M11996;
        }
        m11977(18);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC4877 m11988() {
        AbstractC4877 abstractC4877Mo9035 = m11993("Nothing").mo9035();
        if (abstractC4877Mo9035 != null) {
            return abstractC4877Mo9035;
        }
        m11977(49);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Iterable mo8979() {
        List listSingletonList = Collections.singletonList(new C6466(this.f17925, m11994()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m11977(5);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 m11989(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m11977(73);
            throw null;
        }
        AbstractC4877 abstractC4877 = (AbstractC4877) ((C6530) this.f17927.invoke()).f17930.get(primitiveType);
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        m11977(74);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC4877 m11990() {
        AbstractC4877 abstractC4877Mo9738 = m11982().mo9741(true);
        if (abstractC4877Mo9738 != null) {
            return abstractC4877Mo9738;
        }
        m11977(52);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC7020 mo8958() {
        return C7023.f18865;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC4877 m11991(AbstractC4881 abstractC4881, Variance variance) {
        if (variance == null) {
            m11977(82);
            throw null;
        }
        if (abstractC4881 != null) {
            return m11995(variance, abstractC4881, C6481.f17772);
        }
        m11977(83);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4881 m11992(kotlin.reflect.jvm.internal.impl.types.AbstractC4881 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L90
            boolean r1 = m11970(r4)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r3 = r4.mo9736()
            int r3 = r3.size()
            r1 = 1
            if (r3 == r1) goto L17
            goto L8f
        L17:
            java.util.List r3 = r4.mo9736()
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪 r3 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4869) r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r3.mo9751()
            return r3
        L26:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏世楪哲兰 r4 = kotlin.reflect.jvm.internal.impl.types.AbstractC4916.m9856(r4, r2)
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏哲世兰 r3 = r3.f17927
            java.lang.Object r3 = r3.invoke()
            飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世哲兰 r3 = (p049.C6530) r3
            java.util.HashMap r3 = r3.f17929
            java.lang.Object r3 = r3.get(r4)
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = (kotlin.reflect.jvm.internal.impl.types.AbstractC4881) r3
            if (r3 == 0) goto L3d
            return r3
        L3d:
            int r3 = p066.AbstractC6869.f18317
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r3 = r4.mo9732()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r3 = r3.mo9221()
            if (r3 != 0) goto L4b
            r3 = r0
            goto L4f
        L4b:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲苏世 r3 = p066.AbstractC6869.m12075(r3)
        L4f:
            if (r3 == 0) goto L8f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲兰苏楪 r4 = r4.mo9732()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世兰哲苏 r4 = r4.mo9221()
            if (r4 != 0) goto L5d
        L5b:
            r3 = r0
            goto L8c
        L5d:
            java.util.Set r1 = p049.AbstractC6528.f17923
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = r4.getName()
            r1.getClass()
            java.util.LinkedHashSet r2 = p049.AbstractC6528.f17920
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L6f
            goto L5b
        L6f:
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲 r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772.m9508(r4)
            if (r4 != 0) goto L76
            goto L5b
        L76:
            java.util.HashMap r1 = p049.AbstractC6528.f17922
            java.lang.Object r4 = r1.get(r4)
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲 r4 = (kotlin.reflect.jvm.internal.impl.name.C4687) r4
            if (r4 != 0) goto L81
            goto L5b
        L81:
            飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰 r3 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490.m9087(r3, r4)
            if (r3 != 0) goto L88
            goto L5b
        L88:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏 r3 = r3.mo9035()
        L8c:
            if (r3 == 0) goto L8f
            return r3
        L8f:
            return r0
        L90:
            r3 = 70
            m11977(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049.AbstractC6529.m11992(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AbstractC6988 m11993(String str) {
        if (str != null) {
            return (AbstractC6988) this.f17926.invoke(C4690.m9340(str));
        }
        m11977(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6987 m11994() {
        this.f17928.getClass();
        C6987 c6987 = this.f17928;
        if (c6987 != null) {
            return c6987;
        }
        m11977(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC4877 m11995(Variance variance, AbstractC4881 abstractC4881, InterfaceC6480 interfaceC6480) {
        if (variance == null) {
            m11977(78);
            throw null;
        }
        if (abstractC4881 != null) {
            return AbstractC4892.m9820(AbstractC4892.m9805(interfaceC6480), m11993("Array"), Collections.singletonList(new C4884(abstractC4881, variance)));
        }
        m11977(79);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC6988 m11996(C4686 c4686) {
        if (c4686 == null) {
            m11977(12);
            throw null;
        }
        AbstractC6988 abstractC6988M9090 = AbstractC4490.m9090(m11994(), c4686, NoLookupLocation.FROM_BUILTINS);
        if (abstractC6988M9090 != null) {
            return abstractC6988M9090;
        }
        m11977(13);
        throw null;
    }
}
