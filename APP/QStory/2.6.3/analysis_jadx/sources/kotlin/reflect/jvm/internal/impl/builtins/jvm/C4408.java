package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p079.C7004;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4408 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4408 f12979 = new C4408();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12980 = 0;

    public /* synthetic */ C4408() {
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f12980) {
            case 0:
                InterfaceC4486 interfaceC4486 = (InterfaceC4486) obj;
                C4409 c4409 = C4422.f13031;
                interfaceC4486.getClass();
                List list = (List) AbstractC6253.m11749(interfaceC4486.mo9062(C4422.f13029).f18811, C7004.f18810[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C4778) {
                        arrayList.add(obj2);
                    }
                }
                return (InterfaceC4499) AbstractC4344.m8820(arrayList);
            default:
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) obj;
                if (interfaceC4480.getKind() == CallableMemberDescriptor$Kind.DECLARATION) {
                    InterfaceC4499 interfaceC4499Mo9028 = interfaceC4480.mo9028();
                    interfaceC4499Mo9028.getClass();
                    String str = C4410.f12987;
                    if (C4410.f12996.containsKey(AbstractC6870.m12101((AbstractC6989) interfaceC4499Mo9028))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public C4408(C4420 c4420) {
    }
}
