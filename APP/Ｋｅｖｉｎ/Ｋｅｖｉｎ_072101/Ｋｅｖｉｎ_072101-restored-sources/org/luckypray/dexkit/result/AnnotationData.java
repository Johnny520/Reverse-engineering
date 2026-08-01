package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: AnnotationData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000  2\u00020\u0001:\u0001 B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u001f\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "dexId", "", "typeId", "typeDescriptor", "", "visibility", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "elements", "", "Lorg/luckypray/dexkit/result/AnnotationElementData;", "(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V", "dexClass", "Lorg/luckypray/dexkit/wrap/DexClass;", "getDexClass", "()Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass$delegate", "Lkotlin/Lazy;", "getElements", "()Ljava/util/List;", "getTypeDescriptor", "()Ljava/lang/String;", "getTypeId", "()I", "typeName", "getTypeName", "getVisibility", "()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "toString", "-Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationData.Companion f425Companion = null;
    private final kotlin.Lazy dexClass$delegate;
    private final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> elements;
    private final java.lang.String typeDescriptor;
    private final int typeId;
    private final org.luckypray.dexkit.query.enums.AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: AnnotationData.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationMeta", "Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "Lorg/luckypray/dexkit/InnerAnnotationMeta;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.AnnotationData from(org.luckypray.dexkit.DexKitBridge r12, org.luckypray.dexkit.schema.AnnotationMeta r13) {
                r11 = this;
                java.lang.String r0 = "bridge"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "annotationMeta"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                int r3 = r13.m10408getDexIdpVg5ArA()
                int r4 = r13.m10409getTypeIdpVg5ArA()
                java.lang.String r5 = r13.getTypeDescriptor()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType$Companion r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion
                byte r1 = r13.getVisibility()
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r6 = r0.from(r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7 = r0
                java.util.List r7 = (java.util.List) r7
                r0 = r7
                r1 = 0
                r2 = 0
                int r8 = r13.getElementsLength()
            L34:
                if (r2 >= r8) goto L49
                org.luckypray.dexkit.result.AnnotationElementData$-Companion r9 = org.luckypray.dexkit.result.AnnotationElementData.f426Companion
                org.luckypray.dexkit.schema.-AnnotationElementMeta r10 = r13.elements(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                org.luckypray.dexkit.result.AnnotationElementData r9 = r9.from(r12, r10)
                r0.add(r9)
                int r2 = r2 + 1
                goto L34
            L49:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                org.luckypray.dexkit.result.AnnotationData r0 = new org.luckypray.dexkit.result.AnnotationData
                r8 = 0
                r1 = r0
                r2 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationData.f425Companion = r0
            return
    }

    private AnnotationData(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, java.lang.String r10, org.luckypray.dexkit.query.enums.AnnotationVisibilityType r11, java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r12) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.typeId = r9
            r6.typeDescriptor = r10
            r6.visibility = r11
            r6.elements = r12
            org.luckypray.dexkit.result.AnnotationData$dexClass$2 r0 = new org.luckypray.dexkit.result.AnnotationData$dexClass$2
            r0.<init>(r6)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r6.dexClass$delegate = r0
            return
    }

    public /* synthetic */ AnnotationData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, java.lang.String r4, org.luckypray.dexkit.query.enums.AnnotationVisibilityType r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private final org.luckypray.dexkit.wrap.DexClass getDexClass() {
            r1 = this;
            kotlin.Lazy r0 = r1.dexClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexClass r0 = (org.luckypray.dexkit.wrap.DexClass) r0
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> getElements() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r0 = r1.elements
            return r0
    }

    public final java.lang.String getTypeDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.typeDescriptor
            return r0
    }

    public final int getTypeId() {
            r1 = this;
            int r0 = r1.typeId
            return r0
    }

    public final java.lang.String getTypeName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r1.getDexClass()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    public final org.luckypray.dexkit.query.enums.AnnotationVisibilityType getVisibility() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = r1.visibility
            return r0
    }

    public java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = r12.typeDescriptor
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "@"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r3 = r12.elements
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L32:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L43
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L43:
            r9 = r7
            org.luckypray.dexkit.result.AnnotationElementData r9 = (org.luckypray.dexkit.result.AnnotationElementData) r9
            r10 = 0
            if (r5 == 0) goto L4e
            java.lang.String r11 = ", "
            r1.append(r11)
        L4e:
            r1.append(r9)
            r5 = r8
            goto L32
        L54:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
