package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1362;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1002 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1362 f2936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1362 f2937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0513 f2938;

    public C1002(InterfaceC0513 interfaceC0513, final C0998 c0998) {
        this.f2938 = interfaceC0513;
        final int i = 0;
        this.f2937 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i2 = i;
                C0998 c09982 = c0998;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(c09982.m1909() < ((AbstractC1349) c09982.f2928).m2424());
                    default:
                        return Boolean.valueOf(c09982.m1909() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f2936 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.foundation.text.飘花落叶言子苏兰楪世哲
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i22 = i2;
                C0998 c09982 = c0998;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(c09982.m1909() < ((AbstractC1349) c09982.f2928).m2424());
                    default:
                        return Boolean.valueOf(c09982.m1909() > 0.0f);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1238(float f) {
        return this.f2938.mo1238(f);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo1277() {
        return ((Boolean) this.f2937.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1278() {
        return ((Boolean) this.f2936.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo1239(MutatePriority mutatePriority, InterfaceC6553 interfaceC6553, ContinuationImpl continuationImpl) {
        return this.f2938.mo1239(mutatePriority, interfaceC6553, continuationImpl);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1240() {
        return this.f2938.mo1240();
    }
}
