package p065;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7363 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final PrimitiveType f18277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18278;

    public /* synthetic */ C7363(PrimitiveType primitiveType, int i) {
        this.f18278 = i;
        this.f18277 = primitiveType;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f18278;
        PrimitiveType primitiveType = this.f18277;
        switch (i) {
            case 0:
                return PrimitiveType.typeFqName_delegate$lambda$0(primitiveType);
            default:
                return PrimitiveType.arrayTypeFqName_delegate$lambda$0(primitiveType);
        }
    }
}
