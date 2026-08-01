package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0262;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4719 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f13785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f13786;

    public C4719(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C4730 c4730 = extendableMessage.extensions;
        c4730.getClass();
        Iterator it = ((C0262) c4730.f13809.entrySet()).iterator();
        this.f13786 = it;
        if (it.hasNext()) {
            this.f13785 = (Map.Entry) it.next();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9420(int i, C4707 c4707) {
        while (true) {
            Map.Entry entry = this.f13785;
            if (entry == null || ((C4723) entry.getKey()).f13791 >= i) {
                return;
            }
            C4723 c4723 = (C4723) this.f13785.getKey();
            Object value = this.f13785.getValue();
            C4730 c4730 = C4730.f13807;
            WireFormat$FieldType wireFormat$FieldType = c4723.f13792;
            int i2 = c4723.f13791;
            if (c4723.f13790) {
                List list = (List) value;
                if (c4723.f13789) {
                    c4707.m9379(i2, 2);
                    Iterator it = list.iterator();
                    int iM9427 = 0;
                    while (it.hasNext()) {
                        iM9427 += C4730.m9427(wireFormat$FieldType, it.next());
                    }
                    c4707.m9376(iM9427);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C4730.m9429(c4707, wireFormat$FieldType, it2.next());
                    }
                } else {
                    for (Object obj : list) {
                        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                            c4707.m9379(i2, 3);
                            ((InterfaceC4700) obj).writeTo(c4707);
                            c4707.m9379(i2, 4);
                        } else {
                            c4707.m9379(i2, wireFormat$FieldType.getWireType());
                            C4730.m9429(c4707, wireFormat$FieldType, obj);
                        }
                    }
                }
            } else if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                c4707.m9379(i2, 3);
                ((InterfaceC4700) value).writeTo(c4707);
                c4707.m9379(i2, 4);
            } else {
                c4707.m9379(i2, wireFormat$FieldType.getWireType());
                C4730.m9429(c4707, wireFormat$FieldType, value);
            }
            Iterator it3 = this.f13786;
            if (it3.hasNext()) {
                this.f13785 = (Map.Entry) it3.next();
            } else {
                this.f13785 = null;
            }
        }
    }
}
