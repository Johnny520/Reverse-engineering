package p107;

import androidx.compose.foundation.C1868;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.InterfaceC7949;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8019 implements InterfaceC8020, InterfaceC7949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String[] f19517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashSet f19518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f19519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC9019 f19521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19522;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List[] f19523;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8020[] f19524;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC8020[] f19525;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC6016 f19526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean[] f19527;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f19528;

    public C8019(String str, AbstractC9019 abstractC9019, int i, List list, C8024 c8024) {
        list.getClass();
        this.f19522 = str;
        this.f19521 = abstractC9019;
        this.f19520 = i;
        this.f19519 = c8024.f19547;
        ArrayList arrayList = c8024.f19546;
        arrayList.getClass();
        HashSet hashSet = new HashSet(AbstractC5171.m9331(AbstractC5177.m9381(arrayList, 12)));
        AbstractC5176.m9354(arrayList, hashSet);
        this.f19518 = hashSet;
        int i2 = 0;
        this.f19517 = (String[]) arrayList.toArray(new String[0]);
        this.f19524 = AbstractC7973.m12973(c8024.f19544);
        this.f19523 = (List[]) c8024.f19543.toArray(new List[0]);
        ArrayList arrayList2 = c8024.f19549;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.f19527 = zArr;
        String[] strArr = this.f19517;
        strArr.getClass();
        C5174 c5174 = new C5174(new C1868(strArr, 19), 1);
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(c5174, 10));
        Iterator it2 = c5174.iterator();
        while (true) {
            C5170 c5170 = (C5170) it2;
            if (!c5170.f13264.hasNext()) {
                this.f19528 = AbstractC5171.m9330(arrayList3);
                this.f19525 = AbstractC7973.m12973(list);
                this.f19526 = AbstractC6019.m10773(new C1868(this, 29));
                return;
            }
            C5173 c5173 = (C5173) c5170.next();
            arrayList3.add(new Pair(c5173.f13268, Integer.valueOf(c5173.f13269)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8019) {
            InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
            if (this.f19522.equals(interfaceC8020.mo12941()) && Arrays.equals(this.f19525, ((C8019) obj).f19525)) {
                int iMo12939 = interfaceC8020.mo12939();
                int i = this.f19520;
                if (i == iMo12939) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC8020[] interfaceC8020Arr = this.f19524;
                        if (AbstractC5227.m9466(interfaceC8020Arr[i2].mo12941(), interfaceC8020.mo12942(i2).mo12941()) && AbstractC5227.m9466(interfaceC8020Arr[i2].getKind(), interfaceC8020.mo12942(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p107.InterfaceC8020
    public final List getAnnotations() {
        return this.f19519;
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return this.f19521;
    }

    public final int hashCode() {
        return ((Number) this.f19526.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC7973.m12978(this);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return this.f19517[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return this.f19520;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        Integer num = (Integer) this.f19528.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p103.InterfaceC7949
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12964() {
        return this.f19518;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19522;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        return this.f19524[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        return this.f19523[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        return this.f19527[i];
    }
}
