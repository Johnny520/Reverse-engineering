package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7785 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f18938;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$TypeTable protoBuf$TypeTableM12814 = m12814();
        if (protoBuf$TypeTableM12814.isInitialized()) {
            return protoBuf$TypeTableM12814;
        }
        throw new UninitializedMessageException(protoBuf$TypeTableM12814);
    }

    public final Object clone() {
        C7785 c7785 = new C7785();
        c7785.f18938 = Collections.EMPTY_LIST;
        c7785.f18936 = -1;
        c7785.m12813(m12814());
        return c7785;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12813(ProtoBuf$TypeTable protoBuf$TypeTable) {
        if (protoBuf$TypeTable == ProtoBuf$TypeTable.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$TypeTable.type_.isEmpty()) {
            if (this.f18938.isEmpty()) {
                this.f18938 = protoBuf$TypeTable.type_;
                this.f18937 &= -2;
            } else {
                if ((this.f18937 & 1) != 1) {
                    this.f18938 = new ArrayList(this.f18938);
                    this.f18937 |= 1;
                }
                this.f18938.addAll(protoBuf$TypeTable.type_);
            }
        }
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            this.f18937 |= 2;
            this.f18936 = firstNullable;
        }
        this.f14153 = this.f14153.m9960(protoBuf$TypeTable.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$TypeTable m12814() {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this);
        int i = this.f18937;
        if ((i & 1) == 1) {
            this.f18938 = Collections.unmodifiableList(this.f18938);
            this.f18937 &= -2;
        }
        protoBuf$TypeTable.type_ = this.f18938;
        int i2 = (i & 2) != 2 ? 0 : 1;
        protoBuf$TypeTable.firstNullable_ = this.f18936;
        protoBuf$TypeTable.bitField0_ = i2;
        return protoBuf$TypeTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12813((ProtoBuf$TypeTable) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$TypeTable protoBuf$TypeTable = null;
        try {
            try {
                m12813((ProtoBuf$TypeTable) ProtoBuf$TypeTable.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = (ProtoBuf$TypeTable) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeTable = protoBuf$TypeTable2;
                    if (protoBuf$TypeTable != null) {
                        m12813(protoBuf$TypeTable);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$TypeTable != null) {
            }
            throw th;
        }
    }
}
