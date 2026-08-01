package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4669;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6952 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18582;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18583;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public List f18584;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f18585;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f18586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18587;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18588;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18589;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18590;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18591;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6952 m12221() {
        C6952 c6952 = new C6952();
        c6952.f18587 = 6;
        List list = Collections.EMPTY_LIST;
        c6952.f18592 = list;
        c6952.f18589 = ProtoBuf$Type.getDefaultInstance();
        c6952.f18586 = ProtoBuf$Type.getDefaultInstance();
        c6952.f18584 = list;
        c6952.f18583 = list;
        c6952.f18582 = list;
        return c6952;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$TypeAlias protoBuf$TypeAliasM12223 = m12223();
        if (protoBuf$TypeAliasM12223.isInitialized()) {
            return protoBuf$TypeAliasM12223;
        }
        throw new UninitializedMessageException(protoBuf$TypeAliasM12223);
    }

    public final Object clone() {
        C6952 c6952M12221 = m12221();
        c6952M12221.m12222(m12223());
        return c6952M12221;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12222(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeAlias.hasFlags()) {
            int flags = protoBuf$TypeAlias.getFlags();
            this.f18588 |= 1;
            this.f18587 = flags;
        }
        if (protoBuf$TypeAlias.hasName()) {
            int name = protoBuf$TypeAlias.getName();
            this.f18588 |= 2;
            this.f18591 = name;
        }
        if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
            if (this.f18592.isEmpty()) {
                this.f18592 = protoBuf$TypeAlias.typeParameter_;
                this.f18588 &= -5;
            } else {
                if ((this.f18588 & 4) != 4) {
                    this.f18592 = new ArrayList(this.f18592);
                    this.f18588 |= 4;
                }
                this.f18592.addAll(protoBuf$TypeAlias.typeParameter_);
            }
        }
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            if ((this.f18588 & 8) != 8 || this.f18589 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18589 = underlyingType;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f18589);
                c4669NewBuilder.m9297(underlyingType);
                this.f18589 = c4669NewBuilder.m9298();
            }
            this.f18588 |= 8;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            int underlyingTypeId = protoBuf$TypeAlias.getUnderlyingTypeId();
            this.f18588 |= 16;
            this.f18590 = underlyingTypeId;
        }
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            if ((this.f18588 & 32) != 32 || this.f18586 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18586 = expandedType;
            } else {
                C4669 c4669NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18586);
                c4669NewBuilder2.m9297(expandedType);
                this.f18586 = c4669NewBuilder2.m9298();
            }
            this.f18588 |= 32;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            int expandedTypeId = protoBuf$TypeAlias.getExpandedTypeId();
            this.f18588 |= 64;
            this.f18585 = expandedTypeId;
        }
        if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
            if (this.f18584.isEmpty()) {
                this.f18584 = protoBuf$TypeAlias.annotation_;
                this.f18588 &= -129;
            } else {
                if ((this.f18588 & 128) != 128) {
                    this.f18584 = new ArrayList(this.f18584);
                    this.f18588 |= 128;
                }
                this.f18584.addAll(protoBuf$TypeAlias.annotation_);
            }
        }
        if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
            if (this.f18583.isEmpty()) {
                this.f18583 = protoBuf$TypeAlias.versionRequirement_;
                this.f18588 &= -257;
            } else {
                if ((this.f18588 & 256) != 256) {
                    this.f18583 = new ArrayList(this.f18583);
                    this.f18588 |= 256;
                }
                this.f18583.addAll(protoBuf$TypeAlias.versionRequirement_);
            }
        }
        if (!protoBuf$TypeAlias.compilerPluginData_.isEmpty()) {
            if (this.f18582.isEmpty()) {
                this.f18582 = protoBuf$TypeAlias.compilerPluginData_;
                this.f18588 &= -513;
            } else {
                if ((this.f18588 & 512) != 512) {
                    this.f18582 = new ArrayList(this.f18582);
                    this.f18588 |= 512;
                }
                this.f18582.addAll(protoBuf$TypeAlias.compilerPluginData_);
            }
        }
        m9421(protoBuf$TypeAlias);
        this.f13804 = this.f13804.m9411(protoBuf$TypeAlias.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias m12223() {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
        int i = this.f18588;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeAlias.flags_ = this.f18587;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeAlias.name_ = this.f18591;
        if ((this.f18588 & 4) == 4) {
            this.f18592 = Collections.unmodifiableList(this.f18592);
            this.f18588 &= -5;
        }
        protoBuf$TypeAlias.typeParameter_ = this.f18592;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$TypeAlias.underlyingType_ = this.f18589;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$TypeAlias.underlyingTypeId_ = this.f18590;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$TypeAlias.expandedType_ = this.f18586;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$TypeAlias.expandedTypeId_ = this.f18585;
        if ((this.f18588 & 128) == 128) {
            this.f18584 = Collections.unmodifiableList(this.f18584);
            this.f18588 &= -129;
        }
        protoBuf$TypeAlias.annotation_ = this.f18584;
        if ((this.f18588 & 256) == 256) {
            this.f18583 = Collections.unmodifiableList(this.f18583);
            this.f18588 &= -257;
        }
        protoBuf$TypeAlias.versionRequirement_ = this.f18583;
        if ((this.f18588 & 512) == 512) {
            this.f18582 = Collections.unmodifiableList(this.f18582);
            this.f18588 &= -513;
        }
        protoBuf$TypeAlias.compilerPluginData_ = this.f18582;
        protoBuf$TypeAlias.bitField0_ = i2;
        return protoBuf$TypeAlias;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12222((ProtoBuf$TypeAlias) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716 mo9281(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12222(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12222(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6952.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
