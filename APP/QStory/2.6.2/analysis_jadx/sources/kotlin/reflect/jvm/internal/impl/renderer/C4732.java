package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4732 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4732 f13815 = new C4732(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4732 f13816 = new C4732(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4732 f13813 = new C4732(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4732 f13812 = new C4732(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4732 f13814 = new C4732(4);

    public /* synthetic */ C4732(int i) {
        this.f13817 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f13817) {
            case 0:
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                int i = C4743.f13883;
                abstractC4881.getClass();
                return abstractC4881;
            case 1:
                int i2 = C4743.f13883;
                return "";
            case 2:
                AbstractC4881 abstractC48812 = (AbstractC4881) obj;
                InterfaceC5087[] interfaceC5087Arr = C4742.f13832;
                abstractC48812.getClass();
                return abstractC48812;
            case 3:
                InterfaceC5087[] interfaceC5087Arr2 = C4742.f13832;
                ((InterfaceC4455) obj).getClass();
                return "...";
            default:
                String str = (String) obj;
                str.getClass();
                return str;
        }
    }
}
