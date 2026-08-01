package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3898;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5428;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7372;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5614 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14271;

    public /* synthetic */ C5614(Object obj, int i) {
        this.f14271 = i;
        this.f14270 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14271;
        Object obj = this.f14270;
        switch (i) {
            case 0:
                return (ArrayList) obj;
            case 1:
                HashSet hashSet = new HashSet();
                C5633 c5633 = (C5633) ((C1171) obj).f1438;
                C5428 c5428 = c5633.f14337;
                C5656 c5656 = c5633.f14339;
                ProtoBuf$Class protoBuf$Class = c5633.f14348;
                Iterator it = c5428.mo10053().iterator();
                while (it.hasNext()) {
                    for (InterfaceC5331 interfaceC5331 : AbstractC3898.m7420(((AbstractC5714) it.next()).mo10283(), null, 3)) {
                        if ((interfaceC5331 instanceof InterfaceC5303) || (interfaceC5331 instanceof InterfaceC5305)) {
                            hashSet.add(((InterfaceC5312) interfaceC5331).getName());
                        }
                    }
                }
                List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
                functionList.getClass();
                Iterator<T> it2 = functionList.iterator();
                while (it2.hasNext()) {
                    hashSet.add(AbstractC4765.m8875(c5656.f14406, ((ProtoBuf$Function) it2.next()).getName()));
                }
                List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
                propertyList.getClass();
                Iterator<T> it3 = propertyList.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC4765.m8875(c5656.f14406, ((ProtoBuf$Property) it3.next()).getName()));
                }
                return AbstractC8568.m13613(hashSet, hashSet);
            case 2:
                return AbstractC5176.m9347((Iterable) ((InterfaceC7372) obj).invoke());
            case 3:
                AbstractC5627 abstractC5627 = (AbstractC5627) obj;
                Set setMo10083 = abstractC5627.mo10083();
                if (setMo10083 == null) {
                    return null;
                }
                return AbstractC8568.m13613(AbstractC8568.m13613(abstractC5627.m10084(), abstractC5627.f14321.f14299.keySet()), setMo10083);
            default:
                C5619 c5619 = (C5619) obj;
                C5656 c56562 = c5619.f14283;
                return AbstractC5176.m9356(c56562.f14407.f14433.mo2987(c5619.f14282, c56562.f14406));
        }
    }
}
