package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p079.AbstractC6989;
import p083.C7041;
import p098.C7240;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4579 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4578 f13357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13358;

    public /* synthetic */ C4579(C4578 c4578, int i) {
        this.f13358 = i;
        this.f13357 = c4578;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.f13358;
        C4578 c4578 = this.f13357;
        switch (i) {
            case 0:
                return AbstractC4431.m8977(AbstractC3057.m6756(AbstractC3057.m6759(c4578.f13354.f13051))).m9327();
            case 1:
                C4687 c4687Mo9178 = c4578.mo9178();
                C4430 c4430 = c4578.f13354;
                C0325 c0325 = c4578.f13355;
                if (c4687Mo9178 == null) {
                    return C7240.m12470(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c4430.toString());
                }
                C7041 c7041 = (C7041) c0325.f1095;
                InterfaceC4486 interfaceC4486 = c7041.f18905;
                AbstractC6530 abstractC6530Mo9061 = interfaceC4486.mo9061();
                abstractC6530Mo9061.getClass();
                String str = C4410.f12987;
                C4688 c4688M8946 = C4410.m8946(c4687Mo9178);
                AbstractC6989 abstractC6989M12039 = c4688M8946 != null ? abstractC6530Mo9061.m12039(c4688M8946.m9327()) : null;
                if (abstractC6989M12039 == null) {
                    C4452 c4452 = new C4452(AbstractC3057.m6756(AbstractC3057.m6759(c4430.f13051)));
                    C5856 c5856 = c7041.f18909;
                    c5856.getClass();
                    C5856 c58562 = (C5856) c5856.f16014;
                    if (c58562 == null) {
                        AbstractC4395.m8908("resolver");
                        throw null;
                    }
                    abstractC6989M12039 = c58562.m11260(c4452);
                    if (abstractC6989M12039 == null) {
                        abstractC6989M12039 = AbstractC4491.m9075(interfaceC4486, new C4688(c4687Mo9178.m9320(), c4687Mo9178.f13696.m9318()), c7041.f18891.m9256().f14104);
                    }
                }
                return abstractC6989M12039.mo9025();
            default:
                ArrayList<AbstractC4429> arrayListM8973 = c4578.f13354.m8973();
                ArrayList arrayList = new ArrayList();
                for (AbstractC4429 abstractC4429 : arrayListM8973) {
                    C4691 c4691 = abstractC4429.f13050;
                    if (c4691 == null) {
                        c4691 = AbstractC4615.f13484;
                    }
                    AbstractC4768 abstractC4768M9175 = c4578.m9175(abstractC4429);
                    Pair pair = abstractC4768M9175 != null ? new Pair(c4691, abstractC4768M9175) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC4339.m8771(arrayList);
        }
    }
}
