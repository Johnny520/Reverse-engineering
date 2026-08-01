package p015;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.metadata.C4669;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f17176;

    public C6230(ProtoBuf$TypeTable protoBuf$TypeTable) {
        List<ProtoBuf$Type> typeList = protoBuf$TypeTable.getTypeList();
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            List<ProtoBuf$Type> typeList2 = protoBuf$TypeTable.getTypeList();
            typeList2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(typeList2, 10));
            int i = 0;
            for (Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8189.m13662();
                    throw null;
                }
                ProtoBuf$Type protoBuf$TypeM9298 = (ProtoBuf$Type) obj;
                if (i >= firstNullable) {
                    C4669 builder = protoBuf$TypeM9298.toBuilder();
                    builder.f13651 |= 2;
                    builder.f13654 = true;
                    protoBuf$TypeM9298 = builder.m9298();
                    if (!protoBuf$TypeM9298.isInitialized()) {
                        throw new UninitializedMessageException(protoBuf$TypeM9298);
                    }
                }
                arrayList.add(protoBuf$TypeM9298);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.f17176 = typeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type m11685(int i) {
        return (ProtoBuf$Type) this.f17176.get(i);
    }

    public C6230(List list) {
        list.getClass();
        this.f17176 = list;
    }
}
