package org.luckypray.dexkit.result;

import Yue.C3880;
import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.C8107;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationVisibilityType;
import org.luckypray.dexkit.result.AnnotationElementData;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nAnnotationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1858#2,3:80\n*S KotlinDebug\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n*L\n70#1:80,3\n*E\n"})
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011¨\u0006&"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", "dexId", "typeId", "", "typeDescriptor", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "visibility", "", "Lorg/luckypray/dexkit/result/AnnotationElementData;", "elements", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "I", "getTypeId", "()I", "Ljava/lang/String;", "getTypeDescriptor", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "getVisibility", "()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexClass", "()Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass", "getTypeName", "typeName", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name and from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dexClass$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 dexClass;

    @InterfaceC6399
    private final List<AnnotationElementData> elements;

    @InterfaceC6399
    private final String typeDescriptor;
    private final int typeId;

    @InterfaceC6489
    private final AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion, reason: invalid class name and from kotlin metadata */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationMeta", "Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "Lorg/luckypray/dexkit/InnerAnnotationMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final AnnotationData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 AnnotationMeta annotationMeta) {
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(annotationMeta, "annotationMeta");
            int iM31168getDexIdpVg5ArA = annotationMeta.m31168getDexIdpVg5ArA();
            int iM31169getTypeIdpVg5ArA = annotationMeta.m31169getTypeIdpVg5ArA();
            String typeDescriptor = annotationMeta.getTypeDescriptor();
            C5499.m17100(typeDescriptor);
            AnnotationVisibilityType annotationVisibilityTypeFrom = AnnotationVisibilityType.Companion.from(annotationMeta.getVisibility());
            ArrayList arrayList = new ArrayList();
            int elementsLength = annotationMeta.getElementsLength();
            for (int i = 0; i < elementsLength; i++) {
                AnnotationElementData.Companion companion = AnnotationElementData.f30966Companion;
                AnnotationElementMeta annotationElementMetaElements = annotationMeta.elements(i);
                C5499.m17100(annotationElementMetaElements);
                arrayList.add(companion.from(dexKitBridge, annotationElementMetaElements));
            }
            C8107 c8107 = C8107.f3222;
            return new AnnotationData(dexKitBridge, iM31168getDexIdpVg5ArA, iM31169getTypeIdpVg5ArA, typeDescriptor, annotationVisibilityTypeFrom, arrayList, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, org.luckypray.dexkit.query.enums.AnnotationVisibilityType, java.util.List<org.luckypray.dexkit.result.AnnotationElementData>):void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, java.lang.String, org.luckypray.dexkit.query.enums.AnnotationVisibilityType, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AnnotationData(DexKitBridge dexKitBridge, int i, int i2, String str, AnnotationVisibilityType annotationVisibilityType, List list, C4335 c4335) {
        this(dexKitBridge, i, i2, str, annotationVisibilityType, list);
    }

    private final DexClass getDexClass() {
        return (DexClass) this.dexClass.getValue();
    }

    @InterfaceC6399
    public final List<AnnotationElementData> getElements() {
        return this.elements;
    }

    @InterfaceC6399
    public final String getTypeDescriptor() {
        return this.typeDescriptor;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @InterfaceC6399
    public final String getTypeName() {
        return getDexClass().getTypeName();
    }

    @InterfaceC6489
    public final AnnotationVisibilityType getVisibility() {
        return this.visibility;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@" + DexSignUtil.getTypeName(this.typeDescriptor));
        sb.append("(");
        int i = 0;
        for (Object obj : this.elements) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            AnnotationElementData annotationElementData = (AnnotationElementData) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(annotationElementData);
            i = i2;
        }
        sb.append(")");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AnnotationData(DexKitBridge dexKitBridge, int i, int i2, String str, AnnotationVisibilityType annotationVisibilityType, List<AnnotationElementData> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.typeId = i2;
        this.typeDescriptor = str;
        this.visibility = annotationVisibilityType;
        this.elements = list;
        this.dexClass = C5689.m2370(new AnnotationData$dexClass$2(this));
    }
}
