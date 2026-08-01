package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5465 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f13891;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AnnotatedCallableKind f13892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5640 f13893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5533 f13894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5462 f13895;

    public C5465(AbstractC5462 abstractC5462, AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.f13895 = abstractC5462;
        this.f13893 = abstractC5640;
        this.f13894 = interfaceC5533;
        this.f13892 = annotatedCallableKind;
        this.f13891 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        InterfaceC5533 interfaceC5533 = this.f13894;
        boolean z = interfaceC5533 instanceof ProtoBuf$Function;
        int i = 0;
        int contextParameterCount = z ? ((ProtoBuf$Function) interfaceC5533).getContextParameterCount() : interfaceC5533 instanceof ProtoBuf$Property ? ((ProtoBuf$Property) interfaceC5533).getContextParameterCount() : 0;
        AbstractC5640 abstractC5640 = this.f13893;
        if (z) {
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) interfaceC5533;
            if (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) {
                i = 1;
            }
        } else if (interfaceC5533 instanceof ProtoBuf$Property) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC5533;
            if (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId()) {
            }
        } else {
            if (!(interfaceC5533 instanceof ProtoBuf$Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + interfaceC5533.getClass());
            }
            C5652 c5652 = (C5652) abstractC5640;
            if (c5652.f14391 == ProtoBuf$Class.Kind.ENUM_CLASS) {
                i = 2;
            } else if (c5652.f14390) {
            }
        }
        return this.f13895.m9805(abstractC5640, interfaceC5533, this.f13892, contextParameterCount + i + this.f13891);
    }
}
