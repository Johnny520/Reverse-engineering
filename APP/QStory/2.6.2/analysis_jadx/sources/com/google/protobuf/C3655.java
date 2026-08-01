package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3655 extends AbstractC3657 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public volatile boolean f11327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3592[] f11328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3665[] f11329;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3655[] f11330;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3660 f11331;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3656[] f11332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3655[] f11333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$FileDescriptorProto f11334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3662[] f11335;

    public C3655(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C3655[] c3655Arr, C3660 c3660) throws Descriptors$DescriptorValidationException {
        AbstractC3670 abstractC3670;
        this.f11331 = c3660;
        this.f11334 = descriptorProtos$FileDescriptorProto;
        this.f11333 = (C3655[]) c3655Arr.clone();
        this.f11327 = false;
        HashMap map = new HashMap();
        for (C3655 c3655 : c3655Arr) {
            map.put(c3655.f11334.getName(), c3655);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            abstractC3670 = null;
            if (i >= descriptorProtos$FileDescriptorProto.getPublicDependencyCount()) {
                C3655[] c3655Arr2 = new C3655[arrayList.size()];
                this.f11330 = c3655Arr2;
                arrayList.toArray(c3655Arr2);
                c3660.m7885(this, this.f11334.getPackage());
                this.f11335 = descriptorProtos$FileDescriptorProto.getMessageTypeCount() > 0 ? new C3662[descriptorProtos$FileDescriptorProto.getMessageTypeCount()] : AbstractC3591.f11212;
                for (int i2 = 0; i2 < descriptorProtos$FileDescriptorProto.getMessageTypeCount(); i2++) {
                    this.f11335[i2] = new C3662(descriptorProtos$FileDescriptorProto.getMessageType(i2), this, null);
                }
                this.f11329 = descriptorProtos$FileDescriptorProto.getEnumTypeCount() > 0 ? new C3665[descriptorProtos$FileDescriptorProto.getEnumTypeCount()] : AbstractC3591.f11210;
                for (int i3 = 0; i3 < descriptorProtos$FileDescriptorProto.getEnumTypeCount(); i3++) {
                    this.f11329[i3] = new C3665(descriptorProtos$FileDescriptorProto.getEnumType(i3), this, null);
                }
                this.f11328 = descriptorProtos$FileDescriptorProto.getServiceCount() > 0 ? new C3592[descriptorProtos$FileDescriptorProto.getServiceCount()] : AbstractC3591.f11209;
                for (int i4 = 0; i4 < descriptorProtos$FileDescriptorProto.getServiceCount(); i4++) {
                    this.f11328[i4] = new C3592(descriptorProtos$FileDescriptorProto.getService(i4), this);
                }
                this.f11332 = descriptorProtos$FileDescriptorProto.getExtensionCount() > 0 ? new C3656[descriptorProtos$FileDescriptorProto.getExtensionCount()] : AbstractC3591.f11211;
                for (int i5 = 0; i5 < descriptorProtos$FileDescriptorProto.getExtensionCount(); i5++) {
                    this.f11332[i5] = new C3656(descriptorProtos$FileDescriptorProto.getExtension(i5), this, null, i5, true);
                }
                return;
            }
            int publicDependency = descriptorProtos$FileDescriptorProto.getPublicDependency(i);
            if (publicDependency < 0 || publicDependency >= descriptorProtos$FileDescriptorProto.getDependencyCount()) {
                break;
            }
            C3655 c36552 = (C3655) map.get(descriptorProtos$FileDescriptorProto.getDependency(publicDependency));
            if (c36552 != null) {
                arrayList.add(c36552);
            }
            i++;
        }
        throw new Descriptors$DescriptorValidationException(this, "Invalid public dependency index.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C3655 m7857(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto, C3655[] c3655Arr) throws Descriptors$DescriptorValidationException {
        C3655 c3655 = new C3655(descriptorProtos$FileDescriptorProto, c3655Arr, new C3660(c3655Arr));
        for (C3662 c3662 : c3655.f11335) {
            c3662.m7887();
        }
        for (C3592 c3592 : c3655.f11328) {
            for (C3658 c3658 : c3592.f11218) {
                C3655 c36552 = c3658.f11352.f11219;
                C3660 c3660 = c36552.f11331;
                DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = c3658.f11353;
                String inputType = descriptorProtos$MethodDescriptorProto.getInputType();
                Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter = Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY;
                boolean z = c3660.m7881(inputType, c3658, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C3662;
                AbstractC3670 abstractC3670 = null;
                if (!z) {
                    throw new Descriptors$DescriptorValidationException(c3658, "\"" + descriptorProtos$MethodDescriptorProto.getInputType() + "\" is not a message type.");
                }
                if (!(c36552.f11331.m7881(descriptorProtos$MethodDescriptorProto.getOutputType(), c3658, descriptors$FileDescriptorTables$SearchFilter, false) instanceof C3662)) {
                    throw new Descriptors$DescriptorValidationException(c3658, "\"" + descriptorProtos$MethodDescriptorProto.getOutputType() + "\" is not a message type.");
                }
            }
        }
        for (C3656 c3656 : c3655.f11332) {
            C3656.m7864(c3656);
        }
        return c3655;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C3655 m7858(String[] strArr, C3655[] c3655Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(AbstractC3401.f11053);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(AbstractC3401.f11053);
        }
        try {
            DescriptorProtos$FileDescriptorProto from = DescriptorProtos$FileDescriptorProto.parseFrom(bytes);
            try {
                return m7857(from, c3655Arr);
            } catch (Descriptors$DescriptorValidationException e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return null;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11334.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11334.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7859() {
        try {
            m7860();
        } catch (Descriptors$DescriptorValidationException e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f11334.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7860() {
        if (this.f11327) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11327) {
                    return;
                }
                m7880(this.f11334.getOptions().getFeatures());
                for (C3662 c3662 : this.f11335) {
                    c3662.m7886();
                }
                for (C3665 c3665 : this.f11329) {
                    C3665.m7894(c3665);
                }
                for (C3592 c3592 : this.f11328) {
                    c3592.m7880(c3592.f11220.getOptions().getFeatures());
                    for (C3658 c3658 : c3592.f11218) {
                        c3658.m7880(c3658.f11353.getOptions().getFeatures());
                    }
                }
                for (C3656 c3656 : this.f11332) {
                    c3656.m7880(c3656.f11350.getOptions().getFeatures());
                }
                this.f11327 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final DescriptorProtos$Edition m7861() {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = this.f11334;
        String syntax = descriptorProtos$FileDescriptorProto.getSyntax();
        syntax.getClass();
        return !syntax.equals("proto3") ? !syntax.equals("editions") ? DescriptorProtos$Edition.EDITION_PROTO2 : descriptorProtos$FileDescriptorProto.getEdition() : DescriptorProtos$Edition.EDITION_PROTO3;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet mo7862() {
        DescriptorProtos$FeatureSet.C3272 c3272NewBuilder;
        if (m7861().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        if (m7861() == DescriptorProtos$Edition.EDITION_PROTO2 && this.f11334.getOptions().getJavaStringCheckUtf8()) {
            c3272NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c3272NewBuilder.setExtension(AbstractC3384.f11038, JavaFeaturesProto$JavaFeatures.newBuilder().setUtf8Validation(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY).build());
        } else {
            c3272NewBuilder = null;
        }
        return c3272NewBuilder != null ? c3272NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11334;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this;
    }

    public C3655(String str, C3662[] c3662Arr, C3665[] c3665Arr, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        C3660 c3660 = new C3660(new C3655[0]);
        this.f11331 = c3660;
        this.f11334 = descriptorProtos$FileDescriptorProto;
        this.f11333 = new C3655[0];
        this.f11330 = new C3655[0];
        this.f11327 = false;
        this.f11335 = c3662Arr;
        this.f11329 = c3665Arr;
        this.f11328 = AbstractC3591.f11209;
        this.f11332 = AbstractC3591.f11211;
        c3660.m7885(this, str);
    }
}
