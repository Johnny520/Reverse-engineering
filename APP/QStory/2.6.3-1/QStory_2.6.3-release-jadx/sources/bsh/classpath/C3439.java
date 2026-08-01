package bsh.classpath;

import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3439 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8143;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8144;

    public /* synthetic */ C3439(Object obj, int i) {
        this.f8144 = i;
        this.f8143 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8144;
        Object obj2 = this.f8143;
        switch (i) {
            case 0:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            case 1:
                ((C3443) obj).f8157.keySet().forEach(new C3439((BshClassPath$UnqualifiedNameTable) obj2, 0));
                break;
            case 2:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                C3443 c3443 = (C3443) obj;
                c3443.getClass();
                ArrayList<URL> arrayList2 = new ArrayList();
                c3443.f8159.forEach(new C3439(arrayList2, 3));
                arrayList2.addAll(c3443.f8160);
                for (URL url : arrayList2) {
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
                break;
        }
    }
}
