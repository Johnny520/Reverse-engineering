package androidx.compose.animation.core;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0353 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    Object mo1056();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    default boolean m1058(EnterExitState enterExitState, EnterExitState enterExitState2) {
        return AbstractC4395.m8907(enterExitState, mo1057()) && AbstractC4395.m8907(enterExitState2, mo1056());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    Object mo1057();
}
