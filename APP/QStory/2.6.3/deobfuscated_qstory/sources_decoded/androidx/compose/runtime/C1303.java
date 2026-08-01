package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1268;
import androidx.compose.runtime.snapshots.C1287;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f3792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3793;

    public /* synthetic */ C1303(InterfaceC6558 interfaceC6558, int i) {
        this.f3793 = i;
        this.f3792 = interfaceC6558;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        long j;
        switch (this.f3793) {
            case 0:
                return this.f3792.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                C1287 c1287 = (C1287) obj;
                synchronized (AbstractC1280.f3745) {
                    j = AbstractC1280.f3743;
                    AbstractC1280.f3743 = 1 + j;
                }
                return new C1268(j, c1287, this.f3792);
            default:
                InterfaceC6558 interfaceC6558 = this.f3792;
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                abstractC4882.getClass();
                return interfaceC6558.invoke(abstractC4882).toString();
        }
    }
}
