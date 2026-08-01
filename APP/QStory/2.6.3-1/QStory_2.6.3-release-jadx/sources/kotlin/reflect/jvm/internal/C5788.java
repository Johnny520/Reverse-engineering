package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5306;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import p068.InterfaceC7372;
import p095.AbstractC7818;
import p095.C7835;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5788 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5787 f14678;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14679;

    public /* synthetic */ C5788(C5787 c5787, int i) {
        this.f14679 = i;
        this.f14678 = c5787;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14679;
        C5787 c5787 = this.f14678;
        switch (i) {
            case 0:
                return AbstractC5899.m10622(c5787.m10516());
            default:
                InterfaceC5306 interfaceC5306M10516 = c5787.m10516();
                AbstractC5856 abstractC5856 = c5787.f14677;
                if (interfaceC5306M10516 instanceof C7835) {
                    C7835 c7835M10633 = AbstractC5899.m10633(abstractC5856);
                    C5883 c5883 = abstractC5856.f14834;
                    if (AbstractC5227.m9466(c7835M10633, interfaceC5306M10516) && (c5883.f14923 || abstractC5856.mo10501().getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE)) {
                        InterfaceC5331 interfaceC5331Mo10501 = c5883.f14926;
                        if (interfaceC5331Mo10501 == null) {
                            interfaceC5331Mo10501 = abstractC5856.mo10501();
                        }
                        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5331Mo10501.mo9587();
                        interfaceC5331Mo9587.getClass();
                        Class clsM10631 = AbstractC5899.m10631((AbstractC7818) interfaceC5331Mo9587);
                        if (clsM10631 != null) {
                            return clsM10631;
                        }
                        C5043.m9154(interfaceC5306M10516, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) abstractC5856.mo10500().getParameterTypes().get(c5787.f14675);
        }
    }
}
