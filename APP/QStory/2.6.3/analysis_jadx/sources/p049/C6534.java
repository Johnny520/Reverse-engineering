package p049;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6534 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final PrimitiveType f17932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17933;

    public /* synthetic */ C6534(PrimitiveType primitiveType, int i) {
        this.f17933 = i;
        this.f17932 = primitiveType;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f17933;
        PrimitiveType primitiveType = this.f17932;
        switch (i) {
            case 0:
                return PrimitiveType.typeFqName_delegate$lambda$0(primitiveType);
            default:
                return PrimitiveType.arrayTypeFqName_delegate$lambda$0(primitiveType);
        }
    }
}
