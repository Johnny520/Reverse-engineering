package p007;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.metadata.C4670;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f16937;

    public C6157(ProtoBuf$TypeTable protoBuf$TypeTable) {
        List<ProtoBuf$Type> typeList = protoBuf$TypeTable.getTypeList();
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            List<ProtoBuf$Type> typeList2 = protoBuf$TypeTable.getTypeList();
            typeList2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(typeList2, 10));
            int i = 0;
            for (Object obj : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC6347.m11920();
                    throw null;
                }
                ProtoBuf$Type protoBuf$TypeM9288 = (ProtoBuf$Type) obj;
                if (i >= firstNullable) {
                    C4670 builder = protoBuf$TypeM9288.toBuilder();
                    builder.f13655 |= 2;
                    builder.f13658 = true;
                    protoBuf$TypeM9288 = builder.m9288();
                    if (!protoBuf$TypeM9288.isInitialized()) {
                        throw new UninitializedMessageException(protoBuf$TypeM9288);
                    }
                }
                arrayList.add(protoBuf$TypeM9288);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.f16937 = typeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type m11557(int i) {
        return (ProtoBuf$Type) this.f16937.get(i);
    }

    public C6157(List list) {
        list.getClass();
        this.f16937 = list;
    }
}
