package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7791 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f18988;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18989;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18990;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$VersionRequirementTable f18991;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f18992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18993;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Package protoBuf$PackageM12840 = m12840();
        if (protoBuf$PackageM12840.isInitialized()) {
            return protoBuf$PackageM12840;
        }
        throw new UninitializedMessageException(protoBuf$PackageM12840);
    }

    public final Object clone() {
        C7791 c7791 = new C7791();
        List list = Collections.EMPTY_LIST;
        c7791.f18988 = list;
        c7791.f18992 = list;
        c7791.f18993 = list;
        c7791.f18990 = ProtoBuf$TypeTable.getDefaultInstance();
        c7791.f18991 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        c7791.m12839(m12840());
        return c7791;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12839(ProtoBuf$Package protoBuf$Package) {
        if (protoBuf$Package == ProtoBuf$Package.getDefaultInstance()) {
            return;
        }
        if (!protoBuf$Package.function_.isEmpty()) {
            if (this.f18988.isEmpty()) {
                this.f18988 = protoBuf$Package.function_;
                this.f18989 &= -2;
            } else {
                if ((this.f18989 & 1) != 1) {
                    this.f18988 = new ArrayList(this.f18988);
                    this.f18989 |= 1;
                }
                this.f18988.addAll(protoBuf$Package.function_);
            }
        }
        if (!protoBuf$Package.property_.isEmpty()) {
            if (this.f18992.isEmpty()) {
                this.f18992 = protoBuf$Package.property_;
                this.f18989 &= -3;
            } else {
                if ((this.f18989 & 2) != 2) {
                    this.f18992 = new ArrayList(this.f18992);
                    this.f18989 |= 2;
                }
                this.f18992.addAll(protoBuf$Package.property_);
            }
        }
        if (!protoBuf$Package.typeAlias_.isEmpty()) {
            if (this.f18993.isEmpty()) {
                this.f18993 = protoBuf$Package.typeAlias_;
                this.f18989 &= -5;
            } else {
                if ((this.f18989 & 4) != 4) {
                    this.f18993 = new ArrayList(this.f18993);
                    this.f18989 |= 4;
                }
                this.f18993.addAll(protoBuf$Package.typeAlias_);
            }
        }
        if (protoBuf$Package.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
            if ((this.f18989 & 8) != 8 || this.f18990 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18990 = typeTable;
            } else {
                C7785 c7785NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18990);
                c7785NewBuilder.m12813(typeTable);
                this.f18990 = c7785NewBuilder.m12814();
            }
            this.f18989 |= 8;
        }
        if (protoBuf$Package.hasVersionRequirementTable()) {
            ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
            if ((this.f18989 & 16) != 16 || this.f18991 == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f18991 = versionRequirementTable;
            } else {
                C7786 c7786NewBuilder = ProtoBuf$VersionRequirementTable.newBuilder(this.f18991);
                c7786NewBuilder.m12815(versionRequirementTable);
                this.f18991 = c7786NewBuilder.m12816();
            }
            this.f18989 |= 16;
        }
        m9970(protoBuf$Package);
        this.f14153 = this.f14153.m9960(protoBuf$Package.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Package m12840() {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
        int i = this.f18989;
        if ((i & 1) == 1) {
            this.f18988 = Collections.unmodifiableList(this.f18988);
            this.f18989 &= -2;
        }
        protoBuf$Package.function_ = this.f18988;
        if ((this.f18989 & 2) == 2) {
            this.f18992 = Collections.unmodifiableList(this.f18992);
            this.f18989 &= -3;
        }
        protoBuf$Package.property_ = this.f18992;
        if ((this.f18989 & 4) == 4) {
            this.f18993 = Collections.unmodifiableList(this.f18993);
            this.f18989 &= -5;
        }
        protoBuf$Package.typeAlias_ = this.f18993;
        int i2 = (i & 8) != 8 ? 0 : 1;
        protoBuf$Package.typeTable_ = this.f18990;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        protoBuf$Package.versionRequirementTable_ = this.f18991;
        protoBuf$Package.bitField0_ = i2;
        return protoBuf$Package;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12839((ProtoBuf$Package) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Package protoBuf$Package = null;
        try {
            try {
                m12839((ProtoBuf$Package) ProtoBuf$Package.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Package protoBuf$Package2 = (ProtoBuf$Package) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Package = protoBuf$Package2;
                    if (protoBuf$Package != null) {
                        m12839(protoBuf$Package);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Package != null) {
            }
            throw th;
        }
    }
}
