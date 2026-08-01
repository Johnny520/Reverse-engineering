package p091;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5546;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7783 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC5550 f18934;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$StringTable protoBuf$StringTableM12812 = m12812();
        if (protoBuf$StringTableM12812.isInitialized()) {
            return protoBuf$StringTableM12812;
        }
        throw new UninitializedMessageException(protoBuf$StringTableM12812);
    }

    public final Object clone() {
        C7783 c7783 = new C7783();
        c7783.f18934 = C5546.f14126;
        c7783.m12811(m12812());
        return c7783;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12811(ProtoBuf$StringTable protoBuf$StringTable) {
        if (protoBuf$StringTable == ProtoBuf$StringTable.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$StringTable.string_.isEmpty()) {
            if (this.f18934.isEmpty()) {
                this.f18934 = protoBuf$StringTable.string_;
                this.f18933 &= -2;
            } else {
                if ((this.f18933 & 1) != 1) {
                    this.f18934 = new C5546(this.f18934);
                    this.f18933 |= 1;
                }
                this.f18934.addAll(protoBuf$StringTable.string_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$StringTable.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$StringTable m12812() {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(this);
        if ((this.f18933 & 1) == 1) {
            this.f18934 = this.f18934.mo9897();
            this.f18933 &= -2;
        }
        protoBuf$StringTable.string_ = this.f18934;
        return protoBuf$StringTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12811((ProtoBuf$StringTable) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$StringTable protoBuf$StringTable = null;
        try {
            try {
                m12811((ProtoBuf$StringTable) ProtoBuf$StringTable.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$StringTable protoBuf$StringTable2 = (ProtoBuf$StringTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$StringTable = protoBuf$StringTable2;
                    if (protoBuf$StringTable != null) {
                        m12811(protoBuf$StringTable);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$StringTable != null) {
            }
            throw th;
        }
    }
}
