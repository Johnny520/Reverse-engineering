package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4672;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6963 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$StringTable f18649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$QualifiedNameTable f18652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Package f18653;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$PackageFragment protoBuf$PackageFragmentM12283 = m12283();
        if (protoBuf$PackageFragmentM12283.isInitialized()) {
            return protoBuf$PackageFragmentM12283;
        }
        throw new UninitializedMessageException(protoBuf$PackageFragmentM12283);
    }

    public final Object clone() {
        C6963 c6963 = new C6963();
        c6963.f18649 = ProtoBuf$StringTable.getDefaultInstance();
        c6963.f18652 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c6963.f18653 = ProtoBuf$Package.getDefaultInstance();
        c6963.f18651 = Collections.EMPTY_LIST;
        c6963.m12282(m12283());
        return c6963;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12282(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.getDefaultInstance()) {
            return;
        }
        if (protoBuf$PackageFragment.hasStrings()) {
            ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
            if ((this.f18650 & 1) != 1 || this.f18649 == ProtoBuf$StringTable.getDefaultInstance()) {
                this.f18649 = strings;
            } else {
                C6954 c6954NewBuilder = ProtoBuf$StringTable.newBuilder(this.f18649);
                c6954NewBuilder.m12252(strings);
                this.f18649 = c6954NewBuilder.m12253();
            }
            this.f18650 |= 1;
        }
        if (protoBuf$PackageFragment.hasQualifiedNames()) {
            ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
            if ((this.f18650 & 2) != 2 || this.f18652 == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                this.f18652 = qualifiedNames;
            } else {
                C4672 c4672NewBuilder = ProtoBuf$QualifiedNameTable.newBuilder(this.f18652);
                c4672NewBuilder.m9291(qualifiedNames);
                this.f18652 = c4672NewBuilder.m9292();
            }
            this.f18650 |= 2;
        }
        if (protoBuf$PackageFragment.hasPackage()) {
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
            if ((this.f18650 & 4) != 4 || this.f18653 == ProtoBuf$Package.getDefaultInstance()) {
                this.f18653 = protoBuf$Package;
            } else {
                C6962 c6962NewBuilder = ProtoBuf$Package.newBuilder(this.f18653);
                c6962NewBuilder.m12280(protoBuf$Package);
                this.f18653 = c6962NewBuilder.m12281();
            }
            this.f18650 |= 4;
        }
        if (!protoBuf$PackageFragment.class__.isEmpty()) {
            if (this.f18651.isEmpty()) {
                this.f18651 = protoBuf$PackageFragment.class__;
                this.f18650 &= -9;
            } else {
                if ((this.f18650 & 8) != 8) {
                    this.f18651 = new ArrayList(this.f18651);
                    this.f18650 |= 8;
                }
                this.f18651.addAll(protoBuf$PackageFragment.class__);
            }
        }
        m9411(protoBuf$PackageFragment);
        this.f13808 = this.f13808.m9401(protoBuf$PackageFragment.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$PackageFragment m12283() {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
        int i = this.f18650;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$PackageFragment.strings_ = this.f18649;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$PackageFragment.qualifiedNames_ = this.f18652;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$PackageFragment.package_ = this.f18653;
        if ((this.f18650 & 8) == 8) {
            this.f18651 = Collections.unmodifiableList(this.f18651);
            this.f18650 &= -9;
        }
        protoBuf$PackageFragment.class__ = this.f18651;
        protoBuf$PackageFragment.bitField0_ = i2;
        return protoBuf$PackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12282((ProtoBuf$PackageFragment) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12282(r3)
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
            r2.m12282(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6963.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
