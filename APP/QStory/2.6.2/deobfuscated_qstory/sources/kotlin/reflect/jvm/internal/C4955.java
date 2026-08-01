package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import p052.InterfaceC6542;
import p079.AbstractC6988;
import p079.C7005;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4955 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4954 f14331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14332;

    public /* synthetic */ C4955(C4954 c4954, int i) {
        this.f14332 = i;
        this.f14331 = c4954;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14332;
        C4954 c4954 = this.f14331;
        switch (i) {
            case 0:
                return AbstractC5066.m10059(c4954.m9960());
            default:
                InterfaceC4473 interfaceC4473M9960 = c4954.m9960();
                AbstractC5023 abstractC5023 = c4954.f14330;
                if (interfaceC4473M9960 instanceof C7005) {
                    C7005 c7005M10070 = AbstractC5066.m10070(abstractC5023);
                    C5050 c5050 = abstractC5023.f14487;
                    if (AbstractC4394.m8917(c7005M10070, interfaceC4473M9960) && (c5050.f14576 || abstractC5023.mo9945().getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE)) {
                        InterfaceC4498 interfaceC4498Mo9945 = c5050.f14579;
                        if (interfaceC4498Mo9945 == null) {
                            interfaceC4498Mo9945 = abstractC5023.mo9945();
                        }
                        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4498Mo9945.mo9038();
                        interfaceC4498Mo9038.getClass();
                        Class clsM10068 = AbstractC5066.m10068((AbstractC6988) interfaceC4498Mo9038);
                        if (clsM10068 != null) {
                            return clsM10068;
                        }
                        C4210.m8605(interfaceC4473M9960, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) abstractC5023.mo9944().getParameterTypes().get(c4954.f14328);
        }
    }
}
