package p347;

import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import p007.InterfaceC6155;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8840 implements InterfaceC6155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f24945;

    public C8840(List list) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        list.getClass();
        this.f24945 = list;
    }

    @Override // p007.InterfaceC6155
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo11556(String str) throws UnknownHostException {
        List listMo11556;
        AbstractC8405.m13972(2867);
        str.getClass();
        Iterator it = this.f24945.iterator();
        Exception e = null;
        while (it.hasNext()) {
            try {
                listMo11556 = ((InterfaceC6155) it.next()).mo11556(str);
            } catch (Exception e2) {
                e = e2;
            }
            if (!listMo11556.isEmpty()) {
                return listMo11556;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2868));
        sb.append(str);
        sb.append(AbstractC8405.m13972(2869));
        sb.append(e != null ? e.getMessage() : null);
        throw new UnknownHostException(sb.toString());
    }
}
