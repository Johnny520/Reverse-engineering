package p355;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p257.C8208;
import p287.AbstractC8405;
import p322.C8703;
import p323.C8707;
import p342.C8817;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8208 f25081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8817 f25082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8897 f25083;

    public C8898(InterfaceC8897 interfaceC8897) {
        AbstractC8405.m13972(3153);
        interfaceC8897.getClass();
        this.f25083 = interfaceC8897;
        this.f25082 = new C8817();
        C8208 c8208 = new C8208();
        AbstractC8405.m13972(1270);
        this.f25081 = c8208;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14541() {
        String strM13972 = AbstractC8405.m13972(3154);
        C8208 c8208 = this.f25081;
        c8208.f22614 = strM13972;
        c8208.mo13721();
        c8208.f22616 = new C8707(this);
        c8208.mo13721();
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C8703(this, 3));
        c8208.m13731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14542(ArrayList arrayList) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        C8817 c8817 = this.f25082;
        c8817.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        LinkedHashMap linkedHashMap = (LinkedHashMap) c8817.f24820;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), Boolean.TRUE);
        }
        c8817.m4791();
    }
}
