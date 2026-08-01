package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationEncodeValueMeta;
import p000.AbstractC0431r2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f1169Companion = new Companion(null);
    private final String name;
    private final AnnotationEncodeValue value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue) {
        super(dexKitBridge, 0, 0, 6, null);
        this.name = str;
        this.value = annotationEncodeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValue getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.name + " = " + this.value;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationElementData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationElementData from(DexKitBridge dexKitBridge, AnnotationElementMeta annotationElementMeta) {
            dexKitBridge.getClass();
            annotationElementMeta.getClass();
            AnnotationEncodeValueMeta annotationEncodeValueMetaValue = annotationElementMeta.value(new AnnotationEncodeValueMeta());
            annotationEncodeValueMetaValue.getClass();
            String name = annotationElementMeta.getName();
            name.getClass();
            return new AnnotationElementData(dexKitBridge, name, AnnotationEncodeValue.f1171Companion.from(dexKitBridge, annotationEncodeValueMetaValue), null);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 java.lang.String)
  (r3v0 org.luckypray.dexkit.result.AnnotationEncodeValue)
 A[MD:(org.luckypray.dexkit.DexKitBridge, java.lang.String, org.luckypray.dexkit.result.AnnotationEncodeValue):void (m)] (LINE:15) call: org.luckypray.dexkit.result.AnnotationElementData.<init>(org.luckypray.dexkit.DexKitBridge, java.lang.String, org.luckypray.dexkit.result.AnnotationEncodeValue):void type: THIS */
    public /* synthetic */ AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue, AbstractC0431r2 abstractC0431r2) {
        this(dexKitBridge, str, annotationEncodeValue);
    }
}
