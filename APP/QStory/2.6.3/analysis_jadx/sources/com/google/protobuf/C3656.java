package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3656 extends AbstractC3658 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile boolean f11332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3593[] f11333;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3666[] f11334;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3656[] f11335;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3661 f11336;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3657[] f11337;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3656[] f11338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$FileDescriptorProto f11339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3663[] f11340;

    public C3656(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C3656[] c3656Arr, C3661 c3661) throws Descriptors$DescriptorValidationException {
        AbstractC3671 abstractC3671;
        this.f11336 = c3661;
        this.f11339 = descriptorProtos$FileDescriptorProto;
        this.f11338 = (C3656[]) c3656Arr.clone();
        this.f11332 = false;
        HashMap map = new HashMap();
        for (C3656 c3656 : c3656Arr) {
            map.put(c3656.f11339.getName(), c3656);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            abstractC3671 = null;
            if (i >= descriptorProtos$FileDescriptorProto.getPublicDependencyCount()) {
                C3656[] c3656Arr2 = new C3656[arrayList.size()];
                this.f11335 = c3656Arr2;
                arrayList.toArray(c3656Arr2);
                c3661.m7872(this, this.f11339.getPackage());
                this.f11340 = descriptorProtos$FileDescriptorProto.getMessageTypeCount() > 0 ? new C3663[descriptorProtos$FileDescriptorProto.getMessageTypeCount()] : AbstractC3592.f11217;
                for (int i2 = 0; i2 < descriptorProtos$FileDescriptorProto.getMessageTypeCount(); i2++) {
                    this.f11340[i2] = new C3663(descriptorProtos$FileDescriptorProto.getMessageType(i2), this, null);
                }
                this.f11334 = descriptorProtos$FileDescriptorProto.getEnumTypeCount() > 0 ? new C3666[descriptorProtos$FileDescriptorProto.getEnumTypeCount()] : AbstractC3592.f11215;
                for (int i3 = 0; i3 < descriptorProtos$FileDescriptorProto.getEnumTypeCount(); i3++) {
                    this.f11334[i3] = new C3666(descriptorProtos$FileDescriptorProto.getEnumType(i3), this, null);
                }
                this.f11333 = descriptorProtos$FileDescriptorProto.getServiceCount() > 0 ? new C3593[descriptorProtos$FileDescriptorProto.getServiceCount()] : AbstractC3592.f11214;
                for (int i4 = 0; i4 < descriptorProtos$FileDescriptorProto.getServiceCount(); i4++) {
                    this.f11333[i4] = new C3593(descriptorProtos$FileDescriptorProto.getService(i4), this);
                }
                this.f11337 = descriptorProtos$FileDescriptorProto.getExtensionCount() > 0 ? new C3657[descriptorProtos$FileDescriptorProto.getExtensionCount()] : AbstractC3592.f11216;
                for (int i5 = 0; i5 < descriptorProtos$FileDescriptorProto.getExtensionCount(); i5++) {
                    this.f11337[i5] = new C3657(descriptorProtos$FileDescriptorProto.getExtension(i5), this, null, i5, true);
                }
                return;
            }
            int publicDependency = descriptorProtos$FileDescriptorProto.getPublicDependency(i);
            if (publicDependency < 0 || publicDependency >= descriptorProtos$FileDescriptorProto.getDependencyCount()) {
                break;
            }
            C3656 c36562 = (C3656) map.get(descriptorProtos$FileDescriptorProto.getDependency(publicDependency));
            if (c36562 != null) {
                arrayList.add(c36562);
            }
            i++;
        }
        throw new Descriptors$DescriptorValidationException(this, "Invalid public dependency index.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C3656 m7844(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C3656[] c3656Arr) throws Descriptors$DescriptorValidationException {
        C3656 c3656 = new C3656(descriptorProtos$FileDescriptorProto, c3656Arr, new C3661(c3656Arr));
        for (C3663 c3663 : c3656.f11340) {
            c3663.m7874();
        }
        for (C3593 c3593 : c3656.f11333) {
            for (C3659 c3659 : c3593.f11223) {
                C3656 c36562 = c3659.f11357.f11224;
                C3661 c3661 = c36562.f11336;
                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = c3659.f11358;
                String inputType = descriptorProtos$MethodDescriptorProto.getInputType();
                Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter = Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY;
                boolean z = c3661.m7868(inputType, c3659, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C3663;
                AbstractC3671 abstractC3671 = null;
                if (!z) {
                    throw new Descriptors$DescriptorValidationException(c3659, "\"" + descriptorProtos$MethodDescriptorProto.getInputType() + "\" is not a message type.");
                }
                if (!(c36562.f11336.m7868(descriptorProtos$MethodDescriptorProto.getOutputType(), c3659, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C3663)) {
                    throw new Descriptors$DescriptorValidationException(c3659, "\"" + descriptorProtos$MethodDescriptorProto.getOutputType() + "\" is not a message type.");
                }
            }
        }
        for (C3657 c3657 : c3656.f11337) {
            C3657.m7851(c3657);
        }
        return c3656;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C3656 m7845(String[] strArr, C3656[] c3656Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(AbstractC3402.f11058);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(AbstractC3402.f11058);
        }
        try {
            DescriptorProtos$FileDescriptorProto from = DescriptorProtos$FileDescriptorProto.parseFrom(bytes);
            try {
                return m7844(from, c3656Arr);
            } catch (Descriptors$DescriptorValidationException e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return null;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11339.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11339.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7846() {
        try {
            m7847();
        } catch (Descriptors$DescriptorValidationException e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f11339.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7847() {
        if (this.f11332) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11332) {
                    return;
                }
                m7867(this.f11339.getOptions().getFeatures());
                for (C3663 c3663 : this.f11340) {
                    c3663.m7873();
                }
                for (C3666 c3666 : this.f11334) {
                    C3666.m7881(c3666);
                }
                for (C3593 c3593 : this.f11333) {
                    c3593.m7867(c3593.f11225.getOptions().getFeatures());
                    for (C3659 c3659 : c3593.f11223) {
                        c3659.m7867(c3659.f11358.getOptions().getFeatures());
                    }
                }
                for (C3657 c3657 : this.f11337) {
                    c3657.m7867(c3657.f11355.getOptions().getFeatures());
                }
                this.f11332 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final DescriptorProtos$Edition m7848() {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = this.f11339;
        String syntax = descriptorProtos$FileDescriptorProto.getSyntax();
        syntax.getClass();
        return !syntax.equals("proto3") ? !syntax.equals("editions") ? DescriptorProtos$Edition.EDITION_PROTO2 : descriptorProtos$FileDescriptorProto.getEdition() : DescriptorProtos$Edition.EDITION_PROTO3;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet mo7849() {
        DescriptorProtos$FeatureSet.C3273 c3273NewBuilder;
        if (m7848().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        if (m7848() == DescriptorProtos$Edition.EDITION_PROTO2 && this.f11339.getOptions().getJavaStringCheckUtf8()) {
            c3273NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c3273NewBuilder.setExtension(AbstractC3385.f11043, JavaFeaturesProto$JavaFeatures.newBuilder().setUtf8Validation(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY).build());
        } else {
            c3273NewBuilder = null;
        }
        return c3273NewBuilder != null ? c3273NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11339;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this;
    }

    public C3656(String str, C3663[] c3663Arr, C3666[] c3666Arr, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        C3661 c3661 = new C3661(new C3656[0]);
        this.f11336 = c3661;
        this.f11339 = descriptorProtos$FileDescriptorProto;
        this.f11338 = new C3656[0];
        this.f11335 = new C3656[0];
        this.f11332 = false;
        this.f11340 = c3663Arr;
        this.f11334 = c3666Arr;
        this.f11333 = AbstractC3592.f11214;
        this.f11337 = AbstractC3592.f11216;
        c3661.m7872(this, str);
    }
}
