package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p052.InterfaceC6557;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4880 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4872 f14184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f14185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14186 = 1;

    public C4880(List list, C4873 c4873, InterfaceC4872 interfaceC4872, InterfaceC7253 interfaceC7253, boolean z) {
        this.f14184 = interfaceC4872;
        this.f14185 = list;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        AbstractC4860 abstractC4860 = (AbstractC4860) obj;
        switch (this.f14186) {
            case 0:
                abstractC4860.getClass();
                this.f14184.mo9221();
                break;
            default:
                abstractC4860.getClass();
                this.f14184.mo9221();
                break;
        }
        return null;
    }

    public C4880(List list, C4873 c4873, InterfaceC4872 interfaceC4872, boolean z) {
        this.f14184 = interfaceC4872;
        this.f14185 = list;
    }
}
