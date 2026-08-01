package org.luckypray.dexkit.query.matchers;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C5177;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.util.AbstractC5730;
import org.luckypray.dexkit.wrap.C5733;
import p366.C8945;
import p366.C8946;
import p366.C8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5713 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ArrayList f15660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5716 f15661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5708 f15662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5708 f15663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8948 f15664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8945 f15665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f15666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f15667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C5716 f15668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C5716 f15669;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C5713 m11065(Method method) {
        C5714 c5714;
        method.getClass();
        C5713 c5713 = new C5713();
        LinkedHashMap linkedHashMap = AbstractC5730.f15716;
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(AbstractC5730.m11073(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(AbstractC5730.m11076(method));
        C5733 c5733 = new C5733(sb.toString());
        StringMatchType stringMatchType = StringMatchType.Equals;
        String str = c5733.f15721;
        str.getClass();
        stringMatchType.getClass();
        c5713.f15665 = new C8945(str, stringMatchType, false);
        String str2 = c5733.f15722;
        str2.getClass();
        stringMatchType.getClass();
        C5708 c5708 = new C5708();
        c5708.m11064(str2, stringMatchType, false);
        c5713.f15663 = c5708;
        String str3 = c5733.f15719;
        str3.getClass();
        C5708 c57082 = new C5708();
        c57082.m11064(str3, stringMatchType, false);
        c5713.f15662 = c57082;
        ArrayList<String> arrayList = c5733.f15720;
        arrayList.getClass();
        C5716 c5716 = new C5716(3);
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        c5716.f15678 = new ArrayList(emptyList);
        for (String str4 : arrayList) {
            if (str4 != null) {
                c5714 = new C5714();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C5708 c57083 = new C5708();
                c57083.m11064(str4, stringMatchType2, false);
                c5714.f15670 = c57083;
            } else {
                c5714 = null;
            }
            List arrayList2 = c5716.f15678;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            c5716.f15678 = arrayList2;
            arrayList2.add(c5714);
        }
        c5713.f15661 = c5716;
        return c5713;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int iM7314;
        int iM73142;
        int iM7319;
        int i;
        int iM73192;
        C8945 c8945 = this.f15665;
        int iMo6650 = c8945 != null ? c8945.mo6650(c3218) : 0;
        C8948 c8948 = this.f15664;
        int iMo66502 = c8948 != null ? c8948.mo6650(c3218) : 0;
        C5708 c5708 = this.f15663;
        int iMo66503 = c5708 != null ? c5708.mo6650(c3218) : 0;
        C5708 c57082 = this.f15662;
        int iMo66504 = c57082 != null ? c57082.mo6650(c3218) : 0;
        C5716 c5716 = this.f15661;
        int iMo66505 = c5716 != null ? c5716.mo6650(c3218) : 0;
        ArrayList<C8945> arrayList = this.f15660;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
            for (C8945 c89452 : arrayList) {
                c89452.getClass();
                arrayList2.add(Integer.valueOf(c89452.mo6650(c3218)));
            }
            iM7314 = c3218.m7314(AbstractC4343.m8807(arrayList2));
        } else {
            iM7314 = 0;
        }
        List<C5709> list = this.f15667;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(list, 10));
            for (C5709 c5709 : list) {
                c5709.getClass();
                arrayList3.add(Integer.valueOf(c5709.mo6650(c3218)));
            }
            iM73142 = c3218.m7314(AbstractC4343.m8807(arrayList3));
        } else {
            iM73142 = 0;
        }
        List list2 = this.f15666;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                NumberEncodeValueType numberEncodeValueType = ((C8946) it.next()).f25152;
                numberEncodeValueType.getClass();
                arrayList4.add(new C5177(numberEncodeValueType.getValue()));
            }
            int size = arrayList4.size();
            byte[] bArr = new byte[size];
            Iterator it2 = arrayList4.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                bArr[i2] = ((C5177) it2.next()).f14741;
                i2++;
            }
            c3218.m7313(1, size, 1);
            for (int i3 = size - 1; -1 < i3; i3--) {
                c3218.m7309(bArr[i3]);
            }
            iM7319 = c3218.m7319();
        } else {
            iM7319 = 0;
        }
        List list3 = this.f15666;
        if (list3 != null) {
            i = 1;
            ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Object obj = ((C8946) it3.next()).f25153;
                obj.getClass();
                arrayList5.add(Integer.valueOf(((AbstractC3055) obj).mo6650(c3218)));
            }
            int[] iArrM8807 = AbstractC4343.m8807(arrayList5);
            c3218.m7313(4, iArrM8807.length, 4);
            for (int length = iArrM8807.length - 1; -1 < length; length--) {
                c3218.m7306(iArrM8807[length]);
            }
            iM73192 = c3218.m7319();
        } else {
            i = 1;
            iM73192 = 0;
        }
        C5716 c57162 = this.f15668;
        int iMo66506 = c57162 != null ? c57162.mo6650(c3218) : 0;
        C5716 c57163 = this.f15669;
        int iMo66507 = c57163 != null ? c57163.mo6650(c3218) : 0;
        c3218.m7312(17);
        c3218.m7305(16, 0);
        c3218.m7305(15, 0);
        c3218.m7305(14, 0);
        c3218.m7305(13, 0);
        c3218.m7305(12, iMo66507);
        c3218.m7305(11, iMo66506);
        c3218.m7305(10, iM73192);
        c3218.m7305(9, iM7319);
        c3218.m7305(8, iM73142);
        c3218.m7305(7, iM7314);
        c3218.m7305(6, 0);
        c3218.m7305(5, 0);
        c3218.m7305(4, iMo66505);
        c3218.m7305(3, iMo66504);
        c3218.m7305(2, iMo66503);
        c3218.m7305(i, iMo66502);
        c3218.m7305(0, iMo6650);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
