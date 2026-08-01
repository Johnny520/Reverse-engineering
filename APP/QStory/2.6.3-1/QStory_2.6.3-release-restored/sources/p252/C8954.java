package p252;

import androidx.appcompat.app.AbstractC0927;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8954 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8954 f22769 = new C8954(Marker.ANY_MARKER, Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f22770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f22771;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8954(String str, String str2, List list) {
        super(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f22771 = str;
        this.f22770 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8954)) {
            return false;
        }
        C8954 c8954 = (C8954) obj;
        return AbstractC5971.m10689(this.f22771, c8954.f22771) && AbstractC5971.m10689(this.f22770, c8954.f22770) && AbstractC5227.m9466((List) this.f577, (List) c8954.f577);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22771.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22770.toLowerCase(locale);
        lowerCase2.getClass();
        int iHashCode2 = lowerCase2.hashCode();
        return (((List) this.f577).hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m14148(C8954 c8954) {
        boolean zM10689;
        c8954.getClass();
        String str = c8954.f22770;
        String str2 = c8954.f22771;
        if ((AbstractC5227.m9466(str2, Marker.ANY_MARKER) || AbstractC5971.m10689(str2, this.f22771)) && (AbstractC5227.m9466(str, Marker.ANY_MARKER) || AbstractC5971.m10689(str, this.f22770))) {
            Iterator it = ((List) c8954.f577).iterator();
            do {
                zM10689 = true;
                if (!it.hasNext()) {
                    return true;
                }
                C8949 c8949 = (C8949) it.next();
                String str3 = c8949.f22762;
                String str4 = c8949.f22761;
                if (!AbstractC5227.m9466(str3, Marker.ANY_MARKER)) {
                    String strM869 = m869(str3);
                    if (!AbstractC5227.m9466(str4, Marker.ANY_MARKER)) {
                        zM10689 = AbstractC5971.m10689(strM869, str4);
                    } else if (strM869 != null) {
                    }
                } else if (!AbstractC5227.m9466(str4, Marker.ANY_MARKER)) {
                    List list = (List) this.f577;
                    if (list == null || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC5971.m10689(((C8949) it2.next()).f22761, str4)) {
                                break;
                            }
                        }
                        zM10689 = false;
                    } else {
                        zM10689 = false;
                    }
                }
            } while (zM10689);
        }
        return false;
    }

    public C8954(String str, String str2, String str3, ArrayList arrayList) {
        super(str3, arrayList);
        this.f22771 = str;
        this.f22770 = str2;
    }

    public C8954(String str, String str2) {
        this(str, str2, EmptyList.INSTANCE);
    }
}
