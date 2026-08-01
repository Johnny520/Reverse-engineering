package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2286 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2260 m4281(View view, C2260 c2260) {
        ContentInfo contentInfoMo4154 = c2260.f6570.mo4154();
        Objects.requireNonNull(contentInfoMo4154);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo4154);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo4154 ? c2260 : new C2260(new C2242(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m4282(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
