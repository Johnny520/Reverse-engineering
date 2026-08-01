package p073;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6941 f18522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6934 f18525;

    public C6941(C6934 c6934, List list, String str) {
        list.getClass();
        this.f18525 = c6934;
        this.f18524 = list;
        this.f18523 = str;
        C6941 c6941 = null;
        if (str != null) {
            C6934 c6934M12203 = c6934 != null ? c6934.m12203() : null;
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6934 c69342 = (C6934) it.next();
                arrayList.add(c69342 != null ? c69342.m12203() : null);
            }
            c6941 = new C6941(c6934M12203, arrayList, null);
        }
        this.f18522 = c6941;
    }
}
