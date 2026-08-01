package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import p052.InterfaceC6543;
import p079.AbstractC6989;
import p079.C7006;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4956 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4955 f14333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14334;

    public /* synthetic */ C4956(C4955 c4955, int i) {
        this.f14334 = i;
        this.f14333 = c4955;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14334;
        C4955 c4955 = this.f14333;
        switch (i) {
            case 0:
                return AbstractC5067.m10063(c4955.m9957());
            default:
                InterfaceC4474 interfaceC4474M9957 = c4955.m9957();
                AbstractC5024 abstractC5024 = c4955.f14332;
                if (interfaceC4474M9957 instanceof C7006) {
                    C7006 c7006M10074 = AbstractC5067.m10074(abstractC5024);
                    C5051 c5051 = abstractC5024.f14489;
                    if (AbstractC4395.m8907(c7006M10074, interfaceC4474M9957) && (c5051.f14578 || abstractC5024.mo9942().getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE)) {
                        InterfaceC4499 interfaceC4499Mo9942 = c5051.f14581;
                        if (interfaceC4499Mo9942 == null) {
                            interfaceC4499Mo9942 = abstractC5024.mo9942();
                        }
                        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4499Mo9942.mo9028();
                        interfaceC4499Mo9028.getClass();
                        Class clsM10072 = AbstractC5067.m10072((AbstractC6989) interfaceC4499Mo9028);
                        if (clsM10072 != null) {
                            return clsM10072;
                        }
                        C4211.m8595(interfaceC4474M9957, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) abstractC5024.mo9941().getParameterTypes().get(c4955.f14330);
        }
    }
}
