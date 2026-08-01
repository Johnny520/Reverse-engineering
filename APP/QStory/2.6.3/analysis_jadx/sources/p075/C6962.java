package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6962 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f18643;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18645;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$VersionRequirementTable f18646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18648;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Package protoBuf$PackageM12281 = m12281();
        if (protoBuf$PackageM12281.isInitialized()) {
            return protoBuf$PackageM12281;
        }
        throw new UninitializedMessageException(protoBuf$PackageM12281);
    }

    public final Object clone() {
        C6962 c6962 = new C6962();
        List list = Collections.EMPTY_LIST;
        c6962.f18643 = list;
        c6962.f18647 = list;
        c6962.f18648 = list;
        c6962.f18645 = ProtoBuf$TypeTable.getDefaultInstance();
        c6962.f18646 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        c6962.m12280(m12281());
        return c6962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12280(ProtoBuf$Package protoBuf$Package) {
        if (protoBuf$Package == ProtoBuf$Package.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$Package.function_.isEmpty()) {
            if (this.f18643.isEmpty()) {
                this.f18643 = protoBuf$Package.function_;
                this.f18644 &= -2;
            } else {
                if ((this.f18644 & 1) != 1) {
                    this.f18643 = new ArrayList(this.f18643);
                    this.f18644 |= 1;
                }
                this.f18643.addAll(protoBuf$Package.function_);
            }
        }
        if (!protoBuf$Package.property_.isEmpty()) {
            if (this.f18647.isEmpty()) {
                this.f18647 = protoBuf$Package.property_;
                this.f18644 &= -3;
            } else {
                if ((this.f18644 & 2) != 2) {
                    this.f18647 = new ArrayList(this.f18647);
                    this.f18644 |= 2;
                }
                this.f18647.addAll(protoBuf$Package.property_);
            }
        }
        if (!protoBuf$Package.typeAlias_.isEmpty()) {
            if (this.f18648.isEmpty()) {
                this.f18648 = protoBuf$Package.typeAlias_;
                this.f18644 &= -5;
            } else {
                if ((this.f18644 & 4) != 4) {
                    this.f18648 = new ArrayList(this.f18648);
                    this.f18644 |= 4;
                }
                this.f18648.addAll(protoBuf$Package.typeAlias_);
            }
        }
        if (protoBuf$Package.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
            if ((this.f18644 & 8) != 8 || this.f18645 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18645 = typeTable;
            } else {
                C6956 c6956NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18645);
                c6956NewBuilder.m12254(typeTable);
                this.f18645 = c6956NewBuilder.m12255();
            }
            this.f18644 |= 8;
        }
        if (protoBuf$Package.hasVersionRequirementTable()) {
            ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
            if ((this.f18644 & 16) != 16 || this.f18646 == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f18646 = versionRequirementTable;
            } else {
                C6957 c6957NewBuilder = ProtoBuf$VersionRequirementTable.newBuilder(this.f18646);
                c6957NewBuilder.m12256(versionRequirementTable);
                this.f18646 = c6957NewBuilder.m12257();
            }
            this.f18644 |= 16;
        }
        m9411(protoBuf$Package);
        this.f13808 = this.f13808.m9401(protoBuf$Package.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Package m12281() {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
        int i = this.f18644;
        if ((i & 1) == 1) {
            this.f18643 = Collections.unmodifiableList(this.f18643);
            this.f18644 &= -2;
        }
        protoBuf$Package.function_ = this.f18643;
        if ((this.f18644 & 2) == 2) {
            this.f18647 = Collections.unmodifiableList(this.f18647);
            this.f18644 &= -3;
        }
        protoBuf$Package.property_ = this.f18647;
        if ((this.f18644 & 4) == 4) {
            this.f18648 = Collections.unmodifiableList(this.f18648);
            this.f18644 &= -5;
        }
        protoBuf$Package.typeAlias_ = this.f18648;
        int i2 = (i & 8) != 8 ? 0 : 1;
        protoBuf$Package.typeTable_ = this.f18645;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        protoBuf$Package.versionRequirementTable_ = this.f18646;
        protoBuf$Package.bitField0_ = i2;
        return protoBuf$Package;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12280((ProtoBuf$Package) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12280(r3)
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
            r2.m12280(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6962.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
