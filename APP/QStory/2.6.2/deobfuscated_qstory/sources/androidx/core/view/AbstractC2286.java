package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2286 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2260 m4271(View view, C2260 c2260) {
        ContentInfo contentInfoMo4144 = c2260.f6569.mo4144();
        Objects.requireNonNull(contentInfoMo4144);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo4144);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo4144 ? c2260 : new C2260(new C2242(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m4272(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
