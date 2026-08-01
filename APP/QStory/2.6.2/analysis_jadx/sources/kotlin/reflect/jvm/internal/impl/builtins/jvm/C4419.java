package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import com.bumptech.glide.AbstractC3064;
import io.ktor.client.plugins.AbstractC3932;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4589;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4599;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import kotlin.reflect.jvm.internal.impl.storage.C4835;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.C4879;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import net.bytebuddy.pool.TypePool;
import p000.AbstractC6087;
import p046.InterfaceC6480;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p065.C6867;
import p066.AbstractC6869;
import p066.C6876;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.AbstractC7001;
import p079.C6987;
import p079.C7002;
import p079.C7015;
import p079.C7017;
import p080.AbstractC7019;
import p080.InterfaceC7020;
import p080.InterfaceC7022;
import p101.C7254;
import p253.AbstractC8189;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4419 implements InterfaceC7022, InterfaceC7020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13015 = {new PropertyReference1Impl(C4419.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new PropertyReference1Impl(C4419.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C4419.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4846 f13016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4836 f13017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4846 f13018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4877 f13019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4846 f13020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6987 f13021;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4836 f13022;

    public C4419(C6987 c6987, C4844 c4844, C1322 c1322) {
        this.f13021 = c6987;
        this.f13020 = new C4846(c4844, c1322);
        C7015 c7015 = new C7015(new C4414(c6987, new C4686("java.io"), 0), C4690.m9340("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC8189.m13660(new C4879(c4844, new C4423(this, 1))), c4844);
        c7015.m12330(C7254.f19341, EmptySet.INSTANCE, null);
        this.f13019 = c7015.mo9035();
        this.f13018 = new C4846(c4844, new C5027(this, 5, c4844));
        this.f13017 = new C4836(c4844, new ConcurrentHashMap(3, 1.0f, 2), new C4835(), 0);
        this.f13016 = new C4846(c4844, new C4423(this, 0));
        this.f13022 = c4844.m9589(new C1012(this, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4599 m8967(AbstractC6988 abstractC6988) {
        C4686 c4686M9337;
        if (abstractC6988 == null) {
            AbstractC6529.m11977(108);
            throw null;
        }
        if (!AbstractC6529.m11976(abstractC6988, AbstractC6526.f17889) && AbstractC6529.m11971(abstractC6988)) {
            int i = AbstractC4772.f13905;
            C4685 c4685M12073 = AbstractC6869.m12073(abstractC6988);
            c4685M12073.getClass();
            if (c4685M12073.m9323()) {
                String str = C4409.f12983;
                C4687 c4687M8955 = C4409.m8955(c4685M12073);
                if (c4687M8955 != null && (c4686M9337 = c4687M8955.m9337()) != null) {
                    AbstractC6988 abstractC6988M9090 = AbstractC4490.m9090(m8973().f13038, c4686M9337, NoLookupLocation.FROM_BUILTINS);
                    if (abstractC6988M9090 instanceof C4599) {
                        return (C4599) abstractC6988M9090;
                    }
                }
            }
        }
        return null;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo8968(AbstractC6988 abstractC6988) throws Exception {
        C4685 c4685M12073;
        C4651 c4651 = C4651.f13589;
        if (abstractC6988.mo9020() != ClassKind.CLASS) {
            return EmptyList.INSTANCE;
        }
        m8973().getClass();
        C4599 c4599M8967 = m8967(abstractC6988);
        if (c4599M8967 == null) {
            return EmptyList.INSTANCE;
        }
        C4686 c4686M9515 = AbstractC4772.m9515(c4599M8967);
        C4411 c4411 = C4411.f12996;
        c4411.getClass();
        String str = C4409.f12983;
        C4687 c4687M8956 = C4409.m8956(c4686M9515);
        AbstractC6988 abstractC6988M11996 = c4687M8956 != null ? c4411.m11996(c4687M8956.m9337()) : null;
        if (abstractC6988M11996 == null) {
            return EmptyList.INSTANCE;
        }
        C4918 c4918 = new C4918(AbstractC3064.m6771(abstractC6988M11996, c4599M8967));
        List list = (List) c4599M8967.f13426.f13383.invoke();
        ArrayList<C7017> arrayList = new ArrayList();
        for (Object obj : list) {
            C7017 c7017 = (C7017) obj;
            if (c7017.getVisibility().f13127.f13135) {
                Collection collectionMo9017 = abstractC6988M11996.mo9017();
                collectionMo9017.getClass();
                Collection<C7017> collection = collectionMo9017;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (C7017 c70172 : collection) {
                        c70172.getClass();
                        if (C6876.m12121(c70172, c7017.mo9015(c4918)) == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (c7017.mo9045().size() == 1) {
                    List listMo9045 = c7017.mo9045();
                    listMo9045.getClass();
                    InterfaceC4476 interfaceC4476Mo9221 = ((AbstractC6976) ((InterfaceC4455) AbstractC4343.m8818(listMo9045))).getType().mo9732().mo9221();
                    if (interfaceC4476Mo9221 != null) {
                        int i = AbstractC4772.f13905;
                        c4685M12073 = AbstractC6869.m12073(interfaceC4476Mo9221);
                        c4685M12073.getClass();
                    } else {
                        c4685M12073 = null;
                    }
                    C4685 c4685M120732 = AbstractC6869.m12073(abstractC6988);
                    c4685M120732.getClass();
                    if (AbstractC4394.m8917(c4685M12073, c4685M120732)) {
                    }
                }
                if (!AbstractC6529.m11966(c7017)) {
                    LinkedHashSet linkedHashSet = C4413.f12998;
                    String strM11410 = AbstractC6087.m11410(c7017, 3);
                    String str2 = C4409.f12983;
                    C4687 c4687M8955 = C4409.m8955(AbstractC4772.m9515(c4599M8967).f13692);
                    if (!linkedHashSet.contains((c4687M8955 != null ? C6867.m12060(c4687M8955) : AbstractC3932.m8304(c4599M8967, c4651)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM11410)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        for (C7017 c70173 : arrayList) {
            c70173.getClass();
            C7002 c7002M12309 = c70173.m12309(C4918.f14244);
            c7002M12309.f18812 = abstractC6988;
            c7002M12309.mo9107(abstractC6988.mo9035());
            c7002M12309.f18794 = true;
            c7002M12309.f18814 = c4918.f14245;
            LinkedHashSet linkedHashSet2 = C4413.f13004;
            String strM114102 = AbstractC6087.m11410(c70173, 3);
            String str3 = C4409.f12983;
            C4687 c4687M89552 = C4409.m8955(AbstractC4772.m9515(c4599M8967).f13692);
            if (!linkedHashSet2.contains((c4687M89552 != null ? C6867.m12060(c4687M89552) : AbstractC3932.m8304(c4599M8967, c4651)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM114102)) {
                c7002M12309.mo9093((InterfaceC6480) AbstractC9124.m14672(this.f13016, f13015[2]));
            }
            AbstractC7001 abstractC7001Mo11947 = c7002M12309.f18793.mo11947(c7002M12309);
            abstractC7001Mo11947.getClass();
            arrayList2.add((C7017) abstractC7001Mo11947);
        }
        return arrayList2;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Collection mo8969(AbstractC6988 abstractC6988) {
        Set setMo9178;
        abstractC6988.getClass();
        m8973().getClass();
        C4599 c4599M8967 = m8967(abstractC6988);
        if (c4599M8967 == null || (setMo9178 = c4599M8967.m9226().mo9178()) == null) {
            setMo9178 = EmptySet.INSTANCE;
        }
        return setMo9178;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection mo8970(kotlin.reflect.jvm.internal.impl.name.C4690 r14, p079.AbstractC6988 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.C4419.mo8970(kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰, 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰):java.util.Collection");
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection mo8971(AbstractC6988 abstractC6988) {
        int i = AbstractC4772.f13905;
        C4685 c4685M12073 = AbstractC6869.m12073(abstractC6988);
        c4685M12073.getClass();
        LinkedHashSet linkedHashSet = C4413.f13003;
        C4685 c4685 = AbstractC6526.f17903;
        boolean zEquals = c4685M12073.equals(c4685);
        boolean zIsAssignableFrom = false;
        AbstractC4877 abstractC4877 = this.f13019;
        if (!zEquals) {
            HashMap map = AbstractC6526.f17908;
            if (map.get(c4685M12073) == null) {
                if (c4685M12073.equals(c4685) || map.get(c4685M12073) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = C4409.f12983;
                    C4687 c4687M8955 = C4409.m8955(c4685M12073);
                    if (c4687M8955 != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c4687M8955.m9337().f13692.f13689));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? AbstractC8189.m13660(abstractC4877) : EmptyList.INSTANCE;
            }
        }
        return AbstractC8189.m13659((AbstractC4877) AbstractC9124.m14672(this.f13018, f13015[1]), abstractC4877);
    }

    @Override // p080.InterfaceC7020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8972(AbstractC6988 abstractC6988, C4793 c4793) {
        abstractC6988.getClass();
        C4599 c4599M8967 = m8967(abstractC6988);
        if (c4599M8967 == null || !c4793.getAnnotations().mo9528(AbstractC7019.f18864)) {
            return true;
        }
        m8973().getClass();
        String strM11410 = AbstractC6087.m11410(c4793, 3);
        C4589 c4589M9226 = c4599M8967.m9226();
        C4690 name = c4793.getName();
        name.getClass();
        Collection collectionMo9175 = c4589M9226.mo9175(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionMo9175 instanceof Collection) && collectionMo9175.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo9175.iterator();
        while (it.hasNext()) {
            if (AbstractC6087.m11410((InterfaceC4470) it.next(), 3).equals(strM11410)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4424 m8973() {
        return (C4424) AbstractC9124.m14672(this.f13020, f13015[0]);
    }
}
