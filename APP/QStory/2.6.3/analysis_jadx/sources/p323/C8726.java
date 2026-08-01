package p323;

import android.app.Activity;
import androidx.compose.animation.C0426;
import androidx.compose.ui.semantics.C1934;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4211;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p217.AbstractC7969;
import p257.C8240;
import p287.AbstractC8405;
import p321.AbstractC8691;
import p321.C8688;
import p321.C8694;
import p321.C8696;
import p324.C8737;
import p324.C8739;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public CustomRecycleView f24591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public DialogXRecycleView f24592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8737 f24593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8739 f24594 = new C8739();

    static {
        AbstractC8405.m13972(2722);
        AbstractC8405.m13972(2723);
        AbstractC8405.m13972(2724);
        AbstractC8405.m13972(2725);
    }

    public C8726() {
        C8737 c8737 = new C8737();
        C8688.f24506.getClass();
        c8737.f24630 = C8688.m14412();
        this.f24593 = c8737;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14432() {
        C8688 c8688 = C8688.f24506;
        String strM13972 = AbstractC8405.m13972(2722);
        String strM13973 = AbstractC8405.m13973("喵呜喵呜呜呜呜喵~喵呜喵喵喵呜喵喵");
        c8688.getClass();
        C8688.m14415(strM13972, strM13973);
        C8688.m14415(AbstractC8405.m13972(2723), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14433(String str) {
        Collection collectionM8778;
        C8688.f24506.getClass();
        AbstractC8405.m13972(2668);
        File[] fileArrListFiles = new File(C8688.m14410(), str).listFiles();
        if (fileArrListFiles == null) {
            collectionM8778 = EmptyList.INSTANCE;
        } else {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    AbstractC8405.m13972(1820);
                    name.getClass();
                    if (!name.endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵呜呜")) && !AbstractC4395.m8907(file.getName(), AbstractC8405.m13972(2669))) {
                        arrayList.add(file);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
            for (File file2 : arrayList) {
                String absolutePath = file2.getAbsolutePath();
                AbstractC8405.m13972(2114);
                absolutePath.getClass();
                String name2 = file2.getName();
                AbstractC8405.m13972(1820);
                name2.getClass();
                long jLastModified = file2.lastModified();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵");
                AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
                AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵喵呜呜呜呜");
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵");
                C8694 c8694 = new C8694();
                c8694.f24516 = absolutePath;
                c8694.f24515 = name2;
                c8694.f24514 = "";
                c8694.f24513 = "";
                c8694.f24512 = jLastModified;
                arrayList2.add(c8694);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            C8696.f24517.getClass();
            int i = AbstractC8691.f24509[C8696.m14419().ordinal()];
            int i2 = 5;
            int i3 = 4;
            if (i == 1) {
                C4342 c4342M8787 = AbstractC4344.m8787(C8688.m14411());
                int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(c4342M8787, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772 >= 16 ? iM8772 : 16);
                Iterator it = c4342M8787.iterator();
                while (true) {
                    C4338 c4338 = (C4338) it;
                    if (!c4338.f12919.hasNext()) {
                        break;
                    }
                    C4341 c4341 = (C4341) c4338.next();
                    Pair pair = new Pair(c4341.f12923, Integer.valueOf(c4341.f12924));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                collectionM8778 = AbstractC4344.m8778(arrayList3, new C1934(new C1934(new C1934(linkedHashMap, i3), 6), i2));
            } else if (i == 2) {
                collectionM8778 = AbstractC4344.m8778(arrayList3, new C0426(14));
            } else if (i == 3) {
                collectionM8778 = AbstractC4344.m8778(arrayList3, new C0426(i));
            } else if (i == 4) {
                collectionM8778 = AbstractC4344.m8778(arrayList3, new C0426(15));
            } else {
                if (i != 5) {
                    C4211.m8611();
                    return;
                }
                collectionM8778 = AbstractC4344.m8778(arrayList3, new C0426(17));
            }
        }
        AbstractC7969.m13458(this.f24594, AbstractC4344.m8786(collectionM8778));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14434() {
        m14435();
        Activity activityM6653 = AbstractC3055.m6653();
        if (activityM6653 == null) {
            return;
        }
        AbstractC3056.m6687(activityM6653);
        int i = (int) (((double) activityM6653.getResources().getDisplayMetrics().heightPixels) * 0.8d);
        C8240 c8240M13759 = C8240.m13759();
        c8240M13759.m13761(new C8708(this, 0));
        c8240M13759.f11590 = i;
        c8240M13759.m13763();
        c8240M13759.f11589 = i;
        c8240M13759.m13763();
        c8240M13759.f22772 = false;
        c8240M13759.f22764 = new C8707(this);
        c8240M13759.m13763();
        c8240M13759.m13760();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14435() {
        C8688 c8688 = C8688.f24506;
        c8688.getClass();
        String strM14412 = C8688.m14412();
        if (strM14412.length() == 0) {
            c8688.getClass();
            List listM14416 = C8688.m14416();
            if (listM14416.isEmpty()) {
                return;
            }
            String str = (String) listM14416.get(0);
            AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
            str.getClass();
            C8688.m14414().m14677(str, AbstractC8405.m13972(2666));
            m14432();
            m14433(str);
            return;
        }
        if (new File(C8688.m14410(), strM14412).exists()) {
            m14433(strM14412);
            return;
        }
        c8688.getClass();
        List listM144162 = C8688.m14416();
        if (listM144162.isEmpty()) {
            return;
        }
        String str2 = (String) listM144162.get(0);
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
        str2.getClass();
        C8688.m14414().m14677(str2, AbstractC8405.m13972(2666));
        m14432();
        m14433(str2);
    }
}
