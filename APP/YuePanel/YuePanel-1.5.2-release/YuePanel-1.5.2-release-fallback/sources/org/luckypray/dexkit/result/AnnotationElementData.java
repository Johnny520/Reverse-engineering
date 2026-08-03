package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationElementData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "name", "", "value", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V", "getName", "()Ljava/lang/String;", "getValue", "()Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "toString", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnnotationElementData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.AnnotationElementData.Companion f30802Companion = null;

    @Yue.InterfaceC4418
    private final java.lang.String name;

    @Yue.InterfaceC4418
    private final org.luckypray.dexkit.result.AnnotationEncodeValue value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationElementData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "element", "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;", "Lorg/luckypray/dexkit/InnerAnnotationElementMeta;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.AnnotationElementData from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r4, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationElementMeta r5) {
                r3 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "element"
                Yue.C3329.m13906(r5, r0)
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r0 = new org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r0 = r5.value(r0)
                java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }"
                Yue.C3329.m13904(r0, r1)
                org.luckypray.dexkit.result.AnnotationElementData r1 = new org.luckypray.dexkit.result.AnnotationElementData
                java.lang.String r5 = r5.getName()
                Yue.C3329.m13903(r5)
                org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r2 = org.luckypray.dexkit.result.AnnotationEncodeValue.f30804Companion
                org.luckypray.dexkit.result.AnnotationEncodeValue r0 = r2.from(r4, r0)
                r2 = 0
                r1.<init>(r4, r5, r0, r2)
                return r1
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationElementData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationElementData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationElementData.f30802Companion = r0
            return
    }

    private AnnotationElementData(org.luckypray.dexkit.DexKitBridge r7, java.lang.String r8, org.luckypray.dexkit.result.AnnotationEncodeValue r9) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.name = r8
            r6.value = r9
            return
    }

    public /* synthetic */ AnnotationElementData(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2, org.luckypray.dexkit.result.AnnotationEncodeValue r3, Yue.C1769 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Yue.InterfaceC4418
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.AnnotationEncodeValue getValue() {
            r1 = this;
            org.luckypray.dexkit.result.AnnotationEncodeValue r0 = r1.value
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
            org.luckypray.dexkit.result.AnnotationEncodeValue r1 = r2.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
