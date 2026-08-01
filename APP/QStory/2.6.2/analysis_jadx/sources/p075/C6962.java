package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4671;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6962 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$StringTable f18654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18655;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18656;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$QualifiedNameTable f18657;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Package f18658;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$PackageFragment protoBuf$PackageFragmentM12256 = m12256();
        if (protoBuf$PackageFragmentM12256.isInitialized()) {
            return protoBuf$PackageFragmentM12256;
        }
        throw new UninitializedMessageException(protoBuf$PackageFragmentM12256);
    }

    public final Object clone() {
        C6962 c6962 = new C6962();
        c6962.f18654 = ProtoBuf$StringTable.getDefaultInstance();
        c6962.f18657 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c6962.f18658 = ProtoBuf$Package.getDefaultInstance();
        c6962.f18656 = Collections.EMPTY_LIST;
        c6962.m12255(m12256());
        return c6962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12255(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.getDefaultInstance()) {
            return;
        }
        if (protoBuf$PackageFragment.hasStrings()) {
            ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
            if ((this.f18655 & 1) != 1 || this.f18654 == ProtoBuf$StringTable.getDefaultInstance()) {
                this.f18654 = strings;
            } else {
                C6953 c6953NewBuilder = ProtoBuf$StringTable.newBuilder(this.f18654);
                c6953NewBuilder.m12224(strings);
                this.f18654 = c6953NewBuilder.m12225();
            }
            this.f18655 |= 1;
        }
        if (protoBuf$PackageFragment.hasQualifiedNames()) {
            ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
            if ((this.f18655 & 2) != 2 || this.f18657 == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                this.f18657 = qualifiedNames;
            } else {
                C4671 c4671NewBuilder = ProtoBuf$QualifiedNameTable.newBuilder(this.f18657);
                c4671NewBuilder.m9301(qualifiedNames);
                this.f18657 = c4671NewBuilder.m9302();
            }
            this.f18655 |= 2;
        }
        if (protoBuf$PackageFragment.hasPackage()) {
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
            if ((this.f18655 & 4) != 4 || this.f18658 == ProtoBuf$Package.getDefaultInstance()) {
                this.f18658 = protoBuf$Package;
            } else {
                C6961 c6961NewBuilder = ProtoBuf$Package.newBuilder(this.f18658);
                c6961NewBuilder.m12253(protoBuf$Package);
                this.f18658 = c6961NewBuilder.m12254();
            }
            this.f18655 |= 4;
        }
        if (!protoBuf$PackageFragment.class__.isEmpty()) {
            if (this.f18656.isEmpty()) {
                this.f18656 = protoBuf$PackageFragment.class__;
                this.f18655 &= -9;
            } else {
                if ((this.f18655 & 8) != 8) {
                    this.f18656 = new ArrayList(this.f18656);
                    this.f18655 |= 8;
                }
                this.f18656.addAll(protoBuf$PackageFragment.class__);
            }
        }
        m9421(protoBuf$PackageFragment);
        this.f13804 = this.f13804.m9411(protoBuf$PackageFragment.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$PackageFragment m12256() {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
        int i = this.f18655;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$PackageFragment.strings_ = this.f18654;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$PackageFragment.qualifiedNames_ = this.f18657;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$PackageFragment.package_ = this.f18658;
        if ((this.f18655 & 8) == 8) {
            this.f18656 = Collections.unmodifiableList(this.f18656);
            this.f18655 &= -9;
        }
        protoBuf$PackageFragment.class__ = this.f18656;
        protoBuf$PackageFragment.bitField0_ = i2;
        return protoBuf$PackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12255((ProtoBuf$PackageFragment) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12255(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12255(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6962.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
