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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1629 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2155() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2156() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2157() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2158(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2159() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2160(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2168(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2169(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2170() {
        return DeleteRangeGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2172() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m2173() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ SelectGesture m2174(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m2181(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m2182(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ HandwritingGesture m2183(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ InsertGesture m2184(Object obj) {
        return (InsertGesture) obj;
    }
}
