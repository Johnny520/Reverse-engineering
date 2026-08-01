package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C5178;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.util.AbstractC5731;
import org.luckypray.dexkit.wrap.C5734;
import p362.C8926;
import p362.C8927;
import p362.C8929;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5714 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5717 f15660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5709 f15661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5709 f15662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8929 f15663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8926 f15664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f15665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ArrayList f15666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C5717 f15667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public List f15668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C5717 f15669;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C5714 m11122(Method method) {
        C5715 c5715;
        method.getClass();
        C5714 c5714 = new C5714();
        LinkedHashMap linkedHashMap = AbstractC5731.f15716;
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(AbstractC5731.m11130(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(AbstractC5731.m11133(method));
        C5734 c5734 = new C5734(sb.toString());
        StringMatchType stringMatchType = StringMatchType.Equals;
        String str = c5734.f15721;
        str.getClass();
        stringMatchType.getClass();
        c5714.f15664 = new C8926(str, stringMatchType, false);
        String str2 = c5734.f15722;
        str2.getClass();
        stringMatchType.getClass();
        C5709 c5709 = new C5709();
        c5709.m11121(str2, stringMatchType, false);
        c5714.f15662 = c5709;
        String str3 = c5734.f15719;
        str3.getClass();
        C5709 c57092 = new C5709();
        c57092.m11121(str3, stringMatchType, false);
        c5714.f15661 = c57092;
        ArrayList<String> arrayList = c5734.f15720;
        arrayList.getClass();
        C5717 c5717 = new C5717(3);
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        c5717.f15678 = new ArrayList(emptyList);
        for (String str4 : arrayList) {
            if (str4 != null) {
                c5715 = new C5715();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C5709 c57093 = new C5709();
                c57093.m11121(str4, stringMatchType2, false);
                c5715.f15670 = c57093;
            } else {
                c5715 = null;
            }
            List arrayList2 = c5717.f15678;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            c5717.f15678 = arrayList2;
            arrayList2.add(c5715);
        }
        c5714.f15660 = c5717;
        return c5714;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int iM7301;
        int iM73012;
        int iM7306;
        int i;
        int iM73062;
        C8926 c8926 = this.f15664;
        int iMo1181 = c8926 != null ? c8926.mo1181(c3219) : 0;
        C8929 c8929 = this.f15663;
        int iMo11812 = c8929 != null ? c8929.mo1181(c3219) : 0;
        C5709 c5709 = this.f15662;
        int iMo11813 = c5709 != null ? c5709.mo1181(c3219) : 0;
        C5709 c57092 = this.f15661;
        int iMo11814 = c57092 != null ? c57092.mo1181(c3219) : 0;
        C5717 c5717 = this.f15660;
        int iMo11815 = c5717 != null ? c5717.mo1181(c3219) : 0;
        ArrayList<C8926> arrayList = this.f15666;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
            for (C8926 c89262 : arrayList) {
                c89262.getClass();
                arrayList2.add(Integer.valueOf(c89262.mo1181(c3219)));
            }
            iM7301 = c3219.m7301(AbstractC4344.m8798(arrayList2));
        } else {
            iM7301 = 0;
        }
        List<C5710> list = this.f15665;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(list, 10));
            for (C5710 c5710 : list) {
                c5710.getClass();
                arrayList3.add(Integer.valueOf(c5710.mo1181(c3219)));
            }
            iM73012 = c3219.m7301(AbstractC4344.m8798(arrayList3));
        } else {
            iM73012 = 0;
        }
        List list2 = this.f15668;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                NumberEncodeValueType numberEncodeValueType = ((C8927) it.next()).f25136;
                numberEncodeValueType.getClass();
                arrayList4.add(new C5178(numberEncodeValueType.getValue()));
            }
            int size = arrayList4.size();
            byte[] bArr = new byte[size];
            Iterator it2 = arrayList4.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                bArr[i2] = ((C5178) it2.next()).f14741;
                i2++;
            }
            c3219.m7300(1, size, 1);
            for (int i3 = size - 1; -1 < i3; i3--) {
                c3219.m7296(bArr[i3]);
            }
            iM7306 = c3219.m7306();
        } else {
            iM7306 = 0;
        }
        List list3 = this.f15668;
        if (list3 != null) {
            i = 1;
            ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Object obj = ((C8927) it3.next()).f25137;
                obj.getClass();
                arrayList5.add(Integer.valueOf(((AbstractC0455) obj).mo1181(c3219)));
            }
            int[] iArrM8798 = AbstractC4344.m8798(arrayList5);
            c3219.m7300(4, iArrM8798.length, 4);
            for (int length = iArrM8798.length - 1; -1 < length; length--) {
                c3219.m7293(iArrM8798[length]);
            }
            iM73062 = c3219.m7306();
        } else {
            i = 1;
            iM73062 = 0;
        }
        C5717 c57172 = this.f15669;
        int iMo11816 = c57172 != null ? c57172.mo1181(c3219) : 0;
        C5717 c57173 = this.f15667;
        int iMo11817 = c57173 != null ? c57173.mo1181(c3219) : 0;
        c3219.m7299(17);
        c3219.m7292(16, 0);
        c3219.m7292(15, 0);
        c3219.m7292(14, 0);
        c3219.m7292(13, 0);
        c3219.m7292(12, iMo11817);
        c3219.m7292(11, iMo11816);
        c3219.m7292(10, iM73062);
        c3219.m7292(9, iM7306);
        c3219.m7292(8, iM73012);
        c3219.m7292(7, iM7301);
        c3219.m7292(6, 0);
        c3219.m7292(5, 0);
        c3219.m7292(4, iMo11815);
        c3219.m7292(3, iMo11814);
        c3219.m7292(2, iMo11813);
        c3219.m7292(i, iMo11812);
        c3219.m7292(0, iMo1181);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
