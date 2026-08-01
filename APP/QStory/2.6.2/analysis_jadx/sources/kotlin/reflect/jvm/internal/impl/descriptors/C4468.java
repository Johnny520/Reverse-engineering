package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4210;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4414;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4468 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f13095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13096;

    public /* synthetic */ C4468(C0325 c0325, int i) {
        this.f13096 = i;
        this.f13095 = c0325;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f13096;
        C0325 c0325 = this.f13095;
        switch (i) {
            case 0:
                C4686 c4686 = (C4686) obj;
                c4686.getClass();
                return new C4414((InterfaceC4485) c0325.f1096, c4686, 1);
            default:
                C4467 c4467 = (C4467) obj;
                c4467.getClass();
                C4687 c4687 = c4467.f13094;
                List list = c4467.f13093;
                if (c4687.f13693) {
                    C4210.m8606(c4687, "Unresolved local class: ");
                    return null;
                }
                C4687 c4687M9334 = c4687.m9334();
                InterfaceC4477 interfaceC4477M966 = c4687M9334 != null ? c0325.m966(c4687M9334, AbstractC4343.m8792(1, list)) : (InterfaceC4477) ((C4836) c0325.f1094).invoke(c4687.f13695);
                boolean zM9338 = c4687.m9338();
                C4844 c4844 = (C4844) c0325.f1095;
                C4690 c4690M9333 = c4687.m9333();
                Integer num = (Integer) AbstractC4343.m8830(list);
                return new C4466(c4844, interfaceC4477M966, c4690M9333, zM9338, num != null ? num.intValue() : 0);
        }
    }
}
