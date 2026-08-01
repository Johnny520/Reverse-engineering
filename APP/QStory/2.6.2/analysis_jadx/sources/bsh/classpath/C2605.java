package bsh.classpath;

import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2605 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7797;

    public /* synthetic */ C2605(Object obj, int i) {
        this.f7797 = i;
        this.f7796 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f7797;
        Object obj2 = this.f7796;
        switch (i) {
            case 0:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            case 1:
                ((C2609) obj).f7810.keySet().forEach(new C2605((BshClassPath$UnqualifiedNameTable) obj2, 0));
                break;
            case 2:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                C2609 c2609 = (C2609) obj;
                c2609.getClass();
                ArrayList<URL> arrayList2 = new ArrayList();
                c2609.f7812.forEach(new C2605(arrayList2, 3));
                arrayList2.addAll(c2609.f7813);
                for (URL url : arrayList2) {
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
                break;
        }
    }
}
