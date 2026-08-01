package top.suzhelan.qstory.entity.proto;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import p031.InterfaceC6326;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
public final /* synthetic */ class MsgPush$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0 implements InterfaceC6326 {
    private final /* synthetic */ int number;

    public MsgPush$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(int i) {
        this.number = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC6326.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC6326) && number() == ((InterfaceC6326) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Integer.hashCode(this.number) ^ (AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵").hashCode() * 127);
    }

    @Override // p031.InterfaceC6326
    public final /* synthetic */ int number() {
        return this.number;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1370));
        return AbstractC0053.m156(sb, this.number, ')');
    }
}
