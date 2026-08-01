package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import p050.AbstractC7176;
import p062.AbstractC7304;
import p062.C7311;
import p062.C7314;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5252 f13385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13386;

    public /* synthetic */ C5256(C5252 c5252, int i) {
        this.f13386 = i;
        this.f13385 = c5252;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13386;
        C5252 c5252 = this.f13385;
        switch (i) {
            case 0:
                List listM12487 = AbstractC7176.m12487(AbstractC7304.m12552(c5252.f13370.f19044, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listM12487.isEmpty() ? C7311.f18113 : new C7314(0, listM12487);
            default:
                return c5252.f13370.f19044.m12584();
        }
    }
}
