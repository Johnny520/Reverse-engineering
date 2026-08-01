package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p068.InterfaceC7372;
import p099.C7870;
import p099.InterfaceC7866;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5429 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5432 f13754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13755;

    public /* synthetic */ C5429(C5432 c5432, int i) {
        this.f13755 = i;
        this.f13754 = c5432;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13755;
        C5432 c5432 = this.f13754;
        switch (i) {
            case 0:
                if (AbstractC5605.m10057(c5432) == null) {
                    return null;
                }
                ((C7870) c5432.f13779.f1440).f19242.getClass();
                return null;
            case 1:
                C5284 c5284 = c5432.f13777;
                ArrayList<C5270> typeParameters = c5284.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
                for (C5270 c5270 : typeParameters) {
                    InterfaceC5295 interfaceC5295Mo5503 = ((InterfaceC7866) c5432.f13770.f1441).mo5503(c5270);
                    if (interfaceC5295Mo5503 == null) {
                        throw new AssertionError("Parameter " + c5270 + " surely belongs to class " + c5284 + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC5295Mo5503);
                }
                return arrayList;
            default:
                return AbstractC5323.m9637(c5432);
        }
    }
}
