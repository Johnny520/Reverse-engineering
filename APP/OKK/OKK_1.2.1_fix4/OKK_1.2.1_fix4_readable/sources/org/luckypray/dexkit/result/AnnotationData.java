package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationVisibilityType;
import org.luckypray.dexkit.result.AnnotationElementData;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4415Companion = new Companion(null);
    private final InterfaceC0136b dexClass$delegate;
    private final List<AnnotationElementData> elements;
    private final String typeDescriptor;
    private final int typeId;
    private final AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final AnnotationData from(DexKitBridge dexKitBridge, AnnotationMeta annotationMeta) {
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(annotationMeta, "annotationMeta");
            int iM2688getDexIdpVg5ArA = annotationMeta.m2688getDexIdpVg5ArA();
            int iM2689getTypeIdpVg5ArA = annotationMeta.m2689getTypeIdpVg5ArA();
            String typeDescriptor = annotationMeta.getTypeDescriptor();
            AbstractC0307g.m700b(typeDescriptor);
            AnnotationVisibilityType annotationVisibilityTypeFrom = AnnotationVisibilityType.Companion.from(annotationMeta.getVisibility());
            ArrayList arrayList = new ArrayList();
            int elementsLength = annotationMeta.getElementsLength();
            for (int i2 = 0; i2 < elementsLength; i2++) {
                AnnotationElementData.Companion companion = AnnotationElementData.f4416Companion;
                AnnotationElementMeta annotationElementMetaElements = annotationMeta.elements(i2);
                AbstractC0307g.m700b(annotationElementMetaElements);
                arrayList.add(companion.from(dexKitBridge, annotationElementMetaElements));
            }
            return new AnnotationData(dexKitBridge, iM2688getDexIdpVg5ArA, iM2689getTypeIdpVg5ArA, typeDescriptor, annotationVisibilityTypeFrom, arrayList, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ AnnotationData(DexKitBridge dexKitBridge, int i2, int i3, String str, AnnotationVisibilityType annotationVisibilityType, List list, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, i2, i3, str, annotationVisibilityType, list);
    }

    private final DexClass getDexClass() {
        return (DexClass) ((C0142h) this.dexClass$delegate).m466a();
    }

    public final List<AnnotationElementData> getElements() {
        return this.elements;
    }

    public final String getTypeDescriptor() {
        return this.typeDescriptor;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getTypeName() {
        return getDexClass().getTypeName();
    }

    public final AnnotationVisibilityType getVisibility() {
        return this.visibility;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@" + DexSignUtil.getTypeName(this.typeDescriptor));
        sb.append("(");
        int i2 = 0;
        for (Object obj : this.elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            AnnotationElementData annotationElementData = (AnnotationElementData) obj;
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(annotationElementData);
            i2 = i3;
        }
        sb.append(")");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private AnnotationData(DexKitBridge dexKitBridge, int i2, int i3, String str, AnnotationVisibilityType annotationVisibilityType, List<AnnotationElementData> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.typeId = i3;
        this.typeDescriptor = str;
        this.visibility = annotationVisibilityType;
        this.elements = list;
        this.dexClass$delegate = AbstractC0040p.m81E(new AnnotationData$dexClass$2(this));
    }
}
