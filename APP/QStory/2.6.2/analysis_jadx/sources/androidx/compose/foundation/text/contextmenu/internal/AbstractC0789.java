package androidx.compose.foundation.text.contextmenu.internal;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0789 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1585() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1586() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1587() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1588(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1589() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1590(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1598(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m1599(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1600() {
        return DeleteRangeGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1602() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m1603() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ SelectGesture m1604(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m1611(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m1612(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ HandwritingGesture m1613(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ InsertGesture m1614(Object obj) {
        return (InsertGesture) obj;
    }
}
