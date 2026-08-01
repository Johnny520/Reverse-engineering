package p091;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7779 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC5542 f18895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18897;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginDataM12804 = m12804();
        if (protoBuf$CompilerPluginDataM12804.isInitialized()) {
            return protoBuf$CompilerPluginDataM12804;
        }
        throw new UninitializedMessageException(protoBuf$CompilerPluginDataM12804);
    }

    public final Object clone() {
        C7779 c7779 = new C7779();
        c7779.f18895 = AbstractC5542.f14119;
        c7779.m12803(m12804());
        return c7779;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12803(ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData) {
        if (protoBuf$CompilerPluginData == ProtoBuf$CompilerPluginData.getDefaultInstance()) {
            return;
        }
        if (protoBuf$CompilerPluginData.hasPluginId()) {
            int pluginId = protoBuf$CompilerPluginData.getPluginId();
            this.f18896 |= 1;
            this.f18897 = pluginId;
        }
        if (protoBuf$CompilerPluginData.hasData()) {
            AbstractC5542 data = protoBuf$CompilerPluginData.getData();
            data.getClass();
            this.f18896 |= 2;
            this.f18895 = data;
        }
        this.f14153 = this.f14153.m9960(protoBuf$CompilerPluginData.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$CompilerPluginData m12804() {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData = new ProtoBuf$CompilerPluginData(this);
        int i = this.f18896;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$CompilerPluginData.pluginId_ = this.f18897;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$CompilerPluginData.data_ = this.f18895;
        protoBuf$CompilerPluginData.bitField0_ = i2;
        return protoBuf$CompilerPluginData;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12803((ProtoBuf$CompilerPluginData) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData = null;
        try {
            try {
                m12803((ProtoBuf$CompilerPluginData) ProtoBuf$CompilerPluginData.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$CompilerPluginData protoBuf$CompilerPluginData2 = (ProtoBuf$CompilerPluginData) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$CompilerPluginData = protoBuf$CompilerPluginData2;
                    if (protoBuf$CompilerPluginData != null) {
                        m12803(protoBuf$CompilerPluginData);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$CompilerPluginData != null) {
            }
            throw th;
        }
    }
}
