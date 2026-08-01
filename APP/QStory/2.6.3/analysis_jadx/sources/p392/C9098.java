package p392;

import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.query.matchers.C5710;
import org.luckypray.dexkit.query.matchers.C5714;
import org.luckypray.dexkit.query.matchers.C5715;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.query.matchers.C5717;
import org.luckypray.dexkit.result.C5728;
import org.luckypray.dexkit.result.MethodDataList;
import org.luckypray.dexkit.util.AbstractC5731;
import p036.C6359;
import p362.C8926;
import p362.C8927;
import p362.C8928;
import p362.C8929;
import p366.C8949;
import p389.AbstractC9090;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9098 extends AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25494 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25492 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25500 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25499 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25503 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25504 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f25501 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final MatchType f25502 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f25497 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ArrayList f25496 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayList f25498 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("mf");
        Class cls = this.f25495;
        if (cls != null) {
            sb.append(cls.getName());
        }
        Class cls2 = this.f25493;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        ArrayList arrayList = this.f25494;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25500;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25499;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25498;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25503;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        int i = this.f25504;
        if (i != -1) {
            sb.append(i);
        }
        int i2 = this.f25501;
        if (i2 != -1) {
            sb.append(i2);
        }
        ArrayList arrayList6 = this.f25492;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        ArrayList arrayList7 = this.f25497;
        if (!arrayList7.isEmpty()) {
            sb.append(arrayList7);
        }
        ArrayList arrayList8 = this.f25496;
        if (!arrayList8.isEmpty()) {
            sb.append(arrayList8);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14685(Class... clsArr) {
        this.f25494.addAll(Arrays.asList(clsArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Method m14686() {
        ArrayList arrayListM14690 = m14690();
        if (arrayListM14690.isEmpty()) {
            return null;
        }
        return (Method) arrayListM14690.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14687(String... strArr) {
        this.f25492.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14688(String... strArr) {
        this.f25497.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Method m14689() throws NoSuchMethodException {
        ArrayList arrayListM14690 = m14690();
        if (!arrayListM14690.isEmpty()) {
            return (Method) arrayListM14690.get(0);
        }
        throw new NoSuchMethodException("No method found :" + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ArrayList m14690() {
        try {
            String strM10034 = AbstractC5062.m10034(toString());
            C6359 c6359 = new C6359(1);
            c6359.f17513 = new C9095("DexKitCache", 0);
            ArrayList arrayListM11944 = c6359.m11944(strM10034);
            if (arrayListM11944 != null) {
                return arrayListM11944;
            }
            ArrayList arrayList = new ArrayList();
            MethodDataList methodDataListM11095 = C9100.m14694().m11095(m14692());
            if (methodDataListM11095.isEmpty()) {
                AbstractC4922.m9873(toString(), arrayList);
                return arrayList;
            }
            for (C5728 c5728 : methodDataListM11095) {
                String str = c5728.m11127().f15721;
                if ((AbstractC4395.m8907(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC4395.m8907(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) ? false : true) {
                    Method methodM11126 = c5728.m11126(AbstractC9090.f25477);
                    methodM11126.setAccessible(true);
                    arrayList.add(methodM11126);
                }
            }
            AbstractC4922.m9873(toString(), arrayList);
            return arrayList;
        } catch (NoSuchMethodException unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C5714 m14691() {
        C5715 c5715;
        C5714 c5714 = new C5714();
        Class cls = this.f25495;
        if (cls != null) {
            C5709 c5709 = new C5709();
            c5709.m11121(AbstractC5731.m11132(cls), StringMatchType.Equals, false);
            c5714.f15662 = c5709;
        }
        Class cls2 = this.f25493;
        if (cls2 != null) {
            C5709 c57092 = new C5709();
            c57092.m11121(AbstractC5731.m11132(cls2), StringMatchType.Equals, false);
            c5714.f15661 = c57092;
        }
        ArrayList arrayList = this.f25492;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList2.add(new C8926(str, StringMatchType.Contains, false));
            }
            c5714.f15666 = new ArrayList(arrayList2);
        }
        ArrayList<Class> arrayList3 = this.f25494;
        int i = 3;
        if (!arrayList3.isEmpty()) {
            for (Class cls3 : arrayList3) {
                C5717 c5717 = c5714.f15660;
                if (c5717 == null) {
                    c5717 = new C5717(i);
                }
                c5714.f15660 = c5717;
                if (cls3 != null) {
                    c5715 = new C5715();
                    C5709 c57093 = new C5709();
                    c57093.m11121(AbstractC5731.m11132(cls3), StringMatchType.Equals, false);
                    c5715.f15670 = c57093;
                } else {
                    c5715 = null;
                }
                List arrayList4 = c5717.f15678;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c5717.f15678 = arrayList4;
                arrayList4.add(c5715);
            }
        }
        ArrayList arrayList5 = this.f25498;
        if (!arrayList5.isEmpty()) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                C5716 c5716M14693 = ((C9099) it.next()).m14693();
                UsingType usingType = UsingType.Any;
                usingType.getClass();
                List arrayList6 = c5714.f15665;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                c5714.f15665 = arrayList6;
                C5710 c5710 = new C5710();
                c5710.f15655 = c5716M14693;
                c5710.f15654 = usingType;
                arrayList6.add(c5710);
            }
        }
        ArrayList arrayList7 = this.f25500;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C5714 c5714M11122 = C5714.m11122((Method) it2.next());
                C5717 c57172 = c5714.f15669;
                if (c57172 == null) {
                    c57172 = new C5717();
                }
                c5714.f15669 = c57172;
                c57172.m11123(c5714M11122);
            }
        }
        ArrayList arrayList8 = this.f25499;
        if (!arrayList8.isEmpty()) {
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                C5714 c5714M111222 = C5714.m11122((Method) it3.next());
                C5717 c57173 = c5714.f15667;
                if (c57173 == null) {
                    c57173 = new C5717();
                }
                c5714.f15667 = c57173;
                c57173.m11123(c5714M111222);
            }
        }
        ArrayList<Long> arrayList9 = this.f25503;
        if (!arrayList9.isEmpty()) {
            for (Long l : arrayList9) {
                l.getClass();
                List arrayList10 = c5714.f15668;
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList();
                }
                c5714.f15668 = arrayList10;
                C8927 c8927 = new C8927();
                c8927.m14549(l);
                arrayList10.add(c8927);
            }
        }
        int i2 = this.f25504;
        if (i2 != -1) {
            if (c5714.f15660 == null) {
                c5714.f15660 = new C5717(i);
            }
            C5717 c57174 = c5714.f15660;
            c57174.getClass();
            C8928 c8928 = new C8928();
            c8928.f25139 = i2;
            c8928.f25138 = i2;
            c57174.f15677 = c8928;
        }
        int i3 = this.f25501;
        if (i3 != -1) {
            MatchType matchType = this.f25502;
            matchType.getClass();
            c5714.f15663 = new C8929(i3, matchType);
        }
        return c5714;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C8949 m14692() {
        C8949 c8949 = new C8949();
        ArrayList arrayList = this.f25497;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c8949.f25149 = AbstractC4347.m8846(strArr);
        }
        ArrayList arrayList2 = this.f25496;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c8949.f25148 = AbstractC4347.m8846(strArr2);
        }
        c8949.f25145 = m14691();
        return c8949;
    }
}
