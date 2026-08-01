package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5622;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p081.C7697;
import p083.C7714;
import p086.AbstractC7741;
import p087.AbstractC7742;
import p088.C7752;
import p093.C7799;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5481 implements InterfaceC5634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7697 f13929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7799 f13930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7697 f13931;

    public C5481(C7799 c7799, ProtoBuf$Package protoBuf$Package, C7714 c7714, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        c7799.getClass();
        protoBuf$Package.getClass();
        c7714.getClass();
        deserializedContainerAbiStability.getClass();
        C7697 c7697 = new C7697(C7697.m12647(AbstractC5263.m9536(c7799.f19006)));
        C7752 c7752 = c7799.f19005;
        C7697 c7697M12648 = null;
        String str = c7752.f18818 != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART ? null : c7752.f18813;
        if (str != null && str.length() > 0) {
            c7697M12648 = C7697.m12648(str);
        }
        new C5622(z);
        this.f13931 = c7697;
        this.f13929 = c7697M12648;
        this.f13930 = c7799;
        C5557 c5557 = AbstractC7742.f18780;
        c5557.getClass();
        Integer num = (Integer) AbstractC7741.m12763(protoBuf$Package, c5557);
        if (num != null) {
            c7714.getString(num.intValue());
        }
    }

    public final String toString() {
        return C5481.class.getSimpleName() + ": " + this.f13931;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5520 m9811() {
        C5519 c5519;
        C7697 c7697 = this.f13931;
        String str = c7697.f18655;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c5519 = C5519.f14039;
            if (c5519 == null) {
                C7697.m12650(9);
                throw null;
            }
        } else {
            c5519 = new C5519(str.substring(0, iLastIndexOf).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
        }
        String strM12651 = c7697.m12651();
        strM12651.getClass();
        return new C5520(c5519, C5523.m9889(AbstractC5976.m10701(strM12651, '/')));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String mo9807() {
        return AbstractC0900.m708(new StringBuilder("Class '"), m9811().m9886().f14041.f14038, '\'');
    }
}
