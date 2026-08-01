package p023;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.metadata.C5502;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6986 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f17282;

    public C6986(ProtoBuf$TypeTable protoBuf$TypeTable) {
        List<ProtoBuf$Type> typeList = protoBuf$TypeTable.getTypeList();
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            List<ProtoBuf$Type> typeList2 = protoBuf$TypeTable.getTypeList();
            typeList2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(typeList2, 10));
            int i = 0;
            for (Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7176.m12479();
                    throw null;
                }
                ProtoBuf$Type protoBuf$TypeM9847 = (ProtoBuf$Type) obj;
                if (i >= firstNullable) {
                    C5502 builder = protoBuf$TypeM9847.toBuilder();
                    builder.f14000 |= 2;
                    builder.f14003 = true;
                    protoBuf$TypeM9847 = builder.m9847();
                    if (!protoBuf$TypeM9847.isInitialized()) {
                        throw new UninitializedMessageException(protoBuf$TypeM9847);
                    }
                }
                arrayList.add(protoBuf$TypeM9847);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.f17282 = typeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type m12116(int i) {
        return (ProtoBuf$Type) this.f17282.get(i);
    }

    public C6986(List list) {
        list.getClass();
        this.f17282 = list;
    }
}
