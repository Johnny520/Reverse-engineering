package top.suzhelan.qstory.entity.proto;

import androidx.activity.AbstractC0900;
import kotlin.Metadata;
import p047.InterfaceC7155;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.entity.proto.MsgPush$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
public final /* synthetic */ class C0799x7faa26be implements InterfaceC7155 {
    private final /* synthetic */ int number;

    public C0799x7faa26be(int i) {
        this.number = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC7155.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC7155) && number() == ((InterfaceC7155) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Integer.hashCode(this.number) ^ (AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵").hashCode() * 127);
    }

    @Override // p047.InterfaceC7155
    public final /* synthetic */ int number() {
        return this.number;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1370));
        return AbstractC0900.m716(sb, this.number, ')');
    }
}
