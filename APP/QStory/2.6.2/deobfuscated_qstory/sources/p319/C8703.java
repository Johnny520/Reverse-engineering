package p319;

import android.app.Activity;
import androidx.compose.animation.C0426;
import androidx.compose.ui.semantics.C1934;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4210;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p175.AbstractC7738;
import p217.AbstractC7968;
import p257.C8239;
import p323.C8734;
import p323.C8736;
import p324.AbstractC8741;
import p324.C8738;
import p324.C8744;
import p324.C8746;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8703 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public CustomRecycleView f24541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public DialogXRecycleView f24542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8734 f24543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8736 f24544 = new C8736();

    static {
        "stickerScrollPosition";
        "stickerScrollOffset";
        "dirScrollPosition";
        "dirScrollOffset";
    }

    public C8703() {
        C8734 c8734 = new C8734();
        C8738.f24639.getClass();
        c8734.f24628 = C8738.m14407();
        this.f24543 = c8734;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14384() {
        C8738 c8738 = C8738.f24639;
        String strM6668 = "stickerScrollPosition";
        String strM66682 = "-1";
        c8738.getClass();
        C8738.m14410(strM6668, strM66682);
        C8738.m14410("stickerScrollOffset", "0");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14385(String str) {
        Collection collectionM8817;
        C8738.f24639.getClass();
        "stickerDirName";
        File[] fileArrListFiles = new File(C8738.m14405(), str).listFiles();
        if (fileArrListFiles == null) {
            collectionM8817 = EmptyList.INSTANCE;
        } else {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    "getName(...)";
                    name.getClass();
                    if (!name.endsWith(".bak") && !AbstractC4394.m8917(file.getName(), "config.json")) {
                        arrayList.add(file);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
            for (File file2 : arrayList) {
                String absolutePath = file2.getAbsolutePath();
                "getAbsolutePath(...)";
                absolutePath.getClass();
                String name2 = file2.getName();
                "getName(...)";
                name2.getClass();
                long jLastModified = file2.lastModified();
                String strM6668 = "";
                String strM66682 = "";
                "path";
                "name";
                "md5";
                "url";
                C8744 c8744 = new C8744();
                c8744.f24649 = absolutePath;
                c8744.f24648 = name2;
                c8744.f24647 = strM6668;
                c8744.f24646 = strM66682;
                c8744.f24645 = jLastModified;
                arrayList2.add(c8744);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            C8746.f24650.getClass();
            int i = AbstractC8741.f24642[C8746.m14414().ordinal()];
            int i2 = 5;
            int i3 = 4;
            if (i == 1) {
                C4341 c4341M8796 = AbstractC4343.m8796(C8738.m14406());
                int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(c4341M8796, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779 >= 16 ? iM8779 : 16);
                Iterator it = c4341M8796.iterator();
                while (true) {
                    C4337 c4337 = (C4337) it;
                    if (!c4337.f12915.hasNext()) {
                        break;
                    }
                    C4340 c4340 = (C4340) c4337.next();
                    Pair pair = new Pair(c4340.f12919, Integer.valueOf(c4340.f12920));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                collectionM8817 = AbstractC4343.m8817(arrayList3, new C1934(new C1934(new C1934(linkedHashMap, i3), 6), i2));
            } else if (i == 2) {
                collectionM8817 = AbstractC4343.m8817(arrayList3, new C0426(14));
            } else if (i == 3) {
                collectionM8817 = AbstractC4343.m8817(arrayList3, new C0426(i));
            } else if (i == 4) {
                collectionM8817 = AbstractC4343.m8817(arrayList3, new C0426(15));
            } else {
                if (i != 5) {
                    C4210.m8621();
                    return;
                }
                collectionM8817 = AbstractC4343.m8817(arrayList3, new C0426(17));
            }
        }
        AbstractC7968.m13430(this.f24544, AbstractC4343.m8799(collectionM8817));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14386() {
        m14387();
        Activity activityM13031 = AbstractC7738.m13031();
        if (activityM13031 == null) {
            return;
        }
        AbstractC3065.m6858(activityM13031);
        int i = (int) (((double) activityM13031.getResources().getDisplayMetrics().heightPixels) * 0.8d);
        C8239 c8239M13743 = C8239.m13743();
        C8685 c8685 = new C8685(this, 0);
        c8239M13743.f22768 = c8685;
        if (c8239M13743.f11579) {
            c8685.mo8079(c8239M13743.f22767);
        }
        c8239M13743.f11585 = i;
        c8239M13743.m13746();
        c8239M13743.f11584 = i;
        c8239M13743.m13746();
        c8239M13743.f22773 = false;
        c8239M13743.f22765 = new C8684(this);
        c8239M13743.m13746();
        c8239M13743.m13744();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14387() {
        C8738 c8738 = C8738.f24639;
        c8738.getClass();
        String strM14407 = C8738.m14407();
        if (strM14407.length() == 0) {
            c8738.getClass();
            List listM14411 = C8738.m14411();
            if (listM14411.isEmpty()) {
                return;
            }
            String str = (String) listM14411.get(0);
            "dirName";
            str.getClass();
            C8738.m14409().m14640(str, "currentSelection");
            m14384();
            m14385(str);
            return;
        }
        if (new File(C8738.m14405(), strM14407).exists()) {
            m14385(strM14407);
            return;
        }
        c8738.getClass();
        List listM144112 = C8738.m14411();
        if (listM144112.isEmpty()) {
            return;
        }
        String str2 = (String) listM144112.get(0);
        "dirName";
        str2.getClass();
        C8738.m14409().m14640(str2, "currentSelection");
        m14384();
        m14385(str2);
    }
}
