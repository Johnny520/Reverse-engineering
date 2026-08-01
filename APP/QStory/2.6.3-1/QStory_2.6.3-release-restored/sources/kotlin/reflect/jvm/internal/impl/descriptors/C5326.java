package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C5178;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import p068.InterfaceC7387;
import p095.AbstractC7815;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5326 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5326 f13481 = new C5326(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5326 f13482 = new C5326(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5326 f13480 = new C5326(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5326 f13479 = new C5326(3);

    public /* synthetic */ C5326(int i) {
        this.f13483 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f13483) {
            case 0:
                ((C5520) obj).getClass();
                return 0;
            case 1:
                InterfaceC5298 interfaceC5298 = (InterfaceC5298) obj;
                interfaceC5298.getClass();
                return ((AbstractC7815) interfaceC5298).f19032;
            case 2:
                ((InterfaceC5331) obj).getClass();
                return Boolean.valueOf(!(r2 instanceof InterfaceC5327));
            default:
                InterfaceC5331 interfaceC5331 = (InterfaceC5331) obj;
                interfaceC5331.getClass();
                List typeParameters = ((InterfaceC5313) interfaceC5331).getTypeParameters();
                typeParameters.getClass();
                return new C5178(typeParameters, 1);
        }
    }
}
