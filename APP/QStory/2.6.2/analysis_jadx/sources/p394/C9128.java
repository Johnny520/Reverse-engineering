package p394;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.query.matchers.C5713;
import org.luckypray.dexkit.query.matchers.C5715;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.util.AbstractC5730;
import p053.AbstractC6560;
import p366.C8945;
import p366.C8948;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9128 extends AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f25530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f25528 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public MatchType f25533 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25532 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25535 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f25536 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f25534 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("ff");
        Class cls = this.f25531;
        if (cls != null) {
            sb.append(cls.getName());
        }
        String str = this.f25530;
        if (str != null) {
            sb.append(str);
        }
        Class cls2 = this.f25529;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        int i = this.f25528;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList = this.f25532;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25535;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25536;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25534;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C5715 m14696() {
        C5715 c5715 = new C5715();
        Class cls = this.f25531;
        if (cls != null) {
            C5708 c5708 = new C5708();
            c5708.m11064(AbstractC5730.m11075(cls), StringMatchType.Equals, false);
            c5715.f15674 = c5708;
        }
        String str = this.f25530;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            c5715.f15676 = new C8945(str, stringMatchType, false);
        }
        Class cls2 = this.f25529;
        if (cls2 != null) {
            C5708 c57082 = new C5708();
            c57082.m11064(AbstractC5730.m11075(cls2), StringMatchType.Equals, false);
            c5715.f15673 = c57082;
        }
        int i = this.f25528;
        if (i != -1) {
            MatchType matchType = this.f25533;
            matchType.getClass();
            c5715.f15675 = new C8948(i, matchType);
        }
        ArrayList arrayList = this.f25536;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5713 c5713M14694 = ((C9127) it.next()).m14694();
                C5716 c5716 = c5715.f15672;
                if (c5716 == null) {
                    c5716 = new C5716();
                }
                c5715.f15672 = c5716;
                c5716.m11066(c5713M14694);
            }
        }
        ArrayList arrayList2 = this.f25534;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C5713 c5713M146942 = ((C9127) it2.next()).m14694();
                C5716 c57162 = c5715.f15671;
                if (c57162 == null) {
                    c57162 = new C5716();
                }
                c5715.f15671 = c57162;
                c57162.m11066(c5713M146942);
            }
        }
        return c5715;
    }
}
