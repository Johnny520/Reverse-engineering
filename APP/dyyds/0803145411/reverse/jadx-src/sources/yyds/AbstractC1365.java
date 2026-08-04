package yyds;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛶᛶᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1365 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String[] m2762(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1167 m2763(View view, C1167 c1167) {
        ContentInfo contentInfoMo405 = c1167.f5368.mo405();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo405);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo405 ? c1167 : new C1167(new C0052(contentInfoPerformReceiveContent));
    }
}
