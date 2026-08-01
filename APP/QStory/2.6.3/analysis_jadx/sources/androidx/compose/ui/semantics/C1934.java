package androidx.compose.ui.semantics;

import com.bumptech.glide.AbstractC3056;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6558;
import p248.C8158;
import p263.C8255;
import p287.AbstractC8405;
import p321.C8694;
import top.suzhelan.qstory.hook.item.chat.C5827;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1934 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5693;

    public /* synthetic */ C1934(Object obj, int i) {
        this.f5693 = i;
        this.f5692 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5693;
        Object obj3 = this.f5692;
        switch (i) {
            case 0:
                int iCompare = ((C1935) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC3056.m6717(Integer.valueOf(((C1953) obj).f5767), Integer.valueOf(((C1953) obj2).f5767));
            case 1:
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                InterfaceC6558 interfaceC6558 = (InterfaceC6558) obj3;
                abstractC4882.getClass();
                String string = interfaceC6558.invoke(abstractC4882).toString();
                AbstractC4882 abstractC48822 = (AbstractC4882) obj2;
                abstractC48822.getClass();
                return AbstractC3056.m6717(string, interfaceC6558.invoke(abstractC48822).toString());
            case 2:
                C5827 c5827 = (C5827) obj3;
                return AbstractC3056.m6717(Integer.valueOf(C5827.m11238(c5827, obj)), Integer.valueOf(C5827.m11238(c5827, obj2)));
            case 3:
                C8158 c8158 = (C8158) obj3;
                return AbstractC3056.m6717((Comparable) ((HashMap) c8158.m13611()).get((C8255) obj), (Comparable) ((HashMap) c8158.m13611()).get((C8255) obj2));
            case 4:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Integer num = (Integer) linkedHashMap.get(((C8694) obj).f24516);
                if (num == null) {
                    num = num;
                }
                Integer num2 = (Integer) linkedHashMap.get(((C8694) obj2).f24516);
                return AbstractC3056.m6717(num, num2 != null ? num2 : Integer.MAX_VALUE);
            case 5:
                int iCompare2 = ((C1934) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str = ((C8694) obj).f24515;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC8405.m13972(1322);
                lowerCase.getClass();
                String lowerCase2 = ((C8694) obj2).f24515.toLowerCase(locale);
                AbstractC8405.m13972(1322);
                lowerCase2.getClass();
                return AbstractC3056.m6717(lowerCase, lowerCase2);
            default:
                int iCompare3 = ((C1934) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC3056.m6717(Long.valueOf(((C8694) obj2).f24512), Long.valueOf(((C8694) obj).f24512));
        }
    }
}
