package bsh.classpath;

import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2606 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7798;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7799;

    public /* synthetic */ C2606(Object obj, int i) {
        this.f7799 = i;
        this.f7798 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f7799;
        Object obj2 = this.f7798;
        switch (i) {
            case 0:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            case 1:
                ((C2610) obj).f7812.keySet().forEach(new C2606((BshClassPath$UnqualifiedNameTable) obj2, 0));
                break;
            case 2:
                ((BshClassPath$UnqualifiedNameTable) obj2).add((String) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                C2610 c2610 = (C2610) obj;
                c2610.getClass();
                ArrayList<URL> arrayList2 = new ArrayList();
                c2610.f7814.forEach(new C2606(arrayList2, 3));
                arrayList2.addAll(c2610.f7815);
                for (URL url : arrayList2) {
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
                break;
        }
    }
}
