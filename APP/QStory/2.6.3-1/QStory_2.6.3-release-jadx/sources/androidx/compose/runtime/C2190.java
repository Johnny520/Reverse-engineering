package androidx.compose.runtime;

import androidx.compose.runtime.internal.AbstractC2081;
import kotlin.AbstractC6017;
import kotlin.Result;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2190 extends AbstractC2081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7387 f4273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6276 f4274;

    @Override // androidx.compose.runtime.internal.AbstractC2081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2729(Throwable th) {
        C6276 c6276 = this.f4274;
        if (c6276 != null) {
            c6276.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(th)));
        }
    }

    @Override // androidx.compose.runtime.internal.AbstractC2081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2730() {
        this.f4273 = null;
        this.f4274 = null;
    }
}
