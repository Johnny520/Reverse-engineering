package com.google.protobuf;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FeatureSetDefaults;
import java.util.Iterator;
import java.util.logging.Logger;
import p352.C9620;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile DescriptorProtos$FeatureSet f11701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract AbstractC4490 mo8358();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract String mo8359();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract String mo8360();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract C4488 mo8361();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet m8425() {
        if (this.f11701 == null && (mo8361().m8407() == DescriptorProtos$Edition.EDITION_PROTO2 || mo8361().m8407() == DescriptorProtos$Edition.EDITION_PROTO3)) {
            mo8361().m8405();
        }
        if (this.f11701 != null) {
            return this.f11701;
        }
        C3466.m5903(AbstractC0900.m718("Features not yet loaded for ", mo8360(), "."));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public DescriptorProtos$FeatureSet mo8408() {
        return DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract InterfaceC4285 mo8362();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m8426(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetMo8408;
        Object[] objArr;
        DescriptorProtos$FeatureSet.C4105 builder;
        AbstractC4490 abstractC4490Mo8358 = mo8358();
        DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault = null;
        Object[] objArr2 = 0;
        if (abstractC4490Mo8358 == null || !descriptorProtos$FeatureSet.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
            descriptorProtos$FeatureSetMo8408 = null;
        } else {
            descriptorProtos$FeatureSetMo8408 = mo8408();
            if (descriptorProtos$FeatureSetMo8408.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
                this.f11701 = abstractC4490Mo8358.f11701;
                mo8420();
                return;
            }
        }
        Iterator<C4489> it = descriptorProtos$FeatureSet.getExtensionFields().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                objArr = false;
                break;
            }
            C4489 next = it.next();
            int number = next.f11700.getNumber();
            C4448 c4448 = AbstractC4217.f11388;
            if (number == c4448.mo8350().f11700.getNumber() && next != c4448.mo8350()) {
                objArr = true;
                break;
            }
        }
        boolean z = !descriptorProtos$FeatureSet.getUnknownFields().isEmpty() && descriptorProtos$FeatureSet.getUnknownFields().hasField(AbstractC4217.f11388.mo8350().f11700.getNumber());
        if (objArr != false || z) {
            C4525 c4525 = new C4525();
            c4525.m8505(AbstractC4217.f11388);
            try {
                descriptorProtos$FeatureSet = DescriptorProtos$FeatureSet.parseFrom(descriptorProtos$FeatureSet.toByteString(), c4525);
            } catch (InvalidProtocolBufferException e) {
                throw new Descriptors$DescriptorValidationException(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        if (abstractC4490Mo8358 == null) {
            DescriptorProtos$Edition descriptorProtos$EditionM8407 = mo8361().m8407();
            Logger logger = AbstractC4424.f11564;
            DescriptorProtos$FeatureSetDefaults.getDescriptor();
            C4448 c44482 = AbstractC4217.f11388;
            if (AbstractC4424.f11567 == null) {
                synchronized (AbstractC4424.class) {
                    if (AbstractC4424.f11567 == null) {
                        try {
                            C4525 c45252 = new C4525();
                            c45252.m8505(AbstractC4217.f11388);
                            AbstractC4424.f11567 = DescriptorProtos$FeatureSetDefaults.parseFrom("\n'\u0018\u0084\u0007\"\u0003Ê>\u0000*\u001d\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u00028\u0002@\u0001Ê>\n\b\u0001\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018ç\u0007\"\u0003Ê>\u0000*\u001d\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0002@\u0001Ê>\n\b\u0000\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\r8\u0002@\u0001Ê>\u0006\u0018\u0000 \u0001(\u0003\n'\u0018é\u0007\"\u001b\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0001@\u0002Ê>\b\b\u0000\u0010\u0001\u0018\u0000(\u0001*\u0005Ê>\u0002 \u0000 æ\u0007(é\u0007".getBytes(AbstractC4234.f11403), c45252);
                        } catch (Exception e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
            }
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = AbstractC4424.f11567;
            if (descriptorProtos$EditionM8407.getNumber() < descriptorProtos$FeatureSetDefaults.getMinimumEdition().getNumber()) {
                StringBuilder sb = new StringBuilder("Edition ");
                sb.append(descriptorProtos$EditionM8407);
                DescriptorProtos$Edition minimumEdition = descriptorProtos$FeatureSetDefaults.getMinimumEdition();
                sb.append(" is lower than the minimum supported edition ");
                sb.append(minimumEdition);
                sb.append("!");
                throw new IllegalArgumentException(sb.toString());
            }
            if (descriptorProtos$EditionM8407.getNumber() > descriptorProtos$FeatureSetDefaults.getMaximumEdition().getNumber() && descriptorProtos$EditionM8407 != DescriptorProtos$Edition.EDITION_UNSTABLE) {
                StringBuilder sb2 = new StringBuilder("Edition ");
                sb2.append(descriptorProtos$EditionM8407);
                DescriptorProtos$Edition maximumEdition = descriptorProtos$FeatureSetDefaults.getMaximumEdition();
                sb2.append(" is greater than the maximum supported edition ");
                sb2.append(maximumEdition);
                sb2.append("!");
                throw new IllegalArgumentException(sb2.toString());
            }
            for (DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault2 : descriptorProtos$FeatureSetDefaults.getDefaultsList()) {
                if (featureSetEditionDefault2.getEdition().getNumber() > descriptorProtos$EditionM8407.getNumber()) {
                    break;
                } else {
                    featureSetEditionDefault = featureSetEditionDefault2;
                }
            }
            if (featureSetEditionDefault == null) {
                C9620.m15031(descriptorProtos$EditionM8407, "Edition ", " does not have a valid default FeatureSet!");
                return;
            }
            builder = featureSetEditionDefault.getFixedFeatures().toBuilder().mergeFrom(featureSetEditionDefault.getOverridableFeatures()).build().toBuilder();
        } else {
            builder = abstractC4490Mo8358.f11701.toBuilder();
        }
        if (descriptorProtos$FeatureSetMo8408 == null) {
            descriptorProtos$FeatureSetMo8408 = mo8408();
        }
        builder.mergeFrom(descriptorProtos$FeatureSetMo8408);
        builder.mergeFrom(descriptorProtos$FeatureSet);
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuild = builder.build();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = (DescriptorProtos$FeatureSet) AbstractC4424.f11565.putIfAbsent(descriptorProtos$FeatureSetBuild, descriptorProtos$FeatureSetBuild);
        if (descriptorProtos$FeatureSet2 != null) {
            descriptorProtos$FeatureSetBuild = descriptorProtos$FeatureSet2;
        }
        this.f11701 = descriptorProtos$FeatureSetBuild;
        mo8420();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo8420() {
    }
}
