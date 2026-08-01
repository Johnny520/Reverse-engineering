package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.load.engine.C3005;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p095.C7207;
import p095.ExecutorC7208;
import p329.C8770;
import top.suzhelan.plugin.sdk.online.presenter.C5808;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f16301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5351 f16302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5808 f16303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3005 f16305;

    public C5985(C3005 c3005) {
        this.f16305 = c3005;
        C5808 c5808 = new C5808(this);
        this.f16303 = c5808;
        C7207 c7207 = AbstractC5395.f15030;
        this.f16302 = AbstractC5399.m10489(ExecutorC7208.f19225.plus(c5808));
        this.f16301 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11360(C5985 c5985, File file) {
        c5985.getClass();
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
    public static final List m11361(C5985 c5985, List list, String str) {
        String description;
        String nickname;
        String uin;
        String author;
        c5985.getClass();
        if (str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
            if (!AbstractC5144.m10176(onlineStickerInfo.getTitle(), str, false) && (((description = onlineStickerInfo.getDescription()) == null || !AbstractC5144.m10176(description, str, false)) && (((nickname = onlineStickerInfo.getNickname()) == null || !AbstractC5144.m10176(nickname, str, false)) && (((uin = onlineStickerInfo.getUin()) == null || !AbstractC5144.m10176(uin, str, false)) && ((author = onlineStickerInfo.getAuthor()) == null || !AbstractC5144.m10176(author, str, false)))))) {
                List<String> tags = onlineStickerInfo.getTags();
                if (tags == null || !tags.isEmpty()) {
                    Iterator<T> it = tags.iterator();
                    while (it.hasNext()) {
                        if (AbstractC5144.m10176((String) it.next(), str, false)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11362() {
        AbstractC5399.m10477(this.f16302, null, null, new StickerPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11363(String str, String str2, String str3, InterfaceC6558 interfaceC6558) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        AbstractC5399.m10477(this.f16302, null, null, new StickerPresenter$getStickers$1(str, str2, this, str3, interfaceC6558, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11364(OnlineStickerInfo onlineStickerInfo, String str, C8770 c8770) {
        onlineStickerInfo.getClass();
        str.getClass();
        C7207 c7207 = AbstractC5395.f15030;
        AbstractC5399.m10477(this.f16302, ExecutorC7208.f19225.plus(this.f16303), null, new StickerPresenter$downloadAndInstall$1(str, onlineStickerInfo, this, c8770, null), 2);
    }
}
