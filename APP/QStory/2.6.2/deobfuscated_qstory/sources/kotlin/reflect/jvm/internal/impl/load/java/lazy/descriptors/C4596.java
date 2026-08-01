package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p052.InterfaceC6542;
import p083.C7040;
import p083.InterfaceC7036;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4596 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4599 f13405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13406;

    public /* synthetic */ C4596(C4599 c4599, int i) {
        this.f13406 = i;
        this.f13405 = c4599;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13406;
        C4599 c4599 = this.f13405;
        switch (i) {
            case 0:
                if (AbstractC4772.m9508(c4599) == null) {
                    return null;
                }
                ((C7040) c4599.f13430.f1095).f18902.getClass();
                return null;
            case 1:
                C4451 c4451 = c4599.f13428;
                ArrayList<C4437> typeParameters = c4451.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
                for (C4437 c4437 : typeParameters) {
                    InterfaceC4462 interfaceC4462Mo4933 = ((InterfaceC7036) c4599.f13421.f1096).mo4933(c4437);
                    if (interfaceC4462Mo4933 == null) {
                        throw new AssertionError("Parameter " + c4437 + " surely belongs to class " + c4451 + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC4462Mo4933);
                }
                return arrayList;
            default:
                return AbstractC4490.m9088(c4599);
        }
    }
}
