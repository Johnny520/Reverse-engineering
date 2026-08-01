package androidx.compose.p001ui.semantics;

import com.bumptech.glide.AbstractC3888;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7387;
import p264.C8987;
import p279.C9084;
import p337.C9523;
import top.suzhelan.qstory.hook.item.chat.C6657;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2769 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6037;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6038;

    public /* synthetic */ C2769(Object obj, int i) {
        this.f6038 = i;
        this.f6037 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f6038;
        Object obj3 = this.f6037;
        switch (i) {
            case 0:
                int iCompare = ((C2770) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC3888.m7277(Integer.valueOf(((C2788) obj).f6112), Integer.valueOf(((C2788) obj2).f6112));
            case 1:
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj3;
                abstractC5714.getClass();
                String string = interfaceC7387.invoke(abstractC5714).toString();
                AbstractC5714 abstractC57142 = (AbstractC5714) obj2;
                abstractC57142.getClass();
                return AbstractC3888.m7277(string, interfaceC7387.invoke(abstractC57142).toString());
            case 2:
                C6657 c6657 = (C6657) obj3;
                return AbstractC3888.m7277(Integer.valueOf(C6657.m11797(c6657, obj)), Integer.valueOf(C6657.m11797(c6657, obj2)));
            case 3:
                C8987 c8987 = (C8987) obj3;
                return AbstractC3888.m7277((Comparable) ((HashMap) c8987.m14170()).get((C9084) obj), (Comparable) ((HashMap) c8987.m14170()).get((C9084) obj2));
            case 4:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Integer num = (Integer) linkedHashMap.get(((C9523) obj).f24861);
                if (num == null) {
                    num = num;
                }
                Integer num2 = (Integer) linkedHashMap.get(((C9523) obj2).f24861);
                return AbstractC3888.m7277(num, num2 != null ? num2 : Integer.MAX_VALUE);
            case 5:
                int iCompare2 = ((C2769) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str = ((C9523) obj).f24860;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                "toLowerCase(...)";
                lowerCase.getClass();
                String lowerCase2 = ((C9523) obj2).f24860.toLowerCase(locale);
                "toLowerCase(...)";
                lowerCase2.getClass();
                return AbstractC3888.m7277(lowerCase, lowerCase2);
            default:
                int iCompare3 = ((C2769) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC3888.m7277(Long.valueOf(((C9523) obj2).f24857), Long.valueOf(((C9523) obj).f24857));
        }
    }
}
