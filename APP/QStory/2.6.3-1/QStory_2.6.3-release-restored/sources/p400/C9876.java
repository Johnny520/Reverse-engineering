package p400;

import p047.InterfaceC7155;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9876 implements InterfaceC7155 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC7155.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC7155) && 1 == ((InterfaceC7155) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return ("number".hashCode() * 127) ^ Integer.hashCode(1);
    }

    @Override // p047.InterfaceC7155
    public final /* synthetic */ int number() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.protobuf.ProtoNumber(number=".concat("1)");
    }
}
