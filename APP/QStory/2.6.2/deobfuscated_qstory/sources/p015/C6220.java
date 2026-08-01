package p015;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import p005.C6101;
import p005.InterfaceC6120;
import p017.AbstractC6238;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6220 extends AbstractC6206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6217 f17106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17108;

    static {
        Regex regex = C6217.f17098;
        f17106 = AbstractC8189.m13679("application/x-www-form-urlencoded");
    }

    public C6220(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f17108 = AbstractC6238.m11711(arrayList);
        this.f17107 = AbstractC6238.m11711(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m11659(InterfaceC6120 interfaceC6120, boolean z) throws EOFException {
        C6101 c6101Mo11482;
        if (z) {
            c6101Mo11482 = new C6101();
        } else {
            interfaceC6120.getClass();
            c6101Mo11482 = interfaceC6120.mo11482();
        }
        List list = this.f17108;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c6101Mo11482.m11474(38);
            }
            c6101Mo11482.m11498((String) list.get(i));
            c6101Mo11482.m11474(61);
            c6101Mo11482.m11498((String) this.f17107.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c6101Mo11482.f16657;
        c6101Mo11482.m11481();
        return j;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11095(InterfaceC6120 interfaceC6120) throws EOFException {
        m11659(interfaceC6120, false);
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6217 mo11096() {
        return f17106;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11097() {
        return m11659(null, true);
    }
}
