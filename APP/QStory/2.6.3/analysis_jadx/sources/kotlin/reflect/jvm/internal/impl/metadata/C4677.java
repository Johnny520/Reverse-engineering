package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4677 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$QualifiedNameTable.QualifiedName.Kind f13670;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13673;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$QualifiedNameTable.QualifiedName qualifiedNameM9294 = m9294();
        if (qualifiedNameM9294.isInitialized()) {
            return qualifiedNameM9294;
        }
        throw new UninitializedMessageException(qualifiedNameM9294);
    }

    public final Object clone() {
        C4677 c4677 = new C4677();
        c4677.f13673 = -1;
        c4677.f13670 = ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE;
        c4677.m9293(m9294());
        return c4677;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9293(ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName) {
        if (qualifiedName == ProtoBuf$QualifiedNameTable.QualifiedName.getDefaultInstance()) {
            return;
        }
        if (qualifiedName.hasParentQualifiedName()) {
            int parentQualifiedName = qualifiedName.getParentQualifiedName();
            this.f13672 |= 1;
            this.f13673 = parentQualifiedName;
        }
        if (qualifiedName.hasShortName()) {
            int shortName = qualifiedName.getShortName();
            this.f13672 |= 2;
            this.f13671 = shortName;
        }
        if (qualifiedName.hasKind()) {
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            this.f13672 |= 4;
            this.f13670 = kind;
        }
        this.f13808 = this.f13808.m9401(qualifiedName.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable.QualifiedName m9294() {
        ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = new ProtoBuf$QualifiedNameTable.QualifiedName(this);
        int i = this.f13672;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qualifiedName.parentQualifiedName_ = this.f13673;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        qualifiedName.shortName_ = this.f13671;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        qualifiedName.kind_ = this.f13670;
        qualifiedName.bitField0_ = i2;
        return qualifiedName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9293((ProtoBuf$QualifiedNameTable.QualifiedName) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.QualifiedName.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.QualifiedName) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9293(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9293(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4677.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
