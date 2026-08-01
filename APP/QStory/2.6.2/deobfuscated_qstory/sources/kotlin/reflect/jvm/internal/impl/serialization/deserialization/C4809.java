package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.core.view.C2207;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4786;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4901;
import kotlin.reflect.jvm.internal.impl.types.C4912;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5120;
import p033.AbstractC6325;
import p046.InterfaceC6480;
import p049.AbstractC6529;
import p070.AbstractC6908;
import p079.AbstractC6988;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4847 f14017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4847 f14018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f14019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4809 f14021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4823 f14022;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f14023;

    public C4809(C4823 c4823, C4809 c4809, List list, String str, String str2) {
        Map linkedHashMap;
        list.getClass();
        this.f14022 = c4823;
        this.f14021 = c4809;
        this.f14020 = str;
        this.f14019 = str2;
        C4844 c4844 = c4823.f14058.f14088;
        int i = 0;
        this.f14018 = c4844.m9588(new C4802(this, i));
        this.f14017 = c4844.m9588(new C4802(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = AbstractC4338.m8781();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.getId()), new C4786(this.f14022, protoBuf$TypeParameter, i));
                i++;
            }
        }
        this.f14023 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4873 m9554(List list, InterfaceC6480 interfaceC6480) {
        C4873 c4873M9773;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C4901) it.next()).getClass();
            if (interfaceC6480.isEmpty()) {
                C4873.f14171.getClass();
                c4873M9773 = C4873.f14172;
            } else {
                C4874 c4874 = C4873.f14171;
                List listM13660 = AbstractC8189.m13660(new C4912(interfaceC6480));
                c4874.getClass();
                c4873M9773 = C4874.m9773(listM13660);
            }
            arrayList.add(c4873M9773);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC4343.m8794((Iterable) it2.next(), arrayList2);
        }
        C4873.f14171.getClass();
        return C4874.m9773(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList m9555(ProtoBuf$Type protoBuf$Type, C4809 c4809) {
        List<ProtoBuf$Type.Argument> argumentList = protoBuf$Type.getArgumentList();
        argumentList.getClass();
        ProtoBuf$Type protoBuf$TypeM12169 = AbstractC6908.m12169(protoBuf$Type, c4809.f14022.f14055);
        Iterable iterableM9555 = protoBuf$TypeM12169 != null ? m9555(protoBuf$TypeM12169, c4809) : null;
        if (iterableM9555 == null) {
            iterableM9555 = EmptyList.INSTANCE;
        }
        return AbstractC4343.m8825(iterableM9555, argumentList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4877 m9556(AbstractC4877 abstractC4877, AbstractC4881 abstractC4881) {
        AbstractC6529 abstractC6529M13053 = AbstractC7738.m13053(abstractC4877);
        InterfaceC6480 annotations = abstractC4877.getAnnotations();
        AbstractC4881 abstractC4881M11866 = AbstractC6325.m11866(abstractC4877);
        List listM11864 = AbstractC6325.m11864(abstractC4877);
        List listM8791 = AbstractC4343.m8791(1, AbstractC6325.m11860(abstractC4877));
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM8791, 10));
        Iterator it = listM8791.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4869) it.next()).mo9751());
        }
        return AbstractC6325.m11874(abstractC6529M13053, annotations, abstractC4881M11866, listM11864, arrayList, abstractC4881, true).mo9741(abstractC4877.mo9735());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC6988 m9557(C4809 c4809, ProtoBuf$Type protoBuf$Type, int i) {
        C4823 c4823 = c4809.f14022;
        C4687 c4687M13051 = AbstractC7738.m13051(c4823.f14057, i);
        C5120 c5120M10111 = AbstractC5121.m10111(AbstractC5121.m10112(protoBuf$Type, new C4802(c4809, 2)), C4810.f14024);
        ArrayList arrayList = new ArrayList();
        Iterator it = c5120M10111.iterator();
        while (true) {
            C2207 c2207 = (C2207) it;
            if (!c2207.hasNext()) {
                break;
            }
            arrayList.add(c2207.next());
        }
        Iterator it2 = AbstractC5121.m10112(c4687M13051, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return ((C4687) obj).m9334();
            }
        }).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                AbstractC8189.m13663();
                throw null;
            }
        }
        while (arrayList.size() < i2) {
            arrayList.add(0);
        }
        return c4823.f14058.f14100.m966(c4687M13051, arrayList);
    }

    public final String toString() {
        C4809 c4809 = this.f14021;
        return this.f14020.concat(c4809 == null ? "" : ". Child of ".concat(c4809.f14020));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4877 m9558(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4809.m9558(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4462 m9559(int i) {
        InterfaceC4462 interfaceC4462 = (InterfaceC4462) this.f14023.get(Integer.valueOf(i));
        if (interfaceC4462 != null) {
            return interfaceC4462;
        }
        C4809 c4809 = this.f14021;
        if (c4809 != null) {
            return c4809.m9559(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m9560() {
        return AbstractC4343.m8804(this.f14023.values());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC4881 m9561(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        if (!protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            return m9558(protoBuf$Type, true);
        }
        C4823 c4823 = this.f14022;
        String string = c4823.f14057.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId());
        AbstractC4877 abstractC4877M9558 = m9558(protoBuf$Type, true);
        ProtoBuf$Type protoBuf$TypeM12157 = AbstractC6908.m12157(protoBuf$Type, c4823.f14055);
        protoBuf$TypeM12157.getClass();
        return c4823.f14058.f14102.mo9276(protoBuf$Type, string, abstractC4877M9558, m9558(protoBuf$TypeM12157, true));
    }
}
