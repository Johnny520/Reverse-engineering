package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.lang.reflect.Modifier;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4443;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4598 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13414;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4598 f13412 = new C4598(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4598 f13413 = new C4598(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4598 f13410 = new C4598(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4598 f13409 = new C4598(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4598 f13411 = new C4598(4);

    public /* synthetic */ C4598(int i) {
        this.f13414 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f13414) {
            case 0:
                int i = C4589.f13378;
                ((AbstractC4443) obj).getClass();
                return Boolean.valueOf(!Modifier.isStatic(r1.mo8989().getModifiers()));
            case 1:
                InterfaceC4470 interfaceC4470 = (InterfaceC4470) obj;
                InterfaceC5087[] interfaceC5087Arr = AbstractC4574.f13327;
                interfaceC4470.getClass();
                return interfaceC4470;
            case 2:
                AbstractC4443 abstractC4443 = (AbstractC4443) obj;
                int i2 = C4571.f13320;
                abstractC4443.getClass();
                return Boolean.valueOf(Modifier.isStatic(abstractC4443.mo8989().getModifiers()));
            case 3:
                InterfaceC7253 interfaceC7253 = (InterfaceC7253) obj;
                int i3 = C4571.f13320;
                interfaceC7253.getClass();
                return interfaceC7253.mo9182();
            default:
                int i4 = C4571.f13320;
                InterfaceC4476 interfaceC4476Mo9221 = ((AbstractC4881) obj).mo9732().mo9221();
                if (interfaceC4476Mo9221 instanceof AbstractC6988) {
                    return (AbstractC6988) interfaceC4476Mo9221;
                }
                return null;
        }
    }
}
