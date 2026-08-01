package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p100.InterfaceC7243;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4460 implements InterfaceC7243, InterfaceC4461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4460 f13084 = new C4460(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4460 f13085 = new C4460(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13086;

    public /* synthetic */ C4460(int i) {
        this.f13086 = i;
    }

    @Override // p100.InterfaceC7243
    public AbstractC4881 getType() {
        switch (this.f13086) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f13086) {
            case 6:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
