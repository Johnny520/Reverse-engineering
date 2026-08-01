package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p095.AbstractC7818;
import p095.C7833;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5240 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5240 f13324 = new C5240();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13325 = 0;

    public /* synthetic */ C5240() {
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f13325) {
            case 0:
                InterfaceC5318 interfaceC5318 = (InterfaceC5318) obj;
                C5241 c5241 = C5254.f13376;
                interfaceC5318.getClass();
                List list = (List) AbstractC7082.m12308(interfaceC5318.mo9621(C5254.f13374).f19156, C7833.f19155[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C5610) {
                        arrayList.add(obj2);
                    }
                }
                return (InterfaceC5331) AbstractC5176.m9379(arrayList);
            default:
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
                if (interfaceC5312.getKind() == CallableMemberDescriptor$Kind.DECLARATION) {
                    InterfaceC5331 interfaceC5331Mo9587 = interfaceC5312.mo9587();
                    interfaceC5331Mo9587.getClass();
                    String str = C5242.f13332;
                    if (C5242.f13341.containsKey(AbstractC7699.m12660((AbstractC7818) interfaceC5331Mo9587))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public C5240(C5252 c5252) {
    }
}
