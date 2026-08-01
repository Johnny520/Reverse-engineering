package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C5504;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7792 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$StringTable f18994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18995;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18996;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$QualifiedNameTable f18997;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Package f18998;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$PackageFragment protoBuf$PackageFragmentM12842 = m12842();
        if (protoBuf$PackageFragmentM12842.isInitialized()) {
            return protoBuf$PackageFragmentM12842;
        }
        throw new UninitializedMessageException(protoBuf$PackageFragmentM12842);
    }

    public final Object clone() {
        C7792 c7792 = new C7792();
        c7792.f18994 = ProtoBuf$StringTable.getDefaultInstance();
        c7792.f18997 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c7792.f18998 = ProtoBuf$Package.getDefaultInstance();
        c7792.f18996 = Collections.EMPTY_LIST;
        c7792.m12841(m12842());
        return c7792;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12841(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.getDefaultInstance()) {
            return;
        }
        if (protoBuf$PackageFragment.hasStrings()) {
            ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
            if ((this.f18995 & 1) != 1 || this.f18994 == ProtoBuf$StringTable.getDefaultInstance()) {
                this.f18994 = strings;
            } else {
                C7783 c7783NewBuilder = ProtoBuf$StringTable.newBuilder(this.f18994);
                c7783NewBuilder.m12811(strings);
                this.f18994 = c7783NewBuilder.m12812();
            }
            this.f18995 |= 1;
        }
        if (protoBuf$PackageFragment.hasQualifiedNames()) {
            ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
            if ((this.f18995 & 2) != 2 || this.f18997 == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                this.f18997 = qualifiedNames;
            } else {
                C5504 c5504NewBuilder = ProtoBuf$QualifiedNameTable.newBuilder(this.f18997);
                c5504NewBuilder.m9850(qualifiedNames);
                this.f18997 = c5504NewBuilder.m9851();
            }
            this.f18995 |= 2;
        }
        if (protoBuf$PackageFragment.hasPackage()) {
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
            if ((this.f18995 & 4) != 4 || this.f18998 == ProtoBuf$Package.getDefaultInstance()) {
                this.f18998 = protoBuf$Package;
            } else {
                C7791 c7791NewBuilder = ProtoBuf$Package.newBuilder(this.f18998);
                c7791NewBuilder.m12839(protoBuf$Package);
                this.f18998 = c7791NewBuilder.m12840();
            }
            this.f18995 |= 4;
        }
        if (!protoBuf$PackageFragment.class__.isEmpty()) {
            if (this.f18996.isEmpty()) {
                this.f18996 = protoBuf$PackageFragment.class__;
                this.f18995 &= -9;
            } else {
                if ((this.f18995 & 8) != 8) {
                    this.f18996 = new ArrayList(this.f18996);
                    this.f18995 |= 8;
                }
                this.f18996.addAll(protoBuf$PackageFragment.class__);
            }
        }
        m9970(protoBuf$PackageFragment);
        this.f14153 = this.f14153.m9960(protoBuf$PackageFragment.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$PackageFragment m12842() {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
        int i = this.f18995;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$PackageFragment.strings_ = this.f18994;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$PackageFragment.qualifiedNames_ = this.f18997;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$PackageFragment.package_ = this.f18998;
        if ((this.f18995 & 8) == 8) {
            this.f18996 = Collections.unmodifiableList(this.f18996);
            this.f18995 &= -9;
        }
        protoBuf$PackageFragment.class__ = this.f18996;
        protoBuf$PackageFragment.bitField0_ = i2;
        return protoBuf$PackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12841((ProtoBuf$PackageFragment) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = null;
        try {
            try {
                m12841((ProtoBuf$PackageFragment) ProtoBuf$PackageFragment.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$PackageFragment protoBuf$PackageFragment2 = (ProtoBuf$PackageFragment) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$PackageFragment = protoBuf$PackageFragment2;
                    if (protoBuf$PackageFragment != null) {
                        m12841(protoBuf$PackageFragment);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$PackageFragment != null) {
            }
            throw th;
        }
    }
}
