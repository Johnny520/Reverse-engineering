package androidx.compose.animation;

import android.view.View;
import androidx.core.view.AbstractC3103;
import com.bumptech.glide.AbstractC3888;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.luckypray.dexkit.result.C6554;
import org.luckypray.dexkit.result.C6557;
import org.luckypray.dexkit.result.C6558;
import p166.C8408;
import p222.C8738;
import p303.AbstractC9234;
import p337.C9523;
import p401.C9895;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1272 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1733;

    public /* synthetic */ C1272(int i) {
        this.f1733 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1733) {
            case 0:
                ((AbstractC1287) obj).getClass();
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
                return AbstractC3888.m7277(numValueOf, Integer.valueOf(i3));
            case 5:
                return AbstractC3888.m7277(((C6554) obj).f16034, ((C6554) obj2).f16034);
            case 6:
                return AbstractC3888.m7277(((C6557) obj).f16046, ((C6557) obj2).f16046);
            case 7:
                return AbstractC3888.m7277(((C6558) obj).f16051, ((C6558) obj2).f16051);
            case 8:
                return ((C8408) obj).f20857 - ((C8408) obj2).f20857;
            case 9:
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 10:
                return ((C8738) obj).f22235 - ((C8738) obj2).f22235;
            case 11:
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) obj).toLowerCase(locale);
                AbstractC9234.m14531(1322);
                lowerCase.getClass();
                String lowerCase2 = ((String) obj2).toLowerCase(locale);
                AbstractC9234.m14531(1322);
                lowerCase2.getClass();
                return AbstractC3888.m7277(lowerCase, lowerCase2);
            case 12:
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = ((String) obj).toLowerCase(locale2);
                AbstractC9234.m14531(1322);
                lowerCase3.getClass();
                String lowerCase4 = ((String) obj2).toLowerCase(locale2);
                AbstractC9234.m14531(1322);
                lowerCase4.getClass();
                return AbstractC3888.m7277(lowerCase3, lowerCase4);
            case 13:
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = ((String) obj2).toLowerCase(locale3);
                AbstractC9234.m14531(1322);
                lowerCase5.getClass();
                String lowerCase6 = ((String) obj).toLowerCase(locale3);
                AbstractC9234.m14531(1322);
                lowerCase6.getClass();
                return AbstractC3888.m7277(lowerCase5, lowerCase6);
            case 14:
                String str3 = ((C9523) obj).f24860;
                Locale locale4 = Locale.ROOT;
                String lowerCase7 = str3.toLowerCase(locale4);
                AbstractC9234.m14531(1322);
                lowerCase7.getClass();
                String lowerCase8 = ((C9523) obj2).f24860.toLowerCase(locale4);
                AbstractC9234.m14531(1322);
                lowerCase8.getClass();
                return AbstractC3888.m7277(lowerCase7, lowerCase8);
            case 15:
                return AbstractC3888.m7277(Long.valueOf(((C9523) obj).f24857), Long.valueOf(((C9523) obj2).f24857));
            case 16:
                String str4 = ((C9523) obj2).f24860;
                Locale locale5 = Locale.ROOT;
                String lowerCase9 = str4.toLowerCase(locale5);
                AbstractC9234.m14531(1322);
                lowerCase9.getClass();
                String lowerCase10 = ((C9523) obj).f24860.toLowerCase(locale5);
                AbstractC9234.m14531(1322);
                lowerCase10.getClass();
                return AbstractC3888.m7277(lowerCase9, lowerCase10);
            case 17:
                return AbstractC3888.m7277(Long.valueOf(((C9523) obj2).f24857), Long.valueOf(((C9523) obj).f24857));
            case 18:
                return AbstractC3888.m7277(((File) obj).getName(), ((File) obj2).getName());
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
                return AbstractC3888.m7277(lowerCase11, lowerCase12);
            case 20:
                return AbstractC3888.m7277(Integer.valueOf(((C9895) obj).getDownloadCount()), Integer.valueOf(((C9895) obj2).getDownloadCount()));
            case 21:
                return AbstractC3888.m7277(Integer.valueOf(((C9895) obj2).getDownloadCount()), Integer.valueOf(((C9895) obj).getDownloadCount()));
            case 22:
                return AbstractC3888.m7277(Integer.valueOf(((C9895) obj).getDownloadCount()), Integer.valueOf(((C9895) obj2).getDownloadCount()));
            default:
                return AbstractC3888.m7277(Integer.valueOf(((C9895) obj2).getDownloadCount()), Integer.valueOf(((C9895) obj).getDownloadCount()));
        }
    }
}
