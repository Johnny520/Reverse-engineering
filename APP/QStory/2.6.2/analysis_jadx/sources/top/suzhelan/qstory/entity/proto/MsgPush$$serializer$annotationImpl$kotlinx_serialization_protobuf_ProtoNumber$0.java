package top.suzhelan.qstory.entity.proto;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import p030.InterfaceC6307;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
public final /* synthetic */ class MsgPush$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0 implements InterfaceC6307 {
    private final /* synthetic */ int number;

    public MsgPush$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(int i) {
        this.number = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC6307.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC6307) && number() == ((InterfaceC6307) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Integer.hashCode(this.number) ^ (AbstractC3056.m6668(-3937702085223777703L).hashCode() * 127);
    }

    @Override // p030.InterfaceC6307
    public final /* synthetic */ int number() {
        return this.number;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937701977849595303L));
        return AbstractC0053.m154(sb, this.number, ')');
    }
}
