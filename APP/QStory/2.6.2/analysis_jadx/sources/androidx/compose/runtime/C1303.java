package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1268;
import androidx.compose.runtime.snapshots.C1287;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f3791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3792;

    public /* synthetic */ C1303(InterfaceC6557 interfaceC6557, int i) {
        this.f3792 = i;
        this.f3791 = interfaceC6557;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        long j;
        switch (this.f3792) {
            case 0:
                return this.f3791.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                C1287 c1287 = (C1287) obj;
                synchronized (AbstractC1280.f3744) {
                    j = AbstractC1280.f3742;
                    AbstractC1280.f3742 = 1 + j;
                }
                return new C1268(j, c1287, this.f3791);
            default:
                InterfaceC6557 interfaceC6557 = this.f3791;
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                abstractC4881.getClass();
                return interfaceC6557.invoke(abstractC4881).toString();
        }
    }
}
