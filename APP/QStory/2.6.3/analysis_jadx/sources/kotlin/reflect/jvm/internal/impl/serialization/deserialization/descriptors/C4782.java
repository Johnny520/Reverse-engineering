package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3066;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4596;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6543;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4782 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f13925;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13926;

    public /* synthetic */ C4782(Object obj, int i) {
        this.f13926 = i;
        this.f13925 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13926;
        Object obj = this.f13925;
        switch (i) {
            case 0:
                return (ArrayList) obj;
            case 1:
                HashSet hashSet = new HashSet();
                C4801 c4801 = (C4801) ((C0325) obj).f1093;
                C4596 c4596 = c4801.f13992;
                C4824 c4824 = c4801.f13994;
                ProtoBuf$Class protoBuf$Class = c4801.f14003;
                Iterator it = c4596.mo9494().iterator();
                while (it.hasNext()) {
                    for (InterfaceC4499 interfaceC4499 : AbstractC3066.m6860(((AbstractC4882) it.next()).mo9724(), null, 3)) {
                        if ((interfaceC4499 instanceof InterfaceC4471) || (interfaceC4499 instanceof InterfaceC4473)) {
                            hashSet.add(((InterfaceC4480) interfaceC4499).getName());
                        }
                    }
                }
                List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
                functionList.getClass();
                Iterator<T> it2 = functionList.iterator();
                while (it2.hasNext()) {
                    hashSet.add(AbstractC3933.m8316(c4824.f14061, ((ProtoBuf$Function) it2.next()).getName()));
                }
                List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
                propertyList.getClass();
                Iterator<T> it3 = propertyList.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC3933.m8316(c4824.f14061, ((ProtoBuf$Property) it3.next()).getName()));
                }
                return AbstractC7739.m13054(hashSet, hashSet);
            case 2:
                return AbstractC4344.m8788((Iterable) ((InterfaceC6543) obj).invoke());
            case 3:
                AbstractC4795 abstractC4795 = (AbstractC4795) obj;
                Set setMo9524 = abstractC4795.mo9524();
                if (setMo9524 == null) {
                    return null;
                }
                return AbstractC7739.m13054(AbstractC7739.m13054(abstractC4795.m9525(), abstractC4795.f13976.f13954.keySet()), setMo9524);
            default:
                C4787 c4787 = (C4787) obj;
                C4824 c48242 = c4787.f13938;
                return AbstractC4344.m8797(c48242.f14062.f14088.mo2427(c4787.f13937, c48242.f14061));
        }
    }
}
