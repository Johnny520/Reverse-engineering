package p363;

import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import p023.InterfaceC6984;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9669 implements InterfaceC6984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f25290;

    public C9669(List list) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        list.getClass();
        this.f25290 = list;
    }

    @Override // p023.InterfaceC6984
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo12115(String str) throws UnknownHostException {
        List listMo12115;
        AbstractC9234.m14531(2867);
        str.getClass();
        Iterator it = this.f25290.iterator();
        Exception e = null;
        while (it.hasNext()) {
            try {
                listMo12115 = ((InterfaceC6984) it.next()).mo12115(str);
            } catch (Exception e2) {
                e = e2;
            }
            if (!listMo12115.isEmpty()) {
                return listMo12115;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2868));
        sb.append(str);
        sb.append(AbstractC9234.m14531(2869));
        sb.append(e != null ? e.getMessage() : null);
        throw new UnknownHostException(sb.toString());
    }
}
