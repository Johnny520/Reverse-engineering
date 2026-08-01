package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3119 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3093 m4841(View view, C3093 c3093) {
        ContentInfo contentInfoMo4714 = c3093.f6915.mo4714();
        Objects.requireNonNull(contentInfoMo4714);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo4714);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo4714 ? c3093 : new C3093(new C3075(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String[] m4842(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
