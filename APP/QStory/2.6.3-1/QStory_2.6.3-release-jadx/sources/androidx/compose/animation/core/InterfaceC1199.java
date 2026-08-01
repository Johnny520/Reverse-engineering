package androidx.compose.animation.core;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1199 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    Object mo1616();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    default boolean m1618(EnterExitState enterExitState, EnterExitState enterExitState2) {
        return AbstractC5227.m9466(enterExitState, mo1617()) && AbstractC5227.m9466(enterExitState2, mo1616());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    Object mo1617();
}
