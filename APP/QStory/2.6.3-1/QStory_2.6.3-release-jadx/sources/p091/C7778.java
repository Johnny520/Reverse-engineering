package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7778 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18890;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18891;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f18892;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18893;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18894;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Constructor protoBuf$ConstructorM12802 = m12802();
        if (protoBuf$ConstructorM12802.isInitialized()) {
            return protoBuf$ConstructorM12802;
        }
        throw new UninitializedMessageException(protoBuf$ConstructorM12802);
    }

    public final Object clone() {
        C7778 c7778 = new C7778();
        c7778.f18889 = 6;
        List list = Collections.EMPTY_LIST;
        c7778.f18893 = list;
        c7778.f18894 = list;
        c7778.f18891 = list;
        c7778.f18892 = list;
        c7778.m12801(m12802());
        return c7778;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12801(ProtoBuf$Constructor protoBuf$Constructor) {
        if (protoBuf$Constructor == ProtoBuf$Constructor.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Constructor.hasFlags()) {
            int flags = protoBuf$Constructor.getFlags();
            this.f18890 |= 1;
            this.f18889 = flags;
        }
        if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
            if (this.f18893.isEmpty()) {
                this.f18893 = protoBuf$Constructor.valueParameter_;
                this.f18890 &= -3;
            } else {
                if ((this.f18890 & 2) != 2) {
                    this.f18893 = new ArrayList(this.f18893);
                    this.f18890 |= 2;
                }
                this.f18893.addAll(protoBuf$Constructor.valueParameter_);
            }
        }
        if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
            if (this.f18894.isEmpty()) {
                this.f18894 = protoBuf$Constructor.versionRequirement_;
                this.f18890 &= -5;
            } else {
                if ((this.f18890 & 4) != 4) {
                    this.f18894 = new ArrayList(this.f18894);
                    this.f18890 |= 4;
                }
                this.f18894.addAll(protoBuf$Constructor.versionRequirement_);
            }
        }
        if (!protoBuf$Constructor.compilerPluginData_.isEmpty()) {
            if (this.f18891.isEmpty()) {
                this.f18891 = protoBuf$Constructor.compilerPluginData_;
                this.f18890 &= -9;
            } else {
                if ((this.f18890 & 8) != 8) {
                    this.f18891 = new ArrayList(this.f18891);
                    this.f18890 |= 8;
                }
                this.f18891.addAll(protoBuf$Constructor.compilerPluginData_);
            }
        }
        if (!protoBuf$Constructor.annotation_.isEmpty()) {
            if (this.f18892.isEmpty()) {
                this.f18892 = protoBuf$Constructor.annotation_;
                this.f18890 &= -17;
            } else {
                if ((this.f18890 & 16) != 16) {
                    this.f18892 = new ArrayList(this.f18892);
                    this.f18890 |= 16;
                }
                this.f18892.addAll(protoBuf$Constructor.annotation_);
            }
        }
        m9970(protoBuf$Constructor);
        this.f14153 = this.f14153.m9960(protoBuf$Constructor.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Constructor m12802() {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
        int i = (this.f18890 & 1) != 1 ? 0 : 1;
        protoBuf$Constructor.flags_ = this.f18889;
        if ((this.f18890 & 2) == 2) {
            this.f18893 = Collections.unmodifiableList(this.f18893);
            this.f18890 &= -3;
        }
        protoBuf$Constructor.valueParameter_ = this.f18893;
        if ((this.f18890 & 4) == 4) {
            this.f18894 = Collections.unmodifiableList(this.f18894);
            this.f18890 &= -5;
        }
        protoBuf$Constructor.versionRequirement_ = this.f18894;
        if ((this.f18890 & 8) == 8) {
            this.f18891 = Collections.unmodifiableList(this.f18891);
            this.f18890 &= -9;
        }
        protoBuf$Constructor.compilerPluginData_ = this.f18891;
        if ((this.f18890 & 16) == 16) {
            this.f18892 = Collections.unmodifiableList(this.f18892);
            this.f18890 &= -17;
        }
        protoBuf$Constructor.annotation_ = this.f18892;
        protoBuf$Constructor.bitField0_ = i;
        return protoBuf$Constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12801((ProtoBuf$Constructor) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Constructor protoBuf$Constructor = null;
        try {
            try {
                m12801((ProtoBuf$Constructor) ProtoBuf$Constructor.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Constructor protoBuf$Constructor2 = (ProtoBuf$Constructor) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Constructor = protoBuf$Constructor2;
                    if (protoBuf$Constructor != null) {
                        m12801(protoBuf$Constructor);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Constructor != null) {
            }
            throw th;
        }
    }
}
