package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.load.engine.C3837;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;
import p111.C8036;
import p111.ExecutorC8037;
import p345.C9599;
import top.suzhelan.plugin.sdk.online.presenter.C6638;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6815 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f16646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6183 f16647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6638 f16648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3837 f16650;

    public C6815(C3837 c3837) {
        this.f16650 = c3837;
        C6638 c6638 = new C6638(this);
        this.f16648 = c6638;
        C8036 c8036 = AbstractC6227.f15375;
        this.f16647 = AbstractC6231.m11048(ExecutorC8037.f19570.plus(c6638));
        this.f16646 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11919(C6815 c6815, File file) {
        c6815.getClass();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length == 1 && fileArrListFiles[0].isDirectory()) {
            File file2 = fileArrListFiles[0];
            File file3 = new File(file.getParent(), AbstractC0900.m696(file.getName(), "_temp"));
            file2.renameTo(file3);
            file.delete();
            file3.renameTo(file);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m11920(C6815 c6815, List list, String str) {
        String description;
        String nickname;
        String uin;
        String author;
        c6815.getClass();
        if (str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
            if (!AbstractC5976.m10735(onlineStickerInfo.getTitle(), str, false) && (((description = onlineStickerInfo.getDescription()) == null || !AbstractC5976.m10735(description, str, false)) && (((nickname = onlineStickerInfo.getNickname()) == null || !AbstractC5976.m10735(nickname, str, false)) && (((uin = onlineStickerInfo.getUin()) == null || !AbstractC5976.m10735(uin, str, false)) && ((author = onlineStickerInfo.getAuthor()) == null || !AbstractC5976.m10735(author, str, false)))))) {
                List<String> tags = onlineStickerInfo.getTags();
                if (tags == null || !tags.isEmpty()) {
                    Iterator<T> it = tags.iterator();
                    while (it.hasNext()) {
                        if (AbstractC5976.m10735((String) it.next(), str, false)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11921() {
        AbstractC6231.m11036(this.f16647, null, null, new StickerPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11922(String str, String str2, String str3, InterfaceC7387 interfaceC7387) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        AbstractC6231.m11036(this.f16647, null, null, new StickerPresenter$getStickers$1(str, str2, this, str3, interfaceC7387, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11923(OnlineStickerInfo onlineStickerInfo, String str, C9599 c9599) {
        onlineStickerInfo.getClass();
        str.getClass();
        C8036 c8036 = AbstractC6227.f15375;
        AbstractC6231.m11036(this.f16647, ExecutorC8037.f19570.plus(this.f16648), null, new StickerPresenter$downloadAndInstall$1(str, onlineStickerInfo, this, c9599, null), 2);
    }
}
