package p091;

import androidx.compose.foundation.C1030;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p087.AbstractC7143;
import p087.InterfaceC7119;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7189 implements InterfaceC7190, InterfaceC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String[] f19177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet f19178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f19179;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4921 f19181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19182;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List[] f19183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7190[] f19184;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC7190[] f19185;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC5183 f19186;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean[] f19187;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f19188;

    public C7189(String str, AbstractC4921 abstractC4921, int i, List list, C7194 c7194) {
        list.getClass();
        this.f19182 = str;
        this.f19181 = abstractC4921;
        this.f19180 = i;
        this.f19179 = c7194.f19207;
        ArrayList arrayList = c7194.f19206;
        arrayList.getClass();
        HashSet hashSet = new HashSet(AbstractC4338.m8779(AbstractC4344.m8832(arrayList, 12)));
        AbstractC4343.m8806(arrayList, hashSet);
        this.f19178 = hashSet;
        int i2 = 0;
        this.f19177 = (String[]) arrayList.toArray(new String[0]);
        this.f19184 = AbstractC7143.m12387(c7194.f19204);
        this.f19183 = (List[]) c7194.f19203.toArray(new List[0]);
        ArrayList arrayList2 = c7194.f19209;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.f19187 = zArr;
        String[] strArr = this.f19177;
        strArr.getClass();
        C4341 c4341 = new C4341(new C1030(strArr, 19), 1);
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(c4341, 10));
        Iterator it2 = c4341.iterator();
        while (true) {
            C4337 c4337 = (C4337) it2;
            if (!c4337.f12915.hasNext()) {
                this.f19188 = AbstractC4338.m8783(arrayList3);
                this.f19185 = AbstractC7143.m12387(list);
                this.f19186 = AbstractC5186.m10210(new C1030(this, 29));
                return;
            }
            C4340 c4340 = (C4340) c4337.next();
            arrayList3.add(new Pair(c4340.f12919, Integer.valueOf(c4340.f12920)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7189) {
            InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
            if (this.f19182.equals(interfaceC7190.mo12355()) && Arrays.equals(this.f19185, ((C7189) obj).f19185)) {
                int iMo12353 = interfaceC7190.mo12353();
                int i = this.f19180;
                if (i == iMo12353) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC7190[] interfaceC7190Arr = this.f19184;
                        if (AbstractC4394.m8917(interfaceC7190Arr[i2].mo12355(), interfaceC7190.mo12356(i2).mo12355()) && AbstractC4394.m8917(interfaceC7190Arr[i2].getKind(), interfaceC7190.mo12356(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p091.InterfaceC7190
    public final List getAnnotations() {
        return this.f19179;
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return this.f19181;
    }

    public final int hashCode() {
        return ((Number) this.f19186.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC7143.m12392(this);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return this.f19177[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return this.f19180;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        Integer num = (Integer) this.f19188.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p087.InterfaceC7119
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12378() {
        return this.f19178;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f19182;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        return this.f19184[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        return this.f19183[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        return this.f19187[i];
    }
}
