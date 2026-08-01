package androidx.compose.animation;

import android.view.View;
import androidx.core.view.AbstractC2270;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.luckypray.dexkit.result.C5724;
import org.luckypray.dexkit.result.C5727;
import org.luckypray.dexkit.result.C5728;
import p150.C7579;
import p206.C7909;
import p287.AbstractC8405;
import p321.C8694;
import p385.C9066;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
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
                return AbstractC3056.m6717(numValueOf, Integer.valueOf(i3));
            case 5:
                return AbstractC3056.m6717(((C5724) obj).f15689, ((C5724) obj2).f15689);
            case 6:
                return AbstractC3056.m6717(((C5727) obj).f15701, ((C5727) obj2).f15701);
            case 7:
                return AbstractC3056.m6717(((C5728) obj).f15706, ((C5728) obj2).f15706);
            case 8:
                return ((C7579) obj).f20512 - ((C7579) obj2).f20512;
            case 9:
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 10:
                return ((C7909) obj).f21890 - ((C7909) obj2).f21890;
            case 11:
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) obj).toLowerCase(locale);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase.getClass();
                String lowerCase2 = ((String) obj2).toLowerCase(locale);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase2.getClass();
                return AbstractC3056.m6717(lowerCase, lowerCase2);
            case 12:
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = ((String) obj).toLowerCase(locale2);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase3.getClass();
                String lowerCase4 = ((String) obj2).toLowerCase(locale2);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase4.getClass();
                return AbstractC3056.m6717(lowerCase3, lowerCase4);
            case 13:
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = ((String) obj2).toLowerCase(locale3);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase5.getClass();
                String lowerCase6 = ((String) obj).toLowerCase(locale3);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase6.getClass();
                return AbstractC3056.m6717(lowerCase5, lowerCase6);
            case 14:
                String str3 = ((C8694) obj).f24515;
                Locale locale4 = Locale.ROOT;
                String lowerCase7 = str3.toLowerCase(locale4);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase7.getClass();
                String lowerCase8 = ((C8694) obj2).f24515.toLowerCase(locale4);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase8.getClass();
                return AbstractC3056.m6717(lowerCase7, lowerCase8);
            case 15:
                return AbstractC3056.m6717(Long.valueOf(((C8694) obj).f24512), Long.valueOf(((C8694) obj2).f24512));
            case 16:
                String str4 = ((C8694) obj2).f24515;
                Locale locale5 = Locale.ROOT;
                String lowerCase9 = str4.toLowerCase(locale5);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase9.getClass();
                String lowerCase10 = ((C8694) obj).f24515.toLowerCase(locale5);
                AbstractC8405.m13972(1322); /* decoded: m13972(1322)=toLowerCase(...) */
                lowerCase10.getClass();
                return AbstractC3056.m6717(lowerCase9, lowerCase10);
            case 17:
                return AbstractC3056.m6717(Long.valueOf(((C8694) obj2).f24512), Long.valueOf(((C8694) obj).f24512));
            case 18:
                return AbstractC3056.m6717(((File) obj).getName(), ((File) obj2).getName());
            case 19:
                String name = ((File) obj).getName();
                name.getClass();
                Locale locale6 = Locale.ROOT;
                String lowerCase11 = name.toLowerCase(locale6);
                lowerCase11.getClass();
                String name2 = ((File) obj2).getName();
                name2.getClass();
                String lowerCase12 = name2.toLowerCase(locale6);
                lowerCase12.getClass();
                return AbstractC3056.m6717(lowerCase11, lowerCase12);
            case 20:
                return AbstractC3056.m6717(Integer.valueOf(((C9066) obj).getDownloadCount()), Integer.valueOf(((C9066) obj2).getDownloadCount()));
            case 21:
                return AbstractC3056.m6717(Integer.valueOf(((C9066) obj2).getDownloadCount()), Integer.valueOf(((C9066) obj).getDownloadCount()));
            case 22:
                return AbstractC3056.m6717(Integer.valueOf(((C9066) obj).getDownloadCount()), Integer.valueOf(((C9066) obj2).getDownloadCount()));
            default:
                return AbstractC3056.m6717(Integer.valueOf(((C9066) obj2).getDownloadCount()), Integer.valueOf(((C9066) obj).getDownloadCount()));
        }
    }
}
