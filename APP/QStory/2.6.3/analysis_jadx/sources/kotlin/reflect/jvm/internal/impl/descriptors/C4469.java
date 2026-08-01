package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4415;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4469 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f13099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13100;

    public /* synthetic */ C4469(C0325 c0325, int i) {
        this.f13100 = i;
        this.f13099 = c0325;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f13100;
        C0325 c0325 = this.f13099;
        switch (i) {
            case 0:
                C4687 c4687 = (C4687) obj;
                c4687.getClass();
                return new C4415((InterfaceC4486) c0325.f1096, c4687, 1);
            default:
                C4468 c4468 = (C4468) obj;
                c4468.getClass();
                C4688 c4688 = c4468.f13098;
                List list = c4468.f13097;
                if (c4688.f13697) {
                    C4211.m8596(c4688, "Unresolved local class: ");
                    return null;
                }
                C4688 c4688M9324 = c4688.m9324();
                InterfaceC4478 interfaceC4478M967 = c4688M9324 != null ? c0325.m967(c4688M9324, AbstractC4344.m8805(1, list)) : (InterfaceC4478) ((C4837) c0325.f1094).invoke(c4688.f13699);
                boolean zM9328 = c4688.m9328();
                C4845 c4845 = (C4845) c0325.f1095;
                C4691 c4691M9323 = c4688.m9323();
                Integer num = (Integer) AbstractC4344.m8815(list);
                return new C4467(c4845, interfaceC4478M967, c4691M9323, zM9328, num != null ? num.intValue() : 0);
        }
    }
}
