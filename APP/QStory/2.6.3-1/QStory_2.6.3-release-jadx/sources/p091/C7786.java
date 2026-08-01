package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7786 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f18940;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTableM12816 = m12816();
        if (protoBuf$VersionRequirementTableM12816.isInitialized()) {
            return protoBuf$VersionRequirementTableM12816;
        }
        throw new UninitializedMessageException(protoBuf$VersionRequirementTableM12816);
    }

    public final Object clone() {
        C7786 c7786 = new C7786();
        c7786.f18940 = Collections.EMPTY_LIST;
        c7786.m12815(m12816());
        return c7786;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12815(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$VersionRequirementTable.requirement_.isEmpty()) {
            if (this.f18940.isEmpty()) {
                this.f18940 = protoBuf$VersionRequirementTable.requirement_;
                this.f18939 &= -2;
            } else {
                if ((this.f18939 & 1) != 1) {
                    this.f18940 = new ArrayList(this.f18940);
                    this.f18939 |= 1;
                }
                this.f18940.addAll(protoBuf$VersionRequirementTable.requirement_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$VersionRequirementTable.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirementTable m12816() {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this);
        if ((this.f18939 & 1) == 1) {
            this.f18940 = Collections.unmodifiableList(this.f18940);
            this.f18939 &= -2;
        }
        protoBuf$VersionRequirementTable.requirement_ = this.f18940;
        return protoBuf$VersionRequirementTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12815((ProtoBuf$VersionRequirementTable) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = null;
        try {
            try {
                m12815((ProtoBuf$VersionRequirementTable) ProtoBuf$VersionRequirementTable.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$VersionRequirementTable = protoBuf$VersionRequirementTable2;
                    if (protoBuf$VersionRequirementTable != null) {
                        m12815(protoBuf$VersionRequirementTable);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$VersionRequirementTable != null) {
            }
            throw th;
        }
    }
}
