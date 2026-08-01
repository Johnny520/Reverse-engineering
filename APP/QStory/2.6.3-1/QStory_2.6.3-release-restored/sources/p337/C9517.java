package p337;

import androidx.compose.animation.C1272;
import com.google.gson.C4085;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import p026.AbstractC7014;
import p407.C9924;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9517 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4085 f24850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9517 f24851;

    static {
        "表情面板";
        "currentSelection";
        "recentUsedStickers";
        f24851 = new C9517();
        f24850 = new C4085();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14968(String str) {
        "stickerPath";
        if (AbstractC5976.m10731(str)) {
            return;
        }
        ArrayList arrayListM9345 = AbstractC5176.m9345(m14970());
        arrayListM9345.remove(str);
        arrayListM9345.add(0, str);
        if (arrayListM9345.size() > 200) {
            arrayListM9345.subList(200, arrayListM9345.size()).clear();
        }
        String strM14531 = "recentUsedStickers";
        String strM7897 = f24850.m7897(arrayListM9345);
        "toJson(...)";
        strM7897.getClass();
        m14974(strM14531, strM7897);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14969() {
        return AbstractC4765.m8874().concat("/Pic");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m14970() {
        String strM14972 = m14972("recentUsedStickers", "");
        if (AbstractC5976.m10731(strM14972)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f24850.m7900(strM14972, new C9519().f23159);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14971() {
        return m14973().m15237("currentSelection", "");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m14972(String str, String str2) {
        "key";
        "defaultValue";
        str2.getClass();
        return m14973().m15237(str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9924 m14973() {
        return new C9924("表情面板", 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m14974(String str, String str2) {
        "key";
        "value";
        str2.getClass();
        m14973().m15236(str2, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static List m14975() {
        File file = new File(m14969());
        if (!file.exists() && file.mkdirs()) {
            AbstractC7014.m12151("创建表情文件夹成功");
        }
        String[] list = file.list(new C9521());
        ArrayList arrayList = list != null ? new ArrayList(AbstractC5179.m9405(list)) : new ArrayList();
        C9525.f24862.getClass();
        String strM14531 = "dirSortMode";
        String key = StickerPanelSettingsConfig$SortMode.NAME_ASC.getKey();
        f24851.getClass();
        String strM14972 = m14972(strM14531, key);
        StickerPanelSettingsConfig$SortMode.Companion.getClass();
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14976 = C9524.m14976(strM14972);
        File file2 = new File(m14969());
        int i = AbstractC9520.f24854[stickerPanelSettingsConfig$SortModeM14976.ordinal()];
        int i2 = 1;
        if (i == 1) {
            return AbstractC5176.m9337(arrayList, new C1272(11));
        }
        if (i == 2) {
            return AbstractC5176.m9337(arrayList, new C1272(12));
        }
        if (i == 3) {
            return AbstractC5176.m9337(arrayList, new C1272(13));
        }
        if (i == 4) {
            return AbstractC5176.m9337(arrayList, new C9518(file2, 0));
        }
        if (i == 5) {
            return AbstractC5176.m9337(arrayList, new C9518(file2, i2));
        }
        C5043.m9170();
        return null;
    }
}
