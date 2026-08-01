package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4488 extends AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile boolean f11677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4425[] f11678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4498[] f11679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C4488[] f11680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4493 f11681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4489[] f11682;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4488[] f11683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$FileDescriptorProto f11684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4495[] f11685;

    public C4488(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C4488[] c4488Arr, C4493 c4493) throws Descriptors$DescriptorValidationException {
        AbstractC4503 abstractC4503;
        this.f11681 = c4493;
        this.f11684 = descriptorProtos$FileDescriptorProto;
        this.f11683 = (C4488[]) c4488Arr.clone();
        this.f11677 = false;
        HashMap map = new HashMap();
        for (C4488 c4488 : c4488Arr) {
            map.put(c4488.f11684.getName(), c4488);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            abstractC4503 = null;
            if (i >= descriptorProtos$FileDescriptorProto.getPublicDependencyCount()) {
                C4488[] c4488Arr2 = new C4488[arrayList.size()];
                this.f11680 = c4488Arr2;
                arrayList.toArray(c4488Arr2);
                c4493.m8431(this, this.f11684.getPackage());
                this.f11685 = descriptorProtos$FileDescriptorProto.getMessageTypeCount() > 0 ? new C4495[descriptorProtos$FileDescriptorProto.getMessageTypeCount()] : AbstractC4424.f11562;
                for (int i2 = 0; i2 < descriptorProtos$FileDescriptorProto.getMessageTypeCount(); i2++) {
                    this.f11685[i2] = new C4495(descriptorProtos$FileDescriptorProto.getMessageType(i2), this, null);
                }
                this.f11679 = descriptorProtos$FileDescriptorProto.getEnumTypeCount() > 0 ? new C4498[descriptorProtos$FileDescriptorProto.getEnumTypeCount()] : AbstractC4424.f11560;
                for (int i3 = 0; i3 < descriptorProtos$FileDescriptorProto.getEnumTypeCount(); i3++) {
                    this.f11679[i3] = new C4498(descriptorProtos$FileDescriptorProto.getEnumType(i3), this, null);
                }
                this.f11678 = descriptorProtos$FileDescriptorProto.getServiceCount() > 0 ? new C4425[descriptorProtos$FileDescriptorProto.getServiceCount()] : AbstractC4424.f11559;
                for (int i4 = 0; i4 < descriptorProtos$FileDescriptorProto.getServiceCount(); i4++) {
                    this.f11678[i4] = new C4425(descriptorProtos$FileDescriptorProto.getService(i4), this);
                }
                this.f11682 = descriptorProtos$FileDescriptorProto.getExtensionCount() > 0 ? new C4489[descriptorProtos$FileDescriptorProto.getExtensionCount()] : AbstractC4424.f11561;
                for (int i5 = 0; i5 < descriptorProtos$FileDescriptorProto.getExtensionCount(); i5++) {
                    this.f11682[i5] = new C4489(descriptorProtos$FileDescriptorProto.getExtension(i5), this, null, i5, true);
                }
                return;
            }
            int publicDependency = descriptorProtos$FileDescriptorProto.getPublicDependency(i);
            if (publicDependency < 0 || publicDependency >= descriptorProtos$FileDescriptorProto.getDependencyCount()) {
                break;
            }
            C4488 c44882 = (C4488) map.get(descriptorProtos$FileDescriptorProto.getDependency(publicDependency));
            if (c44882 != null) {
                arrayList.add(c44882);
            }
            i++;
        }
        throw new Descriptors$DescriptorValidationException(this, "Invalid public dependency index.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C4488 m8403(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C4488[] c4488Arr) throws Descriptors$DescriptorValidationException {
        C4488 c4488 = new C4488(descriptorProtos$FileDescriptorProto, c4488Arr, new C4493(c4488Arr));
        for (C4495 c4495 : c4488.f11685) {
            c4495.m8433();
        }
        for (C4425 c4425 : c4488.f11678) {
            for (C4491 c4491 : c4425.f11568) {
                C4488 c44882 = c4491.f11702.f11569;
                C4493 c4493 = c44882.f11681;
                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = c4491.f11703;
                String inputType = descriptorProtos$MethodDescriptorProto.getInputType();
                Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter = Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY;
                boolean z = c4493.m8427(inputType, c4491, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C4495;
                AbstractC4503 abstractC4503 = null;
                if (!z) {
                    throw new Descriptors$DescriptorValidationException(c4491, "\"" + descriptorProtos$MethodDescriptorProto.getInputType() + "\" is not a message type.");
                }
                if (!(c44882.f11681.m8427(descriptorProtos$MethodDescriptorProto.getOutputType(), c4491, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C4495)) {
                    throw new Descriptors$DescriptorValidationException(c4491, "\"" + descriptorProtos$MethodDescriptorProto.getOutputType() + "\" is not a message type.");
                }
            }
        }
        for (C4489 c4489 : c4488.f11682) {
            C4489.m8410(c4489);
        }
        return c4488;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C4488 m8404(String[] strArr, C4488[] c4488Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(AbstractC4234.f11403);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(AbstractC4234.f11403);
        }
        try {
            DescriptorProtos$FileDescriptorProto from = DescriptorProtos$FileDescriptorProto.parseFrom(bytes);
            try {
                return m8403(from, c4488Arr);
            } catch (Descriptors$DescriptorValidationException e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return null;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11684.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11684.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m8405() {
        try {
            m8406();
        } catch (Descriptors$DescriptorValidationException e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f11684.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m8406() {
        if (this.f11677) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11677) {
                    return;
                }
                m8426(this.f11684.getOptions().getFeatures());
                for (C4495 c4495 : this.f11685) {
                    c4495.m8432();
                }
                for (C4498 c4498 : this.f11679) {
                    C4498.m8440(c4498);
                }
                for (C4425 c4425 : this.f11678) {
                    c4425.m8426(c4425.f11570.getOptions().getFeatures());
                    for (C4491 c4491 : c4425.f11568) {
                        c4491.m8426(c4491.f11703.getOptions().getFeatures());
                    }
                }
                for (C4489 c4489 : this.f11682) {
                    c4489.m8426(c4489.f11700.getOptions().getFeatures());
                }
                this.f11677 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final DescriptorProtos$Edition m8407() {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = this.f11684;
        String syntax = descriptorProtos$FileDescriptorProto.getSyntax();
        syntax.getClass();
        return !syntax.equals("proto3") ? !syntax.equals("editions") ? DescriptorProtos$Edition.EDITION_PROTO2 : descriptorProtos$FileDescriptorProto.getEdition() : DescriptorProtos$Edition.EDITION_PROTO3;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet mo8408() {
        DescriptorProtos$FeatureSet.C4105 c4105NewBuilder;
        if (m8407().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        if (m8407() == DescriptorProtos$Edition.EDITION_PROTO2 && this.f11684.getOptions().getJavaStringCheckUtf8()) {
            c4105NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c4105NewBuilder.setExtension(AbstractC4217.f11388, JavaFeaturesProto$JavaFeatures.newBuilder().setUtf8Validation(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY).build());
        } else {
            c4105NewBuilder = null;
        }
        return c4105NewBuilder != null ? c4105NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11684;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this;
    }

    public C4488(String str, C4495[] c4495Arr, C4498[] c4498Arr, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        C4493 c4493 = new C4493(new C4488[0]);
        this.f11681 = c4493;
        this.f11684 = descriptorProtos$FileDescriptorProto;
        this.f11683 = new C4488[0];
        this.f11680 = new C4488[0];
        this.f11677 = false;
        this.f11685 = c4495Arr;
        this.f11679 = c4498Arr;
        this.f11678 = AbstractC4424.f11559;
        this.f11682 = AbstractC4424.f11561;
        c4493.m8431(this, str);
    }
}
