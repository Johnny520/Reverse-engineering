package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7777 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f18888;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Contract protoBuf$ContractM12800 = m12800();
        if (protoBuf$ContractM12800.isInitialized()) {
            return protoBuf$ContractM12800;
        }
        throw new UninitializedMessageException(protoBuf$ContractM12800);
    }

    public final Object clone() {
        C7777 c7777 = new C7777();
        c7777.f18888 = Collections.EMPTY_LIST;
        c7777.m12799(m12800());
        return c7777;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12799(ProtoBuf$Contract protoBuf$Contract) {
        if (protoBuf$Contract == ProtoBuf$Contract.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$Contract.effect_.isEmpty()) {
            if (this.f18888.isEmpty()) {
                this.f18888 = protoBuf$Contract.effect_;
                this.f18887 &= -2;
            } else {
                if ((this.f18887 & 1) != 1) {
                    this.f18888 = new ArrayList(this.f18888);
                    this.f18887 |= 1;
                }
                this.f18888.addAll(protoBuf$Contract.effect_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$Contract.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Contract m12800() {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(this);
        if ((this.f18887 & 1) == 1) {
            this.f18888 = Collections.unmodifiableList(this.f18888);
            this.f18887 &= -2;
        }
        protoBuf$Contract.effect_ = this.f18888;
        return protoBuf$Contract;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12799((ProtoBuf$Contract) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Contract protoBuf$Contract = null;
        try {
            try {
                m12799((ProtoBuf$Contract) ProtoBuf$Contract.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Contract protoBuf$Contract2 = (ProtoBuf$Contract) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Contract = protoBuf$Contract2;
                    if (protoBuf$Contract != null) {
                        m12799(protoBuf$Contract);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Contract != null) {
            }
            throw th;
        }
    }
}
