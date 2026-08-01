package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4789;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p065.C6867;
import p067.C6884;
import p070.AbstractC6911;
import p071.AbstractC6912;
import p072.C6922;
import p077.C6969;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4648 implements InterfaceC4801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6867 f13580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6969 f13581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6867 f13582;

    public C4648(C6969 c6969, ProtoBuf$Package protoBuf$Package, C6884 c6884, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        c6969.getClass();
        protoBuf$Package.getClass();
        c6884.getClass();
        deserializedContainerAbiStability.getClass();
        C6867 c6867 = new C6867(C6867.m12060(AbstractC4430.m8987(c6969.f18666)));
        C6922 c6922 = c6969.f18665;
        C6867 c6867M12061 = null;
        String str = c6922.f18478 != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART ? null : c6922.f18473;
        if (str != null && str.length() > 0) {
            c6867M12061 = C6867.m12061(str);
        }
        new C4789(z);
        this.f13582 = c6867;
        this.f13580 = c6867M12061;
        this.f13581 = c6969;
        C4724 c4724 = AbstractC6912.f18440;
        c4724.getClass();
        Integer num = (Integer) AbstractC6911.m12176(protoBuf$Package, c4724);
        if (num != null) {
            c6884.getString(num.intValue());
        }
    }

    public final String toString() {
        return C4648.class.getSimpleName() + ": " + this.f13582;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 m9262() {
        C4686 c4686;
        C6867 c6867 = this.f13582;
        String str = c6867.f18315;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c4686 = C4686.f13690;
            if (c4686 == null) {
                C6867.m12063(9);
                throw null;
            }
        } else {
            c4686 = new C4686(str.substring(0, iLastIndexOf).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
        }
        String strM12064 = c6867.m12064();
        strM12064.getClass();
        return new C4687(c4686, C4690.m9340(AbstractC5143.m10142(strM12064, '/')));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String mo9258() {
        return AbstractC0053.m155(new StringBuilder("Class '"), m9262().m9337().f13692.f13689, '\'');
    }
}
