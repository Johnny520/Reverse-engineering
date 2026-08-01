package p408;

import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.query.matchers.C6540;
import org.luckypray.dexkit.query.matchers.C6544;
import org.luckypray.dexkit.query.matchers.C6545;
import org.luckypray.dexkit.query.matchers.C6546;
import org.luckypray.dexkit.query.matchers.C6547;
import org.luckypray.dexkit.result.C6558;
import org.luckypray.dexkit.result.MethodDataList;
import org.luckypray.dexkit.util.AbstractC6561;
import p052.C7188;
import p378.C9755;
import p378.C9756;
import p378.C9757;
import p378.C9758;
import p382.C9778;
import p405.AbstractC9919;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9927 extends AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Class f25838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f25840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f25839 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f25837 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f25845 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f25844 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25848 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25849 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f25846 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final MatchType f25847 = MatchType.Contains;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f25842 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final ArrayList f25841 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ArrayList f25843 = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("mf");
        Class cls = this.f25840;
        if (cls != null) {
            sb.append(cls.getName());
        }
        Class cls2 = this.f25838;
        if (cls2 != null) {
            sb.append(cls2.getName());
        }
        ArrayList arrayList = this.f25839;
        if (!arrayList.isEmpty()) {
            sb.append(arrayList);
        }
        ArrayList arrayList2 = this.f25845;
        if (!arrayList2.isEmpty()) {
            sb.append(arrayList2);
        }
        ArrayList arrayList3 = this.f25844;
        if (!arrayList3.isEmpty()) {
            sb.append(arrayList3);
        }
        ArrayList arrayList4 = this.f25843;
        if (!arrayList4.isEmpty()) {
            sb.append(arrayList4);
        }
        ArrayList arrayList5 = this.f25848;
        if (!arrayList5.isEmpty()) {
            sb.append(arrayList5);
        }
        int i = this.f25849;
        if (i != -1) {
            sb.append(i);
        }
        int i2 = this.f25846;
        if (i2 != -1) {
            sb.append(i2);
        }
        ArrayList arrayList6 = this.f25837;
        if (!arrayList6.isEmpty()) {
            sb.append(arrayList6);
        }
        ArrayList arrayList7 = this.f25842;
        if (!arrayList7.isEmpty()) {
            sb.append(arrayList7);
        }
        ArrayList arrayList8 = this.f25841;
        if (!arrayList8.isEmpty()) {
            sb.append(arrayList8);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m15244(Class... clsArr) {
        this.f25839.addAll(Arrays.asList(clsArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Method m15245() {
        ArrayList arrayListM15249 = m15249();
        if (arrayListM15249.isEmpty()) {
            return null;
        }
        return (Method) arrayListM15249.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m15246(String... strArr) {
        this.f25837.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m15247(String... strArr) {
        this.f25842.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Method m15248() throws NoSuchMethodException {
        ArrayList arrayListM15249 = m15249();
        if (!arrayListM15249.isEmpty()) {
            return (Method) arrayListM15249.get(0);
        }
        throw new NoSuchMethodException("No method found :" + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ArrayList m15249() {
        try {
            String strM10593 = AbstractC5894.m10593(toString());
            C7188 c7188 = new C7188(1);
            c7188.f17858 = new C9924("DexKitCache", 0);
            ArrayList arrayListM12503 = c7188.m12503(strM10593);
            if (arrayListM12503 != null) {
                return arrayListM12503;
            }
            ArrayList arrayList = new ArrayList();
            MethodDataList methodDataListM11654 = C9929.m15253().m11654(m15251());
            if (methodDataListM11654.isEmpty()) {
                AbstractC5754.m10432(toString(), arrayList);
                return arrayList;
            }
            for (C6558 c6558 : methodDataListM11654) {
                String str = c6558.m11686().f16066;
                if ((AbstractC5227.m9466(str, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME) || AbstractC5227.m9466(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) ? false : true) {
                    Method methodM11685 = c6558.m11685(AbstractC9919.f25822);
                    methodM11685.setAccessible(true);
                    arrayList.add(methodM11685);
                }
            }
            AbstractC5754.m10432(toString(), arrayList);
            return arrayList;
        } catch (NoSuchMethodException unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C6544 m15250() {
        C6545 c6545;
        C6544 c6544 = new C6544();
        Class cls = this.f25840;
        if (cls != null) {
            C6539 c6539 = new C6539();
            c6539.m11680(AbstractC6561.m11691(cls), StringMatchType.Equals, false);
            c6544.f16007 = c6539;
        }
        Class cls2 = this.f25838;
        if (cls2 != null) {
            C6539 c65392 = new C6539();
            c65392.m11680(AbstractC6561.m11691(cls2), StringMatchType.Equals, false);
            c6544.f16006 = c65392;
        }
        ArrayList arrayList = this.f25837;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList2.add(new C9755(str, StringMatchType.Contains, false));
            }
            c6544.f16011 = new ArrayList(arrayList2);
        }
        ArrayList<Class> arrayList3 = this.f25839;
        int i = 3;
        if (!arrayList3.isEmpty()) {
            for (Class cls3 : arrayList3) {
                C6547 c6547 = c6544.f16005;
                if (c6547 == null) {
                    c6547 = new C6547(i);
                }
                c6544.f16005 = c6547;
                if (cls3 != null) {
                    c6545 = new C6545();
                    C6539 c65393 = new C6539();
                    c65393.m11680(AbstractC6561.m11691(cls3), StringMatchType.Equals, false);
                    c6545.f16015 = c65393;
                } else {
                    c6545 = null;
                }
                List arrayList4 = c6547.f16023;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c6547.f16023 = arrayList4;
                arrayList4.add(c6545);
            }
        }
        ArrayList arrayList5 = this.f25843;
        if (!arrayList5.isEmpty()) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                C6546 c6546M15252 = ((C9928) it.next()).m15252();
                UsingType usingType = UsingType.Any;
                usingType.getClass();
                List arrayList6 = c6544.f16010;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                c6544.f16010 = arrayList6;
                C6540 c6540 = new C6540();
                c6540.f16000 = c6546M15252;
                c6540.f15999 = usingType;
                arrayList6.add(c6540);
            }
        }
        ArrayList arrayList7 = this.f25845;
        if (!arrayList7.isEmpty()) {
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                C6544 c6544M11681 = C6544.m11681((Method) it2.next());
                C6547 c65472 = c6544.f16014;
                if (c65472 == null) {
                    c65472 = new C6547();
                }
                c6544.f16014 = c65472;
                c65472.m11682(c6544M11681);
            }
        }
        ArrayList arrayList8 = this.f25844;
        if (!arrayList8.isEmpty()) {
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                C6544 c6544M116812 = C6544.m11681((Method) it3.next());
                C6547 c65473 = c6544.f16012;
                if (c65473 == null) {
                    c65473 = new C6547();
                }
                c6544.f16012 = c65473;
                c65473.m11682(c6544M116812);
            }
        }
        ArrayList<Long> arrayList9 = this.f25848;
        if (!arrayList9.isEmpty()) {
            for (Long l : arrayList9) {
                l.getClass();
                List arrayList10 = c6544.f16013;
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList();
                }
                c6544.f16013 = arrayList10;
                C9756 c9756 = new C9756();
                c9756.m15108(l);
                arrayList10.add(c9756);
            }
        }
        int i2 = this.f25849;
        if (i2 != -1) {
            if (c6544.f16005 == null) {
                c6544.f16005 = new C6547(i);
            }
            C6547 c65474 = c6544.f16005;
            c65474.getClass();
            C9757 c9757 = new C9757();
            c9757.f25484 = i2;
            c9757.f25483 = i2;
            c65474.f16022 = c9757;
        }
        int i3 = this.f25846;
        if (i3 != -1) {
            MatchType matchType = this.f25847;
            matchType.getClass();
            c6544.f16008 = new C9758(i3, matchType);
        }
        return c6544;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C9778 m15251() {
        C9778 c9778 = new C9778();
        ArrayList arrayList = this.f25842;
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            strArr.getClass();
            c9778.f25494 = AbstractC5179.m9405(strArr);
        }
        ArrayList arrayList2 = this.f25841;
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            strArr2.getClass();
            c9778.f25493 = AbstractC5179.m9405(strArr2);
        }
        c9778.f25490 = m15250();
        return c9778;
    }
}
