package p408;

import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.query.matchers.C6544;
import org.luckypray.dexkit.query.matchers.C6546;
import org.luckypray.dexkit.query.matchers.C6547;
import org.luckypray.dexkit.util.AbstractC6561;
import p378.C9755;
import p378.C9758;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9928 extends AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f25852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f25850 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public MatchType f25855 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25854 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25857 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f25858 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f25856 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("ff");
        Class cls = this.f25853;
        if (cls != null) {
            sb.append(cls.getName());
        }
        String str = this.f25852;
        if (str != null) {
            sb.append(str);
        }
        Class cls2 = this.f25851;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        int i = this.f25850;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList = this.f25854;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25857;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25858;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25856;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C6546 m15252() {
        C6546 c6546 = new C6546();
        Class cls = this.f25853;
        if (cls != null) {
            C6539 c6539 = new C6539();
            c6539.m11680(AbstractC6561.m11691(cls), StringMatchType.Equals, false);
            c6546.f16018 = c6539;
        }
        String str = this.f25852;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            c6546.f16020 = new C9755(str, stringMatchType, false);
        }
        Class cls2 = this.f25851;
        if (cls2 != null) {
            C6539 c65392 = new C6539();
            c65392.m11680(AbstractC6561.m11691(cls2), StringMatchType.Equals, false);
            c6546.f16017 = c65392;
        }
        int i = this.f25850;
        if (i != -1) {
            MatchType matchType = this.f25855;
            matchType.getClass();
            c6546.f16019 = new C9758(i, matchType);
        }
        ArrayList arrayList = this.f25858;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6544 c6544M15250 = ((C9927) it.next()).m15250();
                C6547 c6547 = c6546.f16016;
                if (c6547 == null) {
                    c6547 = new C6547();
                }
                c6546.f16016 = c6547;
                c6547.m11682(c6544M15250);
            }
        }
        ArrayList arrayList2 = this.f25856;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C6544 c6544M152502 = ((C9927) it2.next()).m15250();
                C6547 c65472 = c6546.f16021;
                if (c65472 == null) {
                    c65472 = new C6547();
                }
                c6546.f16021 = c65472;
                c65472.m11682(c6544M152502);
            }
        }
        return c6546;
    }
}
