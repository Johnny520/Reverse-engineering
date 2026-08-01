package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6961 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f18648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$VersionRequirementTable f18651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18653;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Package protoBuf$PackageM12254 = m12254();
        if (protoBuf$PackageM12254.isInitialized()) {
            return protoBuf$PackageM12254;
        }
        throw new UninitializedMessageException(protoBuf$PackageM12254);
    }

    public final Object clone() {
        C6961 c6961 = new C6961();
        List list = Collections.EMPTY_LIST;
        c6961.f18648 = list;
        c6961.f18652 = list;
        c6961.f18653 = list;
        c6961.f18650 = ProtoBuf$TypeTable.getDefaultInstance();
        c6961.f18651 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        c6961.m12253(m12254());
        return c6961;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12253(ProtoBuf$Package protoBuf$Package) {
        if (protoBuf$Package == ProtoBuf$Package.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$Package.function_.isEmpty()) {
            if (this.f18648.isEmpty()) {
                this.f18648 = protoBuf$Package.function_;
                this.f18649 &= -2;
            } else {
                if ((this.f18649 & 1) != 1) {
                    this.f18648 = new ArrayList(this.f18648);
                    this.f18649 |= 1;
                }
                this.f18648.addAll(protoBuf$Package.function_);
            }
        }
        if (!protoBuf$Package.property_.isEmpty()) {
            if (this.f18652.isEmpty()) {
                this.f18652 = protoBuf$Package.property_;
                this.f18649 &= -3;
            } else {
                if ((this.f18649 & 2) != 2) {
                    this.f18652 = new ArrayList(this.f18652);
                    this.f18649 |= 2;
                }
                this.f18652.addAll(protoBuf$Package.property_);
            }
        }
        if (!protoBuf$Package.typeAlias_.isEmpty()) {
            if (this.f18653.isEmpty()) {
                this.f18653 = protoBuf$Package.typeAlias_;
                this.f18649 &= -5;
            } else {
                if ((this.f18649 & 4) != 4) {
                    this.f18653 = new ArrayList(this.f18653);
                    this.f18649 |= 4;
                }
                this.f18653.addAll(protoBuf$Package.typeAlias_);
            }
        }
        if (protoBuf$Package.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
            if ((this.f18649 & 8) != 8 || this.f18650 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18650 = typeTable;
            } else {
                C6955 c6955NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18650);
                c6955NewBuilder.m12226(typeTable);
                this.f18650 = c6955NewBuilder.m12227();
            }
            this.f18649 |= 8;
        }
        if (protoBuf$Package.hasVersionRequirementTable()) {
            ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
            if ((this.f18649 & 16) != 16 || this.f18651 == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f18651 = versionRequirementTable;
            } else {
                C6956 c6956NewBuilder = ProtoBuf$VersionRequirementTable.newBuilder(this.f18651);
                c6956NewBuilder.m12228(versionRequirementTable);
                this.f18651 = c6956NewBuilder.m12229();
            }
            this.f18649 |= 16;
        }
        m9421(protoBuf$Package);
        this.f13804 = this.f13804.m9411(protoBuf$Package.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Package m12254() {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
        int i = this.f18649;
        if ((i & 1) == 1) {
            this.f18648 = Collections.unmodifiableList(this.f18648);
            this.f18649 &= -2;
        }
        protoBuf$Package.function_ = this.f18648;
        if ((this.f18649 & 2) == 2) {
            this.f18652 = Collections.unmodifiableList(this.f18652);
            this.f18649 &= -3;
        }
        protoBuf$Package.property_ = this.f18652;
        if ((this.f18649 & 4) == 4) {
            this.f18653 = Collections.unmodifiableList(this.f18653);
            this.f18649 &= -5;
        }
        protoBuf$Package.typeAlias_ = this.f18653;
        int i2 = (i & 8) != 8 ? 0 : 1;
        protoBuf$Package.typeTable_ = this.f18650;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        protoBuf$Package.versionRequirementTable_ = this.f18651;
        protoBuf$Package.bitField0_ = i2;
        return protoBuf$Package;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12253((ProtoBuf$Package) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12253(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12253(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6961.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
