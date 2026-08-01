package androidx.compose.foundation.text.input.internal;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0871 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1687(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1688(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ Gainmap m1691(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1704(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m1705(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ DeleteGesture m1706(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ HandwritingGesture m1709(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m1710(Object obj) {
        return (SelectRangeGesture) obj;
    }
}
