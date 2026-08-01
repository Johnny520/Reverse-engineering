package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FeatureSetDefaults;
import java.util.Iterator;
import java.util.logging.Logger;
import p330.C8796;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile DescriptorProtos$FeatureSet f11351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract AbstractC3657 mo7812();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract String mo7813();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract String mo7814();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract C3655 mo7815();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DescriptorProtos$FeatureSet m7879() {
        if (this.f11351 == null && (mo7815().m7861() == DescriptorProtos$Edition.EDITION_PROTO2 || mo7815().m7861() == DescriptorProtos$Edition.EDITION_PROTO3)) {
            mo7815().m7859();
        }
        if (this.f11351 != null) {
            return this.f11351;
        }
        C2632.m5298(AbstractC0053.m156("Features not yet loaded for ", mo7814(), "."));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public DescriptorProtos$FeatureSet mo7862() {
        return DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract InterfaceC3452 mo7816();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7880(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetMo7862;
        Object[] objArr;
        DescriptorProtos$FeatureSet.C3272 builder;
        AbstractC3657 abstractC3657Mo7812 = mo7812();
        DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault = null;
        Object[] objArr2 = 0;
        if (abstractC3657Mo7812 == null || !descriptorProtos$FeatureSet.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
            descriptorProtos$FeatureSetMo7862 = null;
        } else {
            descriptorProtos$FeatureSetMo7862 = mo7862();
            if (descriptorProtos$FeatureSetMo7862.equals(DescriptorProtos$FeatureSet.getDefaultInstance())) {
                this.f11351 = abstractC3657Mo7812.f11351;
                mo7874();
                return;
            }
        }
        Iterator<C3656> it = descriptorProtos$FeatureSet.getExtensionFields().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                objArr = false;
                break;
            }
            C3656 next = it.next();
            int number = next.f11350.getNumber();
            C3615 c3615 = AbstractC3384.f11038;
            if (number == c3615.mo7804().f11350.getNumber() && next != c3615.mo7804()) {
                objArr = true;
                break;
            }
        }
        boolean z = !descriptorProtos$FeatureSet.getUnknownFields().isEmpty() && descriptorProtos$FeatureSet.getUnknownFields().hasField(AbstractC3384.f11038.mo7804().f11350.getNumber());
        if (objArr != false || z) {
            C3692 c3692 = new C3692();
            c3692.m7959(AbstractC3384.f11038);
            try {
                descriptorProtos$FeatureSet = DescriptorProtos$FeatureSet.parseFrom(descriptorProtos$FeatureSet.toByteString(), c3692);
            } catch (InvalidProtocolBufferException e) {
                throw new Descriptors$DescriptorValidationException(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        if (abstractC3657Mo7812 == null) {
            DescriptorProtos$Edition descriptorProtos$EditionM7861 = mo7815().m7861();
            Logger logger = AbstractC3591.f11214;
            DescriptorProtos$FeatureSetDefaults.getDescriptor();
            C3615 c36152 = AbstractC3384.f11038;
            if (AbstractC3591.f11217 == null) {
                synchronized (AbstractC3591.class) {
                    if (AbstractC3591.f11217 == null) {
                        try {
                            C3692 c36922 = new C3692();
                            c36922.m7959(AbstractC3384.f11038);
                            AbstractC3591.f11217 = DescriptorProtos$FeatureSetDefaults.parseFrom("\n'\u0018\u0084\u0007\"\u0003Ê>\u0000*\u001d\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u00028\u0002@\u0001Ê>\n\b\u0001\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018ç\u0007\"\u0003Ê>\u0000*\u001d\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0002@\u0001Ê>\n\b\u0000\u0010\u0001\u0018\u0000 \u0001(\u0003\n'\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\r8\u0002@\u0001Ê>\u0006\u0018\u0000 \u0001(\u0003\n'\u0018é\u0007\"\u001b\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u00018\u0001@\u0002Ê>\b\b\u0000\u0010\u0001\u0018\u0000(\u0001*\u0005Ê>\u0002 \u0000 æ\u0007(é\u0007".getBytes(AbstractC3401.f11053), c36922);
                        } catch (Exception e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
            }
            DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = AbstractC3591.f11217;
            if (descriptorProtos$EditionM7861.getNumber() < descriptorProtos$FeatureSetDefaults.getMinimumEdition().getNumber()) {
                StringBuilder sb = new StringBuilder("Edition ");
                sb.append(descriptorProtos$EditionM7861);
                DescriptorProtos$Edition minimumEdition = descriptorProtos$FeatureSetDefaults.getMinimumEdition();
                sb.append(" is lower than the minimum supported edition ");
                sb.append(minimumEdition);
                sb.append("!");
                throw new IllegalArgumentException(sb.toString());
            }
            if (descriptorProtos$EditionM7861.getNumber() > descriptorProtos$FeatureSetDefaults.getMaximumEdition().getNumber() && descriptorProtos$EditionM7861 != DescriptorProtos$Edition.EDITION_UNSTABLE) {
                StringBuilder sb2 = new StringBuilder("Edition ");
                sb2.append(descriptorProtos$EditionM7861);
                DescriptorProtos$Edition maximumEdition = descriptorProtos$FeatureSetDefaults.getMaximumEdition();
                sb2.append(" is greater than the maximum supported edition ");
                sb2.append(maximumEdition);
                sb2.append("!");
                throw new IllegalArgumentException(sb2.toString());
            }
            for (DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault2 : descriptorProtos$FeatureSetDefaults.getDefaultsList()) {
                if (featureSetEditionDefault2.getEdition().getNumber() > descriptorProtos$EditionM7861.getNumber()) {
                    break;
                } else {
                    featureSetEditionDefault = featureSetEditionDefault2;
                }
            }
            if (featureSetEditionDefault == null) {
                C8796.m14448(descriptorProtos$EditionM7861, "Edition ", " does not have a valid default FeatureSet!");
                return;
            }
            builder = featureSetEditionDefault.getFixedFeatures().toBuilder().mergeFrom(featureSetEditionDefault.getOverridableFeatures()).build().toBuilder();
        } else {
            builder = abstractC3657Mo7812.f11351.toBuilder();
        }
        if (descriptorProtos$FeatureSetMo7862 == null) {
            descriptorProtos$FeatureSetMo7862 = mo7862();
        }
        builder.mergeFrom(descriptorProtos$FeatureSetMo7862);
        builder.mergeFrom(descriptorProtos$FeatureSet);
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSetBuild = builder.build();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = (DescriptorProtos$FeatureSet) AbstractC3591.f11215.putIfAbsent(descriptorProtos$FeatureSetBuild, descriptorProtos$FeatureSetBuild);
        if (descriptorProtos$FeatureSet2 != null) {
            descriptorProtos$FeatureSetBuild = descriptorProtos$FeatureSet2;
        }
        this.f11351 = descriptorProtos$FeatureSetBuild;
        mo7874();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo7874() {
    }
}
