package p321;

import androidx.compose.animation.C0426;
import com.google.gson.C3253;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5144;
import p010.AbstractC6185;
import p287.AbstractC8405;
import p391.C9095;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3253 f24505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8688 f24506;

    static {
        AbstractC8405.m13972(2673);
        AbstractC8405.m13972(2666);
        AbstractC8405.m13972(2671);
        f24506 = new C8688();
        f24505 = new C3253();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14409(String str) {
        AbstractC8405.m13972(2670);
        if (AbstractC5144.m10172(str)) {
            return;
        }
        ArrayList arrayListM8786 = AbstractC4344.m8786(m14411());
        arrayListM8786.remove(str);
        arrayListM8786.add(0, str);
        if (arrayListM8786.size() > 200) {
            arrayListM8786.subList(200, arrayListM8786.size()).clear();
        }
        String strM13972 = AbstractC8405.m13972(2671);
        String strM7338 = f24505.m7338(arrayListM8786);
        AbstractC8405.m13972(2539);
        strM7338.getClass();
        m14415(strM13972, strM7338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14410() {
        return AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜喵呜呜"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m14411() {
        String strM14413 = m14413(AbstractC8405.m13972(2671), "");
        if (AbstractC5144.m10172(strM14413)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f24505.m7341(strM14413, new C8690().f22814);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14412() {
        return m14414().m14678(AbstractC8405.m13972(2666), "");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m14413(String str, String str2) {
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13972(2672);
        str2.getClass();
        return m14414().m14678(str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9095 m14414() {
        return new C9095(AbstractC8405.m13972(2673), 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m14415(String str, String str2) {
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        str2.getClass();
        m14414().m14677(str2, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static List m14416() {
        File file = new File(m14410());
        if (!file.exists() && file.mkdirs()) {
            AbstractC6185.m11592(AbstractC8405.m13972(2667));
        }
        String[] list = file.list(new C8692());
        ArrayList arrayList = list != null ? new ArrayList(AbstractC4347.m8846(list)) : new ArrayList();
        C8696.f24517.getClass();
        String strM13972 = AbstractC8405.m13972(2703);
        String key = StickerPanelSettingsConfig$SortMode.NAME_ASC.getKey();
        f24506.getClass();
        String strM14413 = m14413(strM13972, key);
        StickerPanelSettingsConfig$SortMode.Companion.getClass();
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14417 = C8695.m14417(strM14413);
        File file2 = new File(m14410());
        int i = AbstractC8691.f24509[stickerPanelSettingsConfig$SortModeM14417.ordinal()];
        int i2 = 1;
        if (i == 1) {
            return AbstractC4344.m8778(arrayList, new C0426(11));
        }
        if (i == 2) {
            return AbstractC4344.m8778(arrayList, new C0426(12));
        }
        if (i == 3) {
            return AbstractC4344.m8778(arrayList, new C0426(13));
        }
        if (i == 4) {
            return AbstractC4344.m8778(arrayList, new C8689(file2, 0));
        }
        if (i == 5) {
            return AbstractC4344.m8778(arrayList, new C8689(file2, i2));
        }
        C4211.m8611();
        return null;
    }
}
