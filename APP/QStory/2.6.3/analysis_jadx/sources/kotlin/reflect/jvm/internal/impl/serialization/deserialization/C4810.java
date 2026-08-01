package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.core.view.C2207;
import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4787;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4875;
import kotlin.reflect.jvm.internal.impl.types.C4902;
import kotlin.reflect.jvm.internal.impl.types.C4913;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5121;
import p034.AbstractC6347;
import p046.InterfaceC6481;
import p049.AbstractC6530;
import p070.AbstractC6909;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4810 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4848 f14021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4848 f14022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f14023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4810 f14025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4824 f14026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f14027;

    public C4810(C4824 c4824, C4810 c4810, List list, String str, String str2) {
        Map linkedHashMap;
        list.getClass();
        this.f14026 = c4824;
        this.f14025 = c4810;
        this.f14024 = str;
        this.f14023 = str2;
        C4845 c4845 = c4824.f14062.f14092;
        int i = 0;
        this.f14022 = c4845.m9578(new C4803(this, i));
        this.f14021 = c4845.m9578(new C4803(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = AbstractC4339.m8776();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.getId()), new C4787(this.f14026, protoBuf$TypeParameter, i));
                i++;
            }
        }
        this.f14027 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4874 m9544(List list, InterfaceC6481 interfaceC6481) {
        C4874 c4874M9767;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C4902) it.next()).getClass();
            if (interfaceC6481.isEmpty()) {
                C4874.f14175.getClass();
                c4874M9767 = C4874.f14176;
            } else {
                C4875 c4875 = C4874.f14175;
                List listM11928 = AbstractC6347.m11928(new C4913(interfaceC6481));
                c4875.getClass();
                c4874M9767 = C4875.m9767(listM11928);
            }
            arrayList.add(c4874M9767);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC4344.m8804((Iterable) it2.next(), arrayList2);
        }
        C4874.f14175.getClass();
        return C4875.m9767(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList m9545(ProtoBuf$Type protoBuf$Type, C4810 c4810) {
        List<ProtoBuf$Type.Argument> argumentList = protoBuf$Type.getArgumentList();
        argumentList.getClass();
        ProtoBuf$Type protoBuf$TypeM12197 = AbstractC6909.m12197(protoBuf$Type, c4810.f14026.f14059);
        Iterable iterableM9545 = protoBuf$TypeM12197 != null ? m9545(protoBuf$TypeM12197, c4810) : null;
        if (iterableM9545 == null) {
            iterableM9545 = EmptyList.INSTANCE;
        }
        return AbstractC4344.m8793(iterableM9545, argumentList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4878 m9546(AbstractC4878 abstractC4878, AbstractC4882 abstractC4882) {
        AbstractC6530 abstractC6530M6317 = AbstractC2905.m6317(abstractC4878);
        InterfaceC6481 annotations = abstractC4878.getAnnotations();
        AbstractC4882 abstractC4882M6300 = AbstractC2905.m6300(abstractC4878);
        List listM6318 = AbstractC2905.m6318(abstractC4878);
        List listM8801 = AbstractC4344.m8801(1, AbstractC2905.m6306(abstractC4878));
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM8801, 10));
        Iterator it = listM8801.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC4870) it.next()).mo9741());
        }
        return AbstractC2905.m6320(abstractC6530M6317, annotations, abstractC4882M6300, listM6318, arrayList, abstractC4882, true).mo9731(abstractC4878.mo9725());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC6989 m9547(C4810 c4810, ProtoBuf$Type protoBuf$Type, int i) {
        C4824 c4824 = c4810.f14026;
        C4688 c4688M8319 = AbstractC3933.m8319(c4824.f14061, i);
        C5121 c5121M10111 = AbstractC5122.m10111(AbstractC5122.m10115(protoBuf$Type, new C4803(c4810, 2)), C4811.f14028);
        ArrayList arrayList = new ArrayList();
        Iterator it = c5121M10111.iterator();
        while (true) {
            C2207 c2207 = (C2207) it;
            if (!c2207.hasNext()) {
                break;
            }
            arrayList.add(c2207.next());
        }
        Iterator it2 = AbstractC5122.m10115(c4688M8319, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return ((C4688) obj).m9324();
            }
        }).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                AbstractC6347.m11921();
                throw null;
            }
        }
        while (arrayList.size() < i2) {
            arrayList.add(0);
        }
        return c4824.f14062.f14104.m967(c4688M8319, arrayList);
    }

    public final String toString() {
        C4810 c4810 = this.f14025;
        return this.f14024.concat(c4810 == null ? "" : ". Child of ".concat(c4810.f14024));
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
    public final kotlin.reflect.jvm.internal.impl.types.AbstractC4878 m9548(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810.m9548(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪兰哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4463 m9549(int i) {
        InterfaceC4463 interfaceC4463 = (InterfaceC4463) this.f14027.get(Integer.valueOf(i));
        if (interfaceC4463 != null) {
            return interfaceC4463;
        }
        C4810 c4810 = this.f14025;
        if (c4810 != null) {
            return c4810.m9549(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m9550() {
        return AbstractC4344.m8797(this.f14027.values());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC4882 m9551(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        if (!protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            return m9548(protoBuf$Type, true);
        }
        C4824 c4824 = this.f14026;
        String string = c4824.f14061.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId());
        AbstractC4878 abstractC4878M9548 = m9548(protoBuf$Type, true);
        ProtoBuf$Type protoBuf$TypeM12185 = AbstractC6909.m12185(protoBuf$Type, c4824.f14059);
        protoBuf$TypeM12185.getClass();
        return c4824.f14062.f14106.mo9266(protoBuf$Type, string, abstractC4878M9548, m9548(protoBuf$TypeM12185, true));
    }
}
