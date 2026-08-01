package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5509 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$QualifiedNameTable.QualifiedName.Kind f14015;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14016;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14018;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$QualifiedNameTable.QualifiedName qualifiedNameM9853 = m9853();
        if (qualifiedNameM9853.isInitialized()) {
            return qualifiedNameM9853;
        }
        throw new UninitializedMessageException(qualifiedNameM9853);
    }

    public final Object clone() {
        C5509 c5509 = new C5509();
        c5509.f14018 = -1;
        c5509.f14015 = ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE;
        c5509.m9852(m9853());
        return c5509;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9852(ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName) {
        if (qualifiedName == ProtoBuf$QualifiedNameTable.QualifiedName.getDefaultInstance()) {
            return;
        }
        if (qualifiedName.hasParentQualifiedName()) {
            int parentQualifiedName = qualifiedName.getParentQualifiedName();
            this.f14017 |= 1;
            this.f14018 = parentQualifiedName;
        }
        if (qualifiedName.hasShortName()) {
            int shortName = qualifiedName.getShortName();
            this.f14017 |= 2;
            this.f14016 = shortName;
        }
        if (qualifiedName.hasKind()) {
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            this.f14017 |= 4;
            this.f14015 = kind;
        }
        this.f14153 = this.f14153.m9960(qualifiedName.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable.QualifiedName m9853() {
        ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = new ProtoBuf$QualifiedNameTable.QualifiedName(this);
        int i = this.f14017;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qualifiedName.parentQualifiedName_ = this.f14018;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        qualifiedName.shortName_ = this.f14016;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        qualifiedName.kind_ = this.f14015;
        qualifiedName.bitField0_ = i2;
        return qualifiedName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9852((ProtoBuf$QualifiedNameTable.QualifiedName) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = null;
        try {
            try {
                m9852((ProtoBuf$QualifiedNameTable.QualifiedName) ProtoBuf$QualifiedNameTable.QualifiedName.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName2 = (ProtoBuf$QualifiedNameTable.QualifiedName) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qualifiedName = qualifiedName2;
                    if (qualifiedName != null) {
                        m9852(qualifiedName);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (qualifiedName != null) {
            }
            throw th;
        }
    }
}
