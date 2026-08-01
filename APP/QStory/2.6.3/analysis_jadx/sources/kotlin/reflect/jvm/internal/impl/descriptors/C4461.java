package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p100.InterfaceC7244;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4461 implements InterfaceC7244, InterfaceC4462 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4461 f13088 = new C4461(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4461 f13089 = new C4461(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13090;

    public /* synthetic */ C4461(int i) {
        this.f13090 = i;
    }

    @Override // p100.InterfaceC7244
    public AbstractC4882 getType() {
        switch (this.f13090) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f13090) {
            case 6:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
