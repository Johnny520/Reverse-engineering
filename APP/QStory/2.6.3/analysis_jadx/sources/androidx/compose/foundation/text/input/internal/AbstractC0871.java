package androidx.compose.foundation.text.input.internal;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0871 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1697(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1698(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ Gainmap m1701(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1714(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m1715(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ DeleteGesture m1716(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ HandwritingGesture m1719(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m1720(Object obj) {
        return (SelectRangeGesture) obj;
    }
}
