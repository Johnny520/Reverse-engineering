package p091;

import androidx.compose.foundation.C1030;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.InterfaceC7120;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7190 implements InterfaceC7191, InterfaceC7120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String[] f19172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet f19173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f19174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8190 f19176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19177;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List[] f19178;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7191[] f19179;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC7191[] f19180;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC5184 f19181;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean[] f19182;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f19183;

    public C7190(String str, AbstractC8190 abstractC8190, int i, List list, C7195 c7195) {
        list.getClass();
        this.f19177 = str;
        this.f19176 = abstractC8190;
        this.f19175 = i;
        this.f19174 = c7195.f19202;
        ArrayList arrayList = c7195.f19201;
        arrayList.getClass();
        HashSet hashSet = new HashSet(AbstractC4339.m8772(AbstractC4345.m8822(arrayList, 12)));
        AbstractC4344.m8795(arrayList, hashSet);
        this.f19173 = hashSet;
        int i2 = 0;
        this.f19172 = (String[]) arrayList.toArray(new String[0]);
        this.f19179 = AbstractC7144.m12414(c7195.f19199);
        this.f19178 = (List[]) c7195.f19198.toArray(new List[0]);
        ArrayList arrayList2 = c7195.f19204;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.f19182 = zArr;
        String[] strArr = this.f19172;
        strArr.getClass();
        C4342 c4342 = new C4342(new C1030(strArr, 19), 1);
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(c4342, 10));
        Iterator it2 = c4342.iterator();
        while (true) {
            C4338 c4338 = (C4338) it2;
            if (!c4338.f12919.hasNext()) {
                this.f19183 = AbstractC4339.m8771(arrayList3);
                this.f19180 = AbstractC7144.m12414(list);
                this.f19181 = AbstractC5187.m10214(new C1030(this, 29));
                return;
            }
            C4341 c4341 = (C4341) c4338.next();
            arrayList3.add(new Pair(c4341.f12923, Integer.valueOf(c4341.f12924)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7190) {
            InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
            if (this.f19177.equals(interfaceC7191.mo12382()) && Arrays.equals(this.f19180, ((C7190) obj).f19180)) {
                int iMo12380 = interfaceC7191.mo12380();
                int i = this.f19175;
                if (i == iMo12380) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC7191[] interfaceC7191Arr = this.f19179;
                        if (AbstractC4395.m8907(interfaceC7191Arr[i2].mo12382(), interfaceC7191.mo12383(i2).mo12382()) && AbstractC4395.m8907(interfaceC7191Arr[i2].getKind(), interfaceC7191.mo12383(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p091.InterfaceC7191
    public final List getAnnotations() {
        return this.f19174;
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return this.f19176;
    }

    public final int hashCode() {
        return ((Number) this.f19181.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC7144.m12419(this);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return this.f19172[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return this.f19175;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        Integer num = (Integer) this.f19183.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p087.InterfaceC7120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12405() {
        return this.f19173;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f19177;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        return this.f19179[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        return this.f19178[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        return this.f19182[i];
    }
}
