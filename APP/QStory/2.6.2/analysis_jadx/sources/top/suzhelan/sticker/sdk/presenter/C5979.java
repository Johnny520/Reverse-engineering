package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.load.engine.C3004;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p095.C7206;
import p095.ExecutorC7207;
import p325.C8762;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f16292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5350 f16293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5807 f16294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3004 f16296;

    public C5979(C3004 c3004) {
        this.f16296 = c3004;
        C5807 c5807 = new C5807(this);
        this.f16294 = c5807;
        C7206 c7206 = AbstractC5394.f15030;
        this.f16293 = AbstractC5398.m10485(ExecutorC7207.f19230.plus(c5807));
        this.f16292 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11300(C5979 c5979, File file) {
        c5979.getClass();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length == 1 && fileArrListFiles[0].isDirectory()) {
            File file2 = fileArrListFiles[0];
            File file3 = new File(file.getParent(), AbstractC0053.m136(file.getName(), "_temp"));
            file2.renameTo(file3);
            file.delete();
            file3.renameTo(file);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m11301(C5979 c5979, List list, String str) {
        String description;
        String nickname;
        String uin;
        String author;
        c5979.getClass();
        if (str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
            if (!AbstractC5143.m10171(onlineStickerInfo.getTitle(), str, false) && (((description = onlineStickerInfo.getDescription()) == null || !AbstractC5143.m10171(description, str, false)) && (((nickname = onlineStickerInfo.getNickname()) == null || !AbstractC5143.m10171(nickname, str, false)) && (((uin = onlineStickerInfo.getUin()) == null || !AbstractC5143.m10171(uin, str, false)) && ((author = onlineStickerInfo.getAuthor()) == null || !AbstractC5143.m10171(author, str, false)))))) {
                List<String> tags = onlineStickerInfo.getTags();
                if (tags == null || !tags.isEmpty()) {
                    Iterator<T> it = tags.iterator();
                    while (it.hasNext()) {
                        if (AbstractC5143.m10171((String) it.next(), str, false)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11302() {
        AbstractC5398.m10473(this.f16293, null, null, new StickerPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11303(String str, String str2, String str3, InterfaceC6557 interfaceC6557) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        AbstractC5398.m10473(this.f16293, null, null, new StickerPresenter$getStickers$1(str, str2, this, str3, interfaceC6557, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11304(OnlineStickerInfo onlineStickerInfo, String str, C8762 c8762) {
        onlineStickerInfo.getClass();
        str.getClass();
        C7206 c7206 = AbstractC5394.f15030;
        AbstractC5398.m10473(this.f16293, ExecutorC7207.f19230.plus(this.f16294), null, new StickerPresenter$downloadAndInstall$1(str, onlineStickerInfo, this, c8762, null), 2);
    }
}
