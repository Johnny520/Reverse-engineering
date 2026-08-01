package p355;

import com.bumptech.glide.AbstractC3056;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import p007.AbstractC6136;
import p015.InterfaceC6228;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8894 implements InterfaceC6228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f25058;

    public C8894(List list) {
        "dnsList";
        list.getClass();
        this.f25058 = list;
    }

    @Override // p015.InterfaceC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo11642(String str) throws UnknownHostException {
        List listMo11642;
        "hostname";
        str.getClass();
        Iterator it = this.f25058.iterator();
        Exception e = null;
        while (it.hasNext()) {
            try {
                listMo11642 = ((InterfaceC6228) it.next()).mo11642(str);
            } catch (Exception e2) {
                e = e2;
            }
            if (!listMo11642.isEmpty()) {
                return listMo11642;
            }
        }
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937274078847829415L, sb, str);
        sb.append(". Last error: ");
        sb.append(e != null ? e.getMessage() : null);
        throw new UnknownHostException(sb.toString());
    }
}
