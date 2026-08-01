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
import p000.AbstractC0619pl;
import p000.o30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8064Companion = new Companion(null);
    private final u60 dexClass$delegate;
    private final List<AnnotationElementData> elements;
    private final String typeDescriptor;
    private final int typeId;
    private final AnnotationVisibilityType visibility;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationData(DexKitBridge dexKitBridge, int i, int i2, String str, AnnotationVisibilityType annotationVisibilityType, List<AnnotationElementData> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.typeId = i2;
        this.typeDescriptor = str;
        this.visibility = annotationVisibilityType;
        this.elements = list;
        this.dexClass$delegate = new x51(new AnnotationData$dexClass$2(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final DexClass getDexClass() {
        return (DexClass) this.dexClass$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationElementData> getElements() {
        return this.elements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeDescriptor() {
        return this.typeDescriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTypeName() {
        return getDexClass().getTypeName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationVisibilityType getVisibility() {
        return this.visibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@" + DexSignUtil.getTypeName(this.typeDescriptor));
        sb.append("(");
        int i = 0;
        for (Object obj : this.elements) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            AnnotationElementData annotationElementData = (AnnotationElementData) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(annotationElementData);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationData from(DexKitBridge dexKitBridge, AnnotationMeta annotationMeta) {
            dexKitBridge.getClass();
            annotationMeta.getClass();
            int iM5680getDexIdpVg5ArA = annotationMeta.m5680getDexIdpVg5ArA();
            int iM5681getTypeIdpVg5ArA = annotationMeta.m5681getTypeIdpVg5ArA();
            String typeDescriptor = annotationMeta.getTypeDescriptor();
            typeDescriptor.getClass();
            AnnotationVisibilityType annotationVisibilityTypeFrom = AnnotationVisibilityType.Companion.from(annotationMeta.getVisibility());
            ArrayList arrayList = new ArrayList();
            int elementsLength = annotationMeta.getElementsLength();
            for (int i = 0; i < elementsLength; i++) {
                AnnotationElementData.Companion companion = AnnotationElementData.f8065Companion;
                AnnotationElementMeta annotationElementMetaElements = annotationMeta.elements(i);
                annotationElementMetaElements.getClass();
                arrayList.add(companion.from(dexKitBridge, annotationElementMetaElements));
            }
            return new AnnotationData(dexKitBridge, iM5680getDexIdpVg5ArA, iM5681getTypeIdpVg5ArA, typeDescriptor, annotationVisibilityTypeFrom, arrayList, null);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 int)
  (r3v0 int)
  (r4v0 java.lang.String)
  (r5v0 org.luckypray.dexkit.query.enums.AnnotationVisibilityType)
  (r6v0 java.util.List)
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, org.luckypray.dexkit.query.enums.AnnotationVisibilityType, java.util.List<org.luckypray.dexkit.result.AnnotationElementData>):void (m)] (LINE:31) call: org.luckypray.dexkit.result.AnnotationData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, org.luckypray.dexkit.query.enums.AnnotationVisibilityType, java.util.List):void type: THIS */
    public /* synthetic */ AnnotationData(DexKitBridge dexKitBridge, int i, int i2, String str, AnnotationVisibilityType annotationVisibilityType, List list, AbstractC0619pl abstractC0619pl) {
        this(dexKitBridge, i, i2, str, annotationVisibilityType, list);
    }
}
