package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C4345;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p052.InterfaceC6557;
import p079.AbstractC6985;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4493 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4493 f13132 = new C4493(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4493 f13133 = new C4493(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4493 f13131 = new C4493(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4493 f13130 = new C4493(3);

    public /* synthetic */ C4493(int i) {
        this.f13134 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f13134) {
            case 0:
                ((C4687) obj).getClass();
                return 0;
            case 1:
                InterfaceC4465 interfaceC4465 = (InterfaceC4465) obj;
                interfaceC4465.getClass();
                return ((AbstractC6985) interfaceC4465).f18692;
            case 2:
                ((InterfaceC4498) obj).getClass();
                return Boolean.valueOf(!(r2 instanceof InterfaceC4494));
            default:
                InterfaceC4498 interfaceC4498 = (InterfaceC4498) obj;
                interfaceC4498.getClass();
                List typeParameters = ((InterfaceC4480) interfaceC4498).getTypeParameters();
                typeParameters.getClass();
                return new C4345(typeParameters, 1);
        }
    }
}
