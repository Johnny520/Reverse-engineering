package p394;

import androidx.compose.animation.core.C0325;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.query.matchers.C5713;
import org.luckypray.dexkit.query.matchers.C5715;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.result.C5723;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.util.AbstractC5729;
import org.luckypray.dexkit.wrap.C5735;
import p053.AbstractC6560;
import p366.C8945;
import p366.C8948;
import p368.C8958;
import p392.AbstractC9121;
import p392.C9122;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9131 extends AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f25545 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25544 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f25543 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25542 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25547 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25546 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f25550 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MatchType f25548 = MatchType.Contains;

    public final String toString() {
        StringBuilder sb = new StringBuilder("cf");
        String str = this.f25549;
        if (str != null) {
            sb.append(str);
        }
        ArrayList arrayList = this.f25546;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25545;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        int i = this.f25550;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList3 = this.f25544;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25543;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25542;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        ArrayList arrayList6 = this.f25547;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C8958 m14698() {
        C8958 c8958 = new C8958();
        ArrayList arrayList = this.f25544;
        int i = 0;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c8958.f25189 = AbstractC4346.m8850(strArr);
        }
        ArrayList arrayList2 = this.f25543;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c8958.f25188 = AbstractC4346.m8850(strArr2);
        }
        C5708 c5708 = new C5708();
        String str = this.f25549;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            C5708 c57082 = new C5708();
            c57082.f15652 = new C8945(str, stringMatchType, false);
            c5708.f15650 = c57082;
        }
        ArrayList<String> arrayList3 = this.f25545;
        if (!arrayList3.isEmpty()) {
            for (String str2 : arrayList3) {
                str2.getClass();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C5716 c5716 = c5708.f15649;
                if (c5716 == null) {
                    c5716 = new C5716(1);
                    c5716.f15677 = MatchType.Contains;
                }
                c5708.f15649 = c5716;
                C5708 c57083 = new C5708();
                c57083.m11064(str2, stringMatchType2, false);
                List arrayList4 = c5716.f15678;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c5716.f15678 = arrayList4;
                arrayList4.add(c57083);
            }
        }
        ArrayList arrayList5 = this.f25546;
        if (!arrayList5.isEmpty()) {
            arrayList5.getClass();
            StringMatchType stringMatchType3 = StringMatchType.Contains;
            stringMatchType3.getClass();
            ArrayList arrayList6 = new ArrayList(AbstractC4344.m8832(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList6.add(new C8945((String) it.next(), stringMatchType3, false));
            }
            c5708.f15653 = new ArrayList(arrayList6);
        }
        int i2 = this.f25550;
        if (i2 != -1) {
            MatchType matchType = this.f25548;
            matchType.getClass();
            c5708.f15651 = new C8948(i2, matchType);
        }
        ArrayList arrayList7 = this.f25542;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C5715 c5715M14696 = ((C9128) it2.next()).m14696();
                C5716 c57162 = c5708.f15648;
                if (c57162 == null) {
                    c57162 = new C5716(i);
                    c57162.f15677 = MatchType.Contains;
                }
                c5708.f15648 = c57162;
                List arrayList8 = c57162.f15678;
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                c57162.f15678 = arrayList8;
                arrayList8.add(c5715M14696);
            }
        }
        ArrayList arrayList9 = this.f25547;
        if (!arrayList9.isEmpty()) {
            Iterator it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                C5713 c5713M14694 = ((C9127) it3.next()).m14694();
                C5716 c57163 = c5708.f15647;
                if (c57163 == null) {
                    c57163 = new C5716();
                }
                c5708.f15647 = c57163;
                c57163.m11066(c5713M14694);
            }
        }
        c8958.f25186 = c5708;
        return c8958;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14699(String... strArr) {
        this.f25546.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final ArrayList m14700() {
        try {
            ArrayList arrayListM9896 = AbstractC4921.m9896(toString());
            if (arrayListM9896 != null) {
                return arrayListM9896;
            }
            ArrayList arrayList = new ArrayList();
            ClassDataList classDataListM11040 = C9129.m14697().m11040(m14698());
            if (classDataListM11040.isEmpty()) {
                AbstractC4921.m9881(toString(), arrayList);
                return arrayList;
            }
            for (C5723 c5723 : classDataListM11040) {
                C9122 c9122 = AbstractC9121.f25497;
                c5723.getClass();
                c9122.getClass();
                C5735 c5735M11067 = c5723.m11067();
                c5735M11067.getClass();
                C0325 c0325 = AbstractC5729.f15714;
                arrayList.add(AbstractC5729.m11071(c9122, c5735M11067.f15727));
            }
            AbstractC4921.m9881(toString(), arrayList);
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Class m14701() throws ClassNotFoundException {
        ArrayList arrayListM14700 = m14700();
        if (!arrayListM14700.isEmpty()) {
            return (Class) arrayListM14700.get(0);
        }
        throw new ClassNotFoundException("Class not found: " + this);
    }
}
