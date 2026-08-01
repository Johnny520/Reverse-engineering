package androidx.compose.animation;

import android.view.View;
import androidx.core.view.AbstractC2270;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.luckypray.dexkit.result.C5723;
import org.luckypray.dexkit.result.C5726;
import org.luckypray.dexkit.result.C5727;
import p150.C7578;
import p175.AbstractC7738;
import p206.C7908;
import p324.C8744;
import p388.C9099;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1388;

    public /* synthetic */ C0426(int i) {
        this.f1388 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1388) {
            case 0:
                ((AbstractC0441) obj).getClass();
                throw null;
            case 1:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 3:
                return Integer.compare(((Integer) ((Map.Entry) obj).getKey()).intValue(), ((Integer) ((Map.Entry) obj2).getKey()).intValue());
            case 4:
                String str = (String) obj;
                int i = 0;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (str.charAt(i2) == '/') {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                String str2 = (String) obj2;
                int i3 = 0;
                for (int i4 = 0; i4 < str2.length(); i4++) {
                    if (str2.charAt(i4) == '/') {
                        i3++;
                    }
                }
                return AbstractC7738.m13040(numValueOf, Integer.valueOf(i3));
            case 5:
                return AbstractC7738.m13040(((C5723) obj).f15689, ((C5723) obj2).f15689);
            case 6:
                return AbstractC7738.m13040(((C5726) obj).f15701, ((C5726) obj2).f15701);
            case 7:
                return AbstractC7738.m13040(((C5727) obj).f15706, ((C5727) obj2).f15706);
            case 8:
                return ((C7578) obj).f20517 - ((C7578) obj2).f20517;
            case 9:
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 10:
                return ((C7908) obj).f21893 - ((C7908) obj2).f21893;
            case 11:
                Locale locale = Locale.ROOT;
                String strM4563 = AbstractC2442.m4563((String) obj, locale, -3937688152349869479L);
                String lowerCase = ((String) obj2).toLowerCase(locale);
                "toLowerCase(...)";
                lowerCase.getClass();
                return AbstractC7738.m13040(strM4563, lowerCase);
            case 12:
                Locale locale2 = Locale.ROOT;
                String strM45632 = AbstractC2442.m4563((String) obj, locale2, -3937688152349869479L);
                String lowerCase2 = ((String) obj2).toLowerCase(locale2);
                "toLowerCase(...)";
                lowerCase2.getClass();
                return AbstractC7738.m13040(strM45632, lowerCase2);
            case 13:
                Locale locale3 = Locale.ROOT;
                String strM45633 = AbstractC2442.m4563((String) obj2, locale3, -3937688152349869479L);
                String lowerCase3 = ((String) obj).toLowerCase(locale3);
                "toLowerCase(...)";
                lowerCase3.getClass();
                return AbstractC7738.m13040(strM45633, lowerCase3);
            case 14:
                String str3 = ((C8744) obj).f24648;
                Locale locale4 = Locale.ROOT;
                String strM45634 = AbstractC2442.m4563(str3, locale4, -3937688152349869479L);
                String lowerCase4 = ((C8744) obj2).f24648.toLowerCase(locale4);
                "toLowerCase(...)";
                lowerCase4.getClass();
                return AbstractC7738.m13040(strM45634, lowerCase4);
            case 15:
                return AbstractC7738.m13040(Long.valueOf(((C8744) obj).f24645), Long.valueOf(((C8744) obj2).f24645));
            case 16:
                String str4 = ((C8744) obj2).f24648;
                Locale locale5 = Locale.ROOT;
                String strM45635 = AbstractC2442.m4563(str4, locale5, -3937688152349869479L);
                String lowerCase5 = ((C8744) obj).f24648.toLowerCase(locale5);
                "toLowerCase(...)";
                lowerCase5.getClass();
                return AbstractC7738.m13040(strM45635, lowerCase5);
            case 17:
                return AbstractC7738.m13040(Long.valueOf(((C8744) obj2).f24645), Long.valueOf(((C8744) obj).f24645));
            case 18:
                return AbstractC7738.m13040(((File) obj).getName(), ((File) obj2).getName());
            case 19:
                String name = ((File) obj).getName();
                name.getClass();
                Locale locale6 = Locale.ROOT;
                String lowerCase6 = name.toLowerCase(locale6);
                lowerCase6.getClass();
                String name2 = ((File) obj2).getName();
                name2.getClass();
                String lowerCase7 = name2.toLowerCase(locale6);
                lowerCase7.getClass();
                return AbstractC7738.m13040(lowerCase6, lowerCase7);
            case 20:
                return AbstractC7738.m13040(Integer.valueOf(((C9099) obj).getDownloadCount()), Integer.valueOf(((C9099) obj2).getDownloadCount()));
            case 21:
                return AbstractC7738.m13040(Integer.valueOf(((C9099) obj2).getDownloadCount()), Integer.valueOf(((C9099) obj).getDownloadCount()));
            case 22:
                return AbstractC7738.m13040(Integer.valueOf(((C9099) obj).getDownloadCount()), Integer.valueOf(((C9099) obj2).getDownloadCount()));
            default:
                return AbstractC7738.m13040(Integer.valueOf(((C9099) obj2).getDownloadCount()), Integer.valueOf(((C9099) obj).getDownloadCount()));
        }
    }
}
