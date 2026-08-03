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
    public static final Companion f4416Companion = null;
    private final String name;
    private final AnnotationEncodeValue value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementData from(DexKitBridge r4, AnnotationElementMeta r5) {
            AbstractC0307g.m703e(r4, "bridge");
            AbstractC0307g.m703e(r5, "element");
            AnnotationEncodeValueMeta r02 = r5.value(new AnnotationEncodeValueMeta());
            AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }");
            String r52 = r5.getName();
            AbstractC0307g.m700b(r52);
            return new AnnotationElementData(r4, r52, AnnotationEncodeValue.f4418Companion.from(r4, r02), null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4416Companion = new Companion(null);
    }

    public /* synthetic */ AnnotationElementData(DexKitBridge r1, String r2, AnnotationEncodeValue r3, AbstractC0304d r4) {
        this(r1, r2, r3);
    }

    public final String getName() {
        return this.name;
    }

    public final AnnotationEncodeValue getValue() {
        return this.value;
    }

    public String toString() {
        String r02 = this.name + " = " + this.value;
        AbstractC0307g.m702d(r02, "StringBuilder().apply(builderAction).toString()");
        return r02;
    }

    private AnnotationElementData(DexKitBridge r7, String r8, AnnotationEncodeValue r9) {
        int r2 = 0;
        int r3 = 0;
        super(r7, r2, r3, 6, null);
        this.name = r8;
        this.value = r9;
    }
}
