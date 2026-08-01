package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p052.InterfaceC6543;
import p083.C7041;
import p083.InterfaceC7037;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4597 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4600 f13409;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13410;

    public /* synthetic */ C4597(C4600 c4600, int i) {
        this.f13410 = i;
        this.f13409 = c4600;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13410;
        C4600 c4600 = this.f13409;
        switch (i) {
            case 0:
                if (AbstractC4773.m9498(c4600) == null) {
                    return null;
                }
                ((C7041) c4600.f13434.f1095).f18897.getClass();
                return null;
            case 1:
                C4452 c4452 = c4600.f13432;
                ArrayList<C4438> typeParameters = c4452.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
                for (C4438 c4438 : typeParameters) {
                    InterfaceC4463 interfaceC4463Mo4943 = ((InterfaceC7037) c4600.f13425.f1096).mo4943(c4438);
                    if (interfaceC4463Mo4943 == null) {
                        throw new AssertionError("Parameter " + c4438 + " surely belongs to class " + c4452 + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC4463Mo4943);
                }
                return arrayList;
            default:
                return AbstractC4491.m9078(c4600);
        }
    }
}
