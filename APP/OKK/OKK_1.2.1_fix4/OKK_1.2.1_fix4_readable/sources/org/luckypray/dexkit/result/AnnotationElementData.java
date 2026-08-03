package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.AnnotationElementMeta;
import org.luckypray.dexkit.schema.AnnotationEncodeValueMeta;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4416Companion = new Companion(null);
    private final String name;
    private final AnnotationEncodeValue value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementData from(DexKitBridge dexKitBridge, AnnotationElementMeta annotationElementMeta) {
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(annotationElementMeta, "element");
            AnnotationEncodeValueMeta annotationEncodeValueMetaValue = annotationElementMeta.value(new AnnotationEncodeValueMeta());
            AbstractC0307g.m701c(annotationEncodeValueMetaValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }");
            String name = annotationElementMeta.getName();
            AbstractC0307g.m700b(name);
            return new AnnotationElementData(dexKitBridge, name, AnnotationEncodeValue.f4418Companion.from(dexKitBridge, annotationEncodeValueMetaValue), null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, str, annotationEncodeValue);
    }

    public final String getName() {
        return this.name;
    }

    public final AnnotationEncodeValue getValue() {
        return this.value;
    }

    public String toString() {
        String str = this.name + " = " + this.value;
        AbstractC0307g.m702d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    private AnnotationElementData(DexKitBridge dexKitBridge, String str, AnnotationEncodeValue annotationEncodeValue) {
        super(dexKitBridge, 0, 0, 6, null);
        this.name = str;
        this.value = annotationEncodeValue;
    }
}
