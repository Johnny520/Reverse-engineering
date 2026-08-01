package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.lang.reflect.Modifier;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5276;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5431 f13761 = new C5431(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5431 f13762 = new C5431(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5431 f13759 = new C5431(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5431 f13758 = new C5431(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5431 f13760 = new C5431(4);

    public /* synthetic */ C5431(int i) {
        this.f13763 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f13763) {
            case 0:
                int i = C5422.f13727;
                ((AbstractC5276) obj).getClass();
                return Boolean.valueOf(!Modifier.isStatic(r1.mo9538().getModifiers()));
            case 1:
                InterfaceC5303 interfaceC5303 = (InterfaceC5303) obj;
                InterfaceC5920[] interfaceC5920Arr = AbstractC5407.f13676;
                interfaceC5303.getClass();
                return interfaceC5303;
            case 2:
                AbstractC5276 abstractC5276 = (AbstractC5276) obj;
                int i2 = C5404.f13669;
                abstractC5276.getClass();
                return Boolean.valueOf(Modifier.isStatic(abstractC5276.mo9538().getModifiers()));
            case 3:
                InterfaceC8083 interfaceC8083 = (InterfaceC8083) obj;
                int i3 = C5404.f13669;
                interfaceC8083.getClass();
                return interfaceC8083.mo9731();
            default:
                int i4 = C5404.f13669;
                InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) obj).mo10281().mo9770();
                if (interfaceC5309Mo9770 instanceof AbstractC7818) {
                    return (AbstractC7818) interfaceC5309Mo9770;
                }
                return null;
        }
    }
}
