package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1109;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f14134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f14135;

    public C5552(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C5563 c5563 = extendableMessage.extensions;
        c5563.getClass();
        Iterator it = ((C1109) c5563.f14158.entrySet()).iterator();
        this.f14135 = it;
        if (it.hasNext()) {
            this.f14134 = (Map.Entry) it.next();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9969(int i, C5540 c5540) {
        while (true) {
            Map.Entry entry = this.f14134;
            if (entry == null || ((C5556) entry.getKey()).f14140 >= i) {
                return;
            }
            C5556 c5556 = (C5556) this.f14134.getKey();
            Object value = this.f14134.getValue();
            C5563 c5563 = C5563.f14156;
            WireFormat$FieldType wireFormat$FieldType = c5556.f14141;
            int i2 = c5556.f14140;
            if (c5556.f14139) {
                List list = (List) value;
                if (c5556.f14138) {
                    c5540.m9928(i2, 2);
                    Iterator it = list.iterator();
                    int iM9976 = 0;
                    while (it.hasNext()) {
                        iM9976 += C5563.m9976(wireFormat$FieldType, it.next());
                    }
                    c5540.m9925(iM9976);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C5563.m9978(c5540, wireFormat$FieldType, it2.next());
                    }
                } else {
                    for (Object obj : list) {
                        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                            c5540.m9928(i2, 3);
                            ((InterfaceC5533) obj).writeTo(c5540);
                            c5540.m9928(i2, 4);
                        } else {
                            c5540.m9928(i2, wireFormat$FieldType.getWireType());
                            C5563.m9978(c5540, wireFormat$FieldType, obj);
                        }
                    }
                }
            } else if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                c5540.m9928(i2, 3);
                ((InterfaceC5533) value).writeTo(c5540);
                c5540.m9928(i2, 4);
            } else {
                c5540.m9928(i2, wireFormat$FieldType.getWireType());
                C5563.m9978(c5540, wireFormat$FieldType, value);
            }
            Iterator it3 = this.f14135;
            if (it3.hasNext()) {
                this.f14134 = (Map.Entry) it3.next();
            } else {
                this.f14134 = null;
            }
        }
    }
}
