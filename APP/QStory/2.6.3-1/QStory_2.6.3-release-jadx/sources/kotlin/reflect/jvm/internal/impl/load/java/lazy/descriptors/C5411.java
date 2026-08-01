package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5261;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p095.AbstractC7818;
import p099.C7870;
import p114.C8069;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5411 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5410 f13702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13703;

    public /* synthetic */ C5411(C5410 c5410, int i) {
        this.f13703 = i;
        this.f13702 = c5410;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.f13703;
        C5410 c5410 = this.f13702;
        switch (i) {
            case 0:
                return AbstractC5263.m9536(AbstractC3889.m7316(AbstractC3889.m7319(c5410.f13699.f13396))).m9886();
            case 1:
                C5519 c5519Mo9737 = c5410.mo9737();
                C5262 c5262 = c5410.f13699;
                C1171 c1171 = c5410.f13700;
                if (c5519Mo9737 == null) {
                    return C8069.m13029(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c5262.toString());
                }
                C7870 c7870 = (C7870) c1171.f1440;
                InterfaceC5318 interfaceC5318 = c7870.f19250;
                AbstractC7359 abstractC7359Mo9620 = interfaceC5318.mo9620();
                abstractC7359Mo9620.getClass();
                String str = C5242.f13332;
                C5520 c5520M9505 = C5242.m9505(c5519Mo9737);
                AbstractC7818 abstractC7818M12598 = c5520M9505 != null ? abstractC7359Mo9620.m12598(c5520M9505.m9886()) : null;
                if (abstractC7818M12598 == null) {
                    C5284 c5284 = new C5284(AbstractC3889.m7316(AbstractC3889.m7319(c5262.f13396)));
                    C6686 c6686 = c7870.f19254;
                    c6686.getClass();
                    C6686 c66862 = (C6686) c6686.f16359;
                    if (c66862 == null) {
                        AbstractC5227.m9467("resolver");
                        throw null;
                    }
                    abstractC7818M12598 = c66862.m11819(c5284);
                    if (abstractC7818M12598 == null) {
                        abstractC7818M12598 = AbstractC5323.m9634(interfaceC5318, new C5520(c5519Mo9737.m9879(), c5519Mo9737.f14041.m9877()), c7870.f19236.m9815().f14449);
                    }
                }
                return abstractC7818M12598.mo9584();
            default:
                ArrayList<AbstractC5261> arrayListM9532 = c5410.f13699.m9532();
                ArrayList arrayList = new ArrayList();
                for (AbstractC5261 abstractC5261 : arrayListM9532) {
                    C5523 c5523 = abstractC5261.f13395;
                    if (c5523 == null) {
                        c5523 = AbstractC5447.f13829;
                    }
                    AbstractC5600 abstractC5600M9734 = c5410.m9734(abstractC5261);
                    Pair pair = abstractC5600M9734 != null ? new Pair(c5523, abstractC5600M9734) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC5171.m9330(arrayList);
        }
    }
}
