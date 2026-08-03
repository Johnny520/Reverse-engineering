package p000;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* JADX INFO: renamed from: W5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0951W5 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Font.Builder m1813f(Font font) {
        return new Font.Builder(font);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ContentInfo.Builder m1816i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ ContentInfo m1818k(Object obj) {
        return (ContentInfo) obj;
    }
}
