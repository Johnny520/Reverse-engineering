package p408;

import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.query.matchers.C6544;
import org.luckypray.dexkit.query.matchers.C6546;
import org.luckypray.dexkit.query.matchers.C6547;
import org.luckypray.dexkit.result.C6554;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.util.AbstractC6560;
import org.luckypray.dexkit.wrap.C6566;
import p378.C9755;
import p378.C9758;
import p382.C9780;
import p405.AbstractC9919;
import p405.C9920;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9931 extends AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f25867 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25866 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f25865 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25864 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25869 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25868 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f25872 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MatchType f25870 = MatchType.Contains;

    public final String toString() {
        StringBuilder sb = new StringBuilder("cf");
        String str = this.f25871;
        if (str != null) {
            sb.append(str);
        }
        ArrayList arrayList = this.f25868;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25867;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        int i = this.f25872;
        if (i != -1) {
            sb.append(Modifier.toString(i));
        }
        ArrayList arrayList3 = this.f25866;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25865;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25864;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        ArrayList arrayList6 = this.f25869;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m15254(String... strArr) {
        this.f25868.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Class m15255() {
        ArrayList arrayListM15256 = m15256();
        if (!arrayListM15256.isEmpty()) {
            return (Class) arrayListM15256.get(0);
        }
        throw new ClassNotFoundException("Class not found: " + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ArrayList m15256() {
        try {
            ArrayList arrayListM10444 = AbstractC5754.m10444(toString());
            if (arrayListM10444 != null) {
                return arrayListM10444;
            }
            ArrayList arrayList = new ArrayList();
            ClassDataList classDataListM11656 = C9929.m15253().m11656(m15257());
            if (classDataListM11656.isEmpty()) {
                AbstractC5754.m10430(toString(), arrayList);
                return arrayList;
            }
            for (C6554 c6554 : classDataListM11656) {
                C9920 c9920 = AbstractC9919.f25822;
                c6554.getClass();
                c9920.getClass();
                C6566 c6566M11683 = c6554.m11683();
                c6566M11683.getClass();
                C1171 c1171 = AbstractC6560.f16059;
                arrayList.add(AbstractC6560.m11687(c9920, c6566M11683.f16072));
            }
            AbstractC5754.m10430(toString(), arrayList);
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C9780 m15257() {
        C9780 c9780 = new C9780();
        ArrayList arrayList = this.f25866;
        int i = 0;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c9780.f25500 = AbstractC5179.m9405(strArr);
        }
        ArrayList arrayList2 = this.f25865;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c9780.f25499 = AbstractC5179.m9405(strArr2);
        }
        C6539 c6539 = new C6539();
        String str = this.f25871;
        if (str != null) {
            StringMatchType stringMatchType = StringMatchType.Equals;
            stringMatchType.getClass();
            C6539 c65392 = new C6539();
            c65392.f15996 = new C9755(str, stringMatchType, false);
            c6539.f15994 = c65392;
        }
        ArrayList<String> arrayList3 = this.f25867;
        if (!arrayList3.isEmpty()) {
            for (String str2 : arrayList3) {
                str2.getClass();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C6547 c6547 = c6539.f15993;
                if (c6547 == null) {
                    c6547 = new C6547(1);
                    c6547.f16022 = MatchType.Contains;
                }
                c6539.f15993 = c6547;
                C6539 c65393 = new C6539();
                c65393.m11680(str2, stringMatchType2, false);
                List arrayList4 = c6547.f16023;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c6547.f16023 = arrayList4;
                arrayList4.add(c65393);
            }
        }
        ArrayList arrayList5 = this.f25868;
        if (!arrayList5.isEmpty()) {
            arrayList5.getClass();
            StringMatchType stringMatchType3 = StringMatchType.Contains;
            stringMatchType3.getClass();
            ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList6.add(new C9755((String) it.next(), stringMatchType3, false));
            }
            c6539.f15997 = new ArrayList(arrayList6);
        }
        int i2 = this.f25872;
        if (i2 != -1) {
            MatchType matchType = this.f25870;
            matchType.getClass();
            c6539.f15995 = new C9758(i2, matchType);
        }
        ArrayList arrayList7 = this.f25864;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C6546 c6546M15252 = ((C9928) it2.next()).m15252();
                C6547 c65472 = c6539.f15992;
                if (c65472 == null) {
                    c65472 = new C6547(i);
                    c65472.f16022 = MatchType.Contains;
                }
                c6539.f15992 = c65472;
                List arrayList8 = c65472.f16023;
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                c65472.f16023 = arrayList8;
                arrayList8.add(c6546M15252);
            }
        }
        ArrayList arrayList9 = this.f25869;
        if (!arrayList9.isEmpty()) {
            Iterator it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                C6544 c6544M15250 = ((C9927) it3.next()).m15250();
                C6547 c65473 = c6539.f15998;
                if (c65473 == null) {
                    c65473 = new C6547();
                }
                c6539.f15998 = c65473;
                c65473.m11682(c6544M15250);
            }
        }
        c9780.f25497 = c6539;
        return c9780;
    }
}
