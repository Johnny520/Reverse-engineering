package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import p052.InterfaceC6557;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p079.C7003;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4407 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4407 f12975 = new C4407();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12976 = 0;

    public /* synthetic */ C4407() {
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f12976) {
            case 0:
                InterfaceC4485 interfaceC4485 = (InterfaceC4485) obj;
                C4408 c4408 = C4421.f13027;
                interfaceC4485.getClass();
                List list = (List) AbstractC9124.m14672(interfaceC4485.mo9072(C4421.f13025).f18816, C7003.f18815[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C4777) {
                        arrayList.add(obj2);
                    }
                }
                return (InterfaceC4498) AbstractC4343.m8827(arrayList);
            default:
                InterfaceC4479 interfaceC4479 = (InterfaceC4479) obj;
                if (interfaceC4479.getKind() == CallableMemberDescriptor$Kind.DECLARATION) {
                    InterfaceC4498 interfaceC4498Mo9038 = interfaceC4479.mo9038();
                    interfaceC4498Mo9038.getClass();
                    String str = C4409.f12983;
                    if (C4409.f12992.containsKey(AbstractC6869.m12073((AbstractC6988) interfaceC4498Mo9038))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public C4407(C4419 c4419) {
    }
}
