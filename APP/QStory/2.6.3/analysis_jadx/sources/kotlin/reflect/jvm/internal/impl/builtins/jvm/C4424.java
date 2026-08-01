package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import p034.AbstractC6347;
import p046.AbstractC6475;
import p046.C6482;
import p046.C6485;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4424 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4420 f13040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13041;

    public /* synthetic */ C4424(C4420 c4420, int i) {
        this.f13041 = i;
        this.f13040 = c4420;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13041;
        C4420 c4420 = this.f13040;
        switch (i) {
            case 0:
                List listM11928 = AbstractC6347.m11928(AbstractC6475.m11993(c4420.f13025.f18699, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listM11928.isEmpty() ? C6482.f17768 : new C6485(0, listM11928);
            default:
                return c4420.f13025.f18699.m12025();
        }
    }
}
