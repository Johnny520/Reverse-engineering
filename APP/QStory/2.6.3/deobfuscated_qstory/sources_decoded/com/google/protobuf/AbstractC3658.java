package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FeatureSetDefaults;
import java.util.Iterator;
import java.util.logging.Logger;
import p336.C8791;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile DescriptorProtos$FeatureSet f11356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract AbstractC3658 mo7799();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract String mo7800();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract String mo7801();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract C3656 mo7802();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet m7866() {
        if (this.f11356 == null && (mo7802().m7848() == DescriptorProtos$Edition.EDITION_PROTO2 || mo7802().m7848() == DescriptorProtos$Edition.EDITION_PROTO3)) {
            mo7802().m7846();
        }
        if (this.f11356 != null) {
            return this.f11356;
        }
        C2633.m5343(AbstractC0053.m158("Features not yet loaded for ", mo7801(), "."));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public DescriptorProtos$FeatureSet mo7849() {
        return DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract InterfaceC3453 mo7803();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7867(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetMo7849;
        Object[] objArr;
        DescriptorProtos$FeatureSet.C3273 builder;
        AbstractC3658 abstractC3658Mo7799 = mo7799();
        DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault = null;
        Object[] objArr2 = 0;
        if (abstractC3658Mo7799 == null || !descriptorProtos$FeatureSet.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
            descriptorProtos$FeatureSetMo7849 = null;
        } else {
            descriptorProtos$FeatureSetMo7849 = mo7849();
            if (descriptorProtos$FeatureSetMo7849.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
                this.f11356 = abstractC3658Mo7799.f11356;
                mo7861();
                return;
            }
        }
        Iterator<C3657> it = descriptorProtos$FeatureSet.getExtensionFields().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                objArr = false;
                break;
            }
            C3657 next = it.next();
            int number = next.f11355.getNumber();
            C3616 c3616 = AbstractC3385.f11043;
            if (number == c3616.mo7791().f11355.getNumber() && next != c3616.mo7791()) {
                objArr = true;
                break;
            }
        }
        boolean z = !descriptorProtos$FeatureSet.getUnknownFields().isEmpty() && descriptorProtos$FeatureSet.getUnknownFields().hasField(AbstractC3385.f11043.mo7791().f11355.getNumber());
        if (objArr != false || z) {
            C3693 c3693 = new C3693();
            c3693.m7946(AbstractC3385.f11043);
            try {
                descriptorProtos$FeatureSet = DescriptorProtos$FeatureSet.parseFrom(descriptorProtos$FeatureSet.toByteString(), c3693);
            } catch (InvalidProtocolBufferException e) {
                throw new Descriptors$DescriptorValidationException(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        if (abstractC3658Mo7799 == null) {
            DescriptorProtos$Edition descriptorProtos$EditionM7848 = mo7802().m7848();
            Logger logger = AbstractC3592.f11219;
            DescriptorProtos$FeatureSetDefaults.getDescriptor();
            C3616 c36162 = AbstractC3385.f11043;
            if (AbstractC3592.f11222 == null) {
                synchronized (AbstractC3592.class) {
                    if (AbstractC3592.f11222 == null) {
                        try {
                            C3693 c36932 = new C3693();
                            c36932.m7946(AbstractC3385.f11043);
                            AbstractC3592.f11222 = DescriptorProtos$FeatureSetDefaults.parseFrom("\n'\u0018\u0084\u0007\"\u0003Ê>\u0000*\u001d\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u00028\u0002@\u0001Ê>\n\b\u0001\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018ç\u0007\"\u0003Ê>\u0000*\u001d\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0002@\u0001Ê>\n\b\u0000\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\r8\u0002@\u0001Ê>\u0006\u0018\u0000 \u0001(\u0003\n'\u0018é\u0007\"\u001b\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0001@\u0002Ê>\b\b\u0000\u0010\u0001\u0018\u0000(\u0001*\u0005Ê>\u0002 \u0000 æ\u0007(é\u0007".getBytes(AbstractC3402.f11058), c36932);
                        } catch (Exception e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
            }
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = AbstractC3592.f11222;
            if (descriptorProtos$EditionM7848.getNumber() < descriptorProtos$FeatureSetDefaults.getMinimumEdition().getNumber()) {
                StringBuilder sb = new StringBuilder("Edition ");
                sb.append(descriptorProtos$EditionM7848);
                DescriptorProtos$Edition minimumEdition = descriptorProtos$FeatureSetDefaults.getMinimumEdition();
                sb.append(" is lower than the minimum supported edition ");
                sb.append(minimumEdition);
                sb.append("!");
                throw new IllegalArgumentException(sb.toString());
            }
            if (descriptorProtos$EditionM7848.getNumber() > descriptorProtos$FeatureSetDefaults.getMaximumEdition().getNumber() && descriptorProtos$EditionM7848 != DescriptorProtos$Edition.EDITION_UNSTABLE) {
                StringBuilder sb2 = new StringBuilder("Edition ");
                sb2.append(descriptorProtos$EditionM7848);
                DescriptorProtos$Edition maximumEdition = descriptorProtos$FeatureSetDefaults.getMaximumEdition();
                sb2.append(" is greater than the maximum supported edition ");
                sb2.append(maximumEdition);
                sb2.append("!");
                throw new IllegalArgumentException(sb2.toString());
            }
            for (DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault2 : descriptorProtos$FeatureSetDefaults.getDefaultsList()) {
                if (featureSetEditionDefault2.getEdition().getNumber() > descriptorProtos$EditionM7848.getNumber()) {
                    break;
                } else {
                    featureSetEditionDefault = featureSetEditionDefault2;
                }
            }
            if (featureSetEditionDefault == null) {
                C8791.m14472(descriptorProtos$EditionM7848, "Edition ", " does not have a valid default FeatureSet!");
                return;
            }
            builder = featureSetEditionDefault.getFixedFeatures().toBuilder().mergeFrom(featureSetEditionDefault.getOverridableFeatures()).build().toBuilder();
        } else {
            builder = abstractC3658Mo7799.f11356.toBuilder();
        }
        if (descriptorProtos$FeatureSetMo7849 == null) {
            descriptorProtos$FeatureSetMo7849 = mo7849();
        }
        builder.mergeFrom(descriptorProtos$FeatureSetMo7849);
        builder.mergeFrom(descriptorProtos$FeatureSet);
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuild = builder.build();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = (DescriptorProtos$FeatureSet) AbstractC3592.f11220.putIfAbsent(descriptorProtos$FeatureSetBuild, descriptorProtos$FeatureSetBuild);
        if (descriptorProtos$FeatureSet2 != null) {
            descriptorProtos$FeatureSetBuild = descriptorProtos$FeatureSet2;
        }
        this.f11356 = descriptorProtos$FeatureSetBuild;
        mo7861();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo7861() {
    }
}
