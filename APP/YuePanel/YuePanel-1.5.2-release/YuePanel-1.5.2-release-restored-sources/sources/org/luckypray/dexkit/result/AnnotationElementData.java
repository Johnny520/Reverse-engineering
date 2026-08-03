package org.luckypray.dexkit.result;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationEncodeValueMeta;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationElementData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "name", "", "value", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V", "getName", "()Ljava/lang/String;", "getValue", "()Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "toString", "-Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class AnnotationElementData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @InterfaceC6399
    public static final Companion f30966Companion = new Companion(null);

    @InterfaceC6399
    private final String name;

    @InterfaceC6399
    private final AnnotationEncodeValue value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion, reason: invalid class name */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationElementData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "element", "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lorg/luckypray/dexkit/InnerAnnotationElementMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationElementData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final AnnotationElementData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 AnnotationElementMeta annotationElementMeta) {
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(annotationElementMeta, "element");
            AnnotationEncodeValueMeta annotationEncodeValueMetaValue = annotationElementMeta.value(new AnnotationEncodeValueMeta());
            C5499.m17101(annotationEncodeValueMetaValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }");
            String name = annotationElementMeta.getName();
            C5499.m17100(name);
            return new AnnotationElementData(dexKitBridge, name, AnnotationEncodeValue.f30968Companion.from(dexKitBridge, annotationEncodeValueMetaValue), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 java.lang.String)
  (r3v0 org.luckypray.dexkit.result.AnnotationEncodeValue)
 A[MD:(org.luckypray.dexkit.DexKitBridge, java.lang.String, org.luckypray.dexkit.result.AnnotationEncodeValue):void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationElementData.<init>(org.luckypray.dexkit.DexKitBridge, java.lang.String, org.luckypray.dexkit.result.AnnotationEncodeValue):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue, C4335 c4335) {
        this(dexKitBridge, str, annotationEncodeValue);
    }

    @InterfaceC6399
    public final String getName() {
        return this.name;
    }

    @InterfaceC6399
    public final AnnotationEncodeValue getValue() {
        return this.value;
    }

    @InterfaceC6399
    public String toString() {
        String str = this.name + " = " + this.value;
        C5499.m17102(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue) {
        super(dexKitBridge, 0, 0, 6, null);
        this.name = str;
        this.value = annotationEncodeValue;
    }
}
