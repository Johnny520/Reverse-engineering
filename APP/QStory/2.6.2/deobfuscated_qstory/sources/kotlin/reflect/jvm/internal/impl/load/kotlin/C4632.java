package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4632 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f13542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AnnotatedCallableKind f13543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4807 f13544;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4700 f13545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4629 f13546;

    public C4632(AbstractC4629 abstractC4629, AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.f13546 = abstractC4629;
        this.f13544 = abstractC4807;
        this.f13545 = interfaceC4700;
        this.f13543 = annotatedCallableKind;
        this.f13542 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // p052.InterfaceC6542
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r0 = r8.f13545
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            r2 = 0
            if (r1 == 0) goto Lf
            r3 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3
            int r3 = r3.getContextParameterCount()
            goto L1c
        Lf:
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property
            if (r3 == 0) goto L1b
            r3 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r3
            int r3 = r3.getContextParameterCount()
            goto L1c
        L1b:
            r3 = r2
        L1c:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世楪苏哲兰 r4 = r8.f13544
            r5 = 1
            if (r1 == 0) goto L32
            r1 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r1
            boolean r6 = r1.hasReceiverType()
            if (r6 != 0) goto L30
            boolean r1 = r1.hasReceiverTypeId()
            if (r1 == 0) goto L5a
        L30:
            r2 = r5
            goto L5a
        L32:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property
            if (r1 == 0) goto L46
            r1 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r1
            boolean r6 = r1.hasReceiverType()
            if (r6 != 0) goto L30
            boolean r1 = r1.hasReceiverTypeId()
            if (r1 == 0) goto L5a
            goto L30
        L46:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r1 == 0) goto L67
            r1 = r4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏 r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819) r1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r6 = r1.f14042
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.Kind.ENUM_CLASS
            if (r6 != r7) goto L55
            r2 = 2
            goto L5a
        L55:
            boolean r1 = r1.f14041
            if (r1 == 0) goto L5a
            goto L30
        L5a:
            int r3 = r3 + r2
            int r1 = r8.f13542
            int r3 = r3 + r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世兰苏哲 r1 = r8.f13546
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r8 = r8.f13543
            java.util.List r8 = r1.m9256(r4, r0, r8, r3)
            return r8
        L67:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported message: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C4632.invoke():java.lang.Object");
    }
}
