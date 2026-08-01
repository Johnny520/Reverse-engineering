package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5504 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f14014;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTableM9851 = m9851();
        if (protoBuf$QualifiedNameTableM9851.isInitialized()) {
            return protoBuf$QualifiedNameTableM9851;
        }
        throw new UninitializedMessageException(protoBuf$QualifiedNameTableM9851);
    }

    public final Object clone() {
        C5504 c5504 = new C5504();
        c5504.f14014 = Collections.EMPTY_LIST;
        c5504.m9850(m9851());
        return c5504;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9850(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$QualifiedNameTable.qualifiedName_.isEmpty()) {
            if (this.f14014.isEmpty()) {
                this.f14014 = protoBuf$QualifiedNameTable.qualifiedName_;
                this.f14013 &= -2;
            } else {
                if ((this.f14013 & 1) != 1) {
                    this.f14014 = new ArrayList(this.f14014);
                    this.f14013 |= 1;
                }
                this.f14014.addAll(protoBuf$QualifiedNameTable.qualifiedName_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$QualifiedNameTable.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable m9851() {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this);
        if ((this.f14013 & 1) == 1) {
            this.f14014 = Collections.unmodifiableList(this.f14014);
            this.f14013 &= -2;
        }
        protoBuf$QualifiedNameTable.qualifiedName_ = this.f14014;
        return protoBuf$QualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9850((ProtoBuf$QualifiedNameTable) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = null;
        try {
            try {
                m9850((ProtoBuf$QualifiedNameTable) ProtoBuf$QualifiedNameTable.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = (ProtoBuf$QualifiedNameTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$QualifiedNameTable = protoBuf$QualifiedNameTable2;
                    if (protoBuf$QualifiedNameTable != null) {
                        m9850(protoBuf$QualifiedNameTable);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$QualifiedNameTable != null) {
            }
            throw th;
        }
    }
}
