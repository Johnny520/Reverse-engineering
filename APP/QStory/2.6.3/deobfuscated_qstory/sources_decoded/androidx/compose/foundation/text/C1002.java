package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1002 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1362 f2937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1362 f2938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0513 f2939;

    public C1002(InterfaceC0513 interfaceC0513, final C0998 c0998) {
        this.f2939 = interfaceC0513;
        final int i = 0;
        this.f2938 = AbstractC1367.m2496(new InterfaceC6543() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i2 = i;
                C0998 c09982 = c0998;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(c09982.m1919() < ((AbstractC1349) c09982.f2929).m2434());
                    default:
                        return Boolean.valueOf(c09982.m1919() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f2937 = AbstractC1367.m2496(new InterfaceC6543() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i22 = i2;
                C0998 c09982 = c0998;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(c09982.m1919() < ((AbstractC1349) c09982.f2929).m2434());
                    default:
                        return Boolean.valueOf(c09982.m1919() > 0.0f);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1248(float f) {
        return this.f2939.mo1248(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1287() {
        return ((Boolean) this.f2938.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1288() {
        return ((Boolean) this.f2937.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1249(MutatePriority mutatePriority, InterfaceC6554 interfaceC6554, ContinuationImpl continuationImpl) {
        return this.f2939.mo1249(mutatePriority, interfaceC6554, continuationImpl);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1250() {
        return this.f2939.mo1250();
    }
}
