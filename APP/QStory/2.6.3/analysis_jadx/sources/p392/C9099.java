package p392;

import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.query.matchers.C5714;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.query.matchers.C5717;
import org.luckypray.dexkit.util.AbstractC5731;
import p362.C8926;
import p362.C8929;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9099 extends AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f25507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f25505 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public MatchType f25510 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25509 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25512 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f25513 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f25511 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("ff");
        Class cls = this.f25508;
        if (cls != null) {
            sb.append(cls.getName());
        }
        String str = this.f25507;
        if (str != null) {
            sb.append(str);
        }
        Class cls2 = this.f25506;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        int i = this.f25505;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList = this.f25509;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25512;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25513;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25511;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C5716 m14693() {
        C5716 c5716 = new C5716();
        Class cls = this.f25508;
        if (cls != null) {
            C5709 c5709 = new C5709();
            c5709.m11121(AbstractC5731.m11132(cls), StringMatchType.Equals, false);
            c5716.f15673 = c5709;
        }
        String str = this.f25507;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            c5716.f15675 = new C8926(str, stringMatchType, false);
        }
        Class cls2 = this.f25506;
        if (cls2 != null) {
            C5709 c57092 = new C5709();
            c57092.m11121(AbstractC5731.m11132(cls2), StringMatchType.Equals, false);
            c5716.f15672 = c57092;
        }
        int i = this.f25505;
        if (i != -1) {
            MatchType matchType = this.f25510;
            matchType.getClass();
            c5716.f15674 = new C8929(i, matchType);
        }
        ArrayList arrayList = this.f25513;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5714 c5714M14691 = ((C9098) it.next()).m14691();
                C5717 c5717 = c5716.f15671;
                if (c5717 == null) {
                    c5717 = new C5717();
                }
                c5716.f15671 = c5717;
                c5717.m11123(c5714M14691);
            }
        }
        ArrayList arrayList2 = this.f25511;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C5714 c5714M146912 = ((C9098) it2.next()).m14691();
                C5717 c57172 = c5716.f15676;
                if (c57172 == null) {
                    c57172 = new C5717();
                }
                c5716.f15676 = c57172;
                c57172.m11123(c5714M146912);
            }
        }
        return c5716;
    }
}
