package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4733 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4733 f13819 = new C4733(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4733 f13820 = new C4733(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4733 f13817 = new C4733(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4733 f13816 = new C4733(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4733 f13818 = new C4733(4);

    public /* synthetic */ C4733(int i) {
        this.f13821 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f13821) {
            case 0:
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                int i = C4744.f13887;
                abstractC4882.getClass();
                return abstractC4882;
            case 1:
                int i2 = C4744.f13887;
                return "";
            case 2:
                AbstractC4882 abstractC48822 = (AbstractC4882) obj;
                InterfaceC5088[] interfaceC5088Arr = C4743.f13836;
                abstractC48822.getClass();
                return abstractC48822;
            case 3:
                InterfaceC5088[] interfaceC5088Arr2 = C4743.f13836;
                ((InterfaceC4456) obj).getClass();
                return "...";
            default:
                String str = (String) obj;
                str.getClass();
                return str;
        }
    }
}
