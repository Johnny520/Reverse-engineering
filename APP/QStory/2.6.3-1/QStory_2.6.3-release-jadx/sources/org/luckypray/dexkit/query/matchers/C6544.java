package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C6010;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.util.AbstractC6561;
import org.luckypray.dexkit.wrap.C6564;
import p378.C9755;
import p378.C9756;
import p378.C9758;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6544 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6547 f16005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6539 f16006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6539 f16007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C9758 f16008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9755 f16009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f16010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ArrayList f16011;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C6547 f16012;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public List f16013;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6547 f16014;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C6544 m11681(Method method) {
        C6545 c6545;
        method.getClass();
        C6544 c6544 = new C6544();
        LinkedHashMap linkedHashMap = AbstractC6561.f16061;
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(AbstractC6561.m11689(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(AbstractC6561.m11692(method));
        C6564 c6564 = new C6564(sb.toString());
        StringMatchType stringMatchType = StringMatchType.Equals;
        String str = c6564.f16066;
        str.getClass();
        stringMatchType.getClass();
        c6544.f16009 = new C9755(str, stringMatchType, false);
        String str2 = c6564.f16067;
        str2.getClass();
        stringMatchType.getClass();
        C6539 c6539 = new C6539();
        c6539.m11680(str2, stringMatchType, false);
        c6544.f16007 = c6539;
        String str3 = c6564.f16064;
        str3.getClass();
        C6539 c65392 = new C6539();
        c65392.m11680(str3, stringMatchType, false);
        c6544.f16006 = c65392;
        ArrayList<String> arrayList = c6564.f16065;
        arrayList.getClass();
        C6547 c6547 = new C6547(3);
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        c6547.f16023 = new ArrayList(emptyList);
        for (String str4 : arrayList) {
            if (str4 != null) {
                c6545 = new C6545();
                StringMatchType stringMatchType2 = StringMatchType.Equals;
                stringMatchType2.getClass();
                C6539 c65393 = new C6539();
                c65393.m11680(str4, stringMatchType2, false);
                c6545.f16015 = c65393;
            } else {
                c6545 = null;
            }
            List arrayList2 = c6547.f16023;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            c6547.f16023 = arrayList2;
            arrayList2.add(c6545);
        }
        c6544.f16005 = c6547;
        return c6544;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7860;
        int iM78602;
        int iM7865;
        int i;
        int iM78652;
        C9755 c9755 = this.f16009;
        int iMo1741 = c9755 != null ? c9755.mo1741(c4051) : 0;
        C9758 c9758 = this.f16008;
        int iMo17412 = c9758 != null ? c9758.mo1741(c4051) : 0;
        C6539 c6539 = this.f16007;
        int iMo17413 = c6539 != null ? c6539.mo1741(c4051) : 0;
        C6539 c65392 = this.f16006;
        int iMo17414 = c65392 != null ? c65392.mo1741(c4051) : 0;
        C6547 c6547 = this.f16005;
        int iMo17415 = c6547 != null ? c6547.mo1741(c4051) : 0;
        ArrayList<C9755> arrayList = this.f16011;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
            for (C9755 c97552 : arrayList) {
                c97552.getClass();
                arrayList2.add(Integer.valueOf(c97552.mo1741(c4051)));
            }
            iM7860 = c4051.m7860(AbstractC5176.m9357(arrayList2));
        } else {
            iM7860 = 0;
        }
        List<C6540> list = this.f16010;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(list, 10));
            for (C6540 c6540 : list) {
                c6540.getClass();
                arrayList3.add(Integer.valueOf(c6540.mo1741(c4051)));
            }
            iM78602 = c4051.m7860(AbstractC5176.m9357(arrayList3));
        } else {
            iM78602 = 0;
        }
        List list2 = this.f16013;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                NumberEncodeValueType numberEncodeValueType = ((C9756) it.next()).f25481;
                numberEncodeValueType.getClass();
                arrayList4.add(new C6010(numberEncodeValueType.getValue()));
            }
            int size = arrayList4.size();
            byte[] bArr = new byte[size];
            Iterator it2 = arrayList4.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                bArr[i2] = ((C6010) it2.next()).f15086;
                i2++;
            }
            c4051.m7859(1, size, 1);
            for (int i3 = size - 1; -1 < i3; i3--) {
                c4051.m7855(bArr[i3]);
            }
            iM7865 = c4051.m7865();
        } else {
            iM7865 = 0;
        }
        List list3 = this.f16013;
        if (list3 != null) {
            i = 1;
            ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Object obj = ((C9756) it3.next()).f25482;
                obj.getClass();
                arrayList5.add(Integer.valueOf(((AbstractC1298) obj).mo1741(c4051)));
            }
            int[] iArrM9357 = AbstractC5176.m9357(arrayList5);
            c4051.m7859(4, iArrM9357.length, 4);
            for (int length = iArrM9357.length - 1; -1 < length; length--) {
                c4051.m7852(iArrM9357[length]);
            }
            iM78652 = c4051.m7865();
        } else {
            i = 1;
            iM78652 = 0;
        }
        C6547 c65472 = this.f16014;
        int iMo17416 = c65472 != null ? c65472.mo1741(c4051) : 0;
        C6547 c65473 = this.f16012;
        int iMo17417 = c65473 != null ? c65473.mo1741(c4051) : 0;
        c4051.m7858(17);
        c4051.m7851(16, 0);
        c4051.m7851(15, 0);
        c4051.m7851(14, 0);
        c4051.m7851(13, 0);
        c4051.m7851(12, iMo17417);
        c4051.m7851(11, iMo17416);
        c4051.m7851(10, iM78652);
        c4051.m7851(9, iM7865);
        c4051.m7851(8, iM78602);
        c4051.m7851(7, iM7860);
        c4051.m7851(6, 0);
        c4051.m7851(5, 0);
        c4051.m7851(4, iMo17415);
        c4051.m7851(3, iMo17414);
        c4051.m7851(2, iMo17413);
        c4051.m7851(i, iMo17412);
        c4051.m7851(0, iMo1741);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
