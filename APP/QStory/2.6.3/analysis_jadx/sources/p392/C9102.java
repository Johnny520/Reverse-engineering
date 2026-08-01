package p392;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.query.matchers.C5714;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.query.matchers.C5717;
import org.luckypray.dexkit.result.C5724;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.util.AbstractC5730;
import org.luckypray.dexkit.wrap.C5736;
import p362.C8926;
import p362.C8929;
import p366.C8951;
import p389.AbstractC9090;
import p389.C9091;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9102 extends AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f25522 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25521 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f25520 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25519 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25524 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25523 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f25527 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MatchType f25525 = MatchType.Contains;

    public final String toString() {
        StringBuilder sb = new StringBuilder("cf");
        String str = this.f25526;
        if (str != null) {
            sb.append(str);
        }
        ArrayList arrayList = this.f25523;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25522;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        int i = this.f25527;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList3 = this.f25521;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25520;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25519;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        ArrayList arrayList6 = this.f25524;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14695(String... strArr) {
        this.f25523.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Class m14696() {
        ArrayList arrayListM14697 = m14697();
        if (!arrayListM14697.isEmpty()) {
            return (Class) arrayListM14697.get(0);
        }
        throw new ClassNotFoundException("Class not found: " + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ArrayList m14697() {
        try {
            ArrayList arrayListM9885 = AbstractC4922.m9885(toString());
            if (arrayListM9885 != null) {
                return arrayListM9885;
            }
            ArrayList arrayList = new ArrayList();
            ClassDataList classDataListM11097 = C9100.m14694().m11097(m14698());
            if (classDataListM11097.isEmpty()) {
                AbstractC4922.m9871(toString(), arrayList);
                return arrayList;
            }
            for (C5724 c5724 : classDataListM11097) {
                C9091 c9091 = AbstractC9090.f25477;
                c5724.getClass();
                c9091.getClass();
                C5736 c5736M11124 = c5724.m11124();
                c5736M11124.getClass();
                C0325 c0325 = AbstractC5730.f15714;
                arrayList.add(AbstractC5730.m11128(c9091, c5736M11124.f15727));
            }
            AbstractC4922.m9871(toString(), arrayList);
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C8951 m14698() {
        C8951 c8951 = new C8951();
        ArrayList arrayList = this.f25521;
        int i = 0;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c8951.f25155 = AbstractC4347.m8846(strArr);
        }
        ArrayList arrayList2 = this.f25520;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c8951.f25154 = AbstractC4347.m8846(strArr2);
        }
        C5709 c5709 = new C5709();
        String str = this.f25526;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            C5709 c57092 = new C5709();
            c57092.f15651 = new C8926(str, stringMatchType, false);
            c5709.f15649 = c57092;
        }
        ArrayList<String> arrayList3 = this.f25522;
        if (!arrayList3.isEmpty()) {
            for (String str2 : arrayList3) {
                str2.getClass();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C5717 c5717 = c5709.f15648;
                if (c5717 == null) {
                    c5717 = new C5717(1);
                    c5717.f15677 = MatchType.Contains;
                }
                c5709.f15648 = c5717;
                C5709 c57093 = new C5709();
                c57093.m11121(str2, stringMatchType2, false);
                List arrayList4 = c5717.f15678;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c5717.f15678 = arrayList4;
                arrayList4.add(c57093);
            }
        }
        ArrayList arrayList5 = this.f25523;
        if (!arrayList5.isEmpty()) {
            arrayList5.getClass();
            StringMatchType stringMatchType3 = StringMatchType.Contains;
            stringMatchType3.getClass();
            ArrayList arrayList6 = new ArrayList(AbstractC4345.m8822(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList6.add(new C8926((String) it.next(), stringMatchType3, false));
            }
            c5709.f15652 = new ArrayList(arrayList6);
        }
        int i2 = this.f25527;
        if (i2 != -1) {
            MatchType matchType = this.f25525;
            matchType.getClass();
            c5709.f15650 = new C8929(i2, matchType);
        }
        ArrayList arrayList7 = this.f25519;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C5716 c5716M14693 = ((C9099) it2.next()).m14693();
                C5717 c57172 = c5709.f15647;
                if (c57172 == null) {
                    c57172 = new C5717(i);
                    c57172.f15677 = MatchType.Contains;
                }
                c5709.f15647 = c57172;
                List arrayList8 = c57172.f15678;
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                c57172.f15678 = arrayList8;
                arrayList8.add(c5716M14693);
            }
        }
        ArrayList arrayList9 = this.f25524;
        if (!arrayList9.isEmpty()) {
            Iterator it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                C5714 c5714M14691 = ((C9098) it3.next()).m14691();
                C5717 c57173 = c5709.f15653;
                if (c57173 == null) {
                    c57173 = new C5717();
                }
                c5709.f15653 = c57173;
                c57173.m11123(c5714M14691);
            }
        }
        c8951.f25152 = c5709;
        return c8951;
    }
}
