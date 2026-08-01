package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.C2103;
import androidx.compose.runtime.snapshots.C2122;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2138 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f4137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4138;

    public /* synthetic */ C2138(InterfaceC7387 interfaceC7387, int i) {
        this.f4138 = i;
        this.f4137 = interfaceC7387;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        long j;
        switch (this.f4138) {
            case 0:
                return this.f4137.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                C2122 c2122 = (C2122) obj;
                synchronized (AbstractC2115.f4090) {
                    j = AbstractC2115.f4088;
                    AbstractC2115.f4088 = 1 + j;
                }
                return new C2103(j, c2122, this.f4137);
            default:
                InterfaceC7387 interfaceC7387 = this.f4137;
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                abstractC5714.getClass();
                return interfaceC7387.invoke(abstractC5714).toString();
        }
    }
}
