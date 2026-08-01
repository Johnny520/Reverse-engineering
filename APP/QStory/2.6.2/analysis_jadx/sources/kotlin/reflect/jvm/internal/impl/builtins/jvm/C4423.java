package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import p046.AbstractC6474;
import p046.C6481;
import p046.C6484;
import p052.InterfaceC6542;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4423 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4419 f13036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13037;

    public /* synthetic */ C4423(C4419 c4419, int i) {
        this.f13037 = i;
        this.f13036 = c4419;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13037;
        C4419 c4419 = this.f13036;
        switch (i) {
            case 0:
                List listM13660 = AbstractC8189.m13660(AbstractC6474.m11950(c4419.f13021.f18704, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listM13660.isEmpty() ? C6481.f17772 : new C6484(0, listM13660);
            default:
                return c4419.f13021.f18704.m11982();
        }
    }
}
