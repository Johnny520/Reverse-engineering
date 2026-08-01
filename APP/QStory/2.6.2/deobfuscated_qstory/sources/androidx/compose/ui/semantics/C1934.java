package androidx.compose.ui.semantics;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6557;
import p175.AbstractC7738;
import p248.C8157;
import p263.C8254;
import p324.C8744;
import top.suzhelan.qstory.hook.item.chat.C5825;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1934 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5692;

    public /* synthetic */ C1934(Object obj, int i) {
        this.f5692 = i;
        this.f5691 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5692;
        Object obj3 = this.f5691;
        switch (i) {
            case 0:
                int iCompare = ((C1935) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC7738.m13040(Integer.valueOf(((C1953) obj).f5766), Integer.valueOf(((C1953) obj2).f5766));
            case 1:
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                InterfaceC6557 interfaceC6557 = (InterfaceC6557) obj3;
                abstractC4881.getClass();
                String string = interfaceC6557.invoke(abstractC4881).toString();
                AbstractC4881 abstractC48812 = (AbstractC4881) obj2;
                abstractC48812.getClass();
                return AbstractC7738.m13040(string, interfaceC6557.invoke(abstractC48812).toString());
            case 2:
                C5825 c5825 = (C5825) obj3;
                return AbstractC7738.m13040(Integer.valueOf(C5825.m11181(c5825, obj)), Integer.valueOf(C5825.m11181(c5825, obj2)));
            case 3:
                C8157 c8157 = (C8157) obj3;
                return AbstractC7738.m13040((Comparable) ((HashMap) c8157.m13582()).get((C8254) obj), (Comparable) ((HashMap) c8157.m13582()).get((C8254) obj2));
            case 4:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Integer num = (Integer) linkedHashMap.get(((C8744) obj).f24649);
                if (num == null) {
                    num = num;
                }
                Integer num2 = (Integer) linkedHashMap.get(((C8744) obj2).f24649);
                return AbstractC7738.m13040(num, num2 != null ? num2 : Integer.MAX_VALUE);
            case 5:
                int iCompare2 = ((C1934) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str = ((C8744) obj).f24648;
                Locale locale = Locale.ROOT;
                String strM4563 = AbstractC2442.m4563(str, locale, -3937688152349869479L);
                String lowerCase = ((C8744) obj2).f24648.toLowerCase(locale);
                "toLowerCase(...)";
                lowerCase.getClass();
                return AbstractC7738.m13040(strM4563, lowerCase);
            default:
                int iCompare3 = ((C1934) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC7738.m13040(Long.valueOf(((C8744) obj2).f24645), Long.valueOf(((C8744) obj).f24645));
        }
    }
}
