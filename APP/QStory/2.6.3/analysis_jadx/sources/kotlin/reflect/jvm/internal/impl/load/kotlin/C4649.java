package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4790;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p065.C6868;
import p067.C6885;
import p070.AbstractC6912;
import p071.AbstractC6913;
import p072.C6923;
import p077.C6970;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4649 implements InterfaceC4802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6868 f13584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6970 f13585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6868 f13586;

    public C4649(C6970 c6970, ProtoBuf$Package protoBuf$Package, C6885 c6885, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        c6970.getClass();
        protoBuf$Package.getClass();
        c6885.getClass();
        deserializedContainerAbiStability.getClass();
        C6868 c6868 = new C6868(C6868.m12088(AbstractC4431.m8977(c6970.f18661)));
        C6923 c6923 = c6970.f18660;
        C6868 c6868M12089 = null;
        String str = c6923.f18473 != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART ? null : c6923.f18468;
        if (str != null && str.length() > 0) {
            c6868M12089 = C6868.m12089(str);
        }
        new C4790(z);
        this.f13586 = c6868;
        this.f13584 = c6868M12089;
        this.f13585 = c6970;
        C4725 c4725 = AbstractC6913.f18435;
        c4725.getClass();
        Integer num = (Integer) AbstractC6912.m12204(protoBuf$Package, c4725);
        if (num != null) {
            c6885.getString(num.intValue());
        }
    }

    public final String toString() {
        return C4649.class.getSimpleName() + ": " + this.f13586;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4688 m9252() {
        C4687 c4687;
        C6868 c6868 = this.f13586;
        String str = c6868.f18310;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c4687 = C4687.f13694;
            if (c4687 == null) {
                C6868.m12091(9);
                throw null;
            }
        } else {
            c4687 = new C4687(str.substring(0, iLastIndexOf).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
        }
        String strM12092 = c6868.m12092();
        strM12092.getClass();
        return new C4688(c4687, C4691.m9330(AbstractC5144.m10142(strM12092, '/')));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String mo9248() {
        return AbstractC0053.m148(new StringBuilder("Class '"), m9252().m9327().f13696.f13693, '\'');
    }
}
