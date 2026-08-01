package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4428;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6529;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p079.AbstractC6988;
import p083.C7040;
import p098.C7239;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4578 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4577 f13353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13354;

    public /* synthetic */ C4578(C4577 c4577, int i) {
        this.f13354 = i;
        this.f13353 = c4577;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.f13354;
        C4577 c4577 = this.f13353;
        switch (i) {
            case 0:
                return AbstractC4430.m8987(AbstractC6560.m12029(AbstractC6560.m12033(c4577.f13350.f13047))).m9337();
            case 1:
                C4686 c4686Mo9188 = c4577.mo9188();
                C4429 c4429 = c4577.f13350;
                C0325 c0325 = c4577.f13351;
                if (c4686Mo9188 == null) {
                    return C7239.m12443(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c4429.toString());
                }
                C7040 c7040 = (C7040) c0325.f1095;
                InterfaceC4485 interfaceC4485 = c7040.f18910;
                AbstractC6529 abstractC6529Mo9071 = interfaceC4485.mo9071();
                abstractC6529Mo9071.getClass();
                String str = C4409.f12983;
                C4687 c4687M8956 = C4409.m8956(c4686Mo9188);
                AbstractC6988 abstractC6988M11996 = c4687M8956 != null ? abstractC6529Mo9071.m11996(c4687M8956.m9337()) : null;
                if (abstractC6988M11996 == null) {
                    C4451 c4451 = new C4451(AbstractC6560.m12029(AbstractC6560.m12033(c4429.f13047)));
                    C5851 c5851 = c7040.f18914;
                    c5851.getClass();
                    C5851 c58512 = (C5851) c5851.f16007;
                    if (c58512 == null) {
                        AbstractC4394.m8918("resolver");
                        throw null;
                    }
                    abstractC6988M11996 = c58512.m11198(c4451);
                    if (abstractC6988M11996 == null) {
                        abstractC6988M11996 = AbstractC4490.m9085(interfaceC4485, new C4687(c4686Mo9188.m9330(), c4686Mo9188.f13692.m9328()), c7040.f18896.m9266().f14100);
                    }
                }
                return abstractC6988M11996.mo9035();
            default:
                ArrayList<AbstractC4428> arrayListM8983 = c4577.f13350.m8983();
                ArrayList arrayList = new ArrayList();
                for (AbstractC4428 abstractC4428 : arrayListM8983) {
                    C4690 c4690 = abstractC4428.f13046;
                    if (c4690 == null) {
                        c4690 = AbstractC4614.f13480;
                    }
                    AbstractC4767 abstractC4767M9185 = c4577.m9185(abstractC4428);
                    Pair pair = abstractC4767M9185 != null ? new Pair(c4690, abstractC4767M9185) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC4338.m8783(arrayList);
        }
    }
}
