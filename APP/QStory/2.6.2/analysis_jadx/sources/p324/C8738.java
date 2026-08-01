package p324;

import androidx.compose.animation.C0426;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3252;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5143;
import p010.AbstractC6154;
import p391.C9114;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3252 f24638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8738 f24639;

    static {
        AbstractC3056.m6668(-3937817478110119335L);
        AbstractC3056.m6668(-3937817984916260263L);
        AbstractC3056.m6668(-3937817615549072807L);
        f24639 = new C8738();
        f24638 = new C3252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14404(String str) {
        AbstractC3056.m6668(-3937817735808157095L);
        if (AbstractC5143.m10164(str)) {
            return;
        }
        ArrayList arrayListM8799 = AbstractC4343.m8799(m14406());
        arrayListM8799.remove(str);
        arrayListM8799.add(0, str);
        if (arrayListM8799.size() > 200) {
            arrayListM8799.subList(200, arrayListM8799.size()).clear();
        }
        String strM6668 = AbstractC3056.m6668(-3937817615549072807L);
        String strM7351 = f24638.m7351(arrayListM8799);
        AbstractC3056.m6668(-3937811057134011815L);
        strM7351.getClass();
        m14410(strM6668, strM7351);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14405() {
        return AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937817963441423783L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m14406() {
        String strM14408 = m14408(AbstractC3056.m6668(-3937817615549072807L), AbstractC3056.m6668(-3937561979095614887L));
        if (AbstractC5143.m10164(strM14408)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f24638.m7354(strM14408, new C8740().f22815);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14407() {
        return m14409().m14641(AbstractC3056.m6668(-3937817984916260263L), AbstractC3056.m6668(-3937561979095614887L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m14408(String str, String str2) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937817594074236327L);
        str2.getClass();
        return m14409().m14641(str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9114 m14409() {
        return new C9114(AbstractC3056.m6668(-3937817478110119335L), 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m14410(String str, String str2) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937685966211515815L);
        str2.getClass();
        m14409().m14640(str2, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static List m14411() {
        File file = new File(m14405());
        if (!file.exists() && file.mkdirs()) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937817817412535719L));
        }
        String[] list = file.list(new C8742());
        ArrayList arrayList = list != null ? new ArrayList(AbstractC4346.m8850(list)) : new ArrayList();
        C8746.f24650.getClass();
        String strM6668 = AbstractC3056.m6668(-3937832738128922023L);
        String key = StickerPanelSettingsConfig$SortMode.NAME_ASC.getKey();
        f24639.getClass();
        String strM14408 = m14408(strM6668, key);
        StickerPanelSettingsConfig$SortMode.Companion.getClass();
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortModeM14412 = C8745.m14412(strM14408);
        File file2 = new File(m14405());
        int i = AbstractC8741.f24642[stickerPanelSettingsConfig$SortModeM14412.ordinal()];
        int i2 = 1;
        if (i == 1) {
            return AbstractC4343.m8817(arrayList, new C0426(11));
        }
        if (i == 2) {
            return AbstractC4343.m8817(arrayList, new C0426(12));
        }
        if (i == 3) {
            return AbstractC4343.m8817(arrayList, new C0426(13));
        }
        if (i == 4) {
            return AbstractC4343.m8817(arrayList, new C8739(file2, 0));
        }
        if (i == 5) {
            return AbstractC4343.m8817(arrayList, new C8739(file2, i2));
        }
        C4210.m8621();
        return null;
    }
}
