package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C4346;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import p052.InterfaceC6558;
import p079.AbstractC6986;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4494 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4494 f13136 = new C4494(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4494 f13137 = new C4494(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4494 f13135 = new C4494(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4494 f13134 = new C4494(3);

    public /* synthetic */ C4494(int i) {
        this.f13138 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f13138) {
            case 0:
                ((C4688) obj).getClass();
                return 0;
            case 1:
                InterfaceC4466 interfaceC4466 = (InterfaceC4466) obj;
                interfaceC4466.getClass();
                return ((AbstractC6986) interfaceC4466).f18687;
            case 2:
                ((InterfaceC4499) obj).getClass();
                return Boolean.valueOf(!(r2 instanceof InterfaceC4495));
            default:
                InterfaceC4499 interfaceC4499 = (InterfaceC4499) obj;
                interfaceC4499.getClass();
                List typeParameters = ((InterfaceC4481) interfaceC4499).getTypeParameters();
                typeParameters.getClass();
                return new C4346(typeParameters, 1);
        }
    }
}
