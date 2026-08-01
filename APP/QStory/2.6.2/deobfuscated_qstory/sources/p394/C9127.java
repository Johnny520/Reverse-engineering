package p394;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.query.matchers.C5713;
import org.luckypray.dexkit.query.matchers.C5714;
import org.luckypray.dexkit.query.matchers.C5715;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.result.C5727;
import org.luckypray.dexkit.result.MethodDataList;
import org.luckypray.dexkit.util.AbstractC5730;
import p033.AbstractC6325;
import p035.C6341;
import p053.AbstractC6560;
import p366.C8945;
import p366.C8946;
import p366.C8947;
import p366.C8948;
import p368.C8956;
import p391.C9114;
import p392.AbstractC9121;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9127 extends AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25517 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25515 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25523 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25522 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25526 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25527 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f25524 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final MatchType f25525 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f25520 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ArrayList f25519 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayList f25521 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("mf");
        Class cls = this.f25518;
        if (cls != null) {
            sb.append(cls.getName());
        }
        Class cls2 = this.f25516;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        ArrayList arrayList = this.f25517;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25523;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25522;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25521;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25526;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        int i = this.f25527;
        if (i != -1) {
            sb.append(i);
        }
        int i2 = this.f25524;
        if (i2 != -1) {
            sb.append(i2);
        }
        ArrayList arrayList6 = this.f25515;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        ArrayList arrayList7 = this.f25520;
        if (!arrayList7.isEmpty()) {
            sb.append(arrayList7);
        }
        ArrayList arrayList8 = this.f25519;
        if (!arrayList8.isEmpty()) {
            sb.append(arrayList8);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m14688(String... strArr) {
        this.f25515.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m14689(String... strArr) {
        this.f25520.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14690(Class... clsArr) {
        this.f25517.addAll(Arrays.asList(clsArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C8956 m14691() {
        C8956 c8956 = new C8956();
        ArrayList arrayList = this.f25520;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c8956.f25183 = AbstractC4346.m8850(strArr);
        }
        ArrayList arrayList2 = this.f25519;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c8956.f25182 = AbstractC4346.m8850(strArr2);
        }
        c8956.f25179 = m14694();
        return c8956;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final Method m14692() throws NoSuchMethodException {
        ArrayList arrayListM14695 = m14695();
        if (!arrayListM14695.isEmpty()) {
            return (Method) arrayListM14695.get(0);
        }
        throw new NoSuchMethodException("No method found :" + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final Method m14693() {
        ArrayList arrayListM14695 = m14695();
        if (arrayListM14695.isEmpty()) {
            return null;
        }
        return (Method) arrayListM14695.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C5713 m14694() {
        C5714 c5714;
        C5713 c5713 = new C5713();
        Class cls = this.f25518;
        if (cls != null) {
            C5708 c5708 = new C5708();
            c5708.m11064(AbstractC5730.m11075(cls), StringMatchType.Equals, false);
            c5713.f15663 = c5708;
        }
        Class cls2 = this.f25516;
        if (cls2 != null) {
            C5708 c57082 = new C5708();
            c57082.m11064(AbstractC5730.m11075(cls2), StringMatchType.Equals, false);
            c5713.f15662 = c57082;
        }
        ArrayList arrayList = this.f25515;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList2.add(new C8945(str, StringMatchType.Contains, false));
            }
            c5713.f15660 = new ArrayList(arrayList2);
        }
        ArrayList<Class> arrayList3 = this.f25517;
        int i = 3;
        if (!arrayList3.isEmpty()) {
            for (Class cls3 : arrayList3) {
                C5716 c5716 = c5713.f15661;
                if (c5716 == null) {
                    c5716 = new C5716(i);
                }
                c5713.f15661 = c5716;
                if (cls3 != null) {
                    c5714 = new C5714();
                    C5708 c57083 = new C5708();
                    c57083.m11064(AbstractC5730.m11075(cls3), StringMatchType.Equals, false);
                    c5714.f15670 = c57083;
                } else {
                    c5714 = null;
                }
                List arrayList4 = c5716.f15678;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c5716.f15678 = arrayList4;
                arrayList4.add(c5714);
            }
        }
        ArrayList arrayList5 = this.f25521;
        if (!arrayList5.isEmpty()) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                C5715 c5715M14696 = ((C9128) it.next()).m14696();
                UsingType usingType = UsingType.Any;
                usingType.getClass();
                List arrayList6 = c5713.f15667;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                c5713.f15667 = arrayList6;
                C5709 c5709 = new C5709();
                c5709.f15655 = c5715M14696;
                c5709.f15654 = usingType;
                arrayList6.add(c5709);
            }
        }
        ArrayList arrayList7 = this.f25523;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C5713 c5713M11065 = C5713.m11065((Method) it2.next());
                C5716 c57162 = c5713.f15668;
                if (c57162 == null) {
                    c57162 = new C5716();
                }
                c5713.f15668 = c57162;
                c57162.m11066(c5713M11065);
            }
        }
        ArrayList arrayList8 = this.f25522;
        if (!arrayList8.isEmpty()) {
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                C5713 c5713M110652 = C5713.m11065((Method) it3.next());
                C5716 c57163 = c5713.f15669;
                if (c57163 == null) {
                    c57163 = new C5716();
                }
                c5713.f15669 = c57163;
                c57163.m11066(c5713M110652);
            }
        }
        ArrayList<Long> arrayList9 = this.f25526;
        if (!arrayList9.isEmpty()) {
            for (Long l : arrayList9) {
                l.getClass();
                List arrayList10 = c5713.f15666;
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList();
                }
                c5713.f15666 = arrayList10;
                C8946 c8946 = new C8946();
                c8946.m14540(l);
                arrayList10.add(c8946);
            }
        }
        int i2 = this.f25527;
        if (i2 != -1) {
            if (c5713.f15661 == null) {
                c5713.f15661 = new C5716(i);
            }
            C5716 c57164 = c5713.f15661;
            c57164.getClass();
            C8947 c8947 = new C8947();
            c8947.f25155 = i2;
            c8947.f25154 = i2;
            c57164.f15677 = c8947;
        }
        int i3 = this.f25524;
        if (i3 != -1) {
            MatchType matchType = this.f25525;
            matchType.getClass();
            c5713.f15664 = new C8948(i3, matchType);
        }
        return c5713;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final ArrayList m14695() {
        try {
            String strM11854 = AbstractC6325.m11854(toString());
            C6341 c6341 = new C6341(1);
            c6341.f17466 = new C9114("DexKitCache", 0);
            ArrayList arrayListM11896 = c6341.m11896(strM11854);
            if (arrayListM11896 != null) {
                return arrayListM11896;
            }
            ArrayList arrayList = new ArrayList();
            MethodDataList methodDataListM11038 = C9129.m14697().m11038(m14691());
            if (methodDataListM11038.isEmpty()) {
                AbstractC4921.m9874(toString(), arrayList);
                return arrayList;
            }
            for (C5727 c5727 : methodDataListM11038) {
                String str = c5727.m11070().f15721;
                if ((AbstractC4394.m8917(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC4394.m8917(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) ? false : true) {
                    Method methodM11069 = c5727.m11069(AbstractC9121.f25497);
                    methodM11069.setAccessible(true);
                    arrayList.add(methodM11069);
                }
            }
            AbstractC4921.m9874(toString(), arrayList);
            return arrayList;
        } catch (NoSuchMethodException unused) {
            return new ArrayList();
        }
    }
}
