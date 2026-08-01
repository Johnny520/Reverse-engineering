package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5565 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5565 f14164 = new C5565(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5565 f14165 = new C5565(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5565 f14162 = new C5565(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5565 f14161 = new C5565(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5565 f14163 = new C5565(4);

    public /* synthetic */ C5565(int i) {
        this.f14166 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f14166) {
            case 0:
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                int i = C5576.f14232;
                abstractC5714.getClass();
                return abstractC5714;
            case 1:
                int i2 = C5576.f14232;
                return "";
            case 2:
                AbstractC5714 abstractC57142 = (AbstractC5714) obj;
                InterfaceC5920[] interfaceC5920Arr = C5575.f14181;
                abstractC57142.getClass();
                return abstractC57142;
            case 3:
                InterfaceC5920[] interfaceC5920Arr2 = C5575.f14181;
                ((InterfaceC5288) obj).getClass();
                return "...";
            default:
                String str = (String) obj;
                str.getClass();
                return str;
        }
    }
}
