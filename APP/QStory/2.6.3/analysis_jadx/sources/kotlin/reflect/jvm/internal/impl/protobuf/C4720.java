package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0262;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f13789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f13790;

    public C4720(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C4731 c4731 = extendableMessage.extensions;
        c4731.getClass();
        Iterator it = ((C0262) c4731.f13813.entrySet()).iterator();
        this.f13790 = it;
        if (it.hasNext()) {
            this.f13789 = (Map.Entry) it.next();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9410(int i, C4708 c4708) {
        while (true) {
            Map.Entry entry = this.f13789;
            if (entry == null || ((C4724) entry.getKey()).f13795 >= i) {
                return;
            }
            C4724 c4724 = (C4724) this.f13789.getKey();
            Object value = this.f13789.getValue();
            C4731 c4731 = C4731.f13811;
            WireFormat$FieldType wireFormat$FieldType = c4724.f13796;
            int i2 = c4724.f13795;
            if (c4724.f13794) {
                List list = (List) value;
                if (c4724.f13793) {
                    c4708.m9369(i2, 2);
                    Iterator it = list.iterator();
                    int iM9417 = 0;
                    while (it.hasNext()) {
                        iM9417 += C4731.m9417(wireFormat$FieldType, it.next());
                    }
                    c4708.m9366(iM9417);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C4731.m9419(c4708, wireFormat$FieldType, it2.next());
                    }
                } else {
                    for (Object obj : list) {
                        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                            c4708.m9369(i2, 3);
                            ((InterfaceC4701) obj).writeTo(c4708);
                            c4708.m9369(i2, 4);
                        } else {
                            c4708.m9369(i2, wireFormat$FieldType.getWireType());
                            C4731.m9419(c4708, wireFormat$FieldType, obj);
                        }
                    }
                }
            } else if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                c4708.m9369(i2, 3);
                ((InterfaceC4701) value).writeTo(c4708);
                c4708.m9369(i2, 4);
            } else {
                c4708.m9369(i2, wireFormat$FieldType.getWireType());
                C4731.m9419(c4708, wireFormat$FieldType, value);
            }
            Iterator it3 = this.f13790;
            if (it3.hasNext()) {
                this.f13789 = (Map.Entry) it3.next();
            } else {
                this.f13789 = null;
            }
        }
    }
}
