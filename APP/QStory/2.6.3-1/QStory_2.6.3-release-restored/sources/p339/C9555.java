package p339;

import android.app.Activity;
import androidx.compose.animation.C1272;
import androidx.compose.p001ui.semantics.C2769;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import io.ktor.util.C5043;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p233.AbstractC8798;
import p273.C9069;
import p337.AbstractC9520;
import p337.C9517;
import p337.C9523;
import p337.C9525;
import p340.C9566;
import p340.C9568;
import top.suzhelan.qstory.p015ui.views.CustomRecycleView;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public CustomRecycleView f24936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public DialogXRecycleView f24937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9566 f24938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9568 f24939 = new C9568();

    static {
        "stickerScrollPosition";
        "stickerScrollOffset";
        "dirScrollPosition";
        "dirScrollOffset";
    }

    public C9555() {
        C9566 c9566 = new C9566();
        C9517.f24851.getClass();
        c9566.f24975 = C9517.m14971();
        this.f24938 = c9566;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14991() {
        C9517 c9517 = C9517.f24851;
        String strM14531 = "stickerScrollPosition";
        String strM14532 = "-1";
        c9517.getClass();
        C9517.m14974(strM14531, strM14532);
        C9517.m14974("stickerScrollOffset", "0");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14992(String str) {
        Collection collectionM9337;
        C9517.f24851.getClass();
        "stickerDirName";
        File[] fileArrListFiles = new File(C9517.m14969(), str).listFiles();
        if (fileArrListFiles == null) {
            collectionM9337 = EmptyList.INSTANCE;
        } else {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    "getName(...)";
                    name.getClass();
                    if (!name.endsWith(".bak") && !AbstractC5227.m9466(file.getName(), "config.json")) {
                        arrayList.add(file);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
            for (File file2 : arrayList) {
                String absolutePath = file2.getAbsolutePath();
                "getAbsolutePath(...)";
                absolutePath.getClass();
                String name2 = file2.getName();
                "getName(...)";
                name2.getClass();
                long jLastModified = file2.lastModified();
                "path";
                "name";
                "md5";
                "url";
                C9523 c9523 = new C9523();
                c9523.f24861 = absolutePath;
                c9523.f24860 = name2;
                c9523.f24859 = "";
                c9523.f24858 = "";
                c9523.f24857 = jLastModified;
                arrayList2.add(c9523);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            C9525.f24862.getClass();
            int i = AbstractC9520.f24854[C9525.m14978().ordinal()];
            int i2 = 5;
            int i3 = 4;
            if (i == 1) {
                C5174 c5174M9346 = AbstractC5176.m9346(C9517.m14970());
                int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(c5174M9346, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331 >= 16 ? iM9331 : 16);
                Iterator it = c5174M9346.iterator();
                while (true) {
                    C5170 c5170 = (C5170) it;
                    if (!c5170.f13264.hasNext()) {
                        break;
                    }
                    C5173 c5173 = (C5173) c5170.next();
                    Pair pair = new Pair(c5173.f13268, Integer.valueOf(c5173.f13269));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                collectionM9337 = AbstractC5176.m9337(arrayList3, new C2769(new C2769(new C2769(linkedHashMap, i3), 6), i2));
            } else if (i == 2) {
                collectionM9337 = AbstractC5176.m9337(arrayList3, new C1272(14));
            } else if (i == 3) {
                collectionM9337 = AbstractC5176.m9337(arrayList3, new C1272(i));
            } else if (i == 4) {
                collectionM9337 = AbstractC5176.m9337(arrayList3, new C1272(15));
            } else {
                if (i != 5) {
                    C5043.m9170();
                    return;
                }
                collectionM9337 = AbstractC5176.m9337(arrayList3, new C1272(17));
            }
        }
        AbstractC8798.m14017(this.f24939, AbstractC5176.m9345(collectionM9337));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14993() {
        m14994();
        Activity activityM7213 = AbstractC3887.m7213();
        if (activityM7213 == null) {
            return;
        }
        AbstractC3888.m7247(activityM7213);
        int i = (int) (((double) activityM7213.getResources().getDisplayMetrics().heightPixels) * 0.8d);
        C9069 c9069M14318 = C9069.m14318();
        c9069M14318.m14320(new C9537(this, 0));
        c9069M14318.f11935 = i;
        c9069M14318.m14322();
        c9069M14318.f11934 = i;
        c9069M14318.m14322();
        c9069M14318.f23117 = false;
        c9069M14318.f23109 = new C9536(this);
        c9069M14318.m14322();
        c9069M14318.m14319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14994() {
        C9517 c9517 = C9517.f24851;
        c9517.getClass();
        String strM14971 = C9517.m14971();
        if (strM14971.length() == 0) {
            c9517.getClass();
            List listM14975 = C9517.m14975();
            if (listM14975.isEmpty()) {
                return;
            }
            String str = (String) listM14975.get(0);
            "dirName";
            str.getClass();
            C9517.m14973().m15236(str, "currentSelection");
            m14991();
            m14992(str);
            return;
        }
        if (new File(C9517.m14969(), strM14971).exists()) {
            m14992(strM14971);
            return;
        }
        c9517.getClass();
        List listM149752 = C9517.m14975();
        if (listM149752.isEmpty()) {
            return;
        }
        String str2 = (String) listM149752.get(0);
        "dirName";
        str2.getClass();
        C9517.m14973().m15236(str2, "currentSelection");
        m14991();
        m14992(str2);
    }
}
